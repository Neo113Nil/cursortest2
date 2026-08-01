package com.ironsource;

import android.content.Context;
import com.ironsource.Te;
import com.ironsource.X;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class N9 {

    /* renamed from: a, reason: collision with root package name */
    public static final N9 f7807a = new N9();
    private static final C4461i9 b = new C4461i9();

    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private N9() {
    }

    public final void b(boolean z) {
        a(z);
        new C4553nc().a(z);
    }

    public static final class b implements InterfaceC4626re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7808a;
        final /* synthetic */ C4385e5 b;
        final /* synthetic */ InitListener c;

        b(Context context, C4385e5 c4385e5, InitListener initListener) {
            this.f7808a = context;
            this.b = c4385e5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(C4519le sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            N9.f7807a.a(this.f7808a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            N9.f7807a.a(this.c, this.b, error);
        }
    }

    public final void a(final Context context, final InitRequest initRequest, final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(InitRequest.this, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C4385e5 c4385e5 = new C4385e5();
        Ae.f7554a.c(context, new C4662te(initRequest.getAppKey(), null, ArraysKt.toMutableList(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4385e5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Te te, C4385e5 c4385e5, InitListener initListener) {
        String n = com.ironsource.mediationsdk.p.g().n();
        Y8 g = te.g();
        Intrinsics.checkNotNullExpressionValue(g, "serverResponse.initialConfiguration");
        NetworkSettings b2 = te.l().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(b2, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = b2.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        g.a(new X.a(interstitialSettings, Ib.v.d().h()));
        g.a(ConfigFile.getConfigFile().getPluginType());
        g.b(n);
        new Z(new C4589pc()).a(context, g, new a());
        a(te, c4385e5, initListener);
    }

    private final void a(Te te, C4385e5 c4385e5, final InitListener initListener) {
        J1 e;
        A1 b2 = te.c().b();
        new Jb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.g().n();
        C4464ic a2 = C4464ic.e.a();
        a2.a(te.l());
        a2.a(te.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        a2.a(sessionId);
        a2.g();
        long a3 = C4385e5.a(c4385e5);
        C4461i9 c4461i9 = b;
        Te.a i = te.i();
        Intrinsics.checkNotNullExpressionValue(i, "serverResponse.origin");
        c4461i9.a(a3, i);
        c4461i9.b(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C4385e5 c4385e5, final C4555ne c4555ne) {
        long a2 = C4385e5.a(c4385e5);
        C4461i9 c4461i9 = b;
        final C4555ne b2 = c4461i9.b(c4555ne);
        c4461i9.a(b2, a2);
        c4461i9.b(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(C4555ne.this, initListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4555ne error, InitListener initListener, C4555ne eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(b.a(eventError));
        }
    }

    private final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Ib.v.d().q().a(new C4689v5(EnumC4707w5.CONSENT_IADS, jSONObject));
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.g().a(key, arrayList);
    }
}
