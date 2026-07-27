package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(ToggleObserver toggleObserver, boolean z3);

    void removeObserver(ToggleObserver toggleObserver);
}
