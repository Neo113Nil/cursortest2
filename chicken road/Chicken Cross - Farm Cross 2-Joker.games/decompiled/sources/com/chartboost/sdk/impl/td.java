package com.chartboost.sdk.impl;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public abstract class td {

    public static final class a implements Function1 {
        public final /* synthetic */ Call b;

        public a(Call call) {
            this.b = call;
        }

        public final void a(Throwable th) {
            this.b.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f5015a;

        public b(CancellableContinuation cancellableContinuation) {
            this.f5015a = cancellableContinuation;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.f5015a.isActive()) {
                CancellableContinuation cancellableContinuation = this.f5015a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(e)));
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!this.f5015a.isActive()) {
                response.close();
                return;
            }
            CancellableContinuation cancellableContinuation = this.f5015a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m8079constructorimpl(response));
        }
    }

    public static final Object a(OkHttpClient okHttpClient, Request request, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Call newCall = okHttpClient.newCall(request);
        cancellableContinuationImpl.invokeOnCancellation(new a(newCall));
        newCall.enqueue(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
