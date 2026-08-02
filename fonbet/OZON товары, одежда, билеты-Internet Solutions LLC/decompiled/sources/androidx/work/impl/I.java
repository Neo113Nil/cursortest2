package androidx.work.impl;

import B0.A0;
import C.o0;
import androidx.work.r;
import androidx.work.v;
import g5.C6627B;
import g5.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I {
    public static void a(C this_enqueueUniquelyNamedPeriodic, n operation, Function0 enqueueNew, androidx.work.t workRequest) {
        Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter("NotificationChannelStateWorker", "$name");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        g5.C f7 = this_enqueueUniquelyNamedPeriodic.n().f();
        ArrayList p11 = f7.p("NotificationChannelStateWorker");
        if (p11.size() > 1) {
            operation.a(new r.a.C0824a(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
            return;
        }
        C6627B.a aVar = (C6627B.a) C7714v.M(p11);
        if (aVar == null) {
            ((G) enqueueNew).invoke();
            return;
        }
        String str = aVar.f63819a;
        C6627B m11 = f7.m(str);
        if (m11 == null) {
            operation.a(new r.a.C0824a(new IllegalStateException(A0.b("WorkSpec with ", str, ", that matches a name \"NotificationChannelStateWorker\", wasn't found"))));
            return;
        }
        if (!m11.f()) {
            operation.a(new r.a.C0824a(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
            return;
        }
        if (aVar.f63820b == v.a.CANCELLED) {
            f7.delete(str);
            ((G) enqueueNew).invoke();
            return;
        }
        C6627B b11 = C6627B.b(workRequest.c(), aVar.f63819a, null, null, null, 0, 0L, 0, 1048574);
        try {
            p processor = this_enqueueUniquelyNamedPeriodic.k();
            Intrinsics.checkNotNullExpressionValue(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.n();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.c configuration = this_enqueueUniquelyNamedPeriodic.h();
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            List<r> schedulers = this_enqueueUniquelyNamedPeriodic.l();
            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            b(processor, workDatabase, configuration, schedulers, b11, workRequest.b());
            operation.a(androidx.work.r.f45549a);
        } catch (Throwable th2) {
            operation.a(new r.a.C0824a(th2));
        }
    }

    private static final void b(p pVar, final WorkDatabase workDatabase, androidx.work.c cVar, final List list, final C6627B c6627b, final Set set) {
        g5.C f7 = workDatabase.f();
        final String str = c6627b.f63799a;
        final C6627B m11 = f7.m(str);
        if (m11 == null) {
            throw new IllegalArgumentException(A0.b("Worker with ", str, " doesn't exist"));
        }
        if (m11.f63800b.a()) {
            return;
        }
        if (m11.f() ^ c6627b.f()) {
            StringBuilder sb2 = new StringBuilder("Can't update ");
            H h11 = H.f45317b;
            sb2.append((String) h11.invoke(m11));
            sb2.append(" Worker to ");
            throw new UnsupportedOperationException(o0.c(sb2, (String) h11.invoke(c6627b), " Worker. Update operation must preserve worker's type."));
        }
        final boolean g10 = pVar.g(str);
        if (!g10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((r) it.next()).d(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.F
            @Override // java.lang.Runnable
            public final void run() {
                WorkDatabase workDatabase2 = WorkDatabase.this;
                Intrinsics.checkNotNullParameter(workDatabase2, "$workDatabase");
                C6627B newWorkSpec = c6627b;
                Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
                C6627B oldWorkSpec = m11;
                Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
                List schedulers = list;
                Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
                String workSpecId = str;
                Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
                Set<String> tags = set;
                Intrinsics.checkNotNullParameter(tags, "$tags");
                g5.C f11 = workDatabase2.f();
                U g11 = workDatabase2.g();
                C6627B workSpec = C6627B.b(newWorkSpec, null, oldWorkSpec.f63800b, null, null, oldWorkSpec.f63809k, oldWorkSpec.f63812n, oldWorkSpec.c() + 1, 515069);
                Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                f11.a(workSpec);
                g11.a(workSpecId);
                g11.b(workSpecId, tags);
                if (g10) {
                    return;
                }
                f11.j(-1L, workSpecId);
                workDatabase2.e().delete(workSpecId);
            }
        });
        if (g10) {
            return;
        }
        s.b(cVar, workDatabase, list);
    }
}
