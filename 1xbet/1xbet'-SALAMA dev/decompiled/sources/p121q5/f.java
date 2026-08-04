package p121q5;

import G4.C0286t;
import O1.k;
import S5.a;
import W5.S1;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import p128r5.b;
import p128r5.c;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f15892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f15893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f15894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15896g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15898i;
    public Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f15899k = new d(this, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15897h = false;

    public f(c cVar) {
        this.f15890a = cVar;
    }

    public final void a() {
        if (this.f15890a.g()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f15890a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        c cVar = this.f15890a;
        cVar.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + cVar + " connection to the engine " + cVar.f15883b.f15891b + " evicted by another attaching activity");
        f fVar = cVar.f15883b;
        if (fVar != null) {
            fVar.d();
            cVar.f15883b.e();
        }
    }

    public final void b() {
        if (this.f15890a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String c(Intent intent) {
        boolean z4;
        Uri data;
        c cVar = this.f15890a;
        cVar.getClass();
        try {
            Bundle bundleE = cVar.e();
            z4 = (bundleE == null || !bundleE.containsKey("flutter_deeplinking_enabled")) ? true : bundleE.getBoolean("flutter_deeplinking_enabled");
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
        if (this.f15894e != null) {
            this.f15892c.getViewTreeObserver().removeOnPreDrawListener(this.f15894e);
            this.f15894e = null;
        }
        m mVar = this.f15892c;
        if (mVar != null) {
            mVar.a();
            m mVar2 = this.f15892c;
            mVar2.f15939f.remove(this.f15899k);
        }
    }

    public final void e() {
        if (this.f15898i) {
            b();
            this.f15890a.getClass();
            this.f15890a.getClass();
            c cVar = this.f15890a;
            cVar.getClass();
            if (cVar.isChangingConfigurations()) {
                c cVar2 = this.f15891b.f16040d;
                if (cVar2.h()) {
                    a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        cVar2.f16058a = true;
                        Iterator it = ((HashMap) cVar2.f16060c).values().iterator();
                        while (it.hasNext()) {
                            ((p164x5.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        cVar2.e();
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
                this.f15891b.f16040d.d();
            }
            k kVar = this.f15893d;
            if (kVar != null) {
                ((p028d6.k) kVar.f4972c).f12448c = null;
                this.f15893d = null;
            }
            this.f15890a.getClass();
            b bVar = this.f15891b;
            if (bVar != null) {
                S1 s7 = bVar.f16043g;
                s7.a(1, s7.f7028c);
            }
            if (this.f15890a.g()) {
                this.f15891b.a();
                if (this.f15890a.b() != null) {
                    C0286t.b().c(this.f15890a.b(), null);
                }
                this.f15891b = null;
            }
            this.f15898i = false;
        }
    }
}
