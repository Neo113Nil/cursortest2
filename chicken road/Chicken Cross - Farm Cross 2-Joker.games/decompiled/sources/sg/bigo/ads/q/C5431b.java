package sg.bigo.ads.q;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.r.C5449b;

/* renamed from: sg.bigo.ads.q.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5431b extends sg.bigo.ads.M0.b {
    public final Drawable j;

    public C5431b(float f, float f2, float f3, float f4, Rect rect, float f5, boolean[] zArr, C5449b c5449b) {
        super(f, f2, f3, f4, rect, c5449b.b, c5449b.c, f5, zArr);
        Drawable drawable;
        int i = c5449b.b;
        if (c5449b.f13263a) {
            drawable = null;
        } else {
            drawable = AbstractC4962t.a(f, f2, f3, f4, rect, i);
            if (this.i != null) {
                drawable = new LayerDrawable(new Drawable[]{drawable, this.i});
            }
        }
        this.j = drawable;
    }
}
