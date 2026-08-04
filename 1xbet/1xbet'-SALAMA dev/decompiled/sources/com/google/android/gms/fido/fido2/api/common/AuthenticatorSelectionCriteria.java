package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p140t3.b;
import p140t3.i;
import p140t3.k;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new l(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Attachment f11437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f11438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzay f11439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResidentKeyRequirement f11440d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (b | i | k e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f11437a = attachmentA;
        this.f11438b = bool;
        this.f11439c = str2 == null ? null : zzay.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.f11440d = residentKeyRequirementA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return D.m(this.f11437a, authenticatorSelectionCriteria.f11437a) && D.m(this.f11438b, authenticatorSelectionCriteria.f11438b) && D.m(this.f11439c, authenticatorSelectionCriteria.f11439c) && D.m(j(), authenticatorSelectionCriteria.j());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11437a, this.f11438b, this.f11439c, j()});
    }

    public final ResidentKeyRequirement j() {
        ResidentKeyRequirement residentKeyRequirement = this.f11440d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f11438b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Attachment attachment = this.f11437a;
        Y4.D.s0(parcel, 2, attachment == null ? null : attachment.f11407a, false);
        Boolean bool = this.f11438b;
        if (bool != null) {
            Y4.D.B0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        zzay zzayVar = this.f11439c;
        Y4.D.s0(parcel, 4, zzayVar == null ? null : zzayVar.f11510a, false);
        Y4.D.s0(parcel, 5, j() != null ? j().f11495a : null, false);
        Y4.D.z0(iX0, parcel);
    }
}
