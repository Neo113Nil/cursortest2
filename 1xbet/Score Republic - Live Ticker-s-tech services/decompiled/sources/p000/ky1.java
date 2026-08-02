package p000;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends d12 {

    /* JADX INFO: renamed from: l */
    public char f4597l;

    /* JADX INFO: renamed from: m */
    public long f4598m;

    /* JADX INFO: renamed from: n */
    public String f4599n;

    /* JADX INFO: renamed from: o */
    public final wc1 f4600o;

    /* JADX INFO: renamed from: p */
    public final wc1 f4601p;

    /* JADX INFO: renamed from: q */
    public final wc1 f4602q;

    /* JADX INFO: renamed from: r */
    public final wc1 f4603r;

    /* JADX INFO: renamed from: s */
    public final wc1 f4604s;

    /* JADX INFO: renamed from: t */
    public final wc1 f4605t;

    /* JADX INFO: renamed from: u */
    public final wc1 f4606u;

    /* JADX INFO: renamed from: v */
    public final wc1 f4607v;

    /* JADX INFO: renamed from: w */
    public final wc1 f4608w;

    public ky1(f02 f02Var) {
        super(f02Var);
        this.f4597l = (char) 0;
        this.f4598m = -1L;
        this.f4600o = new wc1(this, 6, false, false);
        this.f4601p = new wc1(this, 6, true, false);
        this.f4602q = new wc1(this, 6, false, true);
        this.f4603r = new wc1(this, 5, false, false);
        this.f4604s = new wc1(this, 5, true, false);
        this.f4605t = new wc1(this, 5, false, true);
        this.f4606u = new wc1(this, 4, false, false);
        this.f4607v = new wc1(this, 3, false, false);
        this.f4608w = new wc1(this, 2, false, false);
    }

    /* JADX INFO: renamed from: I */
    public static iy1 m3106I(String str) {
        if (str == null) {
            return null;
        }
        return new iy1(str);
    }

    /* JADX INFO: renamed from: L */
    public static String m3107L(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strM3108M = m3108M(obj, z);
        String strM3108M2 = m3108M(obj2, z);
        String strM3108M3 = m3108M(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM3108M)) {
            sb.append(str2);
            sb.append(strM3108M);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM3108M2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM3108M2);
        }
        if (!TextUtils.isEmpty(strM3108M3)) {
            sb.append(str3);
            sb.append(strM3108M3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public static String m3108M(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof iy1) {
                return ((iy1) obj).f3746a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = f02.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: B */
    public final boolean mo0B() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final wc1 m3109E() {
        return this.f4600o;
    }

    /* JADX INFO: renamed from: F */
    public final wc1 m3110F() {
        return this.f4603r;
    }

    /* JADX INFO: renamed from: G */
    public final wc1 m3111G() {
        return this.f4607v;
    }

    /* JADX INFO: renamed from: H */
    public final wc1 m3112H() {
        return this.f4608w;
    }

    /* JADX INFO: renamed from: J */
    public final void m3113J(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m3114K(), i)) {
            Log.println(i, m3114K(), m3107L(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        p80.m3863h(str);
        a02 a02Var = ((f02) this.f7192j).f2248p;
        if (a02Var == null) {
            Log.println(6, m3114K(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!a02Var.f1519k) {
                Log.println(6, m3114K(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            a02Var.m6J(new gy1(this, i, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: K */
    public final String m3114K() {
        String str;
        synchronized (this) {
            try {
                if (this.f4599n == null) {
                    ((f02) ((f02) this.f7192j).f2245m.f7192j).getClass();
                    this.f4599n = "FA";
                }
                p80.m3863h(this.f4599n);
                str = this.f4599n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
