package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class WhiteSpaceReader {
    private final java.io.InputStream is;

    WhiteSpaceReader(java.io.InputStream inputStream) {
        this.is = inputStream;
    }

    private char read() throws java.io.IOException {
        int read = this.is.read();
        if (read >= 0) {
            return (char) read;
        }
        throw new java.io.IOException("PNM: Unexpected EOF");
    }

    public char nextChar() throws java.io.IOException {
        char read = read();
        if (read == '#') {
            while (read != '\n' && read != '\r') {
                read = read();
            }
        }
        return read;
    }

    public java.lang.String readtoWhiteSpace() throws java.io.IOException {
        char nextChar = nextChar();
        while (java.lang.Character.isWhitespace(nextChar)) {
            nextChar = nextChar();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (!java.lang.Character.isWhitespace(nextChar)) {
            sb.append(nextChar);
            nextChar = nextChar();
        }
        return sb.toString();
    }

    public java.lang.String readLine() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            char read = read();
            if (read == '\n' || read == '\r') {
                break;
            }
            sb.append(read);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
