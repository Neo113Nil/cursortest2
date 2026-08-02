package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;

/* loaded from: classes2.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new E(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f11877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11879c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11880d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11881e;

    public PhoneAuthCredential(String str, String str2, String str3, boolean z4, String str4) {
        D.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f11877a = str;
        this.f11878b = str2;
        this.f11879c = str3;
        this.f11880d = z4;
        this.f11881e = str4;
    }

    public static PhoneAuthCredential n(String str, String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    public final Object clone() {
        return new PhoneAuthCredential(this.f11877a, this.f11878b, this.f11879c, this.f11880d, this.f11881e);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return (PhoneAuthCredential) clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11877a, false);
        Y4.D.s0(parcel, 2, this.f11878b, false);
        Y4.D.s0(parcel, 4, this.f11879c, false);
        boolean z4 = this.f11880d;
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Y4.D.s0(parcel, 6, this.f11881e, false);
        Y4.D.z0(x02, parcel);
    }
}
