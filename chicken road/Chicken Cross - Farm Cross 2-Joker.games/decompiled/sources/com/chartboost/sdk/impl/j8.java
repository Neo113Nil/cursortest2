package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final x7 f4822a;

    public j8(x7 fileCaching) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        this.f4822a = fileCaching;
    }

    public final File a(t6 t6Var) {
        return u6.a(t6Var, this.f4822a.c());
    }

    public final File b(t6 t6Var) {
        return u6.a(t6Var, this.f4822a.a());
    }

    public final void c(t6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (jg.f4829a.d()) {
            b(download).createNewFile();
        }
    }

    public final void d(t6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (jg.f4829a.d()) {
            a(download).delete();
            b(download).delete();
        }
    }

    public final void e(t6 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (jg.f4829a.d()) {
            b(download).delete();
            a(download).createNewFile();
        }
    }
}
