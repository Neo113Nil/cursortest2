package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ca {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4638a;
    public final int b;
    public com.inmobi.media.InterfaceC2772t9 c;

    public Ca(int i, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi mRenderView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.f4638a = mRenderView;
        this.b = i;
    }

    public static final void b(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        com.inmobi.media.C2325cb.a(ca.f4638a.getLandingPageHandler(), "open", str, str2, (com.inmobi.media.C2431gb) null, 24);
    }

    public static final void c(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        com.inmobi.media.C2431gb c2431gb;
        try {
            com.inmobi.media.C2457hb c2457hb = ca.f4638a.getLandingPageHandler().f;
            if (c2457hb != null) {
                java.lang.String a2 = com.inmobi.media.Xa.a(str2);
                com.inmobi.media.C2325cb landingPageHandler = ca.f4638a.getLandingPageHandler();
                int i = landingPageHandler.i + 1;
                landingPageHandler.i = i;
                c2431gb = new com.inmobi.media.C2431gb(c2457hb, a2, i, android.os.SystemClock.elapsedRealtime());
            } else {
                c2431gb = null;
            }
            if (c2431gb != null) {
                c2431gb.f = "IN_NATIVE";
            }
            ca.f4638a.getLandingPageHandler().d("openEmbedded", str, str2, c2431gb);
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "openEmbedded");
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void d(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        com.inmobi.media.C2325cb.a(ca.f4638a.getLandingPageHandler(), "openWithoutTracker", str, str2, (com.inmobi.media.C2431gb) null, 8);
    }

    public static final void e(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        try {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = ca.f4638a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            gestureDetectorOnGestureListenerC2675pi.b(str, str2.subSequence(i, length + 1).toString());
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "playVideo");
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void f(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        try {
            ca.f4638a.getSiblingWebviewManager().b(ca.f4638a.getRoute().b, str, str2);
        } catch (java.lang.Exception e) {
            ca.f4638a.a(com.ironsource.C3023e8.j, com.inmobi.media.Gi.a(str, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e.getMessage());
            }
        }
    }

    public final com.inmobi.media.EnumC2443gn a(java.lang.String str) {
        try {
            for (java.lang.Object obj : com.inmobi.media.EnumC2443gn.c) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.EnumC2443gn) obj).f5227a, str)) {
                    return (com.inmobi.media.EnumC2443gn) obj;
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (java.lang.Exception unused) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 == null) {
                return null;
            }
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @android.webkit.JavascriptInterface
    public final void asyncPing(java.lang.String str, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "asyncPing called: " + url);
        }
        if (!android.webkit.URLUtil.isValidUrl(url)) {
            this.f4638a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            kotlinx.coroutines.Deferred a2 = ((com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue()).a(new com.inmobi.media.Re(url, null, null, null, null, false, 62));
            kotlin.jvm.functions.Function1 onCompleted = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, (com.inmobi.media.Ve) obj);
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.E3(a2, onCompleted, null), 3, null);
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "asyncPing");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void cancelSaveContent(java.lang.String str, java.lang.String mediaId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @android.webkit.JavascriptInterface
    public final void close(final java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "close called");
        }
        final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (a2.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "close called on unloaded ad");
                return;
            }
            return;
        }
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.this, this, str);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @android.webkit.JavascriptInterface
    public final void closeAll(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "closeAll is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            a2.h();
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void closeCustomExpand(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "closeCustomExpand called.");
        }
        if (this.b == 1) {
            if (this.f4638a != null) {
                new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.Ca.a(com.inmobi.media.Ca.this);
                    }
                });
                return;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r11 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.C2852wa(r9, r11, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createVideoPlayer(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest htmlVideoPlayerRequest;
        java.lang.Object launch$default;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        if (str2 != null) {
            java.lang.Object obj = null;
            try {
                org.json.JSONObject jsonObject = new org.json.JSONObject(str2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest.class, "type");
                htmlVideoPlayerRequest = (com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest) com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest.class.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest.class, null, null));
            } catch (org.json.JSONException e) {
                com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.b;
                a(str, jSONObject);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "Error while creating config Json.", e);
                    obj = kotlin.Unit.INSTANCE;
                }
            }
            if (htmlVideoPlayerRequest != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            com.inmobi.media.EnumC2771t8 enumC2771t82 = com.inmobi.media.EnumC2771t8.b;
            a(str, jSONObject);
            obj = kotlin.Unit.INSTANCE;
            if (obj != null) {
            }
        }
        com.inmobi.media.EnumC2771t8 enumC2771t83 = com.inmobi.media.EnumC2771t8.b;
        a(str, jSONObject);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }

    @android.webkit.JavascriptInterface
    public final void customExpand(java.lang.String str, java.lang.String str2, int i, float f, boolean z, boolean z2) {
        com.inmobi.media.C2431gb c2431gb;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "customExpand called");
        }
        if (this.f4638a.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str5, "customExpand called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z3 ? i2 : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0) {
                if (i < 0 || i >= com.inmobi.media.V5.values().length) {
                    this.f4638a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f < 0.0f || f > 1.0f) {
                    this.f4638a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                com.inmobi.media.C2457hb c2457hb = this.f4638a.getLandingPageHandler().f;
                if (c2457hb != null) {
                    java.lang.String a2 = com.inmobi.media.Xa.a(str2);
                    com.inmobi.media.C2325cb landingPageHandler = this.f4638a.getLandingPageHandler();
                    int i3 = landingPageHandler.i + 1;
                    landingPageHandler.i = i3;
                    c2431gb = new com.inmobi.media.C2431gb(c2457hb, a2, i3, android.os.SystemClock.elapsedRealtime());
                } else {
                    c2431gb = null;
                }
                com.inmobi.media.C2431gb c2431gb2 = c2431gb;
                if (c2431gb2 != null) {
                    c2431gb2.f = "IN_CUSTOM";
                }
                this.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.d, c2431gb2, (java.lang.Integer) 8008);
                a(str, str2, i, f, z2, c2431gb2);
                return;
            }
        }
        this.f4638a.a(str, "Invalid " + i, "customExpand");
    }

    @android.webkit.JavascriptInterface
    public final void customExpandInNative(final java.lang.String str, final java.lang.String url, final float f, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "customExpandInNative called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b == 1) {
            if (f < 0.0f || f > 1.0f) {
                gestureDetectorOnGestureListenerC2675pi.a(str, "Invalid screenPercentage", "customExpandInNative");
                return;
            } else {
                com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, str, url, f, z);
                    }
                });
                return;
            }
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "customExpandInNative called in incorrect Ad type: " + this.b);
        }
    }

    @android.webkit.JavascriptInterface
    public final void destroyVideoPlayer(java.lang.String str) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.C2878xa(this, null), 3, null);
    }

    @android.webkit.JavascriptInterface
    public final void destroyWebView(java.lang.String str, final java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "destroyWebView called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null && a2.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "destroyWebView called on unloaded ad");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a3 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a3.put("errorCode", 108);
            gestureDetectorOnGestureListenerC2675pi.a("destroyWebView", a3);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            kotlin.Lazy lazy2 = com.inmobi.media.AbstractC2740s6.f5441a;
            com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, str2);
                }
            };
            executorC2378ec.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            executorC2378ec.f5177a.post(runnable);
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.f4638a;
        if (str2 == null) {
            str2 = "";
        }
        kotlin.Lazy lazy3 = com.inmobi.media.Gi.f4728a;
        org.json.JSONObject a4 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
        a4.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC2675pi2.a("destroyWebView", a4);
    }

    @android.webkit.JavascriptInterface
    public final void disableBackButton(java.lang.String str, final boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "disableBackButton called");
        }
        this.f4638a.getWebViewFactory().a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Ca.a(z, (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public final void disableCloseRegion(final java.lang.String str, final boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "disableCloseRegion called");
        }
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, z, str);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @android.webkit.JavascriptInterface
    public final void enableNativeGestures(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "enableNativeGestures called with enabled: " + z);
        }
        this.f4638a.setEnableNativeGestures(z);
    }

    @android.webkit.JavascriptInterface
    public final void enableTouchBeginCallback(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "enableTouchBeginCallback called with enabled: " + z);
        }
        this.f4638a.setEnableTouchBeginCallback(z);
    }

    @android.webkit.JavascriptInterface
    public final void enableTouchEndCallback(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "enableTouchEndCallback called with enabled: " + z);
        }
        this.f4638a.setEnableTouchEndCallback(z);
    }

    @android.webkit.JavascriptInterface
    public final void executeVideoPlayerActions(java.lang.String str, java.lang.String action, java.lang.String str2) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put(com.helpshift.proactive.InAppViewConstants.CONFIG, str2);
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", java.lang.String.valueOf(jSONObject));
        try {
            com.inmobi.media.EnumC2443gn a2 = a(action);
            if (a2 != null) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.C2903ya(this, a2, jSONObject, null), 3, null);
                if (launch$default != null) {
                    return;
                }
            }
            com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.b;
            a(str, jSONObject2);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } catch (org.json.JSONException e) {
            com.inmobi.media.EnumC2771t8 enumC2771t82 = com.inmobi.media.EnumC2771t8.b;
            a(str, jSONObject2);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "Error while creating action Json.", e);
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void fireAdFailed(java.lang.String str) {
        fireAdFailed(str, "");
    }

    @android.webkit.JavascriptInterface
    public final void fireAdReady(java.lang.String str) {
        try {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "fireAdReady called.");
            }
            this.f4638a.q();
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "fireAdReady");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void fireComplete(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "fireComplete is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.i();
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void fireSkip(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str2, "fireSkip is called");
        }
        if (this.f4638a == null && (interfaceC2772t9 = this.c) != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "Found a null instance of render view!");
        }
        this.f4638a.P();
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getAdContext(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getAdContext is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            com.inmobi.media.InterfaceC2842w0 adPodHandler = a2.getAdPodHandler();
            if (adPodHandler != null) {
                return ((com.inmobi.media.AbstractC2551l1) adPodHandler).v();
            }
            return null;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public final void getBlob(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.F2 f2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "getBlob is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (f2 = gestureDetectorOnGestureListenerC2675pi.k0) == null) {
            return;
        }
        ((com.inmobi.media.AbstractC2551l1) f2).a(str, str2, gestureDetectorOnGestureListenerC2675pi, gestureDetectorOnGestureListenerC2675pi.getImpressionId());
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getCurrentPosition(java.lang.String str) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getCurrentPosition called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi2 == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 == null) {
                return "";
            }
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC2675pi2.getCurrentPositionMonitor()) {
            this.f4638a.G = true;
            new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.b(com.inmobi.media.Ca.this);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2675pi = this.f4638a;
                if (gestureDetectorOnGestureListenerC2675pi.G) {
                    try {
                        gestureDetectorOnGestureListenerC2675pi.getCurrentPositionMonitor().wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2675pi.getCurrentPosition();
    }

    @android.webkit.JavascriptInterface
    public final int getCurrentRenderingIndex(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getCurrentRenderingIndex is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            return a2.getCurrentRenderingPodAdIndex();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 == null) {
            return 0;
        }
        java.lang.String str3 = com.inmobi.media.Da.f4658a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getDefaultPosition(java.lang.String str) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f4638a.getDefaultPositionMonitor()) {
            this.f4638a.F = true;
            new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.c(com.inmobi.media.Ca.this);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2675pi = this.f4638a;
                if (gestureDetectorOnGestureListenerC2675pi.F) {
                    try {
                        gestureDetectorOnGestureListenerC2675pi.getDefaultPositionMonitor().wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2675pi.getDefaultPosition();
    }

    @android.webkit.JavascriptInterface
    public final int getDeviceVolume(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getDeviceVolume called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            com.inmobi.media.Ec mediaProcessor = gestureDetectorOnGestureListenerC2675pi.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "getDeviceVolume");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e.getMessage());
            }
        }
        return -1;
    }

    @android.webkit.JavascriptInterface
    public final int getMaxDeviceVolume(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            com.inmobi.media.B5 b5 = com.inmobi.media.B5.f4614a;
            b5.getClass();
            return ((java.lang.Number) com.inmobi.media.B5.f.getValue(b5, com.inmobi.media.B5.b[0])).intValue();
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "getMaxDeviceVolume");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e.getMessage());
            }
            return 0;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getMaxSize(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getMaxSize called");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.app.Activity fullScreenActivity = this.f4638a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                android.content.Context containerContext = this.f4638a.getContainerContext();
                if ((containerContext instanceof android.app.Activity ? (android.app.Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                android.content.Context containerContext2 = this.f4638a.getContainerContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (android.app.Activity) containerContext2;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) fullScreenActivity.findViewById(android.R.id.content);
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = com.inmobi.media.J3.b(frameLayout.getWidth() / com.inmobi.media.N5.b());
            kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            intRef2.element = com.inmobi.media.J3.b(frameLayout.getHeight() / com.inmobi.media.N5.b());
            if (this.f4638a.getFullScreenActivity() != null && (intRef.element == 0 || intRef2.element == 0)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(frameLayout);
                com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va viewTreeObserverOnGlobalLayoutListenerC2826va = new com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va(frameLayout, this.c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2826va);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2928za(viewTreeObserverOnGlobalLayoutListenerC2826va, intRef, intRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", intRef.element);
                jSONObject.put("height", intRef2.element);
            } catch (org.json.JSONException e) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str3 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str3, "Error while creating max size Json.", e);
                }
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (java.lang.Exception e2) {
            this.f4638a.a(str, "Unexpected error", "getMaxSize");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e2.getMessage());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getOrientation(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getOrientation called");
        }
        byte g = com.inmobi.media.N5.g();
        return g == 1 ? "0" : g == 3 ? "90" : g == 2 ? "180" : g == 4 ? "270" : com.ironsource.C2945a2.f;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getOrientationProperties(java.lang.String str) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            a2 = this.f4638a;
        }
        java.lang.String str2 = a2.getOrientationProperties().d;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "getOrientationProperties called: " + str2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return str2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getPlacementType(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : "inline";
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getPlatform(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 == null) {
            return "android";
        }
        java.lang.String str2 = com.inmobi.media.Da.f4658a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getPlatformVersion(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getPlatformVersion. Version:" + valueOf);
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public final java.lang.String getPlaybackState(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.Aa(this, objectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, java.util.concurrent.TimeUnit.SECONDS) && (interfaceC2772t9 = this.c) != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) objectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getRenderableAdIndexes(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getRenderableAdIndexes is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
            }
            java.lang.String jSONArray = new org.json.JSONArray().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            return jSONArray;
        }
        org.json.JSONArray renderableAdIndexes = a2.getRenderableAdIndexes();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        java.lang.String jSONArray2 = renderableAdIndexes.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getSafeArea(java.lang.String str) {
        org.json.JSONObject safeArea = this.f4638a.getSafeArea();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getScreenSize(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("width", com.inmobi.media.N5.h().f4888a);
            jSONObject.put("height", com.inmobi.media.N5.h().b);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c(str2, "Message:Width x Height : " + com.inmobi.media.N5.h().f4888a + "x" + com.inmobi.media.N5.h().b);
            }
        } catch (org.json.JSONException unused) {
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "getScreenSize");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e.getMessage());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "getScreenSize called:" + jSONObject2);
        }
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getSdkVersion(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 == null) {
            return "11.2.0";
        }
        java.lang.String str2 = com.inmobi.media.Da.f4658a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getSdkVersion called. Version:11.2.0");
        return "11.2.0";
    }

    @android.webkit.JavascriptInterface
    public final long getShowTimeStamp(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getShowTimeStamp is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 == null) {
                return 0L;
            }
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = a2.getShowTimeStamp();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getState(java.lang.String str) {
        java.lang.String viewState = this.f4638a.getViewState();
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        java.lang.String lowerCase = viewState.toLowerCase(ENGLISH);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getVersion(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 == null) {
            return com.ironsource.M6.k0;
        }
        java.lang.String str2 = com.inmobi.media.Da.f4658a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "getVersion called. Version:2.0");
        return com.ironsource.M6.k0;
    }

    @android.webkit.JavascriptInterface
    public final void impressionFired(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "impressionFired is called");
        }
        this.f4638a.C();
    }

    @android.webkit.JavascriptInterface
    public final void incentCompleted(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.f4638a.getListener().b(new java.util.HashMap());
                return;
            } catch (java.lang.Exception e) {
                this.f4638a.a(str, "Unexpected error", "incentCompleted");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str5 = next;
                    hashMap.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f4638a.getListener().b(hashMap);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Exception e2) {
                    this.f4638a.a(str, "Unexpected error", "incentCompleted");
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                    if (interfaceC2772t93 != null) {
                        java.lang.String str6 = com.inmobi.media.Da.f4658a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
            } catch (java.lang.Exception e3) {
                this.f4638a.a(str, "Unexpected error", "incentCompleted");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
                if (interfaceC2772t94 != null) {
                    java.lang.String str7 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
            }
        } catch (org.json.JSONException unused) {
            this.f4638a.getListener().b(new java.util.HashMap());
            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
        }
    }

    @android.webkit.JavascriptInterface
    public final boolean isBackButtonDisabled(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "isBackButtonDisabled called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            a2 = this.f4638a;
        }
        return a2.L;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String isDeviceMuted(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "isDeviceMuted called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 == null) {
                return "false";
            }
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            com.inmobi.media.Ec mediaProcessor = this.f4638a.getMediaProcessor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mediaProcessor);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = mediaProcessor.b;
            if (interfaceC2772t94 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t94).c("MraidMediaProcessor", "isVolumeMuted");
            }
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                android.media.AudioManager audioManager = null;
                try {
                    java.lang.Object systemService = context.getSystemService("audio");
                    if (!(systemService instanceof android.media.AudioManager)) {
                        systemService = null;
                    }
                    audioManager = (android.media.AudioManager) systemService;
                } catch (java.lang.Throwable unused) {
                }
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z = true;
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.c;
            if (interfaceC2772t95 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t95).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e.getMessage());
            }
        }
        return java.lang.String.valueOf(z);
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String isHeadphonePlugged(java.lang.String str) {
        boolean z;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 == null) {
                return "false";
            }
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            com.inmobi.media.Ec mediaProcessor = this.f4638a.getMediaProcessor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            z = com.inmobi.media.Ec.b();
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e.getMessage());
            }
            z = false;
        }
        return java.lang.String.valueOf(z);
    }

    @android.webkit.JavascriptInterface
    public final boolean isViewable(java.lang.String str) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            return gestureDetectorOnGestureListenerC2675pi.J == com.inmobi.media.Yn.c;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @android.webkit.JavascriptInterface
    public final void loadAd(java.lang.String str, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "loadAd is called with index - " + i);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            a2.b(i);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void loadWebView(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str4, "loadWebView called with html: " + str3);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null && a2.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str5, "loadWebView called on unloaded ad");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a3 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a3.put("errorCode", 108);
            gestureDetectorOnGestureListenerC2675pi.a("loadWebView", a3);
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a4 = a();
        if (a4 == null || a4.getPlacementType() != 1) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str6 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str6, "sibling creation not allowed for inline placement type");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy2 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a5 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a5.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC2675pi2.a("loadWebView", a5);
            return;
        }
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi3 = this.f4638a;
            kotlin.Lazy lazy3 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a6 = com.inmobi.media.AbstractC2516jj.a("", "targetViewId", "id", "");
            a6.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC2675pi3.a("loadWebView", a6);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f4638a.a("loadWebView", com.inmobi.media.Gi.a(str2, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        kotlin.Lazy lazy4 = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, str2, str3);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.String str, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c(str2, "Log called. Message:" + message);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        com.inmobi.media.Vh vh = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1;
        vh.getClass();
        if (!((java.lang.Boolean) com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.j1.getValue(vh, com.inmobi.media.Vh.f5017a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2675pi.getListener().a(message);
    }

    @android.webkit.JavascriptInterface
    public final void logTelemetryEvent(java.lang.String str, java.lang.String eventType, java.lang.String str2) {
        if (eventType == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        com.inmobi.media.C2936zi c2936zi = gestureDetectorOnGestureListenerC2675pi.e0;
        if (c2936zi != null) {
            c2936zi.a(eventType, str2);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onAudioStateChanged(java.lang.String str, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "onAudioStateChanged is called: " + i);
        }
        com.inmobi.media.V1.b.getClass();
        com.inmobi.media.V1 v1 = (com.inmobi.media.V1) com.inmobi.media.V1.c.get(i);
        if (v1 == null) {
            v1 = com.inmobi.media.V1.d;
        }
        if (v1 != com.inmobi.media.V1.d) {
            this.f4638a.getListener().a(v1);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onOrientationChange(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void onUserAudioMuteInteraction(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.f4638a.getListener().a(z);
    }

    @android.webkit.JavascriptInterface
    public final void onUserInteraction(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "onUserInteraction called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi != null && !gestureDetectorOnGestureListenerC2675pi.a()) {
            this.f4638a.a("onUserInteraction");
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f4638a.a(new java.util.HashMap());
                return;
            } catch (java.lang.Exception e) {
                this.f4638a.a(str, "Unexpected error", "onUserInteraction");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str5 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str6 = next;
                    hashMap.put(str6, jSONObject.get(str6));
                }
                try {
                    this.f4638a.a(hashMap);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Exception e2) {
                    this.f4638a.a(str, "Unexpected error", "onUserInteraction");
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
                    if (interfaceC2772t94 != null) {
                        java.lang.String str7 = com.inmobi.media.Da.f4658a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
            } catch (org.json.JSONException unused) {
                this.f4638a.a(new java.util.HashMap());
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
        } catch (java.lang.Exception e3) {
            this.f4638a.a(str, "Unexpected error", "onUserInteraction");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.c;
            if (interfaceC2772t95 != null) {
                java.lang.String str8 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t95).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void open(final java.lang.String str, final java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "open called");
        }
        if (!this.f4638a.a()) {
            this.f4638a.a("open");
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (!gestureDetectorOnGestureListenerC2675pi.P0) {
            gestureDetectorOnGestureListenerC2675pi.s();
            com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.b(com.inmobi.media.Ca.this, str, str2);
                }
            });
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "open called on unloaded ad");
        }
    }

    @android.webkit.JavascriptInterface
    public final void openEmbedded(final java.lang.String str, final java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "openEmbedded called");
        }
        if (!this.f4638a.a()) {
            this.f4638a.a("openEmbedded");
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (!gestureDetectorOnGestureListenerC2675pi.P0) {
            gestureDetectorOnGestureListenerC2675pi.s();
            com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.c(com.inmobi.media.Ca.this, str, str2);
                }
            });
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @android.webkit.JavascriptInterface
    public final void openExternal(java.lang.String str, java.lang.String url, java.lang.String str2) {
        com.inmobi.media.C2431gb c2431gb;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "open External");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC2675pi.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str5, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC2675pi.a()) {
            this.f4638a.a("openExternal");
            return;
        }
        this.f4638a.s();
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
        if (interfaceC2772t94 != null) {
            java.lang.String str6 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t94).a(str6, "openExternal called with url: " + url + " , schema: " + com.inmobi.media.Xa.a(url) + ", fallback - " + str2);
        }
        com.inmobi.media.C2457hb c2457hb = this.f4638a.getLandingPageHandler().f;
        if (c2457hb != null) {
            java.lang.String a2 = com.inmobi.media.Xa.a(url);
            com.inmobi.media.C2325cb landingPageHandler = this.f4638a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c2431gb = new com.inmobi.media.C2431gb(c2457hb, a2, i, android.os.SystemClock.elapsedRealtime());
        } else {
            c2431gb = null;
        }
        if (c2431gb != null) {
            c2431gb.f = "EX_NATIVE";
        }
        this.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.d, c2431gb, (java.lang.Integer) null);
        com.inmobi.media.C2325cb landingPageHandler2 = this.f4638a.getLandingPageHandler();
        landingPageHandler2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(str, url, str2, c2431gb);
            return;
        }
        if (str2 != null) {
            landingPageHandler2.f(str, str2, null, c2431gb);
            return;
        }
        landingPageHandler2.a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 2);
        com.inmobi.media.Ta ta = landingPageHandler2.d;
        if (ta != null) {
            ta.a(str, "Empty url and fallback url", "openExternal");
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = landingPageHandler2.g;
        if (interfaceC2772t95 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("cb", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t95).b("cb", "Empty deeplink and fallback urls");
        }
    }

    @android.webkit.JavascriptInterface
    public final void openWithoutTracker(final java.lang.String str, final java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "openWithoutTracker called");
        }
        if (!this.f4638a.a()) {
            this.f4638a.a("openWithoutTracker");
            return;
        }
        if (!this.f4638a.P0) {
            com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.d(com.inmobi.media.Ca.this, str, str2);
                }
            });
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @android.webkit.JavascriptInterface
    public final void ping(java.lang.String str, java.lang.String url, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "ping called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = kotlin.jvm.internal.Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && android.webkit.URLUtil.isValidUrl(url)) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.A3.a(url, z, interfaceC2772t94);
                    return;
                } catch (java.lang.Exception e) {
                    this.f4638a.a(str, "Unexpected error", "ping");
                    com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.c;
                    if (interfaceC2772t95 != null) {
                        java.lang.String str5 = com.inmobi.media.Da.f4658a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t95).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f4638a.a(str, "Invalid URL:" + url, "ping");
    }

    @android.webkit.JavascriptInterface
    public final void pingInWebView(java.lang.String str, java.lang.String url, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "openInWebView called");
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = kotlin.jvm.internal.Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && android.webkit.URLUtil.isValidUrl(url)) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str3 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str3, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.Mg.a(com.inmobi.media.Jg.b, new com.inmobi.media.C2766t3(url, z, interfaceC2772t93, null));
                    return;
                } catch (java.lang.Exception e) {
                    this.f4638a.a(str, "Unexpected error", "pingInWebView");
                    com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
                    if (interfaceC2772t94 != null) {
                        java.lang.String str4 = com.inmobi.media.Da.f4658a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str4, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f4638a.a(str, "Invalid URL:" + url, "pingInWebView");
    }

    @android.webkit.JavascriptInterface
    public final void pingV2(java.lang.String str, java.lang.String pingJson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pingJson, "pingJson");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f4638a.g(pingJson);
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "ping");
            this.f4638a.a(e);
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void playVideo(final java.lang.String str, final java.lang.String str2) {
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && kotlin.text.StringsKt.startsWith$default(str2, androidx.webkit.ProxyConfig.MATCH_HTTP, false, 2, (java.lang.Object) null) && (kotlin.text.StringsKt.endsWith$default(str2, "mp4", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.endsWith$default(str2, "avi", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.endsWith$default(str2, "m4v", false, 2, (java.lang.Object) null))) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.Ca.e(com.inmobi.media.Ca.this, str, str2);
                    }
                });
                return;
            }
        }
        this.f4638a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @android.webkit.JavascriptInterface
    public final void registerBackButtonPressedEventListener(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "registerBackButtonPressedEventListener called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2675pi.l(str);
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void registerDeviceMuteEventListener(java.lang.String jsCallbackNamespace) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "registerDeviceMuteEventListener called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                com.inmobi.media.Ec mediaProcessor = gestureDetectorOnGestureListenerC2675pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.d == null) {
                        com.inmobi.media.C2484ic c2484ic = new com.inmobi.media.C2484ic(new com.inmobi.media.Ac(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.d = c2484ic;
                        c2484ic.b();
                    }
                }
            } catch (java.lang.Exception e) {
                this.f4638a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str3 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(java.lang.String jsCallbackNamespace) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                com.inmobi.media.Ec mediaProcessor = gestureDetectorOnGestureListenerC2675pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    android.content.Context context = com.inmobi.media.Xi.f5051a;
                    if (context != null && mediaProcessor.e == null) {
                        com.inmobi.media.C2484ic c2484ic = new com.inmobi.media.C2484ic(new com.inmobi.media.Cc(mediaProcessor, jsCallbackNamespace, context, new android.os.Handler(android.os.Looper.getMainLooper())));
                        mediaProcessor.e = c2484ic;
                        c2484ic.b();
                    }
                }
            } catch (java.lang.Exception e) {
                this.f4638a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str3 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void registerHeadphonePluggedEventListener(java.lang.String jsCallbackNamespace) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "registerHeadphonePluggedEventListener called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                com.inmobi.media.Ec mediaProcessor = gestureDetectorOnGestureListenerC2675pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f == null) {
                        com.inmobi.media.C2484ic c2484ic = new com.inmobi.media.C2484ic(new com.inmobi.media.C2930zc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f = c2484ic;
                        c2484ic.b();
                    }
                }
            } catch (java.lang.Exception e) {
                this.f4638a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str3 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void saveBlob(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.F2 f2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "saveBlob is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = gestureDetectorOnGestureListenerC2675pi.i;
        if (interfaceC2772t93 != null) {
            java.lang.String TAG = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(TAG, "saveBlob");
        }
        if (str2 == null || (f2 = gestureDetectorOnGestureListenerC2675pi.k0) == null) {
            return;
        }
        ((com.inmobi.media.AbstractC2551l1) f2).a(str2, gestureDetectorOnGestureListenerC2675pi.getImpressionId());
    }

    @android.webkit.JavascriptInterface
    public final void sendMessage(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str4, "sendMessage called with message: " + str3);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null && a2.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str5, "sendMessage called on unloaded ad");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a3 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a3.put("errorCode", 108);
            gestureDetectorOnGestureListenerC2675pi.a(com.ironsource.C3023e8.j, a3);
            return;
        }
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy2 = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a4 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a4.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC2675pi2.a(com.ironsource.C3023e8.j, a4);
            return;
        }
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            this.f4638a.a(com.ironsource.C3023e8.j, com.inmobi.media.Gi.a(str2, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        kotlin.Lazy lazy3 = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.f(com.inmobi.media.Ca.this, str2, str3);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @android.webkit.JavascriptInterface
    public final void setAdContext(java.lang.String str, java.lang.String podAdContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "setAdContext is called " + podAdContext);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            com.inmobi.media.InterfaceC2842w0 adPodHandler = a2.getAdPodHandler();
            if (adPodHandler != null) {
                ((com.inmobi.media.AbstractC2551l1) adPodHandler).b(podAdContext);
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void setOrientationProperties(java.lang.String str, final java.lang.String orientationPropertiesString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.b(com.inmobi.media.Ca.this, orientationPropertiesString);
            }
        };
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.post(runnable);
    }

    @android.webkit.JavascriptInterface
    public final void showAd(java.lang.String str, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "showAd is called with index " + i);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            a2.c(i);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @android.webkit.JavascriptInterface
    public final void showAlert(java.lang.String str, java.lang.String alert) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alert, "alert");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "showAlert: " + alert);
        }
    }

    @android.webkit.JavascriptInterface
    public final void showWebView(java.lang.String str, final java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "showEndCard called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null && a2.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str4, "showWebView called on unloaded ad");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
            if (str2 == null) {
                str2 = "";
            }
            kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
            org.json.JSONObject a3 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
            a3.put("errorCode", 108);
            gestureDetectorOnGestureListenerC2675pi.a("showWebView", a3);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            kotlin.Lazy lazy2 = com.inmobi.media.AbstractC2740s6.f5441a;
            com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.Ca.c(com.inmobi.media.Ca.this, str2);
                }
            };
            executorC2378ec.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            executorC2378ec.f5177a.post(runnable);
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = this.f4638a;
        if (str2 == null) {
            str2 = "";
        }
        kotlin.Lazy lazy3 = com.inmobi.media.Gi.f4728a;
        org.json.JSONObject a4 = com.inmobi.media.AbstractC2516jj.a(str2, "targetViewId", "id", str2);
        a4.put("errorCode", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC2675pi2.a("showWebView", a4);
    }

    @android.webkit.JavascriptInterface
    public final void storePicture(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @android.webkit.JavascriptInterface
    public final void submitAdReport(java.lang.String str, java.lang.String adQualityUrl, java.lang.String enableUserAdReportScreenshot, java.lang.String templateInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateInfo, "templateInfo");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "submitAdReport called");
        }
        this.f4638a.a(adQualityUrl, templateInfo, kotlin.jvm.internal.Intrinsics.areEqual(enableUserAdReportScreenshot, "1"));
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String supports(java.lang.String str, java.lang.String feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "Checking support for: " + feature);
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.f4638a.n(feature));
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c(str3, "Message:" + feature + " support: " + valueOf);
        }
        return valueOf;
    }

    @android.webkit.JavascriptInterface
    public final long timeSinceShow(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "timeSinceShow is called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 != null) {
            return a2.V();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
        if (interfaceC2772t92 == null) {
            return 0L;
        }
        java.lang.String str3 = com.inmobi.media.Da.f4658a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @android.webkit.JavascriptInterface
    public final void unload(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "unload called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a2 = a();
        if (a2 == null) {
            a2 = this.f4638a;
        }
        try {
            a2.E();
        } catch (java.lang.Exception e) {
            a2.a(str, "Unexpected error", "unload");
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4638a;
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2675pi.X();
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
            if (interfaceC2772t93 != null) {
                java.lang.String str4 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void unregisterDeviceMuteEventListener(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "Unregister device mute event listener ...");
        }
        try {
            com.inmobi.media.Ec mediaProcessor = this.f4638a.getMediaProcessor();
            if (mediaProcessor != null) {
                com.inmobi.media.C2484ic c2484ic = mediaProcessor.d;
                if (c2484ic != null) {
                    c2484ic.a();
                }
                mediaProcessor.d = null;
            }
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "Unregister device volume change listener ...");
        }
        try {
            com.inmobi.media.Ec mediaProcessor = this.f4638a.getMediaProcessor();
            if (mediaProcessor != null) {
                com.inmobi.media.C2484ic c2484ic = mediaProcessor.e;
                if (c2484ic != null) {
                    c2484ic.a();
                }
                mediaProcessor.e = null;
            }
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f4638a == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.c;
        if (interfaceC2772t93 != null) {
            java.lang.String str4 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            com.inmobi.media.Ec mediaProcessor = this.f4638a.getMediaProcessor();
            if (mediaProcessor != null) {
                com.inmobi.media.C2484ic c2484ic = mediaProcessor.f;
                if (c2484ic != null) {
                    c2484ic.a();
                }
                mediaProcessor.f = null;
            }
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.f, null, null, new com.inmobi.media.Ba(r10, r3, r12, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateVideoPosition(java.lang.String str, java.lang.String str2) {
        com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition;
        java.lang.Object launch$default;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
        if (str2 != null) {
            java.lang.Object obj = null;
            try {
                org.json.JSONObject jsonObject = new org.json.JSONObject(str2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.videoPlayer.model.VideoViewPosition.class, "type");
                videoViewPosition = (com.inmobi.media.videoPlayer.model.VideoViewPosition) com.inmobi.media.videoPlayer.model.VideoViewPosition.class.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, com.inmobi.media.videoPlayer.model.VideoViewPosition.class, null, null));
            } catch (org.json.JSONException e) {
                com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.b;
                a(str, jSONObject);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
                if (interfaceC2772t92 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str4, "Error while creating position Json.", e);
                    obj = kotlin.Unit.INSTANCE;
                }
            }
            if (videoViewPosition != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            com.inmobi.media.EnumC2771t8 enumC2771t82 = com.inmobi.media.EnumC2771t8.b;
            a(str, jSONObject);
            obj = kotlin.Unit.INSTANCE;
            if (obj != null) {
            }
        }
        com.inmobi.media.EnumC2771t8 enumC2771t83 = com.inmobi.media.EnumC2771t8.b;
        a(str, jSONObject);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }

    @android.webkit.JavascriptInterface
    public final void useCustomClose(final java.lang.String str, final boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "useCustomClose called:" + z);
        }
        new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.b(com.inmobi.media.Ca.this, z, str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public final void zoom(java.lang.String jsCallbackNamespace, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "zoom is called " + jsCallbackNamespace + io.ktor.sse.ServerSentEventKt.SPACE + i);
        }
        com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, i);
            }
        });
    }

    public static java.lang.String b(java.lang.String str) {
        return "TEMPLATE_" + str;
    }

    @android.webkit.JavascriptInterface
    public final void fireAdFailed(java.lang.String str, java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        try {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "fireAdFailed called with ec " + errorCode + ".");
            }
            if (kotlin.text.StringsKt.isBlank(errorCode)) {
                errorCode = "3100";
            }
            this.f4638a.d(b(errorCode));
        } catch (java.lang.Exception e) {
            this.f4638a.a(str, "Unexpected error", "fireAdFailed");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e.getMessage());
            }
        }
    }

    public static final void b(com.inmobi.media.Ca ca) {
        try {
            ca.f4638a.H();
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e.getMessage());
            }
        }
    }

    public static final void b(final com.inmobi.media.Ca ca, java.lang.String json) {
        com.inmobi.media.Nf op = ca.f4638a.getOrientationProperties();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
        final com.inmobi.media.Nf nf = new com.inmobi.media.Nf();
        nf.d = json;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(json);
            java.lang.String optString = jSONObject.optString("forceOrientation", op.b);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optString, "<set-?>");
            nf.b = optString;
            nf.f4857a = jSONObject.optBoolean("allowOrientationChange", op.f4857a);
            java.lang.String optString2 = jSONObject.optString("direction", op.c);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optString2, "<set-?>");
            nf.c = optString2;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(nf.b, "portrait") && !kotlin.jvm.internal.Intrinsics.areEqual(nf.b, "landscape")) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("none", "<set-?>");
                nf.b = "none";
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(nf.c, "left") && !kotlin.jvm.internal.Intrinsics.areEqual(nf.c, "right")) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("right", "<set-?>");
                nf.c = "right";
            }
        } catch (org.json.JSONException unused) {
            nf = null;
        }
        if (nf != null) {
            ca.f4638a.getWebViewFactory().a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, nf, (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj);
                }
            });
        }
    }

    public static final void c(com.inmobi.media.Ca ca) {
        try {
            ca.f4638a.I();
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e.getMessage());
            }
        }
    }

    public static final void c(com.inmobi.media.Ca ca, java.lang.String str) {
        try {
            ca.f4638a.getSiblingWebviewManager().b(ca.f4638a.getRoute().b, str);
        } catch (java.lang.Exception e) {
            ca.f4638a.a("showWebView", com.inmobi.media.Gi.a(str, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e.getMessage());
            }
        }
    }

    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi a() {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.f4638a.getRoute().b, com.unity3d.ads.BuildConfig.FLAVOR)) {
            com.inmobi.media.Bo webViewFactory = this.f4638a.getWebViewFactory();
            webViewFactory.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.unity3d.ads.BuildConfig.FLAVOR, "id");
            return (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) webViewFactory.b.get(com.unity3d.ads.BuildConfig.FLAVOR);
        }
        return this.f4638a;
    }

    public static final void b(com.inmobi.media.Ca ca, boolean z, java.lang.String str) {
        try {
            ca.f4638a.f(z);
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "useCustomClose");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2, float f, boolean z) {
        com.inmobi.media.C2431gb c2431gb;
        com.inmobi.media.C2457hb c2457hb = ca.f4638a.getLandingPageHandler().f;
        if (c2457hb != null) {
            java.lang.String a2 = com.inmobi.media.Xa.a(str2);
            com.inmobi.media.C2325cb landingPageHandler = ca.f4638a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c2431gb = new com.inmobi.media.C2431gb(c2457hb, a2, i, android.os.SystemClock.elapsedRealtime());
        } else {
            c2431gb = null;
        }
        com.inmobi.media.C2431gb c2431gb2 = c2431gb;
        if (c2431gb2 != null) {
            c2431gb2.f = "IN_NATIVE";
        }
        ca.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.d, c2431gb2, (java.lang.Integer) 8010);
        int a3 = ca.f4638a.getLandingPageHandler().a("customExpandInNative", str, str2, c2431gb2, new com.inmobi.media.Q2(f, z));
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str3 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "customExpandInNativeRequest: " + a3);
        }
        if (a3 == 3) {
            com.inmobi.media.V5 v5 = com.inmobi.media.V5.f5008a;
            ca.a(str, str2, 0, f, !z, c2431gb2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final java.lang.String str, java.lang.String str2, final int i, final float f, final boolean z, final com.inmobi.media.C2431gb c2431gb) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = str2;
        if (c2431gb != null) {
            c2431gb.f = "IN_CUSTOM";
        }
        new android.os.Handler(this.f4638a.getContainerContext().getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Ca$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Ca.a(com.inmobi.media.Ca.this, c2431gb, objectRef, i, str, f, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.inmobi.media.Ca ca, com.inmobi.media.C2431gb c2431gb, kotlin.jvm.internal.Ref.ObjectRef objectRef, int i, java.lang.String str, float f, boolean z) {
        try {
            if (ca.f4638a.getEmbeddedBrowserJsCallbacks() == null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
                if (interfaceC2772t9 != null) {
                    java.lang.String str2 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                ca.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 8002);
                return;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ca.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str3, "Custom expand called. Url: " + objectRef.element);
            }
            com.inmobi.media.V5 v5 = com.inmobi.media.V5.values()[i];
            if (v5 == com.inmobi.media.V5.f5008a) {
                int a2 = ca.f4638a.getLandingPageHandler().a("customExpand", str, (java.lang.String) objectRef.element, c2431gb, (com.inmobi.media.Q2) null);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = ca.c;
                if (interfaceC2772t93 != null) {
                    java.lang.String str4 = com.inmobi.media.Da.f4658a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).a(str4, "processCustomExpandRequest: " + a2);
                }
                if (a2 == 3) {
                    com.inmobi.media.W5 embeddedBrowserJsCallbacks = ca.f4638a.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks != null) {
                        ((com.inmobi.media.P8) embeddedBrowserJsCallbacks).a((java.lang.String) objectRef.element, v5, f, z, ca.f4638a.getViewTouchTimestamp(), c2431gb);
                    }
                    ca.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
                    com.inmobi.media.Ta ta = ca.f4638a.getLandingPageHandler().d;
                    if (ta != null) {
                        ta.b("customExpand", str, (java.lang.String) objectRef.element);
                        return;
                    }
                    return;
                }
                com.inmobi.media.W5 embeddedBrowserJsCallbacks2 = ca.f4638a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks2 != null) {
                    com.inmobi.media.R8.a(((com.inmobi.media.P8) embeddedBrowserJsCallbacks2).f4891a);
                    return;
                }
                return;
            }
            com.inmobi.media.W5 embeddedBrowserJsCallbacks3 = ca.f4638a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks3 != null) {
                ((com.inmobi.media.P8) embeddedBrowserJsCallbacks3).a((java.lang.String) objectRef.element, v5, f, z, ca.f4638a.getViewTouchTimestamp(), c2431gb);
            }
            ca.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.f, c2431gb, (java.lang.Integer) null);
            com.inmobi.media.Ta ta2 = ca.f4638a.getLandingPageHandler().d;
            if (ta2 != null) {
                ta2.b("customExpand", str, (java.lang.String) objectRef.element);
            }
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "customExpand");
            ca.f4638a.getLandingPageHandler().a(com.inmobi.media.Ua.e, c2431gb, (java.lang.Integer) 9);
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = ca.c;
            if (interfaceC2772t94 != null) {
                java.lang.String str5 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t94).b(str5, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
            }
        }
    }

    public static final void a(com.inmobi.media.Ca ca) {
        if (ca.f4638a.getEmbeddedBrowserJsCallbacks() == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        com.inmobi.media.W5 embeddedBrowserJsCallbacks = ca.f4638a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            com.inmobi.media.R8.a(((com.inmobi.media.P8) embeddedBrowserJsCallbacks).f4891a);
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Ca ca, com.inmobi.media.Nf nf, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.P0) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return kotlin.Unit.INSTANCE;
        }
        it.a(nf);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.Ca ca, java.lang.String str) {
        try {
            gestureDetectorOnGestureListenerC2675pi.n();
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "close");
            com.inmobi.media.Sb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e.getMessage());
            }
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Ca ca, com.inmobi.media.Ve response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (com.inmobi.media.AbstractC2889xl.a(response)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "asyncPing Successful");
            }
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ca.c;
            if (interfaceC2772t92 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b(str2, "asyncPing Failed");
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(com.inmobi.media.Ca ca, boolean z, java.lang.String str) {
        try {
            ca.f4638a.e(z);
        } catch (java.lang.Exception e) {
            ca.f4638a.a(str, "Unexpected error", "disableCloseRegion");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e.getMessage());
            }
        }
    }

    public static final kotlin.Unit a(boolean z, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.setDisableBackButton(z);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(com.inmobi.media.Ca ca, int i) {
        ca.f4638a.setInitialScale(i);
    }

    public static final void a(com.inmobi.media.Ca ca, java.lang.String str, java.lang.String str2) {
        try {
            ca.f4638a.getSiblingWebviewManager().a(ca.f4638a.getRoute().b, str, str2);
        } catch (java.lang.Exception e) {
            ca.f4638a.a("loadWebView", com.inmobi.media.Gi.a(str, 308));
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(com.inmobi.media.Ca ca, java.lang.String str) {
        try {
            ca.f4638a.getSiblingWebviewManager().a(ca.f4638a.getRoute().b, str);
        } catch (java.lang.Exception e) {
            ca.f4638a.a("destroyWebView", com.inmobi.media.Gi.a(str, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ca.c;
            if (interfaceC2772t9 != null) {
                java.lang.String str2 = com.inmobi.media.Da.f4658a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            java.lang.String str2 = com.inmobi.media.Da.f4658a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.f4638a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
