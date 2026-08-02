package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class My {

    /* renamed from: b, reason: collision with root package name */
    public static final My f10755b = new My(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f10756a;

    public /* synthetic */ My(Map map) {
        this.f10756a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof My) {
            return this.f10756a.equals(((My) obj).f10756a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10756a.hashCode();
    }

    public final String toString() {
        return this.f10756a.toString();
    }
}
