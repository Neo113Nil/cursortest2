package com.ironsource.adqualitysdk.sdk.i;

import android.util.Pair;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0619 {

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1599;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1600;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1601;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1602;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1603;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1604;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1605;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1606;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1607;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1608;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1609;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1610;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1611;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final HashMap f1612;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final HashMap f1613;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public int f1616 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public int f1615 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    public byte f1614 = 0;

    static {
        StringFog.decrypt("CE+/65z9\n", "WC7NmPmP9vk=\n");
        f1611 = StringFog.decrypt("1ow=\n", "v+rOB8xge4U=\n");
        f1610 = StringFog.decrypt("JzASvw==\n", "Qlxh2vD+1RU=\n");
        f1609 = StringFog.decrypt("oThI\n", "x1c6Ku7B/j4=\n");
        f1608 = StringFog.decrypt("7LM/k9k=\n", "m9tW/7xEOaQ=\n");
        f1607 = StringFog.decrypt("vhisQJAe\n", "zH3YNeJw84M=\n");
        f1606 = StringFog.decrypt("zePfZDM=\n", "r5G6BViqGZg=\n");
        f1605 = StringFog.decrypt("LoOI1S+r4iQ=\n", "TezmoUbFl0E=\n");
        f1604 = StringFog.decrypt("Vw==\n", "LEWyMoMHX58=\n");
        f1603 = StringFog.decrypt("p9hY\n", "06oh9BHcrmE=\n");
        f1602 = StringFog.decrypt("DpV6CGM=\n", "bfQOawtbg3Q=\n");
        f1601 = StringFog.decrypt("b6T6bw==\n", "AdGWA0PTYOo=\n");
        f1600 = StringFog.decrypt("vKeWwEM=\n", "z9LmpTHrPTw=\n");
        f1599 = StringFog.decrypt("rb5j\n", "298RgywCfJQ=\n");
        f1613 = new HashMap();
        f1612 = new HashMap();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final AbstractC0411 m5566(List list) {
        char c;
        AbstractC0411 m5568 = m5568(list);
        if (this.f1616 >= list.size()) {
            return m5568;
        }
        String str = m5575(list).f2485;
        int hashCode = str.hashCode();
        if (hashCode == 43) {
            if (str.equals(StringFog.decrypt("dQ==\n", "Xk7bi/1/Ux4=\n"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 45) {
            if (str.equals(StringFog.decrypt("7Q==\n", "wD0GJ5zXCq4=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 1376) {
            if (hashCode == 1440 && str.equals(StringFog.decrypt("vVY=\n", "kHtSm+Cn87s=\n"))) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("hZs=\n", "rrA0UyLCARg=\n"))) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return m5564(new C0568(m5568, m5566(list)));
        }
        if (c == 1) {
            return m5564(new C0921(m5568, m5566(list)));
        }
        if (c == 2) {
            return m5564(new C0538((C1055) m5568));
        }
        if (c == 3) {
            return m5564(new C0550((C1055) m5568));
        }
        this.f1616--;
        return m5568;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final AbstractC0411 m5567(List list) {
        char c;
        AbstractC0411 m5570 = m5570(list);
        while (this.f1616 < list.size()) {
            String str = m5575(list).f2485;
            int hashCode = str.hashCode();
            if (hashCode != 46) {
                if (hashCode == 91 && str.equals(StringFog.decrypt("GA==\n", "Q8fWWSeR5/Q=\n"))) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("0Q==\n", "/4affFGVJNE=\n"))) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                m5570 = m5574(m5570, list);
            } else {
                if (c != 1) {
                    this.f1616--;
                    return m5570;
                }
                AbstractC0411 m5569 = m5569(list);
                m5578(m5575(list), StringFog.decrypt("HQ==\n", "QPEnkXcM7Fs=\n"), m5569, StringFog.decrypt("q1AWUVYvOf2sBQdKWig86fhHEQJWMT/+vUFUVVwpOK3/eFM=\n", "2CV0IjVdUI0=\n"));
                if (m5575(list).f2485.equals(StringFog.decrypt("Tg==\n", "c92dJbAk7j8=\n"))) {
                    m5570 = m5564(new C0973(m5570, m5569, m5569(list)));
                } else {
                    this.f1616--;
                    m5570 = m5564(new C0979(m5570, m5569));
                }
            }
        }
        return m5570;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC0411 m5568(List list) {
        char c;
        AbstractC0411 m5567 = m5567(list);
        if (this.f1616 >= list.size()) {
            return m5567;
        }
        String str = m5575(list).f2485;
        int hashCode = str.hashCode();
        if (hashCode == 37) {
            if (str.equals(StringFog.decrypt("Gg==\n", "P7k1aeYl9ng=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 42) {
            if (hashCode == 47 && str.equals(StringFog.decrypt("eg==\n", "VSltQEfVKz0=\n"))) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("sA==\n", "moVq1AVnSbc=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m5564(new C0721(m5567, m5568(list)));
        }
        if (c == 1) {
            return m5564(new C0539(m5567, m5568(list)));
        }
        if (c == 2) {
            return m5564(new C0915(m5567, m5568(list)));
        }
        this.f1616--;
        return m5567;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0411 m5569(List list) {
        char c;
        AbstractC0411 m5573 = m5573(list);
        if (this.f1616 >= list.size()) {
            return m5573;
        }
        String str = m5575(list).f2485;
        int hashCode = str.hashCode();
        if (hashCode != 1216) {
            if (hashCode == 3968 && str.equals(StringFog.decrypt("wRQ=\n", "vWirpRNXHtM=\n"))) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("jBw=\n", "qjqSFdKPr98=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m5564(new C0933(m5573, m5569(list)));
        }
        if (c == 1) {
            return m5564(new C0819(m5573, m5569(list)));
        }
        this.f1616--;
        return m5573;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0411 m5570(List list) {
        C0866 m5575 = m5575(list);
        EnumC0975 enumC0975 = m5575.f2486;
        char c = 65535;
        if (enumC0975 == EnumC0975.f2888) {
            String str = m5575.f2485;
            String str2 = m5575(list).f2485;
            int hashCode = str2.hashCode();
            if (hashCode != 40) {
                if (hashCode == 61 && str2.equals(StringFog.decrypt("eQ==\n", "RATkNguZUo8=\n"))) {
                    c = 0;
                }
            } else if (str2.equals(StringFog.decrypt("1A==\n", "/N7kTqEqmV4=\n"))) {
                c = 1;
            }
            if (c == 0) {
                return m5564(new C0705((C1055) m5564(new C1055(str)), m5569(list)));
            }
            if (c == 1) {
                return m5564(new C0504(str, m5577(list, StringFog.decrypt("tg==\n", "n55SXF39qo0=\n"), new C0638(this))));
            }
            this.f1616--;
            return m5564(new C1055(str));
        }
        if (enumC0975 == EnumC0975.f2886 || enumC0975 == EnumC0975.f2885 || enumC0975 == EnumC0975.f2884 || enumC0975 == EnumC0975.f2883) {
            if (enumC0975 == EnumC0975.f2885) {
                try {
                    try {
                        return m5564(new C1279(Integer.valueOf(Integer.parseInt(m5575.f2485))));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    return m5564(new C0725(Long.valueOf(Long.parseLong(m5575.f2485))));
                }
            } else {
                if (enumC0975 == EnumC0975.f2884) {
                    return m5564(new C0535(Double.valueOf(Double.parseDouble(m5575.f2485))));
                }
                if (enumC0975 == EnumC0975.f2883) {
                    return m5564(new C0573(Boolean.valueOf(Boolean.parseBoolean(m5575.f2485))));
                }
            }
            return m5564(new C1206(m5575.f2485));
        }
        if (enumC0975 == EnumC0975.f2882) {
            return m5564(new C1183(m5575.f2485));
        }
        if (enumC0975 == EnumC0975.f2889) {
            String str3 = m5575.f2485;
            int hashCode2 = str3.hashCode();
            if (hashCode2 != 3392903) {
                if (hashCode2 == 109801339 && str3.equals(f1600)) {
                    c = 1;
                }
            } else if (str3.equals(f1601)) {
                c = 0;
            }
            if (c == 0) {
                synchronized (C0401.class) {
                }
                return C0401.f518;
            }
            if (c != 1) {
                return null;
            }
            m5578(m5575(list), StringFog.decrypt("Dg==\n", "IHr6gc79260=\n"), m5575, StringFog.decrypt("DtklcQVtSOgS2TlwVy9eoBvDOXgYOl7kXc4sNBZtVuUJxDpwVyRV9hLPNGAeIlU=\n", "faxVFHdNO4A=\n"));
            return m5574(m5564(new C1055(f1600)), list);
        }
        if (enumC0975 != EnumC0975.f2887) {
            m5579(StringFog.decrypt("pUxl1KuqZNmVRiDYtKRiw9A=\n", "8CIArNvPB60=\n") + m5575);
            throw null;
        }
        String str4 = m5575.f2485;
        int hashCode3 = str4.hashCode();
        if (hashCode3 != 33) {
            if (hashCode3 != 40) {
                if (hashCode3 != 45) {
                    if (hashCode3 != 91) {
                        if (hashCode3 == 123 && str4.equals(f1604)) {
                            c = 2;
                        }
                    } else if (str4.equals(StringFog.decrypt("Dw==\n", "VGV2atEQJ9Q=\n"))) {
                        c = 1;
                    }
                } else if (str4.equals(StringFog.decrypt("NA==\n", "GaFnFyvcIO0=\n"))) {
                    c = 4;
                }
            } else if (str4.equals(StringFog.decrypt("dg==\n", "Xkhl8L3GJYc=\n"))) {
                c = 0;
            }
        } else if (str4.equals(StringFog.decrypt("YA==\n", "QbOwJgDV9r0=\n"))) {
            c = 3;
        }
        if (c == 0) {
            AbstractC0411 m5564 = m5564(new C0742(m5569(list)));
            m5578(m5575(list), StringFog.decrypt("vQ==\n", "lJu6IyUiuGU=\n"), m5564, StringFog.decrypt("7rQMM7IZoi/gsRAzshmiL6T0WA==\n", "g91/QNt3xQ8=\n"));
            return m5564;
        }
        if (c == 1) {
            return m5564(new C0707(m5577(list, StringFog.decrypt("+A==\n", "pVoWptXnNik=\n"), new C0638(this))));
        }
        if (c != 2) {
            if (c == 3) {
                return m5564(new C0403(m5567(list)));
            }
            if (c == 4) {
                return m5564(new C0921(m5564(new C1279(0)), m5570(list)));
            }
            m5579(StringFog.decrypt("zCwt9Nai6FD8Jmjj1qL5Re0tOqw=\n", "mUJIjKbHiyQ=\n") + m5575.f2485);
            throw null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = m5577(list, StringFog.decrypt("ag==\n", "F5UWsng5J9s=\n"), new C0709(this)).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put((String) pair.first, (AbstractC0411) pair.second);
        }
        return m5564(new C0629(hashMap));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0395 m5572(ArrayList arrayList) {
        char c;
        AbstractC0411 abstractC0411;
        String str = m5575((List) arrayList).f2485;
        switch (str.hashCode()) {
            case -934396624:
                if (str.equals(f1607)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -567202649:
                if (str.equals(f1605)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 59:
                if (str.equals(StringFog.decrypt("KA==\n", "E0I5uFQ/RGg=\n"))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                if (str.equals(f1604)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3357:
                if (str.equals(f1611)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 101577:
                if (str.equals(f1609)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 115131:
                if (str.equals(f1603)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 116519:
                if (str.equals(f1599)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 94001407:
                if (str.equals(f1606)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 113101617:
                if (str.equals(f1608)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        AbstractC0395 abstractC0395 = null;
        AbstractC0411 abstractC04112 = null;
        abstractC0395 = null;
        switch (c) {
            case 0:
                return m5563(new C0818(null));
            case 1:
                m5580(arrayList, StringFog.decrypt("/g==\n", "1u8klF0B4Q0=\n"), StringFog.decrypt("z9ppOB3KoWDL2Sc/Sdi9atPQLWsLzvVjydAlJB7OsSXExWkqSYz9Ig==\n", "prxJS2mr1QU=\n"));
                AbstractC0411 m5569 = m5569(arrayList);
                m5578(m5575((List) arrayList), StringFog.decrypt("LQ==\n", "BDD0ojt+UC8=\n"), m5569, StringFog.decrypt("VgPKCXerTvpSAIQOI6lV8VsMnhNspBrsVwqfFmfqWPofDIQJaq5fvxhNw10=\n", "P2XqegPKOp8=\n"));
                AbstractC0395 m5572 = m5572(arrayList);
                if (this.f1616 < arrayList.size()) {
                    if (m5571(arrayList).f2485.equals(f1610)) {
                        this.f1616++;
                        abstractC0395 = m5572(arrayList);
                    }
                }
                return m5563(new C0828(m5569, m5572, abstractC0395, this.f1614));
            case 2:
                m5580(arrayList, StringFog.decrypt("HQ==\n", "NY9YZjp6hoI=\n"), StringFog.decrypt("otnARZab7Aeh29cLkc/+G6vD3gHFjehTotneCYqY6Bfk1MtFhM+qW+M=\n", "xLayZeXvjXM=\n"));
                String decrypt = StringFog.decrypt("Lw==\n", "FO8Z3rkRrX8=\n");
                if (m5571(arrayList).f2485.equals(decrypt)) {
                    abstractC0411 = null;
                } else {
                    abstractC0411 = m5569(arrayList);
                    m5578(m5575((List) arrayList), decrypt, abstractC0411, AbstractC0548.m5514("GzE0z9H8hdZUJDjWzPeXyR0uLobN+ovPGCVgw9D2xM0dNSiG\n", "dEFApr6S5Lo=\n", new StringBuilder(), decrypt));
                }
                AbstractC0411 m55692 = m5569(arrayList);
                m5578(m5575((List) arrayList), StringFog.decrypt("JQ==\n", "HhmJTiUm1VI=\n"), m55692, StringFog.decrypt("TLG0zHArnHBDqq+DfWSBfEWrqogzIZxwCqmvmHtk1S8N\n", "Kt7G7BNE8hQ=\n"));
                String decrypt2 = StringFog.decrypt("jA==\n", "pb3M2WuLg40=\n");
                if (!m5571(arrayList).f2485.equals(decrypt2)) {
                    abstractC04112 = m5569(arrayList);
                    m5578(m5575((List) arrayList), decrypt2, abstractC04112, AbstractC0548.m5514("GzE0z9H8hdZUJDjWzPeXyR0uLobN+ovPGCVgw9D2xM0dNSiG\n", "dEFApr6S5Lo=\n", new StringBuilder(), decrypt2));
                }
                return m5563(new C0812(abstractC0411, m55692, abstractC04112, m5572(arrayList)));
            case 3:
                m5580(arrayList, StringFog.decrypt("eA==\n", "UJRUKbikKrM=\n"), StringFog.decrypt("1yC5Bf1hnpHBPLUE/S+ZxdMgvxz0Jc2HxWi2BvQtgpLFLPAL4WGMxYdg9w==\n", "oEjQaZhB7eU=\n"));
                AbstractC0411 m55693 = m5569(arrayList);
                m5580(arrayList, StringFog.decrypt("pw==\n", "jrp5gzd9578=\n"), StringFog.decrypt("AzXG3JMhlioVKcrdk2+RfhcywdSfdYwxGn3c2Jl0iTpUP8qQn2+WNxA4j5feKMI=\n", "dF2vsPYB5V4=\n"));
                return m5563(new W(m55693, m5572(arrayList)));
            case 4:
                AbstractC0395 m5563 = m5571(arrayList).f2485.equals(StringFog.decrypt("oA==\n", "m7//NMwSD2U=\n")) ? m5563(new C1189(null)) : m5563(new C1189(m5569(arrayList)));
                m5578(m5575((List) arrayList), StringFog.decrypt("qw==\n", "kNumYY4sbfg=\n"), m5563, StringFog.decrypt("qpdQorQIDBmsk1CyqwNCHviBTLizCkhKvZxA97EPWAL41R/w\n", "2PIk18ZmLGo=\n"));
                return m5563;
            case 5:
                m5580(arrayList, StringFog.decrypt("iA==\n", "s8SElzMZQg0=\n"), StringFog.decrypt("rudajLx4fHOt4VqAsjZ7J7/9UJi7PC9iovEfmr4sZyfrrhg=\n", "zJU/7ddYDwc=\n"));
                return m5563(new C0561());
            case 6:
                m5580(arrayList, StringFog.decrypt("JQ==\n", "HqKzf+OcahQ=\n"), StringFog.decrypt("UQb2sYNugnoSGuyknmWaelwduLaCb4JzVkn9q44ggHZGAbji0Sc=\n", "MmmYxeoA9x8=\n"));
                return m5563(new C0637());
            case 7:
                return m5576(arrayList);
            case '\b':
                String str2 = f1604;
                m5580(arrayList, str2, StringFog.decrypt("F3gupBtSydwGZzLqHAbF3RB+d+YNBsvHDno48QZCiIAKZCTtDEOIjxh3cK0=\n", "YwpXhGgmqKg=\n"));
                C1105 m5576 = m5576(arrayList);
                m5580(arrayList, f1602, StringFog.decrypt("JnCEhAd3xQk3b5jKACPXFT13kcBUYcFdNG2RyBt0wRlyYISEFSPHHCZhlYQHd8UJN2+YygA=\n", "UgL9pHQDpH0=\n"));
                m5580(arrayList, StringFog.decrypt("8Q==\n", "2UZ9SfPvNdM=\n"), StringFog.decrypt("12iOPfG8iUvNfpUs/byRRtt8ljq5/ocO0maWMvbrh0qUa4N++LzFBpM=\n", "tAn6Xpmc4i4=\n"));
                C0866 m5575 = m5575((List) arrayList);
                EnumC0975 enumC0975 = EnumC0975.f2888;
                String decrypt3 = StringFog.decrypt("Iw0ThhtHr4MtBRSWGgm+wjwNAZceTOjNLwkF\n", "TmRg9XIpyKM=\n");
                if (!m5575.f2486.equals(enumC0975)) {
                    m5579(m5565(enumC0975.toString(), m5575.f2486.toString(), m5576, decrypt3));
                    throw null;
                }
                C1055 c1055 = (C1055) m5564(new C1055(m5575.f2485));
                m5580(arrayList, StringFog.decrypt("ZA==\n", "TeLQRIVoUQc=\n"), StringFog.decrypt("v73KtlE5OoCuvdP1SnEllLC4nrdcOSyOsLDRolx9aoOl/N/1HjBt\n", "3Ny+1TkZSuE=\n"));
                m5580(arrayList, str2, StringFog.decrypt("XruRtpswwgZcroC4ln7FUlCvlqHTctRSXrWIpZxl3xYd8oy7gHnVFx39nqjUOQ==\n", "Pdrl1fMQsXI=\n"));
                return m5563(new C0644(m5576, m5576(arrayList), c1055));
            case '\t':
                return m5563(new C0461(m5577(arrayList, StringFog.decrypt("Jg==\n", "HW6uW8KjeDA=\n"), new C0717(this))));
            default:
                this.f1616--;
                AbstractC0411 m55694 = m5569(arrayList);
                m5578(m5575((List) arrayList), StringFog.decrypt("PA==\n", "Byy6Fh3/pGk=\n"), m55694, StringFog.decrypt("Fh6/KWXkao1cTOt6bf4tyBUT7DVqqn7ZGgOpN2nkeQ==\n", "e3fMWgyKDa0=\n"));
                return m5563(new C0818(m55694));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5578(C0866 c0866, String str, Object obj, String str2) {
        if (c0866.f2485.equals(str)) {
            return;
        }
        m5579(m5565(AbstractC1257.m5940("HQ==\n", "OiyBCZ4MxKI=\n", AbstractC1196.m5920("KQ==\n", "DmOB+IYQyc4=\n", new StringBuilder(), str)), AbstractC1257.m5940("cQ==\n", "Vkdtom5UP7E=\n", new StringBuilder().append(StringFog.decrypt("EA==\n", "Ny1/UvnMJL0=\n")).append(c0866.f2485)), obj, str2));
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0866 m5571(ArrayList arrayList) {
        try {
            if (this.f1616 < arrayList.size()) {
                return (C0866) arrayList.get(this.f1616);
            }
            return null;
        } catch (Exception e) {
            throw new C1119(this.f1615, StringFog.decrypt("koR6IRbklTS53G4sD/yZe6eZfC8P/pt7tog5KgPoiHujk3IhCA==\n", "1/wZRGaQ/Fs=\n"), e);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 m5573(List list) {
        char c;
        AbstractC0411 m5566 = m5566(list);
        if (this.f1616 >= list.size()) {
            return m5566;
        }
        String str = m5575(list).f2485;
        int hashCode = str.hashCode();
        if (hashCode == 60) {
            if (str.equals(StringFog.decrypt("SQ==\n", "dVfN2+k1s9s=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 62) {
            if (str.equals(StringFog.decrypt("Mw==\n", "DdJiiglaT+c=\n"))) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 1084) {
            if (str.equals(StringFog.decrypt("Hk0=\n", "P3Cvd5nJaw8=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 1921) {
            if (str.equals(StringFog.decrypt("ZSs=\n", "WRY/VWKKRfk=\n"))) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 1952) {
            if (hashCode == 1983 && str.equals(StringFog.decrypt("MDA=\n", "Dg1XN0pLG4c=\n"))) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("Mhs=\n", "DyZGjNw4Kk0=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m5564(new C0489(m5566, m5573(list)));
        }
        if (c == 1) {
            return m5564(new C0426(m5566, m5573(list)));
        }
        if (c == 2) {
            return m5564(new C0469(m5566, m5573(list)));
        }
        if (c == 3) {
            return m5564(new C1186(m5566, m5573(list)));
        }
        if (c == 4) {
            return m5564(new C0413(m5566, m5573(list)));
        }
        if (c != 5) {
            this.f1616--;
            return m5566;
        }
        return m5564(new C1182(m5566, m5573(list)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC0411 m5564(AbstractC0411 abstractC0411) {
        HashMap hashMap = f1613;
        AbstractC0411 abstractC04112 = (AbstractC0411) hashMap.get(abstractC0411);
        if (abstractC04112 != null) {
            return abstractC04112;
        }
        hashMap.put(abstractC0411, abstractC0411);
        return abstractC0411;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC0395 m5563(AbstractC0395 abstractC0395) {
        HashMap hashMap = f1612;
        AbstractC0395 abstractC03952 = (AbstractC0395) hashMap.get(abstractC0395);
        if (abstractC03952 != null) {
            return abstractC03952;
        }
        hashMap.put(abstractC0395, abstractC0395);
        return abstractC0395;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1105 m5576(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        byte b = (byte) (this.f1614 + 1);
        this.f1614 = b;
        C0866 m5571 = m5571(arrayList);
        while (!m5571.f2485.equals(StringFog.decrypt("cg==\n", "D7Yiy5T18xg=\n"))) {
            this.f1615++;
            arrayList2.add(m5572(arrayList));
            m5571 = m5571(arrayList);
        }
        this.f1616++;
        this.f1615++;
        this.f1614 = (byte) (this.f1614 - 1);
        return (C1105) m5563(new C1105(arrayList2, b));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 m5574(AbstractC0411 abstractC0411, List list) {
        C0866 m5575 = m5575(list);
        ArrayList arrayList = null;
        if (m5575.f2486 == EnumC0975.f2888) {
            String str = m5575.f2485;
            C0866 m55752 = m5575(list);
            if (m55752.f2485.equals(StringFog.decrypt("kA==\n", "rJ+6aw4ZIkM=\n"))) {
                arrayList = m5577(list, StringFog.decrypt("HQ==\n", "I64K9T/afX4=\n"), new C0686(this));
                m5578(m5575(list), StringFog.decrypt("kg==\n", "ugG9at+G5Qc=\n"), arrayList, StringFog.decrypt("vU1H6bgkCnCgRgHmsSYNau9GQOi4NF5qp0dU6blnHHzvTk7psSgJfKsIQ/z9LhBvoEtA8bQoEDno\nAA+r825Z\n", "zyghhd1Hfhk=\n"));
            } else {
                if (!m55752.f2485.equals(StringFog.decrypt("nw==\n", "t68A0fcItZU=\n"))) {
                    this.f1616--;
                    return m5564(new C0344(abstractC0411, str));
                }
            }
            return m5564(new C1117(abstractC0411, str, arrayList, m5577(list, StringFog.decrypt("0g==\n", "+2ZzI3rvWWo=\n"), new C0638(this))));
        }
        throw new C1119(this.f1615, StringFog.decrypt("igklmcV9bwXvGDGZyH1jB6YUJ9zEfH5BqB4h3A==\n", "z3FV/KYJCmE=\n") + m5575, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Pair m5562(C0619 c0619, List list) {
        C0866 m5575 = c0619.m5575(list);
        if (m5575.f2486 == EnumC0975.f2886) {
            String str = m5575.f2485;
            c0619.m5578(c0619.m5575(list), StringFog.decrypt("6g==\n", "0DNqJRvs8ys=\n"), str, StringFog.decrypt("XuNGd8P5hwkU40F2lv6GUFb1CX+M/o4fQ/VNOYHrwhEU5kh1lvfCEVLkTGvDtdhX\n", "NJApGeOS4nA=\n"));
            return new Pair(str, c0619.m5569(list));
        }
        throw new C1119(c0619.f1615, StringFog.decrypt("6a3PttZNPPSMhsuh3Fc+sM6gy/PSVi2w\n", "rNW/07U5WZA=\n") + m5575, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m5577(List list, String str, InterfaceC0620 interfaceC0620) {
        ArrayList arrayList = new ArrayList();
        if (!m5575(list).f2485.equals(str)) {
            this.f1616--;
            arrayList.add(interfaceC0620.mo5581(list));
            C0866 m5575 = m5575(list);
            while (m5575.f2485.equals(StringFog.decrypt("cQ==\n", "XapcNscyw/0=\n"))) {
                arrayList.add(interfaceC0620.mo5581(list));
                m5575 = m5575(list);
            }
            m5578(m5575, str, arrayList, AbstractC1257.m5940("IQ==\n", "BuSzzxfsUeY=\n", AbstractC1196.m5920("N2SsR1uxnN0uYbsTHqyQkixkq1tb5Q==\n", "Ww3fM3vC9LI=\n", new StringBuilder(), str)));
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0866 m5575(List list) {
        try {
            if (this.f1616 < list.size()) {
                int i = this.f1616;
                this.f1616 = i + 1;
                return (C0866) list.get(i);
            }
            throw new C1119(this.f1615, StringFog.decrypt("VogWau0EwpVmglN38wWBjmXGB332BM+S\n", "A+ZzEp1hoeE=\n"), null);
        } catch (Exception e) {
            throw new C1119(this.f1615, StringFog.decrypt("p0Z29vK4X7qMHmL766BT9YVbYefrolH1jFtt56K4Wb6HUA==\n", "4j4Vk4LMNtU=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5580(ArrayList arrayList, String str, String str2) {
        m5578(m5575((List) arrayList), str, (Object) null, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5565(String str, String str2, Object obj, String str3) {
        return AbstractC1196.m5920("cFoQWgLK3T41URNLRpg=\n", "UDhlLiK4uF0=\n", new StringBuilder().append(StringFog.decrypt("ZFzGwezjOQIB\n", "ISS2pI+XXGY=\n")).append(str).append(obj != null ? StringFog.decrypt("53hPSqzClw==\n", "xxkpPsmwtxk=\n") + obj : ""), str2).append(str3 != null ? AbstractC0548.m5514("k6am\n", "s4uG06Nh+rA=\n", new StringBuilder(), str3) : "").toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5579(String str) {
        throw new C1119(this.f1615, str, null);
    }
}
