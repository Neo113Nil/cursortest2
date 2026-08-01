package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class w {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final List<C4864a> f11325a;
    public final String b;
    public final String c;

    public w(List<C4864a> ads, String str, String str2) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.f11325a = ads;
        this.b = str;
        this.c = str2;
    }

    public final List<C4864a> a() {
        return this.f11325a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
