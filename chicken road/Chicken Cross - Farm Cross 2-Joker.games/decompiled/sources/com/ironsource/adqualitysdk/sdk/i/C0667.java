package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.ktor.sse.ServerSentEventKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.গ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0667 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1819 = StringFog.decrypt("qDON\n", "5hzMon93iGI=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public String f1822;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f1823;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f1824;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f1825;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String f1826;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String f1827;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public EnumC0670 f1821 = EnumC0670.f1836;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public EnumC0676 f1820 = EnumC0676.f1847;

    public C0667(String str) {
        this.f1827 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5612(EnumC0670 enumC0670) {
        String str;
        String str2;
        this.f1821 = enumC0670;
        EnumC0670 enumC06702 = EnumC0670.f1831;
        if (enumC0670 != enumC06702) {
            this.f1820 = EnumC0676.f1847;
        }
        int ordinal = enumC0670.ordinal();
        if (ordinal == 1) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 2) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 3) {
            System.currentTimeMillis();
        } else if (ordinal != 4 && ordinal != 5) {
            return;
        }
        if (this.f1827.equals(StringFog.decrypt("KT7KObM0SQ==\n", "fluob9pRPqw=\n"))) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String m5940 = AbstractC1257.m5940("jBpXgKhJg13DCxg=\n", "rHk47sYs4Ck=\n", new StringBuilder().append(StringFog.decrypt("XzyJlxH5E5RfPImXEfke\n", "chGkujzUPrk=\n")).append(this.f1827));
        if (this.f1826 != null) {
            m5940 = m5940 + this.f1826 + ServerSentEventKt.SPACE;
        }
        sb.append(sb2.append(m5940 + StringFog.decrypt("jDwPEGYH7HSMPA8QZgc=\n", "oREiPUsqwVk=\n")).append("\n").toString());
        String str3 = null;
        if (this.f1827 == null || (str2 = this.f1825) == null) {
            str = null;
        } else {
            if (str2.equals(f1819) && this.f1821 != EnumC0670.f1832) {
                str2 = StringFog.decrypt("8YyILDLo96XXhpg=\n", "v+P8DFSNg8Y=\n");
            }
            str = AbstractC0548.m5514("vr3NiTmVTWnth+asI8M=\n", "nu6JwhnjKBs=\n", new StringBuilder().append(this.f1827), str2);
        }
        if (str != null) {
            sb.append(str.concat("\n"));
        }
        if (this.f1824 != null && this.f1823 != null) {
            str3 = StringFog.decrypt("t/KZpblp4bKN2bz2z3/msZTZoPGKaKnh\n", "5LbShe8Mk8E=\n") + this.f1824 + StringFog.decrypt("1nzx\n", "9lHRPmln3XY=\n") + this.f1823;
        }
        if (str3 != null) {
            sb.append(str3.concat("\n"));
        }
        StringBuilder append = new StringBuilder().append(StringFog.decrypt("YrH2imY+xHU=\n", "McWX/hNN/lU=\n"));
        EnumC0670 enumC06703 = this.f1821;
        sb.append(append.append(enumC06703 == enumC06702 ? StringFog.decrypt("Q0HZZlx3KA==\n", "FACLKBU5b0Y=\n") : enumC06703.name()).append("\n").toString());
        EnumC0670 enumC06704 = this.f1821;
        if (enumC06704 == EnumC0670.f1833 || enumC06704 == EnumC0670.f1832) {
            String decrypt = StringFog.decrypt("6Zze3izUBt/Rq8vg\n", "qPiPq024b6s=\n");
            AbstractC0544.m5512(decrypt, decrypt, sb.toString(), true);
            return;
        }
        String m5611 = m5611(this.f1820);
        if (m5611 != null) {
            sb.append(StringFog.decrypt("A4/NJ1fdvhxu\n", "Tuq+VDa62yY=\n") + m5611);
        }
        String sb3 = sb.toString();
        String decrypt2 = StringFog.decrypt("M209YrlXbhgLWihc\n", "cglsF9g7B2w=\n");
        if (AbstractC0544.m5506()) {
            Log.w(AbstractC0544.m5508(decrypt2), sb3);
        } else if (AbstractC0544.m5507().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            Log.w(AbstractC0544.m5508(decrypt2), sb3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5611(EnumC0676 enumC0676) {
        if (enumC0676 == null) {
            return null;
        }
        int ordinal = enumC0676.ordinal();
        if (ordinal == 1) {
            return String.format(StringFog.decrypt("BkoEw4tsOiRGS1fZgGk6d1AZVtWecnMgRkoE+bxGfgNWWEjZm346AWdyBMaKdWk7TFcElZwndSAD\nV0HHinU=\n", "IzkksO8HGlI=\n"), this.f1827, this.f1825, this.f1822);
        }
        if (ordinal == 2) {
            return String.format(StringFog.decrypt("OfS0I3wUlIF59ecZVzGU0m+n/QMYMduDPP7xBBgswYds6OYEXTuUlWWn4Bhdf9eYcunxE0wwxg==\n", "HIeUcDhftPc=\n"), this.f1827, this.f1825);
        }
        if (ordinal == 3) {
            return StringFog.decrypt("7Hi2npb4zpXFObacmuiHgMZwpZfT/4GPxHy8hpzu\n", "qhnf8vOc7uE=\n");
        }
        if (ordinal == 4) {
            return StringFog.decrypt("AF+QuMvpGXspHpqmy+xNamZdlrrA6Fp7KUw=\n", "Rj751K6NOQ8=\n");
        }
        if (ordinal != 5) {
            return null;
        }
        return StringFog.decrypt("TjQPvSG+JNN+KBa8POklkHgvFqErrQ==\n", "G1pk007JSvM=\n");
    }
}
