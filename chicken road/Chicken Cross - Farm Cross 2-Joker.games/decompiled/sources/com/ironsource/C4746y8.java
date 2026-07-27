package com.ironsource;

import android.app.Activity;
import com.ironsource.C4430ge;
import com.ironsource.C4531m8;
import com.ironsource.C8;
import com.ironsource.D8;
import com.ironsource.Tb;
import com.ironsource.U3;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4746y8 implements C8 {
    public static final a j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8773a;
    private final Tb b;
    private final InterfaceC4585p8 c;
    private A8 d;
    private String e;
    private String f;
    private Long g;
    private C8.a h;
    private D8 i;

    /* renamed from: com.ironsource.y8$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C4746y8 a() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new C4746y8(uuid, new Sb(uuid, controllerManager, null, null, 12, null), new C4603q8());
        }

        private a() {
        }
    }

    public C4746y8(String id, Tb controller, InterfaceC4585p8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f8773a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4567o8 d() {
        C4567o8 a2 = new C4567o8().a(C4761z5.x, this.f).a(C4761z5.v, this.e).a(C4761z5.w, C4531m8.e.NativeAd.toString()).a(C4761z5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(a2, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a2;
    }

    @JvmStatic
    public static final C4746y8 e() {
        return j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final String h() {
        return this.e;
    }

    public final String i() {
        return this.f;
    }

    @Override // com.ironsource.C8
    public C8.a b() {
        return this.h;
    }

    @Override // com.ironsource.C8
    public A8 c() {
        return this.d;
    }

    /* renamed from: com.ironsource.y8$b */
    public static final class b implements Tb.a {
        b() {
        }

        @Override // com.ironsource.Tb.a
        public void a(A8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            C4746y8.this.d = adData;
            InterfaceC4585p8 interfaceC4585p8 = C4746y8.this.c;
            C4430ge.a loadAdSuccess = C4430ge.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> a2 = C4746y8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
            interfaceC4585p8.a(loadAdSuccess, a2);
            C8.a b = C4746y8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Tb.a
        public void e() {
            C8.a b = C4746y8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Tb.a
        public void a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C4567o8 a2 = C4746y8.this.d().a(C4761z5.A, reason);
            InterfaceC4585p8 interfaceC4585p8 = C4746y8.this.c;
            C4430ge.a loadAdFailed = C4430ge.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> a3 = a2.a();
            Intrinsics.checkNotNullExpressionValue(a3, "eventParams.data");
            interfaceC4585p8.a(loadAdFailed, a3);
            C8.a b = C4746y8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Tb.a
        public void a() {
            C8.a b = C4746y8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.C8
    public void a(C8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.C8
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        InterfaceC4585p8 interfaceC4585p8 = this.c;
        C4430ge.a loadAd = C4430ge.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        interfaceC4585p8.a(loadAd, a2);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(U3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jSONObject);
    }

    /* renamed from: com.ironsource.y8$c */
    public static final class c implements D8.a {

        /* renamed from: com.ironsource.y8$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8776a;

            static {
                int[] iArr = new int[D8.b.values().length];
                try {
                    iArr[D8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f8776a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.D8.a
        public void a(D8.b viewName) {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.f8776a[viewName.ordinal()] == 1) {
                C4746y8.this.b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Tb tb = C4746y8.this.b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            tb.a(clickParams);
        }

        @Override // com.ironsource.D8.a
        public void a(Dg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            C4746y8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.C8
    public void a(D8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        linkedHashMap.putAll(a2);
        String jSONObject = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(C4761z5.y, jSONObject);
        InterfaceC4585p8 interfaceC4585p8 = this.c;
        C4430ge.a registerAd = C4430ge.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC4585p8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.C8
    public void a() {
        D8 d8 = this.i;
        if (d8 != null) {
            d8.a((D8.a) null);
        }
        this.b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4746y8(String str, Tb tb, InterfaceC4585p8 interfaceC4585p8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, tb, interfaceC4585p8);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }
}
