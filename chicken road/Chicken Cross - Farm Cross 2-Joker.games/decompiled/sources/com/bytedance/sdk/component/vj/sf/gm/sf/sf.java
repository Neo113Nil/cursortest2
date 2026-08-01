package com.bytedance.sdk.component.vj.sf.gm.sf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.vj.sf.gm.wh;

/* loaded from: classes4.dex */
public class sf {
    public static final ImageView.ScaleType pcc = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config sf = Bitmap.Config.ARGB_4444;
    private final Bitmap.Config gm;
    private final ImageView.ScaleType kj;
    private int oo;
    private final int qf;
    private int vj;
    private final int wh;
    private final int vy = 1280;
    private final int ork = 83886080;

    private static int pcc(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    public sf(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.gm = config;
        this.oo = i;
        this.vj = i2;
        this.kj = scaleType;
        this.wh = i3;
        this.qf = i4;
        pcc(i, i2);
    }

    static int pcc(int i, int i2, int i3, int i4, int i5, int i6) {
        double min = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            min = Math.max(min, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        return Integer.highestOneBit((int) min);
    }

    private float pcc(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        return Math.max(i4 / (i2 / f), i5 / (i3 / f));
    }

    public Bitmap pcc(byte[] bArr, wh whVar) {
        Context context;
        boolean z;
        Bitmap decodeByteArray;
        if (whVar != null) {
            context = whVar.pcc();
            z = whVar.sf();
        } else {
            context = null;
            z = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.oo == 0 && this.vj == 0) {
            options.inPreferredConfig = this.gm;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int pcc2 = pcc(this.oo, this.vj, i, i2);
            int pcc3 = pcc(this.vj, this.oo, i2, i);
            options.inJustDecodeBounds = false;
            int pcc4 = pcc(i, i2, pcc2, pcc3, this.wh, this.qf);
            options.inSampleSize = pcc4;
            float pcc5 = pcc(pcc4, i, i2, pcc2, pcc3);
            boolean z2 = pcc5 > 0.0f && pcc5 < 1.0f && context != null && z;
            if (z2) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(pcc5 * 2.1474836E9f);
            }
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z2 && decodeByteArray != null) {
                decodeByteArray.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            }
            if (decodeByteArray != null && (decodeByteArray.getWidth() > pcc2 || decodeByteArray.getHeight() > pcc3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, pcc2, pcc3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 83886080) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    private void pcc(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.oo = 1280;
                this.vj = (i2 * 1280) / i;
                return;
            } else {
                this.oo = (i * 1280) / i2;
                this.vj = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.oo = 1280;
            this.vj = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.oo = (i * 1280) / i2;
            this.vj = 1280;
        }
    }
}
