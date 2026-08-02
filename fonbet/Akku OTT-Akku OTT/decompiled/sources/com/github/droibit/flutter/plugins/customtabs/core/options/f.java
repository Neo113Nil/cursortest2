package com.github.droibit.flutter.plugins.customtabs.core.options;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final a a;

    public f(Boolean bool, Set<String> set) {
        a browser = new a(null, bool, set, null, null);
        Intrinsics.checkNotNullParameter(browser, "browser");
        this.a = browser;
    }
}
