package com.ironsource;

/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2996d implements com.ironsource.W5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C2992cd f6193a;

    public C2996d(com.ironsource.C2992cd folderRootUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f6193a = folderRootUrl;
    }

    @Override // com.ironsource.W5
    public java.lang.String value() {
        return this.f6193a.a() + "/abTestMap.json";
    }
}
