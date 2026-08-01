package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A2;
import com.inmobi.media.AbstractC3604bm;
import com.inmobi.media.AbstractC3727g4;
import com.inmobi.media.AbstractC3841k6;
import com.inmobi.media.AbstractC3904ma;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3923n1;
import com.inmobi.media.AbstractC3942nk;
import com.inmobi.media.AbstractC4037r2;
import com.inmobi.media.AbstractC4202x1;
import com.inmobi.media.AbstractC4203x2;
import com.inmobi.media.C3600bi;
import com.inmobi.media.C3829jm;
import com.inmobi.media.C3900m6;
import com.inmobi.media.C4065s2;
import com.inmobi.media.C4093t2;
import com.inmobi.media.C4148v1;
import com.inmobi.media.C4175w1;
import com.inmobi.media.C4176w2;
import com.inmobi.media.C4230y2;
import com.inmobi.media.E9;
import com.inmobi.media.Eg;
import com.inmobi.media.EnumC3944nm;
import com.inmobi.media.EnumC3952o2;
import com.inmobi.media.EnumC4149v2;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.HandlerC4257z2;
import com.inmobi.media.Kc;
import com.inmobi.media.U1;
import com.inmobi.media.Z9;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.T2;
import com.ironsource.Te;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0089\u00012\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J#\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0007¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0000¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020\u000bH\u0007¢\u0006\u0004\b<\u0010\rJ\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020'H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020#H\u0016¢\u0006\u0004\bC\u0010&J\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bD\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0001¢\u0006\u0004\bF\u0010\rJ\r\u0010H\u001a\u00020\u000b¢\u0006\u0004\bH\u0010\rJ\r\u0010I\u001a\u00020\u000b¢\u0006\u0004\bI\u0010\rJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020'2\u0006\u0010U\u001a\u00020P¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020#¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000bH\u0007¢\u0006\u0004\bZ\u0010\rR$\u0010b\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010OR\"\u0010p\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R&\u0010\u0085\u0001\u001a\u00020\u007f8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010\r\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "getSignals", "()V", "", Te.n, "load", "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", T2.b, "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "updateLayoutParamsForResolvedSize$media_release", "updateLayoutParamsForResolvedSize", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "", "minBidToWin", "notifyWin", "(D)V", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/r2;", "b", "Lcom/inmobi/media/r2;", "getMPubListener$media_release", "()Lcom/inmobi/media/r2;", "setMPubListener$media_release", "(Lcom/inmobi/media/r2;)V", "mPubListener", "c", "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/o2;", "d", "Lcom/inmobi/media/o2;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/o2;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/o2;)V", "audioStatusInternal", "Lcom/inmobi/media/A2;", "e", "Lcom/inmobi/media/A2;", "getMAdManager$media_release", "()Lcom/inmobi/media/A2;", "setMAdManager$media_release", "(Lcom/inmobi/media/A2;)V", "mAdManager", "Lcom/inmobi/media/bi;", "o", "Lcom/inmobi/media/bi;", "getMPubSettings$media_release", "()Lcom/inmobi/media/bi;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "p", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", k.M, "AnimationType", "com/inmobi/media/E9", "a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiBanner extends RelativeLayout {
    public static final E9 Companion = new E9();

    /* renamed from: a, reason: collision with root package name */
    public Job f6435a;

    /* renamed from: b, reason: from kotlin metadata */
    public AbstractC4037r2 mPubListener;

    /* renamed from: c, reason: from kotlin metadata */
    public AudioListener mAudioListener;

    /* renamed from: d, reason: from kotlin metadata */
    public EnumC3952o2 audioStatusInternal;

    /* renamed from: e, reason: from kotlin metadata */
    public A2 mAdManager;
    public final a f;
    public int g;
    public boolean h;
    public final HandlerC4257z2 i;
    public int j;
    public int k;
    public AnimationType l;
    public long m;
    public WeakReference n;

    /* renamed from: o, reason: from kotlin metadata */
    public final C3600bi mPubSettings;
    public final d p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private AnimationType(String str, int i) {
        }

        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/y2;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C4230y2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner banner) {
            super(banner);
            Intrinsics.checkNotNullParameter(banner, "banner");
        }

        @Override // com.inmobi.media.C4230y2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C4230y2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC4037r2 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C4230y2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    A2 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.a(inMobiBanner);
                    }
                    A2 mAdManager2 = inMobiBanner.getMAdManager();
                    if (mAdManager2 != null) {
                        mAdManager2.o();
                    }
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
                    Kc.a((byte) 1, access$getTAG$cp, e.getMessage());
                    AbstractC4037r2 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.audioStatusInternal = EnumC3952o2.d;
        this.f = new a(this);
        this.h = true;
        this.l = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3600bi c3600bi = new C3600bi();
        this.mPubSettings = c3600bi;
        this.p = new d(this);
        if (!AbstractC3914mk.c()) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.n = new WeakReference(context);
        }
        this.mAdManager = new A2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", T2.b);
        if (attributeValue != null) {
            long a2 = a(attributeValue);
            if (a2 == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            c3600bi.f7031a = a2;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        a(this, context2);
        A2 a22 = this.mAdManager;
        this.g = a22 != null ? a22.k() : 0;
        this.i = new HandlerC4257z2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) attributeValue2.charAt(!z ? i : length), 32) <= 0;
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
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i, length + 1).toString()));
            } catch (NumberFormatException unused) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                Kc.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final Unit a(InMobiBanner inMobiBanner, byte[] bArr) {
        Z9 z9;
        A2 a2 = inMobiBanner.mAdManager;
        if (a2 != null && (z9 = a2.f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.c("InMobiBanner", "load with response");
        }
        A2 a22 = inMobiBanner.mAdManager;
        if (a22 != null) {
            a22.a(bArr, inMobiBanner.f);
        }
        return Unit.INSTANCE;
    }

    public static final void access$captureStandardBannerSize(InMobiBanner inMobiBanner, int i, int i2) {
        inMobiBanner.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        inMobiBanner.j = i;
        inMobiBanner.k = i2;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    private final String getFrameSizeString() {
        return this.j + "x" + this.k;
    }

    @Deprecated(message = "Preload Flow is deprecated. Use load() instead")
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final boolean b() {
        Z9 z9;
        A2 a2 = this.mAdManager;
        if (a2 == null || (z9 = a2.f) == null) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
        z9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    public final boolean c() {
        return this.j > 0 && this.k > 0;
    }

    public final void d() {
        String str;
        C3600bi c3600bi = this.mPubSettings;
        C4148v1 a2 = AbstractC4202x1.a(c3600bi.h, c3600bi.d);
        C3600bi c3600bi2 = this.mPubSettings;
        c3600bi2.d = a2.f7426a;
        C4175w1 c4175w1 = a2.b;
        if (c4175w1 != null) {
            str = c4175w1.f7448a + "x" + c4175w1.b;
        } else {
            str = null;
        }
        c3600bi2.b = str;
        C4175w1 c4175w12 = a2.b;
        if (c4175w12 != null) {
            updateLayoutParamsForResolvedSize$media_release(c4175w12.f7448a, c4175w12.b);
        }
    }

    public final void destroy() {
        a();
        Job job = this.f6435a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f6435a = null;
        removeAllViews();
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.j();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.e = true;
    }

    public final void f() {
        if (getLayoutParams() == null || c()) {
            return;
        }
        int b = AbstractC3727g4.b(getLayoutParams().width / AbstractC3841k6.b());
        int b2 = AbstractC3727g4.b(getLayoutParams().height / AbstractC3841k6.b());
        if (b <= 0 || b2 <= 0) {
            return;
        }
        this.j = b;
        this.k = b2;
    }

    /* renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final EnumC3952o2 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    /* renamed from: getMAdManager$media_release, reason: from getter */
    public final A2 getMAdManager() {
        return this.mAdManager;
    }

    /* renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    /* renamed from: getMPubListener$media_release, reason: from getter */
    public final AbstractC4037r2 getMPubListener() {
        return this.mPubListener;
    }

    /* renamed from: getMPubSettings$media_release, reason: from getter */
    public final C3600bi getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.f7031a;
    }

    public final PreloadManager getPreloadManager() {
        return this.p;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use InMobiSdk.getToken() instead.", replaceWith = @ReplaceWith(expression = "InMobiSdk.getToken()", imports = {"com.inmobi.ads.InMobiSdk"}))
    public final void getSignals() {
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.a(this.f);
        }
    }

    public final boolean isAudioAd() {
        C4093t2 c4093t2;
        Ad b;
        A2 a2 = this.mAdManager;
        if (a2 == null || (c4093t2 = a2.m) == null || (b = c4093t2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = b.getMetaInfo();
        return Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    public final void load(final byte[] response) {
        C4093t2 c4093t2;
        C4093t2 c4093t22;
        b();
        C3600bi c3600bi = this.mPubSettings;
        c3600bi.getClass();
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        c3600bi.h = "AB";
        f();
        d();
        A2 a2 = this.mAdManager;
        if (a2 == null || (c4093t2 = a2.k) == null || (c4093t22 = a2.l) == null || (a2 != null && c4093t2 != null && c4093t22 != null && a2 != null && a2.f6810a == 0)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
        }
        A2 a22 = this.mAdManager;
        if (a22 != null) {
            a22.g();
        }
        a("load(byte[])", new Function0() { // from class: com.inmobi.ads.InMobiBanner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InMobiBanner.a(InMobiBanner.this, response);
            }
        });
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String str = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "loss notification failed to trigger");
            Unit unit = Unit.INSTANCE;
        }
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            if (a2.f() != null) {
                AbstractC3923n1 f = a2.f();
                str = f != null ? f.a(lossReason, auctionPrice) : null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            Kc.a((byte) 1, "InMobi", str);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String str = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "win notification failed to trigger");
            Unit unit = Unit.INSTANCE;
        }
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            if (a2.f() != null) {
                AbstractC3923n1 f = a2.f();
                str = f != null ? f.a(minBidToWin) : null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            Kc.a((byte) 1, "InMobi", str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Z9 z9;
        try {
            super.onAttachedToWindow();
            Job job = this.f6435a;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f6435a = null;
            A2 a2 = this.mAdManager;
            if (a2 != null) {
                a2.n();
            }
            f();
            if (!c()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C3900m6 c3900m6 = AbstractC3841k6.f7196a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC3841k6.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            A2 a22 = this.mAdManager;
            if (a22 == null || (z9 = a22.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Z9 z9;
        Job launch$default;
        try {
            super.onDetachedFromWindow();
            a();
            A2 a2 = this.mAdManager;
            if (a2 != null) {
                a2.t();
            }
            Map map = this.mPubSettings.d;
            String str = map != null ? (String) map.get("tp") : null;
            C4176w2 a3 = AbstractC4203x2.a(str);
            EnumC4149v2 enumC4149v2 = a3.f7449a ? EnumC4149v2.c : a3.b ? EnumC4149v2.b : EnumC4149v2.f7427a;
            if (enumC4149v2 != EnumC4149v2.f7427a) {
                long j = AbstractC4203x2.a(str).c;
                WeakReference weakReference = new WeakReference(this);
                Job job = this.f6435a;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.g, null, null, new F9(j, weakReference, enumC4149v2, null), 3, null);
                this.f6435a = launch$default;
            }
        } catch (Exception e) {
            A2 a22 = this.mAdManager;
            if (a22 == null || (z9 = a22.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        Z9 z9;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 == null || (z9 = a2.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        Z9 z9;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 == null || (z9 = a2.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e);
        }
    }

    public final void pause() {
        Z9 z9;
        A2 a2;
        try {
            if (this.n != null || (a2 = this.mAdManager) == null) {
                return;
            }
            a2.m();
        } catch (Exception e) {
            A2 a22 = this.mAdManager;
            if (a22 == null || (z9 = a22.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f, "NonAB", true);
    }

    public final void resume() {
        Z9 z9;
        A2 a2;
        try {
            if (this.n != null || (a2 = this.mAdManager) == null) {
                return;
            }
            a2.p();
        } catch (Exception e) {
            A2 a22 = this.mAdManager;
            if (a22 == null || (z9 = a22.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e);
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC4257z2 handlerC4257z2;
        if (isShown() && hasWindowFocus()) {
            HandlerC4257z2 handlerC4257z22 = this.i;
            if (handlerC4257z22 != null) {
                handlerC4257z22.removeMessages(1);
            }
            A2 a2 = this.mAdManager;
            if (a2 == null || !a2.i() || !this.h || (handlerC4257z2 = this.i) == null) {
                return;
            }
            handlerC4257z2.sendEmptyMessageDelayed(1, this.g * 1000);
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.l = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        Intrinsics.checkNotNullParameter(audioListener, "audioListener");
        this.mAudioListener = audioListener;
        EnumC3952o2 item = this.audioStatusInternal;
        if (item == EnumC3952o2.d || audioListener == null) {
            return;
        }
        EnumC3952o2.b.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        int ordinal = item.ordinal();
        audioListener.onAudioStatusChanged(this, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    public final void setAudioStatusInternal$media_release(EnumC3952o2 enumC3952o2) {
        Intrinsics.checkNotNullParameter(enumC3952o2, "<set-?>");
        this.audioStatusInternal = enumC3952o2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use setLayoutParams on InMobiBanner instead.")
    public final void setBannerSize(int widthInDp, int heightInDp) {
        if (widthInDp > 0 && heightInDp > 0) {
            this.j = widthInDp;
            this.k = heightInDp;
        }
        Eg.a("BannerSetBannerSizeUsed", new Function0() { // from class: com.inmobi.ads.InMobiBanner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InMobiBanner.e();
            }
        });
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.mPubSettings.f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        Z9 z9;
        try {
            if (this.h == enabled) {
                return;
            }
            this.h = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            A2 a2 = this.mAdManager;
            if (a2 == null || (z9 = a2.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e);
        }
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC3942nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC3942nk.f7270a = str2;
            }
        }
        this.mPubSettings.d = extras;
    }

    public final void setKeywords(String keywords) {
        this.mPubSettings.c = keywords;
    }

    public final void setListener(BannerAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPubListener = new C4065s2(listener);
    }

    public final void setMAdManager$media_release(A2 a2) {
        this.mAdManager = a2;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(AbstractC4037r2 abstractC4037r2) {
        this.mPubListener = abstractC4037r2;
    }

    public final void setRefreshInterval(int refreshInterval) {
        Z9 z9;
        try {
            C3600bi c3600bi = this.mPubSettings;
            c3600bi.getClass();
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            c3600bi.h = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
            A2 a2 = this.mAdManager;
            this.g = a2 != null ? a2.a(refreshInterval, this.g) : 0;
        } catch (Exception e) {
            A2 a22 = this.mAdManager;
            if (a22 == null || (z9 = a22.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e);
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.a(watermarkData);
        }
    }

    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new G9(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        Z9 z9;
        A2 a2 = this.mAdManager;
        if (a2 != null) {
            a2.s();
        }
        try {
            Animation a3 = b.a(this.l, getWidth(), getHeight());
            A2 a22 = this.mAdManager;
            if (a22 != null) {
                a22.b(this);
            }
            if (a3 != null) {
                startAnimation(a3);
            }
        } catch (Exception e) {
            A2 a23 = this.mAdManager;
            if (a23 == null || (z9 = a23.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e);
        }
    }

    public final void updateLayoutParamsForResolvedSize$media_release(int widthInDp, int heightInDp) {
        int b = (int) (AbstractC3841k6.b() * widthInDp);
        int b2 = (int) (AbstractC3841k6.b() * heightInDp);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = b;
            layoutParams.height = b2;
        } else {
            layoutParams = new RelativeLayout.LayoutParams(b, b2);
        }
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public static final Unit e() {
        String str = U1.b;
        if (str == null) {
            str = "";
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("BannerSetBannerSizeUsed", mutableMapOf, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }

    public final boolean b(String str) {
        Z9 z9;
        Z9 z92;
        if (c()) {
            return true;
        }
        if (getLayoutParams() == null) {
            A2 a2 = this.mAdManager;
            if (a2 != null && (z92 = a2.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z92.b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            f();
            return true;
        }
        A2 a22 = this.mAdManager;
        if (a22 != null && (z9 = a22.f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before " + str);
        }
        return false;
    }

    public final void a(final PublisherCallbacks publisherCallbacks, String str, final boolean z) {
        Z9 z9;
        Z9 z92;
        Z9 z93;
        Z9 z94;
        Z9 z95;
        try {
            C3600bi c3600bi = this.mPubSettings;
            c3600bi.getClass();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            c3600bi.h = str;
            A2 a2 = this.mAdManager;
            if (a2 != null && a2.l()) {
                A2 a22 = this.mAdManager;
                if (a22 != null) {
                    a22.g();
                }
                A2 a23 = this.mAdManager;
                if (a23 != null && (z95 = a23.f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    z95.a("InMobiBanner", "load called - placementType - " + str + ServerSentEventKt.SPACE + this);
                }
                A2 a24 = this.mAdManager;
                if (a24 != null && (z94 = a24.f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    z94.b("InMobiBanner", "load already in progress");
                }
                A2 a25 = this.mAdManager;
                if (a25 != null) {
                    a25.b((short) 2169);
                }
                AbstractC4037r2 abstractC4037r2 = this.mPubListener;
                if (abstractC4037r2 != null) {
                    abstractC4037r2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                A2 a26 = this.mAdManager;
                if (a26 != null && (z93 = a26.f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    z93.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                Kc.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            f();
            d();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
            A2 a27 = this.mAdManager;
            if (a27 != null) {
                a27.g();
            }
            A2 a28 = this.mAdManager;
            if (a28 != null && (z92 = a28.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z92.a("InMobiBanner", "load called - placementType - " + str + ServerSentEventKt.SPACE + this);
            }
            a("load", new Function0() { // from class: com.inmobi.ads.InMobiBanner$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InMobiBanner.a(InMobiBanner.this, publisherCallbacks, z);
                }
            });
        } catch (Exception e) {
            A2 a29 = this.mAdManager;
            if (a29 != null) {
                a29.a((short) 2172);
            }
            AbstractC4037r2 abstractC4037r22 = this.mPubListener;
            if (abstractC4037r22 != null) {
                abstractC4037r22.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            A2 a210 = this.mAdManager;
            if (a210 == null || (z9 = a210.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "Load failed with unexpected error: ", e);
        }
    }

    public final void load() {
        b();
        a((PublisherCallbacks) this.f, "NonAB", false);
    }

    public final void load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        this.n = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f, "NonAB", false);
    }

    public static final Unit a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z) {
        A2 a2;
        inMobiBanner.a();
        long j = inMobiBanner.m;
        if (j == 0 || (a2 = inMobiBanner.mAdManager) == null || a2.a(j)) {
            inMobiBanner.m = SystemClock.elapsedRealtime();
            A2 a22 = inMobiBanner.mAdManager;
            if (a22 != null) {
                a22.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z);
            }
        }
        return Unit.INSTANCE;
    }

    public final void a(String str, final Function0 function0) {
        Z9 z9;
        Z9 z92;
        A2 a2 = this.mAdManager;
        if (a2 != null && (z92 = a2.f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z92.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            A2 a22 = this.mAdManager;
            if (a22 != null && (z9 = a22.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z9.b("InMobiBanner", "invalid banner size. fail.");
            }
            A2 a23 = this.mAdManager;
            if (a23 != null) {
                a23.a((short) 2170);
            }
            AbstractC4037r2 abstractC4037r2 = this.mPubListener;
            if (abstractC4037r2 != null) {
                abstractC4037r2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!c()) {
            Runnable runnable = new Runnable() { // from class: com.inmobi.ads.InMobiBanner$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiBanner.a(InMobiBanner.this, function0);
                }
            };
            Lazy lazy = AbstractC3604bm.f7033a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ((Handler) AbstractC3604bm.f7033a.getValue()).postDelayed(runnable, 200L);
            return;
        }
        function0.invoke();
    }

    public static final void a(InMobiBanner inMobiBanner, Function0 function0) {
        Z9 z9;
        Z9 z92;
        try {
            if (inMobiBanner.c()) {
                function0.invoke();
                return;
            }
            A2 a2 = inMobiBanner.mAdManager;
            if (a2 != null && (z92 = a2.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z92.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            A2 a22 = inMobiBanner.mAdManager;
            if (a22 != null) {
                a22.a((short) 2171);
            }
            AbstractC4037r2 abstractC4037r2 = inMobiBanner.mPubListener;
            if (abstractC4037r2 != null) {
                abstractC4037r2.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e) {
            A2 a23 = inMobiBanner.mAdManager;
            if (a23 != null) {
                a23.a((short) 2172);
            }
            AbstractC4037r2 abstractC4037r22 = inMobiBanner.mPubListener;
            if (abstractC4037r22 != null) {
                abstractC4037r22.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            A2 a24 = inMobiBanner.mAdManager;
            if (a24 == null || (z9 = a24.f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int i;
        A2 a2 = inMobiBanner.mAdManager;
        if (a2 != null) {
            a2.a(context, inMobiBanner.mPubSettings, inMobiBanner.getFrameSizeString());
        }
        A2 a22 = inMobiBanner.mAdManager;
        if (a22 != null) {
            int i2 = inMobiBanner.g;
            i = a22.a(i2, i2);
        } else {
            i = 0;
        }
        inMobiBanner.g = i;
    }

    public final void a() {
        HandlerC4257z2 handlerC4257z2 = this.i;
        if (handlerC4257z2 != null) {
            handlerC4257z2.removeMessages(1);
        }
    }

    public final long a(String str) {
        Z9 z9;
        Z9 z92;
        StringBuilder sb;
        Z9 z93;
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            sb = new StringBuilder(str.subSequence(i, length + 1).toString());
        } catch (NumberFormatException unused) {
            A2 a2 = this.mAdManager;
            if (a2 != null && (z92 = a2.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z92.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            A2 a22 = this.mAdManager;
            if (a22 != null && (z9 = a22.f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                z9.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        }
        if (StringsKt.equals("plid-", sb.substring(0, 5), true)) {
            String substring = sb.substring(5, sb.length());
            Intrinsics.checkNotNull(substring);
            int length2 = substring.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length2) {
                boolean z4 = Intrinsics.compare((int) substring.charAt(!z3 ? i2 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length2--;
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            return Long.parseLong(substring.subSequence(i2, length2 + 1).toString());
        }
        A2 a23 = this.mAdManager;
        if (a23 != null && (z93 = a23.f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            z93.b("InMobiBanner", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.audioStatusInternal = EnumC3952o2.d;
        this.f = new a(this);
        this.h = true;
        this.l = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3600bi c3600bi = new C3600bi();
        this.mPubSettings = c3600bi;
        this.p = new d(this);
        if (AbstractC3914mk.c()) {
            if (context instanceof Activity) {
                this.n = new WeakReference(context);
            }
            this.mAdManager = new A2();
            c3600bi.f7031a = j;
            a(this, context);
            A2 a2 = this.mAdManager;
            this.g = a2 != null ? a2.k() : 0;
            this.i = new HandlerC4257z2(this);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }
}
