package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer", f = "KeyValueStorage.kt", i = {0}, l = {349}, m = "writeTo", n = {"buffered"}, s = {"L$1"})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeTo2((androidx.content.preferences.core.Preferences) null, (java.io.OutputStream) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.Companion.BufferedPreferencesSerializer bufferedPreferencesSerializer, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$BufferedPreferencesSerializer$writeTo$1> continuation) {
        super(continuation);
        this.this$0 = bufferedPreferencesSerializer;
    }
}
