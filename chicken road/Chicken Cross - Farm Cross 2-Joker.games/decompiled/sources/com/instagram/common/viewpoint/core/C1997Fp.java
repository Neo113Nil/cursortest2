package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1997Fp extends AbstractC2278Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC2465Yb A04;
    public InterfaceC2471Yh A05;
    public String A06;
    public List<C2768e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC3095jd A0A;
    public final C2336Sx A0B;
    public final C2930gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C2006Fy A0F;
    public final C2875fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1997Fp(C2930gi c2930gi, List<C2768e5> list, AbstractC3095jd abstractC3095jd, VA va, C2336Sx c2336Sx, C2875fp c2875fp, Y2 y2, InterfaceC2471Yh interfaceC2471Yh, String str, int i, int i2, int i3, int i4, C2006Fy c2006Fy, AbstractC2465Yb abstractC2465Yb) {
        this.A0C = c2930gi;
        this.A0D = va;
        this.A0B = c2336Sx;
        this.A0G = c2875fp;
        this.A0E = y2;
        this.A05 = interfaceC2471Yh;
        this.A0A = abstractC3095jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c2006Fy;
        this.A04 = abstractC2465Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC2278Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC2700cy.A00(new C2646c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC2278Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2278Qq
    public final int A0B() {
        return this.A07.size();
    }
}
