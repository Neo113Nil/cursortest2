package androidx.work.impl.workers;

import B0.A0;
import B90.g0;
import Hm.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.C;
import androidx.work.impl.utils.futures.c;
import androidx.work.n;
import androidx.work.o;
import com.google.common.util.concurrent.m;
import d5.C6089d;
import d5.InterfaceC6088c;
import f5.C6437o;
import g5.C6627B;
import j5.C7283a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/n;", "Ld5/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ConstraintTrackingWorker extends n implements InterfaceC6088c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkerParameters f45533a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f45534b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f45535c;

    /* renamed from: d, reason: collision with root package name */
    private final c<n.a> f45536d;

    /* renamed from: e, reason: collision with root package name */
    private n f45537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f45533a = workerParameters;
        this.f45534b = new Object();
        this.f45536d = c.k();
    }

    public static void a(ConstraintTrackingWorker this$0) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f45536d.isCancelled()) {
            return;
        }
        String d11 = this$0.getInputData().d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        o e11 = o.e();
        Intrinsics.checkNotNullExpressionValue(e11, "get()");
        if (d11 == null || d11.length() == 0) {
            str = C7283a.f69451a;
            e11.c(str, "No worker to delegate to.");
            c<n.a> future = this$0.f45536d;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            future.j(new n.a.C0823a());
            return;
        }
        n a11 = this$0.getWorkerFactory().a(this$0.getApplicationContext(), d11, this$0.f45533a);
        this$0.f45537e = a11;
        if (a11 == null) {
            str6 = C7283a.f69451a;
            e11.a(str6, "No worker to delegate to.");
            c<n.a> future2 = this$0.f45536d;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            future2.j(new n.a.C0823a());
            return;
        }
        C i11 = C.i(this$0.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(i11, "getInstance(applicationContext)");
        g5.C f7 = i11.n().f();
        String uuid = this$0.getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        C6627B m11 = f7.m(uuid);
        if (m11 == null) {
            c<n.a> future3 = this$0.f45536d;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            int i12 = C7283a.f69452b;
            future3.j(new n.a.C0823a());
            return;
        }
        C6437o m12 = i11.m();
        Intrinsics.checkNotNullExpressionValue(m12, "workManagerImpl.trackers");
        C6089d c6089d = new C6089d(m12, this$0);
        c6089d.d(C7714v.a0(m11));
        String uuid2 = this$0.getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
        if (!c6089d.a(uuid2)) {
            str2 = C7283a.f69451a;
            e11.a(str2, "Constraints not met for delegate " + d11 + ". Requesting retry.");
            c<n.a> future4 = this$0.f45536d;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            future4.j(new n.a.b());
            return;
        }
        str3 = C7283a.f69451a;
        e11.a(str3, "Constraints met for delegate ".concat(d11));
        try {
            n nVar = this$0.f45537e;
            Intrinsics.f(nVar);
            m<n.a> startWork = nVar.startWork();
            Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
            startWork.a(new a(2, this$0, startWork), this$0.getBackgroundExecutor());
        } catch (Throwable th2) {
            str4 = C7283a.f69451a;
            e11.b(str4, A0.b("Delegated worker ", d11, " threw exception in startWork."), th2);
            synchronized (this$0.f45534b) {
                try {
                    if (!this$0.f45535c) {
                        c<n.a> future5 = this$0.f45536d;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        future5.j(new n.a.C0823a());
                    } else {
                        str5 = C7283a.f69451a;
                        e11.a(str5, "Constraints were unmet, Retrying.");
                        c<n.a> future6 = this$0.f45536d;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        future6.j(new n.a.b());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static void b(ConstraintTrackingWorker this$0, m innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.f45534b) {
            try {
                if (this$0.f45535c) {
                    c<n.a> future = this$0.f45536d;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    int i11 = C7283a.f69452b;
                    future.j(new n.a.b());
                } else {
                    this$0.f45536d.m(innerFuture);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d5.InterfaceC6088c
    public final void e(@NotNull ArrayList workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        o e11 = o.e();
        str = C7283a.f69451a;
        e11.a(str, "Constraints changed for " + workSpecs);
        synchronized (this.f45534b) {
            this.f45535c = true;
            Unit unit = Unit.f71690a;
        }
    }

    @Override // d5.InterfaceC6088c
    public final void f(@NotNull List<C6627B> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.n
    public final void onStopped() {
        super.onStopped();
        n nVar = this.f45537e;
        if (nVar == null || nVar.isStopped()) {
            return;
        }
        nVar.stop();
    }

    @Override // androidx.work.n
    @NotNull
    public final m<n.a> startWork() {
        getBackgroundExecutor().execute(new g0(this, 9));
        c<n.a> future = this.f45536d;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
