package q5;

import G4.C0286t;
import W5.S1;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import d6.C0977k;
import java.util.HashMap;
import java.util.Iterator;
import r5.C1577b;
import r5.C1578c;
import x5.InterfaceC1789a;

/* renamed from: q5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1562f {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC1559c f15884a;

    /* renamed from: b, reason: collision with root package name */
    public C1577b f15885b;

    /* renamed from: c, reason: collision with root package name */
    public m f15886c;

    /* renamed from: d, reason: collision with root package name */
    public O1.k f15887d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC1561e f15888e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15889f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15890g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15892i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public final C1560d f15893k = new C1560d(this, 0);

    /* renamed from: h, reason: collision with root package name */
    public boolean f15891h = false;

    public C1562f(AbstractActivityC1559c abstractActivityC1559c) {
        this.f15884a = abstractActivityC1559c;
    }

    public final void a() {
        if (this.f15884a.g()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f15884a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC1559c abstractActivityC1559c = this.f15884a;
        abstractActivityC1559c.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC1559c + " connection to the engine " + abstractActivityC1559c.f15877b.f15885b + " evicted by another attaching activity");
        C1562f c1562f = abstractActivityC1559c.f15877b;
        if (c1562f != null) {
            c1562f.d();
            abstractActivityC1559c.f15877b.e();
        }
    }

    public final void b() {
        if (this.f15884a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String c(Intent intent) {
        boolean z4;
        Uri data;
        AbstractActivityC1559c abstractActivityC1559c = this.f15884a;
        abstractActivityC1559c.getClass();
        try {
            Bundle e7 = abstractActivityC1559c.e();
            z4 = (e7 == null || !e7.containsKey("flutter_deeplinking_enabled")) ? true : e7.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z4 = false;
        }
        if (!z4 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void d() {
        b();
        if (this.f15888e != null) {
            this.f15886c.getViewTreeObserver().removeOnPreDrawListener(this.f15888e);
            this.f15888e = null;
        }
        m mVar = this.f15886c;
        if (mVar != null) {
            mVar.a();
            m mVar2 = this.f15886c;
            mVar2.f15933f.remove(this.f15893k);
        }
    }

    public final void e() {
        if (this.f15892i) {
            b();
            this.f15884a.getClass();
            this.f15884a.getClass();
            AbstractActivityC1559c abstractActivityC1559c = this.f15884a;
            abstractActivityC1559c.getClass();
            if (abstractActivityC1559c.isChangingConfigurations()) {
                C1578c c1578c = this.f15885b.f16034d;
                if (c1578c.h()) {
                    S5.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c1578c.f16052a = true;
                        Iterator it = ((HashMap) c1578c.f16054c).values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1789a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        c1578c.e();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f15885b.f16034d.d();
            }
            O1.k kVar = this.f15887d;
            if (kVar != null) {
                ((C0977k) kVar.f4972c).f12442c = null;
                this.f15887d = null;
            }
            this.f15884a.getClass();
            C1577b c1577b = this.f15885b;
            if (c1577b != null) {
                S1 s12 = c1577b.f16037g;
                s12.a(1, s12.f7028c);
            }
            if (this.f15884a.g()) {
                this.f15885b.a();
                if (this.f15884a.b() != null) {
                    C0286t.b().c(this.f15884a.b(), null);
                }
                this.f15885b = null;
            }
            this.f15892i = false;
        }
    }
}
