package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class U4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.W4 f5938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(com.plaid.internal.W4 w4, kotlin.coroutines.Continuation<? super com.plaid.internal.U4> continuation) {
        super(2, continuation);
        this.f5938a = w4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.U4(this.f5938a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return new com.plaid.internal.U4(this.f5938a, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.H5 h5 = this.f5938a.f5963a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "");
        java.io.File filesDir = h5.f5800a.getFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filesDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "");
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        java.io.File file = new java.io.File(filesDir, "plaid_no_loading_ui");
        if (!file.exists()) {
            file.createNewFile();
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.jvm.internal.Intrinsics.areEqual(kotlin.io.FilesKt.readText$default(file, null, 1, null), "true"));
    }
}
