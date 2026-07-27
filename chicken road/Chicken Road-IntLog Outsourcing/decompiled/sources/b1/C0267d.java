package b1;

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
import f1.AbstractC0416a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import n2.AbstractC1341c;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4767a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.d f4768b;

    /* renamed from: c, reason: collision with root package name */
    public final C0265b f4769c;

    public C0267d(Context context, c1.d dVar, C0265b c0265b) {
        this.f4767a = context;
        this.f4768b = dVar;
        this.f4769c = c0265b;
    }

    public final void a(V0.i iVar, int i2, boolean z) {
        Context context = this.f4767a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f3208a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        S0.d dVar = iVar.f3210c;
        adler32.update(allocate.putInt(AbstractC0416a.a(dVar)).array());
        byte[] bArr = iVar.f3209b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        AbstractC1341c.f("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a6 = ((c1.i) this.f4768b).a();
        String valueOf = String.valueOf(AbstractC0416a.a(dVar));
        String str = iVar.f3208a;
        Cursor rawQuery = a6.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Cursor cursor = rawQuery;
            Long valueOf2 = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C0265b c0265b = this.f4769c;
            builder.setMinimumLatency(c0265b.a(dVar, longValue, i2));
            Set set = ((C0266c) c0265b.f4763b.get(dVar)).f4766c;
            if (set.contains(EnumC0268e.f4770a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC0268e.f4772c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC0268e.f4771b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC0416a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(c0265b.a(dVar, longValue, i2)), valueOf2, Integer.valueOf(i2)};
            String s2 = AbstractC1341c.s("JobInfoScheduler");
            if (Log.isLoggable(s2, 3)) {
                Log.d(s2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
