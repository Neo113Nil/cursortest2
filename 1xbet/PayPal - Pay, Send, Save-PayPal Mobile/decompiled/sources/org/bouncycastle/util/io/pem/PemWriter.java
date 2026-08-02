package org.bouncycastle.util.io.pem;

/* loaded from: classes17.dex */
public class PemWriter extends java.io.BufferedWriter {
    private char[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;

    public void writeObject(org.bouncycastle.util.io.pem.PemObjectGenerator pemObjectGenerator) throws java.io.IOException {
        char[] cArr;
        int i;
        org.bouncycastle.util.io.pem.PemObject generate = pemObjectGenerator.generate();
        java.lang.String type = generate.getType();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN ");
        sb.append(type);
        sb.append("-----");
        write(sb.toString());
        newLine();
        if (!generate.getHeaders().isEmpty()) {
            for (org.bouncycastle.util.io.pem.PemHeader pemHeader : generate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        byte[] encode = org.bouncycastle.util.encoders.Base64.encode(generate.getContent());
        int i2 = 0;
        while (i2 < encode.length) {
            int i3 = 0;
            while (true) {
                cArr = this.Camera2StreamConfigurationMap;
                if (i3 != cArr.length && (i = i2 + i3) < encode.length) {
                    cArr[i3] = (char) encode[i];
                    i3++;
                }
            }
            write(cArr, 0, i3);
            newLine();
            i2 += this.Camera2StreamConfigurationMap.length;
        }
        java.lang.String type2 = generate.getType();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("-----END ");
        sb2.append(type2);
        sb2.append("-----");
        write(sb2.toString());
        newLine();
    }

    public int getOutputSize(org.bouncycastle.util.io.pem.PemObject pemObject) {
        int length = ((pemObject.getType().length() + 10 + this.getHighSpeedVideoFpsRanges) * 2) + 10;
        if (!pemObject.getHeaders().isEmpty()) {
            for (org.bouncycastle.util.io.pem.PemHeader pemHeader : pemObject.getHeaders()) {
                length += pemHeader.getName().length() + 2 + pemHeader.getValue().length() + this.getHighSpeedVideoFpsRanges;
            }
            length += this.getHighSpeedVideoFpsRanges;
        }
        int length2 = ((pemObject.getContent().length + 2) / 3) * 4;
        return length + length2 + (((length2 + 63) / 64) * this.getHighSpeedVideoFpsRanges);
    }

    public PemWriter(java.io.Writer writer) {
        super(writer);
        this.Camera2StreamConfigurationMap = new char[64];
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        this.getHighSpeedVideoFpsRanges = lineSeparator != null ? lineSeparator.length() : 2;
    }
}
