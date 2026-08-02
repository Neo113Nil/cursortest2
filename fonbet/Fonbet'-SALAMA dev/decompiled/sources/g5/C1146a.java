package g5;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1146a extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount() / 1024;
    }
}
