package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/client/engine/okhttp/StreamRequestBody;", "Lokhttp3/RequestBody;", "", "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "()J", "", "isOneShot", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Long;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StreamRequestBody extends okhttp3.RequestBody {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getHighSpeedVideoFpsRangesFor;

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final okhttp3.MediaType getContentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamRequestBody(java.lang.Long l, kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = l;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) {
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        try {
            java.lang.Throwable th = null;
            okio.Source source = okio.Okio.source(io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream$default(this.getHighSpeedVideoFpsRangesFor.invoke(), null, 1, null));
            try {
                long writeAll = sink.writeAll(source);
                if (source != null) {
                    try {
                        source.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                l = java.lang.Long.valueOf(writeAll);
            } catch (java.lang.Throwable th3) {
                if (source != null) {
                    try {
                        source.close();
                    } catch (java.lang.Throwable th4) {
                        kotlin.ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                l = null;
            }
            if (th != null) {
                throw th;
            }
            java.lang.Long l2 = l;
        } catch (java.io.IOException e) {
            throw e;
        } catch (java.lang.Throwable th5) {
            throw new io.ktor.client.engine.okhttp.StreamAdapterIOException(th5);
        }
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        java.lang.Long l = this.Camera2StreamConfigurationMap;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }
}
