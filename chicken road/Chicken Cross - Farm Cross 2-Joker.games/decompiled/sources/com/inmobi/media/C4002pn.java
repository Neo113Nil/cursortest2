package com.inmobi.media;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4002pn implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f7312a;

    public C4002pn(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f7312a = cancellableContinuationImpl;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "e");
        CancellableContinuationImpl cancellableContinuationImpl = this.f7312a;
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        if (cancellableContinuationImpl.isActive()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(t)));
            } catch (Exception unused) {
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC4012q5.a(this.f7312a, response);
    }
}
