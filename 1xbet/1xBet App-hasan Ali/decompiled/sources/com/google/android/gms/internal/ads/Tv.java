package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Tv implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f11700a;

    public Tv(Pattern pattern) {
        pattern.getClass();
        this.f11700a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f11700a.matcher(str).matches();
    }
}
