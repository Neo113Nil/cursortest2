package com.amplitude.analytics.connector;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final Map<String, Object> c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d() {
        this(r0, r0, 7);
        String str = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Identity(userId=" + ((Object) this.a) + ", deviceId=" + ((Object) this.b) + ", userProperties=" + this.c + ')';
    }

    public d(String str, String str2, Map<String, ? extends Object> userProperties) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        this.a = str;
        this.b = str2;
        this.c = userProperties;
    }

    public /* synthetic */ d(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (Map<String, ? extends Object>) MapsKt.emptyMap());
    }
}
