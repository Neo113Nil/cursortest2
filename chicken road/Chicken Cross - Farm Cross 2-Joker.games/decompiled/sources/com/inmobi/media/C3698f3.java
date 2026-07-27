package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3698f3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7098a;
    public final String b;
    public final Map c;

    public C3698f3(int i, int i2, String str) {
        str = (i2 & 2) != 0 ? null : str;
        this.f7098a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3698f3)) {
            return false;
        }
        C3698f3 c3698f3 = (C3698f3) obj;
        return this.f7098a == c3698f3.f7098a && Intrinsics.areEqual(this.b, c3698f3.b) && Intrinsics.areEqual(this.c, c3698f3.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f7098a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f7098a + ", eventMessage=" + this.b + ", eventData=" + this.c + ")";
    }

    public C3698f3(int i, String str, Map map) {
        this.f7098a = i;
        this.b = str;
        this.c = map;
    }
}
