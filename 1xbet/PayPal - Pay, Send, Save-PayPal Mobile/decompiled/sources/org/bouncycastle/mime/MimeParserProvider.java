package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public interface MimeParserProvider {
    org.bouncycastle.mime.MimeParser createParser(java.io.InputStream inputStream) throws java.io.IOException;

    org.bouncycastle.mime.MimeParser createParser(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException;
}
