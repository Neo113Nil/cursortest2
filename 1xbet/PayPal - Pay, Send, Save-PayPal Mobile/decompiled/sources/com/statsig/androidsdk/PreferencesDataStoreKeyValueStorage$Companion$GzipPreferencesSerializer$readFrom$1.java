package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer", f = "KeyValueStorage.kt", i = {0}, l = {324}, m = "readFrom", n = {"decompressedStream"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.GzipPreferencesSerializer this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readFrom(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.GzipPreferencesSerializer gzipPreferencesSerializer, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$GzipPreferencesSerializer$readFrom$1> continuation) {
        super(continuation);
        this.this$0 = gzipPreferencesSerializer;
    }
}
