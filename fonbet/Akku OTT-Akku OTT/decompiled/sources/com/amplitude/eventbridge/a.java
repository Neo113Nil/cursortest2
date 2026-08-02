package com.amplitude.eventbridge;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String a;
    public final Map<String, Object> b;
    public final Map<String, Object> c;
    public final Map<String, Object> d;
    public final Map<String, ? extends Object> e;

    public a(String eventType, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = eventType;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map<String, Object> map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.c;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.d;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, ? extends Object> map4 = this.e;
        return hashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        return "Event(eventType=" + this.a + ", eventProperties=" + this.b + ", userProperties=" + this.c + ", groups=" + this.d + ", groupProperties=" + this.e + ')';
    }
}
