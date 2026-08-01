package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4832s implements r {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11062a;

    public C4832s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11062a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r
    public boolean a(String uri) {
        boolean b2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        b2 = C4833t.b(this.f11062a, uri);
        return b2;
    }
}
