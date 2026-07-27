package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Nd {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4745y7 f7811a;
    private final Function0<Long> b;
    private final F7 c;
    private final Executor d;

    /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7812a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final class b implements OutcomeReceiver<Object, Exception> {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Nd.this.a(error.getMessage());
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            Nd.this.c();
        }
    }

    public Nd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.f7811a.a(new C4689v5(EnumC4707w5.REGISTER_TRIGGER, (JSONObject) null));
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager a2 = C4505l0.a(context);
            if (a2 == null) {
                a("could not obtain measurement manager");
            } else {
                a2.registerTrigger(a(context), this.d, a());
            }
        } catch (Exception e) {
            a(e.getMessage());
            C4491k4.d().a(e);
        }
    }

    public Nd(InterfaceC4745y7 eventManager, Function0<Long> getTimeFunction, F7 serviceProvider, Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f7811a = eventManager;
        this.b = getTimeFunction;
        this.c = serviceProvider;
        this.d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> c = C4515la.b().c();
        List<String> list = c != null ? c.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC4673u7 a2 = this.c.a();
        String a3 = IronSourceUtils.a(context);
        Uri build = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(L6.X0, a2.I(context)).appendQueryParameter(L6.M0, a2.z(context)).appendQueryParameter("auid", a2.e(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter(COPPA.COPPA_STANDARD, b()).appendQueryParameter(L6.j0, String.valueOf(C4505l0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.b.invoke().longValue())).appendQueryParameter(U3.j.x, a2.d(context)).appendQueryParameter("deviceCarrier", a2.v(context)).appendQueryParameter("connectionType", a3).appendQueryParameter(Q3.b, String.valueOf(StringsKt.equals(a3, Q3.b, true))).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .schem…arameter\n        .build()");
        return build;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Nd(InterfaceC4745y7 interfaceC4745y7, Function0 function0, F7 f7, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4745y7, function0, f7, executor);
        interfaceC4745y7 = (i & 1) != 0 ? Ib.v.d().q() : interfaceC4745y7;
        function0 = (i & 2) != 0 ? a.f7812a : function0;
        f7 = (i & 4) != 0 ? Ib.v.d() : f7;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f7811a.a(new C4689v5(EnumC4707w5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    private final OutcomeReceiver<Object, Exception> a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f7811a.a(new C4689v5(EnumC4707w5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
