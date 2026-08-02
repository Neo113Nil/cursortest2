package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1775x8 extends D8 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f16229s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f16230t;

    /* renamed from: k, reason: collision with root package name */
    public final String f16231k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16232l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f16233m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16234n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16235o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16236p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16237q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16238r;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f16229s = Color.rgb(204, 204, 204);
        f16230t = rgb;
    }

    public BinderC1775x8(String str, List list, Integer num, Integer num2, Integer num3, int i, int i5) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f16232l = new ArrayList();
        this.f16233m = new ArrayList();
        this.f16231k = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            BinderC1865z8 binderC1865z8 = (BinderC1865z8) list.get(i6);
            this.f16232l.add(binderC1865z8);
            this.f16233m.add(binderC1865z8);
        }
        this.f16234n = num != null ? num.intValue() : f16229s;
        this.f16235o = num2 != null ? num2.intValue() : f16230t;
        this.f16236p = num3 != null ? num3.intValue() : 12;
        this.f16237q = i;
        this.f16238r = i5;
    }

    @Override // com.google.android.gms.internal.ads.E8
    public final String f() {
        return this.f16231k;
    }

    @Override // com.google.android.gms.internal.ads.E8
    public final ArrayList g() {
        return this.f16233m;
    }
}
