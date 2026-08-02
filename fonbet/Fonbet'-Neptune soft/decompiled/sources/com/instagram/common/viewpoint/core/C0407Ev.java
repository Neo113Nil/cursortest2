package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0407Ev extends AbstractC0700Qg implements InterfaceC0891Xu {
    public N3 A00;
    public AbstractC1225eW A01;
    public C1226eX A02;
    public C1226eX A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1153dL A09;
    public final C5Q A0A;

    public C0407Ev(C5Q c5q, SparseBooleanArray sparseBooleanArray, C1226eX c1226eX, int i, int i2, int i3, int i4, C1153dL c1153dL, N3 n3) {
        super(c5q);
        this.A09 = c1153dL;
        this.A0A = c5q;
        this.A08 = sparseBooleanArray;
        this.A02 = c1226eX;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = n3;
    }

    private void A05(US us, XH xh, String str, C1120cn c1120cn) {
        if (this.A08.get(c1120cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C0409Ex(this, str, c1120cn, us, c1120cn.A04(), xh);
        this.A03 = new C1226eX(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C0408Ew(this, c1120cn));
    }

    public final KE A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C1120cn c1120cn, US us, SF sf, XH xh, String str) {
        int A02 = c1120cn.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1120cn.A03().A0H().A08();
        String A09 = c1120cn.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A0A.A1T()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(sf.A0T(A09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1120cn.A03().A0I().A0F(), c1120cn.A03().A0I().A04());
        this.A0A.setCTAInfo(c1120cn.A03().A0J(), c1120cn.A04());
        this.A0A.A1W(c1120cn.A04());
        A05(us, xh, str, c1120cn);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xu
    public final void AIV() {
        this.A0A.A1O();
    }
}
