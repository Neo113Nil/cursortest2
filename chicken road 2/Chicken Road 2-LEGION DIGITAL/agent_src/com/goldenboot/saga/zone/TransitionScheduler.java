package com.goldenboot.saga.zone;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 92\u00020\u0001:\u0001:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010(R$\u0010.\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u00101\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010(R$\u00104\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010(R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/goldenboot/saga/zone/TransitionScheduler;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "Lcom/goldenboot/saga/zone/DpadBuilder;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "reduceScope", "F", "notifyMessage", "I", "connectPatch", "attachConfig", "resetDelta", "inflateAdapter", "injectMetric", "()I", "value", "purgeNode", "Landroid/graphics/Paint$FontMetricsInt;", "evictLayout", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "drawRequest", "detachStream", "widthPx", "gatherAdapter", "growPayload", "heightPx", "", "decodePath", "Z", "isLaidOut", "drawScope", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionScheduler extends ReplacementSpan {
    public static final int expandArgs = 8;
    public static final int filterPayload = 6;
    public static final int findTask = 0;
    public static final int flattenPackage = 3;
    public static final int inflateEdge = 0;
    public static final int injectConstraint = 4;
    public static final int mergeLocale = 1;
    public static final int packPackage = 2;
    public static final int queryModel = 1;
    public static final int storeCharset = 5;
    public static final int syncScope = 2;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private final int heightUnit;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private final float height;

    /* renamed from: decodePath, reason: from kotlin metadata */
    private boolean isLaidOut;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private int widthPx;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private int heightPx;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private final int verticalAlign;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private final int widthUnit;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final float width;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private final float pxPerSp;

    public TransitionScheduler(float f, int i, float f2, int i2, float f3, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.pxPerSp = f3;
        this.verticalAlign = i3;
    }

    public final int detachStream() {
        if (!this.isLaidOut) {
            EmitterUpgrade.flushSample("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    public final Paint.FontMetricsInt evictLayout() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        float f;
        int evictLayout;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(evictLayout().descent > evictLayout().ascent)) {
            EmitterUpgrade.releaseHeader("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.widthUnit;
        if (i == 0) {
            f = this.width * this.pxPerSp;
        } else {
            if (i != 1) {
                EmitterUpgrade.clipOrigin("Unsupported unit.");
                throw new ShadowBroadcaster();
            }
            f = this.width * textSize;
        }
        this.widthPx = BreadcrumbKeeper.evictLayout(f);
        int i2 = this.heightUnit;
        if (i2 == 0) {
            evictLayout = BreadcrumbKeeper.evictLayout(this.height * this.pxPerSp);
        } else {
            if (i2 != 1) {
                EmitterUpgrade.clipOrigin("Unsupported unit.");
                throw new ShadowBroadcaster();
            }
            evictLayout = BreadcrumbKeeper.evictLayout(this.height * textSize);
        }
        this.heightPx = evictLayout;
        if (fm != null) {
            fm.ascent = evictLayout().ascent;
            fm.descent = evictLayout().descent;
            fm.leading = evictLayout().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm.ascent > (-growPayload())) {
                        fm.ascent = -growPayload();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fm.ascent + growPayload() > fm.descent) {
                        fm.descent = fm.ascent + growPayload();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - growPayload()) {
                        fm.ascent = fm.descent - growPayload();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < growPayload()) {
                        int growPayload = fm.ascent - ((growPayload() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = growPayload;
                        fm.descent = growPayload + growPayload();
                        break;
                    }
                    break;
                default:
                    EmitterUpgrade.releaseHeader("Unknown verticalAlign.");
                    break;
            }
            fm.top = Math.min(evictLayout().top, fm.ascent);
            fm.bottom = Math.max(evictLayout().bottom, fm.descent);
        }
        return detachStream();
    }

    public final int growPayload() {
        if (!this.isLaidOut) {
            EmitterUpgrade.flushSample("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
    }
}
