package p155w1;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: w1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1051y implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(".flurryagent.");
    }
}
