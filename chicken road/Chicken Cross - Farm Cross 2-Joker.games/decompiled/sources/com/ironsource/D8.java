package com.ironsource;

import android.view.View;
import com.ironsource.C4764z8;
import com.ironsource.U3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class D8 {

    /* renamed from: a, reason: collision with root package name */
    private C4764z8 f7596a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private a i;

    public interface a {
        void a(b bVar);

        void a(Dg dg);
    }

    public enum b {
        Title("title"),
        Advertiser(U3.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(U3.i.J0);


        /* renamed from: a, reason: collision with root package name */
        private final String f7597a;

        b(String str) {
            this.f7597a = str;
        }

        public final String b() {
            return this.f7597a;
        }
    }

    public static final class c implements C4764z8.a {
        c() {
        }

        @Override // com.ironsource.C4764z8.a
        public void a(Dg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a n = D8.this.n();
            if (n != null) {
                n.a(viewVisibilityParams);
            }
        }
    }

    public D8(C4764z8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f7596a = containerView;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.b, b.Title);
        a(this, this.c, b.Advertiser);
        a(this, this.e, b.Body);
        a(this, this.g, b.Cta);
        a(this, this.d, b.Icon);
        a(this, this.f7596a, b.Container);
        a(this, this.h, b.PrivacyIcon);
    }

    private final void s() {
        this.f7596a.setListener$mediationsdk_release(new c());
    }

    public final C4764z8 a() {
        return this.f7596a;
    }

    public final View b() {
        return this.b;
    }

    public final View c() {
        return this.c;
    }

    public final View d() {
        return this.d;
    }

    public final View e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d8 = (D8) obj;
        return Intrinsics.areEqual(this.f7596a, d8.f7596a) && Intrinsics.areEqual(this.b, d8.b) && Intrinsics.areEqual(this.c, d8.c) && Intrinsics.areEqual(this.d, d8.d) && Intrinsics.areEqual(this.e, d8.e) && Intrinsics.areEqual(this.f, d8.f) && Intrinsics.areEqual(this.g, d8.g) && Intrinsics.areEqual(this.h, d8.h);
    }

    public final View f() {
        return this.f;
    }

    public final View g() {
        return this.g;
    }

    public final View h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.f7596a.hashCode() * 31;
        View view = this.b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final View i() {
        return this.c;
    }

    public final View j() {
        return this.e;
    }

    public final C4764z8 k() {
        return this.f7596a;
    }

    public final View l() {
        return this.g;
    }

    public final View m() {
        return this.d;
    }

    public final a n() {
        return this.i;
    }

    public final View o() {
        return this.f;
    }

    public final View p() {
        return this.h;
    }

    public final View q() {
        return this.b;
    }

    public final JSONObject t() {
        JSONObject put = new JSONObject().put("title", this.b != null).put(U3.i.F0, this.c != null).put("body", this.e != null).put("cta", this.g != null).put("media", this.f != null).put("icon", this.d != null);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f7596a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final D8 a(C4764z8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new D8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void b(View view) {
        this.e = view;
    }

    public final void c(View view) {
        this.g = view;
    }

    public final void d(View view) {
        this.d = view;
    }

    public final void e(View view) {
        this.f = view;
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.h = view;
    }

    public final void g(View view) {
        this.b = view;
    }

    public final void a(C4764z8 c4764z8) {
        Intrinsics.checkNotNullParameter(c4764z8, "<set-?>");
        this.f7596a = c4764z8;
    }

    public final void a(View view) {
        this.c = view;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    private static final void a(final D8 d8, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.D8$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    D8.a(D8.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D8 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    public /* synthetic */ D8(C4764z8 c4764z8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4764z8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }
}
