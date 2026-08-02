package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f43908a = new d(5, 1.0f, false);

    public final byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f43908a.get(uri);
    }

    public final void b(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.f43908a;
        uri.getClass();
        linkedHashMap.put(uri, bArr);
    }

    public final byte[] c(Uri uri) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.f43908a;
        uri.getClass();
        return linkedHashMap.remove(uri);
    }
}
