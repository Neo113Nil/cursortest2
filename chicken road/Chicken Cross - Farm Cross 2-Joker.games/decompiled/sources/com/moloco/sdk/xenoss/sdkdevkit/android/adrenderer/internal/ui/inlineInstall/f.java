package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class f implements k {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final r f11162a;

    public f(r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f11162a = externalLinkHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f11162a.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void b(String str) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void c(String str) {
    }
}
