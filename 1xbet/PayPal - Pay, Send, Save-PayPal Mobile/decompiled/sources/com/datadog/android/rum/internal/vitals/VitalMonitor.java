package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "Lcom/datadog/android/rum/internal/vitals/VitalObserver;", "", "getLastSample", "()D", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "register", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "unregister"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VitalMonitor extends com.datadog.android.rum.internal.vitals.VitalObserver {
    double getLastSample();

    void register(com.datadog.android.rum.internal.vitals.VitalListener listener);

    void unregister(com.datadog.android.rum.internal.vitals.VitalListener listener);
}
