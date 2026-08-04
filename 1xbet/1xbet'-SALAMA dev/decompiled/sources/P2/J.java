package P2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f5439a;

    public J(L l7) {
        this.f5439a = l7;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f5439a) {
            try {
                int size = size();
                L l7 = this.f5439a;
                if (size <= l7.f5443a) {
                    return false;
                }
                l7.f5448f.add(new Pair((String) entry.getKey(), ((K) entry.getValue()).f5441b));
                return size() > this.f5439a.f5443a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
