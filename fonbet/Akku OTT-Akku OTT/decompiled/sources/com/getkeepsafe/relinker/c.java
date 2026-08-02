package com.getkeepsafe.relinker;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public final class c implements FilenameFilter {
    public final /* synthetic */ String a;

    public c(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
