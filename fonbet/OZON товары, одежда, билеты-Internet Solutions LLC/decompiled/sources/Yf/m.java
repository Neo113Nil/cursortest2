package Yf;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class m extends j<a> {

    /* renamed from: z, reason: collision with root package name */
    private static final HashSet f34971z;

    /* renamed from: v, reason: collision with root package name */
    private float f34972v;

    /* renamed from: w, reason: collision with root package name */
    private float f34973w;

    /* renamed from: x, reason: collision with root package name */
    float f34974x;

    /* renamed from: y, reason: collision with root package name */
    float f34975y;

    public interface a {
        boolean a();

        boolean b();

        void c();
    }

    static {
        HashSet hashSet = new HashSet();
        f34971z = hashSet;
        hashSet.add(14);
    }

    @Override // Yf.f, Yf.b
    protected final boolean b(int i11) {
        return Math.abs(this.f34974x) >= this.f34973w && super.b(14);
    }

    @Override // Yf.f
    protected final boolean h() {
        MotionEvent e11 = e();
        MotionEvent e12 = e();
        ArrayList arrayList = this.f34947l;
        float x11 = ((c().getX(c().findPointerIndex(((Integer) arrayList.get(1)).intValue())) + c().getX(c().findPointerIndex(((Integer) arrayList.get(0)).intValue()))) / 2.0f) - ((e().getX(e().findPointerIndex(((Integer) arrayList.get(1)).intValue())) + e11.getX(e12.findPointerIndex(((Integer) arrayList.get(0)).intValue()))) / 2.0f);
        this.f34975y = x11;
        this.f34974x += x11;
        if (t() && this.f34975y != 0.0f) {
            return ((a) this.f34925h).a();
        }
        if (!b(14) || !((a) this.f34925h).b()) {
            return false;
        }
        p();
        return true;
    }

    @Override // Yf.f
    protected final boolean l() {
        if (!super.l()) {
            HashMap<i, e> hashMap = this.f34948m;
            ArrayList arrayList = this.f34947l;
            e eVar = hashMap.get(new i((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(eVar.c(), eVar.a()))) - 90.0d) <= this.f34972v) {
                return false;
            }
        }
        return true;
    }

    @Override // Yf.f
    protected final void n() {
        this.f34974x = 0.0f;
    }

    @Override // Yf.j
    protected final void q() {
        super.q();
        ((a) this.f34925h).c();
    }

    @Override // Yf.j
    @NonNull
    protected final HashSet u() {
        return f34971z;
    }

    public final void v() {
        this.f34972v = 20.0f;
    }

    public final void w() {
        this.f34973w = this.f34918a.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
    }
}
