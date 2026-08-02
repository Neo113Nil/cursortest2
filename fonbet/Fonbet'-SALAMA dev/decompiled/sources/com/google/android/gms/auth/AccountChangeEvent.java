package com.google.android.gms.auth;

import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e1.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new e(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f10866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10867b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10870e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10871f;

    public AccountChangeEvent(int i7, long j, String str, int i8, int i9, String str2) {
        this.f10866a = i7;
        this.f10867b = j;
        D.i(str);
        this.f10868c = str;
        this.f10869d = i8;
        this.f10870e = i9;
        this.f10871f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f10866a == accountChangeEvent.f10866a && this.f10867b == accountChangeEvent.f10867b && D.m(this.f10868c, accountChangeEvent.f10868c) && this.f10869d == accountChangeEvent.f10869d && this.f10870e == accountChangeEvent.f10870e && D.m(this.f10871f, accountChangeEvent.f10871f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10866a), Long.valueOf(this.f10867b), this.f10868c, Integer.valueOf(this.f10869d), Integer.valueOf(this.f10870e), this.f10871f});
    }

    public final String toString() {
        int i7 = this.f10869d;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb = new StringBuilder("AccountChangeEvent {accountName = ");
        sb.append(this.f10868c);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(this.f10871f);
        sb.append(", eventIndex = ");
        return k.g(sb, this.f10870e, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10866a);
        Y4.D.B0(parcel, 2, 8);
        parcel.writeLong(this.f10867b);
        Y4.D.s0(parcel, 3, this.f10868c, false);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10869d);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10870e);
        Y4.D.s0(parcel, 6, this.f10871f, false);
        Y4.D.z0(x02, parcel);
    }
}
