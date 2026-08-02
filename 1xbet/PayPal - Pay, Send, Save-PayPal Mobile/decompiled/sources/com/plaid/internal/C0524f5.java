package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$loadData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0524f5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0551i5 f6410a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0524f5(com.plaid.internal.C0551i5 c0551i5, java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.C0524f5> continuation) {
        super(2, continuation);
        this.f6410a = c0551i5;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0524f5(this.f6410a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return new com.plaid.internal.C0524f5(this.f6410a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.io.File file = this.f6410a.f6442a;
        java.lang.String str = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(file, str);
        if (!file2.exists()) {
            file2.createNewFile();
        }
        return kotlin.io.FilesKt.readText$default(file2, null, 1, null);
    }
}
