package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4402f4 implements InterfaceC4367d5<C4710w8> {

    /* renamed from: a, reason: collision with root package name */
    private final V5 f8191a;
    private final String b;
    private final InterfaceC4691v7 c;
    private final Function1<Result<? extends C4710w8>, Unit> d;
    private C4710w8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4402f4(V5 fileUrl, String destinationPath, InterfaceC4691v7 downloadManager, Function1<? super Result<? extends C4710w8>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f8191a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C4710w8(c());
    }

    @Override // com.ironsource.Nc
    public void a(C4710w8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Function1<Result<? extends C4710w8>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m8078boximpl(Result.m8079constructorimpl(file)));
    }

    @Override // com.ironsource.InterfaceC4367d5
    public void b(C4710w8 c4710w8) {
        Intrinsics.checkNotNullParameter(c4710w8, "<set-?>");
        this.e = c4710w8;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public V5 d() {
        return this.f8191a;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public Function1<Result<? extends C4710w8>, Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public C4710w8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public InterfaceC4691v7 l() {
        return this.c;
    }

    @Override // com.ironsource.Nc
    public void a(C4710w8 c4710w8, C4549n8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C4710w8>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
