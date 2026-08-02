package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class ConstantMimeContext implements org.bouncycastle.mime.MimeContext, org.bouncycastle.mime.MimeMultipartContext {
    @Override // org.bouncycastle.mime.MimeContext
    public java.io.InputStream applyContext(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public org.bouncycastle.mime.MimeContext createContext(int i) throws java.io.IOException {
        return this;
    }
}
