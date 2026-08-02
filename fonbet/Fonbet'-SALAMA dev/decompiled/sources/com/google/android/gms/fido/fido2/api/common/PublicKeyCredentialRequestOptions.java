package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import k3.C1338c;
import t3.k;

/* loaded from: classes.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new C1338c(15);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11476a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f11477b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11478c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11479d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f11480e;

    /* renamed from: f, reason: collision with root package name */
    public final TokenBinding f11481f;

    /* renamed from: x, reason: collision with root package name */
    public final zzay f11482x;

    /* renamed from: y, reason: collision with root package name */
    public final AuthenticationExtensions f11483y;

    /* renamed from: z, reason: collision with root package name */
    public final Long f11484z;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d7, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l7) {
        D.i(bArr);
        this.f11476a = bArr;
        this.f11477b = d7;
        D.i(str);
        this.f11478c = str;
        this.f11479d = arrayList;
        this.f11480e = num;
        this.f11481f = tokenBinding;
        this.f11484z = l7;
        if (str2 != null) {
            try {
                this.f11482x = zzay.a(str2);
            } catch (k e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f11482x = null;
        }
        this.f11483y = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (Arrays.equals(this.f11476a, publicKeyCredentialRequestOptions.f11476a) && D.m(this.f11477b, publicKeyCredentialRequestOptions.f11477b) && D.m(this.f11478c, publicKeyCredentialRequestOptions.f11478c)) {
            ArrayList arrayList = this.f11479d;
            ArrayList arrayList2 = publicKeyCredentialRequestOptions.f11479d;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && D.m(this.f11480e, publicKeyCredentialRequestOptions.f11480e) && D.m(this.f11481f, publicKeyCredentialRequestOptions.f11481f) && D.m(this.f11482x, publicKeyCredentialRequestOptions.f11482x) && D.m(this.f11483y, publicKeyCredentialRequestOptions.f11483y) && D.m(this.f11484z, publicKeyCredentialRequestOptions.f11484z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f11476a)), this.f11477b, this.f11478c, this.f11479d, this.f11480e, this.f11481f, this.f11482x, this.f11483y, this.f11484z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.l0(parcel, 2, this.f11476a, false);
        Y4.D.m0(parcel, 3, this.f11477b);
        Y4.D.s0(parcel, 4, this.f11478c, false);
        Y4.D.w0(parcel, 5, this.f11479d, false);
        Y4.D.p0(parcel, 6, this.f11480e);
        Y4.D.r0(parcel, 7, this.f11481f, i7, false);
        zzay zzayVar = this.f11482x;
        Y4.D.s0(parcel, 8, zzayVar == null ? null : zzayVar.f11510a, false);
        Y4.D.r0(parcel, 9, this.f11483y, i7, false);
        Y4.D.q0(parcel, 10, this.f11484z);
        Y4.D.z0(x02, parcel);
    }
}
