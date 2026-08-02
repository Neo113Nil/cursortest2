package Tb0;

import De.C2862e;
import Kb0.K;
import Od0.a;
import Od0.c;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kd0.C7667a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd0.C9025a;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule$provideOzonIdPluginProvider$1;
import xb0.InterfaceC10696a;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes7.dex */
public final class h extends Od0.d<InterfaceC10696a> implements Od0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.d f26990a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 f26991b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC10696a> f26992c;

    public h(@NotNull Ld0.d globalConfig, @NotNull Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 config) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f26990a = globalConfig;
        this.f26991b = config;
        C2862e a11 = td0.f.a();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new g(2, null), 2);
        this.f26992c = InterfaceC10696a.class;
    }

    @Override // Od0.b
    public final void beforeHandleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // Od0.b
    public final boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri data = deeplink instanceof c.a ? ((c.a) deeplink).b().getData() : deeplink instanceof c.b ? ((c.b) deeplink).b() : null;
        if (data == null) {
            return false;
        }
        return kotlin.text.h.D(data.getAuthority(), "ozonidSDK", true) && data.getLastPathSegment() != null;
    }

    @Override // Od0.d
    public final InterfaceC10696a create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new a(store, this.f26990a.a(), this.f26991b);
    }

    @Override // Od0.d
    @NotNull
    public final List<Ld0.f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        InterfaceC4008j interfaceC4008j;
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        List a02 = C7714v.a0(new Qb0.a(this.f26990a.a()));
        interfaceC4008j = K.f15466c0;
        return C7714v.p0(C7714v.a0(C9025a.a()), C7714v.p0(a02, ((C7667a) interfaceC4008j.getValue()).i()));
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC10696a> getKey() {
        return this.f26992c;
    }

    @Override // Od0.b
    @NotNull
    public final Od0.a handleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink, @NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Uri data = deeplink instanceof c.a ? ((c.a) deeplink).b().getData() : deeplink instanceof c.b ? ((c.b) deeplink).b() : null;
        if (data == null) {
            return new a.b("uri is null", null);
        }
        String lastPathSegment = data.getLastPathSegment();
        return lastPathSegment == null ? new a.b("path is null", null) : ((a) store.e(InterfaceC10696a.class)).Q(data, lastPathSegment);
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}
