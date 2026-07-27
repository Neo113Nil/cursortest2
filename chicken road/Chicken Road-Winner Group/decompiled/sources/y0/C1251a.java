package y0;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import x0.C1249b;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10569c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f10570d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1251a f10571e;

    /* renamed from: a, reason: collision with root package name */
    public final String f10572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10573b;

    static {
        String B3 = F2.b.B("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f10569c = B3;
        F2.b.B("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        F2.b.B("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f10570d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1249b("proto"), new C1249b("json"))));
        f10571e = new C1251a(B3, null);
    }

    public C1251a(String str, String str2) {
        this.f10572a = str;
        this.f10573b = str2;
    }

    public static C1251a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(CharEncoding.UTF_8));
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
        return new C1251a(str2, str3);
    }
}
