package Gh0;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f10249a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConnectionType f10250b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f10251c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f10252d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10253e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10254f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final PowerSaveState f10255g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f10256h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f10257i;

    public a(long j11, @NotNull ConnectionType connectionType, @NotNull String cellularOperator, @NotNull String networkProvider, int i11, boolean z11, @NotNull PowerSaveState powerSaveState, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(cellularOperator, "cellularOperator");
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        Intrinsics.checkNotNullParameter(powerSaveState, "powerSaveState");
        this.f10249a = j11;
        this.f10250b = connectionType;
        this.f10251c = cellularOperator;
        this.f10252d = networkProvider;
        this.f10253e = i11;
        this.f10254f = z11;
        this.f10255g = powerSaveState;
        this.f10256h = bool;
        this.f10257i = bool2;
    }

    public final int a() {
        return this.f10253e;
    }

    @NotNull
    public final String b() {
        return this.f10251c;
    }

    @NotNull
    public final ConnectionType c() {
        return this.f10250b;
    }

    public final long d() {
        return this.f10249a;
    }

    @NotNull
    public final String e() {
        return this.f10252d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10249a == aVar.f10249a && this.f10250b == aVar.f10250b && Intrinsics.d(this.f10251c, aVar.f10251c) && Intrinsics.d(this.f10252d, aVar.f10252d) && this.f10253e == aVar.f10253e && this.f10254f == aVar.f10254f && this.f10255g == aVar.f10255g && Intrinsics.d(this.f10256h, aVar.f10256h) && Intrinsics.d(this.f10257i, aVar.f10257i);
    }

    @NotNull
    public final PowerSaveState f() {
        return this.f10255g;
    }

    public final boolean g() {
        return this.f10254f;
    }

    public final Boolean h() {
        return this.f10257i;
    }

    public final int hashCode() {
        int hashCode = (this.f10255g.hashCode() + C3532b.a(C2454a.a(this.f10253e, g.a(g.a((this.f10250b.hashCode() + (Long.hashCode(this.f10249a) * 31)) * 31, 31, this.f10251c), 31, this.f10252d), 31), 31, this.f10254f)) * 31;
        Boolean bool = this.f10256h;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10257i;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f10256h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceStatsEntity(id=");
        sb2.append(this.f10249a);
        sb2.append(", connectionType=");
        sb2.append(this.f10250b);
        sb2.append(", cellularOperator=");
        sb2.append(this.f10251c);
        sb2.append(", networkProvider=");
        sb2.append(this.f10252d);
        sb2.append(", batteryCharge=");
        sb2.append(this.f10253e);
        sb2.append(", isEnergySavingModeEnabled=");
        sb2.append(this.f10254f);
        sb2.append(", powerSaveState=");
        sb2.append(this.f10255g);
        sb2.append(", isVpnEnabled=");
        sb2.append(this.f10256h);
        sb2.append(", isProxyEnabled=");
        return D3.g.d(sb2, this.f10257i, ")");
    }
}
