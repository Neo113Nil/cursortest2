package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import p042f4.C0895d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx implements AuthResult {
    public static final Parcelable.Creator<zzx> CREATOR = new C0895d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzad f11936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzv f11937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zze f11938c;

    public zzx(zzad zzadVar) {
        D.i(zzadVar);
        this.f11936a = zzadVar;
        ArrayList arrayList = zzadVar.f11912e;
        this.f11937b = null;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (!TextUtils.isEmpty(((zzz) arrayList.get(i7)).f11947z)) {
                this.f11937b = new zzv(((zzz) arrayList.get(i7)).f11940b, ((zzz) arrayList.get(i7)).f11947z, zzadVar.f11904A);
            }
        }
        if (this.f11937b == null) {
            this.f11937b = new zzv(zzadVar.f11904A);
        }
        this.f11938c = zzadVar.f11905B;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f11936a, i7, false);
        Y4.D.r0(parcel, 2, this.f11937b, i7, false);
        Y4.D.r0(parcel, 3, this.f11938c, i7, false);
        Y4.D.z0(iX0, parcel);
    }

    public zzx(zzad zzadVar, zzv zzvVar, zze zzeVar) {
        this.f11936a = zzadVar;
        this.f11937b = zzvVar;
        this.f11938c = zzeVar;
    }
}
