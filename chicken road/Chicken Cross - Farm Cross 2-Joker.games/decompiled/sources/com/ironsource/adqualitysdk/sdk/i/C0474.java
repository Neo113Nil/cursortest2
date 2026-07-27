package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ί, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0474 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f915;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f916;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f917;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f918;

    public C0474(boolean z, List list, String str, String str2) {
        this.f918 = z;
        this.f917 = Collections.unmodifiableList(new ArrayList(list));
        this.f916 = str;
        this.f915 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0474.class != obj.getClass()) {
            return false;
        }
        C0474 c0474 = (C0474) obj;
        if (this.f918 != c0474.f918 || !this.f917.equals(c0474.f917)) {
            return false;
        }
        String str = this.f916;
        if (str == null ? c0474.f916 != null : !str.equals(c0474.f916)) {
            return false;
        }
        String str2 = this.f915;
        String str3 = c0474.f915;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int hashCode = (this.f917.hashCode() + ((this.f918 ? 1 : 0) * 31)) * 31;
        String str = this.f916;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f915;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("r79w33urZLytqGzcfrt6vYqufMxhvDw=\n", "/80fqRLPAc4=\n") + this.f918 + StringFog.decrypt("xOQamHOObBeb+Q==\n", "6MRp8RTgDXs=\n") + this.f917 + StringFog.decrypt("o3T7jiZJ+e+o\n", "j1SP4U0sl9I=\n") + this.f916 + '\'' + StringFog.decrypt("T9bYH+E1brdE\n", "Y/a9bZNaHIo=\n") + this.f915 + "'}";
    }
}
