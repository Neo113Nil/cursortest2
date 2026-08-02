package Fb;

import B0.C2454a;
import G.g;
import Sc.InterfaceC3999a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UserId f9222a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f9223b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f9224c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9225d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f9226e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9227f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9228g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9229h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f9230i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9231j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9232k;

    /* renamed from: l, reason: collision with root package name */
    private final Bundle f9233l;

    /* renamed from: m, reason: collision with root package name */
    private final int f9234m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f9235n;

    /* renamed from: o, reason: collision with root package name */
    private final String f9236o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final List<d> f9237p;

    /* renamed from: q, reason: collision with root package name */
    private final int f9238q;

    public static final class a implements Parcelable.Creator<b> {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final Fb.b createFromParcel(android.os.Parcel r23) {
            /*
                r22 = this;
                r0 = r23
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                Fb.b r2 = new Fb.b
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r1 = r0.readInt()
                java.lang.String r4 = r0.readString()
                kotlin.jvm.internal.Intrinsics.f(r4)
                java.lang.String r5 = r0.readString()
                kotlin.jvm.internal.Intrinsics.f(r5)
                long r6 = r0.readLong()
                java.lang.String r8 = r0.readString()
                kotlin.jvm.internal.Intrinsics.f(r8)
                java.lang.String r9 = r0.readString()
                java.lang.String r10 = r0.readString()
                java.lang.String r11 = r0.readString()
                java.lang.String r12 = r0.readString()
                kotlin.jvm.internal.Intrinsics.f(r12)
                java.lang.String r13 = r0.readString()
                java.lang.String r14 = r0.readString()
                java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
                java.lang.ClassLoader r3 = r3.getClassLoader()
                android.os.Parcelable r3 = r0.readParcelable(r3)
                r15 = r3
                android.os.Bundle r15 = (android.os.Bundle) r15
                int r16 = r0.readInt()
                java.lang.String r3 = r0.readString()
                if (r3 != 0) goto L5d
                java.lang.String r3 = ""
            L5d:
                java.lang.String r18 = r0.readString()
                r17 = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.Class<Fb.d> r19 = Fb.d.class
                r20 = r6
                java.lang.ClassLoader r6 = r19.getClassLoader()
                r0.readList(r2, r6)
                kotlin.Unit r6 = kotlin.Unit.f71690a
                java.lang.Class<com.vk.dto.common.id.UserId> r6 = com.vk.dto.common.id.UserId.class
                java.lang.ClassLoader r6 = r6.getClassLoader()
                android.os.Parcelable r6 = r0.readParcelable(r6)
                com.vk.dto.common.id.UserId r6 = (com.vk.dto.common.id.UserId) r6
                int r0 = r0.readInt()
                java.lang.String r7 = "uuid"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
                java.lang.String r7 = "token"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
                java.lang.String r7 = "firstName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
                java.lang.String r7 = "lastName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r7)
                java.lang.String r7 = "userHash"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
                java.lang.String r7 = "providerInfoItems"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
                if (r6 != 0) goto Lb9
                com.vk.dto.common.id.UserId r6 = new com.vk.dto.common.id.UserId
                r23 = r0
                long r0 = (long) r1
                r6.<init>(r0)
                r19 = r2
                r2 = r17
                r17 = r3
                r3 = r6
                r6 = r20
                r20 = r23
                goto Lc4
            Lb9:
                r19 = r2
                r2 = r17
                r17 = r3
                r3 = r6
                r6 = r20
                r20 = r0
            Lc4:
                r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r17 = r2
                return r17
            */
            throw new UnsupportedOperationException("Method not decompiled: Fb.b.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    @InterfaceC3999a
    public b() {
        throw null;
    }

    public b(@NotNull UserId userId, @NotNull String uuid, @NotNull String token, long j11, @NotNull String firstName, String str, String str2, String str3, @NotNull String lastName, String str4, String str5, Bundle bundle, int i11, @NotNull String userHash, String str6, @NotNull List<d> providerInfoItems, int i12) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        Intrinsics.checkNotNullParameter(providerInfoItems, "providerInfoItems");
        this.f9222a = userId;
        this.f9223b = uuid;
        this.f9224c = token;
        this.f9225d = j11;
        this.f9226e = firstName;
        this.f9227f = str;
        this.f9228g = str2;
        this.f9229h = str3;
        this.f9230i = lastName;
        this.f9231j = str4;
        this.f9232k = str5;
        this.f9233l = bundle;
        this.f9234m = i11;
        this.f9235n = userHash;
        this.f9236o = str6;
        this.f9237p = providerInfoItems;
        this.f9238q = i12;
    }

    public static b a(b bVar, String str, ArrayList arrayList, int i11) {
        UserId userId = bVar.f9222a;
        String uuid = bVar.f9223b;
        String token = bVar.f9224c;
        long j11 = bVar.f9225d;
        String firstName = bVar.f9226e;
        String str2 = bVar.f9227f;
        String str3 = bVar.f9228g;
        String str4 = bVar.f9229h;
        String lastName = bVar.f9230i;
        String str5 = bVar.f9231j;
        String str6 = bVar.f9232k;
        Bundle bundle = bVar.f9233l;
        int i12 = bVar.f9234m;
        String userHash = bVar.f9235n;
        String str7 = (i11 & 16384) != 0 ? bVar.f9236o : str;
        List<d> providerInfoItems = (i11 & 32768) != 0 ? bVar.f9237p : arrayList;
        String str8 = str7;
        int i13 = bVar.f9238q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        Intrinsics.checkNotNullParameter(providerInfoItems, "providerInfoItems");
        return new b(userId, uuid, token, j11, firstName, str2, str3, str4, lastName, str5, str6, bundle, i12, userHash, str8, providerInfoItems, i13);
    }

    public final String b() {
        return this.f9236o;
    }

    public final long c() {
        UserId userId = this.f9222a;
        Intrinsics.checkNotNullParameter(userId, "<this>");
        if (userId.a() != 0) {
            return userId.a();
        }
        return -Math.abs((this.f9226e + this.f9230i + this.f9229h + this.f9231j).hashCode());
    }

    public final long d() {
        return this.f9225d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f9226e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f9222a, bVar.f9222a) && Intrinsics.d(this.f9223b, bVar.f9223b) && Intrinsics.d(this.f9224c, bVar.f9224c) && this.f9225d == bVar.f9225d && Intrinsics.d(this.f9226e, bVar.f9226e) && Intrinsics.d(this.f9227f, bVar.f9227f) && Intrinsics.d(this.f9228g, bVar.f9228g) && Intrinsics.d(this.f9229h, bVar.f9229h) && Intrinsics.d(this.f9230i, bVar.f9230i) && Intrinsics.d(this.f9231j, bVar.f9231j) && Intrinsics.d(this.f9232k, bVar.f9232k) && Intrinsics.d(this.f9233l, bVar.f9233l) && this.f9234m == bVar.f9234m && Intrinsics.d(this.f9235n, bVar.f9235n) && Intrinsics.d(this.f9236o, bVar.f9236o) && Intrinsics.d(this.f9237p, bVar.f9237p) && this.f9238q == bVar.f9238q;
    }

    @NotNull
    public final String f() {
        return this.f9230i;
    }

    public final String g() {
        return this.f9231j;
    }

    public final String h() {
        return this.f9228g;
    }

    public final int hashCode() {
        int a11 = g.a(Pk0.c.a(g.a(g.a(this.f9222a.hashCode() * 31, 31, this.f9223b), 31, this.f9224c), 31, this.f9225d), 31, this.f9226e);
        String str = this.f9227f;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9228g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9229h;
        int a12 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f9230i);
        String str4 = this.f9231j;
        int hashCode3 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9232k;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Bundle bundle = this.f9233l;
        int a13 = g.a(C2454a.a(this.f9234m, (hashCode4 + (bundle == null ? 0 : bundle.hashCode())) * 31, 31), 31, this.f9235n);
        String str6 = this.f9236o;
        return Integer.hashCode(this.f9238q) + g.b((a13 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f9237p);
    }

    public final String i() {
        return this.f9229h;
    }

    public final String j() {
        return this.f9227f;
    }

    @NotNull
    public final String k() {
        return this.f9224c;
    }

    @NotNull
    public final String l() {
        return this.f9235n;
    }

    @NotNull
    public final UserId n() {
        return this.f9222a;
    }

    @NotNull
    public final String o() {
        return this.f9223b;
    }

    public final int p() {
        return this.f9234m;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentAuthInfo(userId=");
        sb2.append(this.f9222a);
        sb2.append(", uuid=");
        sb2.append(this.f9223b);
        sb2.append(", token=");
        sb2.append(this.f9224c);
        sb2.append(", expireTime=");
        sb2.append(this.f9225d);
        sb2.append(", firstName=");
        sb2.append(this.f9226e);
        sb2.append(", photo50=");
        sb2.append(this.f9227f);
        sb2.append(", photo100=");
        sb2.append(this.f9228g);
        sb2.append(", photo200=");
        sb2.append(this.f9229h);
        sb2.append(", lastName=");
        sb2.append(this.f9230i);
        sb2.append(", phone=");
        sb2.append(this.f9231j);
        sb2.append(", serviceInfo=");
        sb2.append(this.f9232k);
        sb2.append(", extras=");
        sb2.append(this.f9233l);
        sb2.append(", weight=");
        sb2.append(this.f9234m);
        sb2.append(", userHash=");
        sb2.append(this.f9235n);
        sb2.append(", applicationProviderPackage=");
        sb2.append(this.f9236o);
        sb2.append(", providerInfoItems=");
        sb2.append(this.f9237p);
        sb2.append(", providerAppId=");
        return K00.b.e(this.f9238q, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        UserId userId = this.f9222a;
        dest.writeInt((int) userId.a());
        dest.writeString(this.f9223b);
        dest.writeString(this.f9224c);
        dest.writeLong(this.f9225d);
        dest.writeString(this.f9226e);
        dest.writeString(this.f9227f);
        dest.writeString(this.f9228g);
        dest.writeString(this.f9229h);
        dest.writeString(this.f9230i);
        dest.writeString(this.f9231j);
        dest.writeString(this.f9232k);
        dest.writeParcelable(this.f9233l, 0);
        dest.writeInt(this.f9234m);
        dest.writeString(this.f9235n);
        dest.writeString(this.f9236o);
        dest.writeList(this.f9237p);
        dest.writeParcelable(userId, 0);
        dest.writeInt(this.f9238q);
    }
}
