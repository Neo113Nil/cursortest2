package com.ironsource;

/* loaded from: classes5.dex */
public final class C8 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5653a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final android.graphics.drawable.Drawable e;
    private final android.webkit.WebView f;
    private final android.view.View g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C8.b.a f5655a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f5656a;
            private final java.lang.String b;
            private final java.lang.String c;
            private final java.lang.String d;
            private final kotlin.Result<android.graphics.drawable.Drawable> e;
            private final kotlin.Result<android.webkit.WebView> f;
            private final android.view.View g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.Result<? extends android.graphics.drawable.Drawable> result, kotlin.Result<? extends android.webkit.WebView> result2, android.view.View privacyIcon) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f5656a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = privacyIcon;
            }

            public final java.lang.String a() {
                return this.f5656a;
            }

            public final java.lang.String b() {
                return this.b;
            }

            public final java.lang.String c() {
                return this.c;
            }

            public final java.lang.String d() {
                return this.d;
            }

            public final kotlin.Result<android.graphics.drawable.Drawable> e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.C8.b.a)) {
                    return false;
                }
                com.ironsource.C8.b.a aVar = (com.ironsource.C8.b.a) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.f5656a, aVar.f5656a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, aVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, aVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, aVar.g);
            }

            public final kotlin.Result<android.webkit.WebView> f() {
                return this.f;
            }

            public final android.view.View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final com.ironsource.C8 h() {
                android.graphics.drawable.Drawable drawable;
                java.lang.String str = this.f5656a;
                java.lang.String str2 = this.b;
                java.lang.String str3 = this.c;
                java.lang.String str4 = this.d;
                kotlin.Result<android.graphics.drawable.Drawable> result = this.e;
                if (result != null) {
                    java.lang.Object value = result.getValue();
                    if (kotlin.Result.m10804isFailureimpl(value)) {
                        value = null;
                    }
                    drawable = (android.graphics.drawable.Drawable) value;
                } else {
                    drawable = null;
                }
                kotlin.Result<android.webkit.WebView> result2 = this.f;
                if (result2 != null) {
                    java.lang.Object value2 = result2.getValue();
                    r5 = kotlin.Result.m10804isFailureimpl(value2) ? null : value2;
                }
                return new com.ironsource.C8(str, str2, str3, str4, drawable, r5, this.g);
            }

            public int hashCode() {
                java.lang.String str = this.f5656a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                kotlin.Result<android.graphics.drawable.Drawable> result = this.e;
                int m10803hashCodeimpl = (hashCode4 + (result == null ? 0 : kotlin.Result.m10803hashCodeimpl(result.getValue()))) * 31;
                kotlin.Result<android.webkit.WebView> result2 = this.f;
                return ((m10803hashCodeimpl + (result2 != null ? kotlin.Result.m10803hashCodeimpl(result2.getValue()) : 0)) * 31) + this.g.hashCode();
            }

            public final java.lang.String i() {
                return this.b;
            }

            public final java.lang.String j() {
                return this.c;
            }

            public final java.lang.String k() {
                return this.d;
            }

            public final kotlin.Result<android.graphics.drawable.Drawable> l() {
                return this.e;
            }

            public final kotlin.Result<android.webkit.WebView> m() {
                return this.f;
            }

            public final android.view.View n() {
                return this.g;
            }

            public final java.lang.String o() {
                return this.f5656a;
            }

            public java.lang.String toString() {
                return "Data(title=" + this.f5656a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", media=" + this.f + ", privacyIcon=" + this.g + ")";
            }

            public final com.ironsource.C8.b.a a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.Result<? extends android.graphics.drawable.Drawable> result, kotlin.Result<? extends android.webkit.WebView> result2, android.view.View privacyIcon) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new com.ironsource.C8.b.a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            public static /* synthetic */ com.ironsource.C8.b.a a(com.ironsource.C8.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.Result result, kotlin.Result result2, android.view.View view, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f5656a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                java.lang.String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                java.lang.String str7 = str4;
                if ((i & 16) != 0) {
                    result = aVar.e;
                }
                kotlin.Result result3 = result;
                if ((i & 32) != 0) {
                    result2 = aVar.f;
                }
                kotlin.Result result4 = result2;
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                return aVar.a(str, str5, str6, str7, result3, result4, view);
            }
        }

        public b(com.ironsource.C8.b.a data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            this.f5655a = data;
        }

        public final com.ironsource.C8.b.a a() {
            return this.f5655a;
        }

        public final org.json.JSONObject b() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.f5655a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f5655a.i() != null) {
                a(jSONObject, com.ironsource.X3.i.F0);
            }
            if (this.f5655a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f5655a.k() != null) {
                a(jSONObject, "cta");
            }
            kotlin.Result<android.graphics.drawable.Drawable> l = this.f5655a.l();
            if (l != null) {
                a(jSONObject, "icon", l.getValue());
            }
            kotlin.Result<android.webkit.WebView> m = this.f5655a.m();
            if (m != null) {
                a(jSONObject, "media", m.getValue());
            }
            return jSONObject;
        }

        private static final void a(org.json.JSONObject jSONObject, java.lang.String str) {
            jSONObject.put(str, new org.json.JSONObject().put("success", true));
        }

        private static final <T> void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("success", kotlin.Result.m10805isSuccessimpl(obj));
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj);
            if (m10801exceptionOrNullimpl != null) {
                java.lang.String message = m10801exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            jSONObject.put(str, jSONObject2);
        }
    }

    public C8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.drawable.Drawable drawable, android.webkit.WebView webView, android.view.View privacyIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f5653a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = privacyIcon;
    }

    public final java.lang.String a() {
        return this.f5653a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final android.graphics.drawable.Drawable e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C8)) {
            return false;
        }
        com.ironsource.C8 c8 = (com.ironsource.C8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5653a, c8.f5653a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c8.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c8.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c8.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c8.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c8.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c8.g);
    }

    public final android.webkit.WebView f() {
        return this.f;
    }

    public final android.view.View g() {
        return this.g;
    }

    public final java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        java.lang.String str = this.f5653a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        android.webkit.WebView webView = this.f;
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final java.lang.String i() {
        return this.c;
    }

    public final java.lang.String j() {
        return this.d;
    }

    public final android.graphics.drawable.Drawable k() {
        return this.e;
    }

    public final android.webkit.WebView l() {
        return this.f;
    }

    public final android.view.View m() {
        return this.g;
    }

    public final java.lang.String n() {
        return this.f5653a;
    }

    public java.lang.String toString() {
        return "ISNNativeAdData(title=" + this.f5653a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", mediaView=" + this.f + ", privacyIcon=" + this.g + ")";
    }

    public final com.ironsource.C8 a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.drawable.Drawable drawable, android.webkit.WebView webView, android.view.View privacyIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new com.ironsource.C8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ com.ironsource.C8 a(com.ironsource.C8 c8, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.drawable.Drawable drawable, android.webkit.WebView webView, android.view.View view, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c8.f5653a;
        }
        if ((i & 2) != 0) {
            str2 = c8.b;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c8.c;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c8.d;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            drawable = c8.e;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 32) != 0) {
            webView = c8.f;
        }
        android.webkit.WebView webView2 = webView;
        if ((i & 64) != 0) {
            view = c8.g;
        }
        return c8.a(str, str5, str6, str7, drawable2, webView2, view);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.T8 f5654a;
        private final com.ironsource.InterfaceC2998d1 b;

        public a(com.ironsource.T8 imageLoader, com.ironsource.InterfaceC2998d1 adViewManagement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f5654a = imageLoader;
            this.b = adViewManagement;
        }

        private final kotlin.Result<android.graphics.drawable.Drawable> b(java.lang.String str) {
            if (str == null) {
                return null;
            }
            return kotlin.Result.m10797boximpl(this.f5654a.a(str));
        }

        public final com.ironsource.C8.b a(android.content.Context activityContext, org.json.JSONObject json) {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String str4;
            java.lang.String b;
            java.lang.String b2;
            java.lang.String b3;
            java.lang.String b4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            org.json.JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = com.ironsource.D8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            org.json.JSONObject optJSONObject2 = json.optJSONObject(com.ironsource.X3.i.F0);
            if (optJSONObject2 != null) {
                b3 = com.ironsource.D8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            org.json.JSONObject optJSONObject3 = json.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = com.ironsource.D8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            org.json.JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                b = com.ironsource.D8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            org.json.JSONObject optJSONObject5 = json.optJSONObject("icon");
            java.lang.String b5 = optJSONObject5 != null ? com.ironsource.D8.b(optJSONObject5, "url") : null;
            org.json.JSONObject optJSONObject6 = json.optJSONObject("media");
            java.lang.String b6 = optJSONObject6 != null ? com.ironsource.D8.b(optJSONObject6, "adViewId") : null;
            org.json.JSONObject optJSONObject7 = json.optJSONObject(com.ironsource.X3.i.J0);
            return new com.ironsource.C8.b(new com.ironsource.C8.b.a(str, str2, str3, str4, b(b5), a(b6), com.ironsource.C3404zd.f6863a.a(activityContext, optJSONObject7 != null ? com.ironsource.D8.b(optJSONObject7, "url") : null, this.f5654a)));
        }

        private final kotlin.Result<android.webkit.WebView> a(java.lang.String str) {
            if (str == null) {
                return null;
            }
            com.ironsource.G8 a2 = this.b.a(str);
            android.webkit.WebView presentingView = a2 != null ? a2.getPresentingView() : null;
            if (presentingView == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("missing adview for id: '" + str + "'"))));
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(presentingView));
        }
    }
}
