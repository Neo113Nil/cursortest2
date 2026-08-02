package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class w implements Comparable<w>, Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    @NonNull
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    @Nullable
    public String i;

    public class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final w createFromParcel(@NonNull Parcel parcel) {
            return w.h(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final w[] newArray(int i) {
            return new w[i];
        }
    }

    public w(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = E.c(calendar);
        this.a = c;
        this.b = c.get(2);
        this.c = c.get(1);
        this.d = c.getMaximum(7);
        this.e = c.getActualMaximum(5);
        this.f = c.getTimeInMillis();
    }

    @NonNull
    public static w h(int i, int i2) {
        Calendar e = E.e(null);
        e.set(1, i);
        e.set(2, i2);
        return new w(e);
    }

    @NonNull
    public static w l(long j) {
        Calendar e = E.e(null);
        e.setTimeInMillis(j);
        return new w(e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull w wVar) {
        return this.a.compareTo(wVar.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @NonNull
    public final String m() {
        if (this.i == null) {
            this.i = E.b("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.i;
    }

    public final int n(@NonNull w wVar) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (wVar.b - this.b) + ((wVar.c - this.c) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
