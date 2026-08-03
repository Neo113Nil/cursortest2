package com.ironsource;

/* loaded from: classes5.dex */
public final class F8 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.B8 f5699a;
    private android.view.View b;
    private android.view.View c;
    private android.view.View d;
    private android.view.View e;
    private android.view.View f;
    private android.view.View g;
    private android.view.View h;
    private com.ironsource.F8.a i;

    public interface a {
        void a(com.ironsource.Ag ag);

        void a(com.ironsource.F8.b bVar);
    }

    public enum b {
        Title("title"),
        Advertiser(com.ironsource.X3.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(com.ironsource.X3.i.J0);


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f5700a;

        b(java.lang.String str) {
            this.f5700a = str;
        }

        public final java.lang.String b() {
            return this.f5700a;
        }
    }

    public static final class c implements com.ironsource.B8.a {
        c() {
        }

        @Override // com.ironsource.B8.a
        public void a(com.ironsource.Ag viewVisibilityParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            com.ironsource.F8.a n = com.ironsource.F8.this.n();
            if (n != null) {
                n.a(viewVisibilityParams);
            }
        }
    }

    public F8(com.ironsource.B8 containerView, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View privacyIconView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f5699a = containerView;
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
        a(this, this.b, com.ironsource.F8.b.Title);
        a(this, this.c, com.ironsource.F8.b.Advertiser);
        a(this, this.e, com.ironsource.F8.b.Body);
        a(this, this.g, com.ironsource.F8.b.Cta);
        a(this, this.d, com.ironsource.F8.b.Icon);
        a(this, this.f5699a, com.ironsource.F8.b.Container);
        a(this, this.h, com.ironsource.F8.b.PrivacyIcon);
    }

    private final void s() {
        this.f5699a.setListener$mediationsdk_release(new com.ironsource.F8.c());
    }

    public final com.ironsource.B8 a() {
        return this.f5699a;
    }

    public final android.view.View b() {
        return this.b;
    }

    public final android.view.View c() {
        return this.c;
    }

    public final android.view.View d() {
        return this.d;
    }

    public final android.view.View e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.F8)) {
            return false;
        }
        com.ironsource.F8 f8 = (com.ironsource.F8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5699a, f8.f5699a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, f8.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, f8.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, f8.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, f8.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, f8.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, f8.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, f8.h);
    }

    public final android.view.View f() {
        return this.f;
    }

    public final android.view.View g() {
        return this.g;
    }

    public final android.view.View h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.f5699a.hashCode() * 31;
        android.view.View view = this.b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        android.view.View view2 = this.c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        android.view.View view3 = this.d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        android.view.View view4 = this.e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        android.view.View view5 = this.f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        android.view.View view6 = this.g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final android.view.View i() {
        return this.c;
    }

    public final android.view.View j() {
        return this.e;
    }

    public final com.ironsource.B8 k() {
        return this.f5699a;
    }

    public final android.view.View l() {
        return this.g;
    }

    public final android.view.View m() {
        return this.d;
    }

    public final com.ironsource.F8.a n() {
        return this.i;
    }

    public final android.view.View o() {
        return this.f;
    }

    public final android.view.View p() {
        return this.h;
    }

    public final android.view.View q() {
        return this.b;
    }

    public final org.json.JSONObject t() {
        org.json.JSONObject put = new org.json.JSONObject().put("title", this.b != null).put(com.ironsource.X3.i.F0, this.c != null).put("body", this.e != null).put("cta", this.g != null).put("media", this.f != null).put("icon", this.d != null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    public java.lang.String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f5699a + ", titleView=" + this.b + ", advertiserView=" + this.c + ", iconView=" + this.d + ", bodyView=" + this.e + ", mediaView=" + this.f + ", ctaView=" + this.g + ", privacyIconView=" + this.h + ")";
    }

    public final com.ironsource.F8 a(com.ironsource.B8 containerView, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View privacyIconView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new com.ironsource.F8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void b(android.view.View view) {
        this.e = view;
    }

    public final void c(android.view.View view) {
        this.g = view;
    }

    public final void d(android.view.View view) {
        this.d = view;
    }

    public final void e(android.view.View view) {
        this.f = view;
    }

    public final void f(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.h = view;
    }

    public final void g(android.view.View view) {
        this.b = view;
    }

    public final void a(com.ironsource.B8 b8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b8, "<set-?>");
        this.f5699a = b8;
    }

    public final void a(android.view.View view) {
        this.c = view;
    }

    public final void a(com.ironsource.F8.a aVar) {
        this.i = aVar;
    }

    private static final void a(final com.ironsource.F8 f8, android.view.View view, final com.ironsource.F8.b bVar) {
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.ironsource.F8$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.ironsource.F8.a(com.ironsource.F8.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.F8 this$0, com.ironsource.F8.b viewName, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewName, "$viewName");
        com.ironsource.F8.a aVar = this$0.i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    public /* synthetic */ F8(com.ironsource.B8 b8, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View view7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }
}
