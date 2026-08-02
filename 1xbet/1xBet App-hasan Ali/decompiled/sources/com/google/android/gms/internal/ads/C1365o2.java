package com.google.android.gms.internal.ads;

import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365o2 {

    /* renamed from: a, reason: collision with root package name */
    public String f14746a;

    /* renamed from: b, reason: collision with root package name */
    public int f14747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14748c;

    /* renamed from: d, reason: collision with root package name */
    public int f14749d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14750e;

    /* renamed from: k, reason: collision with root package name */
    public float f14754k;

    /* renamed from: l, reason: collision with root package name */
    public String f14755l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f14758o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f14759p;

    /* renamed from: r, reason: collision with root package name */
    public C1140j2 f14761r;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f14751g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f14752h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f14753j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f14756m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14757n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f14760q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f14762s = Float.MAX_VALUE;

    public final String a() {
        return this.f14755l;
    }

    public final void b(C1365o2 c1365o2) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1365o2 != null) {
            if (!this.f14748c && c1365o2.f14748c) {
                this.f14747b = c1365o2.f14747b;
                this.f14748c = true;
            }
            if (this.f14752h == -1) {
                this.f14752h = c1365o2.f14752h;
            }
            if (this.i == -1) {
                this.i = c1365o2.i;
            }
            if (this.f14746a == null && (str = c1365o2.f14746a) != null) {
                this.f14746a = str;
            }
            if (this.f == -1) {
                this.f = c1365o2.f;
            }
            if (this.f14751g == -1) {
                this.f14751g = c1365o2.f14751g;
            }
            if (this.f14757n == -1) {
                this.f14757n = c1365o2.f14757n;
            }
            if (this.f14758o == null && (alignment2 = c1365o2.f14758o) != null) {
                this.f14758o = alignment2;
            }
            if (this.f14759p == null && (alignment = c1365o2.f14759p) != null) {
                this.f14759p = alignment;
            }
            if (this.f14760q == -1) {
                this.f14760q = c1365o2.f14760q;
            }
            if (this.f14753j == -1) {
                this.f14753j = c1365o2.f14753j;
                this.f14754k = c1365o2.f14754k;
            }
            if (this.f14761r == null) {
                this.f14761r = c1365o2.f14761r;
            }
            if (this.f14762s == Float.MAX_VALUE) {
                this.f14762s = c1365o2.f14762s;
            }
            if (!this.f14750e && c1365o2.f14750e) {
                this.f14749d = c1365o2.f14749d;
                this.f14750e = true;
            }
            if (this.f14756m != -1 || (i = c1365o2.f14756m) == -1) {
                return;
            }
            this.f14756m = i;
        }
    }
}
