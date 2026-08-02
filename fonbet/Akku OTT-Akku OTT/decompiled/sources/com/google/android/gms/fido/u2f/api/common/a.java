package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.compose.runtime.u;

@Deprecated
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new g();
    public final EnumC0116a a;
    public final String b;
    public final String c;

    /* renamed from: com.google.android.gms.fido.u2f.api.common.a$a, reason: collision with other inner class name */
    public enum EnumC0116a implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<EnumC0116a> CREATOR = new f();
        public final int a;

        EnumC0116a(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public static class b extends Exception {
    }

    static {
        new a();
        new a("unavailable");
        new a("unused");
    }

    public a() {
        this.a = EnumC0116a.ABSENT;
        this.c = null;
        this.b = null;
    }

    @NonNull
    public static EnumC0116a l(int i) throws b {
        for (EnumC0116a enumC0116a : EnumC0116a.values()) {
            if (i == enumC0116a.a) {
                return enumC0116a;
            }
        }
        throw new b(u.a(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        EnumC0116a enumC0116a = aVar.a;
        EnumC0116a enumC0116a2 = this.a;
        if (!enumC0116a2.equals(enumC0116a)) {
            return false;
        }
        int ordinal = enumC0116a2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.b.equals(aVar.b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.c.equals(aVar.c);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        EnumC0116a enumC0116a = this.a;
        int hashCode2 = enumC0116a.hashCode() + 31;
        int ordinal = enumC0116a.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.c.hashCode();
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        int i2 = this.a.a;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public a(int i, String str, String str2) {
        try {
            this.a = l(i);
            this.b = str;
            this.c = str2;
        } catch (b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public a(String str) {
        this.b = str;
        this.a = EnumC0116a.STRING;
        this.c = null;
    }
}
