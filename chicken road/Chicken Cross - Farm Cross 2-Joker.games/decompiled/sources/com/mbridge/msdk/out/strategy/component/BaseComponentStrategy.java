package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.b$$ExternalSyntheticLambda0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class BaseComponentStrategy {
    protected static final long DEFAULT_TIMEOUT_MS = 3000;
    protected static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    protected static final String TAG = "BaseComponentStrategy";
    protected int adType;
    protected String bidToken;
    protected String extraData;
    protected b mComponentCallbackListener;
    protected NewInterstitialListener newInterstitialListener;
    protected String placementId;
    protected g rewardVideoListener;
    protected String unitId;
    protected String userId;
    protected boolean isReady = true;
    protected boolean isRewardPlusOpen = false;
    protected int isSilent = 0;
    protected Map<String, Object> developerSettingMap = new HashMap();
    protected volatile boolean isQuerying = false;
    protected volatile Looper triggerThreadLooper = null;

    /* renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1, reason: invalid class name */
    class AnonymousClass1 implements b {
        AnonymousClass1() {
        }

        /* renamed from: lambda$onAdClose$1$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6230xfdc28320(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* renamed from: lambda$onAdShow$0$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6231x60546702(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdShow(mBridgeIds);
            }
        }

        /* renamed from: lambda$onEndCardShow$5$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6232x214ab4f7(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onEndcardShow(mBridgeIds);
            }
        }

        /* renamed from: lambda$onLoadSuccess$8$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6233x9d9c83cf(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onLoadSuccess(mBridgeIds);
            }
        }

        /* renamed from: lambda$onShowFail$2$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6234x32c92b3f(MBridgeIds mBridgeIds, String str) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onShowFail(mBridgeIds, str);
            }
        }

        /* renamed from: lambda$onVideoAdClicked$3$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6235xfd99df4e(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoAdClicked(mBridgeIds);
            }
        }

        /* renamed from: lambda$onVideoComplete$4$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6236xe446eba2(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoComplete(mBridgeIds);
            }
        }

        /* renamed from: lambda$onVideoLoadFail$6$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6237xbf2db0cf(MBridgeIds mBridgeIds, String str) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadFail(mBridgeIds, str);
            }
        }

        /* renamed from: lambda$onVideoLoadSuccess$7$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1, reason: not valid java name */
        /* synthetic */ void m6238x84e3f68b(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6230xfdc28320(mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0, "");
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6231x60546702(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6232x214ab4f7(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6233x9d9c83cf(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6234x32c92b3f(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6235xfd99df4e(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6236xe446eba2(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6237xbf2db0cf(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.this.m6238x84e3f68b(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1, "");
        }
    }

    /* renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2, reason: invalid class name */
    class AnonymousClass2 implements b {
        AnonymousClass2() {
        }

        /* renamed from: lambda$onAdClose$1$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6239xfdc28321(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* renamed from: lambda$onAdShow$0$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6240x60546703(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        /* renamed from: lambda$onEndCardShow$5$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6241x214ab4f8(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        /* renamed from: lambda$onLoadSuccess$8$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6242x9d9c83d0(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        /* renamed from: lambda$onShowFail$2$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6243x32c92b40(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        /* renamed from: lambda$onVideoAdClicked$3$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6244xfd99df4f(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        /* renamed from: lambda$onVideoComplete$4$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6245xe446eba3(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        /* renamed from: lambda$onVideoLoadFail$6$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6246xbf2db0d0(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        /* renamed from: lambda$onVideoLoadSuccess$7$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2, reason: not valid java name */
        /* synthetic */ void m6247x84e3f68c(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6239xfdc28321(mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0, "");
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6240x60546703(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6241x214ab4f8(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6242x9d9c83d0(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6243x32c92b40(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6244xfd99df4f(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6245xe446eba3(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6246xbf2db0d0(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.this.m6247x84e3f68c(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1, "");
        }
    }

    public BaseComponentStrategy(String str, String str2, int i) {
        this.placementId = str;
        this.unitId = str2;
        this.adType = i;
        String str3 = i == 94 ? "rv_init" : i == 287 ? "iv_init" : "";
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(c.a(), str3, null);
        }
        recordTriggerThread();
    }

    private b createInterstitialVideoListener() {
        return new AnonymousClass2();
    }

    private b createRewardVideoListener() {
        return new AnonymousClass1();
    }

    private void sendApiStartMetrics(String str, String str2, Map<String, Object> map) {
        try {
            if (str2.equals("c1") || str2.equals("c2") || str2.equals("c3")) {
                HashMap hashMap = new HashMap();
                hashMap.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, str);
                HashMap hashMap2 = new HashMap(map);
                hashMap2.remove("sdk_context");
                hashMap.put("value", hashMap2);
                com.mbridge.msdk.config.component.common.metrics.b.a(str2.equals("c1") ? "m_pipe_load_start" : str2.equals("c2") ? "m_pipe_show_start" : "m_pipe_isready_start", hashMap);
            }
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
    }

    private void sendReadyEndMetrics(String str, Object obj, long j) {
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            hashMap.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, str);
            hashMap.put("result", Integer.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false ? 1 : 2));
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("placement_id", this.placementId);
            hashMap2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            hashMap2.put("ad_type", Integer.valueOf(this.adType));
            hashMap.put("value", hashMap2);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_isready_end", hashMap);
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
    }

    public void clearBitmapCache() {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    public void clearVideoCache() {
        o0.b();
        sendApiCallEvent(c.a(), "c20", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(c.a(), "c18", null);
        if (a.c().b().b("creativeId") == null) {
            return "";
        }
        Object b = a.c().b().b("creativeId");
        if (!(b instanceof Map)) {
            return "";
        }
        Object obj = ((Map) b).get(this.unitId);
        return obj instanceof String ? (String) obj : "";
    }

    public String getRequestId() {
        sendApiCallEvent(c.a(), "c17", null);
        if (a.c().b().b("requestId") == null) {
            return "";
        }
        Object b = a.c().b().b("requestId");
        return b instanceof String ? (String) b : "";
    }

    protected synchronized boolean isReadyWithSyncWait(boolean z) {
        if (this.isQuerying) {
            return false;
        }
        try {
            try {
                this.isQuerying = true;
                long currentTimeMillis = System.currentTimeMillis();
                com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(aVar);
                HashMap hashMap = new HashMap();
                hashMap.put("callback", b__externalsyntheticlambda0);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("bid_token", TextUtils.isEmpty(this.bidToken) ? "" : this.bidToken);
                hashMap2.put("is_hb", Integer.valueOf(z ? 1 : 0));
                hashMap2.put("sdk_context", hashMap);
                String a2 = c.a();
                sendApiCallEvent(a2, "c3", hashMap2);
                Map map = (Map) aVar.a(a.p);
                this.isQuerying = false;
                if (map != null) {
                    Object obj = map.get("ready_state");
                    sendReadyEndMetrics(a2, obj, System.currentTimeMillis() - currentTimeMillis);
                    if (obj instanceof Boolean) {
                        return ((Boolean) obj).booleanValue();
                    }
                }
                return false;
            } catch (Exception e) {
                q0.b(TAG, "isReadyWithSyncWait error: " + e.getMessage(), e);
                return false;
            }
        } catch (InterruptedException e2) {
            q0.b(TAG, "isReadyWithSyncWait interrupted: " + e2.getMessage(), e2);
            return false;
        }
    }

    public void playVideoMute(int i) {
        this.isSilent = i;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i));
        sendApiCallEvent(c.a(), "c13", null);
    }

    protected void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    protected void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            Map<String, Object> hashMap = new HashMap<>();
            hashMap.put("placement_id", this.placementId);
            hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            hashMap.put("ad_type", Integer.valueOf(this.adType));
            hashMap.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            if (!hashMap.containsKey("sdk_context")) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("callback", this.mComponentCallbackListener);
                hashMap.put("sdk_context", hashMap2);
            }
            a.c().a(str, str2, hashMap);
            sendApiStartMetrics(str, str2, hashMap);
        } catch (Exception e) {
            q0.b(TAG, "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("title", str);
            hashMap.put("content", str2);
            hashMap.put("confirm", str3);
            hashMap.put("cancel", str4);
            this.developerSettingMap.put("dialog_config", hashMap);
            sendApiCallEvent(c.a(), "c14", hashMap);
        } catch (Exception e) {
            q0.b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e.getMessage(), e);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(c.a(), "c16", hashMap);
    }

    public void setIVRewardEnable(int i, int i2) {
        int i3 = i == com.mbridge.msdk.foundation.same.a.H ? 2 : i;
        if (i == com.mbridge.msdk.foundation.same.a.I) {
            i3 = 4;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ivReward_type", Integer.valueOf(i3));
        hashMap.put("ivReward_value", Integer.valueOf(i2));
        this.developerSettingMap.put("iv_reward", hashMap);
        sendApiCallEvent(c.a(), "c19", hashMap);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z) {
        this.isRewardPlusOpen = z;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("reward_plus_open", Boolean.valueOf(z));
        sendApiCallEvent(c.a(), "c15", hashMap);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    protected void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:2:0x0000, B:15:0x0047, B:17:0x004d, B:19:0x0054, B:20:0x005a, B:23:0x0064, B:25:0x0076, B:26:0x007b, B:36:0x0016, B:39:0x0020, B:42:0x002a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendApiEndMetrics(MBridgeIds mBridgeIds, String str, int i, String str2) {
        char c;
        String str3;
        try {
            int hashCode = str.hashCode();
            if (hashCode == -1178337387) {
                if (str.equals("adClose")) {
                    c = 2;
                    String str4 = "";
                    if (c == 0) {
                    }
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                c = 65535;
                String str42 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            } else if (hashCode != 336615957) {
                if (hashCode == 740662650 && str.equals("showResult")) {
                    c = 1;
                    String str422 = "";
                    str3 = c == 0 ? c != 1 ? c != 2 ? "" : "m_pipe_show_close" : "m_pipe_show_result" : "m_pipe_load_end";
                    if (TextUtils.isEmpty(str3)) {
                        HashMap hashMap = new HashMap();
                        String contextId = mBridgeIds != null ? mBridgeIds.getContextId() : "";
                        if (!TextUtils.isEmpty(contextId)) {
                            str422 = contextId;
                        }
                        hashMap.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, str422);
                        hashMap.put("result", Integer.valueOf(i));
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("reason", str2);
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("placement_id", this.placementId);
                        hashMap2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
                        hashMap2.put("ad_type", Integer.valueOf(this.adType));
                        hashMap.put("value", hashMap2);
                        com.mbridge.msdk.config.component.common.metrics.b.a(str3, hashMap);
                        return;
                    }
                    return;
                }
                c = 65535;
                String str4222 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            } else {
                if (str.equals("loadEnd")) {
                    c = 0;
                    String str42222 = "";
                    if (c == 0) {
                    }
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                c = 65535;
                String str422222 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            }
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
        q0.b(TAG, th.getMessage());
    }

    public void setRewardVideoListener(g gVar) {
        this.rewardVideoListener = gVar;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    public void setIVRewardEnable(int i, double d) {
        int i2 = i == com.mbridge.msdk.foundation.same.a.H ? 1 : i;
        if (i == com.mbridge.msdk.foundation.same.a.I) {
            i2 = 3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ivReward_type", Integer.valueOf(i2));
        hashMap.put("ivReward_value", Double.valueOf(d));
        this.developerSettingMap.put("iv_reward", hashMap);
        sendApiCallEvent(c.a(), "c19", hashMap);
    }
}
