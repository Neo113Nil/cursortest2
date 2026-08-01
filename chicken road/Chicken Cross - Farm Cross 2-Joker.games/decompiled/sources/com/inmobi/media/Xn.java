package com.inmobi.media;

import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xn {

    /* renamed from: a, reason: collision with root package name */
    public final Zn f6957a;
    public final C4241yd b;
    public final C4241yd c;
    public final C4241yd d;
    public final C4241yd e;
    public final C4241yd f;
    public final C4241yd g;
    public final Nk h;
    public final C4241yd i;
    public final C4241yd j;
    public final C4241yd k;
    public final C4241yd l;
    public final C4241yd m;
    public final C3956o6 n;
    public final C4241yd o;

    public Xn(Md nativeBeaconMacroData, Zn trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.f6957a = trackerData;
        Nk nk = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.e(Xn.this);
            }
        });
        Nk nk2 = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.f(Xn.this);
            }
        });
        this.b = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.d(Xn.this);
            }
        });
        this.c = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.g(Xn.this);
            }
        });
        this.d = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.h(Xn.this);
            }
        });
        this.e = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.b(Xn.this);
            }
        });
        this.f = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.j(Xn.this);
            }
        });
        this.g = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.n(Xn.this);
            }
        });
        this.h = new Nk(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.c(Xn.this);
            }
        });
        this.i = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.k(Xn.this);
            }
        });
        this.j = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.o(Xn.this);
            }
        });
        this.k = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.l(Xn.this);
            }
        });
        this.l = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.m(Xn.this);
            }
        });
        this.m = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.i(Xn.this);
            }
        });
        this.n = new C3956o6(nativeBeaconMacroData, trackerData, nk, nk2);
        this.o = new C4241yd(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Xn$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xn.a(Xn.this);
            }
        });
    }

    public static final List b(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public static final List d(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE, "firstQuartile");
    }

    public static final List g(Xn xn) {
        return xn.a("second_quartile", CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public static final List h(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE, "thirdQuartile");
    }

    public static final List i(Xn xn) {
        return xn.a("error", "error");
    }

    public static final List j(Xn xn) {
        return xn.a("load", U3.i.r);
    }

    public static final List k(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    public static final List l(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public static final List m(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public static final List n(Xn xn) {
        return xn.a("start", "start");
    }

    public static final List o(Xn xn) {
        return xn.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    public static final List a(Xn xn) {
        return AbstractC3559a5.a("companion_rendered", xn.f6957a.f6998a.f7422a);
    }

    public static final List c(Xn xn) {
        return AbstractC3559a5.a("creative_view", xn.f6957a.f6998a.f7422a);
    }

    public static final List e(Xn xn) {
        return AbstractC3559a5.a("progress_received", xn.f6957a.f6998a.f7422a);
    }

    public static final List f(Xn xn) {
        return AbstractC3559a5.a("progress_occurred", xn.f6957a.f6998a.f7422a);
    }

    public final List a(String str, String str2) {
        return CollectionsKt.plus((Collection) Vn.a(str2, this.f6957a.b), (Iterable) AbstractC3559a5.a(str, this.f6957a.f6998a.f7422a));
    }
}
