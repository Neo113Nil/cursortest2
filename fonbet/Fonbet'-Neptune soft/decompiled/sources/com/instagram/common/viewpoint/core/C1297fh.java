package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.fh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1297fh extends R8 implements MediaViewApi, Repairable, SM {
    public static byte[] A0E;
    public static String[] A0F = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1153dL A07;
    public C0L A08;
    public C0934Zl A09;
    public C5G A0A;
    public C1129cw A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
            i4++;
        }
    }

    public static void A08() {
        A0E = new byte[]{-61, -31, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, -31, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, 39, 44, 40, 49, 38, 40, 17, 40, 55, 58, 50, 53, 46, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, Ascii.GS, 17, Ascii.ETB, Ascii.NAK, -48, 34, Ascii.NAK, Ascii.RS, Ascii.DC4, Ascii.NAK, 34, Ascii.NAK, 34, -48, Ascii.GS, 37, 35, 36, -48, Ascii.DC2, Ascii.NAK, -48, 35, Ascii.NAK, 36, -48, Ascii.DC2, Ascii.NAK, Ascii.SYN, Ascii.US, 34, Ascii.NAK, -48, Ascii.RS, 17, 36, Ascii.EM, 38, Ascii.NAK, -14, 17, Ascii.RS, Ascii.RS, Ascii.NAK, 34, -15, Ascii.DC4, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, -39, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        if (this.A0A != null) {
            this.A0A.setVisibility(8);
            P3.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            if (this.A01 != null) {
                XP.A0H(this.A08);
            }
            float f = AbstractC0856Wl.A02;
            float density = 4.0f * f;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 54));
    }

    private void A07() {
        EnumC0861Wq.A04(this.A03, EnumC0861Wq.A0B);
        EnumC0861Wq.A04(this.A09, EnumC0861Wq.A0B);
        EnumC0861Wq.A04(this.A05, EnumC0861Wq.A0B);
        EnumC0861Wq.A04(this.A01, EnumC0861Wq.A0B);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, C0696Qc c0696Qc) {
        if (this.A0B != null) {
            this.A03.removeView(this.A0B);
        }
        if (!c0696Qc.A1g()) {
            return;
        }
        String A1D = c0696Qc.A1D();
        if (this.A03.getContext() == null) {
            return;
        }
        this.A0B = AbstractC1128cv.A01(this.A07, A1D);
        if (this.A0B != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
            A09(this.A0B, layoutParams);
            this.A06.bringChildToFront(this.A0B);
        }
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                XP.A0H(this.A02);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(XP.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 102));
    }

    private final void A0C(C1153dL c1153dL, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1153dL, attributeSet, i, i2));
        A0H(new C0934Zl(c1153dL, attributeSet, i, i2));
        this.A08 = new C0L(c1153dL, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1153dL, attributeSet, i, i2));
        A07();
    }

    private final void A0D(C1153dL c1153dL, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1153dL, attributeSet, i));
        A0H(new C0934Zl(c1153dL, attributeSet, i));
        this.A08 = new C0L(c1153dL, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1153dL, attributeSet, i));
        A07();
    }

    private final void A0E(C1153dL c1153dL, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1153dL, attributeSet));
        A0H(new C0934Zl(c1153dL, attributeSet));
        this.A08 = new C0L(c1153dL, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1153dL, attributeSet));
        A07();
    }

    private final void A0F(C1153dL c1153dL, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1153dL));
        A0H(new C0934Zl(c1153dL));
        this.A08 = new C0L(c1153dL);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1153dL));
        A07();
    }

    private void A0G(C0696Qc c0696Qc, boolean z, C0811Up c0811Up) {
        KZ A04 = new KZ(this.A02, this.A07).A04();
        if (z) {
            A04.A06(new C1304fo(this, c0696Qc));
        }
        A04.A07(c0811Up.getUrl());
    }

    private void A0H(C0934Zl c0934Zl) {
        if (!this.A0D) {
            if (this.A09 != null) {
                this.A03.removeView(this.A09);
            }
            c0934Zl.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(c0934Zl, layoutParams);
            this.A09 = c0934Zl;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 57));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((RK) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        Iterator<NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0F[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return !TextUtils.isEmpty(((RK) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x02f1, code lost:
    
        if (r2.getAdCoverImage() != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02f3, code lost:
    
        new com.instagram.common.viewpoint.core.KZ(r17.A03, r17.A07).A05(r17.A03.getHeight(), r17.A03.getWidth()).A06(new com.instagram.common.viewpoint.core.C1300fk(r17, r2)).A07(r2.getAdCoverImage().getUrl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0324, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0326, code lost:
    
        android.util.Log.i(com.instagram.common.viewpoint.core.C1297fh.A0G, A04(292, 9, 49) + ((com.instagram.common.viewpoint.core.RK) r18.getNativeAdApi()).A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0350, code lost:
    
        A0A(r17.A05, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x037a, code lost:
    
        if (r2.getAdCoverImage() != null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0L(NativeAd nativeAd) {
        AbstractC1432i6 abstractC1432i6;
        ViewParent viewParent;
        C1153dL adObjectContext = ((C0696Qc) nativeAd.getInternalNativeAd()).A12();
        adObjectContext.A0O(this);
        this.A07.A0L(adObjectContext);
        this.A07.A0K(adObjectContext.A0F());
        this.A0D = true;
        C0696Qc A0L = C0696Qc.A0L(nativeAd.getInternalNativeAd());
        A0L.A1T(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (A0L.A10() != null && A0L.A10().A1Y()) {
            if (!TextUtils.isEmpty(A0L.A10().A20().A0H().A09())) {
                A0L.A12().A0F().AJ9(LT.A0A);
            } else {
                A0L.A12().A0F().AJ9(LT.A09);
            }
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof C0925Zc) {
                    ((C0925Zc) this.A01).A04();
                } else {
                    ((C02006g) this.A01).setAdapter(null);
                }
            }
            A01(false);
            this.A0A = new C5G(this.A07, this.A07.A0A(), new C1302fm(this, A0L, nativeAd), A0L.A10(), A04(261, 31, 13), 4, A0L.A1A());
            EnumC0861Wq.A04(this.A0A, EnumC0861Wq.A0B);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.A03.addView(this.A0A, layoutParams);
            this.A00 = this.A0A;
            bringChildToFront(this.A0A);
            this.A0A.setVisibility(0);
            A0A(this.A0A, A0L);
            A01(true);
            return;
        }
        if (A0I(nativeAd)) {
            A0L.A12().A0F().AJ9(LT.A04);
            boolean z = A0L.A18() == EnumC0814Us.A0B;
            if (!U7.A2n(this.A07) || z) {
                this.A01 = this.A08;
                ((C0L) this.A01).setCurrentPosition(0);
                ((C0L) this.A01).setShowTextInCarousel(z);
                if (z) {
                    final C1153dL c1153dL = this.A07;
                    final C0L c0l = (C0L) this.A01;
                    final List<C0696Qc> A1I = A0L.A1I();
                    final C0813Ur A17 = A0L.A17();
                    abstractC1432i6 = new AbstractC1432i6(c1153dL, c0l, A1I, A17) { // from class: com.facebook.ads.redexgen.X.7A
                        public final C1153dL A00;
                        public final C0813Ur A01;

                        {
                            super(c0l, A1I, c1153dL);
                            this.A00 = c1153dL;
                            this.A01 = A17 == null ? new C0813Ur() : A17;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.instagram.common.viewpoint.core.QC
                        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final OB A0F(ViewGroup viewGroup, int i) {
                            return new OB(new C0890Xt(this.A00, this.A01));
                        }

                        @Override // com.instagram.common.viewpoint.core.QC
                        /* renamed from: A0Q */
                        public final void A0K(OB ob, int i) {
                            super.A0K(ob, i);
                            C0890Xt c0890Xt = (C0890Xt) ob.A0p();
                            A0O(c0890Xt.getImageCardView(), i);
                            if (((AbstractC1432i6) this).A01.get(i) != null) {
                                c0890Xt.setTitle(((AbstractC1432i6) this).A01.get(i).getAdHeadline());
                                c0890Xt.setSubtitle(((AbstractC1432i6) this).A01.get(i).getAdLinkDescription());
                                c0890Xt.setButtonText(((AbstractC1432i6) this).A01.get(i).getAdCallToAction());
                            }
                            C0696Qc c0696Qc = ((AbstractC1432i6) this).A01.get(i);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c0890Xt);
                            c0696Qc.A1P(c0890Xt, c0890Xt, arrayList);
                        }
                    };
                } else {
                    final C0L c0l2 = (C0L) this.A01;
                    final List<C0696Qc> A1I2 = A0L.A1I();
                    final C1153dL c1153dL2 = this.A07;
                    abstractC1432i6 = new AbstractC1432i6(c0l2, A1I2, c1153dL2) { // from class: com.facebook.ads.redexgen.X.79
                        public final C1153dL A00;

                        {
                            this.A00 = c1153dL2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.instagram.common.viewpoint.core.QC
                        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final OB A0F(ViewGroup viewGroup, int i) {
                            return new OB(new C0896Xz(this.A00));
                        }

                        @Override // com.instagram.common.viewpoint.core.QC
                        /* renamed from: A0Q, reason: merged with bridge method [inline-methods] */
                        public final void A0K(OB ob, int i) {
                            super.A0K(ob, i);
                            C0896Xz c0896Xz = (C0896Xz) ob.A0p();
                            YM imageView = (YM) c0896Xz.getImageCardView();
                            imageView.setImageDrawable(null);
                            A0O(imageView, i);
                            C0696Qc childAd = ((AbstractC1432i6) this).A01.get(i);
                            childAd.A12().A0L(this.A00);
                            childAd.A1O(c0896Xz, c0896Xz);
                        }
                    };
                }
                abstractC1432i6.A0P(new C1301fl(this, A0L));
                ((C02006g) this.A01).setAdapter(abstractC1432i6);
            } else {
                A01(false);
                int width = this.A03.getWidth();
                if (width == 0) {
                    if (this.A03.getParent() instanceof ViewGroup) {
                        viewParent = this.A03.getParent();
                    } else {
                        viewParent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    while (width == 0 && viewGroup != null) {
                        width = viewGroup.getWidth();
                        boolean z2 = viewGroup.getParent() instanceof ViewGroup;
                        String[] strArr = A0F;
                        if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[6] = "X2xGJjQ8zu6cU8Eo";
                        strArr2[4] = "AZj2zr3QMe0wQwV9kynIxRcnRDB4X";
                        viewGroup = (ViewGroup) (z2 ? viewGroup.getParent() : null);
                    }
                }
                XP.A0H(this.A01);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                this.A01 = new C0925Zc(this.A07);
                this.A03.addView(this.A01, layoutParams2);
                ((C0925Zc) this.A01).A05(A0L, width);
                XP.A0I(this.A01);
                A01(true);
            }
            this.A00 = this.A01;
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A01);
            this.A01.setVisibility(0);
            A0A(this.A01, A0L);
            return;
        }
        boolean A0J = A0J(nativeAd);
        String[] strArr3 = A0F;
        if (strArr3[3].length() != strArr3[7].length()) {
            throw new RuntimeException();
        }
        A0F[5] = "QrlGDx1qLp0kN";
        if (A0J) {
            A0L.A12().A0F().AJ9(LT.A0D);
            A0L.A1e(this.A0C);
            this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof C0925Zc) {
                    ((C0925Zc) this.A01).A04();
                } else {
                    ((C02006g) this.A01).setAdapter(null);
                }
            }
            bringChildToFront(this.A05);
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A05;
            String[] strArr4 = A0F;
            if (strArr4[2].charAt(31) != strArr4[0].charAt(31)) {
                String[] strArr5 = A0F;
                strArr5[2] = "KRt7yuKunmEFowe58PEdTHnfFAzQvUNu";
                strArr5[0] = "FpiuEPXAVB8biFGx18DJjcPDa6TrT1Ju";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((RH) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
            } else {
                String[] strArr6 = A0F;
                strArr6[6] = "rknJE6EzKshvoL3E";
                strArr6[4] = "1VlRGSe6v9ZgAEzaXTE4MJVCDSD8V";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((RH) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
            }
        } else {
            if (nativeAd.getAdCoverImage() == null) {
                return;
            }
            A0L.A12().A0F().AJ9(LT.A0B);
            this.A00 = this.A09.getBodyImageView();
            A05();
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof C0925Zc) {
                    ((C0925Zc) this.A01).A04();
                } else {
                    ((C02006g) this.A01).setAdapter(null);
                }
            }
            bringChildToFront(this.A09);
            this.A09.setVisibility(0);
            new KZ(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1299fj(this, A0L)).A07(A0L.getAdCoverImage().getUrl());
            A0A(this.A09, A0L);
        }
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C1153dL A12 = ((C0696Qc) nativeAdBaseApi).A12();
        C1153dL adObjectContext = this.A07;
        adObjectContext.A0L(A12);
        A12.A0O(this);
        this.A0D = true;
        C0696Qc A0L = C0696Qc.A0L(nativeAdBaseApi);
        A0L.A1S(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof C0925Zc) {
                ((C0925Zc) this.A01).A04();
            } else {
                ((C02006g) this.A01).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        C0811Up adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            SF A11 = A0L.A11();
            if (A0F[1].charAt(7) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            Bitmap A0N = A11.A0N(adIcon.getUrl());
            if (A0N != null) {
                this.A02.setImageBitmap(A0N);
                if (z) {
                    this.A03.post(new C1305fp(this, A0L));
                }
            } else {
                A0G(A0L, z, adIcon);
            }
        } else {
            QQ A16 = A0L.A16();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A12.A0F().A3F(A0L.A0y(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A16 != null) {
                A16.ADB(V1.A00(adErrorType));
            }
            Log.e(A04(46, 17, 121), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C1153dL adObjectContext2 = this.A07;
                adObjectContext2.A08().AAy(A04(258, 3, 44), AbstractC0766Sv.A0W, new C0767Sw(A04(Opcodes.CHECKCAST, 23, 42)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        if (this.A01 != null) {
            View view = this.A01;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final C1153dL A6e() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view != this.A01 && view != this.A05 && view != this.A09) {
            ImageView imageView = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A06.bringChildToFront(view);
        if (this.A0B != null) {
            this.A06.bringChildToFront(this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r4.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r4.A03.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        return r4.A03.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            int imageWidth = this.A09.getImageWidth();
            String[] strArr = A0F;
            if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "us0p5hBNoGIfish2";
            strArr2[4] = "DFvDCw92fILzmemlu9XfPwpsPQRiq";
            return imageWidth;
        }
        MediaViewVideoRenderer mediaViewVideoRenderer = this.A05;
        if (A0F[1].charAt(7) != 'A') {
            String[] strArr3 = A0F;
            strArr3[3] = "7zc9sXuG";
            strArr3[7] = "ncWuDUJK";
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1153dL) {
            this.A07 = (C1153dL) context;
        } else {
            this.A07 = RB.A03(context);
        }
        this.A07.A0O(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                C1153dL c1153dL = this.A07;
                AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0F[1].charAt(7) == 'A') {
                    throw new RuntimeException();
                }
                A0F[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0D(c1153dL, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A04(155, 37, 26));
        }
        A01(true);
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A03.getWidth();
        int currentHeight = this.A03.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            this.A03.getLayoutParams().height = currentHeight;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((RH) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((RH) this.A05.getMediaViewVideoRendererApi()).A07(new C1298fi(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            if (this.A05 != null) {
                this.A03.removeView(this.A05);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((RH) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A0A());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C1297fh) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(XP.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 70));
    }
}
