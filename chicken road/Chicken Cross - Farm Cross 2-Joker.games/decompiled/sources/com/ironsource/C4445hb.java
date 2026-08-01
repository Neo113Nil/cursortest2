package com.ironsource;

import com.ironsource.E0;
import com.ironsource.InterfaceC4427gb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4445hb extends AbstractC4676ua implements Ub {
    private final UUID d;
    private final C4409fb e;
    private Rb f;
    private String g;
    private C4411fd h;
    private InterfaceC4480jb i;
    private AdapterNativeAdData j;
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C4445hb(UUID uuid, C4409fb c4409fb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C4637s7.f8524a.a() : uuid, c4409fb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4445hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a().f().a(new C4540n(IronSource.a.NATIVE_AD, this$0.d, this$0.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4445hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Rb rb = this$0.f;
            if (rb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                rb = null;
            }
            rb.n();
            this$0.i = null;
        } catch (Throwable th) {
            C4491k4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4445hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rb rb = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C4577p0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Rb rb2 = this$0.f;
            if (rb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                rb = rb2;
            }
            rb.o();
        }
    }

    private final Rb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String b = b();
        C4411fd c4411fd = this.h;
        if (c4411fd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            c4411fd = null;
        }
        C4338bc c4338bc = new C4338bc(uuid, b, c4411fd);
        a(c4338bc);
        return new Rb(this, a(), c4338bc);
    }

    @Override // com.ironsource.AbstractC4676ua
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a().a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.b(C4445hb.this);
            }
        });
    }

    public final UUID g() {
        return this.d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC4427gb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4427gb.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a().a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.c(C4445hb.this);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String uuid = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, uuid, b());
        b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.a(C4445hb.this, levelPlayAdError);
            }
        });
    }

    public final void a(final InterfaceC4480jb interfaceC4480jb) {
        a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.a(C4445hb.this, interfaceC4480jb);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4445hb(UUID adId, C4409fb nativeAd) {
        super(new C4577p0(IronSource.a.NATIVE_AD, E0.b.MEDIATION));
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.a(C4445hb.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4445hb this$0, InterfaceC4480jb interfaceC4480jb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC4480jb;
    }

    @Override // com.ironsource.Ub
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Ob ob = new Ob();
        Rb rb = this.f;
        if (rb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            rb = null;
        }
        rb.a(ob);
        this.j = ob.a();
        this.k = ob.b();
        b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.b(C4445hb.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4445hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4480jb interfaceC4480jb = this$0.i;
        if (interfaceC4480jb != null) {
            interfaceC4480jb.b(this$0.e, adInfo);
        }
    }

    @Override // com.ironsource.Ub
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.a(C4445hb.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4445hb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC4480jb interfaceC4480jb = this$0.i;
        if (interfaceC4480jb != null) {
            interfaceC4480jb.a(this$0.e, levelPlayError);
        }
    }

    public final void b(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4445hb.a(C4445hb.this, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4445hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4480jb interfaceC4480jb = this$0.i;
        if (interfaceC4480jb != null) {
            interfaceC4480jb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4445hb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
