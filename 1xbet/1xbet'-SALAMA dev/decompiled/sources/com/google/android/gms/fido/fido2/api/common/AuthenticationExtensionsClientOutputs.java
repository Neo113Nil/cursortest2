package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new c(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UvmEntries f11420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzf f11421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f11422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzh f11423d;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.f11420a = uvmEntries;
        this.f11421b = zzfVar;
        this.f11422c = authenticationExtensionsCredPropsOutputs;
        this.f11423d = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return D.m(this.f11420a, authenticationExtensionsClientOutputs.f11420a) && D.m(this.f11421b, authenticationExtensionsClientOutputs.f11421b) && D.m(this.f11422c, authenticationExtensionsClientOutputs.f11422c) && D.m(this.f11423d, authenticationExtensionsClientOutputs.f11423d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11420a, this.f11421b, this.f11422c, this.f11423d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f11420a, i7, false);
        Y4.D.r0(parcel, 2, this.f11421b, i7, false);
        Y4.D.r0(parcel, 3, this.f11422c, i7, false);
        Y4.D.r0(parcel, 4, this.f11423d, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
