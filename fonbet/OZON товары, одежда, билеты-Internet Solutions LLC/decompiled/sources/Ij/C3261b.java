package Ij;

import H8.g;
import S7.q;
import android.content.Context;
import android.graphics.Paint;
import c8.C5762a;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import m0.E;
import m3.r;
import m3.s;
import u3.InterfaceC9928b;

/* renamed from: Ij.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3261b implements x.a, g.a, E, r.a {
    public static Paint b(int i11, int i12) {
        Paint paint = new Paint(i11);
        paint.setColor(i12);
        return paint;
    }

    public static StringBuilder e(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static void f(int i11, String str, String str2) {
        s.f(str2, str + i11);
    }

    @Override // m0.E
    public float a(float f7) {
        if (f7 < 0.36363637f) {
            return 7.5625f * f7 * f7;
        }
        if (f7 < 0.72727275f) {
            float f11 = f7 - 0.54545456f;
            return (7.5625f * f11 * f11) + 0.75f;
        }
        if (f7 < 0.90909094f) {
            float f12 = f7 - 0.8181818f;
            return (7.5625f * f12 * f12) + 0.9375f;
        }
        float f13 = f7 - 0.95454544f;
        return (7.5625f * f13 * f13) + 0.984375f;
    }

    @Override // H8.g.a
    public String c(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return C5762a.d(g10);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
