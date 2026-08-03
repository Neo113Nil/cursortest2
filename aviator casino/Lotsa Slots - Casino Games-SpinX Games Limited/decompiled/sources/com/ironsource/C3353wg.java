package com.ironsource;

/* renamed from: com.ironsource.wg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3353wg implements com.ironsource.W5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C2992cd f6810a;
    private final java.lang.String b;

    public C3353wg(com.ironsource.C2992cd folderRootUrl, java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        this.f6810a = folderRootUrl;
        this.b = version;
    }

    public final java.lang.String a() {
        return this.b;
    }

    @Override // com.ironsource.W5
    public java.lang.String value() {
        return this.f6810a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
