package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.f02;
import p000.hm1;
import p000.oa2;
import p000.p80;
import p000.tu1;
import p000.w22;
import p000.wv1;
import p000.xt1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f1345b;

    /* JADX INFO: renamed from: a */
    public final tu1 f1346a;

    /* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(f02 f02Var) {
        this.f1346a = new hm1(f02Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f1345b == null) {
            synchronized (AppMeasurement.class) {
                if (f1345b == null) {
                    w22 w22Var = (w22) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (w22Var != null) {
                        f1345b = new AppMeasurement(w22Var);
                    } else {
                        f1345b = new AppMeasurement(f02.m1561s(context, new wv1(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return f1345b;
    }

    public void beginAdUnitExposure(String str) {
        this.f1346a.mo2308o(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f1346a.mo2299f(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f1346a.mo2305l(str);
    }

    public long generateEventId() {
        return this.f1346a.mo2296c();
    }

    public String getAppInstanceId() {
        return this.f1346a.mo2304k();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo2301h = this.f1346a.mo2301h(str, str2);
        ArrayList arrayList = new ArrayList(listMo2301h == null ? 0 : listMo2301h.size());
        for (Bundle bundle : listMo2301h) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            p80.m3863h(bundle);
            conditionalUserProperty.mAppId = (String) oa2.m3663j(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) oa2.m3663j(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) oa2.m3663j(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = oa2.m3663j(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) oa2.m3663j(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) oa2.m3663j(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) oa2.m3663j(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) oa2.m3663j(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) oa2.m3663j(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) oa2.m3663j(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) oa2.m3663j(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) oa2.m3663j(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) oa2.m3663j(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) oa2.m3663j(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) oa2.m3663j(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) oa2.m3663j(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f1346a.mo2300g();
    }

    public String getCurrentScreenName() {
        return this.f1346a.mo2297d();
    }

    public String getGmpAppId() {
        return this.f1346a.mo2306m();
    }

    public int getMaxUserProperties(String str) {
        return this.f1346a.mo2303j(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f1346a.mo2307n(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f1346a.mo2298e(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        p80.m3863h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            oa2.m3662i(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f1346a.mo2302i(bundle);
    }

    public AppMeasurement(w22 w22Var) {
        this.f1346a = new xt1(w22Var);
    }
}
