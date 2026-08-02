package org.modelmapper.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.modelmapper.Condition;
import org.modelmapper.ConfigurationException;
import org.modelmapper.Converter;
import org.modelmapper.PropertyMap;
import org.modelmapper.Provider;
import org.modelmapper.builder.ConditionExpression;
import org.modelmapper.builder.ConverterExpression;
import org.modelmapper.builder.MapExpression;
import org.modelmapper.internal.ExplicitMappingVisitor;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Members;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.PropertyType;
import org.modelmapper.spi.ValueReader;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
public class ExplicitMappingBuilder<S, D> implements ConditionExpression<S, D> {
    private static final Pattern DOT_PATTERN = Pattern.compile("\\.");
    private static Method PROPERTY_MAP_CONFIGURE;
    private final InheritingConfiguration configuration;
    private ExplicitMappingVisitor.VisitedMapping currentMapping;
    private int currentMappingIndex;
    public volatile D destination;
    private List<Mutator> destinationMutators;
    private final Class<D> destinationType;
    public volatile S source;
    private List<Accessor> sourceAccessors;
    private Object sourceConstant;
    private final Class<S> sourceType;
    private List<ExplicitMappingVisitor.VisitedMapping> visitedMappings;
    private final Errors proxyErrors = new Errors();
    private final Errors errors = new Errors();
    private final Map<Object, ExplicitMappingBuilder<S, D>.ExplicitMappingInterceptor> proxyInterceptors = new IdentityHashMap();
    private final Set<MappingImpl> propertyMappings = new HashSet();
    private MappingOptions options = new MappingOptions();

    @Override // org.modelmapper.builder.ConverterExpression
    public /* bridge */ /* synthetic */ MapExpression using(Converter converter) {
        return using((Converter<?, ?>) converter);
    }

    @Override // org.modelmapper.builder.ProviderExpression
    public /* bridge */ /* synthetic */ ConverterExpression with(Provider provider) {
        return with((Provider<?>) provider);
    }

    static {
        Method methodFor = Members.methodFor(PropertyMap.class, "configure", ExplicitMappingBuilder.class);
        PROPERTY_MAP_CONFIGURE = methodFor;
        methodFor.setAccessible(true);
    }

    static class MappingOptions {
        Condition<?, ?> condition;
        Converter<?, ?> converter;
        boolean mapFromSource;
        Provider<?> provider;
        int skipType;

        MappingOptions() {
        }
    }

    static <S, D> Collection<MappingImpl> build(Class<S> cls, Class<D> cls2, InheritingConfiguration inheritingConfiguration, PropertyMap<S, D> propertyMap) {
        return new ExplicitMappingBuilder(cls, cls2, inheritingConfiguration).build(propertyMap);
    }

    ExplicitMappingBuilder(Class<S> cls, Class<D> cls2, InheritingConfiguration inheritingConfiguration) {
        this.sourceType = cls;
        this.destinationType = cls2;
        this.configuration = inheritingConfiguration;
    }

    @Override // org.modelmapper.builder.SkipExpression
    public D skip() {
        map();
        this.options.skipType = 1;
        return this.destination;
    }

    @Override // org.modelmapper.builder.SkipExpression
    public void skip(Object obj) {
        map(obj);
        this.options.skipType = 2;
    }

    @Override // org.modelmapper.builder.SkipExpression
    public void skip(Object obj, Object obj2) {
        map(obj, obj2);
        this.options.skipType = 3;
    }

    @Override // org.modelmapper.builder.MapExpression
    public D map() {
        saveLastMapping();
        getNextMapping();
        return this.destination;
    }

    @Override // org.modelmapper.builder.MapExpression
    public D map(Object obj) {
        saveLastMapping();
        getNextMapping();
        recordSourceValue(obj);
        return this.destination;
    }

