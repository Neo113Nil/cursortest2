package com.google.android.exoplayer2.metadata.scte35;

import V2.a;
import Z1.c;
import Z1.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a(26);

    /* renamed from: a, reason: collision with root package name */
    public final List f10671a;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new d(parcel));
        }
        this.f10671a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f10671a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) list.get(i8);
            parcel.writeLong(dVar.f7842a);
            parcel.writeByte(dVar.f7843b ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f7844c ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f7845d ? (byte) 1 : (byte) 0);
            List list2 = dVar.f7847f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                c cVar = (c) list2.get(i9);
                parcel.writeInt(cVar.f7840a);
                parcel.writeLong(cVar.f7841b);
            }
            parcel.writeLong(dVar.f7846e);
            parcel.writeByte(dVar.f7848g ? (byte) 1 : (byte) 0);
            parcel.writeLong(dVar.f7849h);
            parcel.writeInt(dVar.f7850i);
            parcel.writeInt(dVar.j);
            parcel.writeInt(dVar.f7851k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f10671a = Collections.unmodifiableList(arrayList);
    }
}
