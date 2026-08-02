package org.chromium.net;

/* loaded from: classes18.dex */
public abstract class QuicException extends org.chromium.net.NetworkException {
    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();

    public QuicException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }
}
