package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630Kg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10205a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f10206b;

    /* renamed from: c, reason: collision with root package name */
    public final C1745wf f10207c;

    /* renamed from: d, reason: collision with root package name */
    public final C1119ih f10208d;

    /* renamed from: e, reason: collision with root package name */
    public final Hh f10209e;

    public C0630Kg(CD cd, C1745wf c1745wf, C1119ih c1119ih, Hh hh) {
        this.f10206b = cd;
        this.f10207c = c1745wf;
        this.f10208d = c1119ih;
        this.f10209e = hh;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f10205a) {
            case 0:
                return new Si(new C0602Gg((Context) this.f10206b.d(), this.f10207c.a(), this.f10208d.a(), this.f10209e.a(), 0), AbstractC0613Id.f9544g);
            default:
                return new Si(new C0602Gg((Context) this.f10206b.d(), this.f10207c.a(), this.f10208d.a(), this.f10209e.a(), 1), AbstractC0613Id.f9544g);
        }
    }

    public C0630Kg(m2.g gVar, CD cd, C1745wf c1745wf, C1119ih c1119ih, Hh hh) {
        this.f10206b = cd;
        this.f10207c = c1745wf;
        this.f10208d = c1119ih;
        this.f10209e = hh;
    }
}
