package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class EnumTypeProtoConverter<E extends java.lang.Enum<E>, O> {
    private final java.util.Map<E, O> fromProtoEnumMap;
    private final java.util.Map<O, E> toProtoEnumMap;

    private EnumTypeProtoConverter(java.util.Map<E, O> map, java.util.Map<O, E> map2) {
        this.fromProtoEnumMap = map;
        this.toProtoEnumMap = map2;
    }

    public static final class Builder<E extends java.lang.Enum<E>, O> {
        java.util.Map<E, O> fromProtoEnumMap;
        java.util.Map<O, E> toProtoEnumMap;

        private Builder() {
            this.fromProtoEnumMap = new java.util.HashMap();
            this.toProtoEnumMap = new java.util.HashMap();
        }

        public final com.google.crypto.tink.internal.EnumTypeProtoConverter.Builder<E, O> add(E e, O o2) {
            this.fromProtoEnumMap.put(e, o2);
            this.toProtoEnumMap.put(o2, e);
            return this;
        }

        public final com.google.crypto.tink.internal.EnumTypeProtoConverter<E, O> build() {
            return new com.google.crypto.tink.internal.EnumTypeProtoConverter<>(java.util.Collections.unmodifiableMap(this.fromProtoEnumMap), java.util.Collections.unmodifiableMap(this.toProtoEnumMap));
        }
    }

    public static <E extends java.lang.Enum<E>, O> com.google.crypto.tink.internal.EnumTypeProtoConverter.Builder<E, O> builder() {
        return new com.google.crypto.tink.internal.EnumTypeProtoConverter.Builder<>();
    }

    public final E toProtoEnum(O o2) throws java.security.GeneralSecurityException {
        E e = this.toProtoEnumMap.get(o2);
        if (e != null) {
            return e;
        }
        throw new java.security.GeneralSecurityException("Unable to convert object enum: ".concat(java.lang.String.valueOf(o2)));
    }

    public final O fromProtoEnum(E e) throws java.security.GeneralSecurityException {
        O o2 = this.fromProtoEnumMap.get(e);
        if (o2 != null) {
            return o2;
        }
        throw new java.security.GeneralSecurityException("Unable to convert proto enum: ".concat(java.lang.String.valueOf(e)));
    }
}
