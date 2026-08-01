package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4021qe extends AbstractC4254z implements Ok, Pi, InterfaceC3694f {
    public final MediaView b;
    public final View c;
    public final AbstractC3724g1 d;
    public final Nd e;
    public final Ed f;
    public final Jd g;
    public final C3671e5 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4021qe(MediaView mediaView, View view, AbstractC3724g1 adSessionManager, Nd nativeBeaconProcessor, Ed nativeAdUnitComponent, Jd stateMachine) {
        super(r0);
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C4227y c4227y = nativeAdUnitComponent.f6535a;
        this.b = mediaView;
        this.c = view;
        this.d = adSessionManager;
        this.e = nativeBeaconProcessor;
        this.f = nativeAdUnitComponent;
        this.g = stateMachine;
        H h = c4227y.b;
        this.h = new C3671e5(h.h, h.f6590a.f7340a.f7031a);
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadedState", "Initialize Called");
        }
        Dd dd = (Dd) this.f.f.getValue();
        Map a2 = AbstractC4169vm.a(dd.f6512a);
        long j = dd.b.f7058a;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdLoadSuccessful", a2, EnumC3944nm.f7271a);
        this.e.b.b.a(Uf.f6892a);
        JsonAssetObject assetsObject = this.f.b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C3626cf pubData = new C3626cf((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.b, this.c);
        Ad ad = this.f.c;
        ad.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Ok ok = ad.c;
        Ce ce = ok instanceof Ce ? (Ce) ok : null;
        if (ce != null) {
            ce.a(pubData);
        }
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Y9 l = l();
        if (l != null) {
            Z9 z9 = (Z9) l;
            z9.a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        H h = this.f7514a.b;
        Intrinsics.checkNotNullParameter(h, "<this>");
        Intrinsics.checkNotNullParameter(h, "<this>");
        long timeToLive = h.f6590a.b.getCacheConfig("native").getTimeToLive();
        long j = h.k;
        if (j == -1) {
            j = h.j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (j - System.currentTimeMillis() < 0) {
            Y9 l2 = l();
            if (l2 != null) {
                ((Z9) l2).a("NativeLoadedState", "Ad-Expired");
            }
            Map a2 = AbstractC4169vm.a(((Dd) this.f.f.getValue()).f6512a);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AdExpired", a2, EnumC3944nm.f7271a);
        }
        this.h.a();
        C3639d0 c3639d0 = this.f7514a.f7489a.d;
        c3639d0.getClass();
        c3639d0.d = SystemClock.elapsedRealtime();
        this.e.b.d.a(Uf.f6892a);
        Map a3 = AbstractC4169vm.a(((Dd) this.f.f.getValue()).f6512a);
        C3829jm c3829jm2 = C3829jm.f7187a;
        C3829jm.b("StartTracking", a3, EnumC3944nm.f7271a);
        this.g.a(new C4135uf(new C4162vf(new Uj(), new C3912mi(inMobiNativeViewData, this.b, this.c), this.h, this.d, this.e, this.f), this.g), this);
    }

    @Override // com.inmobi.media.InterfaceC3694f
    public final Object a(Continuation continuation) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadedState", "onDestroy");
        }
        Object a2 = this.g.a(new Vd(), this, (ContinuationImpl) continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
