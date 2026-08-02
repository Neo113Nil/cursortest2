package v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2519n {

    /* renamed from: a, reason: collision with root package name */
    public static final C2519n f20274a = new C2519n();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f, float f5) {
        try {
            return edgeEffect.onPullDistance(f, f5);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f5);
            return 0.0f;
        }
    }
}
