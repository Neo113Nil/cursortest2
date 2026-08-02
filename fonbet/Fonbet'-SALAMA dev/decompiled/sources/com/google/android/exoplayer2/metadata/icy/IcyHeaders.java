package com.google.android.exoplayer2.metadata.icy;

import A1.C0024i0;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.List;
import java.util.Map;
import v2.AbstractC1664a;
import v2.t;
import w1.L;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f10593a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10594b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10595c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10596d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10597e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10598f;

    public IcyHeaders(int i7, String str, String str2, String str3, boolean z4, int i8) {
        AbstractC1664a.f(i8 == -1 || i8 > 0);
        this.f10593a = i7;
        this.f10594b = str;
        this.f10595c = str2;
        this.f10596d = str3;
        this.f10597e = z4;
        this.f10598f = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IcyHeaders a(Map map) {
        boolean z4;
        int i7;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z7;
        List list5;
        int i8;
        List list6 = (List) map.get("icy-br");
        boolean z8 = true;
        int i9 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i8 = Integer.parseInt(str4) * zzbbd.zzq.zzf;
                if (i8 > 0) {
                    z4 = true;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid bitrate: " + str4);
                        z4 = false;
                        i8 = -1;
                    } catch (NumberFormatException unused) {
                        L.l("Invalid bitrate header: ", str4, "IcyHeaders");
                        z4 = false;
                        i7 = i8;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i10 = i9;
                        if (z4) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i8 = -1;
            }
            i7 = i8;
        } else {
            z4 = false;
            i7 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z4 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z4 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z4 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z7 = ((String) list4.get(0)).equals("1");
            z4 = true;
        } else {
            z7 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i9 = parseInt;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid metadata interval: " + str5);
                        z8 = z4;
                    } catch (NumberFormatException unused3) {
                        i9 = parseInt;
                        L.l("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i102 = i9;
                        if (z4) {
                        }
                    }
                }
                z4 = z8;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1022 = i9;
        if (z4) {
            return new IcyHeaders(i7, str, str2, str3, z7, i1022);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f10593a == icyHeaders.f10593a && t.a(this.f10594b, icyHeaders.f10594b) && t.a(this.f10595c, icyHeaders.f10595c) && t.a(this.f10596d, icyHeaders.f10596d) && this.f10597e == icyHeaders.f10597e && this.f10598f == icyHeaders.f10598f;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        String str = this.f10595c;
        if (str != null) {
            c0024i0.f387D = str;
        }
        String str2 = this.f10594b;
        if (str2 != null) {
            c0024i0.f385B = str2;
        }
    }

    public final int hashCode() {
        int i7 = (527 + this.f10593a) * 31;
        String str = this.f10594b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10595c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10596d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f10597e ? 1 : 0)) * 31) + this.f10598f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f10595c + "\", genre=\"" + this.f10594b + "\", bitrate=" + this.f10593a + ", metadataInterval=" + this.f10598f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10593a);
        parcel.writeString(this.f10594b);
        parcel.writeString(this.f10595c);
        parcel.writeString(this.f10596d);
        int i8 = t.f17153a;
        parcel.writeInt(this.f10597e ? 1 : 0);
        parcel.writeInt(this.f10598f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f10593a = parcel.readInt();
        this.f10594b = parcel.readString();
        this.f10595c = parcel.readString();
        this.f10596d = parcel.readString();
        int i7 = t.f17153a;
        this.f10597e = parcel.readInt() != 0;
        this.f10598f = parcel.readInt();
    }
}
