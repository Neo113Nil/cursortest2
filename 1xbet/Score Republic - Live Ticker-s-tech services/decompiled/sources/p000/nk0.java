package p000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {

    /* JADX INFO: renamed from: a */
    public final f50 f5446a = new f50(4);

    /* JADX INFO: renamed from: b */
    public final mk0 f5447b = new mk0(0);

    /* JADX INFO: renamed from: c */
    public final HashMap f5448c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f5449d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f5450e;

    /* JADX INFO: renamed from: f */
    public int f5451f;

    public nk0(int i) {
        this.f5450e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3541a(int i, Class cls) {
        NavigableMap navigableMapM3546f = m3546f(cls);
        Integer num = (Integer) navigableMapM3546f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM3546f.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM3546f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final void m3542b(int i) {
        while (this.f5451f > i) {
            Object objM1623Z = this.f5446a.m1623Z();
            o80.m3646g(objM1623Z);
            C0946zc c0946zcM3544d = m3544d(objM1623Z.getClass());
            this.f5451f -= c0946zcM3544d.m5874b() * c0946zcM3544d.m5873a(objM1623Z);
            m3541a(c0946zcM3544d.m5873a(objM1623Z), objM1623Z.getClass());
            if (Log.isLoggable(c0946zcM3544d.m5875c(), 2)) {
                Log.v(c0946zcM3544d.m5875c(), "evicted: " + c0946zcM3544d.m5873a(objM1623Z));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m3543c(int i, Class cls) {
        lk0 lk0Var;
        int i2;
        try {
            Integer num = (Integer) m3546f(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f5451f) == 0 || this.f5450e / i2 >= 2 || num.intValue() <= i * 8);
            mk0 mk0Var = this.f5447b;
            if (z) {
                int iIntValue = num.intValue();
                jw0 jw0VarM3399B = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
                if (jw0VarM3399B == null) {
                    jw0VarM3399B = mk0Var.m3399B();
                }
                lk0Var = (lk0) jw0VarM3399B;
                lk0Var.f4817b = iIntValue;
                lk0Var.f4818c = cls;
            } else {
                jw0 jw0VarM3399B2 = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
                if (jw0VarM3399B2 == null) {
                    jw0VarM3399B2 = mk0Var.m3399B();
                }
                lk0Var = (lk0) jw0VarM3399B2;
                lk0Var.f4817b = i;
                lk0Var.f4818c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m3545e(lk0Var, cls);
    }

    /* JADX INFO: renamed from: d */
    public final C0946zc m3544d(Class cls) {
        C0946zc c0946zc;
        HashMap map = this.f5449d;
        C0946zc c0946zc2 = (C0946zc) map.get(cls);
        if (c0946zc2 != null) {
            return c0946zc2;
        }
        if (cls.equals(int[].class)) {
            c0946zc = new C0946zc(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C0270h1.m2190f("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c0946zc = new C0946zc(0);
        }
        map.put(cls, c0946zc);
        return c0946zc;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3545e(lk0 lk0Var, Class cls) {
        C0946zc c0946zcM3544d = m3544d(cls);
        Object objM1607J = this.f5446a.m1607J(lk0Var);
        if (objM1607J != null) {
            this.f5451f -= c0946zcM3544d.m5874b() * c0946zcM3544d.m5873a(objM1607J);
            m3541a(c0946zcM3544d.m5873a(objM1607J), cls);
        }
        if (objM1607J != null) {
            return objM1607J;
        }
        if (Log.isLoggable(c0946zcM3544d.m5875c(), 2)) {
            Log.v(c0946zcM3544d.m5875c(), "Allocated " + lk0Var.f4817b + " bytes");
        }
        int i = lk0Var.f4817b;
        switch (c0946zcM3544d.f9731a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: f */
    public final NavigableMap m3546f(Class cls) {
        HashMap map = this.f5448c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3547g(Object obj) {
        Class<?> cls = obj.getClass();
        C0946zc c0946zcM3544d = m3544d(cls);
        int iM5873a = c0946zcM3544d.m5873a(obj);
        int iM5874b = c0946zcM3544d.m5874b() * iM5873a;
        if (iM5874b <= this.f5450e / 2) {
            mk0 mk0Var = this.f5447b;
            jw0 jw0VarM3399B = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
            if (jw0VarM3399B == null) {
                jw0VarM3399B = mk0Var.m3399B();
            }
            lk0 lk0Var = (lk0) jw0VarM3399B;
            lk0Var.f4817b = iM5873a;
            lk0Var.f4818c = cls;
            this.f5446a.m1621X(lk0Var, obj);
            NavigableMap navigableMapM3546f = m3546f(cls);
            Integer num = (Integer) navigableMapM3546f.get(Integer.valueOf(lk0Var.f4817b));
            Integer numValueOf = Integer.valueOf(lk0Var.f4817b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM3546f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f5451f += iM5874b;
            m3542b(this.f5450e);
        }
    }
}
