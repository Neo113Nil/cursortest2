package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Landroidx/core/os/BufferFillPolicy;", "", "", "p0", "<init>", "(I)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue$core", "()I", "Companion", "Discard", "RingBuffer", "Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy$RingBuffer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BufferFillPolicy {
    public static final androidx.core.os.BufferFillPolicy DISCARD = new androidx.core.os.BufferFillPolicy.Discard();
    public static final androidx.core.os.BufferFillPolicy RING_BUFFER = new androidx.core.os.BufferFillPolicy.RingBuffer();
    private final int value;

    private BufferFillPolicy(int i) {
        this.value = i;
    }

    /* renamed from: getValue$core, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/os/BufferFillPolicy$Discard;", "Landroidx/core/os/BufferFillPolicy;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Discard extends androidx.core.os.BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/os/BufferFillPolicy$RingBuffer;", "Landroidx/core/os/BufferFillPolicy;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class RingBuffer extends androidx.core.os.BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    public /* synthetic */ BufferFillPolicy(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
