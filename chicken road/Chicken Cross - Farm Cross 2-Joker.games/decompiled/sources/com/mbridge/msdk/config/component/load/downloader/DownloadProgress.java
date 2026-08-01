package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f8984a;
    private int b;
    private long c;

    class a implements Parcelable.Creator<DownloadProgress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i) {
            return new DownloadProgress[i];
        }
    }

    public DownloadProgress(long j, long j2, int i) {
        this.f8984a = j;
        this.c = j2;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f8984a;
    }

    public int getCurrentDownloadRate() {
        return this.b;
    }

    public long getTotal() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8984a);
        parcel.writeLong(this.c);
        parcel.writeInt(this.b);
    }

    protected DownloadProgress(Parcel parcel) {
        this.f8984a = parcel.readLong();
        this.c = parcel.readLong();
        this.b = parcel.readInt();
    }
}
