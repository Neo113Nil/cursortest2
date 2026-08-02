package com.github.droibit.flutter.plugins.customtabs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends Throwable {
    public final String a;
    public final String b;

    public g(String str) {
        Intrinsics.checkNotNullParameter("LAUNCH_ERROR", "code");
        this.a = "LAUNCH_ERROR";
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
