package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C1338c(18);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11490b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11491c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11492d;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        D.i(bArr);
        this.f11489a = bArr;
        D.i(str);
        this.f11490b = str;
        this.f11491c = str2;
        D.i(str3);
        this.f11492d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.f11489a, publicKeyCredentialUserEntity.f11489a) && D.m(this.f11490b, publicKeyCredentialUserEntity.f11490b) && D.m(this.f11491c, publicKeyCredentialUserEntity.f11491c) && D.m(this.f11492d, publicKeyCredentialUserEntity.f11492d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11489a, this.f11490b, this.f11491c, this.f11492d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.l0(parcel, 2, this.f11489a, false);
        Y4.D.s0(parcel, 3, this.f11490b, false);
        Y4.D.s0(parcel, 4, this.f11491c, false);
        Y4.D.s0(parcel, 5, this.f11492d, false);
        Y4.D.z0(x02, parcel);
    }
}
