package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class Sd {

    /* renamed from: a, reason: collision with root package name */
    public final C3821je f6849a;
    public final InterfaceC4204x3 b;
    public final C3671e5 c;
    public final Nd d;
    public final Rd e;
    public final Y9 f;

    public Sd(C3821je nativeLandingPageHandler, InterfaceC4204x3 clickSession, C3671e5 contextualDataHandler, Nd nativeBeaconProcessor, Rd nativeClickModel, Y9 y9) {
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeClickModel, "nativeClickModel");
        this.f6849a = nativeLandingPageHandler;
        this.b = clickSession;
        this.c = contextualDataHandler;
        this.d = nativeBeaconProcessor;
        this.e = nativeClickModel;
        this.f = y9;
    }

    public final void a(short s) {
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s));
        }
        if (s == 7) {
            Y9 y92 = this.f;
            if (y92 != null) {
                ((Z9) y92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        Y9 y93 = this.f;
        if (y93 != null) {
            ((Z9) y93).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.c.f();
        ((AbstractC3724g1) this.b).a(InteractionType.CLICK);
        b(s);
    }

    public final void b(short s) {
        List list;
        Rd rd = this.e;
        C4224xn c4224xn = rd.f6826a;
        ArrayList arrayList = null;
        String str = c4224xn != null ? c4224xn.f7485a : null;
        List a2 = Qd.a(rd);
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + a2.size());
        }
        if (!AbstractC3755h4.a(str)) {
            Y9 y92 = this.f;
            if (y92 != null) {
                ((Z9) y92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            Rd rd2 = this.e;
            Intrinsics.checkNotNullParameter(rd2, "<this>");
            Kd kd = (Kd) rd2.b.f6995a.get(Short.valueOf(s));
            String str2 = kd != null ? kd.f6671a : null;
            Rd rd3 = this.e;
            Intrinsics.checkNotNullParameter(rd3, "<this>");
            Kd kd2 = (Kd) rd3.b.f6995a.get(Short.valueOf(s));
            if (kd2 != null && (list = kd2.b) != null) {
                arrayList = AbstractC3559a5.a("click", list);
            }
            List emptyList = arrayList == null ? CollectionsKt.emptyList() : arrayList;
            Y9 y93 = this.f;
            if (y93 != null) {
                ((Z9) y93).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + emptyList.size());
            }
            str = str2;
            a2 = emptyList;
        }
        a((short) 0, str, a2);
    }

    public final void a(AbstractC3595bd mediaEvent) {
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        Y9 y9 = this.f;
        if (y9 != null) {
            String simpleName = Reflection.getOrCreateKotlinClass(mediaEvent.getClass()).getSimpleName();
            Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
            ((Z9) y9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + simpleName + ", isClickEvent=" + ((mediaEvent instanceof Uk) || (mediaEvent instanceof C3578ao) || (mediaEvent instanceof C4039r4)));
        }
        Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
        boolean z = mediaEvent instanceof Uk;
        if (z || (mediaEvent instanceof C3578ao) || (mediaEvent instanceof C4039r4)) {
            Y9 y92 = this.f;
            if (y92 != null) {
                ((Z9) y92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.c.f();
            ((AbstractC3724g1) this.b).a(InteractionType.CLICK);
            if (z) {
                Y9 y93 = this.f;
                if (y93 != null) {
                    ((Z9) y93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((Uk) mediaEvent);
                return;
            }
            if (mediaEvent instanceof C3578ao) {
                Y9 y94 = this.f;
                if (y94 != null) {
                    ((Z9) y94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (mediaEvent instanceof C4039r4) {
                Y9 y95 = this.f;
                if (y95 != null) {
                    ((Z9) y95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((C4039r4) mediaEvent);
                return;
            }
            Y9 y96 = this.f;
            if (y96 != null) {
                ((Z9) y96).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        Rd rd = this.e;
        C4224xn c4224xn = rd.f6826a;
        String str = c4224xn != null ? c4224xn.f7485a : null;
        List a2 = Qd.a(rd);
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + a2.size());
        }
        a((short) 0, str, a2);
    }

    public final void a() {
        Rd rd = this.e;
        Intrinsics.checkNotNullParameter(rd, "<this>");
        Kd kd = (Kd) rd.b.f6995a.get((short) 7);
        String str = kd != null ? kd.f6671a : null;
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.f6849a.b(str, null);
            return;
        }
        Y9 y92 = this.f;
        if (y92 != null) {
            ((Z9) y92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(Uk uk) {
        Rd rd = this.e;
        C4224xn c4224xn = rd.f6826a;
        String str = c4224xn != null ? c4224xn.f7485a : null;
        List a2 = Qd.a(rd);
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = a2;
        if (!AbstractC3755h4.a(str)) {
            Y9 y92 = this.f;
            if (y92 != null) {
                ((Z9) y92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = uk.f6897a;
            ArrayList arrayList = uk.b;
            Y9 y93 = this.f;
            list = arrayList;
            if (y93 != null) {
                ((Z9) y93).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(C4039r4 c4039r4) {
        C4224xn c4224xn = this.e.f6826a;
        String str = c4224xn != null ? c4224xn.f7485a : null;
        ArrayList arrayList = c4039r4.f7342a;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = Qd.a(this.e);
        }
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + c4039r4.f7342a.size() + ", using VAST trackers=" + c4039r4.f7342a.isEmpty());
        }
        a((short) 1, str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(short s, String str, List list) {
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        Rd rd = this.e;
        Intrinsics.checkNotNullParameter(rd, "<this>");
        ArrayList a2 = AbstractC3559a5.a("click", rd.b.c);
        List plus = CollectionsKt.plus((Collection) list, (Iterable) a2);
        Y9 y92 = this.f;
        if (y92 != null) {
            ((Z9) y92).a("NativeClickProcessor", "Response click trackers count=" + a2.size() + ", combined trackers count=" + plus.size());
        }
        if (AbstractC3755h4.a(str)) {
            a2 = plus;
        } else {
            Y9 y93 = this.f;
            if (y93 != null) {
                ((Z9) y93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.e.b.b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.e.b.b;
            r4 = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            Y9 y94 = this.f;
            if (y94 != null) {
                ((Z9) y94).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + r4);
            }
        }
        if (str == null) {
            Y9 y95 = this.f;
            if (y95 != null) {
                ((Z9) y95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
            return;
        }
        Y9 y96 = this.f;
        if (y96 != null) {
            ((Z9) y96).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + r4 + ", firing " + a2.size() + " beacons");
        }
        this.f6849a.b(str, r4);
        this.d.a(s, a2);
    }
}
