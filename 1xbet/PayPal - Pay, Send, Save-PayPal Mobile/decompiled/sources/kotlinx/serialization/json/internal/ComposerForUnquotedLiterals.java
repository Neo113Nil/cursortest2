package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "printQuoted", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposerForUnquotedLiterals extends kotlinx.serialization.json.internal.Composer {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnquotedLiterals(kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, boolean z) {
        super(internalJsonWriter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        this.getHighSpeedVideoSizes = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void printQuoted(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (this.getHighSpeedVideoSizes) {
            super.printQuoted(value);
        } else {
            super.print(value);
        }
    }
}
