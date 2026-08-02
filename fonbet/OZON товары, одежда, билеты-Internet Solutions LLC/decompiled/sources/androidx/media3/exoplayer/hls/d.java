package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
final class d extends LinkedHashMap<Uri, byte[]> {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > 4;
    }
}
