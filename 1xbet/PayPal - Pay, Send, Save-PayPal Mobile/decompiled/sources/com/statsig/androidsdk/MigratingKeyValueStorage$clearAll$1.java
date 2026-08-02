package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.MigratingKeyValueStorage", f = "KeyValueStorage.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125, 130}, m = "clearAll", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class MigratingKeyValueStorage$clearAll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.MigratingKeyValueStorage<T> this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearAll(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MigratingKeyValueStorage$clearAll$1(com.statsig.androidsdk.MigratingKeyValueStorage<T> migratingKeyValueStorage, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.MigratingKeyValueStorage$clearAll$1> continuation) {
        super(continuation);
        this.this$0 = migratingKeyValueStorage;
    }
}
