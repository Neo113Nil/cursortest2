package com.goldenboot.saga.zone;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class LocalRecord extends CancellationException {
    public final transient DrawableSynthesizer reduceScope;

    public LocalRecord(String str, DrawableSynthesizer drawableSynthesizer) {
        super(str);
        this.reduceScope = drawableSynthesizer;
    }

    public LocalRecord(String str) {
        this(str, null);
    }
}
