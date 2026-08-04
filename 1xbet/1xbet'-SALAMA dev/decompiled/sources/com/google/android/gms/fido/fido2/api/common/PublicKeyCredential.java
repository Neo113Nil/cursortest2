package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new c(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f11455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f11456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AuthenticatorErrorResponse f11457f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f11458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11459y;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z4 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z4 = false;
        }
        D.b(z4);
        this.f11452a = str;
        this.f11453b = str2;
        this.f11454c = bArr;
        this.f11455d = authenticatorAttestationResponse;
        this.f11456e = authenticatorAssertionResponse;
        this.f11457f = authenticatorErrorResponse;
        this.f11458x = authenticationExtensionsClientOutputs;
        this.f11459y = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return D.m(this.f11452a, publicKeyCredential.f11452a) && D.m(this.f11453b, publicKeyCredential.f11453b) && Arrays.equals(this.f11454c, publicKeyCredential.f11454c) && D.m(this.f11455d, publicKeyCredential.f11455d) && D.m(this.f11456e, publicKeyCredential.f11456e) && D.m(this.f11457f, publicKeyCredential.f11457f) && D.m(this.f11458x, publicKeyCredential.f11458x) && D.m(this.f11459y, publicKeyCredential.f11459y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11452a, this.f11453b, this.f11454c, this.f11456e, this.f11455d, this.f11457f, this.f11458x, this.f11459y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11452a, false);
        Y4.D.s0(parcel, 2, this.f11453b, false);
        Y4.D.l0(parcel, 3, this.f11454c, false);
        Y4.D.r0(parcel, 4, this.f11455d, i7, false);
        Y4.D.r0(parcel, 5, this.f11456e, i7, false);
        Y4.D.r0(parcel, 6, this.f11457f, i7, false);
        Y4.D.r0(parcel, 7, this.f11458x, i7, false);
        Y4.D.s0(parcel, 8, this.f11459y, false);
        Y4.D.z0(iX0, parcel);
    }
}
