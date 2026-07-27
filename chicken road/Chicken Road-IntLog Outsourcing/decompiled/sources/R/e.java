package R;

import android.content.DialogInterface;
import android.util.Log;
import b2.AbstractC0279e;
import h2.C0482c;

/* loaded from: classes.dex */
public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l, reason: collision with root package name */
    public final d f2576l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2577m;

    /* renamed from: n, reason: collision with root package name */
    public int f2578n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2579o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2580p;

    public e() {
        new B.a(5, this);
        new c(this);
        this.f2576l = new d(this);
        this.f2577m = true;
        this.f2578n = -1;
        new C0482c(27, this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f2579o) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2580p) {
            return;
        }
        this.f2580p = true;
        this.f2579o = true;
        if (this.f2578n >= 0) {
            m a6 = a();
            int i2 = this.f2578n;
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0279e.d(i2, "Bad id: "));
            }
            synchronized (a6.f2597a) {
            }
            this.f2578n = -1;
            return;
        }
        a aVar = new a(a());
        p pVar = new p();
        pVar.f2606a = 3;
        pVar.f2607b = this;
        aVar.f2567a.add(pVar);
        pVar.f2608c = 0;
        pVar.f2609d = 0;
        pVar.f2610e = 0;
        pVar.f2611f = 0;
        aVar.a(true);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
