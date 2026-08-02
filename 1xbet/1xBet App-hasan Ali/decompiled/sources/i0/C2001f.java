package i0;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001f {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f17276a;

    public C2001f(Bitmap bitmap) {
        this.f17276a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f17276a.getConfig();
        kotlin.jvm.internal.l.c(config3);
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config3 == config2) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config = Bitmap.Config.HARDWARE;
        return config3 == config ? 4 : 0;
    }
}
