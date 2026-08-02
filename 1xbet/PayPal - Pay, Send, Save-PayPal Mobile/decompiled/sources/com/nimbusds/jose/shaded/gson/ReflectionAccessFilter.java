package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public interface ReflectionAccessFilter {
    public static final com.nimbusds.jose.shaded.gson.ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA = new com.nimbusds.jose.shaded.gson.ReflectionAccessFilter() { // from class: com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.1
        @Override // com.nimbusds.jose.shaded.gson.ReflectionAccessFilter
        public com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.isJavaType(cls)) {
                return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            }
            return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }
    };
    public static final com.nimbusds.jose.shaded.gson.ReflectionAccessFilter BLOCK_ALL_JAVA = new com.nimbusds.jose.shaded.gson.ReflectionAccessFilter() { // from class: com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.2
        @Override // com.nimbusds.jose.shaded.gson.ReflectionAccessFilter
        public com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.isJavaType(cls)) {
                return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }
    };
    public static final com.nimbusds.jose.shaded.gson.ReflectionAccessFilter BLOCK_ALL_ANDROID = new com.nimbusds.jose.shaded.gson.ReflectionAccessFilter() { // from class: com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.3
        @Override // com.nimbusds.jose.shaded.gson.ReflectionAccessFilter
        public com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.isAndroidType(cls)) {
                return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }
    };
    public static final com.nimbusds.jose.shaded.gson.ReflectionAccessFilter BLOCK_ALL_PLATFORM = new com.nimbusds.jose.shaded.gson.ReflectionAccessFilter() { // from class: com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.4
        @Override // com.nimbusds.jose.shaded.gson.ReflectionAccessFilter
        public com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls) {
            if (com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.isAnyPlatformType(cls)) {
                return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL;
            }
            return com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.INDECISIVE;
        }
    };

    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult check(java.lang.Class<?> cls);
}
