package V;

import C.InterfaceC2688h;
import C.InterfaceC2689i;
import C.InterfaceC2694n;
import J.f;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.M0;
import androidx.camera.core.w;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes8.dex */
public final class b implements I, InterfaceC2688h {

    /* renamed from: b, reason: collision with root package name */
    private final J f27870b;

    /* renamed from: c, reason: collision with root package name */
    private final J.f f27871c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27869a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f27872d = false;

    b(J j11, J.f fVar) {
        this.f27870b = j11;
        this.f27871c = fVar;
        if (j11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            fVar.j();
        } else {
            fVar.u();
        }
        j11.getLifecycle().a(this);
    }

    @Override // C.InterfaceC2688h
    @NonNull
    public final InterfaceC2689i a() {
        return this.f27871c.a();
    }

    @Override // C.InterfaceC2688h
    @NonNull
    public final InterfaceC2694n b() {
        return this.f27871c.b();
    }

    final void d(Collection<w> collection) throws f.a {
        synchronized (this.f27869a) {
            this.f27871c.d(collection);
        }
    }

    @NonNull
    public final J.f j() {
        return this.f27871c;
    }

    @X(AbstractC5434v.a.ON_DESTROY)
    public void onDestroy(@NonNull J j11) {
        synchronized (this.f27869a) {
            J.f fVar = this.f27871c;
            fVar.G((ArrayList) fVar.B());
        }
    }

    @X(AbstractC5434v.a.ON_PAUSE)
    public void onPause(@NonNull J j11) {
        this.f27871c.n(false);
    }

    @X(AbstractC5434v.a.ON_RESUME)
    public void onResume(@NonNull J j11) {
        this.f27871c.n(true);
    }

    @X(AbstractC5434v.a.ON_START)
    public void onStart(@NonNull J j11) {
        synchronized (this.f27869a) {
            try {
                if (!this.f27872d) {
                    this.f27871c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @X(AbstractC5434v.a.ON_STOP)
    public void onStop(@NonNull J j11) {
        synchronized (this.f27869a) {
            try {
                if (!this.f27872d) {
                    this.f27871c.u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final J q() {
        J j11;
        synchronized (this.f27869a) {
            j11 = this.f27870b;
        }
        return j11;
    }

    final M0 r() {
        return this.f27871c.z();
    }

    @NonNull
    public final List<w> s() {
        List<w> unmodifiableList;
        synchronized (this.f27869a) {
            unmodifiableList = Collections.unmodifiableList(this.f27871c.B());
        }
        return unmodifiableList;
    }

    public final boolean t(@NonNull w wVar) {
        boolean contains;
        synchronized (this.f27869a) {
            contains = ((ArrayList) this.f27871c.B()).contains(wVar);
        }
        return contains;
    }

    public final void u() {
        synchronized (this.f27869a) {
            try {
                if (this.f27872d) {
                    return;
                }
                onStop(this.f27870b);
                this.f27872d = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void v(Collection<w> collection) {
        synchronized (this.f27869a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f27871c.B());
            this.f27871c.G(arrayList);
        }
    }

    final void w() {
        synchronized (this.f27869a) {
            J.f fVar = this.f27871c;
            fVar.G((ArrayList) fVar.B());
        }
    }

    public final void x() {
        synchronized (this.f27869a) {
            try {
                if (this.f27872d) {
                    this.f27872d = false;
                    if (this.f27870b.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                        onStart(this.f27870b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
