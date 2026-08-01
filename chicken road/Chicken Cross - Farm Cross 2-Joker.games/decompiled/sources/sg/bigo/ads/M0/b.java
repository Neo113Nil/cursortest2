package sg.bigo.ads.M0;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import sg.bigo.ads.K0.AbstractC4962t;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f12458a;
    public final float b;
    public final float c;
    public final float d;
    public final Rect e;
    public final int f;
    public final float g = Math.max(0.0f, Math.min(25.0f, 23.0f));
    public final float h = 4.0f;
    public final Drawable i;

    public b(float f, float f2, float f3, float f4, Rect rect, int i, int i2, float f5, boolean[] zArr) {
        this.f12458a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = rect;
        this.f = i;
        this.i = (i2 == 0 || f5 <= 0.0f) ? null : AbstractC4962t.a(f, f2, f3, f4, i2, f5, zArr);
    }
}
