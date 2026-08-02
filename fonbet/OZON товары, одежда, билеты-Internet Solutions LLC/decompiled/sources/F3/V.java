package F3;

/* loaded from: classes.dex */
public interface V {

    public interface a<T extends V> {
        void c(T t2);
    }

    boolean continueLoading(androidx.media3.exoplayer.M m11);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j11);
}
