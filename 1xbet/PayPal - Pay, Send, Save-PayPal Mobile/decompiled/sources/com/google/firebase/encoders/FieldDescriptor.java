package com.google.firebase.encoders;

/* loaded from: classes4.dex */
public final class FieldDescriptor {

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f3916name;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> properties;

    private FieldDescriptor(java.lang.String str, java.util.Map<java.lang.Class<?>, java.lang.Object> map) {
        this.f3916name = str;
        this.properties = map;
    }

    public final java.lang.String getName() {
        return this.f3916name;
    }

    public final <T extends java.lang.annotation.Annotation> T getProperty(java.lang.Class<T> cls) {
        return (T) this.properties.get(cls);
    }

    public static com.google.firebase.encoders.FieldDescriptor of(java.lang.String str) {
        return new com.google.firebase.encoders.FieldDescriptor(str, java.util.Collections.emptyMap());
    }

    public static com.google.firebase.encoders.FieldDescriptor.Builder builder(java.lang.String str) {
        return new com.google.firebase.encoders.FieldDescriptor.Builder(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.encoders.FieldDescriptor)) {
            return false;
        }
        com.google.firebase.encoders.FieldDescriptor fieldDescriptor = (com.google.firebase.encoders.FieldDescriptor) obj;
        return this.f3916name.equals(fieldDescriptor.f3916name) && this.properties.equals(fieldDescriptor.properties);
    }

    public final int hashCode() {
        return (this.f3916name.hashCode() * 31) + this.properties.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldDescriptor{name=");
        sb.append(this.f3916name);
        sb.append(", properties=");
        sb.append(this.properties.values());
        sb.append("}");
        return sb.toString();
    }

    public static final class Builder {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3917name;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> properties = null;

        Builder(java.lang.String str) {
            this.f3917name = str;
        }

        public final <T extends java.lang.annotation.Annotation> com.google.firebase.encoders.FieldDescriptor.Builder withProperty(T t) {
            if (this.properties == null) {
                this.properties = new java.util.HashMap();
            }
            this.properties.put(t.annotationType(), t);
            return this;
        }

        public final com.google.firebase.encoders.FieldDescriptor build() {
            java.util.Map unmodifiableMap;
            java.lang.String str = this.f3917name;
            if (this.properties == null) {
                unmodifiableMap = java.util.Collections.emptyMap();
            } else {
                unmodifiableMap = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.properties));
            }
            return new com.google.firebase.encoders.FieldDescriptor(str, unmodifiableMap);
        }
    }
}
