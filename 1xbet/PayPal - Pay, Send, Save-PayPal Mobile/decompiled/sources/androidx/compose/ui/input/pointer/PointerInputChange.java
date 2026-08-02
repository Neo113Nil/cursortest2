package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b/\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014B]\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015BS\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010&Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)Jq\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010+Jq\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-Ju\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u0081\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u00107R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b9\u00107R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b@\u00107R\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\bA\u00107R\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bB\u0010<R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bF\u00107R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198G¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010\u001c\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u00105\u001a\u0004\bL\u00107\"\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bO\u0010<R\"\u0010P\u001a\u00020\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010SR\"\u0010T\u001a\u00020\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bT\u0010:\u001a\u0004\bU\u0010<\"\u0004\bV\u0010SR$\u0010W\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0018\u0010I\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010\u0017\u001a\u00020\u00168GX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010 \u001a\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "consume", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "()Ljava/lang/String;", "J", "getId-J3iCeTQ", "()J", "getUptimeMillis", "getPosition-F1C5BW0", "Z", "getPressed", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPressure", "()F", "getPreviousUptimeMillis", "getPreviousPosition-F1C5BW0", "getPreviousPressed", com.visa.cbp.getEncExpo.warmup, "getType-T8wyACA", "()I", "getScrollDelta-F1C5BW0", "getHistorical", "()Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getOriginalEventPosition-F1C5BW0$ui", "setOriginalEventPosition-k-4lQ0M$ui", "(J)V", "isConsumed", "downChange", "getDownChange$ui", "setDownChange$ui", "(Z)V", "positionChange", "getPositionChange$ui", "setPositionChange$ui", "consumedDelegate", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getConsumedDelegate$ui", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setConsumedDelegate$ui", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private androidx.compose.ui.input.pointer.PointerInputChange consumedDelegate;
    private boolean downChange;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.ConsumedData getHighSpeedVideoFpsRanges;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    @kotlin.Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.originalEventPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.downChange = z3;
        this.positionChange = z3;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA() : i, (i2 & 1024) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & 256) != 0 ? androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA() : i, (i2 & 512) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, j6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, androidx.compose.ui.input.pointer.ConsumedData consumedData, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & 256) != 0 ? androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA() : i, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, androidx.compose.ui.input.pointer.ConsumedData consumedData, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.originalEventPosition = j7;
    }

    public final java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> getHistorical() {
        java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list = this.getHighResolutionOutputSizeshNQ4ISI;
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name and from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui, reason: not valid java name */
    public final void m7235setOriginalEventPositionk4lQ0M$ui(long j) {
        this.originalEventPosition = j;
    }

    public final boolean isConsumed() {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this;
        while (true) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
            if (pointerInputChange2 == null) {
                break;
            }
            pointerInputChange = pointerInputChange2;
        }
        return pointerInputChange.downChange || pointerInputChange.positionChange;
    }

    /* renamed from: getDownChange$ui, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    public final void setDownChange$ui(boolean z) {
        this.downChange = z;
    }

    /* renamed from: getPositionChange$ui, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void setPositionChange$ui(boolean z) {
        this.positionChange = z;
    }

    /* renamed from: getConsumedDelegate$ui, reason: from getter */
    public final androidx.compose.ui.input.pointer.PointerInputChange getConsumedDelegate() {
        return this.consumedDelegate;
    }

    public final void setConsumedDelegate$ui(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void consume() {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this;
        while (true) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = pointerInputChange.consumedDelegate;
            if (pointerInputChange2 == null) {
                pointerInputChange.downChange = true;
                pointerInputChange.positionChange = true;
                return;
            } else if (pointerInputChange2 == null) {
                return;
            } else {
                pointerInputChange = pointerInputChange2;
            }
        }
    }

    public final androidx.compose.ui.input.pointer.ConsumedData getConsumed() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.input.pointer.ConsumedData(this);
        }
        androidx.compose.ui.input.pointer.ConsumedData consumedData = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(consumedData);
        return consumedData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @kotlin.ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange m7224copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, androidx.compose.ui.input.pointer.ConsumedData consumed, int type) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = new androidx.compose.ui.input.pointer.PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputChange m7225copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        androidx.compose.ui.input.pointer.PointerInputChange m7228copywbzehF4 = m7228copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, getHistorical(), scrollDelta);
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        m7228copywbzehF4.consumedDelegate = pointerInputChange;
        return m7228copywbzehF4;
    }

    @kotlin.Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @kotlin.ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputChange m7223copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, androidx.compose.ui.input.pointer.ConsumedData consumed, int type, long scrollDelta) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = new androidx.compose.ui.input.pointer.PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputChange m7227copyTn9QgHE(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = new androidx.compose.ui.input.pointer.PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, getHistorical(), scrollDelta, this.originalEventPosition, null);
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputChange m7226copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical, long scrollDelta) {
        androidx.compose.ui.input.pointer.PointerInputChange m7228copywbzehF4 = m7228copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        m7228copywbzehF4.consumedDelegate = pointerInputChange;
        return m7228copywbzehF4;
    }

    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputChange m7228copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical, long scrollDelta) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = new androidx.compose.ui.input.pointer.PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputChange(id=");
        sb.append((java.lang.Object) androidx.compose.ui.input.pointer.PointerId.m7215toStringimpl(this.id));
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", position=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.position));
        sb.append(", pressed=");
        sb.append(this.pressed);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", previousUptimeMillis=");
        sb.append(this.previousUptimeMillis);
        sb.append(", previousPosition=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.previousPosition));
        sb.append(", previousPressed=");
        sb.append(this.previousPressed);
        sb.append(", isConsumed=");
        sb.append(isConsumed());
        sb.append(", type=");
        sb.append((java.lang.Object) androidx.compose.ui.input.pointer.PointerType.m7301toStringimpl(this.type));
        sb.append(", historical=");
        sb.append(getHistorical());
        sb.append(",scrollDelta=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.scrollDelta));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @kotlin.ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, androidx.compose.ui.input.pointer.ConsumedData consumedData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, java.util.List list, long j6, long j7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (java.util.List<androidx.compose.ui.input.pointer.HistoricalChange>) list, j6, j7);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }
}
