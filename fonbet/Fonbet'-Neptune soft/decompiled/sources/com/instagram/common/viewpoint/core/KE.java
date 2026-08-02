package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KE extends AbstractC0958aB implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1153dL A05;
    public C0850Wd A06;
    public KG A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final a5 A0B;
    public final Map<String, String> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, Ascii.CAN, 37, Ascii.SYN, Ascii.US, Ascii.FS, Ascii.SYN, Ascii.RS};
    }

    static {
        A04();
        A0F = (int) (AbstractC0856Wl.A02 * 24.0f);
    }

    public KE(C1153dL c1153dL, AbstractC1428hy abstractC1428hy, C0616My c0616My, US us, InterfaceC0884Xn interfaceC0884Xn, C1226eX c1226eX, XH xh, InterfaceC0866Wv interfaceC0866Wv) {
        this(c1153dL, abstractC1428hy.A0r(), c0616My, abstractC1428hy.A20().A0J().A06(), us, interfaceC0884Xn, c1226eX, xh, abstractC1428hy.A21(), interfaceC0866Wv);
        this.A0B.A08(abstractC1428hy);
    }

    public KE(C1153dL c1153dL, String str, C0616My c0616My, US us, InterfaceC0884Xn interfaceC0884Xn, C1226eX c1226eX, XH xh, N3 n3) {
        this(c1153dL, str, c0616My, false, us, interfaceC0884Xn, c1226eX, xh, n3);
    }

    public KE(C1153dL c1153dL, String str, C0616My c0616My, boolean z, US us, InterfaceC0884Xn interfaceC0884Xn, C1226eX c1226eX, XH xh, N3 n3) {
        super(c1153dL, c0616My);
        this.A0C = new HashMap();
        this.A05 = c1153dL;
        this.A0A = z;
        this.A0B = new a5(c1153dL, str, c1226eX, xh, us, n3, interfaceC0884Xn);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public KE(C1153dL c1153dL, String str, C0616My c0616My, boolean z, US us, InterfaceC0884Xn interfaceC0884Xn, C1226eX c1226eX, XH xh, N3 n3, InterfaceC0866Wv interfaceC0866Wv) {
        super(c1153dL, c0616My);
        this.A0C = new HashMap();
        this.A05 = c1153dL;
        this.A0A = z;
        this.A0B = new a5(c1153dL, str, c1226eX, xh, us, n3, interfaceC0884Xn, interfaceC0866Wv);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(XY.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? XX.MESSENGER : XX.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            C0850Wd c0850Wd = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c0850Wd.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC1428hy abstractC1428hy) {
        return ((long) abstractC1428hy.A1w()) > 0 && abstractC1428hy.A1u() >= 0;
    }

    public final ME A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return ME.A09;
        }
        A03();
        this.A0C.put(A01(0, 12, 6), str);
        return this.A0B.A05(this.A08, this.A09, this.A0C);
    }

    public final boolean A0F(AbstractC1428hy abstractC1428hy, AbstractC0883Xm abstractC0883Xm) {
        if (this.A06 != null || !A05(abstractC1428hy) || abstractC1428hy.A24().A01() == null || abstractC1428hy.A24().A00() == null) {
            return false;
        }
        this.A07 = new KG(abstractC1428hy.A1u(), abstractC1428hy.A1w(), abstractC1428hy.A1v(), abstractC1428hy.A24().A01(), abstractC1428hy.A24().A00(), abstractC0883Xm, this);
        this.A06 = new C0850Wd(abstractC1428hy.A1w(), this.A07);
        this.A06.A07();
        return true;
    }

    public a5 getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            A0E(A01(24, 9, 58));
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C0852Wh c0852Wh) {
        this.A0B.A09(c0852Wh);
    }

    public void setCta(C0617Mz c0617Mz, String str, Map<String, String> extraData) {
        setCta(c0617Mz, str, extraData, null);
    }

    public void setCta(C0617Mz c0617Mz, String str, Map<String, String> extraData, InterfaceC0866Wv interfaceC0866Wv, InterfaceC0953a4 interfaceC0953a4) {
        setCta(c0617Mz, str, extraData, interfaceC0953a4);
        this.A0B.A0A(interfaceC0866Wv);
    }

    public void setCta(C0617Mz c0617Mz, String str, Map<String, String> extraData, InterfaceC0953a4 interfaceC0953a4) {
        this.A08 = str;
        this.A09 = c0617Mz.A05();
        this.A0C.putAll(extraData);
        this.A0B.A0B(interfaceC0953a4);
        String A04 = c0617Mz.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A0C(z);
    }
}
