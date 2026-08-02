package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y2.C1796A;

/* loaded from: classes.dex */
public final class zzfx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfx> CREATOR = new e(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10736a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10737b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10738c;

    public zzfx(C1796A c1796a) {
        this(c1796a.f18130a, c1796a.f18131b, c1796a.f18132c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10736a ? 1 : 0);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10737b ? 1 : 0);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10738c ? 1 : 0);
        D.z0(x02, parcel);
    }

    public zzfx(boolean z4, boolean z7, boolean z8) {
        this.f10736a = z4;
        this.f10737b = z7;
        this.f10738c = z8;
    }
}
