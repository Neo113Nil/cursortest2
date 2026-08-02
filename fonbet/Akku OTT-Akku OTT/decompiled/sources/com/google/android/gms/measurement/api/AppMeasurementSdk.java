package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class AppMeasurementSdk {
    private final zzfb zza;

    public static final class ConditionalUserProperty {

        @NonNull
        public static final String ACTIVE = "active";

        @NonNull
        public static final String CREATION_TIMESTAMP = "creation_timestamp";

        @NonNull
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";

        @NonNull
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";

        @NonNull
        public static final String NAME = "name";

        @NonNull
        public static final String ORIGIN = "origin";

        @NonNull
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";

        @NonNull
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";

        @NonNull
        public static final String TIME_TO_LIVE = "time_to_live";

        @NonNull
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";

        @NonNull
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";

        @NonNull
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";

        @NonNull
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";

        @NonNull
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";

        @NonNull
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    public interface EventInterceptor extends zzjp {
        @Override // com.google.android.gms.measurement.internal.zzjp
        @WorkerThread
        void interceptEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j);
    }

    public interface OnEventListener extends zzjq {
        @Override // com.google.android.gms.measurement.internal.zzjq
        @WorkerThread
        void onEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return zzfb.zza(context, null).zzb();
    }

    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.zza.zzu(str);
    }

    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.zzm(str, str2, bundle);
    }

    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.zza.zzv(str);
    }

    public long generateEventId() {
        return this.zza.zzz();
    }

    @Nullable
    public String getAppIdOrigin() {
        return this.zza.zzI();
    }

    @Nullable
    public String getAppInstanceId() {
        return this.zza.zzy();
    }

    @NonNull
    @WorkerThread
    public List<Bundle> getConditionalUserProperties(@Nullable String str, @Nullable @Size(max = 23, min = 1) String str2) {
        return this.zza.zzn(str, str2);
    }

    @Nullable
    public String getCurrentScreenClass() {
        return this.zza.zzB();
    }

    @Nullable
    public String getCurrentScreenName() {
        return this.zza.zzA();
    }

    @Nullable
    public String getGmpAppId() {
        return this.zza.zzx();
    }

    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.zza.zzF(str);
    }

    @NonNull
    @WorkerThread
    public Map<String, Object> getUserProperties(@Nullable String str, @Nullable @Size(max = 24, min = 1) String str2, boolean z) {
        return this.zza.zzC(str, str2, z);
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        this.zza.zzi(str, str2, bundle);
    }

    public void logEventNoInterceptor(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza.zzj(str, str2, bundle, j);
    }

    public void performAction(@NonNull Bundle bundle) {
        this.zza.zzE(bundle, false);
    }

    @Nullable
    public Bundle performActionWithResponse(@NonNull Bundle bundle) {
        return this.zza.zzE(bundle, true);
    }

    public void registerOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zza.zzf(onEventListener);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle) {
        this.zza.zzl(bundle);
    }

    @Deprecated
    public void setConsent(@NonNull Bundle bundle) {
    }

    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.zza.zzp(zzdf.zza(activity), str, str2);
    }

    @WorkerThread
    public void setEventInterceptor(@NonNull EventInterceptor eventInterceptor) {
        this.zza.zzd(eventInterceptor);
    }

    @Deprecated
    public void setMeasurementEnabled(@Nullable Boolean bool) {
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.zza.zzk(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zza.zzg(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzK(z);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Deprecated
    public static AppMeasurementSdk getInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Bundle bundle) {
        return zzfb.zza(context, bundle).zzb();
    }
}
