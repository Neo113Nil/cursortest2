package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new c(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11487c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        D.i(str);
        this.f11485a = str;
        D.i(str2);
        this.f11486b = str2;
        this.f11487c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return D.m(this.f11485a, publicKeyCredentialRpEntity.f11485a) && D.m(this.f11486b, publicKeyCredentialRpEntity.f11486b) && D.m(this.f11487c, publicKeyCredentialRpEntity.f11487c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11485a, this.f11486b, this.f11487c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 2, this.f11485a, false);
        Y4.D.s0(parcel, 3, this.f11486b, false);
        Y4.D.s0(parcel, 4, this.f11487c, false);
        Y4.D.z0(iX0, parcel);
    }
}
