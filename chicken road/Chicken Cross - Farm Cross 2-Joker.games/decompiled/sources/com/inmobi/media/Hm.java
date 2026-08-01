package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Hm {

    /* renamed from: a, reason: collision with root package name */
    public final String f6609a;
    public final Map b;

    public Hm(String str, Map map) {
        this.f6609a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hm)) {
            return false;
        }
        Hm hm = (Hm) obj;
        return Intrinsics.areEqual(this.f6609a, hm.f6609a) && Intrinsics.areEqual(this.b, hm.b);
    }

    public final int hashCode() {
        String str = this.f6609a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f6609a + ", extras=" + this.b + ")";
    }
}
