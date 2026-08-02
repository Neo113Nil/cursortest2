package WZ;

import C.J;
import De.C2860c;
import Sc.InterfaceC3999a;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33378a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33379b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33380c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33381d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f33382e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33383f;

    /* renamed from: g, reason: collision with root package name */
    private final String f33384g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f33385h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f33386i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f33387j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, String> f33388k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f33389a;

        /* renamed from: b, reason: collision with root package name */
        private String f33390b;

        /* renamed from: c, reason: collision with root package name */
        private String f33391c;

        /* renamed from: d, reason: collision with root package name */
        private String f33392d;

        /* renamed from: e, reason: collision with root package name */
        private Long f33393e;

        /* renamed from: f, reason: collision with root package name */
        private String f33394f;

        /* renamed from: g, reason: collision with root package name */
        private String f33395g;

        /* renamed from: h, reason: collision with root package name */
        private Long f33396h;

        /* renamed from: i, reason: collision with root package name */
        private Map<String, String> f33397i;

        /* renamed from: j, reason: collision with root package name */
        private Map<String, String> f33398j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f33399k;

        @NotNull
        public final void a(@NotNull String actionType) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f33389a = actionType;
        }

        @NotNull
        public final s b() {
            String str = this.f33389a;
            if (str != null) {
                return new s(str, this.f33390b, this.f33391c, this.f33392d, this.f33393e, this.f33394f, this.f33395g, this.f33396h, this.f33397i, this.f33399k, this.f33398j);
            }
            throw new IllegalArgumentException("actionType == null");
        }

        @NotNull
        public final void c(@NotNull String cellToken) {
            Intrinsics.checkNotNullParameter(cellToken, "cellToken");
            this.f33390b = cellToken;
        }

        @NotNull
        public final void d(@NotNull Map custom) {
            Intrinsics.checkNotNullParameter(custom, "custom");
            this.f33398j = custom;
        }

        @NotNull
        public final void e(boolean z11) {
            this.f33399k = z11;
        }

        @NotNull
        public final void f(long j11) {
            this.f33396h = Long.valueOf(j11);
        }

        @NotNull
        public final void g(@NotNull String pageToken) {
            Intrinsics.checkNotNullParameter(pageToken, "pageToken");
            this.f33394f = pageToken;
        }

        @NotNull
        public final void h(@NotNull String sliceToken) {
            Intrinsics.checkNotNullParameter(sliceToken, "sliceToken");
            this.f33391c = sliceToken;
        }

        @NotNull
        public final void i(@NotNull Map trackingTokenAliases) {
            Intrinsics.checkNotNullParameter(trackingTokenAliases, "trackingTokenAliases");
            this.f33397i = trackingTokenAliases;
        }

        @NotNull
        public final void j(@NotNull String userToken) {
            Intrinsics.checkNotNullParameter(userToken, "userToken");
            this.f33395g = userToken;
        }

        @InterfaceC3999a
        @NotNull
        public final void k(long j11) {
            this.f33393e = Long.valueOf(j11);
        }

        @NotNull
        public final void l(@NotNull String widgetToken) {
            Intrinsics.checkNotNullParameter(widgetToken, "widgetToken");
            this.f33392d = widgetToken;
        }
    }

    public static final class b implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = B6.b.a(parcel, linkedHashMap, parcel.readString(), i12, 1);
                }
            }
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                while (i11 != readInt2) {
                    i11 = B6.b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
            }
            return new s(readString, readString2, readString3, readString4, valueOf, readString5, readString6, valueOf2, linkedHashMap, z11, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i11) {
            return new s[i11];
        }
    }

    private s() {
        throw null;
    }

    public s(String str, String str2, String str3, String str4, Long l11, String str5, String str6, Long l12, Map map, boolean z11, Map map2) {
        this.f33378a = str;
        this.f33379b = str2;
        this.f33380c = str3;
        this.f33381d = str4;
        this.f33382e = l11;
        this.f33383f = str5;
        this.f33384g = str6;
        this.f33385h = l12;
        this.f33386i = map;
        this.f33387j = z11;
        this.f33388k = map2;
    }

    @NotNull
    public final String a() {
        return this.f33378a;
    }

    public final String b() {
        return this.f33379b;
    }

    public final Map<String, String> c() {
        return this.f33388k;
    }

    public final boolean d() {
        return this.f33387j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.f33385h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f33378a, sVar.f33378a) && Intrinsics.d(this.f33379b, sVar.f33379b) && Intrinsics.d(this.f33380c, sVar.f33380c) && Intrinsics.d(this.f33381d, sVar.f33381d) && Intrinsics.d(this.f33382e, sVar.f33382e) && Intrinsics.d(this.f33383f, sVar.f33383f) && Intrinsics.d(this.f33384g, sVar.f33384g) && Intrinsics.d(this.f33385h, sVar.f33385h) && Intrinsics.d(this.f33386i, sVar.f33386i) && Intrinsics.d(this.f33388k, sVar.f33388k);
    }

    public final String f() {
        return this.f33383f;
    }

    public final String g() {
        return this.f33380c;
    }

    public final Map<String, String> h() {
        return this.f33386i;
    }

    public final int hashCode() {
        int hashCode = this.f33378a.hashCode() * 31;
        String str = this.f33379b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33380c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f33381d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l11 = this.f33382e;
        int hashCode5 = (hashCode4 + (l11 != null ? l11.hashCode() : 0)) * 31;
        String str4 = this.f33383f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f33384g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l12 = this.f33385h;
        int hashCode8 = (hashCode7 + (l12 != null ? l12.hashCode() : 0)) * 31;
        Map<String, String> map = this.f33386i;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.f33388k;
        return hashCode9 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String i() {
        return this.f33384g;
    }

    public final Long j() {
        return this.f33382e;
    }

    public final String k() {
        return this.f33381d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenizedData(actionType='");
        sb2.append(this.f33378a);
        sb2.append("', cellToken=");
        sb2.append(this.f33379b);
        sb2.append(", sliceToken=");
        sb2.append(this.f33380c);
        sb2.append(", widgetToken=");
        sb2.append(this.f33381d);
        sb2.append(", widgetId=");
        sb2.append(this.f33382e);
        sb2.append(", pageToken=");
        sb2.append(this.f33383f);
        sb2.append(", userToken=");
        sb2.append(this.f33384g);
        sb2.append(", pageTimestamp=");
        sb2.append(this.f33385h);
        sb2.append(", trackingTokenAliases=");
        sb2.append(this.f33386i);
        sb2.append(", custom=");
        return P.f(sb2, this.f33388k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f33378a);
        dest.writeString(this.f33379b);
        dest.writeString(this.f33380c);
        dest.writeString(this.f33381d);
        Long l11 = this.f33382e;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        dest.writeString(this.f33383f);
        dest.writeString(this.f33384g);
        Long l12 = this.f33385h;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l12);
        }
        Map<String, String> map = this.f33386i;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeInt(this.f33387j ? 1 : 0);
        Map<String, String> map2 = this.f33388k;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e12 = J.e(map2, dest, 1);
        while (e12.hasNext()) {
            Map.Entry entry2 = (Map.Entry) e12.next();
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
    }
}
