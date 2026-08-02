package org.modelmapper.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyType;
import org.modelmapper.spi.ValueReader;
import org.modelmapper.spi.ValueWriter;

/* loaded from: classes4.dex */
abstract class PropertyInfoImpl<M extends Member> implements PropertyInfo {
    protected final Class<?> initialType;
    protected final M member;
    protected final String name;
    private final PropertyType propertyType;
    protected final Class<?> type;

    static abstract class AbstractMethodInfo extends PropertyInfoImpl<Method> {
        private AbstractMethodInfo(Class<?> cls, Method method, String str) {
            super(cls, method, PropertyType.METHOD, str);
            method.setAccessible(true);
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public <T extends Annotation> T getAnnotation(Class<T> cls) {
            return (T) ((Method) this.member).getAnnotation(cls);
        }
    }

    static class FieldPropertyInfo extends PropertyInfoImpl<Field> implements Accessor, Mutator {
        FieldPropertyInfo(Class<?> cls, Field field, String str) {
            super(cls, field, PropertyType.FIELD, str);
            field.setAccessible(true);
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public <T extends Annotation> T getAnnotation(Class<T> cls) {
            return (T) ((Field) this.member).getAnnotation(cls);
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public Type getGenericType() {
            return ((Field) this.member).getGenericType();
        }

        @Override // org.modelmapper.internal.Accessor
        public Object getValue(Object obj) {
            try {
                return ((Field) this.member).get(obj);
            } catch (Exception e) {
                throw new Errors().errorGettingValue(this.member, e).toMappingException();
            }
        }

        @Override // org.modelmapper.internal.Mutator
        public void setValue(Object obj, Object obj2) {
            try {
                ((Field) this.member).set(obj, obj2);
            } catch (Exception e) {
                throw new Errors().errorSettingValue(this.member, obj2, e).toMappingException();
            }
        }

        @Override // org.modelmapper.internal.InternalPropertyInfo
        public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
            return TypeInfoRegistry.typeInfoFor(this, inheritingConfiguration);
        }
    }

    static class MethodAccessor extends AbstractMethodInfo implements Accessor {
        MethodAccessor(Class<?> cls, Method method, String str) {
            super(cls, method, str);
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public Type getGenericType() {
            return ((Method) this.member).getGenericReturnType();
        }

        @Override // org.modelmapper.internal.Accessor
        public Object getValue(Object obj) {
            try {
                return ((Method) this.member).invoke(obj, new Object[0]);
            } catch (IllegalAccessException unused) {
                new Errors().errorAccessingProperty(this).throwMappingExceptionIfErrorsExist();
                return null;
            } catch (Exception e) {
                throw new Errors().errorGettingValue(this.member, e).toMappingException();
            }
        }

        @Override // org.modelmapper.internal.InternalPropertyInfo
        public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
            return TypeInfoRegistry.typeInfoFor(this, inheritingConfiguration);
        }
    }

    static class MethodMutator extends AbstractMethodInfo implements Mutator {
        MethodMutator(Class<?> cls, Method method, String str) {
            super(cls, method, str);
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public Type getGenericType() {
            return ((Method) this.member).getGenericParameterTypes()[0];
        }

        @Override // org.modelmapper.internal.Mutator
        public void setValue(Object obj, Object obj2) {
            try {
                ((Method) this.member).invoke(obj, obj2);
            } catch (Exception e) {
                throw new Errors().errorSettingValue(this.member, obj2, e).toMappingException();
            }
        }

        @Override // org.modelmapper.internal.InternalPropertyInfo
        public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
            return TypeInfoRegistry.typeInfoFor(this.type, inheritingConfiguration);
        }
    }

    static class ValueReaderPropertyInfo extends PropertyInfoImpl<Member> implements Accessor {
        private ValueReader.Member<Object> valueReaderMember;

        @Override // org.modelmapper.spi.PropertyInfo
        public <T extends Annotation> T getAnnotation(Class<T> cls) {
            return null;
        }

        ValueReaderPropertyInfo(ValueReader.Member<?> member, Class<?> cls, String str) {
            super(cls, null, PropertyType.GENERIC, str);
            this.valueReaderMember = member;
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public Type getGenericType() {
            return this.type;
        }

        @Override // org.modelmapper.internal.Accessor
        public Object getValue(Object obj) {
            return this.valueReaderMember.get(obj, this.name);
        }

        @Override // org.modelmapper.internal.InternalPropertyInfo
        public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
            return TypeInfoRegistry.typeInfoFor(this.type, inheritingConfiguration);
        }

