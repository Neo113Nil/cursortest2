package p000;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {

    /* JADX INFO: renamed from: b */
    public static final rw0 f1609b = new rw0("fire-global");

    /* JADX INFO: renamed from: c */
    public static final rw0 f1610c = new rw0("fire-count");

    /* JADX INFO: renamed from: d */
    public static final rw0 f1611d = new rw0("last-used-date");

    /* JADX INFO: renamed from: a */
    public final wf0 f1612a;

    public db0(Context context, String str) {
        this.f1612a = new wf0(context, "FirebaseHeartBeat".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m1148a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strM1149b = m1149b(System.currentTimeMillis());
            wf0 wf0Var = this.f1612a;
            wf0Var.getClass();
            for (Map.Entry entry : ((Map) AbstractC0959zp.m5988r(new uf0(wf0Var, null, 0))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM1149b);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C0943z9(((rw0) entry.getKey()).f6986a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f1612a.m5324a(new h60() { // from class: cb0
                    @Override // p000.h60
                    /* JADX INFO: renamed from: i */
                    public final Object mo170i(Object obj) {
                        ((zq0) obj).m6024c(db0.f1609b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m1149b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized rw0 m1150c(zq0 zq0Var, String str) {
        for (Map.Entry entry : zq0Var.m6022a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((rw0) entry.getKey()).f6986a;
                        str2.getClass();
                        return new rw0(str2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m1151d(zq0 zq0Var, String str) {
        rw0 rw0VarM1150c = m1150c(zq0Var, str);
        if (rw0VarM1150c == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) vk1.m5167c(zq0Var, rw0VarM1150c, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            zq0Var.m6023b();
            zq0Var.f9907a.remove(rw0VarM1150c);
        } else {
            zq0Var.m6025d(rw0VarM1150c, hashSet);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m1152e(rw0 rw0Var, long j) {
        InterfaceC0808vm interfaceC0808vm;
        long jLongValue;
        wf0 wf0Var = this.f1612a;
        wf0Var.getClass();
        rw0Var.getClass();
        interfaceC0808vm = null;
        jLongValue = ((Long) AbstractC0959zp.m5988r(new C0662ro(wf0Var, rw0Var, interfaceC0808vm, 4))).longValue();
        synchronized (this) {
        }
        if (m1149b(jLongValue).equals(m1149b(j))) {
            return false;
        }
        wf0 wf0Var2 = this.f1612a;
        Long lValueOf = Long.valueOf(j);
        wf0Var2.getClass();
        return true;
    }
}
