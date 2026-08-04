package com.google.android.gms.auth.api.credentials;

import Z2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CredentialPickerConfig f10932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f10935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10936f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10938y;

    public HintRequest(int i7, CredentialPickerConfig credentialPickerConfig, boolean z4, boolean z7, String[] strArr, boolean z8, String str, String str2) {
        this.f10931a = i7;
        D.i(credentialPickerConfig);
        this.f10932b = credentialPickerConfig;
        this.f10933c = z4;
        this.f10934d = z7;
        D.i(strArr);
        this.f10935e = strArr;
        if (i7 < 2) {
            this.f10936f = true;
            this.f10937x = null;
            this.f10938y = null;
        } else {
            this.f10936f = z8;
            this.f10937x = str;
            this.f10938y = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10932b, i7, false);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10933c ? 1 : 0);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10934d ? 1 : 0);
        Y4.D.t0(parcel, 4, this.f10935e, false);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10936f ? 1 : 0);
        Y4.D.s0(parcel, 6, this.f10937x, false);
        Y4.D.s0(parcel, 7, this.f10938y, false);
        Y4.D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(this.f10931a);
        Y4.D.z0(iX0, parcel);
    }
}
