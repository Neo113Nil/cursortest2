package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* loaded from: classes2.dex */
public class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new E(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f11951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11953c;

    /* renamed from: d, reason: collision with root package name */
    public final zzahr f11954d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11955e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11956f;

    /* renamed from: x, reason: collision with root package name */
    public final String f11957x;

    public zze(String str, String str2, String str3, zzahr zzahrVar, String str4, String str5, String str6) {
        this.f11951a = zzag.zzb(str);
        this.f11952b = str2;
        this.f11953c = str3;
        this.f11954d = zzahrVar;
        this.f11955e = str4;
        this.f11956f = str5;
        this.f11957x = str6;
    }

    public static zze n(zzahr zzahrVar) {
        D.j(zzahrVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzahrVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return this.f11951a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return this.f11951a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new zze(this.f11951a, this.f11952b, this.f11953c, this.f11954d, this.f11955e, this.f11956f, this.f11957x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11951a, false);
        Y4.D.s0(parcel, 2, this.f11952b, false);
        Y4.D.s0(parcel, 3, this.f11953c, false);
        Y4.D.r0(parcel, 4, this.f11954d, i7, false);
        Y4.D.s0(parcel, 5, this.f11955e, false);
        Y4.D.s0(parcel, 6, this.f11956f, false);
        Y4.D.s0(parcel, 7, this.f11957x, false);
        Y4.D.z0(x02, parcel);
    }
}
