package Yf;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class g extends f<a> {

    /* renamed from: p, reason: collision with root package name */
    private long f34951p;

    /* renamed from: q, reason: collision with root package name */
    private float f34952q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f34953r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34954s;

    /* renamed from: t, reason: collision with root package name */
    private int f34955t;

    public interface a {
        boolean a(@NonNull g gVar, int i11);
    }

    @Override // Yf.f, Yf.b
    protected final boolean a(@NonNull MotionEvent motionEvent) {
        super.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = true;
        if (actionMasked == 1) {
            boolean a11 = b(4) ? ((a) this.f34925h).a(this, this.f34955t) : false;
            n();
            return a11;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.f34954s) {
                    this.f34953r = true;
                }
                this.f34955t = this.f34947l.size();
                return false;
            }
            if (actionMasked == 6) {
                this.f34954s = true;
                return false;
            }
        } else if (!this.f34953r) {
            Iterator<e> it = this.f34948m.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                e next = it.next();
                float abs = Math.abs(next.a() - next.d());
                float abs2 = Math.abs(next.c() - next.e());
                float f7 = this.f34952q;
                boolean z12 = abs > f7 || abs2 > f7;
                this.f34953r = z12;
                if (z12) {
                    break;
                }
            }
            this.f34953r = z11;
            return false;
        }
        return false;
    }

    @Override // Yf.f, Yf.b
    protected final boolean b(int i11) {
        return this.f34955t > 1 && !this.f34953r && d() < this.f34951p && super.b(4);
    }

    @Override // Yf.f
    protected final void n() {
        this.f34955t = 0;
        this.f34953r = false;
        this.f34954s = false;
    }

    public final void p() {
        this.f34952q = this.f34918a.getResources().getDimension(R.dimen.mapbox_defaultMultiTapMovementThreshold);
    }

    public final void q() {
        this.f34951p = 150L;
    }
}
