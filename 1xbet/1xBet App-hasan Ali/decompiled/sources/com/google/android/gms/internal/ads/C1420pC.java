package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420pC extends Lv {

    /* renamed from: l, reason: collision with root package name */
    public final C1465qC f14974l;

    /* renamed from: m, reason: collision with root package name */
    public Lv f14975m;

    public C1420pC(C1509rC c1509rC) {
        super(1);
        this.f14974l = new C1465qC(c1509rC);
        this.f14975m = b();
    }

    @Override // com.google.android.gms.internal.ads.Lv
    public final byte a() {
        Lv lv = this.f14975m;
        if (lv == null) {
            throw new NoSuchElementException();
        }
        byte a5 = lv.a();
        if (!this.f14975m.hasNext()) {
            this.f14975m = b();
        }
        return a5;
    }

    public final C1643uB b() {
        C1465qC c1465qC = this.f14974l;
        if (c1465qC.hasNext()) {
            return new C1643uB(c1465qC.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14975m != null;
    }
}
