package w1;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: w1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1760y implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(".flurryagent.");
    }
}
