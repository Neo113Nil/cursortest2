package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rf {

    /* renamed from: a, reason: collision with root package name */
    private final String f7879a;
    private final String b;
    private final boolean c;
    private final Boolean d;

    public Rf(String str, boolean z, Boolean bool, String str2) {
        this.f7879a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f7879a;
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Uf uf = Uf.f7953a;
        return Intrinsics.areEqual(uf.a(networkSettings), this.b) && uf.a(networkSettings, adUnit) == this.c;
    }

    public /* synthetic */ Rf(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