    @Override // org.modelmapper.builder.MapExpression
    public void map(Object obj, Object obj2) {
        saveLastMapping();
        getNextMapping();
        recordSourceValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T source(String str) {
        if (str == null) {
            this.errors.errorNullArgument("sourcePropertyPath");
        }
        if (this.sourceAccessors != null) {
            saveLastMapping();
        }
        String[] split = DOT_PATTERN.split(str);
        this.sourceAccessors = new ArrayList(split.length);
        ValueReader<T> firstSupportedReader = this.configuration.valueAccessStore.getFirstSupportedReader(this.sourceType);
        int i = 0;
        if (firstSupportedReader != null) {
            int length = split.length;
            while (i < length) {
                this.sourceAccessors.add(PropertyInfoImpl.ValueReaderPropertyInfo.create(firstSupportedReader, split[i]));
                i++;
            }
        } else {
            int length2 = split.length;
            Accessor accessor = null;
            while (i < length2) {
                String str2 = split[i];
                Class type = accessor == null ? this.sourceType : accessor.getType();
                Accessor accessorFor = PropertyInfoRegistry.accessorFor(type, str2, this.configuration);
                if (accessorFor == null) {
                    this.errors.errorInvalidSourcePath(str, type, str2);
                    return null;
                }
                this.sourceAccessors.add(accessorFor);
                i++;
                accessor = accessorFor;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object destination(String str) {
        if (str == null) {
            this.errors.errorNullArgument("destPropertyPath");
        }
        String[] split = DOT_PATTERN.split(str);
        this.destinationMutators = new ArrayList(split.length);
        ValueWriter firstSupportedWriter = this.configuration.valueMutateStore.getFirstSupportedWriter(this.destinationType);
        int i = 0;
        if (firstSupportedWriter != null) {
            int length = split.length;
            while (i < length) {
                this.destinationMutators.add(PropertyInfoImpl.ValueWriterPropertyInfo.create(firstSupportedWriter, split[i]));
                i++;
            }
        } else {
            int length2 = split.length;
            Mutator mutator = null;
            while (i < length2) {
                String str2 = split[i];
                Class type = mutator == null ? this.destinationType : mutator.getType();
                Mutator mutatorFor = PropertyInfoRegistry.mutatorFor(type, str2, this.configuration);
                if (mutatorFor == null) {
                    this.errors.errorInvalidDestinationPath(str, type, str2);
                    return null;
                }
                this.destinationMutators.add(mutatorFor);
                i++;
                mutator = mutatorFor;
            }
        }
        return null;
    }

    @Override // org.modelmapper.builder.ConverterExpression
    public ConditionExpression<S, D> using(Converter<?, ?> converter) {
        saveLastMapping();
        if (converter == null) {
            this.errors.errorNullArgument("converter");
        }
        Assert.state(this.options.converter == null, "using() can only be called once per mapping.", new Object[0]);
        this.options.converter = converter;
        return this;
    }

    @Override // org.modelmapper.builder.ConditionExpression
    public ConditionExpression<S, D> when(Condition<?, ?> condition) {
        saveLastMapping();
        if (condition == null) {
            this.errors.errorNullArgument("condition");
        }
        Assert.state(this.options.condition == null, "when() can only be called once per mapping.", new Object[0]);
        this.options.condition = condition;
        return this;
    }

    @Override // org.modelmapper.builder.ProviderExpression
    public ConditionExpression<S, D> with(Provider<?> provider) {
        saveLastMapping();
        if (provider == null) {
            this.errors.errorNullArgument(IronSourceConstants.EVENTS_PROVIDER);
        }
        Assert.state(this.options.provider == null, "withProvider() can only be called once per mapping.", new Object[0]);
        this.options.provider = provider;
        return this;
    }

    Collection<MappingImpl> build(PropertyMap<S, D> propertyMap) {
        try {
            PROPERTY_MAP_CONFIGURE.invoke(propertyMap, this);
            saveLastMapping();
        } catch (IllegalAccessException e) {
            this.errors.errorAccessingConfigure(e);
        } catch (NullPointerException e2) {
            if (this.proxyErrors.hasErrors()) {
                throw this.proxyErrors.toException();
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof ConfigurationException) {
                throw ((ConfigurationException) cause);
            }
            this.errors.addMessage(cause, "Failed to configure mappings", new Object[0]);
        }
        this.errors.throwConfigurationExceptionIfErrorsExist();
        return this.propertyMappings;
    }

    public void visitPropertyMap(PropertyMap<S, D> propertyMap) {
        String name = propertyMap.getClass().getName();
        try {
            ClassReader classReader = new ClassReader(propertyMap.getClass().getClassLoader().getResourceAsStream(name.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ClassFileLocator.CLASS_FILE_EXTENSION));
            ExplicitMappingVisitor explicitMappingVisitor = new ExplicitMappingVisitor(this.errors, this.configuration, name, this.destinationType.getName(), propertyMap.getClass().getClassLoader());
            classReader.accept(explicitMappingVisitor, 6);
            this.visitedMappings = explicitMappingVisitor.mappings;
        } catch (IOException e) {
            this.errors.errorReadingClass(e, name);
        }
        this.errors.throwConfigurationExceptionIfErrorsExist();
        createProxies();
    }

    private void createProxies() {
        this.source = (S) createProxy(this.sourceType);
        this.destination = (D) createProxy(this.destinationType);
        for (ExplicitMappingVisitor.VisitedMapping visitedMapping : this.visitedMappings) {
            createAccessorProxies(this.source, visitedMapping.sourceAccessors);
            createAccessorProxies(this.destination, visitedMapping.destinationAccessors);
        }
    }

    private void createAccessorProxies(Object obj, List<Accessor> list) {
        for (Accessor accessor : list) {
            if (accessor instanceof PropertyInfoImpl.MethodAccessor) {
                ExplicitMappingBuilder<S, D>.ExplicitMappingInterceptor explicitMappingInterceptor = this.proxyInterceptors.get(obj);
                String name = accessor.getMember().getName();
                Object obj2 = ((ExplicitMappingInterceptor) explicitMappingInterceptor).methodProxies.get(name);
                if (obj2 == null) {
                    obj2 = createProxy(accessor.getType());
                    ((ExplicitMappingInterceptor) explicitMappingInterceptor).methodProxies.put(name, obj2);
                }
                obj = obj2;
            } else if (accessor instanceof PropertyInfoImpl.FieldPropertyInfo) {
                PropertyInfoImpl.FieldPropertyInfo fieldPropertyInfo = (PropertyInfoImpl.FieldPropertyInfo) accessor;
                Object value = fieldPropertyInfo.getValue(obj);
                if (value == null) {
                    value = createProxy(fieldPropertyInfo.getType());
                    fieldPropertyInfo.setValue(obj, value);
                }
                obj = value;
            }
        }
    }

    public final class ExplicitMappingInterceptor implements InvocationHandler {
        private final Map<String, Object> methodProxies = new HashMap();

        public ExplicitMappingInterceptor() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr.length == 1) {
                ExplicitMappingBuilder.this.sourceConstant = objArr[0];
                if (ExplicitMappingBuilder.this.sourceConstant != null && ExplicitMappingBuilder.this.sourceConstant == ExplicitMappingBuilder.this.source) {
                    ExplicitMappingBuilder.this.errors.missingSource();
                }
            }
            return this.methodProxies.get(method.getName());
        }
    }

    private <T> T createProxy(Class<T> cls) {
        ExplicitMappingInterceptor explicitMappingInterceptor = new ExplicitMappingInterceptor();
        try {
            T t = (T) ProxyFactory.proxyFor(cls, explicitMappingInterceptor, this.proxyErrors, this.configuration.isUseOSGiClassLoaderBridging());
            this.proxyInterceptors.put(t, explicitMappingInterceptor);
            return t;
        } catch (ErrorsException unused) {
            return null;
        }
    }

    private void getNextMapping() {
        if (this.currentMappingIndex < this.visitedMappings.size()) {
            List<ExplicitMappingVisitor.VisitedMapping> list = this.visitedMappings;
            int i = this.currentMappingIndex;
            this.currentMappingIndex = i + 1;
            this.currentMapping = list.get(i);
        }
    }

    private void recordSourceValue(Object obj) {
        if (obj != null) {
            if (obj == this.source) {
                this.options.mapFromSource = true;
            } else {
                if (Types.isProxied(obj.getClass())) {
                    return;
                }
                this.sourceConstant = obj;
            }
        }
    }

    private void validateRecordedMapping() {
        if (this.currentMapping.destinationMutators == null || this.currentMapping.destinationMutators.isEmpty()) {
            this.errors.missingDestination();
            return;
        }
        if (this.options.skipType == 0 && ((this.currentMapping.sourceAccessors == null || this.currentMapping.sourceAccessors.isEmpty()) && this.currentMapping.destinationMutators.get(this.currentMapping.destinationMutators.size() - 1).getPropertyType().equals(PropertyType.FIELD) && this.options.converter == null && !this.options.mapFromSource && this.sourceConstant == null)) {
            this.errors.missingSource();
        } else {
            if (this.options.skipType != 2 || this.options.condition == null) {
                return;
            }
            this.errors.conditionalSkipWithoutSource();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void saveLastMapping() {
        MappingImpl propertyMappingImpl;
        ExplicitMappingVisitor.VisitedMapping visitedMapping = this.currentMapping;
        if (visitedMapping != null) {
            try {
                if (visitedMapping.sourceAccessors.isEmpty()) {
                    this.currentMapping.sourceAccessors = this.sourceAccessors;
                }
                if (this.currentMapping.destinationMutators.isEmpty()) {
                    this.currentMapping.destinationMutators = this.destinationMutators;
                }
                validateRecordedMapping();
                if (!this.errors.hasErrors()) {
                    if (this.options.mapFromSource) {
                        propertyMappingImpl = new SourceMappingImpl(this.sourceType, this.currentMapping.destinationMutators, this.options);
                    } else if (this.currentMapping.sourceAccessors == null) {
                        propertyMappingImpl = new ConstantMappingImpl(this.sourceConstant, this.currentMapping.destinationMutators, this.options);
                    } else {
                        propertyMappingImpl = new PropertyMappingImpl(this.currentMapping.sourceAccessors, this.currentMapping.destinationMutators, this.options);
                    }
                    if (!this.propertyMappings.add(propertyMappingImpl)) {
                        this.errors.duplicateMapping(propertyMappingImpl.getLastDestinationProperty());
                    }
                }
            } finally {
                this.currentMapping = null;
                this.options = new MappingOptions();
                this.sourceAccessors = null;
                this.sourceConstant = null;
            }
        }
    }
}
