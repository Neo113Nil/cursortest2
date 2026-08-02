package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10649a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final long f10650a;

        /* renamed from: b, reason: collision with root package name */
        public final long f10651b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10652c;

        public Segment(long j, long j3, int i7) {
            AbstractC1664a.f(j < j3);
            this.f10650a = j;
            this.f10651b = j3;
            this.f10652c = i7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f10650a == segment.f10650a && this.f10651b == segment.f10651b && this.f10652c == segment.f10652c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f10650a), Long.valueOf(this.f10651b), Integer.valueOf(this.f10652c)});
        }

        public final String toString() {
            int i7 = t.f17153a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f10650a + ", endTimeMs=" + this.f10651b + ", speedDivisor=" + this.f10652c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f10650a);
            parcel.writeLong(this.f10651b);
            parcel.writeInt(this.f10652c);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f10649a = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f10651b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i7)).f10650a < j) {
                    z4 = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i7)).f10651b;
                    i7++;
                }
            }
        }
        AbstractC1664a.f(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f10649a.equals(((SlowMotionData) obj).f10649a);
    }

    public final int hashCode() {
        return this.f10649a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f10649a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f10649a);
    }
}
