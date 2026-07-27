package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum X1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f2712a;

    X1(int i3) {
        this.f2712a = i3;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2712a);
    }
}
