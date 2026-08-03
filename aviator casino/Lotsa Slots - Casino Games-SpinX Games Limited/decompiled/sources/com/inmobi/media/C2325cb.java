package com.inmobi.media;

/* renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2325cb {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5137a;
    public final com.inmobi.media.C2352db b;
    public final com.inmobi.media.C2279ai c;
    public final com.inmobi.media.Ta d;
    public final com.inmobi.media.InterfaceC2859wh e;
    public final com.inmobi.media.C2457hb f;
    public final com.inmobi.media.InterfaceC2772t9 g;
    public final java.lang.ref.WeakReference h;
    public int i;

    public /* synthetic */ C2325cb(android.content.Context context, com.inmobi.media.C2352db c2352db, com.inmobi.media.C2670pd c2670pd, com.inmobi.media.InterfaceC2859wh interfaceC2859wh, com.inmobi.media.C2457hb c2457hb, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, int i) {
        this(context, c2352db, null, (i & 8) != 0 ? null : c2670pd, interfaceC2859wh, c2457hb, interfaceC2772t9, null);
    }

    public static /* synthetic */ com.inmobi.media.C2298bb a(com.inmobi.media.C2325cb c2325cb, java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb, int i) {
        if ((i & 8) != 0) {
            c2431gb = null;
        }
        return c2325cb.a(str, str2, str3, c2431gb, (i & 16) == 0);
    }

    public final com.inmobi.media.C2298bb b(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", "In processInMobiNativeBrowserScheme");
        }
        java.lang.String queryParameter = android.net.Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            com.inmobi.media.Ta ta = this.d;
            if (ta != null) {
                ta.a(str2, "Invalid URL", str);
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 8001);
            return new com.inmobi.media.C2298bb(3, 8001);
        }
        if (c2431gb != null) {
            c2431gb.f = "EX_NATIVE";
        }
        boolean a2 = com.inmobi.media.AbstractC2661p5.a(str3, this.f5137a, this.e, this.g);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
        if (interfaceC2772t93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).c("cb", "openDefaultApplication result = " + a2 + " for url = " + str3);
        }
        if (a2) {
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c(str, str2, str3);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
            if (interfaceC2772t94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).c("cb", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new com.inmobi.media.C2298bb(1);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.g;
        if (interfaceC2772t95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t95).c("cb", "Trying appLinkOrDeepLinkHandled with urlEndpoint = " + queryParameter);
        }
        int a3 = com.inmobi.media.AbstractC2661p5.a(this.f5137a, queryParameter, this.e, str, this.g);
        if (a3 == 0 || a3 == 1) {
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c(str, str2, str3);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = this.g;
            if (interfaceC2772t96 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t96).c("cb", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new com.inmobi.media.C2298bb(1);
        }
        com.inmobi.media.Ta ta2 = this.d;
        if (ta2 != null) {
            ta2.a(str2, "Invalid URL", str);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t97 = this.g;
        if (interfaceC2772t97 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t97).c("cb", "processedResult = " + a3);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t98 = this.g;
        if (interfaceC2772t98 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t98).c("cb", "InmobiNativeBrowser scheme url handling failed");
        }
        a(com.inmobi.media.Ua.g, c2431gb, java.lang.Integer.valueOf(a3));
        return new com.inmobi.media.C2298bb(2, java.lang.Integer.valueOf(a3));
    }

    public final int c(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, c2431gb);
        } catch (java.lang.Exception e) {
            com.inmobi.media.Ta ta = this.d;
            if (ta != null) {
                ta.a(str2, "Unexpected error", "open");
            }
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
            if (interfaceC2772t92 == null) {
                return 9;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b("cb", "SDK encountered unexpected error in handling open() request from creative " + e.getMessage());
            return 9;
        }
    }

    public final int d(java.lang.String api, java.lang.String str, java.lang.String str2, com.inmobi.media.C2431gb c2431gb) {
        java.lang.String a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", "processOpenCCTRequest - url - " + str2);
        }
        if (c2431gb != null) {
            c2431gb.f = "IN_NATIVE";
        }
        if (str2 == null || (kotlin.text.StringsKt.startsWith$default(str2, androidx.webkit.ProxyConfig.MATCH_HTTP, false, 2, (java.lang.Object) null) && !android.webkit.URLUtil.isValidUrl(str2))) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", api + " called with invalid url (" + str2 + ")");
            }
            com.inmobi.media.Ta ta = this.d;
            if (ta != null) {
                ta.a(str, "Invalid URL", api);
            }
            a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 3);
            return 3;
        }
        java.lang.String a3 = com.inmobi.media.AbstractC2528k5.a(this.f5137a);
        try {
            try {
                boolean z = this.b.c;
                if (a3 != null && z) {
                    com.inmobi.media.U2 u2 = new com.inmobi.media.U2(str2, null, this.f5137a, this.c, this.e, c2431gb, api);
                    com.inmobi.media.C2477i5 c2477i5 = u2.e;
                    android.content.Context context = u2.f;
                    if (c2477i5.f5253a == null && context != null && (a2 = com.inmobi.media.AbstractC2528k5.a(context)) != null) {
                        com.inmobi.media.C2425g5 c2425g5 = new com.inmobi.media.C2425g5(c2477i5);
                        c2477i5.b = c2425g5;
                        androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(context, a2, c2425g5);
                    }
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
                    if (interfaceC2772t93 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t93).c("cb", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
                if (interfaceC2772t94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).a("cb", "ChromeCustomTab fallback to Embedded");
                }
                if (c2431gb != null) {
                    c2431gb.f = "IN_CUSTOM";
                }
                return a(str2, api, c2431gb);
            } catch (java.lang.Exception unused) {
                int a4 = com.inmobi.media.B3.a(this.f5137a, str2, this.e, api);
                if (a4 != 0 && a4 != 1) {
                    return a4;
                }
                c(api, str, str2);
                if (c2431gb != null) {
                    c2431gb.f = "EX_NATIVE";
                }
                a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
                return a4;
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.g;
            if (interfaceC2772t95 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t95).a("cb", "Exception occurred while opening External ", e);
            }
            return 9;
        }
    }

    public final int e(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "In processOpenExternalNativeRequest");
        }
        int a2 = com.inmobi.media.AbstractC2661p5.a(this.f5137a, str3, this.e, str, this.g);
        if (a2 != 0 && a2 != 1) {
            return d(str, str2, str3, c2431gb);
        }
        if (c2431gb != null) {
            c2431gb.f = "EX_NATIVE";
        }
        a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
        c(str, str2, str3);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
        if (interfaceC2772t92 == null) {
            return 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
        ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "External Native handled successfully");
        return 0;
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb) {
        java.lang.String str4;
        try {
            int a2 = com.inmobi.media.B3.a(this.f5137a, str2, this.e, "openExternal");
            if (a2 != 0 && a2 != 1) {
                a(com.inmobi.media.Ua.g, c2431gb, java.lang.Integer.valueOf(a2));
                com.inmobi.media.Ta ta = this.d;
                if (ta != null) {
                    try {
                        str4 = java.net.URLEncoder.encode(str2, "UTF-8");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                    } catch (java.io.UnsupportedEncodingException unused) {
                        str4 = str2;
                    }
                    ta.a(str, "Cannot resolve URI (" + str4 + ")", "openExternal");
                    return;
                }
                return;
            }
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c("openExternal", str, str2);
        } catch (android.content.ActivityNotFoundException e) {
            a(this, str, str2, str3, c2431gb, e);
        } catch (java.lang.NullPointerException e2) {
            a(this, str, str2, str3, c2431gb, e2);
        } catch (java.net.URISyntaxException e3) {
            a(this, str, str2, str3, c2431gb, e3);
        } catch (java.lang.Exception e4) {
            a(com.inmobi.media.Ua.g, c2431gb, (java.lang.Integer) 9);
            com.inmobi.media.Ta ta2 = this.d;
            if (ta2 != null) {
                ta2.a(str, "Unexpected error", "openExternal");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            com.inmobi.media.Sb.a((byte) 1, "cb", "Could not open URL SDK encountered an unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("cb", "SDK encountered unexpected error in handling openExternal() request from creative " + e4.getMessage());
            }
        }
    }

    public C2325cb(android.content.Context context, com.inmobi.media.C2352db landingPageState, com.inmobi.media.C2279ai c2279ai, com.inmobi.media.Ta ta, com.inmobi.media.InterfaceC2859wh redirectionValidator, com.inmobi.media.C2457hb c2457hb, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageState, "landingPageState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        this.f5137a = context;
        this.b = landingPageState;
        this.c = c2279ai;
        this.d = ta;
        this.e = redirectionValidator;
        this.f = c2457hb;
        this.g = interfaceC2772t9;
        this.h = weakReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
    
        if (r7.equals("DEFAULT") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r7.equals("IN_NATIVE") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d1, code lost:
    
        r7 = r15.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d3, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
        ((com.inmobi.media.C2799u9) r7).c("cb", "default - internal native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01df, code lost:
    
        r1 = c(r16, r17, r18, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.inmobi.media.C2298bb a(java.lang.String api, java.lang.String str, java.lang.String str2, com.inmobi.media.C2431gb c2431gb, boolean z) {
        com.inmobi.media.C2431gb c2431gb2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        int c;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
        if (interfaceC2772t93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).c("cb", "processing URL - " + str2);
        }
        if (c2431gb == null) {
            com.inmobi.media.C2457hb c2457hb = this.f;
            if (c2457hb == null || this.b.f5159a || z) {
                c2431gb2 = null;
            } else {
                java.lang.String a2 = com.inmobi.media.Xa.a(str2);
                int i = this.i + 1;
                this.i = i;
                c2431gb2 = new com.inmobi.media.C2431gb(c2457hb, a2, i, android.os.SystemClock.elapsedRealtime());
            }
        } else {
            c2431gb2 = c2431gb;
        }
        a(com.inmobi.media.Ua.d, c2431gb2, (java.lang.Integer) null);
        if (str2 == null || str2.length() == 0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
            if (interfaceC2772t94 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).c("cb", "url is empty");
            }
            a(com.inmobi.media.Ua.e, c2431gb2, (java.lang.Integer) 2);
            b(api, str, str2);
            return new com.inmobi.media.C2298bb(3, 2);
        }
        android.net.Uri parse = android.net.Uri.parse(str2);
        java.lang.String scheme = parse.getScheme();
        if (scheme == null || scheme.length() == 0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.g;
            if (interfaceC2772t95 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t95).c("cb", "url scheme is empty");
            }
            a(com.inmobi.media.Ua.e, c2431gb2, (java.lang.Integer) 4);
            b(api, str, str2);
            return new com.inmobi.media.C2298bb(3, 4);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b.b, "SKSTORE")) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = this.g;
            if (interfaceC2772t96 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t96).c("cb", "inline installer");
            }
            return a(api, str, this.b.e, str2, c2431gb2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t97 = this.g;
            if (interfaceC2772t97 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t97).c("cb", "inmobi native browser scheme");
            }
            return b(api, str, str2, c2431gb2);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t98 = this.g;
            if (interfaceC2772t98 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t98).c("cb", "inmobi deeplink scheme");
            }
            return a(api, str, str2, c2431gb2);
        }
        if (com.inmobi.media.F1.a(this.f5137a, str2, this.e, api, this.g) || com.inmobi.media.AbstractC2661p5.a(str2, this.f5137a, this.e, this.g)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t99 = this.g;
            if (interfaceC2772t99 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t99).c("cb", "appstore link");
            }
            c(api, str, str2);
            if (c2431gb2 != null) {
                c2431gb2.f = "EX_NATIVE";
            }
            a(com.inmobi.media.Ua.f, c2431gb2, (java.lang.Integer) null);
            return new com.inmobi.media.C2298bb(1);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
        if (!com.inmobi.media.B3.a(parse)) {
            int a3 = com.inmobi.media.AbstractC2661p5.a(this.f5137a, str2, this.e, api, this.g);
            if (c2431gb2 != null) {
                c2431gb2.f = "EX_NATIVE";
            }
            if (a3 == 0 || a3 == 1) {
                a(com.inmobi.media.Ua.f, c2431gb2, (java.lang.Integer) null);
                c(api, str, str2);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t910 = this.g;
                if (interfaceC2772t910 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t910).c("cb", "Deeplink url handled successfully");
                }
                return new com.inmobi.media.C2298bb(1);
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t911 = this.g;
            if (interfaceC2772t911 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t911).c("cb", "In processOpenRequest else");
            }
            b(api, str, str2);
            a(com.inmobi.media.Ua.g, c2431gb2, java.lang.Integer.valueOf(a3));
            return new com.inmobi.media.C2298bb(2, java.lang.Integer.valueOf(a3));
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t912 = this.g;
        if (interfaceC2772t912 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t912).c("cb", "http link");
        }
        com.inmobi.media.C2352db c2352db = this.b;
        if (c2352db.f5159a) {
            return new com.inmobi.media.C2298bb(0);
        }
        java.lang.String str3 = c2352db.b;
        int hashCode = str3.hashCode();
        if (hashCode != -2032180703) {
            if (hashCode != -702637789) {
                if (hashCode != 112775115) {
                    if (hashCode == 409244785) {
                    }
                } else if (str3.equals("IN_CUSTOM")) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t913 = this.g;
                    if (interfaceC2772t913 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t913).c("cb", "open internal custom");
                    }
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t914 = this.g;
                    if (interfaceC2772t914 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t914).a("cb", "In processOpenInternalCustomRequest");
                    }
                    c = a(str2, api, c2431gb2);
                    if ((c == 0 || c == 1) && (interfaceC2772t92 = this.g) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "Internal Custom handled successfully");
                    }
                }
                interfaceC2772t9 = this.g;
                if (interfaceC2772t9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", "invalid scheme - open internal native");
                }
                c = c(api, str, str2, c2431gb2);
            } else {
                if (str3.equals("EX_NATIVE")) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t915 = this.g;
                    if (interfaceC2772t915 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t915).c("cb", "open external native");
                    }
                    c = e(api, str, str2, c2431gb2);
                }
                interfaceC2772t9 = this.g;
                if (interfaceC2772t9 != null) {
                }
                c = c(api, str, str2, c2431gb2);
            }
        }
        if (c == 0 || c == 1) {
            return new com.inmobi.media.C2298bb(1);
        }
        if (c2431gb2 != null) {
            c2431gb2.f = this.b.b;
        }
        a(com.inmobi.media.Ua.g, c2431gb2, java.lang.Integer.valueOf(c));
        return new com.inmobi.media.C2298bb(2, java.lang.Integer.valueOf(c));
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.inmobi.media.Ta ta = this.d;
        if (ta != null) {
            ta.a();
        }
        com.inmobi.media.Ta ta2 = this.d;
        if (ta2 != null) {
            ta2.b(str, str2, str3);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", str + " called with invalid url (" + str3 + ")");
        }
        com.inmobi.media.Ta ta = this.d;
        if (ta != null) {
            ta.a(str2, "Invalid URL", str);
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2, com.inmobi.media.C2431gb c2431gb, com.inmobi.media.Q2 q2) {
        java.lang.String a2;
        try {
            if (this.b.d && q2 != null) {
                java.lang.String a3 = com.inmobi.media.AbstractC2528k5.a(this.f5137a);
                if (a3 != null) {
                    try {
                        if (com.inmobi.media.Mf.b(com.inmobi.media.Mf.a(com.inmobi.media.N5.g()))) {
                            androidx.browser.customtabs.CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", java.lang.Integer.TYPE);
                        } else {
                            androidx.browser.customtabs.CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", java.lang.Integer.TYPE);
                        }
                        com.inmobi.media.U2 u2 = new com.inmobi.media.U2(str2, q2, this.f5137a, this.c, this.e, c2431gb, str);
                        com.inmobi.media.C2477i5 c2477i5 = u2.e;
                        android.content.Context context = u2.f;
                        if (c2477i5.f5253a == null && context != null && (a2 = com.inmobi.media.AbstractC2528k5.a(context)) != null) {
                            com.inmobi.media.C2425g5 c2425g5 = new com.inmobi.media.C2425g5(c2477i5);
                            c2477i5.b = c2425g5;
                            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(context, a2, c2425g5);
                        }
                        return true;
                    } catch (java.lang.Error | java.lang.Exception unused) {
                    }
                }
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
                if (interfaceC2772t9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", "Partial tabs not supported: packageName - " + a3);
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "Error while opening partial tab: " + e.getMessage());
            }
        }
        return false;
    }

    public final int a(java.lang.String api, java.lang.String str, java.lang.String str2, com.inmobi.media.C2431gb c2431gb, com.inmobi.media.Q2 q2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (str2 != null && str2.length() != 0) {
            android.net.Uri parse = android.net.Uri.parse(str2);
            java.lang.String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, c2431gb);
                    return 2;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
                    return a(api, str, str2, c2431gb).f5121a == 1 ? 2 : 4;
                }
                if (com.inmobi.media.F1.a(this.f5137a, str2, this.e, api, this.g) | com.inmobi.media.AbstractC2661p5.a(str2, this.f5137a, this.e, this.g)) {
                    c(api, str, str2);
                    if (c2431gb != null) {
                        c2431gb.f = "EX_NATIVE";
                    }
                    a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
                    return 2;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
                if (com.inmobi.media.B3.a(parse) && a(api, str2, c2431gb, q2)) {
                    return 5;
                }
                if (com.inmobi.media.B3.a(parse)) {
                    return 3;
                }
                int a2 = com.inmobi.media.AbstractC2661p5.a(this.f5137a, str2, this.e, api, this.g);
                if (c2431gb != null) {
                    c2431gb.f = "EX_NATIVE";
                }
                if (a2 != 0 && a2 != 1) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
                    if (interfaceC2772t9 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).b("cb", "CustomExpand handling failed");
                    }
                    a(com.inmobi.media.Ua.j, c2431gb, (java.lang.Integer) null);
                    return 4;
                }
                c(api, str, str2);
                a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
                if (interfaceC2772t92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "Deeplink url handled successfully");
                }
                return 2;
            }
            b(api, str, str2);
            a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 4);
            return 1;
        }
        b(api, str, str2);
        a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 2);
        return 1;
    }

    public final com.inmobi.media.C2298bb a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "In processInMobiDeepLinkScheme");
        }
        android.net.Uri parse = android.net.Uri.parse(str3);
        int a2 = a(str, parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"));
        if (a2 != 0 && a2 != 1) {
            int a3 = a(str, parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"));
            if (c2431gb != null) {
                c2431gb.f = "EX_NATIVE";
            }
            if (a3 != 0 && a3 != 1) {
                com.inmobi.media.Ta ta = this.d;
                if (ta != null) {
                    ta.a(str2, "Invalid URL", str);
                }
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
                if (interfaceC2772t92 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).c("cb", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(com.inmobi.media.Ua.g, c2431gb, java.lang.Integer.valueOf(a3));
                return new com.inmobi.media.C2298bb(2, java.lang.Integer.valueOf(a3));
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
            if (interfaceC2772t93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).c("cb", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c(str, str2, str3);
            return new com.inmobi.media.C2298bb(1);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
        if (interfaceC2772t94 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t94).c("cb", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (c2431gb != null) {
            c2431gb.f = "EX_NATIVE";
        }
        a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
        c(str, str2, str3);
        return new com.inmobi.media.C2298bb(1);
    }

    public final int a(java.lang.String str, java.lang.String str2, java.lang.String url) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("cb", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + url);
        }
        if (str2 != null && str2.length() != 0) {
            if (com.inmobi.media.AbstractC2661p5.a(str2, this.f5137a, this.e, this.g)) {
                if (com.inmobi.media.J3.a(url)) {
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(url);
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.A3.a(url, true, interfaceC2772t92);
                } else {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
                    if (interfaceC2772t93 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t93).b("cb", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
                if (interfaceC2772t94 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).c("cb", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int a2 = com.inmobi.media.AbstractC2661p5.a(this.f5137a, str2, this.e, str, this.g);
            if (a2 != 0 && a2 != 1) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.g;
                if (interfaceC2772t95 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t95).c("cb", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return a2;
            }
            if (com.inmobi.media.J3.a(url)) {
                com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
                kotlin.jvm.internal.Intrinsics.checkNotNull(url);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, interfaceC2772t96);
            } else {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t97 = this.g;
                if (interfaceC2772t97 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t97).b("cb", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t98 = this.g;
            if (interfaceC2772t98 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t98).c("cb", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t99 = this.g;
        if (interfaceC2772t99 == null) {
            return 2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
        ((com.inmobi.media.C2799u9) interfaceC2772t99).b("cb", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(java.lang.String url, java.lang.String api, com.inmobi.media.C2431gb c2431gb) {
        com.inmobi.media.C2431gb c2431gb2;
        com.inmobi.media.C2431gb c2431gb3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (c2431gb != null) {
            c2431gb.f = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("cb", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) null);
            return 2;
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (com.inmobi.media.B3.a(parse)) {
            android.content.Intent intent = new android.content.Intent(this.f5137a, (java.lang.Class<?>) com.inmobi.ads.rendering.InMobiInAppBrowserActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.e.getViewTouchTimestamp());
            if (c2431gb != null) {
                c2431gb2 = com.inmobi.media.C2431gb.a(c2431gb);
                com.inmobi.media.Ua ua = com.inmobi.media.Ua.d;
                c2431gb2.e = 2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                c2431gb2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c2431gb2);
            if (c2431gb != null) {
                c2431gb3 = com.inmobi.media.C2431gb.a(c2431gb);
                com.inmobi.media.Ua ua2 = com.inmobi.media.Ua.d;
                c2431gb3.e = 2;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } else {
                c2431gb3 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c2431gb3);
            com.inmobi.media.InterfaceC2772t9 obj = this.g;
            if (obj != null) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                java.util.HashMap hashMap = com.inmobi.media.U8.f4992a;
                java.lang.String key = uuid.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                com.inmobi.media.U8.f4992a.put(key, new java.lang.ref.WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            com.inmobi.media.Ta ta = this.d;
            if (ta != null) {
                ta.a(intent);
            }
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            com.inmobi.media.Ta ta2 = this.d;
            if (ta2 == null) {
                return 1;
            }
            ta2.b(null, null, url);
            return 1;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
        if (interfaceC2772t92 == null) {
            return 10;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
        ((com.inmobi.media.C2799u9) interfaceC2772t92).b("cb", "Embedded request unable to handle " + url);
        return 10;
    }

    public final com.inmobi.media.C2298bb a(java.lang.String api, java.lang.String str, com.inmobi.media.ads.network.common.model.InlineParams inlineParams, java.lang.String url, com.inmobi.media.C2431gb c2431gb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "inline installer called with URL: " + url);
        }
        if (c2431gb != null) {
            c2431gb.f = "SKSTORE";
        }
        com.inmobi.media.AbstractC2272ab a2 = a(inlineParams);
        if (a2 instanceof com.inmobi.media.Za) {
            return a(api, str, c2431gb, url, (com.inmobi.media.Za) a2, inlineParams != null && inlineParams.getPingInWebView());
        }
        if (a2 instanceof com.inmobi.media.Ya) {
            return a(url, api, str, c2431gb, ((com.inmobi.media.Ya) a2).f5063a);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.inmobi.media.AbstractC2272ab a(com.inmobi.media.ads.network.common.model.InlineParams inlineParams) {
        android.app.Activity activity;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        if (inlineParams == null) {
            return new com.inmobi.media.Ya(8700);
        }
        java.lang.ref.WeakReference weakReference = this.h;
        if (weakReference == null || (gestureDetectorOnGestureListenerC2675pi = (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) weakReference.get()) == null) {
            activity = null;
        } else {
            activity = gestureDetectorOnGestureListenerC2675pi.getFullScreenActivity();
            if (activity == null) {
                activity = gestureDetectorOnGestureListenerC2675pi.getBannerHolderActivity().get();
            }
        }
        java.lang.String packageName = this.f5137a.getPackageName();
        java.lang.String targetBundleId = inlineParams.getTargetBundleId();
        boolean overlay = inlineParams.getOverlay();
        java.lang.String url = inlineParams.getUrl();
        if (targetBundleId != null && targetBundleId.length() != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(packageName);
            if (packageName.length() == 0) {
                return new com.inmobi.media.Ya(8703);
            }
            if (activity == null) {
                return new com.inmobi.media.Ya(8704);
            }
            if (url != null && url.length() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(url);
                sb.append("id=" + targetBundleId);
                java.lang.String referrer = inlineParams.getReferrer();
                java.lang.String listing = inlineParams.getListing();
                if (referrer != null && !kotlin.text.StringsKt.isBlank(referrer)) {
                    sb.append(kotlin.text.Typography.amp);
                    sb.append("referrer=" + referrer);
                }
                if (listing != null && !kotlin.text.StringsKt.isBlank(listing)) {
                    sb.append(kotlin.text.Typography.amp);
                    sb.append("listing=" + listing);
                }
                return new com.inmobi.media.Za(activity, sb.toString(), packageName, overlay);
            }
            return new com.inmobi.media.Ya(2);
        }
        return new com.inmobi.media.Ya(8702);
    }

    public final com.inmobi.media.C2298bb a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i, c2431gb);
        if (c2431gb != null) {
            c2431gb.f = "EX_NATIVE";
        }
        if (com.inmobi.media.F1.a(this.f5137a, str, this.e, str2, this.g)) {
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c(str2, str3, str);
            return new com.inmobi.media.C2298bb(1);
        }
        if (com.inmobi.media.AbstractC2661p5.a(str, this.f5137a, this.e, this.g)) {
            a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            c(str2, str3, str);
            return new com.inmobi.media.C2298bb(1);
        }
        int e = e(str2, str3, str, c2431gb);
        if (e != 0 && e != 1) {
            a(com.inmobi.media.Ua.g, c2431gb, java.lang.Integer.valueOf(e));
            com.inmobi.media.Ta ta = this.d;
            if (ta != null) {
                ta.a(str3, "Launch failed", str2);
            }
            return new com.inmobi.media.C2298bb(2, java.lang.Integer.valueOf(e));
        }
        return new com.inmobi.media.C2298bb(1);
    }

    public final com.inmobi.media.C2298bb a(java.lang.String str, java.lang.String str2, com.inmobi.media.C2431gb c2431gb, java.lang.String url, com.inmobi.media.Za za, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("cb", "Executing inline installer flow for URL: " + url);
        }
        int a2 = com.inmobi.media.B3.a(za, this.e, str);
        if (a2 != 0 && a2 != 1) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.g;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("cb", "Inline installer launch failed; executing fallback for URL: " + url + ", errorCode: " + a2);
            }
            return a(url, str, str2, c2431gb, a2);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.g;
        if (interfaceC2772t93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a("cb", "Inline installer launch succeeded for URL: " + url);
        }
        if (z) {
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.Mg.a(com.inmobi.media.Jg.b, new com.inmobi.media.C2766t3(url, true, interfaceC2772t94, null));
        } else {
            com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, true, interfaceC2772t95);
        }
        a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
        com.inmobi.media.Ta ta = this.d;
        if (ta != null) {
            ta.b(str, str2, url);
        }
        return new com.inmobi.media.C2298bb(1);
    }

    public final void a(int i, com.inmobi.media.C2431gb c2431gb) {
        java.lang.Object m10798constructorimpl;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        com.inmobi.media.C2457hb c2457hb;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (c2431gb == null || (c2457hb = c2431gb.f5216a) == null) {
                c2457hb = this.f;
            }
            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(i)));
            if (c2457hb != null) {
                mutableMapOf.put("plType", c2457hb.c);
                mutableMapOf.put("impressionId", c2457hb.b);
                mutableMapOf.put("plId", java.lang.Long.valueOf(c2457hb.f5239a));
                mutableMapOf.put("adType", c2457hb.d);
                mutableMapOf.put("markupType", c2457hb.e);
                mutableMapOf.put("creativeType", c2457hb.f);
                mutableMapOf.put("metadataBlob", c2457hb.g);
                mutableMapOf.put("isRewarded", java.lang.Boolean.valueOf(c2457hb.h));
            }
            if (c2431gb != null) {
                java.lang.String str = c2431gb.f;
                if (str == null) {
                    str = c2431gb.f5216a.i;
                }
                mutableMapOf.put("trigger", str);
                mutableMapOf.put("urlType", c2431gb.b);
                long j2 = c2431gb.d;
                if (j2 != 0) {
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
                    mutableMapOf.put("latency", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j2));
                }
            }
            mutableMapOf.put("networkType", com.inmobi.media.B5.g());
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("InlineInstallFailed", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || (interfaceC2772t9 = this.g) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).b("cb", "Failed to submit inline install failed telemetry: " + m10801exceptionOrNullimpl.getMessage());
    }

    public static final void a(com.inmobi.media.C2325cb c2325cb, java.lang.String str, java.lang.String str2, java.lang.String str3, com.inmobi.media.C2431gb c2431gb, java.lang.Exception exc) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2325cb.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("cb", "Error message in processing openExternal: " + exc.getMessage());
        }
        com.inmobi.media.Ta ta = c2325cb.d;
        if (ta != null) {
            try {
                java.lang.String encode = java.net.URLEncoder.encode(str2, "UTF-8");
                kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
                str2 = encode;
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            ta.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            c2325cb.f(str, str3, null, c2431gb);
        }
    }

    public final void a(com.inmobi.media.Ua funnelState, com.inmobi.media.C2431gb c2431gb, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        com.inmobi.media.Xa.a(funnelState, c2431gb, num, new kotlin.jvm.functions.Function2() { // from class: com.inmobi.media.cb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.inmobi.media.C2325cb.a(com.inmobi.media.C2325cb.this, (java.lang.String) obj, (java.util.Map) obj2);
            }
        });
    }

    public static final kotlin.Unit a(com.inmobi.media.C2325cb c2325cb, java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        com.inmobi.media.Ta ta = c2325cb.d;
        if (ta != null) {
            ta.a(trackerName, macros);
        }
        return kotlin.Unit.INSTANCE;
    }
}
