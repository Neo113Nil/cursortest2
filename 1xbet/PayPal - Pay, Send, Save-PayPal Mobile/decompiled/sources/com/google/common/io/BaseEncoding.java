package com.google.common.io;

/* loaded from: classes4.dex */
public abstract class BaseEncoding {
    private static final com.google.common.io.BaseEncoding BASE64 = new com.google.common.io.BaseEncoding.Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final com.google.common.io.BaseEncoding BASE64_URL = new com.google.common.io.BaseEncoding.Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final com.google.common.io.BaseEncoding BASE32 = new com.google.common.io.BaseEncoding.StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final com.google.common.io.BaseEncoding BASE32_HEX = new com.google.common.io.BaseEncoding.StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final com.google.common.io.BaseEncoding BASE16 = new com.google.common.io.BaseEncoding.Base16Encoding("base16()", "0123456789ABCDEF");

    public abstract boolean canDecode(java.lang.CharSequence charSequence);

    abstract int decodeTo(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException;

    public abstract java.io.InputStream decodingStream(java.io.Reader reader);

    abstract void encodeTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract java.io.OutputStream encodingStream(java.io.Writer writer);

    public abstract com.google.common.io.BaseEncoding ignoreCase();

    public abstract com.google.common.io.BaseEncoding lowerCase();

    abstract int maxDecodedSize(int i);

    abstract int maxEncodedSize(int i);

    public abstract com.google.common.io.BaseEncoding omitPadding();

    public abstract com.google.common.io.BaseEncoding upperCase();

    public abstract com.google.common.io.BaseEncoding withPadChar(char c);

    public abstract com.google.common.io.BaseEncoding withSeparator(java.lang.String str, int i);

    BaseEncoding() {
    }

    public static final class DecodingException extends java.io.IOException {
        public DecodingException(java.lang.String str) {
            super(str);
        }
    }

    public java.lang.String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public final java.lang.String encode(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(maxEncodedSize(i2));
        try {
            encodeTo(sb, bArr, i, i2);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final com.google.common.io.ByteSink encodingSink(final com.google.common.io.CharSink charSink) {
        com.google.common.base.Preconditions.checkNotNull(charSink);
        return new com.google.common.io.ByteSink(this) { // from class: com.google.common.io.BaseEncoding.1
            final /* synthetic */ com.google.common.io.BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.io.ByteSink
            public java.io.OutputStream openStream() throws java.io.IOException {
                return this.this$0.encodingStream(charSink.openStream());
            }
        };
    }

    private static byte[] extract(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public final byte[] decode(java.lang.CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (com.google.common.io.BaseEncoding.DecodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    final byte[] decodeChecked(java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException {
        java.lang.CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(trimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, trimTrailingPadding));
    }

    public final com.google.common.io.ByteSource decodingSource(final com.google.common.io.CharSource charSource) {
        com.google.common.base.Preconditions.checkNotNull(charSource);
        return new com.google.common.io.ByteSource(this) { // from class: com.google.common.io.BaseEncoding.2
            final /* synthetic */ com.google.common.io.BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.io.ByteSource
            public java.io.InputStream openStream() throws java.io.IOException {
                return this.this$0.decodingStream(charSource.openStream());
            }
        };
    }

    java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence charSequence) {
        return (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(charSequence);
    }

    public static com.google.common.io.BaseEncoding base64() {
        return BASE64;
    }

    public static com.google.common.io.BaseEncoding base64Url() {
        return BASE64_URL;
    }

    public static com.google.common.io.BaseEncoding base32() {
        return BASE32;
    }

    public static com.google.common.io.BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static com.google.common.io.BaseEncoding base16() {
        return BASE16;
    }

    static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        private final boolean ignoreCase;
        final int mask;

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3865name;
        private final boolean[] validPadding;

        Alphabet(java.lang.String str, char[] cArr) {
            this(str, cArr, decodabetFor(cArr), false);
        }

        private Alphabet(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
            this.f3865name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            this.chars = (char[]) com.google.common.base.Preconditions.checkNotNull(cArr);
            try {
                int log2 = com.google.common.math.IntMath.log2(cArr.length, java.math.RoundingMode.UNNECESSARY);
                this.bitsPerChar = log2;
                int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(log2);
                int i = 1 << (3 - numberOfTrailingZeros);
                this.charsPerChunk = i;
                this.bytesPerChunk = log2 >> numberOfTrailingZeros;
                this.mask = cArr.length - 1;
                this.decodabet = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.bytesPerChunk; i2++) {
                    zArr[com.google.common.math.IntMath.divide(i2 * 8, this.bitsPerChar, java.math.RoundingMode.CEILING)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = z;
            } catch (java.lang.ArithmeticException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal alphabet length ");
                sb.append(cArr.length);
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        }

        private static byte[] decodabetFor(char[] cArr) {
            byte[] bArr = new byte[128];
            java.util.Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                boolean z = true;
                com.google.common.base.Preconditions.checkArgument(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                com.google.common.base.Preconditions.checkArgument(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        final com.google.common.io.BaseEncoding.Alphabet ignoreCase() {
            if (this.ignoreCase) {
                return this;
            }
            byte[] bArr = this.decodabet;
            byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            int i = 65;
            while (true) {
                if (i <= 90) {
                    int i2 = i | 32;
                    byte[] bArr2 = this.decodabet;
                    byte b = bArr2[i];
                    byte b2 = bArr2[i2];
                    if (b == -1) {
                        copyOf[i] = b2;
                    } else {
                        com.google.common.base.Preconditions.checkState(b2 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i, (char) i2);
                        copyOf[i2] = b;
                    }
                    i++;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.f3865name);
                    sb.append(".ignoreCase()");
                    return new com.google.common.io.BaseEncoding.Alphabet(sb.toString(), this.chars, copyOf, true);
                }
            }
        }

        final char encode(int i) {
            return this.chars[i];
        }

        final boolean isValidPaddingStartPosition(int i) {
            return this.validPadding[i % this.charsPerChunk];
        }

        final boolean canDecode(char c) {
            return c <= 127 && this.decodabet[c] != -1;
        }

        final int decode(char c) throws com.google.common.io.BaseEncoding.DecodingException {
            if (c > 127) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unrecognized character: 0x");
                sb.append(java.lang.Integer.toHexString(c));
                throw new com.google.common.io.BaseEncoding.DecodingException(sb.toString());
            }
            byte b = this.decodabet[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unrecognized character: 0x");
                sb2.append(java.lang.Integer.toHexString(c));
                throw new com.google.common.io.BaseEncoding.DecodingException(sb2.toString());
            }
            throw new com.google.common.io.BaseEncoding.DecodingException("Unrecognized character: ".concat(java.lang.String.valueOf(c)));
        }

        private boolean hasLowerCase() {
            for (char c : this.chars) {
                if (com.google.common.base.Ascii.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c : this.chars) {
                if (com.google.common.base.Ascii.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        final com.google.common.io.BaseEncoding.Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            com.google.common.base.Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = com.google.common.base.Ascii.toUpperCase(cArr2[i]);
                i++;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f3865name);
            sb.append(".upperCase()");
            com.google.common.io.BaseEncoding.Alphabet alphabet = new com.google.common.io.BaseEncoding.Alphabet(sb.toString(), cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        final com.google.common.io.BaseEncoding.Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            com.google.common.base.Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = com.google.common.base.Ascii.toLowerCase(cArr2[i]);
                i++;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f3865name);
            sb.append(".lowerCase()");
            com.google.common.io.BaseEncoding.Alphabet alphabet = new com.google.common.io.BaseEncoding.Alphabet(sb.toString(), cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        public final boolean matches(char c) {
            byte[] bArr = this.decodabet;
            return c < bArr.length && bArr[c] != -1;
        }

        public final java.lang.String toString() {
            return this.f3865name;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.io.BaseEncoding.Alphabet)) {
                return false;
            }
            com.google.common.io.BaseEncoding.Alphabet alphabet = (com.google.common.io.BaseEncoding.Alphabet) obj;
            return this.ignoreCase == alphabet.ignoreCase && java.util.Arrays.equals(this.chars, alphabet.chars);
        }

        public final int hashCode() {
            return java.util.Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
        }
    }

    static class StandardBaseEncoding extends com.google.common.io.BaseEncoding {
        final com.google.common.io.BaseEncoding.Alphabet alphabet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding ignoreCase;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding lowerCase;
        final java.lang.Character paddingChar;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private volatile com.google.common.io.BaseEncoding upperCase;

        StandardBaseEncoding(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
            this(new com.google.common.io.BaseEncoding.Alphabet(str, str2.toCharArray()), ch);
        }

        StandardBaseEncoding(com.google.common.io.BaseEncoding.Alphabet alphabet, java.lang.Character ch) {
            this.alphabet = (com.google.common.io.BaseEncoding.Alphabet) com.google.common.base.Preconditions.checkNotNull(alphabet);
            com.google.common.base.Preconditions.checkArgument(ch == null || !alphabet.matches(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.paddingChar = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i) {
            return this.alphabet.charsPerChunk * com.google.common.math.IntMath.divide(i, this.alphabet.bytesPerChunk, java.math.RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.OutputStream encodingStream(final java.io.Writer writer) {
            com.google.common.base.Preconditions.checkNotNull(writer);
            return new java.io.OutputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                final /* synthetic */ com.google.common.io.BaseEncoding.StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                {
                    this.this$0 = this;
                }

                @Override // java.io.OutputStream
                public void write(int i) throws java.io.IOException {
                    this.bitBuffer = (i & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (this.bitBufferLength >= this.this$0.alphabet.bitsPerChar) {
                        writer.write(this.this$0.alphabet.encode((this.bitBuffer >> (this.bitBufferLength - this.this$0.alphabet.bitsPerChar)) & this.this$0.alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= this.this$0.alphabet.bitsPerChar;
                    }
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws java.io.IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    if (this.bitBufferLength > 0) {
                        writer.write(this.this$0.alphabet.encode((this.bitBuffer << (this.this$0.alphabet.bitsPerChar - this.bitBufferLength)) & this.this$0.alphabet.mask));
                        this.writtenChars++;
                        if (this.this$0.paddingChar != null) {
                            while (this.writtenChars % this.this$0.alphabet.charsPerChunk != 0) {
                                writer.write(this.this$0.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    writer.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(appendable);
            com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                encodeChunkTo(appendable, bArr, i + i3, java.lang.Math.min(this.alphabet.bytesPerChunk, i2 - i3));
                i3 += this.alphabet.bytesPerChunk;
            }
        }

        void encodeChunkTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(appendable);
            com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            com.google.common.base.Preconditions.checkArgument(i2 <= this.alphabet.bytesPerChunk);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = this.alphabet.bitsPerChar;
            while (i3 < i2 * 8) {
                appendable.append(this.alphabet.encode(((int) (j >>> ((((i2 + 1) * 8) - i5) - i3))) & this.alphabet.mask));
                i3 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i3 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i3 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i) {
            return (int) (((this.alphabet.bitsPerChar * i) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            java.lang.Character ch = this.paddingChar;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            java.lang.CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                return false;
            }
            for (int i = 0; i < trimTrailingPadding.length(); i++) {
                if (!this.alphabet.canDecode(trimTrailingPadding.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(bArr);
            java.lang.CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid input length ");
                sb.append(trimTrailingPadding.length());
                throw new com.google.common.io.BaseEncoding.DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < trimTrailingPadding.length()) {
                long j = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.alphabet.charsPerChunk; i4++) {
                    j <<= this.alphabet.bitsPerChar;
                    if (i + i4 < trimTrailingPadding.length()) {
                        j |= this.alphabet.decode(trimTrailingPadding.charAt(i3 + i));
                        i3++;
                    }
                }
                int i5 = this.alphabet.bytesPerChunk;
                int i6 = this.alphabet.bitsPerChar;
                int i7 = (this.alphabet.bytesPerChunk - 1) * 8;
                while (i7 >= (i5 * 8) - (i3 * i6)) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.alphabet.charsPerChunk;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding
        public java.io.InputStream decodingStream(final java.io.Reader reader) {
            com.google.common.base.Preconditions.checkNotNull(reader);
            return new java.io.InputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                final /* synthetic */ com.google.common.io.BaseEncoding.StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
                
                    r1 = new java.lang.StringBuilder("Padding cannot start at index ");
                    r1.append(r4.readChars);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
                
                    throw new com.google.common.io.BaseEncoding.DecodingException(r1.toString());
                 */
                @Override // java.io.InputStream
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int read() throws java.io.IOException {
                    while (true) {
                        int read = reader.read();
                        if (read == -1) {
                            if (this.hitPadding || this.this$0.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid input length ");
                            sb.append(this.readChars);
                            throw new com.google.common.io.BaseEncoding.DecodingException(sb.toString());
                        }
                        this.readChars++;
                        char c = (char) read;
                        if (this.this$0.paddingChar != null && this.this$0.paddingChar.charValue() == c) {
                            if (this.hitPadding || (this.readChars != 1 && this.this$0.alphabet.isValidPaddingStartPosition(this.readChars - 1))) {
                                this.hitPadding = true;
                            }
                        } else {
                            if (this.hitPadding) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected padding character but found '");
                                sb2.append(c);
                                sb2.append("' at index ");
                                sb2.append(this.readChars);
                                throw new com.google.common.io.BaseEncoding.DecodingException(sb2.toString());
                            }
                            int i = this.bitBuffer << this.this$0.alphabet.bitsPerChar;
                            this.bitBuffer = i;
                            this.bitBuffer = this.this$0.alphabet.decode(c) | i;
                            int i2 = this.bitBufferLength + this.this$0.alphabet.bitsPerChar;
                            this.bitBufferLength = i2;
                            if (i2 >= 8) {
                                int i3 = i2 - 8;
                                this.bitBufferLength = i3;
                                return (this.bitBuffer >> i3) & 255;
                            }
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                    int i3 = i2 + i;
                    com.google.common.base.Preconditions.checkPositionIndexes(i, i3, bArr.length);
                    int i4 = i;
                    while (i4 < i3) {
                        int read = read();
                        if (read == -1) {
                            int i5 = i4 - i;
                            if (i5 == 0) {
                                return -1;
                            }
                            return i5;
                        }
                        bArr[i4] = (byte) read;
                        i4++;
                    }
                    return i4 - i;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    reader.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withPadChar(char c) {
            java.lang.Character ch;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch = this.paddingChar) != null && ch.charValue() == c)) ? this : newInstance(this.alphabet, java.lang.Character.valueOf(c));
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding withSeparator(java.lang.String str, int i) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                com.google.common.base.Preconditions.checkArgument(!this.alphabet.matches(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            java.lang.Character ch = this.paddingChar;
            if (ch != null) {
                com.google.common.base.Preconditions.checkArgument(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new com.google.common.io.BaseEncoding.SeparatedBaseEncoding(this, str, i);
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding upperCase() {
            com.google.common.io.BaseEncoding baseEncoding = this.upperCase;
            if (baseEncoding == null) {
                com.google.common.io.BaseEncoding.Alphabet upperCase = this.alphabet.upperCase();
                baseEncoding = upperCase == this.alphabet ? this : newInstance(upperCase, this.paddingChar);
                this.upperCase = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding lowerCase() {
            com.google.common.io.BaseEncoding baseEncoding = this.lowerCase;
            if (baseEncoding == null) {
                com.google.common.io.BaseEncoding.Alphabet lowerCase = this.alphabet.lowerCase();
                baseEncoding = lowerCase == this.alphabet ? this : newInstance(lowerCase, this.paddingChar);
                this.lowerCase = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        public com.google.common.io.BaseEncoding ignoreCase() {
            com.google.common.io.BaseEncoding baseEncoding = this.ignoreCase;
            if (baseEncoding == null) {
                com.google.common.io.BaseEncoding.Alphabet ignoreCase = this.alphabet.ignoreCase();
                baseEncoding = ignoreCase == this.alphabet ? this : newInstance(ignoreCase, this.paddingChar);
                this.ignoreCase = baseEncoding;
            }
            return baseEncoding;
        }

        com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, java.lang.Character ch) {
            return new com.google.common.io.BaseEncoding.StandardBaseEncoding(alphabet, ch);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
            sb.append(this.alphabet);
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.paddingChar);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.io.BaseEncoding.StandardBaseEncoding)) {
                return false;
            }
            com.google.common.io.BaseEncoding.StandardBaseEncoding standardBaseEncoding = (com.google.common.io.BaseEncoding.StandardBaseEncoding) obj;
            return this.alphabet.equals(standardBaseEncoding.alphabet) && java.util.Objects.equals(this.paddingChar, standardBaseEncoding.paddingChar);
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ java.util.Objects.hashCode(this.paddingChar);
        }
    }

    static final class Base16Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        final char[] encoding;

        Base16Encoding(java.lang.String str, java.lang.String str2) {
            this(new com.google.common.io.BaseEncoding.Alphabet(str, str2.toCharArray()));
        }

        private Base16Encoding(com.google.common.io.BaseEncoding.Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            com.google.common.base.Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i = 0; i < 256; i++) {
                this.encoding[i] = alphabet.encode(i >>> 4);
                this.encoding[i | 256] = alphabet.encode(i & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        final void encodeTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(appendable);
            com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.encoding[i4]);
                appendable.append(this.encoding[i4 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        final int decodeTo(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid input length ");
                sb.append(charSequence.length());
                throw new com.google.common.io.BaseEncoding.DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.alphabet.decode(charSequence.charAt(i)) << 4) | this.alphabet.decode(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        final com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, java.lang.Character ch) {
            return new com.google.common.io.BaseEncoding.Base16Encoding(alphabet);
        }
    }

    static final class Base64Encoding extends com.google.common.io.BaseEncoding.StandardBaseEncoding {
        Base64Encoding(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
            this(new com.google.common.io.BaseEncoding.Alphabet(str, str2.toCharArray()), ch);
        }

        private Base64Encoding(com.google.common.io.BaseEncoding.Alphabet alphabet, java.lang.Character ch) {
            super(alphabet, ch);
            com.google.common.base.Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        final void encodeTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(appendable);
            int i3 = i + i2;
            com.google.common.base.Preconditions.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 3;
                int i5 = (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
                appendable.append(this.alphabet.encode(i5 >>> 18));
                appendable.append(this.alphabet.encode((i5 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i5 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i5 & 63));
                i2 -= 3;
                i = i4;
            }
            if (i < i3) {
                encodeChunkTo(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        final int decodeTo(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException {
            com.google.common.base.Preconditions.checkNotNull(bArr);
            java.lang.CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid input length ");
                sb.append(trimTrailingPadding.length());
                throw new com.google.common.io.BaseEncoding.DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < trimTrailingPadding.length()) {
                int i3 = i + 2;
                int decode = (this.alphabet.decode(trimTrailingPadding.charAt(i)) << 18) | (this.alphabet.decode(trimTrailingPadding.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (decode >>> 16);
                if (i3 < trimTrailingPadding.length()) {
                    int i5 = i + 3;
                    int decode2 = decode | (this.alphabet.decode(trimTrailingPadding.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((decode2 >>> 8) & 255);
                    if (i5 < trimTrailingPadding.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((decode2 | this.alphabet.decode(trimTrailingPadding.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        final com.google.common.io.BaseEncoding newInstance(com.google.common.io.BaseEncoding.Alphabet alphabet, java.lang.Character ch) {
            return new com.google.common.io.BaseEncoding.Base64Encoding(alphabet, ch);
        }
    }

    static java.io.Reader ignoringReader(final java.io.Reader reader, final java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(reader);
        com.google.common.base.Preconditions.checkNotNull(str);
        return new java.io.Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader
            public int read() throws java.io.IOException {
                int read;
                do {
                    read = reader.read();
                    if (read == -1) {
                        break;
                    }
                } while (str.indexOf((char) read) >= 0);
                return read;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i, int i2) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                reader.close();
            }
        };
    }

    static java.lang.Appendable separatingAppendable(java.lang.Appendable appendable, java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkNotNull(appendable);
        com.google.common.base.Preconditions.checkNotNull(str);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        return new java.lang.Appendable(i, appendable, str) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ java.lang.Appendable val$delegate;
            final /* synthetic */ java.lang.String val$separator;

            {
                this.val$afterEveryChars = i;
                this.val$delegate = appendable;
                this.val$separator = str;
                this.charsUntilSeparator = i;
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(char c) throws java.io.IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(java.lang.CharSequence charSequence, int i2, int i3) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public java.lang.Appendable append(java.lang.CharSequence charSequence) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    static java.io.Writer separatingWriter(final java.io.Writer writer, java.lang.String str, int i) {
        final java.lang.Appendable separatingAppendable = separatingAppendable(writer, str, i);
        return new java.io.Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer
            public void write(int i2) throws java.io.IOException {
                separatingAppendable.append((char) i2);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i2, int i3) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws java.io.IOException {
                writer.flush();
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                writer.close();
            }
        };
    }

    /* loaded from: classes9.dex */
    static final class SeparatedBaseEncoding extends com.google.common.io.BaseEncoding {
        private final int afterEveryChars;
        private final com.google.common.io.BaseEncoding delegate;
        private final java.lang.String separator;

        SeparatedBaseEncoding(com.google.common.io.BaseEncoding baseEncoding, java.lang.String str, int i) {
            this.delegate = (com.google.common.io.BaseEncoding) com.google.common.base.Preconditions.checkNotNull(baseEncoding);
            this.separator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            this.afterEveryChars = i;
            com.google.common.base.Preconditions.checkArgument(i > 0, "Cannot add a separator after every %s chars", i);
        }

        @Override // com.google.common.io.BaseEncoding
        final java.lang.CharSequence trimTrailingPadding(java.lang.CharSequence charSequence) {
            return this.delegate.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        final int maxEncodedSize(int i) {
            int maxEncodedSize = this.delegate.maxEncodedSize(i);
            return maxEncodedSize + (this.separator.length() * com.google.common.math.IntMath.divide(java.lang.Math.max(0, maxEncodedSize - 1), this.afterEveryChars, java.math.RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public final java.io.OutputStream encodingStream(java.io.Writer writer) {
            return this.delegate.encodingStream(separatingWriter(writer, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        final void encodeTo(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
            this.delegate.encodeTo(separatingAppendable(appendable, this.separator, this.afterEveryChars), bArr, i, i2);
        }

        @Override // com.google.common.io.BaseEncoding
        final int maxDecodedSize(int i) {
            return this.delegate.maxDecodedSize(i);
        }

        @Override // com.google.common.io.BaseEncoding
        public final boolean canDecode(java.lang.CharSequence charSequence) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.separator.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.delegate.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        final int decodeTo(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.common.io.BaseEncoding.DecodingException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.separator.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.delegate.decodeTo(bArr, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        public final java.io.InputStream decodingStream(java.io.Reader reader) {
            return this.delegate.decodingStream(ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding withPadChar(char c) {
            return this.delegate.withPadChar(c).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding withSeparator(java.lang.String str, int i) {
            throw new java.lang.UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public final com.google.common.io.BaseEncoding ignoreCase() {
            return this.delegate.ignoreCase().withSeparator(this.separator, this.afterEveryChars);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.delegate);
            sb.append(".withSeparator(\"");
            sb.append(this.separator);
            sb.append("\", ");
            sb.append(this.afterEveryChars);
            sb.append(")");
            return sb.toString();
        }
    }
}
