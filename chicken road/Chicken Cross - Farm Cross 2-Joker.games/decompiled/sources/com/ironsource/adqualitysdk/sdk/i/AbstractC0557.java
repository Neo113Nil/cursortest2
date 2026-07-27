package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ն, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0557 extends AbstractC0599 implements InterfaceC0947 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f1269;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f1270;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1271;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Map f1272;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1268 = StringFog.decrypt("jKItCoJkmYObrA8phXucv5E=\n", "/8dZTPcI9dA=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1267 = StringFog.decrypt("PBQ7HvRO/Gs+MRgZ60vAYQYCCQ==\n", "VWd9a5girw8=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1266 = StringFog.decrypt("fKl9liRjsgY=\n", "G8wJ1UgCwXU=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1265 = StringFog.decrypt("qS5b\n", "wEAv9n5WzRk=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1264 = StringFog.decrypt("BA5odQ==\n", "aGEGEi51VXs=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1263 = StringFog.decrypt("Wv4y0ztU\n", "PpFHsVcxtL4=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1262 = StringFog.decrypt("iSMN69A=\n", "709iiqQ9r54=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1261 = StringFog.decrypt("uoU68w==\n", "2OpVn5eh7Ww=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1260 = StringFog.decrypt("1/rQdg==\n", "tJKxBD0Vios=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1259 = StringFog.decrypt("PP8MOQ==\n", "XoZ4XCVhGPs=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1258 = StringFog.decrypt("goXdIQ==\n", "9Oq0RZ1P6k0=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1257 = StringFog.decrypt("axFoPXg=\n", "GHkHTwyWj5A=\n");

    public AbstractC0557(String str) {
        this.f1271 = str;
    }

    /* renamed from: ﻏ */
    public boolean mo5479() {
        return this instanceof C0513;
    }

    /* renamed from: ﻐ */
    public boolean mo5476() {
        return this instanceof C0529;
    }

    /* renamed from: ﻛ */
    public abstract String mo5368();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m5527() {
        if (TextUtils.isEmpty(this.f1269) || this.f1269.equals(StringFog.decrypt("ThEUX9Whkw==\n", "C19VHZnk17M=\n"))) {
            this.f1269 = mo5368();
        }
        return this.f1269;
    }

    /* renamed from: ﾇ */
    public abstract HashMap mo5369();

    /* renamed from: ﾒ */
    public abstract Class mo5370(String str);

    /* renamed from: ﾒ */
    public String mo5371() {
        String str = this.f1270;
        return str != null ? str : m5527();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0947
    /* renamed from: ﾒ */
    public final Object mo5313(C1226 c1226, String str, ArrayList arrayList, C0807 c0807, C1074 c1074) {
        InterfaceC0559 interfaceC0559 = (InterfaceC0559) this.f1272.get(str);
        try {
        } catch (Exception e) {
            AbstractC1086.m5875(this.f1271, AbstractC1257.m5940("OA==\n", "H7fjlCJXdrY=\n", AbstractC1196.m5920("oOU=\n", "gMLJUFwkPZs=\n", new StringBuilder().append(StringFog.decrypt("0MOd8q/VU//83Yq9uI1B9ODFhvO61Q==\n", "lbHvnd31JJc=\n")).append(this.f1271), str)), e, null);
        }
        if (interfaceC0559 != null) {
            return interfaceC0559.mo5367(arrayList, c0807);
        }
        new C0440(c1226, c1074, this.f1271, str).m5536(this.f1271);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ironsource.adqualitysdk.sdk.i.ר, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class m5528(String str, boolean z) {
        char c;
        ?? r0 = 0;
        r0 = 0;
        try {
            if (str.contains(StringFog.decrypt("uA==\n", "lnPCdgGkOlw=\n"))) {
                String str2 = AbstractC0940.f2644;
                try {
                    r0 = Class.forName(str);
                    return r0;
                } catch (Throwable th) {
                    if (!z) {
                        return null;
                    }
                    AbstractC1086.m5875(AbstractC0940.f2644, StringFog.decrypt("Xp5px8mq\n", "HfIItLqKuKg=\n") + str + StringFog.decrypt("9RyxtXjrium7Fg==\n", "1XLewViN5Zw=\n"), th, null);
                    return null;
                }
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(f1263)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str.equals(f1265)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029738:
                    if (str.equals(f1261)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3039496:
                    if (str.equals(f1259)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3052374:
                    if (str.equals(f1260)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (str.equals(f1264)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3625364:
                    if (str.equals(f1258)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 97526364:
                    if (str.equals(f1262)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109413500:
                    if (str.equals(f1257)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    return Float.TYPE;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    return Void.TYPE;
                case '\b':
                    return Short.TYPE;
                default:
                    return mo5370(str);
            }
        } catch (Throwable th2) {
            if (z) {
                AbstractC1086.m5875(this.f1271, AbstractC1257.m5940("C3G8cH95tgdFew==\n", "Kx/TBF8f2XI=\n", AbstractC1196.m5920("RDJejZWD\n", "B14//uajQpM=\n", new StringBuilder(), str)), th2, r0);
            }
            return r0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5529(InterfaceC0997 interfaceC0997, C0807 c0807, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC0997);
            C1226.m5926(c0807.f2352, str, true, false, arrayList);
            C1226 c1226 = c0807.f2352;
            C0844 c0844 = new C0844(c0807, str, false, arrayList);
            c1226.getClass();
            try {
                AbstractC1145.m5895(c0844);
            } catch (Throwable unused) {
            }
            C1226 c12262 = c0807.f2352;
            C0844 c08442 = new C0844(c0807, str, true, arrayList);
            c12262.getClass();
            try {
                AbstractC1145.m5893(new C0706(c08442));
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            AbstractC1086.m5875(this.f1271, StringFog.decrypt("L+fk+592SbxK\n", "apWWlO1WINI=\n") + this, th, null);
        }
    }
}
