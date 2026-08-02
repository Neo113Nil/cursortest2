package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;
import t3.d;
import t3.g;

/* loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C1338c(14);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f11474a;

    /* renamed from: b, reason: collision with root package name */
    public final COSEAlgorithmIdentifier f11475b;

    public PublicKeyCredentialParameters(String str, int i7) {
        D.i(str);
        try {
            this.f11474a = PublicKeyCredentialType.a(str);
            try {
                this.f11475b = COSEAlgorithmIdentifier.a(i7);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (g e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f11474a.equals(publicKeyCredentialParameters.f11474a) && this.f11475b.equals(publicKeyCredentialParameters.f11475b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11474a, this.f11475b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, t3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        this.f11474a.getClass();
        Y4.D.s0(parcel, 2, "public-key", false);
        Y4.D.p0(parcel, 3, Integer.valueOf(this.f11475b.f11447a.a()));
        Y4.D.z0(x02, parcel);
    }
}
