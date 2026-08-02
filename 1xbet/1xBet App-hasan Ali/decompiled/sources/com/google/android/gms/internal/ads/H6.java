package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum H6 implements OB {
    f9325l("UNSPECIFIED"),
    f9326m("CONNECTING"),
    f9327n("CONNECTED"),
    f9328o("DISCONNECTING"),
    f9329p("DISCONNECTED"),
    f9330q("SUSPENDED");


    /* renamed from: k, reason: collision with root package name */
    public final int f9332k;

    H6(String str) {
        this.f9332k = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9332k);
    }
}
