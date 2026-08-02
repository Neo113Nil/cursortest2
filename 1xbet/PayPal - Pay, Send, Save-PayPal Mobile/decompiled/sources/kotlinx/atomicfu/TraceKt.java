package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/atomicfu/TraceFormat;", "format", "Lkotlinx/atomicfu/TraceBase;", "Trace", "(ILkotlinx/atomicfu/TraceFormat;)Lkotlinx/atomicfu/TraceBase;", "", "name", "named", "(Lkotlinx/atomicfu/TraceBase;Ljava/lang/String;)Lkotlinx/atomicfu/TraceBase;", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/String;", "traceFormatDefault", "Lkotlinx/atomicfu/TraceFormat;", "getTraceFormatDefault", "()Lkotlinx/atomicfu/TraceFormat;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TraceKt {
    private static final kotlinx.atomicfu.TraceFormat traceFormatDefault;

    public static final kotlinx.atomicfu.TraceBase Trace(int i, kotlinx.atomicfu.TraceFormat traceFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceFormat, "");
        return new kotlinx.atomicfu.TraceImpl(i, traceFormat);
    }

    public static final kotlinx.atomicfu.TraceBase named(kotlinx.atomicfu.TraceBase traceBase, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return traceBase == kotlinx.atomicfu.TraceBase.None.INSTANCE ? traceBase : new kotlinx.atomicfu.NamedTrace(traceBase, str);
    }

    private static final java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static final kotlinx.atomicfu.TraceFormat getTraceFormatDefault() {
        return traceFormatDefault;
    }

    static {
        traceFormatDefault = Camera2StreamConfigurationMap("kotlinx.atomicfu.trace.thread") != null ? new kotlinx.atomicfu.TraceFormatThread() : new kotlinx.atomicfu.TraceFormat();
    }

    public static /* synthetic */ kotlinx.atomicfu.TraceBase Trace$default(int i, kotlinx.atomicfu.TraceFormat traceFormat, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 32;
        }
        if ((i2 & 2) != 0) {
            traceFormat = traceFormatDefault;
        }
        return Trace(i, traceFormat);
    }
}
