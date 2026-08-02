package a4;

import J0.C3354v2;
import j3.s;
import j3.t;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m3.s;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4940b implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f36254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36255b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36256c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36257d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36259f;

    public C4940b(String str, String str2, int i11, int i12, boolean z11, String str3) {
        G10.a.c(i12 == -1 || i12 > 0);
        this.f36254a = i11;
        this.f36255b = str;
        this.f36256c = str2;
        this.f36257d = str3;
        this.f36258e = z11;
        this.f36259f = i12;
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
    public static C4940b d(Map<String, List<String>> map) {
        boolean z11;
        int i11;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean z12;
        List<String> list5;
        int i12;
        List<String> list6 = map.get("icy-br");
        boolean z13 = true;
        int i13 = -1;
        if (list6 != null) {
            String str4 = list6.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z11 = true;
                } else {
                    try {
                        s.f("IcyHeaders", "Invalid bitrate: " + str4);
                        z11 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        C3354v2.f("Invalid bitrate header: ", str4, "IcyHeaders");
                        z11 = false;
                        i11 = i12;
                        list = map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i14 = i13;
                        if (z11) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
            i11 = i12;
        } else {
            z11 = false;
            i11 = -1;
        }
        list = map.get("icy-genre");
        if (list == null) {
            str = list.get(0);
            z11 = true;
        } else {
            str = null;
        }
        list2 = map.get("icy-name");
        if (list2 == null) {
            str2 = list2.get(0);
            z11 = true;
        } else {
            str2 = null;
        }
        list3 = map.get("icy-url");
        if (list3 == null) {
            str3 = list3.get(0);
            z11 = true;
        } else {
            str3 = null;
        }
        list4 = map.get("icy-pub");
        if (list4 == null) {
            z12 = list4.get(0).equals("1");
            z11 = true;
        } else {
            z12 = false;
        }
        list5 = map.get("icy-metaint");
        if (list5 != null) {
            String str5 = list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i13 = parseInt;
                } else {
                    try {
                        s.f("IcyHeaders", "Invalid metadata interval: " + str5);
                        z13 = z11;
                    } catch (NumberFormatException unused3) {
                        i13 = parseInt;
                        C3354v2.f("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i142 = i13;
                        if (z11) {
                        }
                    }
                }
                z11 = z13;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1422 = i13;
        if (z11) {
            return new C4940b(str, str2, i11, i1422, z12, str3);
        }
        return null;
    }

    @Override // j3.t.a
    public final void a(s.a aVar) {
        String str = this.f36256c;
        if (str != null) {
            aVar.Y(str);
        }
        String str2 = this.f36255b;
        if (str2 != null) {
            aVar.R(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4940b.class == obj.getClass()) {
            C4940b c4940b = (C4940b) obj;
            if (this.f36254a == c4940b.f36254a && Objects.equals(this.f36255b, c4940b.f36255b) && Objects.equals(this.f36256c, c4940b.f36256c) && Objects.equals(this.f36257d, c4940b.f36257d) && this.f36258e == c4940b.f36258e && this.f36259f == c4940b.f36259f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (527 + this.f36254a) * 31;
        String str = this.f36255b;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36256c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36257d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f36258e ? 1 : 0)) * 31) + this.f36259f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f36256c + "\", genre=\"" + this.f36255b + "\", bitrate=" + this.f36254a + ", metadataInterval=" + this.f36259f;
    }
}
