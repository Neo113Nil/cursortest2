package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new E(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10694c;

    public HlsTrackMetadataEntry(String str, String str2, List list) {
        this.f10692a = str;
        this.f10693b = str2;
        this.f10694c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f10692a, hlsTrackMetadataEntry.f10692a) && TextUtils.equals(this.f10693b, hlsTrackMetadataEntry.f10693b) && this.f10694c.equals(hlsTrackMetadataEntry.f10694c);
    }

    public final int hashCode() {
        String str = this.f10692a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10693b;
        return this.f10694c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f10692a;
        sb.append(str != null ? k.i(k.k(" [", str, ", "), this.f10693b, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10692a);
        parcel.writeString(this.f10693b);
        List list = this.f10694c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) list.get(i8), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f10692a = parcel.readString();
        this.f10693b = parcel.readString();
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f10694c = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f10700f;

        public VariantInfo(int i7, int i8, String str, String str2, String str3, String str4) {
            this.f10695a = i7;
            this.f10696b = i8;
            this.f10697c = str;
            this.f10698d = str2;
            this.f10699e = str3;
            this.f10700f = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f10695a == variantInfo.f10695a && this.f10696b == variantInfo.f10696b && TextUtils.equals(this.f10697c, variantInfo.f10697c) && TextUtils.equals(this.f10698d, variantInfo.f10698d) && TextUtils.equals(this.f10699e, variantInfo.f10699e) && TextUtils.equals(this.f10700f, variantInfo.f10700f);
        }

        public final int hashCode() {
            int i7 = ((this.f10695a * 31) + this.f10696b) * 31;
            String str = this.f10697c;
            int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10698d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f10699e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f10700f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f10695a);
            parcel.writeInt(this.f10696b);
            parcel.writeString(this.f10697c);
            parcel.writeString(this.f10698d);
            parcel.writeString(this.f10699e);
            parcel.writeString(this.f10700f);
        }

        public VariantInfo(Parcel parcel) {
            this.f10695a = parcel.readInt();
            this.f10696b = parcel.readInt();
            this.f10697c = parcel.readString();
            this.f10698d = parcel.readString();
            this.f10699e = parcel.readString();
            this.f10700f = parcel.readString();
        }
    }
}
