package Yf;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class d extends j<a> {

    /* renamed from: z, reason: collision with root package name */
    private static final HashSet f34934z;

    /* renamed from: v, reason: collision with root package name */
    private PointF f34935v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f34936w;

    /* renamed from: x, reason: collision with root package name */
    private float f34937x;

    /* renamed from: y, reason: collision with root package name */
    private final HashMap f34938y;

    public interface a {
        boolean a(@NonNull d dVar);

        void b(@NonNull d dVar);

        boolean c(@NonNull d dVar, float f7, float f11);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f34934z = hashSet;
        hashSet.add(13);
    }

    public d(Context context, Yf.a aVar) {
        super(context, aVar);
        this.f34938y = new HashMap();
    }

    @Override // Yf.j, Yf.f, Yf.b
    protected final boolean a(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap hashMap = this.f34938y;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                hashMap.clear();
            } else if (actionMasked == 3) {
                hashMap.clear();
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.f34936w = true;
                    hashMap.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                }
            }
            return super.a(motionEvent);
        }
        this.f34936w = true;
        hashMap.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new c(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        return super.a(motionEvent);
    }

    @Override // Yf.f, Yf.b
    protected final boolean b(int i11) {
        if (!super.b(13)) {
            return false;
        }
        Iterator it = this.f34938y.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        c cVar = (c) it.next();
        return Math.abs(cVar.e()) >= this.f34937x || Math.abs(cVar.g()) >= this.f34937x;
    }

    @Override // Yf.f
    protected final boolean h() {
        Iterator it = this.f34947l.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            ((c) this.f34938y.get(num)).a(c().getX(c().findPointerIndex(intValue)), c().getY(c().findPointerIndex(intValue)));
        }
        if (!t()) {
            if (!b(13) || !((a) this.f34925h).a(this)) {
                return false;
            }
            p();
            this.f34935v = i();
            this.f34936w = false;
            return true;
        }
        PointF i11 = i();
        PointF pointF = this.f34935v;
        float f7 = pointF.x - i11.x;
        float f11 = pointF.y - i11.y;
        this.f34935v = i11;
        if (!this.f34936w) {
            return ((a) this.f34925h).c(this, f7, f11);
        }
        this.f34936w = false;
        return ((a) this.f34925h).c(this, 0.0f, 0.0f);
    }

    @Override // Yf.f
    protected final int k() {
        return 1;
    }

    @Override // Yf.f
    protected final void n() {
    }

    @Override // Yf.j
    protected final void q() {
        super.q();
        ((a) this.f34925h).b(this);
    }

    @Override // Yf.j
    @NonNull
    protected final HashSet u() {
        return f34934z;
    }

    public final c v() {
        if (!t()) {
            return null;
        }
        ArrayList arrayList = this.f34947l;
        if (arrayList.size() > 0) {
            return (c) this.f34938y.get(arrayList.get(0));
        }
        return null;
    }

    public final void w(float f7) {
        this.f34937x = f7;
    }

    public final void x() {
        this.f34937x = this.f34918a.getResources().getDimension(R.dimen.maplibre_minimum_move_threshold);
    }
}
