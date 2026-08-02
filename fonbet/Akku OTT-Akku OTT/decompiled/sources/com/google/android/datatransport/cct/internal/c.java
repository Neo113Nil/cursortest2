package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class c extends a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String a() {
        return this.l;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String b() {
        return this.j;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String c() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String d() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.a;
        if (num == null) {
            if (aVar.l() != null) {
                return false;
            }
        } else if (!num.equals(aVar.l())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.e())) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.c())) {
            return false;
        }
        String str4 = this.e;
        if (str4 == null) {
            if (aVar.k() != null) {
                return false;
            }
        } else if (!str4.equals(aVar.k())) {
            return false;
        }
        String str5 = this.f;
        if (str5 == null) {
            if (aVar.j() != null) {
                return false;
            }
        } else if (!str5.equals(aVar.j())) {
            return false;
        }
        String str6 = this.g;
        if (str6 == null) {
            if (aVar.g() != null) {
                return false;
            }
        } else if (!str6.equals(aVar.g())) {
            return false;
        }
        String str7 = this.h;
        if (str7 == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!str7.equals(aVar.d())) {
            return false;
        }
        String str8 = this.i;
        if (str8 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!str8.equals(aVar.f())) {
            return false;
        }
        String str9 = this.j;
        if (str9 == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!str9.equals(aVar.b())) {
            return false;
        }
        String str10 = this.k;
        if (str10 == null) {
            if (aVar.h() != null) {
                return false;
            }
        } else if (!str10.equals(aVar.h())) {
            return false;
        }
        String str11 = this.l;
        return str11 == null ? aVar.a() == null : str11.equals(aVar.a());
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String f() {
        return this.i;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String i() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String j() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final String k() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    @Nullable
    public final Integer l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return androidx.concurrent.futures.a.a(sb, this.l, "}");
    }
}
