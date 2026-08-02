package org.modelmapper.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Callable;
import org.modelmapper.internal.util.Objects;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.MappingContext;
import org.modelmapper.spi.MappingEngine;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
public class MappingContextImpl<S, D> implements MappingContext<S, D>, Provider.ProvisionRequest<D> {
    private D destination;
    final Map<String, Object> destinationCache;
    final String destinationPath;
    private final Class<D> destinationType;
    final Errors errors;
    private final Type genericDestinationType;
    final List<Object> intermediateDestinations;
    private MappingImpl mapping;
    private final MappingEngineImpl mappingEngine;
    private final MappingContextImpl<?, ?> parent;
    private Object parentSource;
    private boolean providedDestination;
    private final List<String> shadedPaths;
    private final S source;
    final Map<Object, Object> sourceToDestination;
    private final Class<S> sourceType;
    private TypeMap<S, D> typeMap;
    private final String typeMapName;

    /* JADX WARN: Multi-variable type inference failed */
    public MappingContextImpl(S s, Class<S> cls, D d, Class<D> cls2, Type type, String str, MappingEngineImpl mappingEngineImpl) {
        this.parent = null;
        this.source = s;
        this.sourceType = cls;
        this.destination = d;
        this.destinationPath = "";
        this.destinationType = cls2;
        this.genericDestinationType = type != 0 ? type : cls2;
        this.typeMapName = str;
        this.providedDestination = d != null;
        this.mappingEngine = mappingEngineImpl;
        this.errors = new Errors();
        this.destinationCache = new HashMap();
        this.shadedPaths = new ArrayList();
        this.sourceToDestination = new IdentityHashMap();
        this.intermediateDestinations = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    MappingContextImpl(MappingContextImpl<?, ?> mappingContextImpl, S s, Class<S> cls, D d, Class<D> cls2, Type type, MappingImpl mappingImpl, boolean z) {
        String str;
        this.parent = mappingContextImpl;
        this.source = s;
        this.sourceType = cls;
        this.destination = d;
        if (mappingImpl == null) {
            str = mappingContextImpl.destinationPath;
        } else {
            str = mappingContextImpl.destinationPath + mappingImpl.getPath();
        }
        this.destinationPath = str;
        this.destinationType = cls2;
        this.genericDestinationType = type != 0 ? type : cls2;
        this.providedDestination = mappingContextImpl.providedDestination;
        this.typeMap = null;
        this.typeMapName = null;
        this.mapping = mappingImpl;
        this.parentSource = mappingContextImpl.parentSource;
        this.mappingEngine = mappingContextImpl.mappingEngine;
        this.errors = mappingContextImpl.errors;
        this.destinationCache = z ? mappingContextImpl.destinationCache : new HashMap<>();
        this.shadedPaths = z ? mappingContextImpl.shadedPaths : new ArrayList<>();
        this.sourceToDestination = mappingContextImpl.sourceToDestination;
        this.intermediateDestinations = new ArrayList();
    }

    @Override // org.modelmapper.spi.MappingContext
    public <CS, CD> MappingContext<CS, CD> create(CS cs, CD cd) {
        Assert.notNull(cs, "source");
        Assert.notNull(cd, "destination");
        return new MappingContextImpl(this, cs, Types.deProxy(cs.getClass()), cd, Types.deProxy(cd.getClass()), null, this.mapping, false);
    }

    @Override // org.modelmapper.spi.MappingContext
    public <CS, CD> MappingContext<CS, CD> create(CS cs, Class<CD> cls) {
        Assert.notNull(cs, "source");
        Assert.notNull(cls, "destinationType");
        return new MappingContextImpl(this, cs, Types.deProxy(cs.getClass()), null, cls, null, null, false);
    }

    @Override // org.modelmapper.spi.MappingContext
    public <CS, CD> MappingContext<CS, CD> create(CS cs, Type type) {
        Assert.notNull(cs, "source");
        Assert.notNull(type, "destinationType");
        TypeToken of = TypeToken.of(type);
        return new MappingContextImpl(this, cs, Types.deProxy(cs.getClass()), null, of.getRawType(), of.getType(), this.mapping, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MappingContextImpl mappingContextImpl = (MappingContextImpl) obj;
        return this.source.equals(mappingContextImpl.source) && this.sourceType.equals(mappingContextImpl.sourceType) && this.destinationType.equals(mappingContextImpl.destinationType);
    }

    @Override // org.modelmapper.spi.MappingContext
    public D getDestination() {
        return this.destination;
    }

    @Override // org.modelmapper.spi.MappingContext
    public Class<D> getDestinationType() {
        return this.destinationType;
    }

    @Override // org.modelmapper.spi.MappingContext
    public Type getGenericDestinationType() {
        return this.genericDestinationType;
    }

    @Override // org.modelmapper.spi.MappingContext
    public Mapping getMapping() {
        return this.mapping;
    }

    @Override // org.modelmapper.spi.MappingContext
    public MappingEngine getMappingEngine() {
        return this.mappingEngine;
    }

    @Override // org.modelmapper.spi.MappingContext
    public MappingContext<?, ?> getParent() {
        return this.parent;
    }

    @Override // org.modelmapper.Provider.ProvisionRequest
    public Class<D> getRequestedType() {
        return this.destinationType;
    }

    @Override // org.modelmapper.spi.MappingContext, org.modelmapper.Provider.ProvisionRequest
    public S getSource() {
        return this.source;
    }

    @Override // org.modelmapper.spi.MappingContext
    public Class<S> getSourceType() {
        return this.sourceType;
    }

    @Override // org.modelmapper.spi.MappingContext
    public TypeMap<S, D> getTypeMap() {
        return this.typeMap;
    }

    @Override // org.modelmapper.spi.MappingContext
    public String getTypeMapName() {
        return this.typeMapName;
    }

    public int hashCode() {
        return ((((this.source.hashCode() + 31) * 31) + this.sourceType.hashCode()) * 31) + this.destinationType.hashCode();
    }

    public String toString() {
        return String.format("MappingContext[%s -> %s]", this.sourceType.getSimpleName(), this.destinationType.getSimpleName());
    }

    D destinationForSource() {
        return (D) this.sourceToDestination.get(this.source);
    }

    boolean isShaded(String str) {
        Iterator<String> it = this.shadedPaths.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    TypeMap<?, ?> parentTypeMap() {
        MappingContextImpl<?, ?> mappingContextImpl = this.parent;
        if (mappingContextImpl == null) {
            return null;
        }
        return mappingContextImpl.typeMap;
    }

    void setDestination(D d, boolean z) {
        this.destination = d;
        if (!z || Primitives.isPrimitiveWrapper(this.sourceType)) {
            return;
        }
        this.sourceToDestination.put(this.source, d);
    }

    void setParentSource(Object obj) {
        this.parentSource = obj;
    }

    void setTypeMap(TypeMap<S, D> typeMap) {
        this.typeMap = typeMap;
    }

    void shadePath(String str) {
        this.shadedPaths.add(str);
    }

    Type genericDestinationPropertyType(Type type) {
        if (type != null && (type instanceof ParameterizedType) && this.genericDestinationType != null && this.destinationType.getTypeParameters().length != 0) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length != 0 && this.destinationType.getTypeParameters()[0] == parameterizedType.getActualTypeArguments()[0]) {
                return this.genericDestinationType;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <S, D> Object getParentDestination() {
        List<? extends PropertyInfo> destinationProperties = this.mapping.getDestinationProperties();
        StringBuilder append = new StringBuilder().append(this.parent.destinationPath);
        Object obj = this.parent.destination;
        int i = 0;
        while (i < destinationProperties.size() - 1 && obj != null) {
            Mutator mutator = (Mutator) destinationProperties.get(i);
            String sb = append.append(mutator.getName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString();
            Object firstNonNull = Objects.firstNonNull((Callable<Object>[]) new Callable[]{Objects.callable(this.parent.destinationCache.get(sb)), this.parent.getDestinationValueByType(mutator.getType()), this.parent.getDestinationValueByMemberName(obj, mutator.getName())});
            Object obj2 = firstNonNull;
            if (firstNonNull == null) {
                obj2 = firstNonNull;
                if (this.source != null) {
                    obj2 = this.mappingEngine.createDestinationViaGlobalProvider(this.parent.parentSource, mutator.getType(), this.parent.errors);
                }
            }
            if (obj2 != null) {
                mutator.setValue(obj, obj2);
                this.parent.destinationCache.put(sb, obj2);
            }
            i++;
            obj = obj2;
        }
        return obj;
    }

    private Callable<Object> getDestinationValueByMemberName(final Object obj, final String str) {
        return new Callable<Object>() { // from class: org.modelmapper.internal.MappingContextImpl.1
            @Override // org.modelmapper.internal.util.Callable
            public Object call() {
                Accessor accessor;
                if (!MappingContextImpl.this.providedDestination || (accessor = TypeInfoRegistry.typeInfoFor(obj.getClass(), MappingContextImpl.this.mappingEngine.getConfiguration()).getAccessors().get(str)) == null) {
                    return null;
                }
                return accessor.getValue(obj);
            }
        };
    }

    Callable<Object> getDestinationValueByType(final Class<?> cls) {
        return new Callable<Object>() { // from class: org.modelmapper.internal.MappingContextImpl.2
            @Override // org.modelmapper.internal.util.Callable
            public Object call() {
                for (Object obj : MappingContextImpl.this.intermediateDestinations) {
                    if (obj.getClass().equals(cls)) {
                        return obj;
                    }
                }
                return null;
            }
        };
    }

    D createDestinationViaProvider() {
        Provider provider;
        if (getMapping() != null) {
            provider = getMapping().getProvider();
            if (provider == null && parentTypeMap() != null) {
                provider = parentTypeMap().getPropertyProvider();
            }
        } else {
            provider = null;
        }
        if (provider == null && getTypeMap() != null) {
            provider = getTypeMap().getProvider();
        }
        if (provider == null && this.mappingEngine.getConfiguration().getProvider() != null) {
            provider = this.mappingEngine.getConfiguration().getProvider();
        }
        if (provider == null) {
            return null;
        }
        D d = (D) provider.get(this);
        this.mappingEngine.validateDestination(this.destinationType, d, this.errors);
        setDestination(d, false);
        return d;
    }

    public boolean isProvidedDestination() {
        return this.providedDestination;
    }
}
