package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final r8 f4675a;
    public final j1 b;
    public final String c;

    public a9(r8 googleAdvertisingId, j1 amazonAdvertisingId, String manufacturer) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.checkNotNullParameter(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        this.f4675a = googleAdvertisingId;
        this.b = amazonAdvertisingId;
        this.c = manufacturer;
    }

    public final h1 a() {
        try {
            return b() ? this.b.b() : this.f4675a.b();
        } catch (Exception e) {
            mb.b("getAdvertisingId error", e);
            return new h1(ni.c, "");
        }
    }

    public final boolean b() {
        return StringsKt.equals("Amazon", this.c, true);
    }

    public /* synthetic */ a9(r8 r8Var, j1 j1Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8Var, j1Var, (i & 4) != 0 ? Build.MANUFACTURER : str);
    }

    public final String a(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a2 = k6.a(context, z);
        Intrinsics.checkNotNullExpressionValue(a2, "getUniqueId(...)");
        return a2;
    }
}
