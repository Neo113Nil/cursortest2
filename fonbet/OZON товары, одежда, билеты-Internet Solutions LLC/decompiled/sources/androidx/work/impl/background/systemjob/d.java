package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.d;
import androidx.work.o;
import androidx.work.p;
import g5.C6627B;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final String f45418b = o.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f45419a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45420a;

        static {
            int[] iArr = new int[p.values().length];
            f45420a = iArr;
            try {
                iArr[p.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45420a[p.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45420a[p.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45420a[p.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45420a[p.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    d(@NonNull Context context) {
        this.f45419a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final JobInfo a(C6627B c6627b, int i11) {
        int i12;
        androidx.work.d dVar = c6627b.f63808j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c6627b.f63799a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c6627b.c());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c6627b.f());
        JobInfo.Builder extras = new JobInfo.Builder(i11, this.f45419a).setRequiresCharging(dVar.g()).setRequiresDeviceIdle(dVar.h()).setExtras(persistableBundle);
        p d11 = dVar.d();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || d11 != p.TEMPORARILY_UNMETERED) {
            int i14 = a.f45420a[d11.ordinal()];
            if (i14 != 1) {
                i12 = 2;
                if (i14 != 2) {
                    if (i14 != 3) {
                        i12 = 4;
                        if (i14 == 4) {
                            i12 = 3;
                        } else if (i14 != 5) {
                            o.e().a(f45418b, "API version too low. Cannot convert network type value " + d11);
                        }
                    }
                }
                i12 = 1;
            } else {
                i12 = 0;
            }
            extras.setRequiredNetworkType(i12);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!dVar.h()) {
            extras.setBackoffCriteria(c6627b.f63811m, c6627b.f63810l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(c6627b.a() - System.currentTimeMillis(), 0L);
        if (i13 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c6627b.f63815q) {
            extras.setImportantWhileForeground(true);
        }
        if (dVar.e()) {
            for (d.b bVar : dVar.c()) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(bVar.a(), bVar.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.b());
            extras.setTriggerContentMaxDelay(dVar.a());
        }
        extras.setPersisted(false);
        int i15 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(dVar.f());
        extras.setRequiresStorageNotLow(dVar.i());
        Object[] objArr = c6627b.f63809k > 0;
        boolean z11 = max > 0;
        if (i15 >= 31 && c6627b.f63815q && objArr == false && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
