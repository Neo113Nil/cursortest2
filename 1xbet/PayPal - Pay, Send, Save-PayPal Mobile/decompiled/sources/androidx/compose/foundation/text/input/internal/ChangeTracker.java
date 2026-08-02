package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "initialChanges", "<init>", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "", "preStart", "preEnd", "postLength", "", "trackChange", "(III)V", "clearChanges", "()V", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "getRange--jx7JFs", "(I)J", "getRange", "getOriginalRange--jx7JFs", "getOriginalRange", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;III)V", "Landroidx/compose/runtime/collection/MutableVector;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getChangeCount", "()I", "changeCount", "Change"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeTracker implements androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker.Change> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker.Change> Camera2StreamConfigurationMap;

    public ChangeTracker(androidx.compose.foundation.text.input.internal.ChangeTracker changeTracker) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker.Change> mutableVector;
        this.getHighSpeedVideoSizes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.text.input.internal.ChangeTracker.Change[16], 0);
        this.Camera2StreamConfigurationMap = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.text.input.internal.ChangeTracker.Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker.getHighSpeedVideoSizes) == null) {
            return;
        }
        androidx.compose.foundation.text.input.internal.ChangeTracker.Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = changeArr[i];
            this.getHighSpeedVideoSizes.add(new androidx.compose.foundation.text.input.internal.ChangeTracker.Change(change.getHighResolutionOutputSizeshNQ4ISI, change.getHighSpeedVideoFpsRangesFor, change.getHighSpeedVideoSizes, change.getHighSpeedVideoFpsRanges));
        }
    }

    public /* synthetic */ ChangeTracker(androidx.compose.foundation.text.input.internal.ChangeTracker changeTracker, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : changeTracker);
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public final int getChangeCount() {
        return this.getHighSpeedVideoSizes.getSize();
    }

    public final void trackChange(int preStart, int preEnd, int postLength) {
        int i;
        if (preStart == preEnd && postLength == 0) {
            return;
        }
        int min = java.lang.Math.min(preStart, preEnd);
        int max = java.lang.Math.max(preStart, preEnd);
        int i2 = postLength - (max - min);
        androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = null;
        boolean z = false;
        for (int i3 = 0; i3 < this.getHighSpeedVideoSizes.getSize(); i3++) {
            androidx.compose.foundation.text.input.internal.ChangeTracker.Change change2 = this.getHighSpeedVideoSizes.content[i3];
            int i4 = change2.getHighResolutionOutputSizeshNQ4ISI;
            if ((min > i4 || i4 > max) && (min > (i = change2.getHighSpeedVideoFpsRangesFor) || i > max)) {
                int i5 = change2.getHighResolutionOutputSizeshNQ4ISI;
                if (min > change2.getHighSpeedVideoFpsRangesFor || i5 > min) {
                    int i6 = change2.getHighResolutionOutputSizeshNQ4ISI;
                    if (max > change2.getHighSpeedVideoFpsRangesFor || i6 > max) {
                        if (change2.getHighResolutionOutputSizeshNQ4ISI > max && !z) {
                            getHighSpeedVideoFpsRangesFor(change, min, max, i2);
                            z = true;
                        }
                        if (z) {
                            change2.getHighResolutionOutputSizeshNQ4ISI += i2;
                            change2.getHighSpeedVideoFpsRangesFor += i2;
                        }
                        this.Camera2StreamConfigurationMap.add(change2);
                    }
                }
            }
            if (change == null) {
                change = change2;
            } else {
                change.getHighSpeedVideoFpsRangesFor = change2.getHighSpeedVideoFpsRangesFor;
                change.getHighSpeedVideoFpsRanges = change2.getHighSpeedVideoFpsRanges;
            }
        }
        if (!z) {
            getHighSpeedVideoFpsRangesFor(change, min, max, i2);
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker.Change> mutableVector = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = mutableVector;
        mutableVector.clear();
    }

    public final void clearChanges() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public final long mo2178getRangejx7JFs(int changeIndex) {
        androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = this.getHighSpeedVideoSizes.content[changeIndex];
        return androidx.compose.ui.text.TextRangeKt.TextRange(change.getHighResolutionOutputSizeshNQ4ISI, change.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public final long mo2177getOriginalRangejx7JFs(int changeIndex) {
        androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = this.getHighSpeedVideoSizes.content[changeIndex];
        return androidx.compose.ui.text.TextRangeKt.TextRange(change.getHighSpeedVideoSizes, change.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeList(changes=[");
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker.Change> mutableVector = this.getHighSpeedVideoSizes;
        androidx.compose.foundation.text.input.internal.ChangeTracker.Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = changeArr[i];
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
            sb2.append(change.getHighSpeedVideoSizes);
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb2.append(change.getHighSpeedVideoFpsRanges);
            sb2.append(")->(");
            sb2.append(change.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb2.append(change.getHighSpeedVideoFpsRangesFor);
            sb2.append(')');
            sb.append(sb2.toString());
            if (i < getChangeCount() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.ChangeTracker.Change p0, int p1, int p2, int p3) {
        int i;
        if (this.Camera2StreamConfigurationMap.getSize() == 0) {
            i = 0;
        } else {
            androidx.compose.foundation.text.input.internal.ChangeTracker.Change last = this.Camera2StreamConfigurationMap.last();
            i = last.getHighSpeedVideoFpsRangesFor - last.getHighSpeedVideoFpsRanges;
        }
        if (p0 == null) {
            int i2 = p1 - i;
            p0 = new androidx.compose.foundation.text.input.internal.ChangeTracker.Change(p1, p3 + p2, i2, (p2 - p1) + i2);
        } else {
            if (p0.getHighResolutionOutputSizeshNQ4ISI > p1) {
                p0.getHighResolutionOutputSizeshNQ4ISI = p1;
                p0.getHighSpeedVideoSizes = p1;
            }
            if (p2 > p0.getHighSpeedVideoFpsRangesFor) {
                int i3 = p0.getHighSpeedVideoFpsRangesFor;
                int i4 = p0.getHighSpeedVideoFpsRanges;
                p0.getHighSpeedVideoFpsRangesFor = p2;
                p0.getHighSpeedVideoFpsRanges = p2 - (i3 - i4);
            }
            p0.getHighSpeedVideoFpsRangesFor += p3;
        }
        this.Camera2StreamConfigurationMap.add(p0);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class Change {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        int getHighSpeedVideoSizes;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        int getHighResolutionOutputSizeshNQ4ISI;

        public Change(int i, int i2, int i3, int i4) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.getHighSpeedVideoSizes = i3;
            this.getHighSpeedVideoFpsRanges = i4;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Change(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.compose.foundation.text.input.internal.ChangeTracker.Change)) {
                return false;
            }
            androidx.compose.foundation.text.input.internal.ChangeTracker.Change change = (androidx.compose.foundation.text.input.internal.ChangeTracker.Change) p0;
            return this.getHighResolutionOutputSizeshNQ4ISI == change.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == change.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == change.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == change.getHighSpeedVideoFpsRanges;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
