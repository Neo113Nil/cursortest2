package sg.bigo.ads.q1;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (lastModified > 0) {
            return -1;
        }
        return lastModified < 0 ? 1 : 0;
    }
}
