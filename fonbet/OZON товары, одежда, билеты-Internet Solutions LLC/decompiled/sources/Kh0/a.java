package Kh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConnectionType f15972b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f15973c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f15974d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15975e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15976f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final PowerSaveState f15977g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f15978h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f15979i;

    public a(@NotNull String deviceModel, @NotNull ConnectionType connectionType, @NotNull String cellularOperator, @NotNull String networkProvider, int i11, boolean z11, @NotNull PowerSaveState powerSaveState, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(cellularOperator, "cellularOperator");
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        Intrinsics.checkNotNullParameter(powerSaveState, "powerSaveState");
        this.f15971a = deviceModel;
        this.f15972b = connectionType;
        this.f15973c = cellularOperator;
        this.f15974d = networkProvider;
        this.f15975e = i11;
        this.f15976f = z11;
        this.f15977g = powerSaveState;
        this.f15978h = bool;
        this.f15979i = bool2;
    }

    public final int a() {
        return this.f15975e;
    }

    @NotNull
    public final String b() {
        return this.f15973c;
    }

    @NotNull
    public final ConnectionType c() {
        return this.f15972b;
    }

    @NotNull
    public final String d() {
        return this.f15971a;
    }

    @NotNull
    public final String e() {
        return this.f15974d;
    }

    @NotNull
    public final PowerSaveState f() {
        return this.f15977g;
    }

    public final boolean g() {
        return this.f15976f;
    }

    public final Boolean h() {
        return this.f15979i;
    }

    public final Boolean i() {
        return this.f15978h;
    }
}
