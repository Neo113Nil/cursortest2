package com.inmobi.media;

import android.app.Application;
import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class H1 implements InterfaceC4195wl {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6592a;
    public final P1 b = new P1(new B1());
    public final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.H1$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return H1.a(H1.this);
        }
    });

    @Override // com.inmobi.media.InterfaceC4195wl
    public final String a(SignalsConfig.SynapseCollectorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new G1(this, context, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final String a() {
        return "act";
    }

    public static final F1 a(H1 h1) {
        return new F1(h1);
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final SignalsConfig.SynapseCollectorConfig a(SignalsConfig signalsConfig) {
        Intrinsics.checkNotNullParameter(signalsConfig, "signalsConfig");
        return signalsConfig.getAppActivityAnalytics();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0167, code lost:
    
        if (r2 == r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a3, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        if (r0 == r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a1, code lost:
    
        if (r0 == r4) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.inmobi.media.InterfaceC4195wl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig, Continuation continuation) {
        E1 e1;
        int i;
        Map emptyMap;
        Object withContext;
        if (continuation instanceof E1) {
            e1 = (E1) continuation;
            int i2 = e1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e1.c = i2 - Integer.MIN_VALUE;
                Object obj = e1.f6524a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e1.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!(synapseCollectorConfig instanceof SignalsConfig.AppActivityAnalyticsConfig)) {
                        return new Cl("act", (short) 2508, "Activity analytics config type is invalid.", null, 8);
                    }
                    if (synapseCollectorConfig.isEnabled()) {
                        SignalsConfig.AppActivityAnalyticsConfig appActivityAnalyticsConfig = (SignalsConfig.AppActivityAnalyticsConfig) synapseCollectorConfig;
                        if (!StringsKt.isBlank(appActivityAnalyticsConfig.getEncPayload())) {
                            if (!this.f6592a) {
                                Context applicationContext = context.getApplicationContext();
                                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                                if (application != null) {
                                    application.registerActivityLifecycleCallbacks((F1) this.c.getValue());
                                    this.f6592a = true;
                                } else {
                                    a(this, (short) 2522, null, 2);
                                }
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                            e1.c = 2;
                            try {
                                String encPayload = appActivityAnalyticsConfig.getEncPayload();
                                J4 j4 = AbstractC4260z4.f7518a;
                                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                                String a2 = AbstractC4234y6.a(encPayload, AbstractC4234y6.a(((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getKA()));
                                if (a2 != null && !StringsKt.isBlank(a2)) {
                                    try {
                                        emptyMap = D1.a(new JSONObject(a2));
                                    } catch (JSONException unused) {
                                        emptyMap = MapsKt.emptyMap();
                                    }
                                } else {
                                    emptyMap = MapsKt.emptyMap();
                                }
                            } catch (Exception e) {
                                a(this, (short) 2523, e.getClass().getSimpleName(), 4);
                                emptyMap = MapsKt.emptyMap();
                            }
                            if (emptyMap.isEmpty()) {
                                P1 p1 = this.b;
                                Context applicationContext3 = applicationContext2.getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                                p1.getClass();
                                withContext = BuildersKt.withContext(AbstractC3904ma.c, new K1(p1, applicationContext3, null), e1);
                                if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    withContext = Unit.INSTANCE;
                                }
                                if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    withContext = Unit.INSTANCE;
                                }
                            } else {
                                P1 p12 = this.b;
                                Context applicationContext4 = applicationContext2.getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                                p12.getClass();
                                withContext = BuildersKt.withContext(AbstractC3904ma.c, new I1(applicationContext4, emptyMap, p12, null), e1);
                                if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    withContext = Unit.INSTANCE;
                                }
                                if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    withContext = Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    P1 p13 = this.b;
                    Context applicationContext5 = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
                    e1.c = 1;
                    p13.getClass();
                    Object withContext2 = BuildersKt.withContext(AbstractC3904ma.c, new K1(p13, applicationContext5, null), e1);
                    if (withContext2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext2 = Unit.INSTANCE;
                    }
                } else {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return new Dl("act");
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return new Dl("act");
                        }
                        return new Bl("act", new C4222xl(jSONArray));
                    }
                    ResultKt.throwOnFailure(obj);
                    P1 p14 = this.b;
                    e1.c = 3;
                    p14.getClass();
                    obj = BuildersKt.withContext(AbstractC3904ma.c, new J1(p14, null), e1);
                }
            }
        }
        e1 = new E1(this, (ContinuationImpl) continuation);
        Object obj2 = e1.f6524a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e1.c;
        if (i != 0) {
        }
    }

    public static void a(H1 h1, short s, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = (i & 4) == 0 ? "Application context unavailable" : null;
        h1.getClass();
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("source", "act"), TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        if (str != null) {
            mutableMapOf.put("trigger", str);
        }
        if (str2 != null) {
            mutableMapOf.put("reason", str2);
        }
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AppActivityAnalyticsFailure", mutableMapOf, EnumC3944nm.f7271a);
    }
}
