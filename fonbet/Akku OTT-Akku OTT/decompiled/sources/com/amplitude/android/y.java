package com.amplitude.android;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {
    public static final a Companion = new a();
    public static final String[] b = {"adid", "city", "ip_address", "lat_lng"};
    public final HashSet a = new HashSet();

    public static final class a {
    }

    public final void a(String str) {
        this.a.add(str);
    }

    public final boolean b(String str) {
        return !this.a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(y.class, obj.getClass())) {
            return Intrinsics.areEqual(((y) obj).a, this.a);
        }
        return false;
    }
}
