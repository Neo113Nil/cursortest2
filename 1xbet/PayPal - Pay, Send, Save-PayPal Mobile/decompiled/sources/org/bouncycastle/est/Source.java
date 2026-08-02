package org.bouncycastle.est;

/* loaded from: classes17.dex */
public interface Source<T> {
    void close() throws java.io.IOException;

    java.io.InputStream getInputStream() throws java.io.IOException;

    java.io.OutputStream getOutputStream() throws java.io.IOException;

    T getSession();
}
