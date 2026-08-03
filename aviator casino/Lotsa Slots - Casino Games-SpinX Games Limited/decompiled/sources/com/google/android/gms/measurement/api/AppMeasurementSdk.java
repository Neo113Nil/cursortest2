package com.google.android.gms.measurement.api;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
public class AppMeasurementSdk {
    private final com.google.android.gms.internal.measurement.zzfb zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
    public static final class ConditionalUserProperty {
        public static final java.lang.String ACTIVE = "active";
        public static final java.lang.String CREATION_TIMESTAMP = "creation_timestamp";
        public static final java.lang.String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final java.lang.String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final java.lang.String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final java.lang.String TIME_TO_LIVE = "time_to_live";
        public static final java.lang.String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final java.lang.String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final java.lang.String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final java.lang.String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final java.lang.String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final java.lang.String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzjo {
        @Override // com.google.android.gms.measurement.internal.zzjo
        void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzjp {
        @Override // com.google.android.gms.measurement.internal.zzjp
        void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    public AppMeasurementSdk(com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context context) {
        return com.google.android.gms.internal.measurement.zzfb.zza(context, null).zzb();
    }

    public void beginAdUnitExposure(java.lang.String str) {
        this.zza.zzu(str);
    }

    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzm(str, str2, bundle);
    }

    public void endAdUnitExposure(java.lang.String str) {
        this.zza.zzv(str);
    }

    public long generateEventId() {
        return this.zza.zzz();
    }

    public java.lang.String getAppIdOrigin() {
        return this.zza.zzI();
    }

    public java.lang.String getAppInstanceId() {
        return this.zza.zzy();
    }

    public java.util.List<android.os.Bundle> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        return this.zza.zzn(str, str2);
    }

    public java.lang.String getCurrentScreenClass() {
        return this.zza.zzB();
    }

    public java.lang.String getCurrentScreenName() {
        return this.zza.zzA();
    }

    public java.lang.String getGmpAppId() {
        return this.zza.zzx();
    }

    public int getMaxUserProperties(java.lang.String str) {
        return this.zza.zzF(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zza.zzC(str, str2, z);
    }

    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzi(str, str2, bundle);
    }

    public void logEventNoInterceptor(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.zzj(str, str2, bundle, j);
    }

    public void performAction(android.os.Bundle bundle) {
        this.zza.zzE(bundle, false);
    }

    public android.os.Bundle performActionWithResponse(android.os.Bundle bundle) {
        return this.zza.zzE(bundle, true);
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener onEventListener) {
        this.zza.zzf(onEventListener);
    }

    public void setConditionalUserProperty(android.os.Bundle bundle) {
        this.zza.zzl(bundle);
    }

    @java.lang.Deprecated
    public void setConsent(android.os.Bundle bundle) {
    }

    public void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.zza.zzp(com.google.android.gms.internal.measurement.zzdf.zza(activity), str, str2);
    }

    public void setEventInterceptor(com.google.android.gms.measurement.api.AppMeasurementSdk.EventInterceptor eventInterceptor) {
        this.zza.zzd(eventInterceptor);
    }

    @java.lang.Deprecated
    public void setMeasurementEnabled(java.lang.Boolean bool) {
    }

    @java.lang.Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    public void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.zza.zzk(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener onEventListener) {
        this.zza.zzg(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzK(z);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        return com.google.android.gms.internal.measurement.zzfb.zza(context, bundle).zzb();
    }
}
