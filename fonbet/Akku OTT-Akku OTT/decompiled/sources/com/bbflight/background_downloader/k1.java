package com.bbflight.background_downloader;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$doTask$2", f = "TaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
public final class k1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super URLConnection>, Object> {
    public final /* synthetic */ URL a;
    public final /* synthetic */ Proxy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(URL url, Proxy proxy, Continuation<? super k1> continuation) {
        super(2, continuation);
        this.a = url;
        this.b = proxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new k1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super URLConnection> continuation) {
        return ((k1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Proxy proxy = this.b;
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        return this.a.openConnection(proxy);
    }
}
