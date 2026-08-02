package Yf;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class l extends j<a> {

    /* renamed from: z, reason: collision with root package name */
    private static final HashSet f34966z;

    /* renamed from: v, reason: collision with root package name */
    private float f34967v;

    /* renamed from: w, reason: collision with root package name */
    private float f34968w;

    /* renamed from: x, reason: collision with root package name */
    float f34969x;

    /* renamed from: y, reason: collision with root package name */
    float f34970y;

    public interface a {
        void a(@NonNull l lVar);

        void b(@NonNull l lVar, float f7);

        boolean c(@NonNull l lVar);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f34966z = hashSet;
        hashSet.add(3);
    }

    @Override // Yf.f, Yf.b
    protected final boolean b(int i11) {
        return Math.abs(this.f34969x) >= this.f34968w && super.b(3);
    }

    @Override // Yf.f
    protected final boolean h() {
        MotionEvent e11 = e();
        MotionEvent e12 = e();
        ArrayList arrayList = this.f34947l;
        float y11 = ((c().getY(c().findPointerIndex(((Integer) arrayList.get(1)).intValue())) + c().getY(c().findPointerIndex(((Integer) arrayList.get(0)).intValue()))) / 2.0f) - ((e().getY(e().findPointerIndex(((Integer) arrayList.get(1)).intValue())) + e11.getY(e12.findPointerIndex(((Integer) arrayList.get(0)).intValue()))) / 2.0f);
        this.f34970y = y11;
        this.f34969x += y11;
        if (t()) {
            float f7 = this.f34970y;
            if (f7 != 0.0f) {
                ((a) this.f34925h).b(this, f7);
                return true;
            }
        }
        if (!b(3) || !((a) this.f34925h).c(this)) {
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
            double degrees = Math.toDegrees(Math.abs(Math.atan2(eVar.c(), eVar.a())));
            double d11 = this.f34967v;
            if (degrees <= d11 || 180.0d - degrees <= d11) {
                return false;
            }
        }
        return true;
    }

    @Override // Yf.f
    protected final void n() {
        this.f34969x = 0.0f;
    }

    @Override // Yf.j
    protected final void q() {
        super.q();
        ((a) this.f34925h).a(this);
    }

    @Override // Yf.j
    @NonNull
    protected final HashSet u() {
        return f34966z;
    }

    public final void v() {
        this.f34967v = 20.0f;
    }

    public final void w() {
        this.f34968w = this.f34918a.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
    }
}
