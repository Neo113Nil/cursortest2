package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import k3.C1338c;
import t3.c;

/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C1338c(11);

    /* renamed from: A, reason: collision with root package name */
    public final AttestationConveyancePreference f11460A;

    /* renamed from: B, reason: collision with root package name */
    public final AuthenticationExtensions f11461B;

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRpEntity f11462a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicKeyCredentialUserEntity f11463b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11464c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11465d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f11466e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11467f;

    /* renamed from: x, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f11468x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f11469y;

    /* renamed from: z, reason: collision with root package name */
    public final TokenBinding f11470z;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d7, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        D.i(publicKeyCredentialRpEntity);
        this.f11462a = publicKeyCredentialRpEntity;
        D.i(publicKeyCredentialUserEntity);
        this.f11463b = publicKeyCredentialUserEntity;
        D.i(bArr);
        this.f11464c = bArr;
        D.i(arrayList);
        this.f11465d = arrayList;
        this.f11466e = d7;
        this.f11467f = arrayList2;
        this.f11468x = authenticatorSelectionCriteria;
        this.f11469y = num;
        this.f11470z = tokenBinding;
        if (str != null) {
            try {
                this.f11460A = AttestationConveyancePreference.a(str);
            } catch (c e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f11460A = null;
        }
        this.f11461B = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (D.m(this.f11462a, publicKeyCredentialCreationOptions.f11462a) && D.m(this.f11463b, publicKeyCredentialCreationOptions.f11463b) && Arrays.equals(this.f11464c, publicKeyCredentialCreationOptions.f11464c) && D.m(this.f11466e, publicKeyCredentialCreationOptions.f11466e)) {
            ArrayList arrayList = this.f11465d;
            ArrayList arrayList2 = publicKeyCredentialCreationOptions.f11465d;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f11467f;
                ArrayList arrayList4 = publicKeyCredentialCreationOptions.f11467f;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && D.m(this.f11468x, publicKeyCredentialCreationOptions.f11468x) && D.m(this.f11469y, publicKeyCredentialCreationOptions.f11469y) && D.m(this.f11470z, publicKeyCredentialCreationOptions.f11470z) && D.m(this.f11460A, publicKeyCredentialCreationOptions.f11460A) && D.m(this.f11461B, publicKeyCredentialCreationOptions.f11461B)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11462a, this.f11463b, Integer.valueOf(Arrays.hashCode(this.f11464c)), this.f11465d, this.f11466e, this.f11467f, this.f11468x, this.f11469y, this.f11470z, this.f11460A, this.f11461B});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 2, this.f11462a, i7, false);
        Y4.D.r0(parcel, 3, this.f11463b, i7, false);
        Y4.D.l0(parcel, 4, this.f11464c, false);
        Y4.D.w0(parcel, 5, this.f11465d, false);
        Y4.D.m0(parcel, 6, this.f11466e);
        Y4.D.w0(parcel, 7, this.f11467f, false);
        Y4.D.r0(parcel, 8, this.f11468x, i7, false);
        Y4.D.p0(parcel, 9, this.f11469y);
        Y4.D.r0(parcel, 10, this.f11470z, i7, false);
        AttestationConveyancePreference attestationConveyancePreference = this.f11460A;
        Y4.D.s0(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.f11409a, false);
        Y4.D.r0(parcel, 12, this.f11461B, i7, false);
        Y4.D.z0(x02, parcel);
    }
}
