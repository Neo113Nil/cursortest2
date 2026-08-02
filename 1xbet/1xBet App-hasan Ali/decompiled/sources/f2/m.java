package f2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.C1327n9;
import com.google.android.gms.internal.ads.Ei;
import com.google.android.gms.internal.ads.OE;
import com.google.android.gms.internal.ads.PE;
import com.google.android.gms.internal.ads.Yj;
import t3.InterfaceC2423b;

/* loaded from: classes.dex */
public final class m implements Ei, Yj, InterfaceC2423b {

    /* renamed from: m, reason: collision with root package name */
    public static m f17001m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17002k;

    /* renamed from: l, reason: collision with root package name */
    public int f17003l;

    public static synchronized m d() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f17001m == null) {
                    f17001m = new m(3, 0);
                }
                mVar = f17001m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.f17003l <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f17003l <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // t3.InterfaceC2423b
    public int c(Context context, String str) {
        return this.f17003l;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f17003l <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // t3.InterfaceC2423b
    public int g(Context context, String str, boolean z3) {
        return 0;
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f17003l <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int i() {
        int i = this.f17003l;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f17002k) {
            case 3:
                ((S2.m) obj).d1(this.f17003l);
                break;
            case 7:
                ((PE) obj).f0(this.f17003l);
                break;
            case 8:
                ((PE) obj).C(this.f17003l);
                break;
            default:
                ((PE) obj).l(this.f17003l);
                break;
        }
    }

    public /* synthetic */ m(int i, int i5) {
        this.f17002k = i5;
        this.f17003l = i;
    }

    public /* synthetic */ m(OE oe, int i) {
        this.f17002k = 8;
        this.f17003l = i;
    }

    public /* synthetic */ m(OE oe, int i, long j5) {
        this.f17002k = 7;
        this.f17003l = i;
    }

    public /* synthetic */ m(OE oe, int i, C1327n9 c1327n9, C1327n9 c1327n92) {
        this.f17002k = 9;
        this.f17003l = i;
    }

    public /* synthetic */ m(m mVar) {
        this.f17002k = 5;
        this.f17003l = mVar.f17003l;
    }
}
