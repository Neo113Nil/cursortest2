package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F4 extends QC<C0407Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0883Xm A04;
    public InterfaceC0884Xn A05;
    public String A06;
    public List<C1120cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1428hy A0A;
    public final SF A0B;
    public final C1153dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C1226eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C1153dL c1153dL, List<C1120cn> list, AbstractC1428hy abstractC1428hy, US us, SF sf, C1226eX c1226eX, XH xh, InterfaceC0884Xn interfaceC0884Xn, String str, int i, int i2, int i3, int i4, FH fh, AbstractC0883Xm abstractC0883Xm) {
        this.A0C = c1153dL;
        this.A0D = us;
        this.A0B = sf;
        this.A0G = c1226eX;
        this.A0E = xh;
        this.A05 = interfaceC0884Xn;
        this.A0A = abstractC1428hy;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = fh;
        this.A04 = abstractC0883Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0407Ev A0F(ViewGroup viewGroup, int i) {
        return new C0407Ev(AbstractC1050bf.A00(new C0990ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0407Ev c0407Ev, int i) {
        c0407Ev.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            c0407Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
