package Yf;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class j<L> extends f<L> {

    /* renamed from: p, reason: collision with root package name */
    private final Set<Integer> f34956p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f34957q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f34958r;

    /* renamed from: s, reason: collision with root package name */
    VelocityTracker f34959s;

    /* renamed from: t, reason: collision with root package name */
    float f34960t;

    /* renamed from: u, reason: collision with root package name */
    float f34961u;

    public j(Context context, a aVar) {
        super(context, aVar);
        this.f34956p = u();
    }

    @Override // Yf.f, Yf.b
    protected boolean a(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            n();
        }
        if (this.f34958r) {
            this.f34958r = false;
            n();
            q();
        }
        VelocityTracker velocityTracker = this.f34959s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(c());
        }
        boolean a11 = super.a(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.f34947l.size() < k() && this.f34957q) {
                q();
                return true;
            }
        } else if (actionMasked == 3 && this.f34957q) {
            q();
            return true;
        }
        return a11;
    }

    @Override // Yf.b
    public final void g(boolean z11) {
        super.g(z11);
        if (z11) {
            return;
        }
        s();
    }

    protected final void p() {
        this.f34957q = true;
        if (this.f34959s == null) {
            this.f34959s = VelocityTracker.obtain();
        }
    }

    protected void q() {
        this.f34957q = false;
        VelocityTracker velocityTracker = this.f34959s;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.f34960t = this.f34959s.getXVelocity();
            this.f34961u = this.f34959s.getYVelocity();
            this.f34959s.recycle();
            this.f34959s = null;
        }
        n();
    }

    final Set<Integer> r() {
        return this.f34956p;
    }

    public final void s() {
        if (this.f34957q) {
            this.f34958r = true;
        }
    }

    public final boolean t() {
        return this.f34957q;
    }

    @NonNull
    protected abstract HashSet u();
}
