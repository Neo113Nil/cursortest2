package com.chartboost.sdk.impl;

import java.io.File;

/* loaded from: classes4.dex */
public class l8 {

    /* renamed from: a, reason: collision with root package name */
    public final File f4858a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;
    public final File h;
    public final File i;

    public l8(File file) {
        File file2 = new File(file, ".chartboost");
        this.f4858a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.b = a(file2, "css");
        this.c = a(file2, "html");
        this.d = a(file2, "images");
        this.e = a(file2, "js");
        this.f = a(file2, "templates");
        this.g = a(file2, "videos");
        this.h = a(file2, "precache");
        this.i = a(file2, "precache_queue");
    }

    public File a() {
        return this.f4858a;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
