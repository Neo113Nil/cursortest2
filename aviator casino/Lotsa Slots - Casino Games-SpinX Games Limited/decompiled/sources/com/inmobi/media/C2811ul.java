package com.inmobi.media;

/* renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2811ul implements okhttp3.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl f5492a;

    public C2811ul(kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl) {
        this.f5492a = cancellableContinuationImpl;
    }

    @Override // okhttp3.Callback
    public final void onFailure(okhttp3.Call call, java.io.IOException t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "e");
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = this.f5492a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        if (cancellableContinuationImpl.isActive()) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(t)));
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        com.inmobi.media.T4.a(this.f5492a, response);
    }
}
