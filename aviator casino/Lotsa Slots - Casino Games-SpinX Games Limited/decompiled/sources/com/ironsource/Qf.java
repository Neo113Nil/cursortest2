package com.ironsource;

/* loaded from: classes5.dex */
public final class Qf {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5942a;
    private final java.lang.String b;
    private final boolean c;
    private final java.lang.Boolean d;

    public Qf(java.lang.String str, boolean z, java.lang.Boolean bool, java.lang.String str2) {
        this.f5942a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final java.lang.String b() {
        return this.f5942a;
    }

    public final boolean c() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.d, java.lang.Boolean.TRUE);
    }

    public final boolean a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        java.lang.String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        com.ironsource.Tf tf = com.ironsource.Tf.f5986a;
        return kotlin.jvm.internal.Intrinsics.areEqual(tf.a(networkSettings), this.b) && tf.a(networkSettings, adUnit) == this.c;
    }

    public /* synthetic */ Qf(java.lang.String str, boolean z, java.lang.Boolean bool, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
