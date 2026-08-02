package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzbc;
import java.util.ArrayList;
import java.util.Arrays;
import k3.C1338c;
import t3.g;

/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f11471a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11472b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11473c;

    static {
        zzbc.zzk(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
        CREATOR = new C1338c(13);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        D.i(str);
        try {
            this.f11471a = PublicKeyCredentialType.a(str);
            D.i(bArr);
            this.f11472b = bArr;
            this.f11473c = arrayList;
        } catch (g e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f11471a.equals(publicKeyCredentialDescriptor.f11471a) || !Arrays.equals(this.f11472b, publicKeyCredentialDescriptor.f11472b)) {
            return false;
        }
        ArrayList arrayList = this.f11473c;
        ArrayList arrayList2 = publicKeyCredentialDescriptor.f11473c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11471a, Integer.valueOf(Arrays.hashCode(this.f11472b)), this.f11473c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        this.f11471a.getClass();
        Y4.D.s0(parcel, 2, "public-key", false);
        Y4.D.l0(parcel, 3, this.f11472b, false);
        Y4.D.w0(parcel, 4, this.f11473c, false);
        Y4.D.z0(x02, parcel);
    }
}
