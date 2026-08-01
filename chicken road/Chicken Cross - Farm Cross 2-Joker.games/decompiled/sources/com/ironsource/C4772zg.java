package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4772zg implements V5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4339bd f8802a;
    private final String b;

    public C4772zg(C4339bd folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f8802a = folderRootUrl;
        this.b = version;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.V5
    public String value() {
        return this.f8802a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
