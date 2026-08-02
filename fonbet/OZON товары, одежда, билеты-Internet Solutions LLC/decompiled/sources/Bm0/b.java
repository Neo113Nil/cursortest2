package Bm0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b implements Serializable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private Dm0.b[] f4004a;

    /* renamed from: b, reason: collision with root package name */
    private String f4005b;

    /* renamed from: c, reason: collision with root package name */
    private String f4006c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4007d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4008e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4009f;

    static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b() {
        this.f4007d = true;
        this.f4008e = false;
        this.f4009f = false;
    }

    @NonNull
    public static b h(String str) {
        if (str != null && str.length() != 0) {
            b bVar = new b();
            bVar.f4005b = str;
            return bVar;
        }
        b bVar2 = new b();
        int i11 = Dm0.a.f6754a;
        bVar2.f4004a = new Dm0.b[]{new Dm0.b(new Dm0.e())};
        bVar2.f4007d = false;
        return bVar2;
    }

    public final String a() {
        return this.f4006c;
    }

    public final String b() {
        return this.f4005b;
    }

    public final Dm0.b[] d() {
        return this.f4004a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f4008e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4007d != bVar.f4007d || this.f4008e != bVar.f4008e || this.f4009f != bVar.f4009f || !Arrays.equals(this.f4004a, bVar.f4004a)) {
                return false;
            }
            String str = this.f4005b;
            if (str == null ? bVar.f4005b != null : !str.equals(bVar.f4005b)) {
                return false;
            }
            String str2 = this.f4006c;
            String str3 = bVar.f4006c;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f4009f;
    }

    public final boolean g() {
        return this.f4007d;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4004a) * 31;
        String str = this.f4005b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4006c;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f4007d ? 1 : 0)) * 31) + (this.f4008e ? 1 : 0)) * 31) + (this.f4009f ? 1 : 0);
    }

    public final void i() {
        this.f4009f = true;
    }

    public final void j(String str) {
        this.f4006c = str;
    }

    public final void l() {
        if (this.f4004a == null) {
            String str = this.f4005b;
            if (str == null || str.length() == 0) {
                throw new IllegalStateException("Mask descriptor is malformed. Should have at least slots array or raw mask (string representation)");
            }
        }
    }

    public final String toString() {
        String str = this.f4005b;
        if (str != null && str.length() != 0) {
            return this.f4005b;
        }
        Dm0.b[] bVarArr = this.f4004a;
        if (bVarArr == null || bVarArr.length <= 0) {
            return "(empty)";
        }
        StringBuilder sb2 = new StringBuilder(bVarArr.length);
        for (Dm0.b bVar : this.f4004a) {
            char g10 = bVar.g();
            if (g10 == null) {
                g10 = '_';
            }
            sb2.append(g10);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedArray(this.f4004a, i11);
        parcel.writeString(this.f4005b);
        parcel.writeString(this.f4006c);
        parcel.writeByte(this.f4007d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4008e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4009f ? (byte) 1 : (byte) 0);
    }

    protected b(Parcel parcel) {
        this.f4007d = true;
        this.f4008e = false;
        this.f4009f = false;
        this.f4004a = (Dm0.b[]) parcel.createTypedArray(Dm0.b.CREATOR);
        this.f4005b = parcel.readString();
        this.f4006c = parcel.readString();
        this.f4007d = parcel.readByte() != 0;
        this.f4008e = parcel.readByte() != 0;
        this.f4009f = parcel.readByte() != 0;
    }
}
