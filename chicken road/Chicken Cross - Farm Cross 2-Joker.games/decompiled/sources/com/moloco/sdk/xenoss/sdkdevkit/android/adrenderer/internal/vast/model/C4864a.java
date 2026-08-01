package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4864a {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f11303a;
    public final Integer b;
    public final AbstractC4865b c;

    public C4864a(String str, Integer num, AbstractC4865b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f11303a = str;
        this.b = num;
        this.c = child;
    }

    public final AbstractC4865b a() {
        return this.c;
    }

    public final String b() {
        return this.f11303a;
    }

    public final Integer c() {
        return this.b;
    }
}
