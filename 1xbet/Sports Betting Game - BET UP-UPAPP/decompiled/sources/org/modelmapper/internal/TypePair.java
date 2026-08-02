package org.modelmapper.internal;

/* loaded from: classes4.dex */
class TypePair<S, D> {
    private final Class<D> destinationType;
    private final int hashCode = computeHashCode();
    private final String name;
    private final Class<S> sourceType;

    private TypePair(Class<S> cls, Class<D> cls2, String str) {
        this.sourceType = cls;
        this.destinationType = cls2;
        this.name = str;
    }

    static <T1, T2> TypePair<T1, T2> of(Class<T1> cls, Class<T2> cls2, String str) {
        return new TypePair<>(cls, cls2, str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TypePair)) {
            return false;
        }
        TypePair typePair = (TypePair) obj;
        String str = this.name;
        if (str == null) {
            if (typePair.name != null) {
                return false;
            }
        } else if (!str.equals(typePair.name)) {
            return false;
        }
        return this.sourceType.equals(typePair.sourceType) && this.destinationType.equals(typePair.destinationType);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        String str = this.sourceType.getName() + " to " + this.destinationType.getName();
        return this.name != null ? str + " as " + this.name : str;
    }

    Class<D> getDestinationType() {
        return this.destinationType;
    }

    Class<S> getSourceType() {
        return this.sourceType;
    }

    private int computeHashCode() {
        int hashCode = (((this.sourceType.hashCode() + 31) * 31) + this.destinationType.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
