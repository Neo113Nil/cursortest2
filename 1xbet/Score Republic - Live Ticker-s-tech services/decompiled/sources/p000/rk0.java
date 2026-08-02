package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class rk0 {

    /* JADX INFO: renamed from: a */
    public final int f6866a;

    /* JADX INFO: renamed from: b */
    public final jg0 f6867b;

    /* JADX INFO: renamed from: c */
    public final u90 f6868c;

    /* JADX INFO: renamed from: d */
    public int f6869d;

    /* JADX INFO: renamed from: e */
    public int f6870e;

    /* JADX INFO: renamed from: f */
    public int f6871f;

    public rk0(int i) {
        this.f6866a = i;
        if (i <= 0) {
            C0270h1.m2190f("maxSize <= 0");
            throw null;
        }
        this.f6867b = new jg0(2);
        this.f6868c = new u90(5);
    }

    /* JADX INFO: renamed from: a */
    public Object mo3295a(Object obj) {
        obj.getClass();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m4362b(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.f6868c) {
            jg0 jg0Var = this.f6867b;
            jg0Var.getClass();
            Object obj2 = ((LinkedHashMap) jg0Var.f3922k).get(obj);
            if (obj2 != null) {
                this.f6870e++;
                return obj2;
            }
            this.f6871f++;
            Object objMo3295a = mo3295a(obj);
            if (objMo3295a == null) {
                return null;
            }
            synchronized (this.f6868c) {
                try {
                    jg0 jg0Var2 = this.f6867b;
                    jg0Var2.getClass();
                    objPut = ((LinkedHashMap) jg0Var2.f3922k).put(obj, objMo3295a);
                    if (objPut != null) {
                        jg0 jg0Var3 = this.f6867b;
                        jg0Var3.getClass();
                        ((LinkedHashMap) jg0Var3.f3922k).put(obj, objPut);
                    } else {
                        this.f6869d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            m4364d(this.f6866a);
            return objMo3295a;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m4363c(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.f6868c) {
            this.f6869d++;
            jg0 jg0Var = this.f6867b;
            jg0Var.getClass();
            objPut = ((LinkedHashMap) jg0Var.f3922k).put(obj, obj2);
            if (objPut != null) {
                this.f6869d--;
            }
        }
        m4364d(this.f6866a);
        return objPut;
    }

    /* JADX INFO: renamed from: d */
    public final void m4364d(int i) {
        while (true) {
            synchronized (this.f6868c) {
                try {
                    if (this.f6869d < 0 || (((LinkedHashMap) this.f6867b.f3922k).isEmpty() && this.f6869d != 0)) {
                        break;
                    }
                    if (this.f6869d > i && !((LinkedHashMap) this.f6867b.f3922k).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.f6867b.f3922k).entrySet();
                        setEntrySet.getClass();
                        Object next = null;
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        jg0 jg0Var = this.f6867b;
                        jg0Var.getClass();
                        key.getClass();
                        ((LinkedHashMap) jg0Var.f3922k).remove(key);
                        int i2 = this.f6869d;
                        value.getClass();
                        this.f6869d = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f6868c) {
            try {
                int i = this.f6870e;
                int i2 = this.f6871f + i;
                str = "LruCache[maxSize=" + this.f6866a + ",hits=" + this.f6870e + ",misses=" + this.f6871f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
