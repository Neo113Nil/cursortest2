package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import c3.AbstractC0539a;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0702Vb extends E5 implements InterfaceC1429pd {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0539a f11883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0702Vb(AbstractC0539a abstractC0539a) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f11883k = abstractC0539a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1429pd
    public final void E(String str) {
        this.f11883k.a(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1429pd
    public final void s1(String str, String str2, Bundle bundle) {
        this.f11883k.b(new A0.J0(new H3.e(str)));
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            F5.b(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            F5.b(parcel);
            E(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
            F5.b(parcel);
            s1(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
