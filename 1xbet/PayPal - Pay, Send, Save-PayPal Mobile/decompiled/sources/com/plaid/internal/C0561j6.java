package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$setSubmissionData$2", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0561j6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.P5 f6453a;
    public final /* synthetic */ com.plaid.link.SubmissionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561j6(com.plaid.internal.P5 p5, com.plaid.link.SubmissionData submissionData, kotlin.coroutines.Continuation<? super com.plaid.internal.C0561j6> continuation) {
        super(2, continuation);
        this.f6453a = p5;
        this.b = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0561j6(this.f6453a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0561j6(this.f6453a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f6453a.a(this.b.getPhoneNumber(), this.b.getDateOfBirth(), this.b.getParams());
        return kotlin.Unit.INSTANCE;
    }
}
