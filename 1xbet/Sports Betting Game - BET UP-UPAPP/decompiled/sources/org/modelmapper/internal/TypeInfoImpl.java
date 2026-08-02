package org.modelmapper.internal;

import java.util.Map;
import org.modelmapper.config.Configuration;
import org.modelmapper.spi.NameableType;

/* loaded from: classes4.dex */
class TypeInfoImpl<T> implements TypeInfo<T> {
    private volatile Map<String, Accessor> accessors;
    private final InheritingConfiguration configuration;
    private volatile Map<String, Mutator> mutators;
    private final T source;
    private final Class<T> type;

    TypeInfoImpl(T t, Class<T> cls, InheritingConfiguration inheritingConfiguration) {
        this.source = t;
        this.type = cls;
        this.configuration = inheritingConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) obj;
        return this.type.equals(typeInfo.getType()) && this.configuration.equals(typeInfo.getConfiguration());
    }

    @Override // org.modelmapper.internal.TypeInfo
    public Map<String, Accessor> getAccessors() {
        if (this.accessors == null) {
            synchronized (this) {
                if (this.accessors == null) {
                    this.accessors = PropertyInfoSetResolver.resolveAccessors(this.source, this.type, this.configuration);
                }
            }
        }
        return this.accessors;
    }

    @Override // org.modelmapper.internal.TypeInfo
    public Configuration getConfiguration() {
        return this.configuration;
    }

    @Override // org.modelmapper.internal.TypeInfo
    public Map<String, Mutator> getMutators() {
        if (this.mutators == null) {
            synchronized (this) {
                if (this.mutators == null) {
                    this.mutators = PropertyInfoSetResolver.resolveMutators(this.type, this.configuration);
                }
            }
        }
        return this.mutators;
    }

    @Override // org.modelmapper.internal.TypeInfo
    public Class<T> getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.configuration.hashCode();
    }

    public String toString() {
        return this.type.toString();
    }

    Mutator mutatorForAccessorMethod(String str) {
        return getMutators().get(this.configuration.getSourceNameTransformer().transform(str, NameableType.METHOD));
    }
}
