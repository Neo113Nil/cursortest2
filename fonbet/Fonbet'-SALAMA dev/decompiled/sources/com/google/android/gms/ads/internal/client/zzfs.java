package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y2.u;

/* loaded from: classes.dex */
public final class zzfs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new e(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f10733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10734b;

    public zzfs(int i7, int i8) {
        this.f10733a = i7;
        this.f10734b = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10733a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10734b);
        D.z0(x02, parcel);
    }

    public zzfs(u uVar) {
        this.f10733a = uVar.f18178a;
        this.f10734b = uVar.f18179b;
    }
}
