package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001bJ\r\u0010!\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\u001bJ\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010\t\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020#H\u0002¢\u0006\u0004\b\t\u0010$J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b\u001c\u0010&R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u0016\u0010!\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u001a\u0010\u0012\u001a\u00020\u000b*\u0004\u0018\u00010\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010+R\u001a\u0010\u0017\u001a\u00020\u000b*\u0004\u0018\u00010\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010+"}, d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;I)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "", "CoroutineDebuggingKt", "()Z", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "getValidOutputFormatsForInputhNQ4ISI", "coroutineCreation", "getOutputStallDurationlomOqCM", "getOutputSizeshNQ4ISI", "isOutputSupportedFor", "isOutputSupportedForhNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputStallDuration", "unwrapAs", "Landroid/widget/EdgeEffect;", "getInputSizeshNQ4ISI", "()Landroid/widget/EdgeEffect;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getInputFormats", "getOutputFormats", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;", "Landroidx/compose/ui/unit/IntSize;", "(J)V", "Landroid/content/Context;", com.visa.cbp.getEncExpo.warmup, "J", "Landroid/widget/EdgeEffect;", "(Landroid/widget/EdgeEffect;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EdgeEffectWrapper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.widget.EdgeEffect getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.widget.EdgeEffect getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.widget.EdgeEffect getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private android.widget.EdgeEffect getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private android.widget.EdgeEffect getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.EdgeEffect getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private android.widget.EdgeEffect getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private android.widget.EdgeEffect getOutputMinFrameDuration;

    public EdgeEffectWrapper(android.content.Context context, int i) {
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        android.widget.EdgeEffect edgeEffect = this.getHighSpeedVideoFpsRanges;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        android.widget.EdgeEffect edgeEffect2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        android.widget.EdgeEffect edgeEffect3 = this.getOutputFormats;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        android.widget.EdgeEffect edgeEffect4 = this.getInputFormats;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        android.widget.EdgeEffect edgeEffect5 = this.getOutputMinFrameDuration;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        android.widget.EdgeEffect edgeEffect6 = this.getInputSizeshNQ4ISI;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        android.widget.EdgeEffect edgeEffect7 = this.getHighSpeedVideoSizesFor;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        android.widget.EdgeEffect edgeEffect8 = this.getOutputMinFrameDurationlomOqCM;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final boolean CoroutineDebuggingKt() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean getOutputMinFrameDurationlomOqCM() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean getOutputSizes() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats);
    }

    public final boolean getValidOutputFormatsForInputhNQ4ISI() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats);
    }

    public final boolean coroutineCreation() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration);
    }

    public final boolean getOutputStallDurationlomOqCM() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getInputSizeshNQ4ISI);
    }

    public final boolean getOutputSizeshNQ4ISI() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor);
    }

    public final boolean isOutputSupportedFor() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDurationlomOqCM);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final boolean isOutputSupportedForhNQ4ISI() {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean getHighSpeedVideoSizesFor() {
        return Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean getOutputStallDuration() {
        return Camera2StreamConfigurationMap(this.getOutputFormats);
    }

    public final boolean unwrapAs() {
        return Camera2StreamConfigurationMap(this.getInputFormats);
    }

    private static boolean Camera2StreamConfigurationMap(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final android.widget.EdgeEffect getInputSizeshNQ4ISI() {
        android.widget.EdgeEffect edgeEffect = this.getHighSpeedVideoFpsRanges;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Vertical);
        this.getHighSpeedVideoFpsRanges = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getHighSpeedVideoFpsRangesFor() {
        android.widget.EdgeEffect edgeEffect = this.getHighResolutionOutputSizeshNQ4ISI;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Vertical);
        this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getHighSpeedVideoFpsRanges() {
        android.widget.EdgeEffect edgeEffect = this.getOutputFormats;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Horizontal);
        this.getOutputFormats = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getInputFormats() {
        android.widget.EdgeEffect edgeEffect = this.getInputFormats;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Horizontal);
        this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getOutputFormats() {
        android.widget.EdgeEffect edgeEffect = this.getOutputMinFrameDuration;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Vertical);
        this.getOutputMinFrameDuration = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getHighSpeedVideoSizes() {
        android.widget.EdgeEffect edgeEffect = this.getInputSizeshNQ4ISI;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Vertical);
        this.getInputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect Camera2StreamConfigurationMap() {
        android.widget.EdgeEffect edgeEffect = this.getHighSpeedVideoSizesFor;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Horizontal);
        this.getHighSpeedVideoSizesFor = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.widget.EdgeEffect getOutputMinFrameDuration() {
        android.widget.EdgeEffect edgeEffect = this.getOutputMinFrameDurationlomOqCM;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation.Horizontal);
        this.getOutputMinFrameDurationlomOqCM = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    private final android.widget.EdgeEffect getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Orientation p0) {
        android.widget.EdgeEffect create = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.create(this.getHighSpeedVideoSizes);
        create.setColor(this.getHighSpeedVideoFpsRangesFor);
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.Camera2StreamConfigurationMap, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            if (p0 == androidx.compose.foundation.gestures.Orientation.Vertical) {
                long j = this.Camera2StreamConfigurationMap;
                create.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return create;
            }
            long j2 = this.Camera2StreamConfigurationMap;
            create.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return create;
    }

    public final void getHighSpeedVideoFpsRangesFor(long p0) {
        this.Camera2StreamConfigurationMap = p0;
        android.widget.EdgeEffect edgeEffect = this.getHighSpeedVideoFpsRanges;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (p0 >> 32), (int) (p0 & 4294967295L));
        }
        android.widget.EdgeEffect edgeEffect2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (p0 >> 32), (int) (p0 & 4294967295L));
        }
        android.widget.EdgeEffect edgeEffect3 = this.getOutputFormats;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (p0 & 4294967295L), (int) (p0 >> 32));
        }
        android.widget.EdgeEffect edgeEffect4 = this.getInputFormats;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (p0 & 4294967295L), (int) (p0 >> 32));
        }
        android.widget.EdgeEffect edgeEffect5 = this.getOutputMinFrameDuration;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (p0 >> 32), (int) (p0 & 4294967295L));
        }
        android.widget.EdgeEffect edgeEffect6 = this.getInputSizeshNQ4ISI;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (p0 >> 32), (int) (p0 & 4294967295L));
        }
        android.widget.EdgeEffect edgeEffect7 = this.getHighSpeedVideoSizesFor;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (p0 & 4294967295L), (int) (p0 >> 32));
        }
        android.widget.EdgeEffect edgeEffect8 = this.getOutputMinFrameDurationlomOqCM;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & p0), (int) (p0 >> 32));
        }
    }
}
