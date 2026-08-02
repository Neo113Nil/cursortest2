package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public class FormatCompliance {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.FormatCompliance.class.getName());
    private final java.util.List<java.lang.String> comments;
    private final java.lang.String description;
    private final boolean failOnError;

    public FormatCompliance(java.lang.String str) {
        this.comments = new java.util.ArrayList();
        this.description = str;
        this.failOnError = false;
    }

    public FormatCompliance(java.lang.String str, boolean z) {
        this.comments = new java.util.ArrayList();
        this.description = str;
        this.failOnError = z;
    }

    public static org.apache.commons.imaging.FormatCompliance getDefault() {
        return new org.apache.commons.imaging.FormatCompliance("ignore", false);
    }

    public void addComment(java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        this.comments.add(str);
        if (this.failOnError) {
            throw new org.apache.commons.imaging.ImageReadException(str);
        }
    }

    public void addComment(java.lang.String str, int i) throws org.apache.commons.imaging.ImageReadException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(getValueDescription(i));
        addComment(sb.toString());
    }

    public java.lang.String toString() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        dump(new java.io.PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    public void dump() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                try {
                    dump(printWriter);
                    printWriter.flush();
                    stringWriter.flush();
                    LOGGER.fine(stringWriter.toString());
                    printWriter.close();
                    stringWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), (java.lang.Throwable) e);
        }
    }

    public void dump(java.io.PrintWriter printWriter) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Format Compliance: ");
        sb.append(this.description);
        printWriter.println(sb.toString());
        if (this.comments.isEmpty()) {
            printWriter.println("\tNo comments.");
        } else {
            int i = 0;
            while (i < this.comments.size()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t");
                int i2 = i + 1;
                sb2.append(i2);
                sb2.append(": ");
                sb2.append(this.comments.get(i));
                printWriter.println(sb2.toString());
                i = i2;
            }
        }
        printWriter.println("");
        printWriter.flush();
    }

    private java.lang.String getValueDescription(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(" (");
        sb.append(java.lang.Integer.toHexString(i));
        sb.append(")");
        return sb.toString();
    }

    public boolean compareBytes(java.lang.String str, byte[] bArr, byte[] bArr2) throws org.apache.commons.imaging.ImageReadException {
        if (bArr.length != bArr2.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(": Unexpected length: (expected: ");
            sb.append(bArr.length);
            sb.append(", actual: ");
            sb.append(bArr2.length);
            sb.append(")");
            addComment(sb.toString());
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(": Unexpected value: (expected: ");
                sb2.append(getValueDescription(bArr[i]));
                sb2.append(", actual: ");
                sb2.append(getValueDescription(bArr2[i]));
                sb2.append(")");
                addComment(sb2.toString());
                return false;
            }
        }
        return true;
    }

    public boolean checkBounds(java.lang.String str, int i, int i2, int i3) throws org.apache.commons.imaging.ImageReadException {
        if (i3 >= i && i3 <= i2) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": bounds check: ");
        sb.append(i);
        sb.append(" <= ");
        sb.append(i3);
        sb.append(" <= ");
        sb.append(i2);
        sb.append(": false");
        addComment(sb.toString());
        return false;
    }

    public boolean compare(java.lang.String str, int i, int i2) throws org.apache.commons.imaging.ImageReadException {
        return compare(str, new int[]{i}, i2);
    }

    public boolean compare(java.lang.String str, int[] iArr, int i) throws org.apache.commons.imaging.ImageReadException {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(43);
        sb.append(str);
        sb.append(": Unexpected value: (valid: ");
        if (iArr.length > 1) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(getValueDescription(iArr[i3]));
        }
        if (iArr.length > 1) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        }
        sb.append(", actual: ");
        sb.append(getValueDescription(i));
        sb.append(")");
        addComment(sb.toString());
        return false;
    }
}
