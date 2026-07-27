package com.bytedance.sdk.component.sf.pcc;

import androidx.webkit.ProxyConfig;
import com.google.common.base.Ascii;
import com.ironsource.C4761z5;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class qf {
    private static final char[] oo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final int gm;
    private final List<String> kj;
    private final String ork;
    final String pcc;
    private final List<String> qf;
    final String sf;
    private final String vj;
    private final String vy;
    private final String wh;

    qf(pcc pccVar) {
        this.pcc = pccVar.pcc;
        this.vj = pcc(pccVar.sf, false);
        this.wh = pcc(pccVar.gm, false);
        this.sf = pccVar.oo;
        this.gm = pccVar.pcc();
        this.qf = pcc(pccVar.wh, false);
        this.kj = pccVar.qf != null ? pcc(pccVar.qf, true) : null;
        this.vy = pccVar.kj != null ? pcc(pccVar.kj, false) : null;
        this.ork = pccVar.toString();
    }

    public URL pcc() {
        try {
            return new URL(this.ork);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String sf() {
        if (this.vj.isEmpty()) {
            return "";
        }
        int length = this.pcc.length() + 3;
        String str = this.ork;
        return this.ork.substring(length, com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, length, str.length(), ":@"));
    }

    public String gm() {
        if (this.wh.isEmpty()) {
            return "";
        }
        return this.ork.substring(this.ork.indexOf(58, this.pcc.length() + 3) + 1, this.ork.indexOf(64));
    }

    public static int pcc(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void pcc(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(FileSystemKt.UnixPathSeparator);
            sb.append(list.get(i));
        }
    }

    public List<String> oo() {
        int indexOf = this.ork.indexOf(47, this.pcc.length() + 3);
        String str = this.ork;
        int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < pcc2) {
            int i = indexOf + 1;
            int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(this.ork, i, pcc2, FileSystemKt.UnixPathSeparator);
            arrayList.add(this.ork.substring(i, pcc3));
            indexOf = pcc3;
        }
        return arrayList;
    }

    public String vj() {
        if (this.kj == null) {
            return null;
        }
        int indexOf = this.ork.indexOf(63) + 1;
        String str = this.ork;
        return this.ork.substring(indexOf, com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, indexOf, str.length(), '#'));
    }

    static void sf(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(C4761z5.U);
                sb.append(str2);
            }
        }
    }

    static List<String> sf(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static qf gm(String str) {
        pcc pccVar = new pcc();
        if (pccVar.pcc((qf) null, str) == pcc.EnumC0128pcc.SUCCESS) {
            return pccVar.sf();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof qf) && ((qf) obj).ork.equals(this.ork);
    }

    public int hashCode() {
        return this.ork.hashCode();
    }

    public String toString() {
        return this.ork;
    }

    public static final class pcc {
        String kj;
        String oo;
        String pcc;
        List<String> qf;
        final List<String> wh;
        String sf = "";
        String gm = "";
        int vj = -1;

        /* renamed from: com.bytedance.sdk.component.sf.pcc.qf$pcc$pcc, reason: collision with other inner class name */
        enum EnumC0128pcc {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public pcc() {
            ArrayList arrayList = new ArrayList();
            this.wh = arrayList;
            arrayList.add("");
        }

        public pcc pcc(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.pcc = ProxyConfig.MATCH_HTTP;
            } else if (str.equalsIgnoreCase("https")) {
                this.pcc = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            return this;
        }

        public pcc sf(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String vj = vj(str, 0, str.length());
            if (vj == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.oo = vj;
            return this;
        }

        int pcc() {
            int i = this.vj;
            return i != -1 ? i : qf.pcc(this.pcc);
        }

        public pcc gm(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return pcc(str, true);
        }

        private pcc pcc(String str, boolean z) {
            int i = 0;
            do {
                int pcc = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i, str.length(), "/\\");
                pcc(str, i, pcc, pcc < str.length(), z);
                i = pcc + 1;
            } while (i <= str.length());
            return this;
        }

        public pcc oo(String str) {
            this.qf = str != null ? qf.sf(qf.pcc(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public pcc pcc(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.qf == null) {
                this.qf = new ArrayList();
            }
            this.qf.add(qf.pcc(str, " \"'<>#&=", true, false, true, true));
            this.qf.add(str2 != null ? qf.pcc(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public qf sf() {
            if (this.pcc == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.oo == null) {
                throw new IllegalStateException("host == null");
            }
            return new qf(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.pcc);
            sb.append("://");
            if (!this.sf.isEmpty() || !this.gm.isEmpty()) {
                sb.append(this.sf);
                if (!this.gm.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.gm);
                }
                sb.append('@');
            }
            if (this.oo.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.oo);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.oo);
            }
            int pcc = pcc();
            if (pcc != qf.pcc(this.pcc)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(pcc);
            }
            qf.pcc(sb, this.wh);
            if (this.qf != null) {
                sb.append('?');
                qf.sf(sb, this.qf);
            }
            if (this.kj != null) {
                sb.append('#');
                sb.append(this.kj);
            }
            return sb.toString();
        }

        EnumC0128pcc pcc(qf qfVar, String str) {
            int pcc;
            int i;
            int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, 0, str.length());
            int sf = com.bytedance.sdk.component.sf.pcc.sf.vy.sf(str, pcc2, str.length());
            if (sf(str, pcc2, sf) != -1) {
                if (str.regionMatches(true, pcc2, "https:", 0, 6)) {
                    this.pcc = "https";
                    pcc2 += 6;
                } else if (str.regionMatches(true, pcc2, "http:", 0, 5)) {
                    this.pcc = ProxyConfig.MATCH_HTTP;
                    pcc2 += 5;
                } else {
                    return EnumC0128pcc.UNSUPPORTED_SCHEME;
                }
            } else if (qfVar != null) {
                this.pcc = qfVar.pcc;
            } else {
                return EnumC0128pcc.MISSING_SCHEME;
            }
            int gm = gm(str, pcc2, sf);
            char c = '?';
            char c2 = '#';
            if (gm >= 2 || qfVar == null || !qfVar.pcc.equals(this.pcc)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = pcc2 + gm;
                while (true) {
                    pcc = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i2, sf, "@/\\?#");
                    char charAt = pcc != sf ? str.charAt(pcc) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            i = pcc;
                            this.gm += "%40" + qf.pcc(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i2, pcc, AbstractJsonLexerKt.COLON);
                            i = pcc;
                            String pcc4 = qf.pcc(str, i2, pcc3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                pcc4 = this.sf + "%40" + pcc4;
                            }
                            this.sf = pcc4;
                            if (pcc3 != i) {
                                this.gm = qf.pcc(str, pcc3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int oo = oo(str, i2, pcc);
                int i3 = oo + 1;
                if (i3 < pcc) {
                    this.oo = vj(str, i2, oo);
                    int wh = wh(str, i3, pcc);
                    this.vj = wh;
                    if (wh == -1) {
                        return EnumC0128pcc.INVALID_PORT;
                    }
                } else {
                    this.oo = vj(str, i2, oo);
                    this.vj = qf.pcc(this.pcc);
                }
                if (this.oo == null) {
                    return EnumC0128pcc.INVALID_HOST;
                }
                pcc2 = pcc;
            } else {
                this.sf = qfVar.sf();
                this.gm = qfVar.gm();
                this.oo = qfVar.sf;
                this.vj = qfVar.gm;
                this.wh.clear();
                this.wh.addAll(qfVar.oo());
                if (pcc2 == sf || str.charAt(pcc2) == '#') {
                    oo(qfVar.vj());
                }
            }
            int pcc5 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, pcc2, sf, "?#");
            pcc(str, pcc2, pcc5);
            if (pcc5 < sf && str.charAt(pcc5) == '?') {
                int pcc6 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, pcc5, sf, '#');
                this.qf = qf.sf(qf.pcc(str, pcc5 + 1, pcc6, " \"'<>#", true, false, true, true, null));
                pcc5 = pcc6;
            }
            if (pcc5 < sf && str.charAt(pcc5) == '#') {
                this.kj = qf.pcc(str, 1 + pcc5, sf, "", true, false, false, false, null);
            }
            return EnumC0128pcc.SUCCESS;
        }

        private void pcc(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.wh.clear();
                this.wh.add("");
                i++;
            } else {
                List<String> list = this.wh;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str, i3, i2, "/\\");
                boolean z = i < i2;
                pcc(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void pcc(String str, int i, int i2, boolean z, boolean z2) {
            String pcc = qf.pcc(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (vj(pcc)) {
                return;
            }
            if (wh(pcc)) {
                gm();
                return;
            }
            if (this.wh.get(r11.size() - 1).isEmpty()) {
                this.wh.set(r11.size() - 1, pcc);
            } else {
                this.wh.add(pcc);
            }
            if (z) {
                this.wh.add("");
            }
        }

        private boolean vj(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean wh(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void gm() {
            if (this.wh.remove(r0.size() - 1).isEmpty() && !this.wh.isEmpty()) {
                this.wh.set(r0.size() - 1, "");
            } else {
                this.wh.add("");
            }
        }

        private static int sf(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int gm(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int oo(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String vj(String str, int i, int i2) {
            return com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(qf.pcc(str, i, i2, false));
        }

        private static int wh(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(qf.pcc(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }
    }

    static String pcc(String str, boolean z) {
        return pcc(str, 0, str.length(), z);
    }

    private List<String> pcc(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? pcc(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String pcc(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
                pccVar.pcc(str, i, i3);
                pcc(pccVar, str, i3, i2, z);
                return pccVar.gm();
            }
        }
        return str.substring(i, i2);
    }

    static void pcc(com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int pcc2 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i + 1));
                int pcc3 = com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i3));
                if (pcc2 != -1 && pcc3 != -1) {
                    pccVar.sf((pcc2 << 4) + pcc3);
                    i = i3;
                }
                pccVar.pcc(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    pccVar.sf(32);
                }
                pccVar.pcc(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean pcc(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.sf.pcc.sf.vy.pcc(str.charAt(i3)) != -1;
    }

    static String pcc(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || pcc(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
            pccVar.pcc(str, i, i3);
            pcc(pccVar, str, i3, i2, str2, z, z2, z3, z4, charset);
            return pccVar.gm();
        }
        return str.substring(i, i2);
    }

    static void pcc(com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.sf.pcc.sf.pcc pccVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    pccVar.pcc(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !pcc(str, i, i2)))))) {
                    if (pccVar2 == null) {
                        pccVar2 = new com.bytedance.sdk.component.sf.pcc.sf.pcc();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.sf.pcc.sf.vy.pcc)) {
                        pccVar2.pcc(codePointAt);
                    } else {
                        pccVar2.pcc(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!pccVar2.pcc()) {
                        byte sf = pccVar2.sf();
                        pccVar.sf(37);
                        char[] cArr = oo;
                        pccVar.sf((int) cArr[((sf & 255) >> 4) & 15]);
                        pccVar.sf((int) cArr[sf & Ascii.SI]);
                    }
                } else {
                    pccVar.pcc(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String pcc(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return pcc(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
