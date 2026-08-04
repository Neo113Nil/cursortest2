package com.google.android.exoplayer2.metadata.scte35;

import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10657c;

    public PrivateCommand(long j, byte[] bArr, long j3) {
        this.f10655a = j3;
        this.f10656b = j;
        this.f10657c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10655a);
        parcel.writeLong(this.f10656b);
        parcel.writeByteArray(this.f10657c);
    }

    public PrivateCommand(Parcel parcel) {
        this.f10655a = parcel.readLong();
        this.f10656b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i7 = t.f17159a;
        this.f10657c = bArrCreateByteArray;
    }
}
