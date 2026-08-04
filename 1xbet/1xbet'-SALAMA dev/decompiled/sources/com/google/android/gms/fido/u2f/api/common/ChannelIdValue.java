package com.google.android.gms.fido.u2f.api.common;

import W5.AbstractC0486a1;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new l(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelIdValueType f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11524c;

    public enum ChannelIdValueType implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11527a;

        ChannelIdValueType(int i7) {
            this.f11527a = i7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11527a);
        }
    }

    static {
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue(int i7, String str, String str2) {
        try {
            this.f11522a = j(i7);
            this.f11523b = str;
            this.f11524c = str2;
        } catch (p147u3.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static ChannelIdValueType j(int i7) throws p147u3.a {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i7 == channelIdValueType.f11527a) {
                return channelIdValueType;
            }
        }
        throw new p147u3.a(AbstractC0486a1.f(i7, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.f11522a;
        ChannelIdValueType channelIdValueType2 = this.f11522a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f11523b.equals(channelIdValue.f11523b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f11524c.equals(channelIdValue.f11524c);
    }

    public final int hashCode() {
        int i7;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.f11522a;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i7 = iHashCode2 * 31;
            iHashCode = this.f11523b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i7 = iHashCode2 * 31;
            iHashCode = this.f11524c.hashCode();
        }
        return iHashCode + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        int i8 = this.f11522a.f11527a;
        D.B0(parcel, 2, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 3, this.f11523b, false);
        D.s0(parcel, 4, this.f11524c, false);
        D.z0(iX0, parcel);
    }

    public ChannelIdValue(String str) {
        this.f11523b = str;
        this.f11522a = ChannelIdValueType.STRING;
        this.f11524c = null;
    }
}
