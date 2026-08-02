package p2;

import androidx.work.impl.WorkDatabase;

/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2248f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f18701a;

    public /* synthetic */ C2248f(WorkDatabase workDatabase) {
        this.f18701a = workDatabase;
    }

    public int a(int i) {
        WorkDatabase workDatabase;
        int i5;
        synchronized (C2248f.class) {
            try {
                workDatabase = this.f18701a;
                workDatabase.c();
                Long i6 = workDatabase.j().i("next_job_scheduler_id");
                int intValue = i6 != null ? i6.intValue() : 0;
                workDatabase.j().k(new o2.c("next_job_scheduler_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
                i5 = (intValue >= 0 && intValue <= i) ? intValue : 0;
                this.f18701a.j().k(new o2.c("next_job_scheduler_id", 1));
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i5;
    }
}
