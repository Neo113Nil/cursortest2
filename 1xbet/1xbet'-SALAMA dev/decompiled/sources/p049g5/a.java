package p049g5;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount() / 1024;
    }
}
