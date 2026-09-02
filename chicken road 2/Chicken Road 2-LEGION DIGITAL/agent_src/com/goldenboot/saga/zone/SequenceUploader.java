package com.goldenboot.saga.zone;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface SequenceUploader extends RipplePipeline, ReadableByteChannel {
    String applyTask(long j);

    short injectConstraint();

    int mergeLocale();

    InputStream prepareTask();

    void queryModel(long j);

    byte readByte();

    boolean reduceScope();

    ProducerHeap serializeOffset();

    void skip(long j);

    long storeCharset();
}
