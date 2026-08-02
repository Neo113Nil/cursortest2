package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class qk0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6515a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f6516b;

    /* JADX INFO: renamed from: c */
    public long f6517c;

    public qk0(long j) {
        this.f6516b = j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Object m4106a(Object obj) {
        pk0 pk0Var;
        pk0Var = (pk0) this.f6515a.get(obj);
        return pk0Var != null ? pk0Var.f6184a : null;
    }

    /* JADX INFO: renamed from: b */
    public int mo4107b(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Object m4108d(Object obj, Object obj2) {
        int iMo4107b = mo4107b(obj2);
        long j = iMo4107b;
        if (j >= this.f6516b) {
            mo1494c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f6517c += j;
        }
        pk0 pk0Var = (pk0) this.f6515a.put(obj, obj2 == null ? null : new pk0(iMo4107b, obj2));
        if (pk0Var != null) {
            this.f6517c -= (long) pk0Var.f6185b;
            if (!pk0Var.f6184a.equals(obj2)) {
                mo1494c(obj, pk0Var.f6184a);
            }
        }
        m4109e(this.f6516b);
        return pk0Var != null ? pk0Var.f6184a : null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m4109e(long j) {
        while (this.f6517c > j) {
            Iterator it = this.f6515a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            pk0 pk0Var = (pk0) entry.getValue();
            this.f6517c -= (long) pk0Var.f6185b;
            Object key = entry.getKey();
            it.remove();
            mo1494c(key, pk0Var.f6184a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1494c(Object obj, Object obj2) {
    }
}
