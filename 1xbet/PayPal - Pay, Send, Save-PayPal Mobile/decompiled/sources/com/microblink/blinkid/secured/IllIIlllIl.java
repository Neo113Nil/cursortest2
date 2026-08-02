package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllIIlllIl implements java.io.FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(java.io.File file) {
        return java.util.regex.Pattern.matches("cpu[0-9]", file.getName());
    }
}
