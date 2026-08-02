package A5;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class w extends ByteArrayOutputStream {
    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] b() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        t6.h.d(bArr, "buf");
        return bArr;
    }
}
