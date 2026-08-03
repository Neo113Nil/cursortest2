package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver, boolean z2);

    void removeObserver(io.appmetrica.analytics.coreapi.internal.control.ToggleObserver toggleObserver);
}
