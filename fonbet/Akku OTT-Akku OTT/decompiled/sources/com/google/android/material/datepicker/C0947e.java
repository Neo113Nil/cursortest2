package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.C0943a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0947e implements C0943a.c {
    public static final Parcelable.Creator<C0947e> CREATOR = new a();
    public final long a;

    /* renamed from: com.google.android.material.datepicker.e$a */
    public class a implements Parcelable.Creator<C0947e> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C0947e createFromParcel(@NonNull Parcel parcel) {
            return new C0947e(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C0947e[] newArray(int i) {
            return new C0947e[i];
        }
    }

    public C0947e(long j) {
        this.a = j;
    }

    @Override // com.google.android.material.datepicker.C0943a.c
    public final boolean c(long j) {
        return j >= this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0947e) && this.a == ((C0947e) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
