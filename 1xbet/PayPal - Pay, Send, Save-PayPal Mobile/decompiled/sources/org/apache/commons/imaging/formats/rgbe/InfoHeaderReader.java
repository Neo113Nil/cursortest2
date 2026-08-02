package org.apache.commons.imaging.formats.rgbe;

/* loaded from: classes17.dex */
class InfoHeaderReader {
    private final java.io.InputStream is;

    InfoHeaderReader(java.io.InputStream inputStream) {
        this.is = inputStream;
    }

    private char read() throws java.io.IOException {
        int read = this.is.read();
        if (read >= 0) {
            return (char) read;
        }
        throw new java.io.IOException("HDR: Unexpected EOF");
    }

    public java.lang.String readNextLine() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            char read = read();
            if (read != '\n') {
                sb.append(read);
            } else {
                return sb.toString();
            }
        }
    }
}
