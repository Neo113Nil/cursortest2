package com.google.re2j;

/* loaded from: classes9.dex */
abstract class MachineInput {
    static final int EOF = -8;

    abstract boolean canCheckPrefix();

    abstract int context(int i);

    abstract int endPos();

    abstract int index(com.google.re2j.RE2 re2, int i);

    abstract int step(int i);

    MachineInput() {
    }

    static com.google.re2j.MachineInput fromUTF8(byte[] bArr) {
        return new com.google.re2j.MachineInput.UTF8Input(bArr);
    }

    static com.google.re2j.MachineInput fromUTF8(byte[] bArr, int i, int i2) {
        return new com.google.re2j.MachineInput.UTF8Input(bArr, i, i2);
    }

    static com.google.re2j.MachineInput fromUTF16(java.lang.CharSequence charSequence) {
        return new com.google.re2j.MachineInput.UTF16Input(charSequence, 0, charSequence.length());
    }

    static com.google.re2j.MachineInput fromUTF16(java.lang.CharSequence charSequence, int i, int i2) {
        return new com.google.re2j.MachineInput.UTF16Input(charSequence, i, i2);
    }

    static class UTF8Input extends com.google.re2j.MachineInput {
        final byte[] b;
        final int end;
        final int start;

        @Override // com.google.re2j.MachineInput
        boolean canCheckPrefix() {
            return true;
        }

        UTF8Input(byte[] bArr) {
            this.b = bArr;
            this.start = 0;
            this.end = bArr.length;
        }

        UTF8Input(byte[] bArr, int i, int i2) {
            if (i2 > bArr.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("end is greater than length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(bArr.length);
                throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
            }
            this.b = bArr;
            this.start = i;
            this.end = i2;
        }

        @Override // com.google.re2j.MachineInput
        int step(int i) {
            int i2 = i + this.start;
            int i3 = this.end;
            if (i2 >= i3) {
                return -8;
            }
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if ((b & 128) == 0) {
                return ((b & 255) << 3) | 1;
            }
            if ((b & 224) == 192) {
                if (i4 >= i3) {
                    return -8;
                }
                return ((((b & com.google.common.base.Ascii.US) << 6) | (bArr[i4] & 63)) << 3) | 2;
            }
            if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
                int i5 = i2 + 2;
                if (i5 >= i3) {
                    return -8;
                }
                return (((bArr[i5] & 63) | (((bArr[i4] & 63) | ((b & com.google.common.base.Ascii.SI) << 6)) << 6)) << 3) | 3;
            }
            int i6 = i2 + 3;
            if (i6 >= i3) {
                return -8;
            }
            byte b2 = bArr[i4];
            byte b3 = bArr[i2 + 2];
            return (((((b3 & 63) | (((b2 & 63) | ((b & 7) << 6)) << 6)) << 6) | (bArr[i6] & 63)) << 3) | 4;
        }

        @Override // com.google.re2j.MachineInput
        int index(com.google.re2j.RE2 re2, int i) {
            int i2 = i + this.start;
            int indexOf = com.google.re2j.Utils.indexOf(this.b, re2.prefixUTF8, i2);
            return indexOf < 0 ? indexOf : indexOf - i2;
        }

        @Override // com.google.re2j.MachineInput
        int context(int i) {
            int i2;
            int i3 = this.start;
            int i4 = i + i3;
            if (i4 <= i3 || i4 > this.end) {
                i2 = -1;
            } else {
                int i5 = i4 - 2;
                i2 = this.b[i4 - 1];
                if (i2 >= 128) {
                    int i6 = i4 - 4;
                    if (i6 >= i3) {
                        i3 = i6;
                    }
                    while (i5 >= i3 && (this.b[i5] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        i5--;
                    }
                    int i7 = this.start;
                    if (i5 < i7) {
                        i5 = i7;
                    }
                    i2 = step(i5) >> 3;
                }
            }
            return com.google.re2j.Utils.emptyOpContext(i2, i4 < this.end ? step(i4) >> 3 : -1);
        }

        @Override // com.google.re2j.MachineInput
        int endPos() {
            return this.end;
        }
    }

    static class UTF16Input extends com.google.re2j.MachineInput {
        final int end;
        final int start;
        final java.lang.CharSequence str;

        @Override // com.google.re2j.MachineInput
        boolean canCheckPrefix() {
            return true;
        }

        public UTF16Input(java.lang.CharSequence charSequence, int i, int i2) {
            this.str = charSequence;
            this.start = i;
            this.end = i2;
        }

        @Override // com.google.re2j.MachineInput
        int step(int i) {
            int i2 = i + this.start;
            if (i2 >= this.end) {
                return -8;
            }
            int codePointAt = java.lang.Character.codePointAt(this.str, i2);
            return (codePointAt << 3) | java.lang.Character.charCount(codePointAt);
        }

        @Override // com.google.re2j.MachineInput
        int index(com.google.re2j.RE2 re2, int i) {
            int i2 = i + this.start;
            int indexOf = indexOf(this.str, re2.prefix, i2);
            return indexOf < 0 ? indexOf : indexOf - i2;
        }

        @Override // com.google.re2j.MachineInput
        int context(int i) {
            int i2 = i + this.start;
            return com.google.re2j.Utils.emptyOpContext((i2 <= 0 || i2 > this.str.length()) ? -1 : java.lang.Character.codePointBefore(this.str, i2), i2 < this.str.length() ? java.lang.Character.codePointAt(this.str, i2) : -1);
        }

        @Override // com.google.re2j.MachineInput
        int endPos() {
            return this.end;
        }

        private int indexOf(java.lang.CharSequence charSequence, java.lang.String str, int i) {
            if (charSequence instanceof java.lang.String) {
                return ((java.lang.String) charSequence).indexOf(str, i);
            }
            if (charSequence instanceof java.lang.StringBuilder) {
                return ((java.lang.StringBuilder) charSequence).indexOf(str, i);
            }
            return indexOfFallback(charSequence, str, i);
        }

        private int indexOfFallback(java.lang.CharSequence charSequence, java.lang.String str, int i) {
            if (i >= charSequence.length()) {
                return str.isEmpty() ? 0 : -1;
            }
            if (i < 0) {
                i = 0;
            }
            if (str.isEmpty()) {
                return i;
            }
            char charAt = str.charAt(0);
            int length = charSequence.length() - str.length();
            while (i <= length) {
                if (charSequence.charAt(i) != charAt) {
                    do {
                        i++;
                        if (i > length) {
                            break;
                        }
                    } while (charSequence.charAt(i) != charAt);
                }
                if (i <= length) {
                    int i2 = i + 1;
                    int length2 = (str.length() + i2) - 1;
                    for (int i3 = 1; i2 < length2 && charSequence.charAt(i2) == str.charAt(i3); i3++) {
                        i2++;
                    }
                    if (i2 == length2) {
                        return i;
                    }
                }
                i++;
            }
            return -1;
        }
    }
}
