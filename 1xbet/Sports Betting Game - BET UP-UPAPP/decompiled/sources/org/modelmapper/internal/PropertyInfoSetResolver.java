package org.modelmapper.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;
import org.modelmapper.config.Configuration;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.spi.NameTransformer;
import org.modelmapper.spi.NameableType;
import org.modelmapper.spi.NamingConvention;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyType;
import org.modelmapper.spi.ValueReader;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
final class PropertyInfoSetResolver {
    private PropertyInfoSetResolver() {
    }

    private static class ResolveRequest<M extends AccessibleObject & Member, PI extends PropertyInfo> {
        Configuration.AccessLevel accessLevel;
        Configuration config;
        NameTransformer nameTransformer;
        NamingConvention namingConvention;
        PropertyInfoResolver<M, PI> propertyResolver;
        PropertyType propertyType;

        private ResolveRequest() {
        }

        /* synthetic */ ResolveRequest(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* renamed from: org.modelmapper.internal.PropertyInfoSetResolver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$modelmapper$config$Configuration$AccessLevel;

        static {
            int[] iArr = new int[Configuration.AccessLevel.values().length];
            $SwitchMap$org$modelmapper$config$Configuration$AccessLevel = iArr;
            try {
                iArr[Configuration.AccessLevel.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$modelmapper$config$Configuration$AccessLevel[Configuration.AccessLevel.PROTECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$modelmapper$config$Configuration$AccessLevel[Configuration.AccessLevel.PACKAGE_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$modelmapper$config$Configuration$AccessLevel[Configuration.AccessLevel.PRIVATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static boolean canAccessMember(Member member, Configuration.AccessLevel accessLevel) {
        int modifiers = member.getModifiers();
        int i = AnonymousClass1.$SwitchMap$org$modelmapper$config$Configuration$AccessLevel[accessLevel.ordinal()];
        if (i == 2) {
            return Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers);
        }
        if (i == 3) {
            return Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !Modifier.isPrivate(modifiers);
        }
        if (i != 4) {
            return Modifier.isPublic(modifiers);
        }
        return true;
    }

    static <T> Map<String, Accessor> resolveAccessors(T t, Class<T> cls, InheritingConfiguration inheritingConfiguration) {
        ValueReader<T> firstSupportedReader = inheritingConfiguration.valueAccessStore.getFirstSupportedReader(cls);
        if (t != null && firstSupportedReader != null) {
            return resolveAccessorsFromValueReader(t, inheritingConfiguration, firstSupportedReader);
        }
        return resolveProperties((Class<?>) cls, true, (Configuration) inheritingConfiguration);
    }

    static <T> Map<String, Accessor> resolveAccessorsFromValueReader(T t, InheritingConfiguration inheritingConfiguration, ValueReader<T> valueReader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NameTransformer sourceNameTransformer = inheritingConfiguration.getSourceNameTransformer();
        for (String str : valueReader.memberNames(t)) {
            ValueReader.Member<T> member = valueReader.getMember(t, str);
            if (member != null) {
                linkedHashMap.put(sourceNameTransformer.transform(str, NameableType.GENERIC), PropertyInfoImpl.ValueReaderPropertyInfo.fromMember(member, str));
            }
        }
        return linkedHashMap;
    }

    static <T> Map<String, Mutator> resolveMutators(Class<T> cls, InheritingConfiguration inheritingConfiguration) {
        ValueWriter<T> firstSupportedWriter = inheritingConfiguration.valueMutateStore.getFirstSupportedWriter(cls);
        if (firstSupportedWriter != null && firstSupportedWriter.isResolveMembersSupport()) {
            return resolveMutatorsFromValueWriter(cls, inheritingConfiguration, firstSupportedWriter);
        }
        return resolveProperties((Class<?>) cls, false, (Configuration) inheritingConfiguration);
    }

    static <T> Map<String, Mutator> resolveMutatorsFromValueWriter(Class<T> cls, InheritingConfiguration inheritingConfiguration, ValueWriter<T> valueWriter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NameTransformer sourceNameTransformer = inheritingConfiguration.getSourceNameTransformer();
        for (String str : valueWriter.memberNames(cls)) {
            ValueWriter.Member<T> member = valueWriter.getMember(cls, str);
            if (member != null) {
                linkedHashMap.put(sourceNameTransformer.transform(str, NameableType.GENERIC), PropertyInfoImpl.ValueWriterPropertyInfo.fromMember(member, str));
            }
        }
        return linkedHashMap;
    }

    private static <M extends AccessibleObject & Member, PI extends PropertyInfo> Map<String, PI> resolveProperties(Class<?> cls, boolean z, Configuration configuration) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (configuration.isFieldMatchingEnabled()) {
            linkedHashMap.putAll(resolveProperties(cls, cls, resolveRequest(configuration, z, true)));
        }
        linkedHashMap.putAll(resolveProperties(cls, cls, resolveRequest(configuration, z, false)));
        return linkedHashMap;
    }

    private static <M extends AccessibleObject & Member, PI extends PropertyInfo> Map<String, PI> resolveProperties(Class<?> cls, Class<?> cls2, ResolveRequest<M, PI> resolveRequest) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<? super Object> superclass = cls2.getSuperclass();
        if (superclass != null && superclass != Object.class && superclass != Enum.class) {
            linkedHashMap.putAll(resolveProperties(cls, superclass, resolveRequest));
        }
        for (M m : resolveRequest.propertyResolver.membersFor(cls2)) {
            M m2 = m;
            if (canAccessMember(m2, resolveRequest.accessLevel) && resolveRequest.propertyResolver.isValid(m2) && resolveRequest.namingConvention.applies(m2.getName(), resolveRequest.propertyType)) {
                String transform = resolveRequest.nameTransformer.transform(m2.getName(), PropertyType.FIELD.equals(resolveRequest.propertyType) ? NameableType.FIELD : NameableType.METHOD);
                linkedHashMap.put(transform, resolveRequest.propertyResolver.propertyInfoFor(cls, m2, resolveRequest.config, transform));
                if (!Modifier.isPublic(m2.getModifiers()) || !Modifier.isPublic(m2.getDeclaringClass().getModifiers())) {
                    try {
                        m.setAccessible(true);
                    } catch (SecurityException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static <M extends AccessibleObject & Member, PI extends PropertyInfo> ResolveRequest<M, PI> resolveRequest(Configuration configuration, boolean z, boolean z2) {
        ResolveRequest<M, PI> resolveRequest = new ResolveRequest<>(null);
        resolveRequest.config = configuration;
        if (z) {
            resolveRequest.namingConvention = configuration.getSourceNamingConvention();
            resolveRequest.nameTransformer = configuration.getSourceNameTransformer();
        } else {
            resolveRequest.namingConvention = configuration.getDestinationNamingConvention();
            resolveRequest.nameTransformer = configuration.getDestinationNameTransformer();
        }
        if (z2) {
            resolveRequest.propertyType = PropertyType.FIELD;
            resolveRequest.accessLevel = configuration.getFieldAccessLevel();
            resolveRequest.propertyResolver = PropertyInfoResolver.FIELDS;
        } else {
            resolveRequest.propertyType = PropertyType.METHOD;
            resolveRequest.accessLevel = configuration.getMethodAccessLevel();
            resolveRequest.propertyResolver = z ? PropertyInfoResolver.ACCESSORS : PropertyInfoResolver.MUTATORS;
        }
        return resolveRequest;
    }
}
