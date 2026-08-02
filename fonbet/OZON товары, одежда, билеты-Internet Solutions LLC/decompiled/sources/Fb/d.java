package Fb;

import B0.C2454a;
import C.o0;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UserId f9241a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f9242b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f9243c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9244d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9245e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9246f;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable readParcelable = parcel.readParcelable(UserId.class.getClassLoader());
            Intrinsics.f(readParcelable);
            String readString = parcel.readString();
            Intrinsics.f(readString);
            String readString2 = parcel.readString();
            Intrinsics.f(readString2);
            return new d((UserId) readParcelable, readString, readString2, parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public d(@NotNull UserId userId, @NotNull String uuid, @NotNull String token, long j11, int i11, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f9241a = userId;
        this.f9242b = uuid;
        this.f9243c = token;
        this.f9244d = j11;
        this.f9245e = i11;
        this.f9246f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f9241a, dVar.f9241a) && Intrinsics.d(this.f9242b, dVar.f9242b) && Intrinsics.d(this.f9243c, dVar.f9243c) && this.f9244d == dVar.f9244d && this.f9245e == dVar.f9245e && Intrinsics.d(this.f9246f, dVar.f9246f);
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f9245e, Pk0.c.a(g.a(g.a(this.f9241a.hashCode() * 31, 31, this.f9242b), 31, this.f9243c), 31, this.f9244d), 31);
        String str = this.f9246f;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentTokenProviderInfo(userId=");
        sb2.append(this.f9241a);
        sb2.append(", uuid=");
        sb2.append(this.f9242b);
        sb2.append(", token=");
        sb2.append(this.f9243c);
        sb2.append(", expireTime=");
        sb2.append(this.f9244d);
        sb2.append(", weight=");
        sb2.append(this.f9245e);
        sb2.append(", applicationProviderPackage=");
        return o0.c(sb2, this.f9246f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.f9241a, 0);
        parcel.writeString(this.f9242b);
        parcel.writeString(this.f9243c);
        parcel.writeLong(this.f9244d);
        parcel.writeInt(this.f9245e);
        parcel.writeString(this.f9246f);
    }
}
