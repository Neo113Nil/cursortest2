package com.google.android.exoplayer2.metadata;

import A1.C0024i0;
import A1.X;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new S1.a();

    /* renamed from: a, reason: collision with root package name */
    public final Entry[] f10562a;

    public Metadata(Entry... entryArr) {
        this.f10562a = entryArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10562a, ((Metadata) obj).f10562a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10562a);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f10562a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Entry[] entryArr = this.f10562a;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List list) {
        this.f10562a = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f10562a = new Entry[parcel.readInt()];
        int i7 = 0;
        while (true) {
            Entry[] entryArr = this.f10562a;
            if (i7 >= entryArr.length) {
                return;
            }
            entryArr[i7] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i7++;
        }
    }

    public interface Entry extends Parcelable {
        default X f() {
            return null;
        }

        default byte[] l() {
            return null;
        }

        default void h(C0024i0 c0024i0) {
        }
    }
}
