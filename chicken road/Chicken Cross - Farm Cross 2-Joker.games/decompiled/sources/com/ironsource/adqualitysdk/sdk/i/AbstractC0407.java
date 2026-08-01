package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0407 {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final List f528;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f529;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f530;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final Pattern f531;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Pattern f532;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final Pattern f533;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final Pattern f534;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final Pattern f535;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Pattern f536;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Pattern f537;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Pattern f538;

    static {
        StringFog.decrypt("pnczaPc=\n", "6hJLDYUS2G0=\n");
        f530 = StringFog.decrypt("ErMfXQ==\n", "ZsFqODjXsvU=\n");
        f529 = StringFog.decrypt("ZSCiTtE=\n", "A0HOPbRACCY=\n");
        f538 = Pattern.compile(StringFog.decrypt("FmfaE6yExIFsY+Zlt+iTmmVmixPv4baGYg==\n", "SDy7PtbF6ds=\n"));
        f537 = Pattern.compile(StringFog.decrypt("NNYYZjU3j4kWr257UkL5iQ==\n", "avQwWQ9r06s=\n"));
        f536 = Pattern.compile(StringFog.decrypt("6C3lm2CZE3HKUZODB+xlcQ==\n", "tgrNpFrFT1Y=\n"));
        f535 = Pattern.compile(StringFog.decrypt("y3plBQUCcem7emUFBQJx\n", "lSFVKDxfWrU=\n"));
        f534 = Pattern.compile(StringFog.decrypt("0Y1o+QIPkQ==\n", "j9ZY1DtSulo=\n"));
        f533 = Pattern.compile(StringFog.decrypt("fSdurU1wpEgHI1LbVhzzUw4mP60OFdY8flZTrlRd6GFQ\n", "I3wPgDcxiRI=\n"));
        f532 = Pattern.compile(StringFog.decrypt("Gdsr\n", "R/0NQMUH45g=\n"));
        f531 = Pattern.compile(StringFog.decrypt("bWFBAko=\n", "Mz09Xja4NU8=\n"));
        f528 = Arrays.asList(StringFog.decrypt("iXY=\n", "4BChaI6QlEw=\n"), StringFog.decrypt("RQ5RCw==\n", "IGIibtlBlRs=\n"), StringFog.decrypt("ElJKrg==\n", "fCcmwkAqo64=\n"), StringFog.decrypt("KYA3IqV2\n", "W+VDV9cY1vg=\n"), StringFog.decrypt("RdA4Yzo=\n", "NqVIBkgTT7c=\n"), StringFog.decrypt("oUZr\n", "1TQSMuaQikc=\n"), StringFog.decrypt("31vjqms=\n", "vDqXyQPeW+w=\n"));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0048. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x004b. Please report as an issue. */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5424(String str, String str2, String str3) {
        int length;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str3.length()) {
            int i3 = i2 + 1;
            char charAt = i3 < str3.length() ? str3.charAt(i3) : (char) 0;
            char charAt2 = str3.charAt(i2);
            if (charAt2 != '\n') {
                if (charAt2 != '%' && charAt2 != '[' && charAt2 != ']' && charAt2 != '{' && charAt2 != '}') {
                    if (charAt2 != '!') {
                        if (charAt2 != '\"') {
                            switch (charAt2) {
                                case '\'':
                                    String m5423 = m5423(f536, str3, i2);
                                    if (m5423 != null) {
                                        String substring = m5423.substring(1, m5423.length() - 1);
                                        if (substring.length() == 1) {
                                            arrayList.add(new C0866(EnumC0975.f2885, String.valueOf((int) substring.charAt(0))));
                                        } else {
                                            arrayList.add(new C0866(EnumC0975.f2886, substring));
                                        }
                                        length = substring.length();
                                        i = length + 2;
                                        i2 += i;
                                        break;
                                    } else {
                                        AbstractC1086.m5875(AbstractC0548.m5514("noieKNil\n", "0u3mTaqKg8I=\n", new StringBuilder(), str), AbstractC0548.m5514("JMwBBA==\n", "BKVvJFRY99g=\n", new StringBuilder().append(StringFog.decrypt("YhRIqRotIVdVFVOoDy0iQlUPVKFIbCUWVwlJrxxkPlgH\n", "J2Y6xmgNUTY=\n")).append(i2), str2), null, null);
                                        break;
                                    }
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                    break;
                                case '+':
                                    if (charAt != '+') {
                                        arrayList.add(new C0866(EnumC0975.f2887, "" + str3.charAt(i2)));
                                        break;
                                    } else {
                                        arrayList.add(new C0866(EnumC0975.f2887, StringFog.decrypt("L0c=\n", "BGxW3CjQlaE=\n")));
                                        i2 += 2;
                                        break;
                                    }
                                case '-':
                                    if (charAt != '-') {
                                        break;
                                    } else {
                                        arrayList.add(new C0866(EnumC0975.f2887, StringFog.decrypt("1U4=\n", "+GPznn1tdqA=\n")));
                                        i2 += 2;
                                        break;
                                    }
                                case '/':
                                    arrayList.add(new C0866(EnumC0975.f2887, "" + str3.charAt(i2)));
                                    break;
                                default:
                                    switch (charAt2) {
                                        case ':':
                                        case ';':
                                        case '?':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i2))) {
                                                EnumC0975 enumC0975 = EnumC0975.f2882;
                                                String m54232 = m5423(f533, str3, i2);
                                                if (TextUtils.isEmpty(m54232)) {
                                                    enumC0975 = EnumC0975.f2888;
                                                    m54232 = m5423(f538, str3, i2);
                                                    if (!TextUtils.isEmpty(m54232)) {
                                                        if (m54232.equals(f530) || m54232.equals(f529)) {
                                                            enumC0975 = EnumC0975.f2883;
                                                        } else if (f528.contains(m54232)) {
                                                            enumC0975 = EnumC0975.f2889;
                                                        }
                                                    }
                                                }
                                                if (TextUtils.isEmpty(m54232)) {
                                                    enumC0975 = EnumC0975.f2884;
                                                    m54232 = m5423(f535, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m54232)) {
                                                    enumC0975 = EnumC0975.f2885;
                                                    m54232 = m5423(f534, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m54232)) {
                                                    enumC0975 = EnumC0975.f2887;
                                                    m54232 = m5423(f531, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m54232)) {
                                                    enumC0975 = EnumC0975.f2887;
                                                    m54232 = m5423(f532, str3, i2);
                                                }
                                                if (!TextUtils.isEmpty(m54232)) {
                                                    arrayList.add(new C0866(enumC0975, m54232));
                                                    i = m54232.length();
                                                    i2 += i;
                                                    break;
                                                } else {
                                                    AbstractC1086.m5875(AbstractC0548.m5514("V8p46PA/\n", "G68AjYIQruM=\n", new StringBuilder(), str), AbstractC0548.m5514("o1Ck/g==\n", "gznK3qYdQtQ=\n", new StringBuilder().append(StringFog.decrypt("03E6FUm72qTvZS0UCrfVq/Q/\n", "hh9IcCrUvco=\n")).append(str3.charAt(i2)).append(StringFog.decrypt("ZG6Fgc519RIwZp7Png==\n", "RA/xob4ahns=\n")).append(i2), str2), null, null);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                    }
                            }
                        } else {
                            String m54233 = m5423(f537, str3, i2);
                            if (m54233 == null) {
                                AbstractC1086.m5875(AbstractC0548.m5514("ghkqDq2D\n", "znxSa9+sbG0=\n", new StringBuilder(), str), AbstractC0548.m5514("zdIX+A==\n", "7bt52AvW7Ag=\n", new StringBuilder().append(StringFog.decrypt("cz1O7GIuLRdEPFXtdy4uAkQmUuQwbylWRiBP6mRnMhgW\n", "Nk88gxAOXXY=\n")).append(i2), str2), null, null);
                            } else {
                                String substring2 = m54233.substring(1, m54233.length() - 1);
                                arrayList.add(new C0866(EnumC0975.f2886, substring2));
                                length = substring2.length();
                                i = length + 2;
                                i2 += i;
                            }
                        }
                    }
                    if (charAt == '=') {
                        arrayList.add(new C0866(EnumC0975.f2887, AbstractC1257.m5940("zg==\n", "8+7M6bSEsOg=\n", new StringBuilder().append(str3.charAt(i2)))));
                        i2 += 2;
                    } else {
                        arrayList.add(new C0866(EnumC0975.f2887, "" + str3.charAt(i2)));
                    }
                }
                arrayList.add(new C0866(EnumC0975.f2887, "" + str3.charAt(i2)));
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5423(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        matcher.region(i, str.length());
        if (matcher.find()) {
            return str.substring(matcher.start(), matcher.end());
        }
        return null;
    }
}
