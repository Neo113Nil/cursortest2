package a3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class I extends LinkedHashMap {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K f6497k;

    public I(K k5) {
        this.f6497k = k5;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f6497k) {
            try {
                int size = size();
                K k5 = this.f6497k;
                if (size <= k5.f6501a) {
                    return false;
                }
                k5.f.add(new Pair((String) entry.getKey(), ((J) entry.getValue()).f6499b));
                return size() > this.f6497k.f6501a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
