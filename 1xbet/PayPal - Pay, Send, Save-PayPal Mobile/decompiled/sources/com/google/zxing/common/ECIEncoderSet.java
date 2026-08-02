package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class ECIEncoderSet {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.List<java.nio.charset.CharsetEncoder> ENCODERS = new java.util.ArrayList();
    private final java.nio.charset.CharsetEncoder[] encoders;
    private final int priorityEncoderIndex;

    static {
        java.lang.String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            java.lang.String str = strArr[i];
            if (com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(str) != null) {
                try {
                    ENCODERS.add(java.nio.charset.Charset.forName(str).newEncoder());
                } catch (java.nio.charset.UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public ECIEncoderSet(java.lang.String str, java.nio.charset.Charset charset, int i) {
        boolean z;
        java.util.ArrayList<java.nio.charset.CharsetEncoder> arrayList = new java.util.ArrayList();
        arrayList.add(java.nio.charset.StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            for (java.nio.charset.CharsetEncoder charsetEncoder : arrayList) {
                char charAt = str.charAt(i3);
                if (charAt == i || charsetEncoder.canEncode(charAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                for (java.nio.charset.CharsetEncoder charsetEncoder2 : ENCODERS) {
                    if (charsetEncoder2.canEncode(str.charAt(i3))) {
                        arrayList.add(charsetEncoder2);
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() == 1 && !z2) {
            this.encoders = new java.nio.charset.CharsetEncoder[]{(java.nio.charset.CharsetEncoder) arrayList.get(0)};
        } else {
            this.encoders = new java.nio.charset.CharsetEncoder[arrayList.size() + 2];
            java.util.Iterator it = arrayList.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                this.encoders[i4] = (java.nio.charset.CharsetEncoder) it.next();
                i4++;
            }
            this.encoders[i4] = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
            this.encoders[i4 + 1] = java.nio.charset.StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            while (true) {
                java.nio.charset.CharsetEncoder[] charsetEncoderArr = this.encoders;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.encoders[i2].charset().name())) {
                    break;
                } else {
                    i2++;
                }
            }
            this.priorityEncoderIndex = i2;
        }
        i2 = -1;
        this.priorityEncoderIndex = i2;
    }

    public final int length() {
        return this.encoders.length;
    }

    public final java.lang.String getCharsetName(int i) {
        return this.encoders[i].charset().name();
    }

    public final java.nio.charset.Charset getCharset(int i) {
        return this.encoders[i].charset();
    }

    public final int getECIValue(int i) {
        return com.google.zxing.common.CharacterSetECI.getCharacterSetECI(this.encoders[i].charset()).getValue();
    }

    public final int getPriorityEncoderIndex() {
        return this.priorityEncoderIndex;
    }

    public final boolean canEncode(char c, int i) {
        return this.encoders[i].canEncode("".concat(java.lang.String.valueOf(c)));
    }

    public final byte[] encode(char c, int i) {
        return "".concat(java.lang.String.valueOf(c)).getBytes(this.encoders[i].charset());
    }

    public final byte[] encode(java.lang.String str, int i) {
        return str.getBytes(this.encoders[i].charset());
    }
}
