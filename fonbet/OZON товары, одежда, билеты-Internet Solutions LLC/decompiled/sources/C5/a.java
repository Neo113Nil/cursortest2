package C5;

import O5.f;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class a extends Paint {
    public a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            int i12 = f.f19985b;
            super.setAlpha(Math.max(0, Math.min(255, i11)));
        } else {
            int color = getColor();
            int i13 = f.f19985b;
            setColor((Math.max(0, Math.min(255, i11)) << 24) | (color & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(@NonNull LocaleList localeList) {
    }
}
