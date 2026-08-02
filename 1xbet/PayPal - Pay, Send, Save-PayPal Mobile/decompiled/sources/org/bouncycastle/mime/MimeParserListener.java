package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public interface MimeParserListener {
    org.bouncycastle.mime.MimeContext createContext(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers);

    void object(org.bouncycastle.mime.MimeParserContext mimeParserContext, org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException;
}
