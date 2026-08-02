package R1;

import Q2.r;
import T2.E;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.C1355nt;
import com.google.android.gms.internal.ads.C1534rt;
import com.google.android.gms.internal.ads.C1579st;
import com.google.android.gms.internal.ads.C1714vt;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F7;
import java.util.Arrays;
import java.util.WeakHashMap;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;

/* loaded from: classes.dex */
public final class b implements InterfaceC2092b, InterfaceC2093c {

    /* renamed from: k, reason: collision with root package name */
    public boolean f5126k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5127l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5128m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5129n;

    /* renamed from: o, reason: collision with root package name */
    public Object f5130o;

    public b() {
        this.f5126k = false;
        this.f5129n = new WeakHashMap();
        this.f5128m = new E(0, this);
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        synchronized (this.f5130o) {
            try {
                if (this.f5127l) {
                    return;
                }
                this.f5127l = true;
                try {
                    C1714vt c1714vt = (C1714vt) ((C1579st) this.f5128m).t();
                    C1534rt c1534rt = new C1534rt(1, ((C1355nt) this.f5129n).d());
                    Parcel N5 = c1714vt.N();
                    F5.c(N5, c1534rt);
                    c1714vt.d1(N5, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (this.f5126k && !this.f5127l) {
                    int length = ((long[]) this.f5128m).length;
                    int i = 0;
                    while (true) {
                        int i5 = 1;
                        if (i >= length) {
                            this.f5127l = true;
                            this.f5126k = false;
                            return (int[]) this.f5130o;
                        }
                        boolean z3 = ((long[]) this.f5128m)[i] > 0;
                        boolean[] zArr = (boolean[]) this.f5129n;
                        if (z3 != zArr[i]) {
                            int[] iArr = (int[]) this.f5130o;
                            if (!z3) {
                                i5 = 2;
                            }
                            iArr[i] = i5;
                        } else {
                            ((int[]) this.f5130o)[i] = 0;
                        }
                        zArr[i] = z3;
                        i++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public synchronized void b(Context context) {
        try {
            if (this.f5126k) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f5130o = applicationContext;
            if (applicationContext == null) {
                this.f5130o = context;
            }
            F7.a((Context) this.f5130o);
            A7 a7 = F7.f8719L3;
            r rVar = r.f5053d;
            this.f5127l = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) rVar.f5056c.a(F7.Ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f5130o).registerReceiver((E) this.f5128m, intentFilter);
            } else {
                ((Context) this.f5130o).registerReceiver((E) this.f5128m, intentFilter, 4);
            }
            this.f5126k = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
        synchronized (this.f5130o) {
            try {
                if (!((C1579st) this.f5128m).a()) {
                    if (((C1579st) this.f5128m).h()) {
                    }
                    Binder.flushPendingCommands();
                }
                ((C1579st) this.f5128m).l();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, E e3) {
        if (this.f5127l) {
            ((WeakHashMap) this.f5129n).remove(e3);
        } else {
            context.unregisterReceiver(e3);
        }
    }

    public b(Context context, Looper looper, C1355nt c1355nt) {
        this.f5130o = new Object();
        this.f5126k = false;
        this.f5127l = false;
        this.f5129n = c1355nt;
        this.f5128m = new C1579st(12800000, context, looper, this, this);
    }

    public b(int i) {
        long[] jArr = new long[i];
        this.f5128m = jArr;
        boolean[] zArr = new boolean[i];
        this.f5129n = zArr;
        this.f5130o = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
    }

    @Override // m3.InterfaceC2093c
    public void Y(j3.b bVar) {
    }
}
