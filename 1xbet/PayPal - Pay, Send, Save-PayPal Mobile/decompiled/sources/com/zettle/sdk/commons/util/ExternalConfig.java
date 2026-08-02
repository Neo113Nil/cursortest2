package com.zettle.sdk.commons.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\f\u001a\u00028\u0000\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/commons/util/ExternalConfig;", "", "", "key", "", "defValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "T", "Ljava/lang/Class;", "type", "getEnum", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "", "getInt", "(Ljava/lang/String;I)I", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ExternalConfig {
    boolean getBoolean(java.lang.String key, boolean defValue);

    <T extends java.lang.Enum<T>> T getEnum(java.lang.String key, java.lang.Class<T> type, T defValue);

    int getInt(java.lang.String key, int defValue);

    java.lang.String getString(java.lang.String key, java.lang.String defValue);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String getString(com.zettle.sdk.commons.util.ExternalConfig externalConfig, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return str2;
        }

        public static int getInt(com.zettle.sdk.commons.util.ExternalConfig externalConfig, java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return i;
        }

        public static <T extends java.lang.Enum<T>> T getEnum(com.zettle.sdk.commons.util.ExternalConfig externalConfig, java.lang.String str, java.lang.Class<T> cls, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            return t;
        }

        public static boolean getBoolean(com.zettle.sdk.commons.util.ExternalConfig externalConfig, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return z;
        }
    }
}
