package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "", "Ljava/text/CharacterIterator;", "", "charSequence", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", io.ktor.http.LinkHeader.Rel.Next, "previous", com.daon.sdk.face.license.License.FEATURE_POSITION, "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "clone", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/CharSequence;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CharSequenceCharacterIterator implements java.text.CharacterIterator {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;

    public CharSequenceCharacterIterator(java.lang.CharSequence charSequence, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i == i2) {
            this.getHighSpeedVideoSizes = i2;
            return kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.getHighSpeedVideoSizes = i3;
        return this.getHighResolutionOutputSizeshNQ4ISI.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.getHighSpeedVideoSizes;
        return i == this.getHighSpeedVideoFpsRanges ? kotlin.jvm.internal.CharCompanionObject.MAX_VALUE : this.getHighResolutionOutputSizeshNQ4ISI.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.getHighSpeedVideoSizes + 1;
        this.getHighSpeedVideoSizes = i;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i >= i2) {
            this.getHighSpeedVideoSizes = i2;
            return kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.getHighSpeedVideoSizes;
        if (i <= this.Camera2StreamConfigurationMap) {
            return kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.getHighSpeedVideoSizes = i2;
        return this.getHighResolutionOutputSizeshNQ4ISI.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int position) {
        int i = this.Camera2StreamConfigurationMap;
        if (position <= this.getHighSpeedVideoFpsRanges && i <= position) {
            this.getHighSpeedVideoSizes = position;
            return current();
        }
        throw new java.lang.IllegalArgumentException("invalid position");
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }
}
