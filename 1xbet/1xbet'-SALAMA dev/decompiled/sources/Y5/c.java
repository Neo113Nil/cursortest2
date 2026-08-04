package Y5;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f7782g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f7776a = name;
        this.f7777b = name.length();
    }

    public final int a(int i7) {
        int i8;
        int i9;
        int i10 = i7 + 1;
        int i11 = this.f7777b;
        String str = this.f7776a;
        if (i10 >= i11) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f7782g;
        char c3 = cArr[i7];
        if (c3 >= '0' && c3 <= '9') {
            i8 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i8 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i8 = c3 - '7';
        }
        char c4 = cArr[i10];
        if (c4 >= '0' && c4 <= '9') {
            i9 = c4 - '0';
        } else if (c4 >= 'a' && c4 <= 'f') {
            i9 = c4 - 'W';
        } else {
            if (c4 < 'A' || c4 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i9 = c4 - '7';
        }
        return (i8 << 4) + i9;
    }

    public final char b() {
        int i7;
        int i8 = this.f7778c + 1;
        this.f7778c = i8;
        int i9 = this.f7777b;
        if (i8 == i9) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f7776a);
        }
        char c3 = this.f7782g[i8];
        if (c3 != ' ' && c3 != '%' && c3 != '\\' && c3 != '_' && c3 != '\"' && c3 != '#') {
            switch (c3) {
                default:
                    switch (c3) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i8);
                            this.f7778c++;
                            if (iA >= 128) {
                                if (iA >= 192 && iA <= 247) {
                                    if (iA <= 223) {
                                        iA &= 31;
                                        i7 = 1;
                                    } else if (iA <= 239) {
                                        iA &= 15;
                                        i7 = 2;
                                    } else {
                                        iA &= 7;
                                        i7 = 3;
                                    }
                                    for (int i10 = 0; i10 < i7; i10++) {
                                        int i11 = this.f7778c;
                                        int i12 = i11 + 1;
                                        this.f7778c = i12;
                                        if (i12 != i9 && this.f7782g[i12] == '\\') {
                                            int i13 = i11 + 2;
                                            this.f7778c = i13;
                                            int iA2 = a(i13);
                                            this.f7778c++;
                                            if ((iA2 & 192) == 128) {
                                                iA = (iA << 6) + (iA2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iA;
                    }
                case '*':
                case '+':
                case ',':
                    return c3;
            }
        }
        return c3;
    }

    public final String c() {
        int i7;
        int i8;
        int i9;
        char c3;
        int i10;
        char c4;
        char c7;
        while (true) {
            i7 = this.f7778c;
            i8 = this.f7777b;
            if (i7 >= i8 || this.f7782g[i7] != ' ') {
                break;
            }
            this.f7778c = i7 + 1;
        }
        if (i7 == i8) {
            return null;
        }
        this.f7779d = i7;
        this.f7778c = i7 + 1;
        while (true) {
            i9 = this.f7778c;
            if (i9 >= i8 || (c7 = this.f7782g[i9]) == '=' || c7 == ' ') {
                break;
            }
            this.f7778c = i9 + 1;
        }
        String str = this.f7776a;
        if (i9 >= i8) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f7780e = i9;
        if (this.f7782g[i9] == ' ') {
            while (true) {
                i10 = this.f7778c;
                if (i10 >= i8 || (c4 = this.f7782g[i10]) == '=' || c4 != ' ') {
                    break;
                }
                this.f7778c = i10 + 1;
            }
            if (this.f7782g[i10] != '=' || i10 == i8) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f7778c++;
        while (true) {
            int i11 = this.f7778c;
            if (i11 >= i8 || this.f7782g[i11] != ' ') {
                break;
            }
            this.f7778c = i11 + 1;
        }
        int i12 = this.f7780e;
        int i13 = this.f7779d;
        if (i12 - i13 > 4) {
            char[] cArr = this.f7782g;
            if (cArr[i13 + 3] == '.' && (((c3 = cArr[i13]) == 'O' || c3 == 'o') && ((cArr[i13 + 1] == 'I' || cArr[i13 + 1] == 'i') && (cArr[i13 + 2] == 'D' || cArr[i13 + 2] == 'd')))) {
                this.f7779d = i13 + 4;
            }
        }
        char[] cArr2 = this.f7782g;
        int i14 = this.f7779d;
        return new String(cArr2, i14, i12 - i14);
    }
}
