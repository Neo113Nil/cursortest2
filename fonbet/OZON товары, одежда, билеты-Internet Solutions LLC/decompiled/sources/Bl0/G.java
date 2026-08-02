package Bl0;

import Al0.c;
import Sc.InterfaceC4008j;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.time.b;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;
import ve.EnumC10311b;

/* loaded from: classes8.dex */
public final class G extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f3918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Al0.b f3919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i11, Al0.b bVar) {
        super(0);
        this.f3918b = i11;
        this.f3919c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i11;
        int i12 = 0;
        I i13 = this.f3918b;
        if (!i13.f3926f) {
            C2657s source = new C2657s(i13);
            Intrinsics.checkNotNullParameter(source, "source");
            lm0.i iVar = new lm0.i(source);
            int i14 = jm0.e.f70218e;
            lm0.q.a(lm0.t.a(iVar, jm0.e.c()), new C2663y(i13), new C(i13));
            Context context = i13.f3923c.f3953a;
            Object systemService = context.getSystemService((Class<Object>) JobScheduler.class);
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService(JobScheduler::class.java)");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
            if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
                Iterator<T> it = allPendingJobs.iterator();
                while (it.hasNext()) {
                    if (((JobInfo) it.next()).getId() == 88123556) {
                        break;
                    }
                }
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) SendMetricsEventJobService.class);
            List<JobInfo> allPendingJobs2 = jobScheduler.getAllPendingJobs();
            Intrinsics.checkNotNullExpressionValue(allPendingJobs2, "jobScheduler.allPendingJobs");
            if ((allPendingJobs2 instanceof Collection) && allPendingJobs2.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it2 = allPendingJobs2.iterator();
                i11 = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.d(((JobInfo) it2.next()).getService(), componentName) && (i11 = i11 + 1) < 0) {
                        C7714v.N0();
                        throw null;
                    }
                }
            }
            JobInfo.Builder builder = new JobInfo.Builder(88123556, componentName);
            b.Companion companion = kotlin.time.b.INSTANCE;
            JobInfo.Builder persisted = builder.setPeriodic(kotlin.time.b.h(kotlin.time.c.g(Integer.parseInt("1440"), EnumC10311b.MINUTES))).setPersisted(true);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("pending_jobs_count", i11);
            jobScheduler.schedule(persisted.setExtras(persistableBundle).build());
            i13.f3926f = true;
        }
        Al0.b metricsEvent = this.f3919c;
        E messageBuilder = new E(metricsEvent);
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        C2649j c2649j = i13.f3922b;
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        H h11 = c2649j.f3982a;
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        F messageBuilder2 = new F(metricsEvent);
        Intrinsics.checkNotNullParameter(messageBuilder2, "messageBuilder");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bytes = W.a(metricsEvent).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        C2664z persistentMetricsEventDto = new C2664z(value, bytes);
        InterfaceC4008j interfaceC4008j = h11.f3920a.f3998b;
        Intrinsics.checkNotNullParameter(persistentMetricsEventDto, "persistentMetricsEventDto");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", value);
        contentValues.put("metrics_event", bytes);
        try {
            ((SQLiteDatabase) interfaceC4008j.getValue()).beginTransactionNonExclusive();
            long insert = ((SQLiteDatabase) interfaceC4008j.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) interfaceC4008j.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) interfaceC4008j.getValue()).endTransaction();
            if (insert != -1) {
                C2661w messageBuilder3 = new C2661w(persistentMetricsEventDto);
                Intrinsics.checkNotNullParameter(messageBuilder3, "messageBuilder");
                return Unit.f71690a;
            }
            StringBuilder sb2 = new StringBuilder("Saving error ");
            sb2.append((Object) ("MetricsEventUuid(value=" + value + ')'));
            String sb3 = sb2.toString();
            C2660v messageBuilder4 = new C2660v(sb3, i12);
            Intrinsics.checkNotNullParameter(messageBuilder4, "messageBuilder");
            throw new c.C0040c(sb3);
        } finally {
        }
    }
}
