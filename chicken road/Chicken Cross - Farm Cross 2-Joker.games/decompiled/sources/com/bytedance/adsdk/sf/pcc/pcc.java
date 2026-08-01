package com.bytedance.adsdk.sf.pcc;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.sf.wh.vj;

/* loaded from: classes4.dex */
public class pcc extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public pcc() {
    }

    public pcc(int i) {
        super(i);
    }

    public pcc(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public pcc(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((vj.pcc(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(vj.pcc(i, 0, 255));
        }
    }
}
