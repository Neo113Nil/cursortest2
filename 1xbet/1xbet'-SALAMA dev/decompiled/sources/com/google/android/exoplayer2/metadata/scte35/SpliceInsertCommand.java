package com.google.android.exoplayer2.metadata.scte35;

import V2.a;
import Z1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a(24);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f10658A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f10659B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f10660C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f10661D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10667f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f10668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f10669y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10670z;

    public SpliceInsertCommand(long j, boolean z4, boolean z7, boolean z8, boolean z9, long j3, long j7, List list, boolean z10, long j8, int i7, int i8, int i9) {
        this.f10662a = j;
        this.f10663b = z4;
        this.f10664c = z7;
        this.f10665d = z8;
        this.f10666e = z9;
        this.f10667f = j3;
        this.f10668x = j7;
        this.f10669y = Collections.unmodifiableList(list);
        this.f10670z = z10;
        this.f10658A = j8;
        this.f10659B = i7;
        this.f10660C = i8;
        this.f10661D = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10662a);
        parcel.writeByte(this.f10663b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10664c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10665d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10666e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10667f);
        parcel.writeLong(this.f10668x);
        List list = this.f10669y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) list.get(i8);
            parcel.writeInt(bVar.f7837a);
            parcel.writeLong(bVar.f7838b);
            parcel.writeLong(bVar.f7839c);
        }
        parcel.writeByte(this.f10670z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10658A);
        parcel.writeInt(this.f10659B);
        parcel.writeInt(this.f10660C);
        parcel.writeInt(this.f10661D);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f10662a = parcel.readLong();
        this.f10663b = parcel.readByte() == 1;
        this.f10664c = parcel.readByte() == 1;
        this.f10665d = parcel.readByte() == 1;
        this.f10666e = parcel.readByte() == 1;
        this.f10667f = parcel.readLong();
        this.f10668x = parcel.readLong();
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f10669y = Collections.unmodifiableList(arrayList);
        this.f10670z = parcel.readByte() == 1;
        this.f10658A = parcel.readLong();
        this.f10659B = parcel.readInt();
        this.f10660C = parcel.readInt();
        this.f10661D = parcel.readInt();
    }
}
