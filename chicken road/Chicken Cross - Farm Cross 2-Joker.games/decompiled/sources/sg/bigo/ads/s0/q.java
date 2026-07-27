package sg.bigo.ads.s0;

import android.util.LruCache;

/* loaded from: classes3.dex */
public final class q extends LruCache {
    public q(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((sg.bigo.ads.U.c) obj2).f12561a.getByteCount();
    }
}
