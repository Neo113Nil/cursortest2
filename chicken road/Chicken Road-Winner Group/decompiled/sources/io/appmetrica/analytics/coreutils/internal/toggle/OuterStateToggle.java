package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z3, String str) {
        super(z3, str);
    }

    public final void update(boolean z3) {
        updateState(z3);
    }
}
