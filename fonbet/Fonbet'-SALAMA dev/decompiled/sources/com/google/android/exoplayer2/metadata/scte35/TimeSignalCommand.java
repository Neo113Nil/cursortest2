package com.google.android.exoplayer2.metadata.scte35;

import C1.C0095a;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f10672a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10673b;

    public TimeSignalCommand(long j, long j3) {
        this.f10672a = j;
        this.f10673b = j3;
    }

    public static long a(long j, C0095a c0095a) {
        long t7 = c0095a.t();
        if ((128 & t7) != 0) {
            return 8589934591L & ((((t7 & 1) << 32) | c0095a.u()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10672a);
        parcel.writeLong(this.f10673b);
    }
}
