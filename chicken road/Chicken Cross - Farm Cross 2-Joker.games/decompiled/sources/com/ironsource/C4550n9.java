package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4550n9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8451a;
    private final int b;
    private final String c;

    public C4550n9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.f8451a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f8451a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4550n9)) {
            return false;
        }
        C4550n9 c4550n9 = (C4550n9) obj;
        return Intrinsics.areEqual(this.f8451a, c4550n9.f8451a) && this.b == c4550n9.b && Intrinsics.areEqual(this.c, c4550n9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.f8451a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.f8451a + ", instanceType=" + this.b + ", dynamicDemandSourceId=" + this.c + ")";
    }

    public C4550n9(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f8451a = instanceId;
        this.b = i;
        this.c = str;
    }

    public final C4550n9 a(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C4550n9(instanceId, i, str);
    }

    public static /* synthetic */ C4550n9 a(C4550n9 c4550n9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4550n9.f8451a;
        }
        if ((i2 & 2) != 0) {
            i = c4550n9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c4550n9.c;
        }
        return c4550n9.a(str, i, str2);
    }

    public /* synthetic */ C4550n9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