        static ValueReaderPropertyInfo fromMember(final ValueReader.Member<?> member, String str) {
            if (member.getOrigin() != null) {
                return new ValueReaderPropertyInfo(member, member.getValueType(), str) { // from class: org.modelmapper.internal.PropertyInfoImpl.ValueReaderPropertyInfo.1
                    @Override // org.modelmapper.internal.PropertyInfoImpl.ValueReaderPropertyInfo, org.modelmapper.internal.InternalPropertyInfo
                    public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
                        return TypeInfoRegistry.typeInfoFor(member.getOrigin(), member.getValueType(), inheritingConfiguration);
                    }
                };
            }
            return new ValueReaderPropertyInfo(member, member.getValueType(), str);
        }

        static ValueReaderPropertyInfo create(final ValueReader<?> valueReader, String str) {
            ValueReader.Member<Object> member = new ValueReader.Member<Object>(Object.class) { // from class: org.modelmapper.internal.PropertyInfoImpl.ValueReaderPropertyInfo.2
                @Override // org.modelmapper.spi.ValueReader.Member
                public Object get(Object obj, String str2) {
                    return valueReader.get(obj, str2);
                }
            };
            return new ValueReaderPropertyInfo(member, member.getValueType(), str);
        }
    }

    static class ValueWriterPropertyInfo extends PropertyInfoImpl<Member> implements Mutator {
        private ValueWriter.Member<Object> valueWriterMember;

        @Override // org.modelmapper.spi.PropertyInfo
        public <T extends Annotation> T getAnnotation(Class<T> cls) {
            return null;
        }

        ValueWriterPropertyInfo(ValueWriter.Member<?> member, Class<?> cls, String str) {
            super(cls, null, PropertyType.GENERIC, str);
            this.valueWriterMember = member;
        }

        @Override // org.modelmapper.spi.PropertyInfo
        public Type getGenericType() {
            return this.type;
        }

        @Override // org.modelmapper.internal.InternalPropertyInfo
        public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
            return TypeInfoRegistry.typeInfoFor(this.type, inheritingConfiguration);
        }

        @Override // org.modelmapper.internal.Mutator
        public void setValue(Object obj, Object obj2) {
            this.valueWriterMember.setValue(obj, obj2);
        }

        static ValueWriterPropertyInfo fromMember(final ValueWriter.Member<?> member, String str) {
            if (member.getOrigin() != null) {
                return new ValueWriterPropertyInfo(member, member.getValueType(), str) { // from class: org.modelmapper.internal.PropertyInfoImpl.ValueWriterPropertyInfo.1
                    @Override // org.modelmapper.internal.PropertyInfoImpl.ValueWriterPropertyInfo, org.modelmapper.internal.InternalPropertyInfo
                    public TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration) {
                        return TypeInfoRegistry.typeInfoFor(member.getOrigin(), member.getValueType(), inheritingConfiguration);
                    }
                };
            }
            return new ValueWriterPropertyInfo(member, member.getValueType(), str);
        }

        static ValueWriterPropertyInfo create(final ValueWriter<?> valueWriter, final String str) {
            ValueWriter.Member<Object> member = new ValueWriter.Member<Object>(Object.class) { // from class: org.modelmapper.internal.PropertyInfoImpl.ValueWriterPropertyInfo.2
                @Override // org.modelmapper.spi.ValueWriter.Member
                public void setValue(Object obj, Object obj2) {
                    valueWriter.setValue(obj, obj2, str);
                }
            };
            return new ValueWriterPropertyInfo(member, member.getValueType(), str);
        }
    }

    private PropertyInfoImpl(Class<?> cls, M m, PropertyType propertyType, String str) {
        this.initialType = cls;
        this.member = m;
        this.propertyType = propertyType;
        Type genericType = getGenericType();
        this.type = genericType != null ? TypeResolver.resolveRawClass(genericType, cls) : cls;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PropertyInfo)) {
            return false;
        }
        PropertyInfoImpl propertyInfoImpl = (PropertyInfoImpl) obj;
        return this.member.getDeclaringClass().equals(propertyInfoImpl.member.getDeclaringClass()) && this.name.equals(propertyInfoImpl.getName());
    }

    @Override // org.modelmapper.spi.PropertyInfo
    public Class<?> getInitialType() {
        return this.initialType;
    }

    @Override // org.modelmapper.spi.PropertyInfo
    public M getMember() {
        return this.member;
    }

    @Override // org.modelmapper.spi.PropertyInfo
    public String getName() {
        return this.name;
    }

    @Override // org.modelmapper.spi.PropertyInfo
    public PropertyType getPropertyType() {
        return this.propertyType;
    }

    @Override // org.modelmapper.spi.PropertyInfo
    public Class<?> getType() {
        return this.type;
    }

    public int hashCode() {
        M m = this.member;
        return ((m == null ? 1 : m.getDeclaringClass().hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return this.member == null ? this.name : this.member.getDeclaringClass().getSimpleName() + "." + this.name;
    }
}
