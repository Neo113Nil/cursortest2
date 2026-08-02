package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0864cu extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final A0.J0 f13059k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0908du f13060l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0864cu(C0908du c0908du, A0.J0 j02) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f13060l = c0908du;
        this.f13059k = j02;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        C0802bc c0802bc;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) F5.a(parcel, Bundle.CREATOR);
        F5.b(parcel);
        int i5 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        this.f13059k.x(new Zt(string, i5));
        if (i5 == 8157 && (c0802bc = this.f13060l.f13200a) != null) {
            C0908du.f13198c.c("unbind LMD display overlay service", new Object[0]);
            c0802bc.l(new RunnableC1303mm(15, c0802bc));
        }
        return true;
    }
}
