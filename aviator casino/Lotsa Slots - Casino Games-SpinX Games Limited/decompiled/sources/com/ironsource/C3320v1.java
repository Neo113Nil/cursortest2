package com.ironsource;

/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3320v1 {

    /* renamed from: com.ironsource.v1$a */
    public static final class a implements android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.Continuation<kotlin.Unit> f6770a;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            this.f6770a = continuation;
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.f6770a;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(error)));
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object obj) {
            kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.f6770a;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    public static final android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new com.ironsource.C3320v1.a(continuation);
    }
}
