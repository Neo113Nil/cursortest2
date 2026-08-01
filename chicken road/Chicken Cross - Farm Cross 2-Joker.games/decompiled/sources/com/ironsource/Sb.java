package com.ironsource;

import android.app.Activity;
import com.ironsource.A8;
import com.ironsource.Tb;
import com.ironsource.U3;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Sb implements Tb {

    /* renamed from: a, reason: collision with root package name */
    private final String f7894a;
    private final com.ironsource.sdk.controller.e b;
    private final T8 c;
    private final InterfaceC4327b1 d;
    private final String e;
    private Tb.a f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7895a = new a();
        public static final String b = "nativeAd.load";
        public static final String c = "nativeAd.loadReport";
        public static final String d = "nativeAd.register";
        public static final String e = "nativeAd.click";
        public static final String f = "nativeAd.privacyClick";
        public static final String g = "nativeAd.visibilityChanged";
        public static final String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Sb(String id, com.ironsource.sdk.controller.e controllerManager, T8 imageLoader, InterfaceC4327b1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f7894a = id;
        this.b = controllerManager;
        this.c = imageLoader;
        this.d = adViewManagement;
        this.e = "Sb";
        controllerManager.a(id, d());
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Lb lb) {
                Sb.a(Sb.this, lb);
            }
        };
    }

    private final JSONObject e() {
        JSONObject put = new JSONObject().put(f.b.g, a.e).put("sdkCallback", U3.h.U);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    @Override // com.ironsource.Tb
    public void a(Tb.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Tb
    public Tb.a b() {
        return this.f;
    }

    @Override // com.ironsource.Tb
    public void c() {
        this.b.a(new f.c(this.f7894a, a.f, new JSONObject()), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Sb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.Tb
    public void a(final Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.b.a(activity);
        this.b.a(new f.c(this.f7894a, a.b, loadParams), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, activity, aVar);
            }
        });
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle show on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, Activity activity, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Tb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        A8.b a2 = new A8.a(this.c, this.d).a(activity, aVar.d());
        a(a2, a2.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Sb(String str, com.ironsource.sdk.controller.e eVar, T8 t8, InterfaceC4327b1 interfaceC4327b1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, t8, interfaceC4327b1);
        t8 = (i & 4) != 0 ? new S8(null, 1, null) : t8;
        if ((i & 8) != 0) {
            interfaceC4327b1 = C4477j8.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC4327b1, "getInstance()");
        }
    }

    private final void a(A8.b bVar, final A8 a8) {
        this.b.a(new f.c(this.f7894a, "nativeAd.loadReport." + this.f7894a, bVar.b()), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, a8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, A8 adData, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(A8 a8, f.a aVar) {
        if (aVar.d() == null) {
            Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Tb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        Tb.a b3 = b();
        if (b3 != null) {
            b3.a(a8);
        }
    }

    @Override // com.ironsource.Tb
    public void a() {
        this.b.a(new f.c(this.f7894a, a.h, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(D8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.f7894a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.b.a(new f.c(str, a.d, params), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(Dg viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.b.a(new f.c(this.f7894a, a.g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.b(Sb.this, aVar);
            }
        });
    }

    @Override // com.ironsource.Tb
    public void a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.b.a(new f.c(this.f7894a, a.e, clickParams), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, Lb msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.e)) {
            this$0.a(msg);
        }
    }

    private final void a(Lb lb) {
        if (lb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!lb.f().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + lb.f().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.e();
            }
        }
    }
}
