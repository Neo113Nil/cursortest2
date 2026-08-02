package Df0;

import Cf0.C2761b;
import Cf0.J;
import Cf0.L;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.C4862d;
import We.E;
import af.C5011a;
import android.app.Application;
import ef.C6351a;
import ef.C6359i;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.m;
import q20.InterfaceC8979b;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final d f6707a = new d();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f6708b = k.b(a.f6710b);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6709c = 0;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.ozonLogger.core.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6710b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.ozonLogger.core.h invoke() {
            return Xf0.a.a(new sj.a("Network", "cronet_upgrader", Boolean.TRUE));
        }
    }

    private static void a(E.a aVar, E e11, B b11, Ga.a aVar2, InterfaceC8979b interfaceC8979b, pf0.i iVar) {
        if (b11 != null) {
            aVar.S().remove(b11);
        }
        aVar.a(new C6359i(e11));
        aVar.a(new C6351a(e11.m()));
        C4862d f7 = e11.f();
        if (f7 != null) {
            aVar.a(new Df0.a(true));
            aVar.a(new C5011a(f7));
            aVar.a(new Df0.a(false));
        }
        aVar.S().addAll(aVar.T());
        aVar.T().clear();
        ArrayList S11 = aVar.S();
        J j11 = m.f80514a;
        if (j11 == null) {
            throw new RuntimeException("NetworkDi must be initialized.");
        }
        j11.k().getClass();
        L.a(S11, C2761b.c(aVar, true));
        L.a(aVar.S(), new h(aVar2, interfaceC8979b, iVar));
    }

    @NotNull
    public static E b(@NotNull E okHttpClient, B b11, @NotNull String primaryDomain, @NotNull Application appContext, @NotNull InterfaceC8979b debugFeaturesAccessLevelApi, @NotNull pf0.i ozonNetworkConfig) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(primaryDomain, "primaryDomain");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(debugFeaturesAccessLevelApi, "debugFeaturesAccessLevelApi");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        try {
            E.a aVar = new E.a(okHttpClient);
            a(aVar, okHttpClient, b11, d.a(f6707a, appContext, primaryDomain), debugFeaturesAccessLevelApi, ozonNetworkConfig);
            return new E(aVar);
        } catch (Throwable th2) {
            ru.ozon.android.ozonLogger.core.h hVar = (ru.ozon.android.ozonLogger.core.h) f6708b.getValue();
            if (hVar != null) {
                hVar.a("Ошибка при инициализации ЕСК с Cronet: " + th2.getMessage());
            }
            return okHttpClient;
        }
    }
}
