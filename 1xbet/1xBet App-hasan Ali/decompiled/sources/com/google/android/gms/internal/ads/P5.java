package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class P5 extends E5 implements Q2.Q {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11064l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final K2.d f11065k;

    public P5(K2.d dVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f11065k = dVar;
    }

    @Override // Q2.Q
    public final void T1(String str, String str2) {
        this.f11065k.w(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        F5.b(parcel);
        T1(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
