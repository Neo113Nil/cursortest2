package A0;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: A0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063v0 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f584a;

    public C0063v0(ViewConfiguration viewConfiguration) {
        this.f584a = viewConfiguration;
    }

    @Override // A0.q1
    public final float a() {
        return this.f584a.getScaledMaximumFlingVelocity();
    }

    @Override // A0.q1
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // A0.q1
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // A0.q1
    public final float d() {
        return this.f584a.getScaledTouchSlop();
    }

    @Override // A0.q1
    public final float e() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.f584a.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // A0.q1
    public final float f() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.f584a.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    @Override // A0.q1
    public final long g() {
        float f = 48;
        return G4.d.b(f, f);
    }
}
