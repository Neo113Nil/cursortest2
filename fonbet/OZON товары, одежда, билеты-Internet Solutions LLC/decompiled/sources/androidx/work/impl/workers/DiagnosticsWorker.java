package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C;
import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import androidx.work.o;
import g5.InterfaceC6638k;
import g5.U;
import g5.r;
import j5.C7284b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public final n.a doWork() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C i11 = C.i(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(i11, "getInstance(applicationContext)");
        WorkDatabase n11 = i11.n();
        Intrinsics.checkNotNullExpressionValue(n11, "workManager.workDatabase");
        g5.C f7 = n11.f();
        r d11 = n11.d();
        U g10 = n11.g();
        InterfaceC6638k c11 = n11.c();
        ArrayList k11 = f7.k(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList t2 = f7.t();
        ArrayList o11 = f7.o();
        if (!k11.isEmpty()) {
            o e11 = o.e();
            str5 = C7284b.f69453a;
            e11.f(str5, "Recently completed work:\n\n");
            o e12 = o.e();
            str6 = C7284b.f69453a;
            e12.f(str6, C7284b.b(d11, g10, c11, k11));
        }
        if (!t2.isEmpty()) {
            o e13 = o.e();
            str3 = C7284b.f69453a;
            e13.f(str3, "Running work:\n\n");
            o e14 = o.e();
            str4 = C7284b.f69453a;
            e14.f(str4, C7284b.b(d11, g10, c11, t2));
        }
        if (!o11.isEmpty()) {
            o e15 = o.e();
            str = C7284b.f69453a;
            e15.f(str, "Enqueued work:\n\n");
            o e16 = o.e();
            str2 = C7284b.f69453a;
            e16.f(str2, C7284b.b(d11, g10, c11, o11));
        }
        n.a.c cVar = new n.a.c();
        Intrinsics.checkNotNullExpressionValue(cVar, "success()");
        return cVar;
    }
}
