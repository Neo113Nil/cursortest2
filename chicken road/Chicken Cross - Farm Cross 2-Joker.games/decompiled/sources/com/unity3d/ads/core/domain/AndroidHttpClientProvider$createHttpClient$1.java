package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidHttpClientProvider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", i = {0, 0}, l = {68}, m = "createHttpClient", n = {"selectedHttpClient", "startTime"}, s = {"L$0", "J$0"})
/* loaded from: classes7.dex */
final class AndroidHttpClientProvider$createHttpClient$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClientProvider$createHttpClient$1(AndroidHttpClientProvider androidHttpClientProvider, Continuation<? super AndroidHttpClientProvider$createHttpClient$1> continuation) {
        super(continuation);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createHttpClient;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createHttpClient = this.this$0.createHttpClient(this);
        return createHttpClient;
    }
}
