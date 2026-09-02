package com.goldenboot.saga.zone;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010!J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b2\u0010-J\u0015\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b3\u0010-J\u0015\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b5\u0010-J\u001d\u00107\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b=\u0010<J\u0015\u0010>\u001a\u00020\b2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b>\u0010-J\u0015\u0010?\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b?\u00101J\u0015\u0010@\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b@\u0010-J%\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bF\u0010GJ9\u0010M\u001a\u0004\u0018\u00010\u00182\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\b2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u000f0K¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020E2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ-\u0010V\u001a\u00020E2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010P\u001a\u00020O2\u0006\u0010U\u001a\u00020\b¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020H2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u0015\u0010\\\u001a\u00020E2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0000¢\u0006\u0004\b^\u0010_R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u0010`\u001a\u0004\ba\u0010bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010_R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010e\u001a\u0004\bh\u0010_R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010m\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bl\u0010e\u001a\u0004\bl\u0010_R\u0018\u0010p\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010oR \u0010x\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010w\u001a\u0004\bt\u0010uR\u0017\u0010|\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010y\u001a\u0004\bz\u0010{R \u0010\u007f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010y\u0012\u0004\b~\u0010w\u001a\u0004\b}\u0010{R!\u0010\u0080\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bt\u0010y\u0012\u0004\bg\u0010w\u001a\u0004\bd\u0010{R\u0016\u0010\u0082\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010eR\u0019\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0087\u0001R\u0015\u0010\u0089\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010yR \u0010\u008d\u0001\u001a\f\u0012\u0005\u0012\u00030\u008b\u0001\u0018\u00010\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u008c\u0001R\u0016\u0010I\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010\u008f\u0001R\u001b\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0093\u0001R\u0014\u0010\u0097\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0014\u0010\u009c\u0001\u001a\u00020n8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0014\u0010\u009f\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0012\u0010 \u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\br\u0010{¨\u0006¡\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/RuntimeBackup;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Lcom/goldenboot/saga/zone/ViewNotifier;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILcom/goldenboot/saga/zone/ViewNotifier;)V", "line", "applyTask", "(I)F", "lineIndex", "expandArgs", "findTask", "syncScope", "connectPatch", "reduceScope", "notifyMessage", "resetDelta", "drawScope", "injectConstraint", "mergeLocale", "(I)I", "drawRequest", "flattenPackage", "resumeSignature", "(I)Z", "purgeNode", "inflateAdapter", "vertical", "decodePath", "horizontal", "inflateEdge", "(IF)I", "offset", "upstream", "packPackage", "(IZ)F", "dispatchTimezone", "gatherAdapter", "groupArchive", "queryModel", "start", "end", "Landroid/graphics/Path;", "dest", "Lcom/goldenboot/saga/zone/DpadBuilder;", "mapJob", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "bindBody", "(Landroid/graphics/RectF;ILcom/goldenboot/saga/zone/IconExporter;)[I", "", "array", "growPayload", "(I[F)V", "startOffset", "endOffset", "arrayStart", "evictLayout", "(II[FI)V", "releaseHeader", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "cancelArchive", "(Landroid/graphics/Canvas;)V", "formatPosition", "()Z", "Landroid/text/TextPaint;", "prepareTask", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "injectMetric", "Z", "popBlueprint", "detachStream", "flushSample", "Lcom/goldenboot/saga/zone/ViewNotifier;", "serializeOffset", "()Lcom/goldenboot/saga/zone/ViewNotifier;", "clipOrigin", "didExceedMaxLines", "Lcom/goldenboot/saga/zone/ServiceBroadcaster;", "Lcom/goldenboot/saga/zone/ServiceBroadcaster;", "backingWordIterator", "Landroid/text/Layout;", "updateTimer", "Landroid/text/Layout;", "drawField", "()Landroid/text/Layout;", "connectJob", "()V", "layout", "I", "attachConfig", "()I", "lineCount", "updateAction", "connectComponent", "topPadding", "bottomPadding", "F", "leftPadding", "peekRevision", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Lcom/goldenboot/saga/zone/SocketBootstrapper;", "[Lcom/goldenboot/saga/zone/SocketBootstrapper;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Lcom/goldenboot/saga/zone/FeedbackAnalyzer;", "Lcom/goldenboot/saga/zone/FeedbackAnalyzer;", "backingLayoutHelper", "()Lcom/goldenboot/saga/zone/FeedbackAnalyzer;", "layoutHelper", "storeCharset", "()F", "maxIntrinsicWidth", "filterPayload", "minIntrinsicWidth", "startResource", "()Lcom/goldenboot/saga/zone/ServiceBroadcaster;", "wordIterator", "attachCallback", "()Ljava/lang/CharSequence;", "text", "height", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RuntimeBackup {
    public static final int inflateAdapter = 8;

    /* renamed from: applyTask, reason: from kotlin metadata */
    private final int lineCount;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private final Rect rect;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: connectJob, reason: from kotlin metadata */
    private final float leftPadding;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private final SocketBootstrapper[] lineHeightSpans;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* renamed from: drawField, reason: from kotlin metadata */
    private final int bottomPadding;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final TextPaint textPaint;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private ServiceBroadcaster backingWordIterator;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private final int lastLineExtra;

    /* renamed from: peekRevision, reason: from kotlin metadata */
    private final float rightPadding;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private final int topPadding;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final ViewNotifier layoutIntrinsics;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private FeedbackAnalyzer backingLayoutHelper;

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    private final boolean isBoringLayout;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final Layout layout;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public RuntimeBackup(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, ViewNotifier viewNotifier) {
        int i9;
        boolean z3;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z4;
        Layout evictLayout;
        TextPaint textPaint2;
        long connectJob;
        SocketBootstrapper[] popBlueprint;
        Paint.FontMetricsInt updateTimer;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = viewNotifier;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic drawField = SectionStep.drawField(i2);
        Layout.Alignment evictLayout2 = JoystickKeeper.evictLayout.evictLayout(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, CardNotifier.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z6 = z5;
        try {
            BoringLayout.Metrics releaseHeader = viewNotifier.releaseHeader();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (releaseHeader == null || viewNotifier.applyTask() > f || z6) {
                this.isBoringLayout = false;
                i9 = i3;
                z3 = false;
                textDirectionHeuristic = drawField;
                z4 = true;
                evictLayout = RailSensor.evictLayout.evictLayout(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic, evictLayout2, i9, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
                textPaint2 = textPaint;
            } else {
                this.isBoringLayout = true;
                textPaint2 = textPaint;
                i9 = i3;
                evictLayout = CustomCallback.evictLayout.evictLayout(charSequence, textPaint, ceil, releaseHeader, evictLayout2, z, z2, truncateAt, ceil);
                textDirectionHeuristic = drawField;
                z4 = true;
                z3 = false;
            }
            this.layout = evictLayout;
            Trace.endSection();
            int min = Math.min(evictLayout.getLineCount(), i9);
            this.lineCount = min;
            int i10 = min - 1;
            this.didExceedMaxLines = (min >= i9 && (evictLayout.getEllipsisCount(i10) > 0 || evictLayout.getLineEnd(i10) != charSequence.length())) ? z4 : z3;
            connectJob = SectionStep.connectJob(this);
            popBlueprint = SectionStep.popBlueprint(this);
            this.lineHeightSpans = popBlueprint;
            long applyTask = popBlueprint != null ? SectionStep.applyTask(popBlueprint) : SectionStep.growPayload;
            this.topPadding = Math.max(BottomBarConstructor.clipOrigin(connectJob), BottomBarConstructor.clipOrigin(applyTask));
            this.bottomPadding = Math.max(BottomBarConstructor.releaseHeader(connectJob), BottomBarConstructor.releaseHeader(applyTask));
            updateTimer = SectionStep.updateTimer(this, textPaint2, textDirectionHeuristic, popBlueprint);
            this.lastLineExtra = updateTimer != null ? updateTimer.bottom - ((int) drawScope(i10)) : z3;
            this.lastLineFontMetrics = updateTimer;
            this.leftPadding = WindowMulticaster.growPayload(evictLayout, i10, null, 2, null);
            this.rightPadding = WindowMulticaster.detachStream(evictLayout, i10, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float applyTask(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    public static /* synthetic */ float parseAsset(RuntimeBackup runtimeBackup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return runtimeBackup.dispatchTimezone(i, z);
    }

    private final FeedbackAnalyzer peekRevision() {
        FeedbackAnalyzer feedbackAnalyzer = this.backingLayoutHelper;
        if (feedbackAnalyzer != null) {
            Intrinsics.checkNotNull(feedbackAnalyzer);
            return feedbackAnalyzer;
        }
        FeedbackAnalyzer feedbackAnalyzer2 = new FeedbackAnalyzer(this.layout);
        this.backingLayoutHelper = feedbackAnalyzer2;
        return feedbackAnalyzer2;
    }

    public static /* synthetic */ float unlockMessage(RuntimeBackup runtimeBackup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return runtimeBackup.packPackage(i, z);
    }

    public final CharSequence attachCallback() {
        return this.layout.getText();
    }

    /* renamed from: attachConfig, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int[] bindBody(RectF rect, int granularity, IconExporter inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? StylusSaver.evictLayout.injectMetric(this, rect, granularity, inclusionStrategy) : LongPressDelegate.detachStream(this, this.layout, peekRevision(), rect, granularity, inclusionStrategy);
    }

    public final void cancelArchive(Canvas canvas) {
        CarouselBenchmark carouselBenchmark;
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            carouselBenchmark = SectionStep.evictLayout;
            carouselBenchmark.evictLayout(canvas);
            this.layout.draw(carouselBenchmark);
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, (-1) * i2);
            }
        }
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float connectPatch(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int decodePath(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float dispatchTimezone(int offset, boolean upstream) {
        return peekRevision().injectMetric(offset, false, upstream) + applyTask(gatherAdapter(offset));
    }

    /* renamed from: drawField, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final int drawRequest(int lineIndex) {
        return (SectionStep.peekRevision(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final float drawScope(int lineIndex) {
        return connectPatch(lineIndex) - syncScope(lineIndex);
    }

    public final void evictLayout(int startOffset, int endOffset, float[] array, int arrayStart) {
        float releaseHeader;
        float clipOrigin;
        int length = attachCallback().length();
        if (!(startOffset >= 0)) {
            EmitterUpgrade.releaseHeader("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            EmitterUpgrade.releaseHeader("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            EmitterUpgrade.releaseHeader("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            EmitterUpgrade.releaseHeader("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            EmitterUpgrade.releaseHeader("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int gatherAdapter = gatherAdapter(startOffset);
        int gatherAdapter2 = gatherAdapter(endOffset - 1);
        TilePhase tilePhase = new TilePhase(this);
        if (gatherAdapter > gatherAdapter2) {
            return;
        }
        int i = gatherAdapter;
        int i2 = arrayStart;
        while (true) {
            int mergeLocale = mergeLocale(i);
            int drawRequest = drawRequest(i);
            int min = Math.min(endOffset, drawRequest);
            float syncScope = syncScope(i);
            float connectPatch = connectPatch(i);
            boolean z = queryModel(i) == 1;
            for (int max = Math.max(startOffset, mergeLocale); max < min; max++) {
                boolean groupArchive = groupArchive(max);
                if (z && !groupArchive) {
                    releaseHeader = tilePhase.injectMetric(max);
                    clipOrigin = tilePhase.detachStream(max + 1);
                } else if (z && groupArchive) {
                    clipOrigin = tilePhase.releaseHeader(max);
                    releaseHeader = tilePhase.clipOrigin(max + 1);
                } else if (z || !groupArchive) {
                    releaseHeader = tilePhase.releaseHeader(max);
                    clipOrigin = tilePhase.clipOrigin(max + 1);
                } else {
                    clipOrigin = tilePhase.injectMetric(max);
                    releaseHeader = tilePhase.detachStream(max + 1);
                }
                array[i2] = releaseHeader;
                array[i2 + 1] = syncScope;
                array[i2 + 2] = clipOrigin;
                array[i2 + 3] = connectPatch;
                i2 += 4;
            }
            if (i == gatherAdapter2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final float expandArgs(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float filterPayload() {
        return this.layoutIntrinsics.popBlueprint();
    }

    public final float findTask(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int flattenPackage(int lineIndex) {
        return (SectionStep.peekRevision(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex) : peekRevision().clipOrigin(lineIndex);
    }

    /* renamed from: flushSample, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final boolean formatPosition() {
        if (this.isBoringLayout) {
            CustomCallback customCallback = CustomCallback.evictLayout;
            Layout layout = this.layout;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return customCallback.injectMetric((BoringLayout) layout);
        }
        RailSensor railSensor = RailSensor.evictLayout;
        Layout layout2 = this.layout;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return railSensor.injectMetric((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final int gatherAdapter(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final boolean groupArchive(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void growPayload(int lineIndex, float[] array) {
        float releaseHeader;
        float clipOrigin;
        int mergeLocale = mergeLocale(lineIndex);
        int drawRequest = drawRequest(lineIndex);
        int i = 0;
        if (!(array.length >= (drawRequest - mergeLocale) * 2)) {
            EmitterUpgrade.releaseHeader("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        TilePhase tilePhase = new TilePhase(this);
        boolean z = queryModel(lineIndex) == 1;
        while (mergeLocale < drawRequest) {
            boolean groupArchive = groupArchive(mergeLocale);
            if (z && !groupArchive) {
                releaseHeader = tilePhase.injectMetric(mergeLocale);
                clipOrigin = tilePhase.detachStream(mergeLocale + 1);
            } else if (z && groupArchive) {
                clipOrigin = tilePhase.releaseHeader(mergeLocale);
                releaseHeader = tilePhase.clipOrigin(mergeLocale + 1);
            } else if (groupArchive) {
                clipOrigin = tilePhase.injectMetric(mergeLocale);
                releaseHeader = tilePhase.detachStream(mergeLocale + 1);
            } else {
                releaseHeader = tilePhase.releaseHeader(mergeLocale);
                clipOrigin = tilePhase.clipOrigin(mergeLocale + 1);
            }
            array[i] = releaseHeader;
            array[i + 1] = clipOrigin;
            i += 2;
            mergeLocale++;
        }
    }

    public final int inflateAdapter(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int inflateEdge(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * applyTask(line)));
    }

    public final float injectConstraint(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final void mapJob(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final int mergeLocale(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float notifyMessage(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : syncScope(line) - this.lastLineFontMetrics.ascent);
    }

    public final float packPackage(int offset, boolean upstream) {
        return peekRevision().injectMetric(offset, true, upstream) + applyTask(gatherAdapter(offset));
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: prepareTask, reason: from getter */
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int purgeNode(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int queryModel(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float reduceScope(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final RectF releaseHeader(int offset) {
        float dispatchTimezone;
        float dispatchTimezone2;
        float packPackage;
        float packPackage2;
        int gatherAdapter = gatherAdapter(offset);
        float syncScope = syncScope(gatherAdapter);
        float connectPatch = connectPatch(gatherAdapter);
        boolean z = queryModel(gatherAdapter) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                packPackage = dispatchTimezone(offset, false);
                packPackage2 = dispatchTimezone(offset + 1, true);
            } else if (isRtlCharAt) {
                packPackage = packPackage(offset, false);
                packPackage2 = packPackage(offset + 1, true);
            } else {
                dispatchTimezone = dispatchTimezone(offset, false);
                dispatchTimezone2 = dispatchTimezone(offset + 1, true);
            }
            float f = packPackage;
            dispatchTimezone = packPackage2;
            dispatchTimezone2 = f;
        } else {
            dispatchTimezone = packPackage(offset, false);
            dispatchTimezone2 = packPackage(offset + 1, true);
        }
        return new RectF(dispatchTimezone, syncScope, dispatchTimezone2, connectPatch);
    }

    public final float resetDelta(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final boolean resumeSignature(int lineIndex) {
        return SectionStep.peekRevision(this.layout, lineIndex);
    }

    /* renamed from: serializeOffset, reason: from getter */
    public final ViewNotifier getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final ServiceBroadcaster startResource() {
        ServiceBroadcaster serviceBroadcaster = this.backingWordIterator;
        if (serviceBroadcaster != null) {
            return serviceBroadcaster;
        }
        ServiceBroadcaster serviceBroadcaster2 = new ServiceBroadcaster(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = serviceBroadcaster2;
        return serviceBroadcaster2;
    }

    public final float storeCharset() {
        return this.layoutIntrinsics.applyTask();
    }

    public final float syncScope(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    /* renamed from: updateAction, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final int updateTimer() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public static /* synthetic */ void connectComponent() {
    }

    public static /* synthetic */ void connectJob() {
    }

    public static /* synthetic */ void detachStream() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RuntimeBackup(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, ViewNotifier viewNotifier, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, f, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        CharSequence charSequence2;
        TextPaint textPaint2;
        ViewNotifier viewNotifier2;
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        float f4 = (i9 & 64) != 0 ? 1.0f : f2;
        float f5 = (i9 & ContentOperation.SpotShadowColor) != 0 ? 0.0f : f3;
        boolean z3 = (i9 & ContentOperation.RotationX) != 0 ? false : z;
        boolean z4 = (i9 & ContentOperation.RotationY) != 0 ? true : z2;
        int i12 = (i9 & ContentOperation.RotationZ) != 0 ? Integer.MAX_VALUE : i3;
        int i13 = (i9 & ContentOperation.CameraDistance) != 0 ? 0 : i4;
        int i14 = (i9 & ContentOperation.TransformOrigin) != 0 ? 0 : i5;
        int i15 = (i9 & ContentOperation.Shape) != 0 ? 0 : i6;
        int i16 = (i9 & ContentOperation.Clip) != 0 ? 0 : i7;
        int i17 = (32768 & i9) != 0 ? 0 : i8;
        int[] iArr3 = (65536 & i9) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i9) != 0 ? null : iArr2;
        if ((i9 & ContentOperation.ColorFilter) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            viewNotifier2 = new ViewNotifier(charSequence2, textPaint2, i11);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            viewNotifier2 = viewNotifier;
        }
    }
}
