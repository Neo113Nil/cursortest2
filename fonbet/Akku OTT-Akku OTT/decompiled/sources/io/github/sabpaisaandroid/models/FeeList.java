package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.g;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0011HÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0013\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006;"}, d2 = {"Lio/github/sabpaisaandroid/models/FeeList;", "Landroid/os/Parcelable;", "feeId", "", "slabNumber", "", "slabFloor", "", "slabCeiling", "convchargesType", "", "convcharges", "endPointchargesTypes", "endPointcharge", "gstType", "gst", "isTaxApplicableConvcharges", "", "isTaxApplicableEndpointcharges", "(JIFFLjava/lang/String;FLjava/lang/String;FLjava/lang/String;FZZ)V", "getConvcharges", "()F", "getConvchargesType", "()Ljava/lang/String;", "getEndPointcharge", "getEndPointchargesTypes", "getFeeId", "()J", "getGst", "getGstType", "()Z", "getSlabCeiling", "getSlabFloor", "getSlabNumber", "()I", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeeList implements Parcelable {
    public static final Parcelable.Creator<FeeList> CREATOR = new a();
    private final float convcharges;
    private final String convchargesType;
    private final float endPointcharge;
    private final String endPointchargesTypes;
    private final long feeId;
    private final float gst;
    private final String gstType;
    private final boolean isTaxApplicableConvcharges;
    private final boolean isTaxApplicableEndpointcharges;
    private final float slabCeiling;
    private final float slabFloor;
    private final int slabNumber;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeeList> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeeList createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            String readString = parcel.readString();
            float readFloat3 = parcel.readFloat();
            String readString2 = parcel.readString();
            float readFloat4 = parcel.readFloat();
            String readString3 = parcel.readString();
            float readFloat5 = parcel.readFloat();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new FeeList(readLong, readInt, readFloat, readFloat2, readString, readFloat3, readString2, readFloat4, readString3, readFloat5, z2, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeeList[] newArray(int i) {
            return new FeeList[i];
        }
    }

    public FeeList(long j, int i, float f, float f2, String convchargesType, float f3, String endPointchargesTypes, float f4, String gstType, float f5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(convchargesType, "convchargesType");
        Intrinsics.checkNotNullParameter(endPointchargesTypes, "endPointchargesTypes");
        Intrinsics.checkNotNullParameter(gstType, "gstType");
        this.feeId = j;
        this.slabNumber = i;
        this.slabFloor = f;
        this.slabCeiling = f2;
        this.convchargesType = convchargesType;
        this.convcharges = f3;
        this.endPointchargesTypes = endPointchargesTypes;
        this.endPointcharge = f4;
        this.gstType = gstType;
        this.gst = f5;
        this.isTaxApplicableConvcharges = z;
        this.isTaxApplicableEndpointcharges = z2;
    }

    /* renamed from: component1, reason: from getter */
    public final long getFeeId() {
        return this.feeId;
    }

    /* renamed from: component10, reason: from getter */
    public final float getGst() {
        return this.gst;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsTaxApplicableConvcharges() {
        return this.isTaxApplicableConvcharges;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsTaxApplicableEndpointcharges() {
        return this.isTaxApplicableEndpointcharges;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSlabNumber() {
        return this.slabNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final float getSlabFloor() {
        return this.slabFloor;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSlabCeiling() {
        return this.slabCeiling;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConvchargesType() {
        return this.convchargesType;
    }

    /* renamed from: component6, reason: from getter */
    public final float getConvcharges() {
        return this.convcharges;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEndPointchargesTypes() {
        return this.endPointchargesTypes;
    }

    /* renamed from: component8, reason: from getter */
    public final float getEndPointcharge() {
        return this.endPointcharge;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGstType() {
        return this.gstType;
    }

    public final FeeList copy(long feeId, int slabNumber, float slabFloor, float slabCeiling, String convchargesType, float convcharges, String endPointchargesTypes, float endPointcharge, String gstType, float gst, boolean isTaxApplicableConvcharges, boolean isTaxApplicableEndpointcharges) {
        Intrinsics.checkNotNullParameter(convchargesType, "convchargesType");
        Intrinsics.checkNotNullParameter(endPointchargesTypes, "endPointchargesTypes");
        Intrinsics.checkNotNullParameter(gstType, "gstType");
        return new FeeList(feeId, slabNumber, slabFloor, slabCeiling, convchargesType, convcharges, endPointchargesTypes, endPointcharge, gstType, gst, isTaxApplicableConvcharges, isTaxApplicableEndpointcharges);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeList)) {
            return false;
        }
        FeeList feeList = (FeeList) other;
        return this.feeId == feeList.feeId && this.slabNumber == feeList.slabNumber && Float.compare(this.slabFloor, feeList.slabFloor) == 0 && Float.compare(this.slabCeiling, feeList.slabCeiling) == 0 && Intrinsics.areEqual(this.convchargesType, feeList.convchargesType) && Float.compare(this.convcharges, feeList.convcharges) == 0 && Intrinsics.areEqual(this.endPointchargesTypes, feeList.endPointchargesTypes) && Float.compare(this.endPointcharge, feeList.endPointcharge) == 0 && Intrinsics.areEqual(this.gstType, feeList.gstType) && Float.compare(this.gst, feeList.gst) == 0 && this.isTaxApplicableConvcharges == feeList.isTaxApplicableConvcharges && this.isTaxApplicableEndpointcharges == feeList.isTaxApplicableEndpointcharges;
    }

    public final float getConvcharges() {
        return this.convcharges;
    }

    public final String getConvchargesType() {
        return this.convchargesType;
    }

    public final float getEndPointcharge() {
        return this.endPointcharge;
    }

    public final String getEndPointchargesTypes() {
        return this.endPointchargesTypes;
    }

    public final long getFeeId() {
        return this.feeId;
    }

    public final float getGst() {
        return this.gst;
    }

    public final String getGstType() {
        return this.gstType;
    }

    public final float getSlabCeiling() {
        return this.slabCeiling;
    }

    public final float getSlabFloor() {
        return this.slabFloor;
    }

    public final int getSlabNumber() {
        return this.slabNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = t.a(this.gst, androidx.compose.runtime.collection.a.a(t.a(this.endPointcharge, androidx.compose.runtime.collection.a.a(t.a(this.convcharges, androidx.compose.runtime.collection.a.a(t.a(this.slabCeiling, t.a(this.slabFloor, g.a(this.slabNumber, Long.hashCode(this.feeId) * 31, 31), 31), 31), 31, this.convchargesType), 31), 31, this.endPointchargesTypes), 31), 31, this.gstType), 31);
        boolean z = this.isTaxApplicableConvcharges;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a2 + i) * 31;
        boolean z2 = this.isTaxApplicableEndpointcharges;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isTaxApplicableConvcharges() {
        return this.isTaxApplicableConvcharges;
    }

    public final boolean isTaxApplicableEndpointcharges() {
        return this.isTaxApplicableEndpointcharges;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeeList(feeId=");
        sb.append(this.feeId);
        sb.append(", slabNumber=");
        sb.append(this.slabNumber);
        sb.append(", slabFloor=");
        sb.append(this.slabFloor);
        sb.append(", slabCeiling=");
        sb.append(this.slabCeiling);
        sb.append(", convchargesType=");
        sb.append(this.convchargesType);
        sb.append(", convcharges=");
        sb.append(this.convcharges);
        sb.append(", endPointchargesTypes=");
        sb.append(this.endPointchargesTypes);
        sb.append(", endPointcharge=");
        sb.append(this.endPointcharge);
        sb.append(", gstType=");
        sb.append(this.gstType);
        sb.append(", gst=");
        sb.append(this.gst);
        sb.append(", isTaxApplicableConvcharges=");
        sb.append(this.isTaxApplicableConvcharges);
        sb.append(", isTaxApplicableEndpointcharges=");
        return androidx.appcompat.view.menu.a.c(sb, this.isTaxApplicableEndpointcharges, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.feeId);
        parcel.writeInt(this.slabNumber);
        parcel.writeFloat(this.slabFloor);
        parcel.writeFloat(this.slabCeiling);
        parcel.writeString(this.convchargesType);
        parcel.writeFloat(this.convcharges);
        parcel.writeString(this.endPointchargesTypes);
        parcel.writeFloat(this.endPointcharge);
        parcel.writeString(this.gstType);
        parcel.writeFloat(this.gst);
        parcel.writeInt(this.isTaxApplicableConvcharges ? 1 : 0);
        parcel.writeInt(this.isTaxApplicableEndpointcharges ? 1 : 0);
    }
}
