package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4571oc f8034a;

    public static final class a implements Lc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y8 f8035a;
        final /* synthetic */ InitListener b;

        a(Y8 y8, InitListener initListener) {
            this.f8035a = y8;
            this.b = initListener;
        }

        @Override // com.ironsource.Lc
        public void onFail(C4549n8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(C4635s5.f8523a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Lc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            X e = this.f8035a.e();
            ironLog.verbose("controllerURL = " + (e != null ? e.a() : null));
            X e2 = this.f8035a.e();
            ironLog.verbose("controllerConfig = " + (e2 != null ? e2.b() : null));
            X e3 = this.f8035a.e();
            ironLog.verbose("debugMode = " + (e3 != null ? Integer.valueOf(e3.c()) : null));
            ironLog.verbose("applicationKey = " + this.f8035a.d());
            ironLog.verbose("userId = " + this.f8035a.h());
            this.b.onInitSuccess();
        }
    }

    public Z(InterfaceC4571oc networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f8034a = networkInitApi;
    }

    @Override // com.ironsource.Y
    public void a(Context context, Y8 initConfig, InitListener initListener) {
        JSONObject b;
        String a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC4571oc interfaceC4571oc = this.f8034a;
        X e = initConfig.e();
        interfaceC4571oc.a(e != null ? e.c() : 0);
        X e2 = initConfig.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.f8034a.b(a2);
        }
        X e3 = initConfig.e();
        if (e3 != null && (b = e3.b()) != null) {
            InterfaceC4571oc interfaceC4571oc2 = this.f8034a;
            String jSONObject = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            interfaceC4571oc2.a(jSONObject);
        }
        Map<String, String> a3 = new C4535mc().a();
        this.f8034a.a(new a(initConfig, initListener));
        this.f8034a.a(context, initConfig.d(), initConfig.h(), a3);
    }
}
