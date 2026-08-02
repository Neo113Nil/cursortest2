package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010&\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0016\u00105\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00109R\u0014\u00106\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010/\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*R\u0014\u0010;\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010@R$\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\bA\u0010*R\u0016\u0010B\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010(R\u0018\u0010,\u001a\u00020\u0002*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010C"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "layoutWidth", "layoutHeight", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "(III)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "delta", "applyScrollDelta", "(I)V", "p0", "getHighSpeedVideoFpsRangesFor", "(I)J", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "getSize", "getOutputFormats", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/ui/Alignment$Horizontal;", "Camera2StreamConfigurationMap", "getInputFormats", "Landroidx/compose/ui/Alignment$Vertical;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Z", "crossAxisSize", "getCrossAxisSize", "", "[I", "getOffset", "getInputSizeshNQ4ISI", "(Landroidx/compose/ui/layout/Placeable;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MeasuredPage implements androidx.compose.foundation.pager.PageInfo {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int[] getOutputMinFrameDuration;
    private final int crossAxisSize;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.LayoutDirection getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Horizontal Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.layout.Placeable> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getInputFormats;
    private final int index;
    private final java.lang.Object key;
    private int offset;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i, int i2, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, long j, java.lang.Object obj, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z) {
        this.index = i;
        this.size = i2;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.key = obj;
        this.Camera2StreamConfigurationMap = horizontal;
        this.getHighSpeedVideoSizes = vertical;
        this.getHighResolutionOutputSizeshNQ4ISI = layoutDirection;
        this.getInputFormats = z;
        this.getHighSpeedVideoSizesFor = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i4);
            i3 = java.lang.Math.max(i3, !this.getHighSpeedVideoSizesFor ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = i3;
        this.getOutputMinFrameDuration = new int[this.getHighSpeedVideoFpsRanges.size() * 2];
        this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final java.lang.Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int getOffset() {
        return this.offset;
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor ? layoutHeight : layoutWidth;
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.getHighSpeedVideoFpsRanges;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (this.getHighSpeedVideoSizesFor) {
                int[] iArr = this.getOutputMinFrameDuration;
                androidx.compose.ui.Alignment.Horizontal horizontal = this.Camera2StreamConfigurationMap;
                if (horizontal != null) {
                    iArr[i2] = horizontal.align(placeable.getWidth(), layoutWidth, this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getOutputMinFrameDuration[i2 + 1] = offset;
                    width = placeable.getHeight();
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
                    throw new kotlin.KotlinNothingValueException();
                }
            } else {
                int[] iArr2 = this.getOutputMinFrameDuration;
                iArr2[i2] = offset;
                androidx.compose.ui.Alignment.Vertical vertical = this.getHighSpeedVideoSizes;
                if (vertical != null) {
                    iArr2[i2 + 1] = vertical.align(placeable.getHeight(), layoutHeight);
                    width = placeable.getWidth();
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            offset += width;
        }
    }

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope) {
        int m8730getYimpl;
        if (this.getInputSizeshNQ4ISI == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int size = this.getHighSpeedVideoFpsRanges.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = this.getHighSpeedVideoFpsRanges.get(i);
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
            if (this.getInputFormats) {
                int m8729getXimpl = this.getHighSpeedVideoSizesFor ? androidx.compose.ui.unit.IntOffset.m8729getXimpl(highSpeedVideoFpsRangesFor) : (this.getInputSizeshNQ4ISI - androidx.compose.ui.unit.IntOffset.m8729getXimpl(highSpeedVideoFpsRangesFor)) - getHighSpeedVideoFpsRangesFor(placeable);
                if (this.getHighSpeedVideoSizesFor) {
                    m8730getYimpl = (this.getInputSizeshNQ4ISI - androidx.compose.ui.unit.IntOffset.m8730getYimpl(highSpeedVideoFpsRangesFor)) - getHighSpeedVideoFpsRangesFor(placeable);
                } else {
                    m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(highSpeedVideoFpsRangesFor);
                }
                highSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((m8730getYimpl & 4294967295L) | (m8729getXimpl << 32));
            }
            long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoSizesFor) {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7419placeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY, 0.0f, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
            } else {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7417placeRelativeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY, 0.0f, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
            }
        }
    }

    public final void applyScrollDelta(int delta) {
        this.offset = getOffset() + delta;
        int length = this.getOutputMinFrameDuration.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.getHighSpeedVideoSizesFor;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.getOutputMinFrameDuration;
                iArr[i] = iArr[i] + delta;
            }
        }
    }

    private final long getHighSpeedVideoFpsRangesFor(int p0) {
        int[] iArr = this.getOutputMinFrameDuration;
        int i = p0 * 2;
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((iArr[i] << 32) | (iArr[i + 1] & 4294967295L));
    }

    private final int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable) {
        return this.getHighSpeedVideoSizesFor ? placeable.getHeight() : placeable.getWidth();
    }

    public /* synthetic */ MeasuredPage(int i, int i2, java.util.List list, long j, java.lang.Object obj, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, horizontal, vertical, layoutDirection, z);
    }
}
