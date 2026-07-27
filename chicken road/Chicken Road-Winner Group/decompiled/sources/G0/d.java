package G0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f392a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.d f393b;

    /* renamed from: c, reason: collision with root package name */
    public final b f394c;

    public d(Context context, H0.d dVar, b bVar) {
        this.f392a = context;
        this.f393b = dVar;
        this.f394c = bVar;
    }

    public final void a(A0.k kVar, int i3, boolean z3) {
        Context context = this.f392a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(CharEncoding.UTF_8)));
        adler32.update(kVar.f69a.getBytes(Charset.forName(CharEncoding.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        x0.c cVar = kVar.f71c;
        adler32.update(allocate.putInt(K0.a.a(cVar)).array());
        byte[] bArr = kVar.f70b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i3) {
                        X0.a.p("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", kVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a3 = ((H0.i) this.f393b).a();
        String valueOf = String.valueOf(K0.a.a(cVar));
        String str = kVar.f69a;
        Cursor rawQuery = a3.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Cursor cursor = rawQuery;
            Long valueOf2 = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f394c;
            builder.setMinimumLatency(bVar.a(cVar, longValue, i3));
            Set set = ((c) bVar.f388b.get(cVar)).f391c;
            if (set.contains(e.f395a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f397c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f396b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", K0.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {kVar, Integer.valueOf(value), Long.valueOf(bVar.a(cVar, longValue, i3)), valueOf2, Integer.valueOf(i3)};
            String t3 = X0.a.t("JobInfoScheduler");
            if (Log.isLoggable(t3, 3)) {
                Log.d(t3, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
