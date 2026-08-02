package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873xd {

    /* JADX INFO: renamed from: c */
    public static final String f8888c;

    /* JADX INFO: renamed from: d */
    public static final Set f8889d;

    /* JADX INFO: renamed from: e */
    public static final C0873xd f8890e;

    /* JADX INFO: renamed from: f */
    public static final C0873xd f8891f;

    /* JADX INFO: renamed from: a */
    public final String f8892a;

    /* JADX INFO: renamed from: b */
    public final String f8893b;

    static {
        String strM3499h = n80.m3499h("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8888c = strM3499h;
        String strM3499h2 = n80.m3499h("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM3499h3 = n80.m3499h("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8889d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C0818vw("proto"), new C0818vw("json"))));
        f8890e = new C0873xd(strM3499h, null);
        f8891f = new C0873xd(strM3499h2, strM3499h3);
    }

    public C0873xd(String str, String str2) {
        this.f8892a = str;
        this.f8893b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C0873xd m5618a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            C0270h1.m2190f("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            C0270h1.m2190f("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            C0270h1.m2190f("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new C0873xd(str2, str3.isEmpty() ? null : str3);
    }
}
