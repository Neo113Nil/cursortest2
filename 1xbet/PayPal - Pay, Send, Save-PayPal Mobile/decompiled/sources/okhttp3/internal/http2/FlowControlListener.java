package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\rJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener;", "", "", "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", "", "bufferSize", "", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FlowControlListener {
    void receivingConnectionWindowChanged(okhttp3.internal.http2.flowcontrol.WindowCounter windowCounter);

    void receivingStreamWindowChanged(int streamId, okhttp3.internal.http2.flowcontrol.WindowCounter windowCounter, long bufferSize);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener$None;", "Lokhttp3/internal/http2/FlowControlListener;", "<init>", "()V", "", "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", "", "bufferSize", "", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements okhttp3.internal.http2.FlowControlListener {
        public static final okhttp3.internal.http2.FlowControlListener.None INSTANCE = new okhttp3.internal.http2.FlowControlListener.None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void receivingStreamWindowChanged(int streamId, okhttp3.internal.http2.flowcontrol.WindowCounter windowCounter, long bufferSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowCounter, "");
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void receivingConnectionWindowChanged(okhttp3.internal.http2.flowcontrol.WindowCounter windowCounter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowCounter, "");
        }
    }
}
