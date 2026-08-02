package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a8 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: j */
    public int f57j;

    /* JADX INFO: renamed from: k */
    public int f58k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f59l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0089c8 f60m;

    public C0009a8(C0089c8 c0089c8) {
        this.f60m = c0089c8;
        this.f57j = c0089c8.f8453l - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f59l) {
            C0270h1.m2191g("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f58k;
            C0089c8 c0089c8 = this.f60m;
            if (af0.m187a(key, c0089c8.m5299f(i)) && af0.m187a(entry.getValue(), c0089c8.m5303j(this.f58k))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f59l) {
            return this.f60m.m5299f(this.f58k);
        }
        C0270h1.m2191g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f59l) {
            return this.f60m.m5303j(this.f58k);
        }
        C0270h1.m2191g("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58k < this.f57j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f59l) {
            C0270h1.m2191g("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f58k;
        C0089c8 c0089c8 = this.f60m;
        Object objM5299f = c0089c8.m5299f(i);
        Object objM5303j = c0089c8.m5303j(this.f58k);
        return (objM5299f == null ? 0 : objM5299f.hashCode()) ^ (objM5303j != null ? objM5303j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f58k++;
        this.f59l = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f59l) {
            throw new IllegalStateException();
        }
        this.f60m.mo5301h(this.f58k);
        this.f58k--;
        this.f57j--;
        this.f59l = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f59l) {
            return this.f60m.mo5302i(this.f58k, obj);
        }
        C0270h1.m2191g("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
