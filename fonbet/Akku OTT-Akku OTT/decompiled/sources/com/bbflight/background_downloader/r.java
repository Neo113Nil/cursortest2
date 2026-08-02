package com.bbflight.background_downloader;

import java.net.URLDecoder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$methodEnqueue$2", f = "BDPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
public final class r extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super String>, Object> {
    public final /* synthetic */ M0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(M0 m0, Continuation<? super r> continuation) {
        super(2, continuation);
        this.a = m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new r(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super String> continuation) {
        return ((r) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return URLDecoder.decode(this.a.b, "UTF-8");
    }
}
