package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.u;
import com.google.android.datatransport.runtime.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements g {
    public static final String c;
    public static final Set<com.google.android.datatransport.c> d;
    public static final a e;
    public static final a f;

    @NonNull
    public final String a;

    @Nullable
    public final String b;

    static {
        String a = d.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = d.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a3 = d.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new com.google.android.datatransport.c("proto"), new com.google.android.datatransport.c("json"))));
        e = new a(a, null);
        f = new a(a2, a3);
    }

    public a(@NonNull String str, @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public static a b(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.g
    public final Set<com.google.android.datatransport.c> a() {
        return d;
    }

    @Override // com.google.android.datatransport.runtime.g
    @Nullable
    public final byte[] getExtras() {
        String str = this.a;
        String str2 = this.b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return u.a("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
    }
}
