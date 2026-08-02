package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public interface MimeContext {
    java.io.InputStream applyContext(org.bouncycastle.mime.Headers headers, java.io.InputStream inputStream) throws java.io.IOException;
}
