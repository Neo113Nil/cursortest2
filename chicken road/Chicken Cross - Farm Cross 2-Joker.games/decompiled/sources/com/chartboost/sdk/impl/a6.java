package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.U3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a6 implements sf {

    /* renamed from: a, reason: collision with root package name */
    public final il f4674a;
    public final ae b;
    public final u2 c;

    public a6(il webViewFactory, ae openMeasurementManager, u2 cbIdentity) {
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        this.f4674a = webViewFactory;
        this.b = openMeasurementManager;
        this.c = cbIdentity;
    }

    @Override // com.chartboost.sdk.impl.sf
    public j2 a(Context context, qf renderableConfig, a0 adMarkupConfig, u adFormat, wh trackerComponent, kh telemetryManager, rk viewabilityComponent, Mediation mediation, v vVar, boolean z) {
        ChartboostError chartboostError;
        ChartboostError invalidAdm;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        try {
            String n = renderableConfig.n();
            sb sbVar = sb.c;
            if (Intrinsics.areEqual(n, sbVar.b())) {
                return new ej(context, renderableConfig.b(), renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, viewabilityComponent, b4.b.b().d(), adFormat, this.f4674a, mediation, this.b, this.c, z);
            }
            sb sbVar2 = sb.d;
            if (Intrinsics.areEqual(n, sbVar2.b())) {
                return new gl(context, renderableConfig.b(), null, adFormat.b() ? rc.c : rc.d, null, this.f4674a, renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, viewabilityComponent, mediation, vVar, this.b, this.c, null, null, null, 458768, null);
            }
            ChartboostError.Load.InvalidAdm invalidAdm2 = new ChartboostError.Load.InvalidAdm("Unsupported markup type: " + renderableConfig.n() + ". Supported types: " + sbVar.b() + ", " + sbVar2.b(), null);
            mb.b(U3.j.d + invalidAdm2.getCode() + "] Skipping unknown renderable config with type " + renderableConfig.n(), invalidAdm2);
            return null;
        } catch (Exception e) {
            if (e instanceof ChartboostError.Load) {
                chartboostError = (ChartboostError.Load) e;
            } else {
                if (e instanceof IllegalArgumentException) {
                    invalidAdm = new ChartboostError.Load.InvalidAdm("Invalid renderable configuration: " + e.getMessage(), e);
                } else if (e instanceof OutOfMemoryError) {
                    chartboostError = ChartboostError.Load.NoStorage.INSTANCE;
                } else {
                    invalidAdm = new ChartboostError.Load.Internal("Failed to create renderable: " + e.getMessage(), e);
                }
                chartboostError = invalidAdm;
            }
            mb.b(U3.j.d + chartboostError.getCode() + "] Failed to create renderable for markup type: " + renderableConfig.n(), chartboostError);
            throw chartboostError;
        }
    }

    public /* synthetic */ a6(il ilVar, ae aeVar, u2 u2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new gd() : ilVar, aeVar, u2Var);
    }
}
