package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4361d implements V5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4339bd f8118a;

    public C4361d(C4339bd folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f8118a = folderRootUrl;
    }

    @Override // com.ironsource.V5
    public String value() {
        return this.f8118a.a() + "/abTestMap.json";
    }
}
