package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011"}, d2 = {"Lkotlin/text/DelimitedRangesSequence$iterator$1;", "", "Lkotlin/ranges/IntRange;", "", "getHighSpeedVideoSizes", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Lkotlin/ranges/IntRange;", "", "hasNext", "()Z", "", "nextState", com.visa.cbp.getEncExpo.warmup, "getNextState", "()I", "setNextState", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextItem", "Lkotlin/ranges/IntRange;", "getNextItem", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "counter", "getCounter", "setCounter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DelimitedRangesSequence$iterator$1 implements java.util.Iterator<kotlin.ranges.IntRange>, kotlin.jvm.internal.markers.KMappedMarker {
    private int counter;
    private int currentStartIndex;
    final /* synthetic */ kotlin.text.DelimitedRangesSequence getHighSpeedVideoFpsRangesFor;
    private kotlin.ranges.IntRange nextItem;
    private int nextSearchIndex;
    private int nextState = -1;

    DelimitedRangesSequence$iterator$1(kotlin.text.DelimitedRangesSequence delimitedRangesSequence) {
        int i;
        java.lang.CharSequence charSequence;
        this.getHighSpeedVideoFpsRangesFor = delimitedRangesSequence;
        i = delimitedRangesSequence.getHighSpeedVideoFpsRangesFor;
        charSequence = delimitedRangesSequence.Camera2StreamConfigurationMap;
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(i, 0, charSequence.length());
        this.currentStartIndex = coerceIn;
        this.nextSearchIndex = coerceIn;
    }

    public final int getNextState() {
        return this.nextState;
    }

    public final void setNextState(int i) {
        this.nextState = i;
    }

    public final int getCurrentStartIndex() {
        return this.currentStartIndex;
    }

    public final void setCurrentStartIndex(int i) {
        this.currentStartIndex = i;
    }

    public final int getNextSearchIndex() {
        return this.nextSearchIndex;
    }

    public final void setNextSearchIndex(int i) {
        this.nextSearchIndex = i;
    }

    public final kotlin.ranges.IntRange getNextItem() {
        return this.nextItem;
    }

    public final void setNextItem(kotlin.ranges.IntRange intRange) {
        this.nextItem = intRange;
    }

    public final int getCounter() {
        return this.counter;
    }

    public final void setCounter(int i) {
        this.counter = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes() {
        int i;
        java.lang.CharSequence charSequence;
        kotlin.jvm.functions.Function2 function2;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        int i2;
        if (this.nextSearchIndex >= 0) {
            i = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            if (i > 0) {
                int i3 = this.counter + 1;
                this.counter = i3;
                i2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            }
            int i4 = this.nextSearchIndex;
            charSequence = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            if (i4 <= charSequence.length()) {
                function2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                charSequence2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                kotlin.Pair pair = (kotlin.Pair) function2.invoke(charSequence2, java.lang.Integer.valueOf(this.nextSearchIndex));
                if (pair == null) {
                    int i5 = this.currentStartIndex;
                    charSequence3 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                    this.nextItem = new kotlin.ranges.IntRange(i5, kotlin.text.StringsKt.getLastIndex(charSequence3));
                    this.nextSearchIndex = -1;
                } else {
                    int intValue = ((java.lang.Number) pair.component1()).intValue();
                    int intValue2 = ((java.lang.Number) pair.component2()).intValue();
                    this.nextItem = kotlin.ranges.RangesKt.until(this.currentStartIndex, intValue);
                    int i6 = intValue + intValue2;
                    this.currentStartIndex = i6;
                    this.nextSearchIndex = i6 + (intValue2 == 0 ? 1 : 0);
                }
                this.nextState = 1;
                return;
            }
            int i7 = this.currentStartIndex;
            charSequence4 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.nextItem = new kotlin.ranges.IntRange(i7, kotlin.text.StringsKt.getLastIndex(charSequence4));
            this.nextSearchIndex = -1;
            this.nextState = 1;
            return;
        }
        this.nextState = 0;
        this.nextItem = null;
    }

    @Override // java.util.Iterator
    public final kotlin.ranges.IntRange next() {
        if (this.nextState == -1) {
            getHighSpeedVideoSizes();
        }
        if (this.nextState == 0) {
            throw new java.util.NoSuchElementException();
        }
        kotlin.ranges.IntRange intRange = this.nextItem;
        kotlin.jvm.internal.Intrinsics.checkNotNull(intRange, "");
        this.nextItem = null;
        this.nextState = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextState == -1) {
            getHighSpeedVideoSizes();
        }
        return this.nextState == 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
