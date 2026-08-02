package E2;

import F2.C0252s;
import F2.C0254t;
import I2.J;
import I2.P;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzauj;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfnw;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h implements Runnable, zzauj {

    /* renamed from: A, reason: collision with root package name */
    public final Context f1922A;

    /* renamed from: B, reason: collision with root package name */
    public VersionInfoParcel f1923B;

    /* renamed from: C, reason: collision with root package name */
    public final VersionInfoParcel f1924C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1925D;

    /* renamed from: F, reason: collision with root package name */
    public int f1927F;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1931d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1932e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1933f;

    /* renamed from: x, reason: collision with root package name */
    public final ExecutorService f1934x;

    /* renamed from: y, reason: collision with root package name */
    public final zzfmc f1935y;

    /* renamed from: z, reason: collision with root package name */
    public Context f1936z;

    /* renamed from: a, reason: collision with root package name */
    public final Vector f1928a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1929b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f1930c = new AtomicReference();

    /* renamed from: E, reason: collision with root package name */
    public final CountDownLatch f1926E = new CountDownLatch(1);

    public h(Context context, VersionInfoParcel versionInfoParcel) {
        this.f1936z = context;
        this.f1922A = context;
        this.f1923B = versionInfoParcel;
        this.f1924C = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f1934x = newCachedThreadPool;
        zzbbp zzbbpVar = zzbby.zzcC;
        C0254t c0254t = C0254t.f2723d;
        boolean booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        this.f1925D = booleanValue;
        this.f1935y = zzfmc.zza(context, newCachedThreadPool, booleanValue);
        zzbbp zzbbpVar2 = zzbby.zzcz;
        zzbbw zzbbwVar = c0254t.f2726c;
        this.f1932e = ((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue();
        this.f1933f = ((Boolean) zzbbwVar.zzb(zzbby.zzcD)).booleanValue();
        if (((Boolean) zzbbwVar.zzb(zzbby.zzcB)).booleanValue()) {
            this.f1927F = 2;
        } else {
            this.f1927F = 1;
        }
        if (!((Boolean) zzbbwVar.zzb(zzbby.zzdF)).booleanValue()) {
            this.f1931d = b();
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzdz)).booleanValue()) {
            zzbza.zza.execute(this);
            return;
        }
        J2.d dVar = C0252s.f2717f.f2718a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzbza.zza.execute(this);
        } else {
            run();
        }
    }

    public final String a(Context context) {
        zzauj d7;
        if (!c() || (d7 = d()) == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return d7.zzf(context);
    }

    public final boolean b() {
        Context context = this.f1936z;
        R4.c cVar = new R4.c(this, 4);
        return new zzfnw(context, zzfnc.zzb(context, this.f1935y), cVar, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcA)).booleanValue()).zzd(1);
    }

    public final boolean c() {
        try {
            this.f1926E.await();
            return true;
        } catch (InterruptedException e7) {
            int i7 = J.f3546b;
            J2.j.h("Interrupted during GADSignals creation.", e7);
            return false;
        }
    }

    public final zzauj d() {
        return ((!this.f1932e || this.f1931d) ? this.f1927F : 1) == 2 ? (zzauj) this.f1930c.get() : (zzauj) this.f1929b.get();
    }

    public final void e() {
        Vector vector = this.f1928a;
        zzauj d7 = d();
        if (vector.isEmpty() || d7 == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                d7.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                d7.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void f(boolean z4) {
        String str = this.f1923B.f10834a;
        Context context = this.f1936z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzaqt zza = zzaqv.zza();
        zza.zza(z4);
        zza.zzb(str);
        this.f1929b.set(zzaun.zzt(context, new zzaul((zzaqv) zza.zzbr())));
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.f1926E;
        try {
            zzbbp zzbbpVar = zzbby.zzdF;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                this.f1931d = b();
            }
            boolean z4 = this.f1923B.f10837d;
            boolean z7 = false;
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzbi)).booleanValue() && z4) {
                z7 = true;
            }
            if (((!this.f1932e || this.f1931d) ? this.f1927F : 1) == 1) {
                f(z7);
                if (this.f1927F == 2) {
                    this.f1934x.execute(new g(this, z7, 0));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = this.f1936z;
                    VersionInfoParcel versionInfoParcel = this.f1923B;
                    boolean z8 = this.f1925D;
                    zzaqt zza = zzaqv.zza();
                    zza.zza(z7);
                    zza.zzb(versionInfoParcel.f10834a);
                    zzaqv zzaqvVar = (zzaqv) zza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzaug zza2 = zzaug.zza(context, zzaqvVar, z8);
                    this.f1930c.set(zza2);
                    if (this.f1933f && !zza2.zzr()) {
                        this.f1927F = 1;
                        f(z7);
                    }
                } catch (NullPointerException e7) {
                    this.f1927F = 1;
                    f(z7);
                    this.f1935y.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e7);
                }
            }
            countDownLatch.countDown();
            this.f1936z = null;
            this.f1923B = null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            this.f1936z = null;
            this.f1923B = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!c()) {
            return "";
        }
        zzauj d7 = d();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkG)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            P.i(view, 4);
        }
        if (d7 == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return d7.zze(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzf(Context context) {
        return a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzg(Context context) {
        try {
            return (String) zzgbc.zzj(new f(0, this, context), this.f1934x).get(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzcT)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauc.zza(context, this.f1924C.f10834a, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzh(Context context, View view, Activity activity) {
        zzbbp zzbbpVar = zzbby.zzkF;
        C0254t c0254t = C0254t.f2723d;
        boolean booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        zzbbw zzbbwVar = c0254t.f2726c;
        if (!booleanValue) {
            zzauj d7 = d();
            if (((Boolean) zzbbwVar.zzb(zzbby.zzkG)).booleanValue()) {
                P p5 = o.f1952C.f1957c;
                P.i(view, 2);
            }
            return d7 != null ? d7.zzh(context, view, activity) : "";
        }
        if (!c()) {
            return "";
        }
        zzauj d8 = d();
        if (((Boolean) zzbbwVar.zzb(zzbby.zzkG)).booleanValue()) {
            P p7 = o.f1952C.f1957c;
            P.i(view, 2);
        }
        return d8 != null ? d8.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzk(MotionEvent motionEvent) {
        zzauj d7 = d();
        if (d7 == null) {
            this.f1928a.add(new Object[]{motionEvent});
        } else {
            e();
            d7.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzl(int i7, int i8, int i9) {
        zzauj d7 = d();
        if (d7 == null) {
            this.f1928a.add(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
        } else {
            e();
            d7.zzl(i7, i8, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauj d7;
        zzauj d8;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcZ)).booleanValue()) {
            if (this.f1926E.getCount() != 0 || (d8 = d()) == null) {
                return;
            }
            d8.zzn(stackTraceElementArr);
            return;
        }
        if (!c() || (d7 = d()) == null) {
            return;
        }
        d7.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzo(View view) {
        zzauj d7 = d();
        if (d7 != null) {
            d7.zzo(view);
        }
    }
}
