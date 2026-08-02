package org.bouncycastle.util.io.pem;

/* loaded from: classes17.dex */
public class PemReader extends java.io.BufferedReader {
    public org.bouncycastle.util.io.pem.PemObject readPemObject() throws java.io.IOException {
        java.lang.String readLine;
        java.lang.String substring;
        int indexOf;
        java.lang.String readLine2;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith("-----BEGIN "));
        if (readLine == null || (indexOf = (substring = readLine.substring(11)).indexOf(45)) <= 0 || !substring.endsWith("-----") || substring.length() - indexOf != 5) {
            return null;
        }
        java.lang.String substring2 = substring.substring(0, indexOf);
        java.lang.String concat = "-----END ".concat(java.lang.String.valueOf(substring2));
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            readLine2 = readLine();
            if (readLine2 != null) {
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 < 0) {
                    if (readLine2.indexOf(concat) != -1) {
                        break;
                    }
                    stringBuffer.append(readLine2.trim());
                } else {
                    arrayList.add(new org.bouncycastle.util.io.pem.PemHeader(readLine2.substring(0, indexOf2), readLine2.substring(indexOf2 + 1).trim()));
                }
            } else {
                break;
            }
        }
        if (readLine2 != null) {
            return new org.bouncycastle.util.io.pem.PemObject(substring2, arrayList, org.bouncycastle.util.encoders.Base64.decode(stringBuffer.toString()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(concat);
        sb.append(" not found");
        throw new java.io.IOException(sb.toString());
    }

    public PemReader(java.io.Reader reader) {
        super(reader);
    }
}
