package B4;

import E4.RunnableC0181n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import v0.AbstractC1663a;
import w1.C1726n0;

/* renamed from: B4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0061e {

    /* renamed from: a, reason: collision with root package name */
    public final Z f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f1150b;

    public C0061e(Z z4, Y y4) {
        this.f1149a = z4;
        this.f1150b = y4;
    }

    public final Task a() {
        Task task;
        AbstractC1663a.i(1, "AggregateSource must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1726n0 c1726n0 = this.f1149a.f1136b.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            E4.t tVar = (E4.t) c1726n0.f17806c;
            E4.C c3 = this.f1149a.f1135a;
            tVar.e();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            tVar.f2232d.a(new RunnableC0181n(tVar, c3, this.f1150b, taskCompletionSource2, 0));
            task = taskCompletionSource2.getTask();
        }
        task.continueWith(L4.l.f4377b, new B1.c(2, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0061e)) {
            return false;
        }
        C0061e c0061e = (C0061e) obj;
        return this.f1149a.equals(c0061e.f1149a) && this.f1150b.equals(c0061e.f1150b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1149a, this.f1150b);
    }
}
