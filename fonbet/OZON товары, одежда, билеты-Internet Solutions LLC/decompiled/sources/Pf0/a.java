package Pf0;

import Ae.C2417s0;
import Ae.M0;
import Bf0.o;
import Sc.InterfaceC4008j;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import vf0.C10315a;

/* loaded from: classes3.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f22506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2417s0 f22507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<EnumC9053a> f22508c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<EnumC9053a> f22509d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<List<qf0.e>> f22510e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<C10315a> f22511f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final M0<NetworkInfo> f22512g;

    public a(@NotNull InterfaceC4008j<o> whitelistingStatusProviderLazy, @NotNull Bf0.a whitelistingConfigurationProvider, @NotNull InterfaceC4008j<C9067a> networkInfoProvider) {
        Intrinsics.checkNotNullParameter(whitelistingStatusProviderLazy, "whitelistingStatusProviderLazy");
        Intrinsics.checkNotNullParameter(whitelistingConfigurationProvider, "whitelistingConfigurationProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.f22506a = whitelistingStatusProviderLazy;
        this.f22507b = whitelistingStatusProviderLazy.getValue().t();
        this.f22508c = whitelistingStatusProviderLazy.getValue().r();
        this.f22509d = whitelistingStatusProviderLazy.getValue().q();
        this.f22510e = whitelistingStatusProviderLazy.getValue().p();
        this.f22511f = whitelistingConfigurationProvider.b();
        this.f22512g = networkInfoProvider.getValue().j();
    }

    @NotNull
    public final M0<C10315a> d0() {
        return this.f22511f;
    }

    @NotNull
    public final M0<List<qf0.e>> e0() {
        return this.f22510e;
    }

    @NotNull
    public final M0<EnumC9053a> f0() {
        return this.f22509d;
    }

    @NotNull
    public final M0<NetworkInfo> g0() {
        return this.f22512g;
    }

    @NotNull
    public final M0<EnumC9053a> h0() {
        return this.f22508c;
    }

    @NotNull
    public final C2417s0 i0() {
        return this.f22507b;
    }
}
