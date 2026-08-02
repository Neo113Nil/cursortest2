package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\u0018J\u0084\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u0010$J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b<\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010$R\u001a\u0010\u000f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bC\u0010 R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010(R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bF\u0010\u0018R\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bG\u0010\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", com.daon.sdk.face.license.License.FEATURE_POSITION, "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "", "pressure", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "activeHover", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-J3iCeTQ", "()J", "component1", "component2", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "component5", "()Z", "component6", "()F", "component7-T8wyACA", "()I", "component7", "component8", "component9", "()Ljava/util/List;", "component10-F1C5BW0", "component10", "component11-F1C5BW0", "component11", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getId-J3iCeTQ", "getUptime", "getPositionOnScreen-F1C5BW0", "getPosition-F1C5BW0", "Z", "getDown", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPressure", com.visa.cbp.getEncExpo.warmup, "getType-T8wyACA", "getActiveHover", "Ljava/util/List;", "getHistorical", "getScrollDelta-F1C5BW0", "getOriginalEventPosition-F1C5BW0"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list, long j5, long j6) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.originalEventPosition = j6;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m7244getIdJ3iCeTQ() {
        return this.id;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m7247getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m7246getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m7249getTypeT8wyACA() {
        return this.type;
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.List list, long j5, long j6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? new java.util.ArrayList() : list, (i2 & 512) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j5, (i2 & 1024) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : j6, null);
    }

    public final java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m7248getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m7245getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputEventData(id=");
        sb.append((java.lang.Object) androidx.compose.ui.input.pointer.PointerId.m7215toStringimpl(this.id));
        sb.append(", uptime=");
        sb.append(this.uptime);
        sb.append(", positionOnScreen=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.positionOnScreen));
        sb.append(", position=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.position));
        sb.append(", down=");
        sb.append(this.down);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", type=");
        sb.append((java.lang.Object) androidx.compose.ui.input.pointer.PointerType.m7301toStringimpl(this.type));
        sb.append(", activeHover=");
        sb.append(this.activeHover);
        sb.append(", historical=");
        sb.append(this.historical);
        sb.append(", scrollDelta=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.scrollDelta));
        sb.append(", originalEventPosition=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.originalEventPosition));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((androidx.compose.ui.input.pointer.PointerId.m7214hashCodeimpl(this.id) * 31) + java.lang.Long.hashCode(this.uptime)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.positionOnScreen)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.position)) * 31) + java.lang.Boolean.hashCode(this.down)) * 31) + java.lang.Float.hashCode(this.pressure)) * 31) + androidx.compose.ui.input.pointer.PointerType.m7300hashCodeimpl(this.type)) * 31) + java.lang.Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.scrollDelta)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.originalEventPosition);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.input.pointer.PointerInputEventData)) {
            return false;
        }
        androidx.compose.ui.input.pointer.PointerInputEventData pointerInputEventData = (androidx.compose.ui.input.pointer.PointerInputEventData) other;
        return androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && java.lang.Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && kotlin.jvm.internal.Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final androidx.compose.ui.input.pointer.PointerInputEventData m7243copyrc8HELY(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean activeHover, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> historical, long scrollDelta, long originalEventPosition) {
        return new androidx.compose.ui.input.pointer.PointerInputEventData(id, uptime, positionOnScreen, position, down, pressure, type, activeHover, historical, scrollDelta, originalEventPosition, null);
    }

    public final java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name and from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name and from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.List list, long j5, long j6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, j6);
    }
}
