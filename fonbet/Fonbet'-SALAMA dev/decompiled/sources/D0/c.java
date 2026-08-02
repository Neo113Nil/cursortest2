package D0;

import A1.L0;
import F2.C0254t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1626a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1627b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1628c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1629d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1630e;

    public c() {
        this.f1626a = false;
        this.f1629d = new WeakHashMap();
        this.f1628c = new L0(this, 1);
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (this.f1626a && !this.f1627b) {
                    int length = ((long[]) this.f1628c).length;
                    int i7 = 0;
                    while (true) {
                        int i8 = 1;
                        if (i7 >= length) {
                            this.f1627b = true;
                            this.f1626a = false;
                            return (int[]) this.f1630e;
                        }
                        boolean z4 = ((long[]) this.f1628c)[i7] > 0;
                        boolean[] zArr = (boolean[]) this.f1629d;
                        if (z4 != zArr[i7]) {
                            int[] iArr = (int[]) this.f1630e;
                            if (!z4) {
                                i8 = 2;
                            }
                            iArr[i7] = i8;
                        } else {
                            ((int[]) this.f1630e)[i7] = 0;
                        }
                        zArr[i7] = z4;
                        i7++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public synchronized void b(Context context) {
        try {
            if (this.f1626a) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f1630e = applicationContext;
            if (applicationContext == null) {
                this.f1630e = context;
            }
            zzbby.zza((Context) this.f1630e);
            zzbbp zzbbpVar = zzbby.zzdZ;
            C0254t c0254t = C0254t.f2723d;
            this.f1627b = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzkY)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f1630e).registerReceiver((L0) this.f1628c, intentFilter);
            } else {
                ((Context) this.f1630e).registerReceiver((L0) this.f1628c, intentFilter, 4);
            }
            this.f1626a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f1627b) {
            ((WeakHashMap) this.f1629d).remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public c(int i7) {
        long[] jArr = new long[i7];
        this.f1628c = jArr;
        boolean[] zArr = new boolean[i7];
        this.f1629d = zArr;
        this.f1630e = new int[i7];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
