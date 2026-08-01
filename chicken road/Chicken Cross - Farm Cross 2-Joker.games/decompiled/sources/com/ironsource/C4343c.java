package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4343c implements InterfaceC4367d5<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final V5 f8105a;
    private final String b;
    private final InterfaceC4691v7 c;
    private final Function1<Result<? extends JSONObject>, Unit> d;
    private C4710w8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4343c(V5 fileUrl, String destinationPath, InterfaceC4691v7 downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f8105a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C4710w8(c(), U3.i);
    }

    @Override // com.ironsource.Nc
    public void a(C4710w8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), U3.i)) {
            try {
                JSONObject c = c(file);
                Function1<Result<? extends JSONObject>, Unit> i = i();
                Result.Companion companion = Result.INSTANCE;
                i.invoke(Result.m8078boximpl(Result.m8079constructorimpl(c)));
            } catch (Exception e) {
                C4491k4.d().a(e);
                Function1<Result<? extends JSONObject>, Unit> i2 = i();
                Result.Companion companion2 = Result.INSTANCE;
                i2.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(e))));
            }
        }
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
        return this.f8105a;
    }

    @Override // com.ironsource.InterfaceC4367d5
    public Function1<Result<? extends JSONObject>, Unit> i() {
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

    private final JSONObject c(C4710w8 c4710w8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c4710w8));
    }

    @Override // com.ironsource.Nc
    public void a(C4710w8 c4710w8, C4549n8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }
}
