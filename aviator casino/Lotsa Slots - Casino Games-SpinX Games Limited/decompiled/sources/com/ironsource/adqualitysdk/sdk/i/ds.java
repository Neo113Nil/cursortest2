package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ds extends com.ironsource.adqualitysdk.sdk.i.dr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1832 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1833 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1834 = 882839348;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1835 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1836;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ds(com.ironsource.adqualitysdk.sdk.i.cl clVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar, java.lang.String str, java.lang.String str2) {
        super(clVar, eeVar, r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7600((char) (12505 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "찶싛\ud8c4锰", "ᢻᎻ魰죯币汆繒᷸—섾鲂鯊邽\u0a12ꄓ僂", android.text.TextUtils.getCapsMode("", 0, 0)).intern());
        sb.append(str);
        sb.append(m7600((char) (android.graphics.Color.rgb(0, 0, 0) + 16809224), "\u0000\u0000\u0000\u0000", "魦\uec32ࠁᙽ", "ꬽ倸榆㢞᷷\ue016浶ᡍ奆Ɯ碮轔ꔎ硩䰨䏸㳵䘜咑걚瑙힐龤倵\ueba8㕍碒豺礪䠕伄", 32256667 - android.text.TextUtils.getOffsetBefore("", 0)).intern());
        sb.append(str2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final java.lang.String mo7589() {
        int i = 2 % 2;
        int i2 = f1835 + 107;
        f1836 = i2 % 128;
        return (i2 % 2 != 0 ? m7600((char) (3224 % (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ﯡ堏嗗㴸", "㟀飞䟉닊햁魵颋屉땬鵚㜆㊑涹砆子\uf640Ã\ue039鿰ꛮꄿ鿇ꩭᮦ\uece3楊㗶䒕썪醦菞궥本땖䎈靆婴\ud9ac笄ꋜ뉸", (-682094597) % (android.view.ViewConfiguration.getDoubleTapTimeout() << 20)) : m7600((char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14421), "\u0000\u0000\u0000\u0000", "ﯡ堏嗗㴸", "㟀飞䟉닊햁魵颋屉땬鵚㜆㊑涹砆子\uf640Ã\ue039鿰ꛮꄿ鿇ꩭᮦ\uece3楊㗶䒕썪醦菞궥本땖䎈靆婴\ud9ac笄ꋜ뉸", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 682094597)).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7600(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f1832) ^ f1834) ^ f1833);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
