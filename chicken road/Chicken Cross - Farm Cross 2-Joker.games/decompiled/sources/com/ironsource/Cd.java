package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7583a;
    private final List<C4732xc> b;
    private final AbstractC4720x0 c;
    private final IronSource.a d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7584a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7584a = iArr;
        }
    }

    public static final class b extends com.ironsource.environment.thread.a {
        final /* synthetic */ NetworkSettings c;
        final /* synthetic */ AdapterBaseInterface d;
        final /* synthetic */ AdData e;

        b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.c = networkSettings;
            this.d = adapterBaseInterface;
            this.e = adData;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            Cd cd = Cd.this;
            NetworkSettings networkSettings = this.c;
            AdapterBaseInterface networkAdapter = this.d;
            Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            cd.a(networkSettings, networkAdapter, this.e);
        }

        @Override // com.ironsource.environment.thread.a
        public void a(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            Cd.this.f7583a.f().h().g("initProvider - exception while calling networkAdapter.init with " + this.c.getProviderName() + " - " + t);
        }
    }

    public Cd(T0 adUnitTools, LevelPlay.AdFormat adFormat, List<C4732xc> providers, AbstractC4720x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f7583a = adUnitTools;
        this.b = providers;
        this.c = adUnitData;
        this.d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C4577p0.a(this.f7583a, (String) null, (String) null, 3, (Object) null));
        UUID randomUUID = UUID.randomUUID();
        Iterator<C4732xc> it = this.b.iterator();
        while (it.hasNext()) {
            NetworkSettings f = it.next().f();
            AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(f, this.d, randomUUID);
            if (a(f, b2)) {
                Hf.f7662a.b(new b(f, b2, this.c.a(f)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        T0 t0 = this.f7583a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        ironLog.verbose(C4577p0.a(t0, format, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        T0 t0 = this.f7583a;
        IronSource.a aVar = this.d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        if (t0.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i = a.f7584a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
