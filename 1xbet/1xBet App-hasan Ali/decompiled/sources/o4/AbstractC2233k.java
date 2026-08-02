package o4;

/* renamed from: o4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2233k extends AbstractC2232j {
    /* JADX WARN: Removed duplicated region for block: B:120:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean q0(String str) {
        char c5;
        boolean z3;
        boolean z5;
        int charAt;
        int charAt2;
        int i;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        int length = str.length() - 1;
        int i5 = 0;
        while (true) {
            c5 = ' ';
            if (i5 > length || str.charAt(i5) > ' ') {
                break;
            }
            i5++;
        }
        if (i5 <= length) {
            while (length > i5 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i5) == '+' || str.charAt(i5) == '-') {
                i5++;
            }
            if (i5 <= length) {
                if (str.charAt(i5) == '0') {
                    int i6 = i5 + 1;
                    if (i6 > length) {
                        return true;
                    }
                    if ((str.charAt(i6) | ' ') == 120) {
                        int i7 = i5 + 2;
                        int i8 = i7;
                        while (true) {
                            if (i8 > length) {
                                z3 = z8;
                                break;
                            }
                            z3 = z8;
                            if (((str.charAt(i8) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i8++;
                            z8 = z3;
                        }
                        boolean z9 = i7 != i8 ? z3 : false;
                        if (i8 <= length) {
                            if (str.charAt(i8) == '.') {
                                int i9 = i8 + 1;
                                int i10 = i9;
                                while (i10 <= length) {
                                    char c6 = c5;
                                    if (((str.charAt(i10) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i10++;
                                    c5 = c6;
                                }
                                z7 = i9 != i10 ? z3 : false;
                                i8 = i10;
                            } else {
                                z7 = false;
                            }
                            if (z9 || z7) {
                                i5 = i8;
                                if (i5 != -1 && i5 <= length) {
                                    z5 = z3;
                                    if (!z5) {
                                        int i11 = i5;
                                        while (i11 <= length && ((str.charAt(i11) - '0') & 65535) < 10) {
                                            i11++;
                                        }
                                        boolean z10 = i5 != i11 ? z3 : false;
                                        if (i11 > length) {
                                            i5 = i11;
                                        } else {
                                            if (str.charAt(i11) == '.') {
                                                int i12 = i11 + 1;
                                                i = i12;
                                                while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                                    i++;
                                                }
                                                if (i12 != i) {
                                                    z6 = z3;
                                                    if (!z10 || z6) {
                                                        i5 = i;
                                                    } else {
                                                        String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                                        i5 = (str2 != null && AbstractC2227e.E0(str, str2, i, false) == i) ? length + 1 : -1;
                                                    }
                                                }
                                            } else {
                                                i = i11;
                                            }
                                            z6 = false;
                                            if (z10) {
                                            }
                                            i5 = i;
                                        }
                                        if (i5 != -1) {
                                            if (i5 > length) {
                                                return z3;
                                            }
                                        }
                                    }
                                    int i13 = i5 + 1;
                                    charAt = str.charAt(i5) | ' ';
                                    if (charAt != (z5 ? 112 : 101)) {
                                        if (!z5 && ((charAt == 102 || charAt == 100) && i13 > length)) {
                                            return z3;
                                        }
                                    } else if (i13 <= length && ((str.charAt(i13) != '+' && str.charAt(i13) != '-') || (i13 = i5 + 2) <= length)) {
                                        while (i13 <= length && ((str.charAt(i13) - '0') & 65535) < 10) {
                                            i13++;
                                        }
                                        if (i13 > length) {
                                            return z3;
                                        }
                                        if (i13 == length && ((charAt2 = str.charAt(i13) | ' ') == 102 || charAt2 == 100)) {
                                            return z3;
                                        }
                                    }
                                }
                            }
                        }
                        i5 = -1;
                        if (i5 != -1) {
                            z5 = z3;
                            if (!z5) {
                            }
                            int i132 = i5 + 1;
                            charAt = str.charAt(i5) | ' ';
                            if (charAt != (z5 ? 112 : 101)) {
                            }
                        }
                    }
                }
                z3 = true;
                z5 = false;
                if (!z5) {
                }
                int i1322 = i5 + 1;
                charAt = str.charAt(i5) | ' ';
                if (charAt != (z5 ? 112 : 101)) {
                }
            }
        }
        return false;
    }
}
