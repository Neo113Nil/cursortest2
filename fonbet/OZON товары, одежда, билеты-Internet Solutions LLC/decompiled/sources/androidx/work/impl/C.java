package androidx.work.impl;

import J4.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import f5.C6437o;
import g5.C6643p;
import h5.AbstractRunnableC6804b;
import i5.C7009b;
import i5.InterfaceC7008a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class C extends androidx.work.w {

    /* renamed from: k, reason: collision with root package name */
    private static C f45289k;

    /* renamed from: l, reason: collision with root package name */
    private static C f45290l;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f45291m;

    /* renamed from: a, reason: collision with root package name */
    private Context f45292a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.c f45293b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f45294c;

    /* renamed from: d, reason: collision with root package name */
    private C7009b f45295d;

    /* renamed from: e, reason: collision with root package name */
    private List<r> f45296e;

    /* renamed from: f, reason: collision with root package name */
    private p f45297f;

    /* renamed from: g, reason: collision with root package name */
    private h5.m f45298g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45299h;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f45300i;

    /* renamed from: j, reason: collision with root package name */
    private final C6437o f45301j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        androidx.work.o.i("WorkManagerImpl");
        f45289k = null;
        f45290l = null;
        f45291m = new Object();
    }

    public C(@NonNull Context context, @NonNull androidx.work.c cVar, @NonNull C7009b c7009b) {
        s.a a11;
        boolean z11 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        h5.o queryExecutor = c7009b.c();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        if (z11) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            a11 = new s.a(WorkDatabase.class, null, context2);
            a11.c();
        } else {
            a11 = J4.r.a(WorkDatabase.class, "androidx.work.workdb", context2);
            a11.h(new w(context2));
        }
        a11.i(queryExecutor);
        a11.a(C5474b.f45361a);
        a11.b(C5480h.f45457a);
        a11.b(new q(context2, 2, 3));
        a11.b(C5481i.f45458a);
        a11.b(C5482j.f45459a);
        a11.b(new q(context2, 5, 6));
        a11.b(C5483k.f45460a);
        a11.b(C5484l.f45461a);
        a11.b(C5485m.f45462a);
        a11.b(new D(context2));
        a11.b(new q(context2, 10, 11));
        a11.b(C5477e.f45428a);
        a11.b(C5478f.f45429a);
        a11.b(C5479g.f45456a);
        a11.e();
        WorkDatabase workDatabase = (WorkDatabase) a11.d();
        Context applicationContext = context.getApplicationContext();
        androidx.work.o.h(new o.a(cVar.e()));
        C6437o c6437o = new C6437o(applicationContext, c7009b);
        this.f45301j = c6437o;
        List<r> asList = Arrays.asList(s.a(applicationContext, this), new c5.b(applicationContext, cVar, c6437o, this));
        p pVar = new p(context, cVar, c7009b, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.f45292a = applicationContext2;
        this.f45293b = cVar;
        this.f45295d = c7009b;
        this.f45294c = workDatabase;
        this.f45296e = asList;
        this.f45297f = pVar;
        this.f45298g = new h5.m(workDatabase);
        this.f45299h = false;
        if (a.a(applicationContext2)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f45295d.a(new ForceStopRunnable(applicationContext2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static C i(@NonNull Context context) {
        C c11;
        Object obj = f45291m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    c11 = f45289k;
                    if (c11 == null) {
                        c11 = f45290l;
                    }
                }
                return c11;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (c11 == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof c.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            q(applicationContext, ((c.b) applicationContext).getWorkManagerConfiguration());
            c11 = i(applicationContext);
        }
        return c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.C.f45290l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.C.f45290l = new androidx.work.impl.C(r4, r5, new i5.C7009b(r5.g()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        androidx.work.impl.C.f45289k = androidx.work.impl.C.f45290l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(@NonNull Context context, @NonNull androidx.work.c cVar) {
        synchronized (f45291m) {
            try {
                C c11 = f45289k;
                if (c11 != null && f45290l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.w
    @NonNull
    public final n a(@NonNull String str) {
        AbstractRunnableC6804b c11 = AbstractRunnableC6804b.c(this, str);
        this.f45295d.a(c11);
        return c11.d();
    }

    @Override // androidx.work.w
    @NonNull
    public final androidx.work.r b(@NonNull String str, @NonNull androidx.work.g gVar, @NonNull List<androidx.work.q> list) {
        return new v(this, str, gVar, list).t();
    }

    @NonNull
    public final v c(@NonNull String str, @NonNull androidx.work.g gVar, @NonNull List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new v(this, str, gVar, list);
    }

    @NonNull
    public final void d(@NonNull UUID uuid) {
        this.f45295d.a(AbstractRunnableC6804b.b(this, uuid));
    }

    @NonNull
    public final androidx.work.r e(@NonNull List<? extends androidx.work.x> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new v(this, list).t();
    }

    @NonNull
    public final androidx.work.r f(@NonNull androidx.work.f fVar, @NonNull final androidx.work.t workRequest) {
        if (fVar != androidx.work.f.UPDATE) {
            return new v(this, "NotificationChannelStateWorker", fVar == androidx.work.f.KEEP ? androidx.work.g.KEEP : androidx.work.g.REPLACE, Collections.singletonList(workRequest)).t();
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("NotificationChannelStateWorker", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final n nVar = new n();
        final G g10 = new G(workRequest, this, nVar);
        this.f45295d.c().execute(new Runnable() { // from class: androidx.work.impl.E
            @Override // java.lang.Runnable
            public final void run() {
                Function0 function0 = g10;
                I.a(C.this, nVar, function0, workRequest);
            }
        });
        return nVar;
    }

    @NonNull
    public final Context g() {
        return this.f45292a;
    }

    @NonNull
    public final androidx.work.c h() {
        return this.f45293b;
    }

    @NonNull
    public final h5.m j() {
        return this.f45298g;
    }

    @NonNull
    public final p k() {
        return this.f45297f;
    }

    @NonNull
    public final List<r> l() {
        return this.f45296e;
    }

    @NonNull
    public final C6437o m() {
        return this.f45301j;
    }

    @NonNull
    public final WorkDatabase n() {
        return this.f45294c;
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c o() {
        h5.r a11 = h5.r.a(this);
        this.f45295d.c().execute(a11);
        return a11.b();
    }

    @NonNull
    public final InterfaceC7008a p() {
        return this.f45295d;
    }

    public final void r() {
        synchronized (f45291m) {
            try {
                this.f45299h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f45300i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f45300i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        androidx.work.impl.background.systemjob.e.b(this.f45292a);
        this.f45294c.f().n();
        s.b(this.f45293b, this.f45294c, this.f45296e);
    }

    public final void t(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f45291m) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f45300i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f45300i = pendingResult;
                if (this.f45299h) {
                    pendingResult.finish();
                    this.f45300i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(@NonNull t tVar, WorkerParameters.a aVar) {
        this.f45295d.a(new h5.p(this, tVar, aVar));
    }

    public final void v(@NonNull C6643p c6643p) {
        this.f45295d.a(new h5.s(this, new t(c6643p), true));
    }

    public final void w(@NonNull t tVar) {
        this.f45295d.a(new h5.s(this, tVar, false));
    }
}
