package com.plaid.internal;

/* renamed from: com.plaid.internal.m7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0589m7 extends androidx.view.result.contract.ActivityResultContract<kotlin.Unit, android.net.Uri> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0551i5 f6497a;
    public final androidx.activity.result.contract.ActivityResultContracts.TakePicture b;
    public final java.util.concurrent.atomic.AtomicReference<android.net.Uri> c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", f = "TakePictureWithAppInternalUri.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.m7$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.io.File>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6498a;

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.C0589m7.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0589m7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
            return com.plaid.internal.C0589m7.this.new a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6498a;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0551i5 c0551i5 = com.plaid.internal.C0589m7.this.f6497a;
            java.lang.String valueOf = java.lang.String.valueOf(java.util.UUID.randomUUID());
            this.f6498a = 1;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0506d5(c0551i5, valueOf, null), this);
            return withContext == coroutine_suspended ? coroutine_suspended : withContext;
        }
    }

    public C0589m7(com.plaid.internal.C0551i5 c0551i5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0551i5, "");
        this.f6497a = c0551i5;
        this.b = new androidx.activity.result.contract.ActivityResultContracts.TakePicture();
        this.c = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public final android.net.Uri a(android.content.Context context) {
        java.lang.Object runBlocking$default;
        try {
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.plaid.internal.C0589m7.a(null), 1, null);
            java.lang.String packageName = context.getPackageName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(packageName);
            sb.append(".com.plaid.link.internal.PlaidFileProvider");
            android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), (java.io.File) runBlocking$default);
            kotlin.jvm.internal.Intrinsics.checkNotNull(uriForFile);
            return uriForFile;
        } catch (java.io.IOException e) {
            com.plaid.internal.Y6.a.a(e, "TakePictureWithAppInternalUri - Unable to create file");
            android.net.Uri uri = android.net.Uri.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNull(uri);
            return uri;
        }
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final android.content.Intent createIntent(android.content.Context context, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        android.net.Uri a2 = a(context);
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.c, null, a2)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI was already set", "");
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "TakePictureWithAppInternalUri - Result URI was already set");
            com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
            if (j5 != null) {
                j5.a("TakePictureWithAppInternalUri - Result URI was already set");
            }
        }
        android.content.Intent createIntent = this.b.createIntent(context, a2);
        createIntent.addFlags(2);
        return createIntent;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return null;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final android.net.Uri parseResult(int i, android.content.Intent intent) {
        if (i != -1) {
            android.net.Uri uri = android.net.Uri.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "");
            return uri;
        }
        android.net.Uri andSet = this.c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI should not be null", "");
        com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "TakePictureWithAppInternalUri - Result URI should not be null");
        com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
        if (j5 != null) {
            j5.a("TakePictureWithAppInternalUri - Result URI should not be null");
        }
        android.net.Uri uri2 = android.net.Uri.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNull(uri2);
        return uri2;
    }
}
