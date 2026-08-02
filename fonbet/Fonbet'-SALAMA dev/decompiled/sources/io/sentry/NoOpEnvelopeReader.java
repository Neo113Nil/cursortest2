package io.sentry;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class NoOpEnvelopeReader implements IEnvelopeReader {
    private static final NoOpEnvelopeReader instance = new NoOpEnvelopeReader();

    private NoOpEnvelopeReader() {
    }

    public static NoOpEnvelopeReader getInstance() {
        return instance;
    }

    @Override // io.sentry.IEnvelopeReader
    public SentryEnvelope read(InputStream inputStream) {
        return null;
    }
}
