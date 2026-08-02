package p000;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: iu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0334iu {

    /* JADX INFO: renamed from: a */
    public final String f3660a;

    /* JADX INFO: renamed from: b */
    public final int f3661b;

    /* JADX INFO: renamed from: c */
    public int f3662c;

    /* JADX INFO: renamed from: d */
    public int f3663d;

    /* JADX INFO: renamed from: e */
    public int f3664e;

    /* JADX INFO: renamed from: f */
    public int f3665f;

    /* JADX INFO: renamed from: g */
    public char[] f3666g;

    public C0334iu(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f3660a = name;
        this.f3661b = name.length();
    }

    /* JADX INFO: renamed from: a */
    public final int m2698a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.f3661b;
        String str = this.f3660a;
        if (i4 >= i5) {
            C0042ay.m531h(str, "Malformed DN: ");
            return 0;
        }
        char[] cArr = this.f3666g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                C0042ay.m531h(str, "Malformed DN: ");
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                C0042ay.m531h(str, "Malformed DN: ");
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX INFO: renamed from: b */
    public final char m2699b() {
        int i;
        int i2;
        int i3 = this.f3662c + 1;
        this.f3662c = i3;
        int i4 = this.f3661b;
        if (i3 == i4) {
            dd0.m1166l(this.f3660a, "Unexpected end of DN: ");
            return (char) 0;
        }
        char c = this.f3666g[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iM2698a = m2698a(i3);
                            this.f3662c++;
                            if (iM2698a < 128) {
                                return (char) iM2698a;
                            }
                            if (iM2698a < 192 || iM2698a > 247) {
                                return '?';
                            }
                            if (iM2698a <= 223) {
                                i = iM2698a & 31;
                                i2 = 1;
                            } else if (iM2698a <= 239) {
                                i = iM2698a & 15;
                                i2 = 2;
                            } else {
                                i = iM2698a & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.f3662c;
                                int i7 = i6 + 1;
                                this.f3662c = i7;
                                if (i7 == i4 || this.f3666g[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.f3662c = i8;
                                int iM2698a2 = m2698a(i8);
                                this.f3662c++;
                                if ((iM2698a2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iM2698a2 & 63);
                            }
                            return (char) i;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    /* JADX INFO: renamed from: c */
    public final String m2700c() {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        char c2;
        char c3;
        while (true) {
            i = this.f3662c;
            i2 = this.f3661b;
            if (i >= i2 || this.f3666g[i] != ' ') {
                break;
            }
            this.f3662c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f3663d = i;
        this.f3662c = i + 1;
        while (true) {
            i3 = this.f3662c;
            if (i3 >= i2 || (c3 = this.f3666g[i3]) == '=' || c3 == ' ') {
                break;
            }
            this.f3662c = i3 + 1;
        }
        String str = this.f3660a;
        if (i3 >= i2) {
            C0042ay.m531h(str, "Unexpected end of DN: ");
            return null;
        }
        this.f3664e = i3;
        if (this.f3666g[i3] == ' ') {
            while (true) {
                i4 = this.f3662c;
                if (i4 >= i2 || (c2 = this.f3666g[i4]) == '=' || c2 != ' ') {
                    break;
                }
                this.f3662c = i4 + 1;
            }
            if (this.f3666g[i4] != '=' || i4 == i2) {
                C0042ay.m531h(str, "Unexpected end of DN: ");
                return null;
            }
        }
        this.f3662c++;
        while (true) {
            int i5 = this.f3662c;
            if (i5 >= i2 || this.f3666g[i5] != ' ') {
                break;
            }
            this.f3662c = i5 + 1;
        }
        int i6 = this.f3664e;
        int i7 = this.f3663d;
        if (i6 - i7 > 4) {
            char[] cArr = this.f3666g;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && ((cArr[i7 + 1] == 'I' || cArr[i7 + 1] == 'i') && (cArr[i7 + 2] == 'D' || cArr[i7 + 2] == 'd')))) {
                this.f3663d = i7 + 4;
            }
        }
        char[] cArr2 = this.f3666g;
        int i8 = this.f3663d;
        return new String(cArr2, i8, i6 - i8);
    }
}
