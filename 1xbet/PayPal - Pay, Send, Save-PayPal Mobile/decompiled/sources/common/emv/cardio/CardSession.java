package common.emv.cardio;

/* loaded from: classes17.dex */
public interface CardSession {
    void close(long j, java.util.concurrent.TimeUnit timeUnit);

    byte[] send(byte[] bArr) throws java.io.IOException;

    default void close() {
        close(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
