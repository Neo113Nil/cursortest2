package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0943a implements Parcelable {
    public static final Parcelable.Creator<C0943a> CREATOR = new C0123a();

    @NonNull
    public final w a;

    @NonNull
    public final w b;

    @NonNull
    public final c c;

    @Nullable
    public final w d;
    public final int e;
    public final int f;
    public final int i;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0123a implements Parcelable.Creator<C0943a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C0943a createFromParcel(@NonNull Parcel parcel) {
            return new C0943a((w) parcel.readParcelable(w.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C0943a[] newArray(int i) {
            return new C0943a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {
        public static final /* synthetic */ int c = 0;
        public Long a;
        public c b;

        static {
            E.a(w.h(1900, 0).f);
            E.a(w.h(2100, 11).f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        boolean c(long j);
    }

    public C0943a(w wVar, w wVar2, c cVar, w wVar3, int i) {
        Objects.requireNonNull(wVar, "start cannot be null");
        Objects.requireNonNull(wVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.a = wVar;
        this.b = wVar2;
        this.d = wVar3;
        this.e = i;
        this.c = cVar;
        if (wVar3 != null && wVar.a.compareTo(wVar3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (wVar3 != null && wVar3.a.compareTo(wVar2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > E.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.i = wVar.n(wVar2) + 1;
        this.f = (wVar2.c - wVar.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0943a)) {
            return false;
        }
        C0943a c0943a = (C0943a) obj;
        return this.a.equals(c0943a.a) && this.b.equals(c0943a.b) && ObjectsCompat.equals(this.d, c0943a.d) && this.e == c0943a.e && this.c.equals(c0943a.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
