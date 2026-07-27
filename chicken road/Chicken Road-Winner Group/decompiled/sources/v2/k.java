package v2;

/* loaded from: classes.dex */
public abstract class k extends j {
    /* JADX WARN: Removed duplicated region for block: B:120:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j0(String str) {
        char c3;
        boolean z3;
        boolean z4;
        int charAt;
        int charAt2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        int length = str.length() - 1;
        int i4 = 0;
        while (true) {
            c3 = ' ';
            if (i4 > length || str.charAt(i4) > ' ') {
                break;
            }
            i4++;
        }
        if (i4 <= length) {
            while (length > i4 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i4) == '+' || str.charAt(i4) == '-') {
                i4++;
            }
            if (i4 <= length) {
                if (str.charAt(i4) == '0') {
                    int i5 = i4 + 1;
                    if (i5 > length) {
                        return true;
                    }
                    if ((str.charAt(i5) | ' ') == 120) {
                        int i6 = i4 + 2;
                        int i7 = i6;
                        while (true) {
                            if (i7 > length) {
                                z3 = z7;
                                break;
                            }
                            z3 = z7;
                            if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i7++;
                            z7 = z3;
                        }
                        boolean z8 = i6 != i7 ? z3 : false;
                        if (i7 <= length) {
                            if (str.charAt(i7) == '.') {
                                int i8 = i7 + 1;
                                int i9 = i8;
                                while (i9 <= length) {
                                    char c4 = c3;
                                    if (((str.charAt(i9) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i9++;
                                    c3 = c4;
                                }
                                z6 = i8 != i9 ? z3 : false;
                                i7 = i9;
                            } else {
                                z6 = false;
                            }
                            if (z8 || z6) {
                                i4 = i7;
                                if (i4 != -1 && i4 <= length) {
                                    z4 = z3;
                                    if (!z4) {
                                        int i10 = i4;
                                        while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
                                            i10++;
                                        }
                                        boolean z9 = i4 != i10 ? z3 : false;
                                        if (i10 > length) {
                                            i4 = i10;
                                        } else {
                                            if (str.charAt(i10) == '.') {
                                                int i11 = i10 + 1;
                                                i3 = i11;
                                                while (i3 <= length && ((str.charAt(i3) - '0') & 65535) < 10) {
                                                    i3++;
                                                }
                                                if (i11 != i3) {
                                                    z5 = z3;
                                                    if (!z9 || z5) {
                                                        i4 = i3;
                                                    } else {
                                                        String str2 = length == i3 + 2 ? "NaN" : length == i3 + 7 ? "Infinity" : null;
                                                        i4 = (str2 != null && m.m0(str, str2, i3, false) == i3) ? length + 1 : -1;
                                                    }
                                                }
                                            } else {
                                                i3 = i10;
                                            }
                                            z5 = false;
                                            if (z9) {
                                            }
                                            i4 = i3;
                                        }
                                        if (i4 != -1) {
                                            if (i4 > length) {
                                                return z3;
                                            }
                                        }
                                    }
                                    int i12 = i4 + 1;
                                    charAt = str.charAt(i4) | ' ';
                                    if (charAt != (z4 ? 112 : 101)) {
                                        if (!z4 && ((charAt == 102 || charAt == 100) && i12 > length)) {
                                            return z3;
                                        }
                                    } else if (i12 <= length && ((str.charAt(i12) != '+' && str.charAt(i12) != '-') || (i12 = i4 + 2) <= length)) {
                                        while (i12 <= length && ((str.charAt(i12) - '0') & 65535) < 10) {
                                            i12++;
                                        }
                                        if (i12 > length) {
                                            return z3;
                                        }
                                        if (i12 == length && ((charAt2 = str.charAt(i12) | ' ') == 102 || charAt2 == 100)) {
                                            return z3;
                                        }
                                    }
                                }
                            }
                        }
                        i4 = -1;
                        if (i4 != -1) {
                            z4 = z3;
                            if (!z4) {
                            }
                            int i122 = i4 + 1;
                            charAt = str.charAt(i4) | ' ';
                            if (charAt != (z4 ? 112 : 101)) {
                            }
                        }
                    }
                }
                z3 = true;
                z4 = false;
                if (!z4) {
                }
                int i1222 = i4 + 1;
                charAt = str.charAt(i4) | ' ';
                if (charAt != (z4 ? 112 : 101)) {
                }
            }
        }
        return false;
    }
}
