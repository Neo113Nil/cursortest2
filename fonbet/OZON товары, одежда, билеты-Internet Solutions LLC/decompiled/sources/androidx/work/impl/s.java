package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemjob.SystemJobService;
import g5.C6627B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45485a = androidx.work.o.i("Schedulers");

    @NonNull
    static androidx.work.impl.background.systemjob.e a(@NonNull Context context, @NonNull C c11) {
        androidx.work.impl.background.systemjob.e eVar = new androidx.work.impl.background.systemjob.e(context, c11);
        h5.l.a(context, SystemJobService.class, true);
        androidx.work.o.e().a(f45485a, "Created SystemJobScheduler and enabled SystemJobService");
        return eVar;
    }

    public static void b(@NonNull androidx.work.c cVar, @NonNull WorkDatabase workDatabase, List<r> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        g5.C f7 = workDatabase.f();
        workDatabase.beginTransaction();
        try {
            ArrayList q11 = f7.q(cVar.d());
            ArrayList o11 = f7.o();
            if (q11.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = q11.iterator();
                while (it.hasNext()) {
                    f7.j(currentTimeMillis, ((C6627B) it.next()).f63799a);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (q11.size() > 0) {
                C6627B[] c6627bArr = (C6627B[]) q11.toArray(new C6627B[q11.size()]);
                for (r rVar : list) {
                    if (rVar.c()) {
                        rVar.a(c6627bArr);
                    }
                }
            }
            if (o11.size() > 0) {
                C6627B[] c6627bArr2 = (C6627B[]) o11.toArray(new C6627B[o11.size()]);
                for (r rVar2 : list) {
                    if (!rVar2.c()) {
                        rVar2.a(c6627bArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
