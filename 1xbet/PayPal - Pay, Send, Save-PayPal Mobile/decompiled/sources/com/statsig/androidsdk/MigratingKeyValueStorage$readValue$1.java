package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.MigratingKeyValueStorage", f = "KeyValueStorage.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5}, l = {176, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 181, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 183, 186}, m = "readValue", n = {"this", "storeName", "key", "this", "storeName", "key", "primaryValue", "this", "storeName", "key", "this", "storeName", "key", "legacyValue", "this", "storeName", "legacyValue", "legacyValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes16.dex */
final class MigratingKeyValueStorage$readValue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.MigratingKeyValueStorage<T> this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readValue(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MigratingKeyValueStorage$readValue$1(com.statsig.androidsdk.MigratingKeyValueStorage<T> migratingKeyValueStorage, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.MigratingKeyValueStorage$readValue$1> continuation) {
        super(continuation);
        this.this$0 = migratingKeyValueStorage;
    }
}
