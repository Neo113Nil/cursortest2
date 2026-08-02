package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/statsig/androidsdk/KeyValueStorage;", "", "storeName", "key", "readValueSync", "(Lcom/statsig/androidsdk/KeyValueStorage;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyValueStorageKt {
    @kotlin.Deprecated(message = "Exists for migrating legacy sync behavior only - prefer readValue()")
    public static final <T> T readValueSync(com.statsig.androidsdk.KeyValueStorage<T> keyValueStorage, java.lang.String str, java.lang.String str2) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.statsig.androidsdk.KeyValueStorageKt$readValueSync$1(keyValueStorage, str, str2, null), 1, null);
        return (T) runBlocking$default;
    }
}
