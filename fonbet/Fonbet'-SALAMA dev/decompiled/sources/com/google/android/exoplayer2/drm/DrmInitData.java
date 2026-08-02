package com.google.android.exoplayer2.drm;

import A1.AbstractC0029l;
import B2.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final SchemeData[] f10553a;

    /* renamed from: b, reason: collision with root package name */
    public int f10554b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10556d;

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public final DrmInitData a(String str) {
        return t.a(this.f10555c, str) ? this : new DrmInitData(str, false, this.f10553a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = AbstractC0029l.f462a;
        return uuid.equals(schemeData3.f10558b) ? uuid.equals(schemeData4.f10558b) ? 0 : 1 : schemeData3.f10558b.compareTo(schemeData4.f10558b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return t.a(this.f10555c, drmInitData.f10555c) && Arrays.equals(this.f10553a, drmInitData.f10553a);
    }

    public final int hashCode() {
        if (this.f10554b == 0) {
            String str = this.f10555c;
            this.f10554b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10553a);
        }
        return this.f10554b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10555c);
        parcel.writeTypedArray(this.f10553a, 0);
    }

    public DrmInitData(String str, boolean z4, SchemeData... schemeDataArr) {
        this.f10555c = str;
        schemeDataArr = z4 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f10553a = schemeDataArr;
        this.f10556d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public int f10557a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f10558b;

        /* renamed from: c, reason: collision with root package name */
        public final String f10559c;

        /* renamed from: d, reason: collision with root package name */
        public final String f10560d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f10561e;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f10558b = uuid;
            this.f10559c = str;
            str2.getClass();
            this.f10560d = str2;
            this.f10561e = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return t.a(this.f10559c, schemeData.f10559c) && t.a(this.f10560d, schemeData.f10560d) && t.a(this.f10558b, schemeData.f10558b) && Arrays.equals(this.f10561e, schemeData.f10561e);
        }

        public final int hashCode() {
            if (this.f10557a == 0) {
                int hashCode = this.f10558b.hashCode() * 31;
                String str = this.f10559c;
                this.f10557a = Arrays.hashCode(this.f10561e) + AbstractC1663a.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f10560d);
            }
            return this.f10557a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            UUID uuid = this.f10558b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f10559c);
            parcel.writeString(this.f10560d);
            parcel.writeByteArray(this.f10561e);
        }

        public SchemeData(Parcel parcel) {
            this.f10558b = new UUID(parcel.readLong(), parcel.readLong());
            this.f10559c = parcel.readString();
            String readString = parcel.readString();
            int i7 = t.f17153a;
            this.f10560d = readString;
            this.f10561e = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f10555c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i7 = t.f17153a;
        this.f10553a = schemeDataArr;
        this.f10556d = schemeDataArr.length;
    }
}
