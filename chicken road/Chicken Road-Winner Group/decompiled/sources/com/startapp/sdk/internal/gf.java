package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f3765a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3767c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3768d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f3769e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3770g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3771h;

    public gf(z2 z2Var, ArrayList arrayList, int i3, int[] iArr, Integer num, Integer num2, int i4, int i5) {
        this.f3765a = z2Var;
        this.f3766b = arrayList;
        this.f3767c = i3;
        this.f3768d = iArr;
        this.f3769e = num;
        this.f = num2;
        this.f3770g = i4;
        this.f3771h = i5;
    }

    public final boolean a(int i3) {
        return (i3 & this.f3771h) != 0;
    }
}
