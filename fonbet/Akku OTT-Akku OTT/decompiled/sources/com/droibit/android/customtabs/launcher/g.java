package com.droibit.android.customtabs.launcher;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final Set<String> a;

    public g(Set<String> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.a = packages;
        Set<String> set = packages;
        if ((set instanceof Collection) && set.isEmpty()) {
            return;
        }
        for (String str : set) {
            Set<String> set2 = f.a;
            if (f.a.contains(str)) {
                throw new IllegalArgumentException("Packages must not contain any Chrome packages.");
            }
        }
    }
}
