package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class CanonicalOutputStream extends java.io.FilterOutputStream {
    protected static byte[] newline = {13, 10};
    private final boolean getHighSpeedVideoFpsRangesFor;
    protected int lastb;

    public void writeln() throws java.io.IOException {
        ((java.io.FilterOutputStream) this).out.write(newline);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        for (int i3 = i; i3 != i + i2; i3++) {
            write(bArr[i3]);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (i == 13) {
                this.out.write(newline);
            } else if (i == 10) {
                if (this.lastb != 13) {
                    this.out.write(newline);
                }
            }
            this.lastb = i;
        }
        this.out.write(i);
        this.lastb = i;
    }

    public CanonicalOutputStream(org.bouncycastle.mime.smime.SMimeParserContext sMimeParserContext, org.bouncycastle.mime.Headers headers, java.io.OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        if (headers.getContentType() != null) {
            this.getHighSpeedVideoFpsRangesFor = (headers.getContentType() == null || headers.getContentType().equals("binary")) ? false : true;
        } else {
            this.getHighSpeedVideoFpsRangesFor = sMimeParserContext.getDefaultContentTransferEncoding().equals("7bit");
        }
    }
}
