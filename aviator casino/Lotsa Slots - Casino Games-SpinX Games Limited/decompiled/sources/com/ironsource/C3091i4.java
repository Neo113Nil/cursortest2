package com.ironsource;

/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3091i4 implements com.ironsource.InterfaceC3038f5<com.ironsource.C3381y8> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.W5 f6306a;
    private final java.lang.String b;
    private final com.ironsource.InterfaceC3380y7 c;
    private final kotlin.jvm.functions.Function1<kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> d;
    private com.ironsource.C3381y8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3091i4(com.ironsource.W5 fileUrl, java.lang.String destinationPath, com.ironsource.InterfaceC3380y7 downloadManager, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> onFinish) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f6306a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new com.ironsource.C3381y8(c());
    }

    @Override // com.ironsource.Nc
    public void a(com.ironsource.C3381y8 file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.functions.Function1<kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> i = i();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        i.invoke(kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC3038f5
    public void b(com.ironsource.C3381y8 c3381y8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3381y8, "<set-?>");
        this.e = c3381y8;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public java.lang.String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public com.ironsource.W5 d() {
        return this.f6306a;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public kotlin.jvm.functions.Function1<kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public /* synthetic */ boolean j() {
        boolean exists;
        exists = k().exists();
        return exists;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public com.ironsource.C3381y8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public com.ironsource.InterfaceC3380y7 l() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3038f5
    public /* synthetic */ void m() {
        com.ironsource.InterfaceC3038f5.CC.$default$m(this);
    }

    @Override // com.ironsource.Nc
    public void a(com.ironsource.C3381y8 c3381y8, com.ironsource.C3220p8 error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.functions.Function1<kotlin.Result<? extends com.ironsource.C3381y8>, kotlin.Unit> i = i();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        i.invoke(kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
