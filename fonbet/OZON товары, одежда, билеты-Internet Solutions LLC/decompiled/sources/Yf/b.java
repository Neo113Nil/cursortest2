package Yf;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class b<L> {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f34918a;

    /* renamed from: b, reason: collision with root package name */
    protected final WindowManager f34919b;

    /* renamed from: c, reason: collision with root package name */
    private final a f34920c;

    /* renamed from: d, reason: collision with root package name */
    private MotionEvent f34921d;

    /* renamed from: e, reason: collision with root package name */
    private MotionEvent f34922e;

    /* renamed from: f, reason: collision with root package name */
    private long f34923f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34924g = true;

    /* renamed from: h, reason: collision with root package name */
    protected L f34925h;

    public b(Context context, a aVar) {
        this.f34918a = context;
        if (context instanceof Activity) {
            this.f34919b = (WindowManager) context.getSystemService("window");
        } else {
            this.f34919b = null;
        }
        this.f34920c = aVar;
    }

    protected abstract boolean a(@NonNull MotionEvent motionEvent);

    protected boolean b(int i11) {
        if (this.f34925h == null || !this.f34924g) {
            return false;
        }
        a aVar = this.f34920c;
        Iterator it = aVar.c().iterator();
        while (it.hasNext()) {
            Set<Integer> set = (Set) it.next();
            if (set.contains(Integer.valueOf(i11))) {
                for (Integer num : set) {
                    num.getClass();
                    Iterator it2 = aVar.a().iterator();
                    while (it2.hasNext()) {
                        b bVar = (b) it2.next();
                        if (bVar instanceof j) {
                            j jVar = (j) bVar;
                            if (jVar.r().contains(num) && jVar.t()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final MotionEvent c() {
        return this.f34921d;
    }

    public final long d() {
        return this.f34923f;
    }

    public final MotionEvent e() {
        return this.f34922e;
    }

    protected final boolean f(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MotionEvent motionEvent2 = this.f34922e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f34922e = null;
        }
        MotionEvent motionEvent3 = this.f34921d;
        if (motionEvent3 != null) {
            this.f34922e = MotionEvent.obtain(motionEvent3);
            this.f34921d.recycle();
            this.f34921d = null;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f34921d = obtain;
        this.f34923f = obtain.getEventTime() - this.f34921d.getDownTime();
        return a(motionEvent);
    }

    public void g(boolean z11) {
        this.f34924g = z11;
    }
}
