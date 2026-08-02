package androidx.work.impl.background.systemalarm;

import E.r;
import E0.C2942q;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.t;
import androidx.work.o;
import d5.C6089d;
import d5.InterfaceC6088c;
import f5.C6437o;
import g5.C6627B;
import g5.C6643p;
import g5.S;
import h5.C6802C;
import h5.u;
import i5.C7009b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class e implements InterfaceC6088c, C6802C.a {

    /* renamed from: m, reason: collision with root package name */
    private static final String f45386m = o.i("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f45387a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45388b;

    /* renamed from: c, reason: collision with root package name */
    private final C6643p f45389c;

    /* renamed from: d, reason: collision with root package name */
    private final f f45390d;

    /* renamed from: e, reason: collision with root package name */
    private final C6089d f45391e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f45392f;

    /* renamed from: g, reason: collision with root package name */
    private int f45393g;

    /* renamed from: h, reason: collision with root package name */
    private final h5.o f45394h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f45395i;

    /* renamed from: j, reason: collision with root package name */
    private PowerManager.WakeLock f45396j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45397k;

    /* renamed from: l, reason: collision with root package name */
    private final t f45398l;

    e(@NonNull Context context, int i11, @NonNull f fVar, @NonNull t tVar) {
        this.f45387a = context;
        this.f45388b = i11;
        this.f45390d = fVar;
        this.f45389c = tVar.a();
        this.f45398l = tVar;
        C6437o m11 = fVar.f().m();
        C7009b c7009b = (C7009b) fVar.f45401b;
        this.f45394h = c7009b.c();
        this.f45395i = c7009b.b();
        this.f45391e = new C6089d(m11, this);
        this.f45397k = false;
        this.f45393g = 0;
        this.f45392f = new Object();
    }

    public static void b(e eVar) {
        C6643p c6643p = eVar.f45389c;
        String b11 = c6643p.b();
        int i11 = eVar.f45393g;
        String str = f45386m;
        if (i11 >= 2) {
            o.e().a(str, "Already stopped work for " + b11);
            return;
        }
        eVar.f45393g = 2;
        o.e().a(str, "Stopping work for WorkSpec " + b11);
        Context context = eVar.f45387a;
        Intent e11 = b.e(context, c6643p);
        Executor executor = eVar.f45395i;
        f fVar = eVar.f45390d;
        int i12 = eVar.f45388b;
        executor.execute(new f.b(i12, e11, fVar));
        if (!fVar.e().g(c6643p.b())) {
            o.e().a(str, "Processor does not have WorkSpec " + b11 + ". No need to reschedule");
            return;
        }
        o.e().a(str, "WorkSpec " + b11 + " needs to be rescheduled");
        executor.execute(new f.b(i12, b.d(context, c6643p), fVar));
    }

    public static void c(e eVar) {
        int i11 = eVar.f45393g;
        String str = f45386m;
        C6643p c6643p = eVar.f45389c;
        if (i11 != 0) {
            o.e().a(str, "Already started work for " + c6643p);
            return;
        }
        eVar.f45393g = 1;
        o.e().a(str, "onAllConstraintsMet for " + c6643p);
        f fVar = eVar.f45390d;
        if (fVar.e().k(eVar.f45398l, null)) {
            fVar.g().a(c6643p, eVar);
        } else {
            eVar.d();
        }
    }

    private void d() {
        synchronized (this.f45392f) {
            try {
                this.f45391e.e();
                this.f45390d.g().b(this.f45389c);
                PowerManager.WakeLock wakeLock = this.f45396j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.e().a(f45386m, "Releasing wakelock " + this.f45396j + "for WorkSpec " + this.f45389c);
                    this.f45396j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h5.C6802C.a
    public final void a(@NonNull C6643p c6643p) {
        o.e().a(f45386m, "Exceeded time limits on execution for " + c6643p);
        this.f45394h.execute(new r(this, 3));
    }

    @Override // d5.InterfaceC6088c
    public final void e(@NonNull ArrayList arrayList) {
        this.f45394h.execute(new r(this, 3));
    }

    @Override // d5.InterfaceC6088c
    public final void f(@NonNull List<C6627B> list) {
        Iterator<C6627B> it = list.iterator();
        while (it.hasNext()) {
            if (S.a(it.next()).equals(this.f45389c)) {
                this.f45394h.execute(new d(this, 0));
                return;
            }
        }
    }

    final void g() {
        String b11 = this.f45389c.b();
        this.f45396j = u.b(this.f45387a, K00.b.e(this.f45388b, ")", C2942q.e(b11, " (")));
        o e11 = o.e();
        String str = "Acquiring wakelock " + this.f45396j + "for WorkSpec " + b11;
        String str2 = f45386m;
        e11.a(str2, str);
        this.f45396j.acquire();
        C6627B m11 = this.f45390d.f().n().f().m(b11);
        if (m11 == null) {
            this.f45394h.execute(new r(this, 3));
            return;
        }
        boolean e12 = m11.e();
        this.f45397k = e12;
        if (e12) {
            this.f45391e.d(Collections.singletonList(m11));
            return;
        }
        o.e().a(str2, "No constraints for " + b11);
        f(Collections.singletonList(m11));
    }

    final void h(boolean z11) {
        o e11 = o.e();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        C6643p c6643p = this.f45389c;
        sb2.append(c6643p);
        sb2.append(", ");
        sb2.append(z11);
        e11.a(f45386m, sb2.toString());
        d();
        Executor executor = this.f45395i;
        int i11 = this.f45388b;
        f fVar = this.f45390d;
        Context context = this.f45387a;
        if (z11) {
            executor.execute(new f.b(i11, b.d(context, c6643p), fVar));
        }
        if (this.f45397k) {
            int i12 = b.f45374f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new f.b(i11, intent, fVar));
        }
    }
}
