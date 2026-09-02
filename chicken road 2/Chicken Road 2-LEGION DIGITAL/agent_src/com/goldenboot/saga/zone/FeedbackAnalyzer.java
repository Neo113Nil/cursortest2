package com.goldenboot.saga.zone;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0019J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00106R\u0017\u0010;\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/goldenboot/saga/zone/FeedbackAnalyzer;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "growPayload", "(IZ)F", "lineEnd", "lineStart", "serializeOffset", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "evictLayout", "(I)Ljava/text/Bidi;", "upstream", "applyTask", "(IZ)I", "drawField", "(I)I", "updateTimer", "peekRevision", "(I)Z", "usePrimaryDirection", "injectMetric", "(IZZ)F", "lineIndex", "clipOrigin", "", "Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;", "releaseHeader", "(I)[Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;", "", "c", "connectJob", "(C)Z", "Landroid/text/Layout;", "detachStream", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "flushSample", "()I", "paragraphCount", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedbackAnalyzer {
    public static final int flushSample = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final int paragraphCount;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final boolean[] bidiProcessedParagraphs;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final Layout layout;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final List<Integer> paragraphEnds;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final List<Bidi> paragraphBidi;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private char[] tmpBuffer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "evictLayout", "()I", "growPayload", "injectMetric", "()Z", "detachStream", "(IIZ)Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "flushSample", "clipOrigin", "Z", "updateTimer", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.FeedbackAnalyzer$ActivityMutator, reason: from toString */
    public static final /* data */ class BidiRun {
        public static final int detachStream = 0;

        /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
        private final int start;

        /* renamed from: growPayload, reason: from kotlin metadata and from toString */
        private final int end;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private final boolean isRtl;

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun releaseHeader(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.detachStream(i, i2, z);
        }

        /* renamed from: clipOrigin, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final BidiRun detachStream(int start, int end, boolean isRtl) {
            return new BidiRun(start, end, isRtl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        /* renamed from: evictLayout, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public final int flushSample() {
            return this.start;
        }

        public final int growPayload() {
            return this.end;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        /* renamed from: injectMetric, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public final boolean updateTimer() {
            return this.isRtl;
        }
    }

    public FeedbackAnalyzer(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int startResource = CachedPropagator.startResource(this.layout.getText(), '\n', i, false, 4, null);
            i = startResource < 0 ? this.layout.getText().length() : startResource + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float growPayload(int offset, boolean primary) {
        int updateTimer = CellEntry.updateTimer(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(updateTimer) : this.layout.getSecondaryHorizontal(updateTimer);
    }

    public static /* synthetic */ int popBlueprint(FeedbackAnalyzer feedbackAnalyzer, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return feedbackAnalyzer.applyTask(i, z);
    }

    private final int serializeOffset(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && connectJob(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    public final int applyTask(int offset, boolean upstream) {
        int connectJob = CursorBuilder.connectJob(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i = connectJob < 0 ? -(connectJob + 1) : connectJob + 1;
        if (upstream && i > 0) {
            int i2 = i - 1;
            if (offset == this.paragraphEnds.get(i2).intValue()) {
                return i2;
            }
        }
        return i;
    }

    public final int clipOrigin(int lineIndex) {
        return serializeOffset(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final boolean connectJob(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return (Intrinsics.compare((int) c, ContentOperation.Shape) >= 0 && Intrinsics.compare((int) c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }

    /* renamed from: detachStream, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final int drawField(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3.getRunCount() == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi evictLayout(int paragraphIndex) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return this.paragraphBidi.get(paragraphIndex);
        }
        int intValue = paragraphIndex == 0 ? 0 : this.paragraphEnds.get(paragraphIndex - 1).intValue();
        int intValue2 = this.paragraphEnds.get(paragraphIndex).intValue();
        int i = intValue2 - intValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i) {
            cArr = new char[i];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i)) {
            bidi = new Bidi(cArr2, 0, null, 0, i, peekRevision(paragraphIndex) ? 1 : 0);
        }
        bidi = null;
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    /* renamed from: flushSample, reason: from getter */
    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final float injectMetric(int offset, boolean usePrimaryDirection, boolean upstream) {
        int i = offset;
        if (!upstream) {
            return growPayload(offset, usePrimaryDirection);
        }
        int evictLayout = ComponentListener.evictLayout(this.layout, i, upstream);
        int lineStart = this.layout.getLineStart(evictLayout);
        int lineEnd = this.layout.getLineEnd(evictLayout);
        if (i != lineStart && i != lineEnd) {
            return growPayload(offset, usePrimaryDirection);
        }
        if (i == 0 || i == this.layout.getText().length()) {
            return growPayload(offset, usePrimaryDirection);
        }
        int applyTask = applyTask(i, upstream);
        boolean peekRevision = peekRevision(applyTask);
        int serializeOffset = serializeOffset(lineEnd, lineStart);
        int drawField = drawField(applyTask);
        int i2 = lineStart - drawField;
        int i3 = serializeOffset - drawField;
        Bidi evictLayout2 = evictLayout(applyTask);
        Bidi createLineBidi = evictLayout2 != null ? evictLayout2.createLineBidi(i2, i3) : null;
        boolean z = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || peekRevision == isRtlCharAt) {
                peekRevision = !peekRevision;
            }
            if (i == lineStart) {
                z = peekRevision;
            } else if (!peekRevision) {
                z = true;
            }
            Layout layout = this.layout;
            return z ? layout.getLineLeft(evictLayout) : layout.getLineRight(evictLayout);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            bidiRunArr[i4] = new BidiRun(createLineBidi.getRunStart(i4) + lineStart, createLineBidi.getRunLimit(i4) + lineStart, createLineBidi.getRunLevel(i4) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i5 = 0; i5 < runCount2; i5++) {
            bArr[i5] = (byte) createLineBidi.getRunLevel(i5);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i6 = -1;
        if (i == lineStart) {
            int i7 = 0;
            while (true) {
                if (i7 >= runCount) {
                    break;
                }
                if (bidiRunArr[i7].flushSample() == i) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            BidiRun bidiRun = bidiRunArr[i6];
            if (usePrimaryDirection || peekRevision == bidiRun.updateTimer()) {
                peekRevision = !peekRevision;
            }
            return (i6 == 0 && peekRevision) ? this.layout.getLineLeft(evictLayout) : (i6 != PluginInspector.serializeTask(bidiRunArr) || peekRevision) ? peekRevision ? this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].flushSample()) : this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].flushSample()) : this.layout.getLineRight(evictLayout);
        }
        if (i > serializeOffset) {
            i = serializeOffset(i, lineStart);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= runCount) {
                break;
            }
            if (bidiRunArr[i8].getEnd() == i) {
                i6 = i8;
                break;
            }
            i8++;
        }
        BidiRun bidiRun2 = bidiRunArr[i6];
        if (!usePrimaryDirection && peekRevision != bidiRun2.updateTimer()) {
            peekRevision = !peekRevision;
        }
        return (i6 == 0 && peekRevision) ? this.layout.getLineLeft(evictLayout) : (i6 != PluginInspector.serializeTask(bidiRunArr) || peekRevision) ? peekRevision ? this.layout.getPrimaryHorizontal(bidiRunArr[i6 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i6 + 1].getEnd()) : this.layout.getLineRight(evictLayout);
    }

    public final boolean peekRevision(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(drawField(paragraphIndex))) == -1;
    }

    public final BidiRun[] releaseHeader(int lineIndex) {
        Bidi createLineBidi;
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        int popBlueprint = popBlueprint(this, lineStart, false, 2, null);
        int drawField = drawField(popBlueprint);
        int i = lineStart - drawField;
        int i2 = lineEnd - drawField;
        Bidi evictLayout = evictLayout(popBlueprint);
        if (evictLayout == null || (createLineBidi = evictLayout.createLineBidi(i, i2)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i3 = 0; i3 < runCount; i3++) {
            int runStart = createLineBidi.getRunStart(i3) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i3) + lineStart;
            boolean z = true;
            if (createLineBidi.getRunLevel(i3) % 2 != 1) {
                z = false;
            }
            bidiRunArr[i3] = new BidiRun(runStart, runLimit, z);
        }
        return bidiRunArr;
    }

    public final int updateTimer(int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }
}
