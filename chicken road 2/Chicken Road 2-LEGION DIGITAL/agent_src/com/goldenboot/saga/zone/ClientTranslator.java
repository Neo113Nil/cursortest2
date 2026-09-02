package com.goldenboot.saga.zone;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bE\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\b:\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bF\u0010H¨\u0006I"}, d2 = {"Lcom/goldenboot/saga/zone/ClientTranslator;", "", "", "text", "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "evictLayout", "Ljava/lang/CharSequence;", "attachConfig", "()Ljava/lang/CharSequence;", "growPayload", "I", "connectPatch", "()I", "injectMetric", "releaseHeader", "detachStream", "Landroid/text/TextPaint;", "reduceScope", "()Landroid/text/TextPaint;", "purgeNode", "clipOrigin", "Landroid/text/TextDirectionHeuristic;", "resetDelta", "()Landroid/text/TextDirectionHeuristic;", "flushSample", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "updateTimer", "serializeOffset", "applyTask", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "popBlueprint", "drawField", "F", "peekRevision", "()F", "connectJob", "Z", "()Z", "inflateAdapter", "notifyMessage", "[I", "()[I", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClientTranslator {

    /* renamed from: applyTask, reason: from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private final int lineBreakWordStyle;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final TextDirectionHeuristic textDir;

    /* renamed from: connectJob, reason: from kotlin metadata */
    private final float lineSpacingExtra;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private final int lineBreakStyle;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final TextPaint paint;

    /* renamed from: drawField, reason: from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final CharSequence text;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final Layout.Alignment alignment;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final int start;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private final int[] leftIndents;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int end;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private final int breakStrategy;

    /* renamed from: peekRevision, reason: from kotlin metadata */
    private final int justificationMode;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private final int ellipsizedWidth;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private final int[] rightIndents;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final int width;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private final int hyphenationFrequency;

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final int maxLines;

    public ClientTranslator(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i;
        this.end = i2;
        this.paint = textPaint;
        this.width = i3;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i4;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i5;
        this.lineSpacingMultiplier = f;
        this.lineSpacingExtra = f2;
        this.justificationMode = i6;
        this.includePadding = z;
        this.useFallbackLineSpacing = z2;
        this.breakStrategy = i7;
        this.lineBreakStyle = i8;
        this.lineBreakWordStyle = i9;
        this.hyphenationFrequency = i10;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i >= 0 && i <= i2)) {
            EmitterUpgrade.releaseHeader("invalid start value");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            EmitterUpgrade.releaseHeader("invalid end value");
        }
        if (!(i4 >= 0)) {
            EmitterUpgrade.releaseHeader("invalid maxLines value");
        }
        if (!(i3 >= 0)) {
            EmitterUpgrade.releaseHeader("invalid width value");
        }
        if (!(i5 >= 0)) {
            EmitterUpgrade.releaseHeader("invalid ellipsizedWidth value");
        }
        if (f >= 0.0f) {
            return;
        }
        EmitterUpgrade.releaseHeader("invalid lineSpacingMultiplier value");
    }

    /* renamed from: applyTask, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    /* renamed from: attachConfig, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* renamed from: connectJob, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* renamed from: connectPatch, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* renamed from: drawField, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: flushSample, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    /* renamed from: inflateAdapter, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* renamed from: notifyMessage, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* renamed from: peekRevision, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* renamed from: purgeNode, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: reduceScope, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: resetDelta, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* renamed from: serializeOffset, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public /* synthetic */ ClientTranslator(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i11 & 2) != 0 ? 0 : i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
    }
}
