package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class lIlIIIIllI extends android.view.View {
    public final double IlIllIlIIl;
    public int IllIIIIllI;
    public int IllIIIllII;
    public final com.microblink.blinkid.secured.IIIIllIIll lIlIIIIlIl;
    public int llIIIlllll;
    public final com.microblink.blinkid.secured.lIIIllIIll llIIlIIlll;
    public final double llIIlIlIIl;

    public lIlIIIIllI(android.content.Context context) {
        super(context, null);
        this.llIIlIlIIl = 0.11d;
        this.IlIllIlIIl = 0.11d;
        this.IllIIIllII = -1;
        this.llIIIlllll = -1;
        this.IllIIIIllI = -1;
        this.lIlIIIIlIl = new com.microblink.blinkid.secured.IIIIllIIll();
        this.llIIlIIlll = new com.microblink.blinkid.secured.lIIIllIIll();
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.IllIIIllII == -1) {
            this.IllIIIllII = getWidth();
        }
        if (this.llIIIlllll == -1) {
            this.llIIIlllll = getHeight();
        }
        int i = this.IllIIIllII;
        int i2 = (int) ((1.0d - this.llIIlIlIIl) * i);
        int i3 = (int) ((1.0d - this.IlIllIlIIl) * this.llIIIlllll);
        this.IllIIIIllI = (i - i2) / 2;
        float f = i2;
        float f2 = 0.5f * f;
        float f3 = (20.0f * f2) / 160.0f;
        float f4 = f3 * 2.0f;
        float f5 = f2 / 10.0f;
        float f6 = (f - ((f4 + f5) + f2)) / 2.0f;
        float random = ((i3 - f4) * ((float) java.lang.Math.random())) + ((r4 - i3) / 2);
        com.microblink.blinkid.secured.IIIIllIIll iIIIllIIll = this.lIlIIIIlIl;
        int i4 = (int) (this.IllIIIIllI + f6);
        int i5 = (int) random;
        int i6 = (int) f4;
        if (!iIIIllIIll.llIIlIlIIl) {
            iIIIllIIll.llIIlIlIIl = true;
            iIIIllIIll.IlIllIlIIl = new android.graphics.Paint();
            iIIIllIIll.IllIIIllII = android.graphics.Typeface.create(android.graphics.Typeface.SERIF, 0);
            iIIIllIIll.llIIIlllll = new android.graphics.Paint();
            iIIIllIIll.IllIIIIllI = new android.graphics.Matrix();
            iIIIllIIll.llIIlIIlll = new android.graphics.Paint();
            iIIIllIIll.IIlIIIllIl = new android.graphics.Path();
            iIIIllIIll.lIIIIIllll = new android.graphics.Matrix();
        }
        canvas.save();
        canvas.translate(i4, i5);
        float f7 = i6 / 28.0f;
        canvas.scale(f7, f7);
        iIIIllIIll.IlIllIlIIl.reset();
        iIIIllIIll.IlIllIlIIl.setFlags(129);
        iIIIllIIll.IlIllIlIIl.setStyle(android.graphics.Paint.Style.FILL);
        iIIIllIIll.IlIllIlIIl.setTypeface(android.graphics.Typeface.DEFAULT);
        iIIIllIIll.IlIllIlIIl.setColor(-16777216);
        iIIIllIIll.IlIllIlIIl.setTextSize(16.0f);
        iIIIllIIll.IlIllIlIIl.setTypeface(iIIIllIIll.IllIIIllII);
        iIIIllIIll.IlIllIlIIl.setStrikeThruText(false);
        iIIIllIIll.IlIllIlIIl.setUnderlineText(false);
        canvas.save();
        iIIIllIIll.llIIIlllll.reset();
        iIIIllIIll.llIIIlllll.set(iIIIllIIll.IlIllIlIIl);
        iIIIllIIll.llIIIlllll.setColor(0);
        iIIIllIIll.IllIIIIllI.reset();
        canvas.concat(iIIIllIIll.IllIIIIllI);
        iIIIllIIll.lIlIIIIlIl = canvas.getMatrix();
        canvas.save();
        iIIIllIIll.llIIlIIlll.reset();
        iIIIllIIll.llIIlIIlll.set(iIIIllIIll.llIIIlllll);
        iIIIllIIll.llIIlIIlll.setColor(-16751886);
        iIIIllIIll.IIlIIIllIl.reset();
        iIIIllIIll.IIlIIIllIl.moveTo(24.3827f, 5.07476f);
        iIIIllIIll.IIlIIIllIl.lineTo(27.551498f, 12.9832f);
        iIIIllIIll.IIlIIIllIl.cubicTo(27.6857f, 13.3175f, 27.752499f, 13.6749f, 27.748299f, 14.0351f);
        iIIIllIIll.IIlIIIllIl.cubicTo(27.7442f, 14.3953f, 27.669f, 14.7511f, 27.527f, 15.0822f);
        iIIIllIIll.IIlIIIllIl.lineTo(24.1737f, 22.916899f);
        iIIIllIIll.IIlIIIllIl.cubicTo(24.0322f, 23.2477f, 23.826899f, 23.5473f, 23.5695f, 23.7987f);
        iIIIllIIll.IIlIIIllIl.cubicTo(23.312199f, 24.0501f, 23.0079f, 24.248299f, 22.673899f, 24.3821f);
        iIIIllIIll.IIlIIIllIl.lineTo(14.7627f, 27.551498f);
        iIIIllIIll.IIlIIIllIl.cubicTo(14.428699f, 27.6854f, 14.0716f, 27.752f, 13.7118f, 27.748001f);
        iIIIllIIll.IIlIIIllIl.cubicTo(13.3519f, 27.7437f, 12.9964f, 27.668798f, 12.6656f, 27.527f);
        iIIIllIIll.IIlIIIllIl.lineTo(4.83068f, 24.173199f);
        iIIIllIIll.IIlIIIllIl.cubicTo(4.16282f, 23.8871f, 3.63581f, 23.3477f, 3.36545f, 22.673399f);
        iIIIllIIll.IIlIIIllIl.lineTo(0.196661f, 14.7624f);
        iIIIllIIll.IIlIIIllIl.cubicTo(0.062792f, 14.428499f, -0.003994f, 14.0715f, 1.85E-4f, 13.7118f);
        iIIIllIIll.IIlIIIllIl.cubicTo(0.004364f, 13.352f, 0.079419f, 12.996599f, 0.22101f, 12.665899f);
        iIIIllIIll.IIlIIIllIl.lineTo(3.57439f, 4.83055f);
        iIIIllIIll.IIlIIIllIl.cubicTo(3.86042f, 4.16274f, 4.39988f, 3.63576f, 5.07423f, 3.3654f);
        iIIIllIIll.IIlIIIllIl.lineTo(12.985399f, 0.196649f);
        iIIIllIIll.IIlIIIllIl.cubicTo(13.3194f, 0.062764f, 13.6766f, -0.003994f, 14.0364f, 1.85E-4f);
        iIIIllIIll.IIlIIIllIl.cubicTo(14.396299f, 0.004364f, 14.7518f, 0.079399f, 15.0826f, 0.221005f);
        iIIIllIIll.IIlIIIllIl.lineTo(22.9174f, 3.57434f);
        iIIIllIIll.IIlIIIllIl.cubicTo(23.248299f, 3.7159f, 23.548f, 3.92126f, 23.7994f, 4.17871f);
        iIIIllIIll.IIlIIIllIl.cubicTo(24.0508f, 4.43618f, 24.249f, 4.74065f, 24.3827f, 5.07476f);
        iIIIllIIll.IIlIIIllIl.close();
        iIIIllIIll.IIlIIIllIl.moveTo(19.824799f, 19.3016f);
        iIIIllIIll.IIlIIIllIl.cubicTo(20.4343f, 18.988f, 21.0992f, 18.645899f, 21.828499f, 18.246399f);
        iIIIllIIll.IIlIIIllIl.cubicTo(23.0303f, 17.5914f, 23.9045f, 16.4588f, 24.126299f, 15.4231f);
        iIIIllIIll.IIlIIIllIl.cubicTo(24.3699f, 14.3771f, 23.958399f, 13.428499f, 23.1328f, 12.9081f);
        iIIIllIIll.IIlIIIllIl.cubicTo(21.248001f, 11.7008f, 20.4739f, 10.1963f, 19.3029f, 7.92072f);
        iIIIllIIll.IIlIIIllIl.cubicTo(18.989399f, 7.31148f, 18.6475f, 6.647f, 18.2482f, 5.91812f);
        iIIIllIIll.IIlIIIllIl.cubicTo(17.5964f, 4.71573f, 16.4638f, 3.84021f, 15.4281f, 3.62037f);
        iIIIllIIll.IIlIIIllIl.cubicTo(14.382001f, 3.37619f, 13.433399f, 3.7883f, 12.913001f, 4.61382f);
        iIIIllIIll.IIlIIIllIl.cubicTo(11.705899f, 6.49819f, 10.2019f, 7.27198f, 7.92703f, 8.4423f);
        iIIIllIIll.IIlIIIllIl.cubicTo(7.31738f, 8.75595f, 6.65237f, 9.09808f, 5.92286f, 9.4977f);
        iIIIllIIll.IIlIIIllIl.cubicTo(4.72045f, 10.153399f, 3.84554f, 11.2859f, 3.62504f, 12.3216f);
        iIIIllIIll.IIlIIIllIl.cubicTo(3.38149f, 13.367001f, 3.79297f, 14.316199f, 4.61851f, 14.836f);
        iIIIllIIll.IIlIIIllIl.cubicTo(6.50334f, 16.043299f, 7.27748f, 17.5478f, 8.44843f, 19.823399f);
        iIIIllIIll.IIlIIIllIl.cubicTo(8.761909f, 20.4326f, 9.103829f, 21.0971f, 9.503119f, 21.826f);
        iIIIllIIll.IIlIIIllIl.cubicTo(10.155001f, 23.028399f, 11.287499f, 23.9039f, 12.323299f, 24.1237f);
        iIIIllIIll.IIlIIIllIl.cubicTo(13.3693f, 24.367899f, 14.3179f, 23.9564f, 14.8384f, 23.1309f);
        iIIIllIIll.IIlIIIllIl.cubicTo(16.0455f, 21.2459f, 17.5497f, 20.4721f, 19.824799f, 19.3016f);
        iIIIllIIll.IIlIIIllIl.close();
        iIIIllIIll.lIIIIIllll.reset();
        iIIIllIIll.lIlIIIIlIl.invert(iIIIllIIll.lIIIIIllll);
        iIIIllIIll.lIIIIIllll.preConcat(iIIIllIIll.lIlIIIIlIl);
        iIIIllIIll.lIIIIIllll.mapPoints(com.microblink.blinkid.secured.IIIIllIIll.lllIIIlIlI);
        iIIIllIIll.IIlIIIllIl.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        canvas.drawPath(iIIIllIIll.IIlIIIllIl, iIIIllIIll.llIIlIIlll);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        this.llIIlIIlll.llIIlIlIIl(canvas, (int) (this.IllIIIIllI + f6 + f4 + f5), (int) ((random - (f4 / 4.0f)) + f3), (int) f2, (int) f3);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.IllIIIllII = getWidth();
        int height = getHeight();
        this.llIIIlllll = height;
        com.microblink.blinkid.util.Log.v(this, "LogoOverlayView layouting to size: {}x{}", java.lang.Integer.valueOf(this.IllIIIllII), java.lang.Integer.valueOf(height));
    }
}
