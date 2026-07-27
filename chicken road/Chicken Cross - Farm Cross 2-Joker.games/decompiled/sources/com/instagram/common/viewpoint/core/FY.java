package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network/classes2.dex */
public final class FY extends RK implements InterfaceC2478Yo {
    public C2194Ng A00;
    public AbstractC2874fo A01;
    public C2875fp A02;
    public C2875fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C2930gi A09;
    public final AnonymousClass67 A0A;

    public FY(AnonymousClass67 anonymousClass67, SparseBooleanArray sparseBooleanArray, C2875fp c2875fp, int i, int i2, int i3, int i4, C2930gi c2930gi, C2194Ng c2194Ng) {
        super(anonymousClass67);
        this.A09 = c2930gi;
        this.A0A = anonymousClass67;
        this.A08 = sparseBooleanArray;
        this.A02 = c2875fp;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c2194Ng;
    }

    private void A05(VA va, Y2 y2, String str, C2768e5 c2768e5) {
        if (this.A08.get(c2768e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1985Fc(this, str, c2768e5, va, c2768e5.A04(), y2);
        this.A03 = new C2875fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new FZ(this, c2768e5));
    }

    public final ViewOnClickListenerC2128Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C2768e5 c2768e5, VA va, C2336Sx c2336Sx, Y2 y2, String str) {
        int A02 = c2768e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c2768e5.A03().A0H().A08();
        String A09 = c2768e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c2336Sx.A0T(A09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c2768e5.A03().A0I().A0G(), c2768e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c2768e5.A03().A0J(), c2768e5.A04());
        this.A0A.A1Y(c2768e5.A04());
        A05(va, y2, str, c2768e5);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2478Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
