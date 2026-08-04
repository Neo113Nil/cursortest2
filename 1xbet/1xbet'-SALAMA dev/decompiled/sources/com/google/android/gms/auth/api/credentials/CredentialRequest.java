package com.google.android.gms.auth.api.credentials;

import Z2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f10924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CredentialPickerConfig f10925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CredentialPickerConfig f10926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10927f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10929y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10930z;

    public CredentialRequest(int i7, boolean z4, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z7, String str, String str2, boolean z8) {
        this.f10922a = i7;
        this.f10923b = z4;
        D.i(strArr);
        this.f10924c = strArr;
        this.f10925d = credentialPickerConfig == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig;
        this.f10926e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig2;
        if (i7 < 3) {
            this.f10927f = true;
            this.f10928x = null;
            this.f10929y = null;
        } else {
            this.f10927f = z7;
            this.f10928x = str;
            this.f10929y = str2;
        }
        this.f10930z = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10923b ? 1 : 0);
        Y4.D.t0(parcel, 2, this.f10924c, false);
        Y4.D.r0(parcel, 3, this.f10925d, i7, false);
        Y4.D.r0(parcel, 4, this.f10926e, i7, false);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10927f ? 1 : 0);
        Y4.D.s0(parcel, 6, this.f10928x, false);
        Y4.D.s0(parcel, 7, this.f10929y, false);
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(this.f10930z ? 1 : 0);
        Y4.D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(this.f10922a);
        Y4.D.z0(iX0, parcel);
    }
}
