package org.chromium.net;

/* loaded from: classes4.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exception);

    public abstract void onReadSucceeded(boolean finalChunk);

    public abstract void onRewindError(Exception exception);

    public abstract void onRewindSucceeded();
}
