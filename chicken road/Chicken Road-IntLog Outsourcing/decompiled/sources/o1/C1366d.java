package o1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import p1.AbstractC1380a;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366d extends AbstractC1380a {
    public static final Parcelable.Creator<C1366d> CREATOR = new B1.c(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f11527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11528b;

    public C1366d(int i2, String str) {
        this.f11527a = i2;
        this.f11528b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1366d)) {
            return false;
        }
        C1366d c1366d = (C1366d) obj;
        return c1366d.f11527a == this.f11527a && u.j(c1366d.f11528b, this.f11528b);
    }

    public final int hashCode() {
        return this.f11527a;
    }

    public final String toString() {
        return this.f11527a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f11528b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11527a);
        AbstractC0169a.O(parcel, 2, this.f11528b);
        AbstractC0169a.S(parcel, R5);
    }
}
