package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.MigratingKeyValueStorage", f = "KeyValueStorage.kt", i = {0, 0, 0}, l = {192, 193}, m = "removeValue", n = {"this", "storeName", "key"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes16.dex */
final class MigratingKeyValueStorage$removeValue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.MigratingKeyValueStorage<T> this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeValue(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MigratingKeyValueStorage$removeValue$1(com.statsig.androidsdk.MigratingKeyValueStorage<T> migratingKeyValueStorage, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.MigratingKeyValueStorage$removeValue$1> continuation) {
        super(continuation);
        this.this$0 = migratingKeyValueStorage;
    }
}
