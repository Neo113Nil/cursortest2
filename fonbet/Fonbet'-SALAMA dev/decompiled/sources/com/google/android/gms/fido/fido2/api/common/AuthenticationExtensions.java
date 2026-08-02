package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new C1338c(27);

    /* renamed from: A, reason: collision with root package name */
    public final zzai f11410A;

    /* renamed from: a, reason: collision with root package name */
    public final FidoAppIdExtension f11411a;

    /* renamed from: b, reason: collision with root package name */
    public final zzs f11412b;

    /* renamed from: c, reason: collision with root package name */
    public final UserVerificationMethodExtension f11413c;

    /* renamed from: d, reason: collision with root package name */
    public final zzz f11414d;

    /* renamed from: e, reason: collision with root package name */
    public final zzab f11415e;

    /* renamed from: f, reason: collision with root package name */
    public final zzad f11416f;

    /* renamed from: x, reason: collision with root package name */
    public final zzu f11417x;

    /* renamed from: y, reason: collision with root package name */
    public final zzag f11418y;

    /* renamed from: z, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f11419z;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.f11411a = fidoAppIdExtension;
        this.f11413c = userVerificationMethodExtension;
        this.f11412b = zzsVar;
        this.f11414d = zzzVar;
        this.f11415e = zzabVar;
        this.f11416f = zzadVar;
        this.f11417x = zzuVar;
        this.f11418y = zzagVar;
        this.f11419z = googleThirdPartyPaymentExtension;
        this.f11410A = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return D.m(this.f11411a, authenticationExtensions.f11411a) && D.m(this.f11412b, authenticationExtensions.f11412b) && D.m(this.f11413c, authenticationExtensions.f11413c) && D.m(this.f11414d, authenticationExtensions.f11414d) && D.m(this.f11415e, authenticationExtensions.f11415e) && D.m(this.f11416f, authenticationExtensions.f11416f) && D.m(this.f11417x, authenticationExtensions.f11417x) && D.m(this.f11418y, authenticationExtensions.f11418y) && D.m(this.f11419z, authenticationExtensions.f11419z) && D.m(this.f11410A, authenticationExtensions.f11410A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11411a, this.f11412b, this.f11413c, this.f11414d, this.f11415e, this.f11416f, this.f11417x, this.f11418y, this.f11419z, this.f11410A});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 2, this.f11411a, i7, false);
        Y4.D.r0(parcel, 3, this.f11412b, i7, false);
        Y4.D.r0(parcel, 4, this.f11413c, i7, false);
        Y4.D.r0(parcel, 5, this.f11414d, i7, false);
        Y4.D.r0(parcel, 6, this.f11415e, i7, false);
        Y4.D.r0(parcel, 7, this.f11416f, i7, false);
        Y4.D.r0(parcel, 8, this.f11417x, i7, false);
        Y4.D.r0(parcel, 9, this.f11418y, i7, false);
        Y4.D.r0(parcel, 10, this.f11419z, i7, false);
        Y4.D.r0(parcel, 11, this.f11410A, i7, false);
        Y4.D.z0(x02, parcel);
    }
}
