package com.squareup.picasso;

/* loaded from: classes5.dex */
public interface Downloader {
    okhttp3.Response load(okhttp3.Request request) throws java.io.IOException;

    void shutdown();
}
