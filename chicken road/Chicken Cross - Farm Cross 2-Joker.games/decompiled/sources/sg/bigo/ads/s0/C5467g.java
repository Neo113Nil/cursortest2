package sg.bigo.ads.s0;

import java.io.File;
import java.util.Comparator;

/* renamed from: sg.bigo.ads.s0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5467g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (lastModified > 0) {
            return -1;
        }
        return lastModified == 0 ? 0 : 1;
    }
}
