package com.inmobi.media;

/* renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2274ad {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2721rd f5098a;
    public final com.inmobi.media.InterfaceC2264a3 b;
    public final com.inmobi.media.H4 c;
    public final com.inmobi.media.Vc d;
    public final com.inmobi.media.Zc e;
    public final com.inmobi.media.InterfaceC2772t9 f;

    public C2274ad(com.inmobi.media.C2721rd nativeLandingPageHandler, com.inmobi.media.InterfaceC2264a3 clickSession, com.inmobi.media.H4 contextualDataHandler, com.inmobi.media.Vc nativeBeaconProcessor, com.inmobi.media.Zc nativeClickModel, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeClickModel, "nativeClickModel");
        this.f5098a = nativeLandingPageHandler;
        this.b = clickSession;
        this.c = contextualDataHandler;
        this.d = nativeBeaconProcessor;
        this.e = nativeClickModel;
        this.f = interfaceC2772t9;
    }

    public final void a(short s) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s));
        }
        if (s == 7) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
        if (interfaceC2772t93 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t93).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.c.f();
        ((com.inmobi.media.AbstractC2367e1) this.b).a(com.iab.omid.library.inmobi.adsession.media.InteractionType.CLICK);
        b(s);
    }

    public final void b(short s) {
        java.util.List list;
        com.inmobi.media.Zc zc = this.e;
        com.inmobi.media.Cl cl = zc.f5083a;
        java.util.ArrayList arrayList = null;
        java.lang.String str = cl != null ? cl.f4647a : null;
        java.util.List a2 = com.inmobi.media.Yc.a(zc);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + a2.size());
        }
        if (!com.inmobi.media.K3.a(str)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            com.inmobi.media.Zc zc2 = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zc2, "<this>");
            com.inmobi.media.Sc sc = (com.inmobi.media.Sc) zc2.b.f4801a.get(java.lang.Short.valueOf(s));
            java.lang.String str2 = sc != null ? sc.f4955a : null;
            com.inmobi.media.Zc zc3 = this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zc3, "<this>");
            com.inmobi.media.Sc sc2 = (com.inmobi.media.Sc) zc3.b.f4801a.get(java.lang.Short.valueOf(s));
            if (sc2 != null && (list = sc2.b) != null) {
                arrayList = com.inmobi.media.D4.a(com.ironsource.Y3.d, list);
            }
            java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + emptyList.size());
            }
            str = str2;
            a2 = emptyList;
        }
        a((short) 0, str, a2);
    }

    public final void a(com.inmobi.media.AbstractC2509jc mediaEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(mediaEvent.getClass()).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + simpleName + ", isClickEvent=" + ((mediaEvent instanceof com.inmobi.media.C2937zj) || (mediaEvent instanceof com.inmobi.media.C2416fm) || (mediaEvent instanceof com.inmobi.media.U3)));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
        boolean z = mediaEvent instanceof com.inmobi.media.C2937zj;
        if (z || (mediaEvent instanceof com.inmobi.media.C2416fm) || (mediaEvent instanceof com.inmobi.media.U3)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.c.f();
            ((com.inmobi.media.AbstractC2367e1) this.b).a(com.iab.omid.library.inmobi.adsession.media.InteractionType.CLICK);
            if (z) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
                if (interfaceC2772t93 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((com.inmobi.media.C2937zj) mediaEvent);
                return;
            }
            if (mediaEvent instanceof com.inmobi.media.C2416fm) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.f;
                if (interfaceC2772t94 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (mediaEvent instanceof com.inmobi.media.U3) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.f;
                if (interfaceC2772t95 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((com.inmobi.media.U3) mediaEvent);
                return;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = this.f;
            if (interfaceC2772t96 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t96).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        com.inmobi.media.Zc zc = this.e;
        com.inmobi.media.Cl cl = zc.f5083a;
        java.lang.String str = cl != null ? cl.f4647a : null;
        java.util.List a2 = com.inmobi.media.Yc.a(zc);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + a2.size());
        }
        a((short) 0, str, a2);
    }

    public final void a() {
        com.inmobi.media.Zc zc = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zc, "<this>");
        com.inmobi.media.Sc sc = (com.inmobi.media.Sc) zc.b.f4801a.get((short) 7);
        java.lang.String str = sc != null ? sc.f4955a : null;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? java.lang.Boolean.valueOf(android.webkit.URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && android.webkit.URLUtil.isNetworkUrl(str)) {
            this.f5098a.b(str, null);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(com.inmobi.media.C2937zj c2937zj) {
        com.inmobi.media.Zc zc = this.e;
        com.inmobi.media.Cl cl = zc.f5083a;
        java.lang.String str = cl != null ? cl.f4647a : null;
        java.util.List a2 = com.inmobi.media.Yc.a(zc);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        java.util.List list = a2;
        if (!com.inmobi.media.K3.a(str)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = c2937zj.f5595a;
            java.util.ArrayList arrayList = c2937zj.b;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
            list = arrayList;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(com.inmobi.media.U3 u3) {
        com.inmobi.media.Cl cl = this.e.f5083a;
        java.lang.String str = cl != null ? cl.f4647a : null;
        java.util.ArrayList arrayList = u3.f4988a;
        boolean isEmpty = arrayList.isEmpty();
        java.util.List list = arrayList;
        if (isEmpty) {
            list = com.inmobi.media.Yc.a(this.e);
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + u3.f4988a.size() + ", using VAST trackers=" + u3.f4988a.isEmpty());
        }
        a((short) 1, str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(short s, java.lang.String str, java.util.List list) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        com.inmobi.media.Zc zc = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zc, "<this>");
        java.util.ArrayList a2 = com.inmobi.media.D4.a(com.ironsource.Y3.d, zc.b.c);
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) a2);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("NativeClickProcessor", "Response click trackers count=" + a2.size() + ", combined trackers count=" + plus.size());
        }
        if (com.inmobi.media.K3.a(str)) {
            a2 = plus;
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.f;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            com.inmobi.media.ads.network.inmobiJson.model.MainLink mainLink = this.e.b.b;
            str = mainLink != null ? mainLink.getUrl() : null;
            com.inmobi.media.ads.network.inmobiJson.model.MainLink mainLink2 = this.e.b.b;
            r4 = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.f;
            if (interfaceC2772t94 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t94).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + r4);
            }
        }
        if (str == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t95 = this.f;
            if (interfaceC2772t95 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t96 = this.f;
        if (interfaceC2772t96 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t96).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + r4 + ", firing " + a2.size() + " beacons");
        }
        this.f5098a.b(str, r4);
        this.d.a(s, a2);
    }
}
