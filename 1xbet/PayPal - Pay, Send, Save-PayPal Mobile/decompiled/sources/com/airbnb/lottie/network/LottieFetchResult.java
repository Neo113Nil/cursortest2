package com.airbnb.lottie.network;

/* loaded from: classes7.dex */
public interface LottieFetchResult extends java.io.Closeable {
    java.io.InputStream bodyByteStream() throws java.io.IOException;

    java.lang.String contentType();

    java.lang.String error();

    boolean isSuccessful();
}
