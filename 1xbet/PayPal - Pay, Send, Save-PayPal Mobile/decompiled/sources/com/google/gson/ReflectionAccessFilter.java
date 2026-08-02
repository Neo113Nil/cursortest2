package com.google.gson;

/* loaded from: classes4.dex */
public interface ReflectionAccessFilter {
    public static final com.google.gson.ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = new com.google.gson.ReflectionAccessFilter() { // from class: com.google.gson.ReflectionAccessFilter.1
        @Override // com.google.gson.ReflectionAccessFilter
        public com.google.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.google.gson.internal.ReflectionAccessFilterHelper.isJavaType(cls)) {
                return com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            }
            return com.google.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }

        public java.lang.String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    };
    public static final com.google.gson.ReflectionAccessFilter BLOCK_ALL_JAVA = new com.google.gson.ReflectionAccessFilter() { // from class: com.google.gson.ReflectionAccessFilter.2
        @Override // com.google.gson.ReflectionAccessFilter
        public com.google.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.google.gson.internal.ReflectionAccessFilterHelper.isJavaType(cls)) {
                return com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.google.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }

        public java.lang.String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    };
    public static final com.google.gson.ReflectionAccessFilter BLOCK_ALL_ANDROID = new com.google.gson.ReflectionAccessFilter() { // from class: com.google.gson.ReflectionAccessFilter.3
        @Override // com.google.gson.ReflectionAccessFilter
        public com.google.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.google.gson.internal.ReflectionAccessFilterHelper.isAndroidType(cls)) {
                return com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.google.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }

        public java.lang.String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    };
    public static final com.google.gson.ReflectionAccessFilter BLOCK_ALL_PLATFORM = new com.google.gson.ReflectionAccessFilter() { // from class: com.google.gson.ReflectionAccessFilter.4
        @Override // com.google.gson.ReflectionAccessFilter
        public com.google.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.google.gson.internal.ReflectionAccessFilterHelper.isAnyPlatformType(cls)) {
                return com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.google.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }

        public java.lang.String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    };

    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    com.google.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls);
}
