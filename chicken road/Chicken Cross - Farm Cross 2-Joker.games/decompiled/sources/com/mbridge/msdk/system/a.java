package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.controller.d;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BaseMBridgeSDK.java */
/* loaded from: classes6.dex */
public abstract class a implements MBridgeSDK {
    protected static final String LOG_TAG = "com.mbridge.msdk";
    public static Map<String, Object> componentParams = new HashMap();
    public static Map<String, String> map;
    private com.mbridge.msdk.system.b mBridgeSDKImplDiff;
    protected volatile Context mContext;
    protected SDKInitStatusListener mStatusListener;
    protected volatile AtomicBoolean sdkInited;
    public boolean isCoolStart = true;
    protected volatile MBridgeSDK.PLUGIN_LOAD_STATUS STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;
    protected boolean initCallbacked = false;
    protected boolean isRegisteredLifeCycle = false;
    protected volatile boolean isMIMinited = false;
    protected volatile boolean isInitStarted = false;
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new C1438a();

    /* compiled from: BaseMBridgeSDK.java */
    /* renamed from: com.mbridge.msdk.system.a$a, reason: collision with other inner class name */
    class C1438a implements Application.ActivityLifecycleCallbacks {
        C1438a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (a.this.isMIMinited) {
                MIMManager.b().f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (a.this.isMIMinited) {
                MIMManager.b().g();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            q0.b("com.mbridge.msdk", "onActivityPaused currentActivityNum:" + c.n().g());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int g = c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStarted currentActivityNum:" + g);
            q0.b("com.mbridge.msdk", "onActivityStarted isCoolStart:" + a.this.isCoolStart);
            if (!a.this.isCoolStart && g == 0) {
                j.a("1");
            }
            if (a.this.mBridgeSDKImplDiff != null) {
                com.mbridge.msdk.system.b bVar = a.this.mBridgeSDKImplDiff;
                a aVar = a.this;
                bVar.a(activity, g, aVar.isCoolStart, aVar.mContext);
            }
            a.this.isCoolStart = false;
            c.n().a(g + 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int g = c.n().g();
            q0.b("com.mbridge.msdk", "onActivityStopped currentActivityNum:" + g);
            if (g == 1 || g == 0) {
                j.a("2");
            }
            c.n().a(g - 1);
        }
    }

    /* compiled from: BaseMBridgeSDK.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9863a;
        final /* synthetic */ String b;

        b(boolean z, String str) {
            this.f9863a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKInitStatusListener sDKInitStatusListener = a.this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (this.f9863a) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(this.b);
                }
            }
        }
    }

    private void callbackToDeveloper(boolean z, long j, boolean z2, String str) {
        this.isInitStarted = false;
        if (z) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b(z2, str));
        } else {
            SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (z2) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(str);
                }
            }
        }
        j.a(z2, j, str);
    }

    private void initMIMManager() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                return;
            }
            this.isMIMinited = true;
            MIMManager.b().b(this.mContext.getApplicationContext());
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    static /* synthetic */ void lambda$registerActivityLifecycleListener$3(com.mbridge.msdk.config.component.base.b bVar) {
        String c = bVar.c();
        c.hashCode();
        if (c.equals("916003")) {
            j.a("1");
        } else if (c.equals("916004")) {
            j.a("2");
        }
    }

    private void sendApiCallEvent(String str, String str2) {
        if (this.mContext != null && com.mbridge.msdk.config.manager.a.c().d()) {
            com.mbridge.msdk.config.manager.a.c().a(str, str2, componentParams);
        }
    }

    private void setDefaultComponentValue() {
        try {
            if (!componentParams.containsKey("allow_acquire_id")) {
                componentParams.put("allow_acquire_id", 1);
            }
            if (!componentParams.containsKey("allow_transfer_ids_if_limit")) {
                componentParams.put("allow_transfer_ids_if_limit", 1);
            }
            if (!componentParams.containsKey("consent_status")) {
                componentParams.put("consent_status", 3);
            }
            if (!componentParams.containsKey("do_not_track")) {
                componentParams.put("do_not_track", 0);
            }
            if (!componentParams.containsKey(COPPA.COPPA_STANDARD)) {
                componentParams.put(COPPA.COPPA_STANDARD, 0);
            }
            if (componentParams.containsKey("channel")) {
                return;
            }
            componentParams.put("channel", Aa.a());
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    private void unregisterActivityLifecycleListener(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (!this.isRegisteredLifeCycle || (activityLifecycleCallbacks = this.activityLifecycleCallbacks) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public void checkAliveContext(Context context) {
        if (c.n().d() != null || context == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
        c.n().b(context);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public boolean getConsentStatus(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.STATUS;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    /* renamed from: lambda$init$0$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m6249lambda$init$0$commbridgemsdksystema(boolean z, long j) {
        try {
            t0.a(this.mContext);
            com.mbridge.msdk.system.b bVar = new com.mbridge.msdk.system.b();
            this.mBridgeSDKImplDiff = bVar;
            bVar.a(map);
            d.a().a(map, this.mContext);
            this.STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            this.mBridgeSDKImplDiff.a(this.mContext);
            f.a().c();
            v0.f();
            initMIMManager();
            g0.a().c();
            this.sdkInited.set(true);
            if (!this.initCallbacked) {
                this.initCallbacked = true;
                callbackToDeveloper(z, System.currentTimeMillis() - j, true, "");
            }
            try {
                e.c().b();
            } catch (Throwable th) {
                q0.b("com.mbridge.msdk", th.getMessage());
            }
            try {
                if (this.mContext instanceof Application) {
                    registerActivityLifecycleListener((Application) this.mContext);
                }
            } catch (Throwable th2) {
                q0.b("com.mbridge.msdk", th2.getMessage());
            }
        } catch (Throwable th3) {
            this.sdkInited.set(false);
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            callbackToDeveloper(z, System.currentTimeMillis() - j, false, th3.getMessage());
        }
    }

    /* renamed from: lambda$init$1$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m6250lambda$init$1$commbridgemsdksystema(boolean z, Map map2) {
        try {
            com.mbridge.msdk.config.manager.a.c().a();
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            Object obj = map2.get("result");
            String valueOf = String.valueOf(map2.get("reason"));
            Object obj2 = map2.get(IronSourceConstants.EVENTS_DURATION);
            if (this.initCallbacked) {
                return;
            }
            boolean z2 = true;
            this.initCallbacked = true;
            long longValue = obj2 != null ? ((Long) obj2).longValue() : 0L;
            if (obj == null || ((Integer) obj).intValue() != 1) {
                z2 = false;
            }
            boolean z3 = z2;
            if (TextUtils.isEmpty(valueOf) || valueOf.equalsIgnoreCase("null")) {
                valueOf = "";
            }
            callbackToDeveloper(z, longValue, z3, valueOf);
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    /* renamed from: lambda$init$2$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m6251lambda$init$2$commbridgemsdksystema(final boolean z) {
        try {
            c.n().b(this.mContext);
            setDefaultComponentValue();
            com.mbridge.msdk.config.manager.callback.a aVar = new com.mbridge.msdk.config.manager.callback.a() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda1
                @Override // com.mbridge.msdk.config.manager.callback.a
                public final void a(Map map2) {
                    a.this.m6250lambda$init$1$commbridgemsdksystema(z, map2);
                }
            };
            com.mbridge.msdk.config.manager.a.c().a(componentParams, aVar);
            com.mbridge.msdk.config.manager.b.a(this.mContext, componentParams, aVar);
            if (componentParams.containsKey("app_id")) {
                Object obj = componentParams.get("app_id");
                Object obj2 = componentParams.get(MBridgeConstans.APP_KEY);
                if (obj instanceof String) {
                    com.mbridge.msdk.config.component.common.util.b.a(this.mContext).b("app_id", String.valueOf(obj));
                    com.mbridge.msdk.config.component.common.util.b.a(this.mContext).b(MBridgeConstans.APP_KEY, String.valueOf(obj2));
                }
            }
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preload(Map<String, Object> map2) {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            d.a().a(map2, 0);
        }
        componentParams.put("preload", map2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c21");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preloadFrame(Map<String, Object> map2) {
        d.a().a(map2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (com.mbridge.msdk.foundation.tools.s0.a().b("c_r_a_l_c", 0) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void registerActivityLifecycleListener(Application application) {
        boolean z;
        try {
            z = false;
        } catch (Exception e) {
            q0.b("com.mbridge.msdk", e.getMessage());
        }
        z = true;
        try {
            com.mbridge.msdk.config.component.status.b bVar = com.mbridge.msdk.foundation.controller.a.s;
            if (bVar != null) {
                bVar.a(new com.mbridge.msdk.config.component.status.a() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda0
                    @Override // com.mbridge.msdk.config.component.status.a
                    public final void a(com.mbridge.msdk.config.component.base.b bVar2) {
                        a.lambda$registerActivityLifecycleListener$3(bVar2);
                    }
                });
                this.isRegisteredLifeCycle = true;
            } else {
                if (application == null || !z) {
                    return;
                }
                application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
                this.isRegisteredLifeCycle = true;
            }
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void release() {
        try {
            if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
                d.a().f();
            }
            if (this.mContext instanceof Application) {
                unregisterActivityLifecycleListener((Application) this.mContext);
            }
            com.mbridge.msdk.system.b bVar = this.mBridgeSDKImplDiff;
            if (bVar != null) {
                bVar.a();
            }
            g0.a().e();
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c24");
            MIMManager.b().i();
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowAcquireIds(boolean z) {
        componentParams.put("allow_acquire_ids", Integer.valueOf(z ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.a(z);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c5");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowTransferIdsIfLimit(boolean z) {
        componentParams.put("allow_transfer_ids_if_limit", Integer.valueOf(z ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.b.b(z);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c25");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, int i) {
        checkAliveContext(context);
        componentParams.put("consent_status", Integer.valueOf(i != 1 ? 2 : 1));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(i);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setCoppaStatus(Context context, boolean z) {
        checkAliveContext(context);
        componentParams.put(COPPA.COPPA_STANDARD, Integer.valueOf(z ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().b(z ? 1 : 2);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c7");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() || developerTransferIdInfo == null || TextUtils.isEmpty(developerTransferIdInfo.getGaid())) {
            return;
        }
        g.a(developerTransferIdInfo.getGaid());
        componentParams.put("developer_gaid", developerTransferIdInfo.getGaid());
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c9");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void setDoNotTrackStatus(boolean z) {
        componentParams.put("do_not_track", Integer.valueOf(z ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setPlayVideoMute(int i, int i2) {
        HashMap hashMap = new HashMap();
        if (i == 94) {
            com.mbridge.msdk.foundation.same.a.Z = i2;
        } else if (i == 287) {
            com.mbridge.msdk.foundation.same.a.a0 = i2;
        }
        hashMap.put("ad_type", Integer.valueOf(i));
        hashMap.put("mute_state", Integer.valueOf(i2));
        componentParams.put("player_video_mute", hashMap);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c12");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setThirdPartyFeatures(Map<String, Object> map2) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setUserPrivateInfoType(Context context, String str, int i) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(str, i);
        try {
            if (componentParams.containsKey("device_info_range_limit")) {
                Object obj = componentParams.get("device_info_range_limit");
                if (obj instanceof Map) {
                    ((Map) obj).put(str, Integer.valueOf(i == 1 ? 1 : 2));
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(str, Integer.valueOf(i == 1 ? 1 : 2));
                componentParams.put("device_info_range_limit", hashMap);
            }
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c11");
        } catch (Throwable th) {
            q0.b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        c.n().a(weakReference);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public AuthorityInfoBean userPrivateInfo(Context context) {
        checkAliveContext(context);
        return com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, boolean z) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        componentParams.put("app_id", str);
        componentParams.put(MBridgeConstans.APP_KEY, str2);
        componentParams.put("wx_app_id", str3);
        componentParams.put("crash_report", String.valueOf(1));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_configuration_map");
        return hashMap;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(Context context, boolean z) {
        checkAliveContext(context);
        componentParams.put("do_not_track", Integer.valueOf(z ? 1 : 2));
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(z ? 1 : 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, (OnCompletionListener) null);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, OnCompletionListener onCompletionListener) {
        checkAliveContext(context);
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().a(context, onCompletionListener);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z) {
        return getMBConfigurationMap(str, str2, "");
    }

    private void init() {
        SDKInitStatusListener sDKInitStatusListener;
        SDKInitStatusListener sDKInitStatusListener2;
        if (this.sdkInited == null) {
            this.sdkInited = new AtomicBoolean(false);
        }
        this.initCallbacked = false;
        try {
            if (this.sdkInited.get() && (sDKInitStatusListener2 = this.mStatusListener) != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener2.onInitSuccess();
                return;
            }
        } catch (Exception e) {
            q0.b("com.mbridge.msdk", e.getMessage());
        }
        if (this.mContext == null && (sDKInitStatusListener = this.mStatusListener) != null) {
            this.initCallbacked = true;
            sDKInitStatusListener.onInitFail("Context can not be null.");
            return;
        }
        if (this.isInitStarted) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean z = Looper.myLooper() == Looper.getMainLooper();
        this.isInitStarted = true;
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.m6249lambda$init$0$commbridgemsdksystema(z, currentTimeMillis);
                }
            };
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.m6251lambda$init$2$commbridgemsdksystema(z);
                }
            });
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnable);
        } catch (Exception e2) {
            q0.b("com.mbridge.msdk", "INIT FAIL", e2);
            if (this.sdkInited != null) {
                this.sdkInited.set(false);
            }
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            callbackToDeveloper(z, System.currentTimeMillis() - currentTimeMillis, false, e2.getMessage());
        }
    }

    public void init(Application application) {
        this.mContext = application.getApplicationContext();
        init();
    }
}
