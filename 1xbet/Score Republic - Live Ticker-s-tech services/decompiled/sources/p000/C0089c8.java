package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: c8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0089c8 extends w71 implements Map {

    /* JADX INFO: renamed from: m */
    public C0867x7 f1158m;

    /* JADX INFO: renamed from: n */
    public C0941z7 f1159n;

    /* JADX INFO: renamed from: o */
    public C0053b8 f1160o;

    public C0089c8() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0867x7 c0867x7 = this.f1158m;
        if (c0867x7 != null) {
            return c0867x7;
        }
        C0867x7 c0867x8 = new C0867x7(0, this);
        this.f1158m = c0867x8;
        return c0867x8;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m898k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0941z7 c0941z7 = this.f1159n;
        if (c0941z7 != null) {
            return c0941z7;
        }
        C0941z7 c0941z8 = new C0941z7(this);
        this.f1159n = c0941z8;
        return c0941z8;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m899l(Collection collection) {
        int i = this.f8453l;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8453l;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m5295b(map.size() + this.f8453l);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0053b8 c0053b8 = this.f1160o;
        if (c0053b8 != null) {
            return c0053b8;
        }
        C0053b8 c0053b9 = new C0053b8(this);
        this.f1160o = c0053b9;
        return c0053b9;
    }
}
