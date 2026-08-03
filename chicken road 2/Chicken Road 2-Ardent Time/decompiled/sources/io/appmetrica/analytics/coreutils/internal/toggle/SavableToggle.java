package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes.dex */
public final class SavableToggle extends io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle implements io.appmetrica.analytics.coreapi.internal.data.Updatable<java.lang.Boolean> {

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.data.Savable f3803d;

    public SavableToggle(java.lang.String str, io.appmetrica.analytics.coreapi.internal.data.Savable<java.lang.Boolean> savable) {
        super(savable.getValue().booleanValue(), "[SavableToggle - " + str + ']');
        this.f3803d = savable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Updatable
    public /* bridge */ /* synthetic */ void update(java.lang.Boolean bool) {
        update(bool.booleanValue());
    }

    public void update(boolean z2) {
        updateState(z2);
        this.f3803d.setValue(java.lang.Boolean.valueOf(getActualState()));
    }
}
