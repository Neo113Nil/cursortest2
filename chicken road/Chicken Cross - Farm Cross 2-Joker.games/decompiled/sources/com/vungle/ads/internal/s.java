package com.vungle.ads.internal;

import android.content.Context;
import com.tiktok.appevents.ErrorData;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes7.dex */
public abstract class s implements com.vungle.ads.internal.load.a {
    public static final Json p = JsonKt.Json$default(null, i.f11925a, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12114a;
    public volatile h b;
    public com.vungle.ads.internal.model.i0 c;
    public j3 d;
    public com.vungle.ads.internal.model.q0 e;
    public com.vungle.ads.internal.load.a f;
    public final Lazy g;
    public com.vungle.ads.internal.load.i h;
    public l2 i;
    public l2 j;
    public final q1 k;
    public final q1 l;
    public com.vungle.ads.internal.util.s m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;

    public s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12114a = context;
        this.b = h.f11922a;
        this.g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new r(context));
        this.k = new q1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.l = new q1(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
    }

    public final void a(h value) {
        String h;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.a()) {
            com.vungle.ads.internal.load.i iVar = this.h;
            if (iVar != null) {
                iVar.a();
            }
            com.vungle.ads.internal.model.i0 i0Var = this.c;
            if (i0Var != null && (h = i0Var.h()) != null) {
                ((com.vungle.ads.internal.task.r) ((com.vungle.ads.internal.task.g) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new j(this.f12114a)).getValue())).a(com.vungle.ads.internal.task.a.a(h, null, 2));
            }
        }
        this.b = this.b.b(value);
        com.vungle.ads.internal.util.s sVar = this.m;
        if (sVar == null) {
            return;
        }
        sVar.a(this.b);
    }

    public void a(com.vungle.ads.internal.model.i0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public abstract boolean a(VungleAdSize vungleAdSize);

    public abstract boolean a(j3 j3Var);

    public abstract VungleAdSize b();

    public void b(com.vungle.ads.internal.model.i0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public final com.vungle.ads.internal.model.i0 c() {
        return this.c;
    }

    public final Context d() {
        return this.f12114a;
    }

    public final com.vungle.ads.internal.util.s e() {
        return this.m;
    }

    public final j3 f() {
        return this.d;
    }

    public final q1 g() {
        return this.k;
    }

    public final q1 h() {
        return this.l;
    }

    public final boolean i() {
        return this.b == h.d || this.b == h.e;
    }

    public InvalidAdStateError j() {
        if (this.b == h.d) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.b == h.e) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.b != h.c) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.b + " is not READY");
        }
        return null;
    }

    public final void k() {
        List<String> r;
        if (!this.o.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Loss URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.i0 i0Var = this.c;
        if (i0Var == null || (r = i0Var.r()) == null) {
            return;
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new p(this.f12114a));
        for (String str : r) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void l() {
        List<String> w;
        if (!this.n.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Win URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.i0 i0Var = this.c;
        if (i0Var == null || (w = i0Var.w()) == null) {
            return;
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new q(this.f12114a));
        for (String str : w) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid win URL skipped: " + str);
            }
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(h.g);
        l2 l2Var = this.j;
        if (l2Var != null) {
            l2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            l2Var.d();
            AnalyticsClient.INSTANCE.a(l2Var, this.m, error.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.a aVar = this.f;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onSuccess(com.vungle.ads.internal.model.i0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.c = advertisement;
        a(h.c);
        a(advertisement);
        b(advertisement);
        com.vungle.ads.internal.load.a aVar = this.f;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        l2 l2Var = this.j;
        if (l2Var != null) {
            if (!advertisement.b()) {
                l2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            l2Var.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, l2Var, this.m, 4);
        }
        l2 l2Var2 = this.i;
        if (l2Var2 != null) {
            if (!advertisement.b()) {
                l2Var2.a(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            l2Var2.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, l2Var2, this.m, 4);
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new o(this.f12114a));
            List a2 = com.vungle.ads.internal.model.i0.a(advertisement, "ad.loadDuration", String.valueOf(l2Var2.c()), 4);
            if (a2 != null) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p((String) it.next()).b("ad.loadDuration").a(this.m).a(), false);
                }
            }
        }
    }

    public final VungleError a(boolean z) {
        VungleError adExpiredError;
        com.vungle.ads.internal.model.i k;
        VungleError j = j();
        com.vungle.ads.internal.model.i0 i0Var = this.c;
        if (i0Var == null) {
            j = new AdNotLoadedCantPlay("adv is null on onPlay=" + z);
        } else if (j == null) {
            Integer num = null;
            if (!i0Var.x()) {
                return null;
            }
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Ad expiry: ");
            com.vungle.ads.internal.model.i0 i0Var2 = this.c;
            if (i0Var2 != null && (k = i0Var2.k()) != null) {
                num = k.d;
            }
            String sb = a2.append(num).append(", device: ").append(System.currentTimeMillis()).toString();
            if (z) {
                adExpiredError = new AdExpiredOnPlayError(sb);
            } else {
                adExpiredError = new AdExpiredError(sb);
            }
            j = adExpiredError;
        }
        if (z) {
            j.setLogEntry$vungle_ads_release(this.m).logErrorNoReturnValue$vungle_ads_release();
        }
        return j;
    }

    public final void a(String placementId, String str, VungleCSBData vungleCSBData, com.vungle.ads.internal.load.a adLoaderCallback) {
        Sdk.SDKError.Reason reason;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        com.vungle.ads.internal.util.s sVar = this.m;
        if (sVar != null) {
            sVar.a(this.b);
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.m, null, 10);
        l2 l2Var = new l2(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.j = l2Var;
        l2Var.e();
        this.f = adLoaderCallback;
        if (!VungleAds.INSTANCE.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized(ErrorData.TT_DDL_MSG_NOT_INIT).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        j3 a2 = ConfigManager.a(placementId);
        if (a2 != null) {
            this.d = a2;
            if (!a(a2)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(a2.b()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            } else if (a2.a() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
        } else if (ConfigManager.b() == -1) {
            a2 = new j3(placementId);
            this.d = a2;
        } else {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        VungleAdSize b = b();
        if (!a(b)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(b != null ? b.toString() : null).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        if (this.b != h.f11922a) {
            switch (this.b.ordinal()) {
                case 0:
                    throw new NotImplementedError(null, 1, null);
                case 1:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 2:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.b + " state is incorrect for load").setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        l2 l2Var2 = new l2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.i = l2Var2;
        l2Var2.e();
        if (str != null && str.length() != 0) {
            try {
                Json json = p;
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(com.vungle.ads.internal.model.q0.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.e = (com.vungle.ads.internal.model.q0) json.decodeFromString(serializer, str);
            } catch (IllegalArgumentException e) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError(com.iab.omid.library.vungle.internal.l.a("Unable to decode payload into BidPayload object. Error: ").append(e.getLocalizedMessage()).toString()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
        }
        a(h.b);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new k(this.f12114a));
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new l(this.f12114a));
        Lazy lazy3 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new m(this.f12114a));
        Lazy lazy4 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new n(this.f12114a));
        if (vungleCSBData != null) {
            double bidFloor = vungleCSBData.getBidFloor();
            InvalidCSBDataError invalidCSBDataError = bidFloor < 0.0d ? new InvalidCSBDataError("bidFloor must be >= 0, got: " + bidFloor) : null;
            if (invalidCSBDataError == null) {
                int phase = vungleCSBData.getPhase();
                invalidCSBDataError = (1 > phase || phase >= 3) ? new InvalidCSBDataError("phase must be 1 or 2, got: " + phase) : null;
                if (invalidCSBDataError == null) {
                    invalidCSBDataError = vungleCSBData.getAuctionId().length() > 500 ? new InvalidCSBDataError("auctionId exceeds maximum length of 500") : null;
                    if (invalidCSBDataError == null) {
                        invalidCSBDataError = vungleCSBData.getCreativeId().length() > 500 ? new InvalidCSBDataError("creativeId exceeds maximum length of 500") : null;
                        if (invalidCSBDataError == null) {
                            invalidCSBDataError = vungleCSBData.getAdUnitId().length() > 500 ? new InvalidCSBDataError("adUnitId exceeds maximum length of 500") : null;
                        }
                    }
                    if (invalidCSBDataError == null) {
                        Map<String, String> extras = vungleCSBData.getExtras();
                        if (extras != null) {
                            if (extras.size() > 50) {
                                invalidCSBDataError = new InvalidCSBDataError(com.iab.omid.library.vungle.internal.l.a("extras map exceeds maximum of 50 entries, got: ").append(extras.size()).toString());
                            } else {
                                for (Map.Entry<String, String> entry : extras.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (key.length() == 0) {
                                        invalidCSBDataError = new InvalidCSBDataError("extras contains empty key");
                                        break;
                                    } else if (key.length() > 100) {
                                        invalidCSBDataError = new InvalidCSBDataError(com.iab.omid.library.vungle.d.a("extras key exceeds maximum length of 100: ", key));
                                        break;
                                    } else if (value.length() > 500) {
                                        invalidCSBDataError = new InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
                                        break;
                                    }
                                }
                            }
                        }
                        invalidCSBDataError = null;
                    }
                }
            }
            if (invalidCSBDataError != null) {
                adLoaderCallback.onFailure(invalidCSBDataError.setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
            com.vungle.ads.internal.util.s sVar2 = this.m;
            if (sVar2 != null) {
                sVar2.a(vungleCSBData.getPhase() == 2 ? 4L : 3L);
            }
            this.h = new com.vungle.ads.internal.load.j(this.f12114a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.n) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a2, null, b, vungleCSBData));
        } else if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.s sVar3 = this.m;
            if (sVar3 != null) {
                sVar3.a((Long) 1L);
            }
            this.h = new com.vungle.ads.internal.load.l(this.f12114a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.n) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a2, null, b, null));
        } else {
            com.vungle.ads.internal.util.s sVar4 = this.m;
            if (sVar4 != null) {
                sVar4.a((Long) 2L);
            }
            this.h = new com.vungle.ads.internal.load.p(this.f12114a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.n) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a2, this.e, b, null));
        }
        com.vungle.ads.internal.load.i iVar = this.h;
        if (iVar != null) {
            iVar.a(this.m);
        }
        com.vungle.ads.internal.load.i iVar2 = this.h;
        if (iVar2 != null) {
            iVar2.a(this);
        }
    }

    public final void a() {
        com.vungle.ads.internal.model.i0 i0Var = this.c;
        if (i0Var != null && i0Var.B()) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Skip cancelling download for ads with partial download enabled.");
        } else {
            com.vungle.ads.internal.load.i iVar = this.h;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public final boolean a(int i) {
        return this.b == h.c && i == 304;
    }
}
