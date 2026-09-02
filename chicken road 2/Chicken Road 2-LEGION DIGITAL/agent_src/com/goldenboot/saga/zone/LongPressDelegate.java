package com.goldenboot.saga.zone;

import android.graphics.RectF;
import android.text.Layout;
import com.goldenboot.saga.zone.FeedbackAnalyzer;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/goldenboot/saga/zone/RuntimeBackup;", "Landroid/text/Layout;", "layout", "Lcom/goldenboot/saga/zone/FeedbackAnalyzer;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "detachStream", "(Lcom/goldenboot/saga/zone/RuntimeBackup;Landroid/text/Layout;Lcom/goldenboot/saga/zone/FeedbackAnalyzer;Landroid/graphics/RectF;ILcom/goldenboot/saga/zone/IconExporter;)[I", "lineIndex", "Lcom/goldenboot/saga/zone/BundleStage;", "segmentFinder", "getStart", "clipOrigin", "(Lcom/goldenboot/saga/zone/RuntimeBackup;Landroid/text/Layout;Lcom/goldenboot/saga/zone/FeedbackAnalyzer;ILandroid/graphics/RectF;Lcom/goldenboot/saga/zone/BundleStage;Lcom/goldenboot/saga/zone/IconExporter;Z)I", "Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "releaseHeader", "(Lcom/goldenboot/saga/zone/FeedbackAnalyzer$ActivityMutator;Landroid/graphics/RectF;IIIFF[FLcom/goldenboot/saga/zone/BundleStage;Lcom/goldenboot/saga/zone/IconExporter;)I", "injectMetric", "offset", "evictLayout", "(II[F)F", "growPayload", "left", "right", "flushSample", "(Landroid/graphics/RectF;FF)Z", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LongPressDelegate {
    private static final int clipOrigin(RuntimeBackup runtimeBackup, Layout layout, FeedbackAnalyzer feedbackAnalyzer, int i, RectF rectF, BundleStage bundleStage, IconExporter iconExporter, boolean z) {
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        runtimeBackup.growPayload(i, fArr);
        FeedbackAnalyzer.BidiRun[] releaseHeader = feedbackAnalyzer.releaseHeader(i);
        ProgressIndex groupArchive = z ? PluginInspector.groupArchive(releaseHeader) : CellEntry.reduceScope(PluginInspector.serializeTask(releaseHeader), 0);
        int applyTask = groupArchive.applyTask();
        int serializeOffset = groupArchive.serializeOffset();
        int notifyMessage = groupArchive.notifyMessage();
        if ((notifyMessage > 0 && applyTask <= serializeOffset) || (notifyMessage < 0 && serializeOffset <= applyTask)) {
            int i2 = applyTask;
            while (true) {
                FeedbackAnalyzer.BidiRun bidiRun = releaseHeader[i2];
                float evictLayout = bidiRun.updateTimer() ? evictLayout(bidiRun.getEnd() - 1, lineStart, fArr) : evictLayout(bidiRun.flushSample(), lineStart, fArr);
                float growPayload = bidiRun.updateTimer() ? growPayload(bidiRun.flushSample(), lineStart, fArr) : growPayload(bidiRun.getEnd() - 1, lineStart, fArr);
                int releaseHeader2 = z ? releaseHeader(bidiRun, rectF, lineStart, lineTop, lineBottom, evictLayout, growPayload, fArr, bundleStage, iconExporter) : injectMetric(bidiRun, rectF, lineStart, lineTop, lineBottom, evictLayout, growPayload, fArr, bundleStage, iconExporter);
                if (releaseHeader2 < 0) {
                    if (i2 == serializeOffset) {
                        break;
                    }
                    i2 += notifyMessage;
                } else {
                    return releaseHeader2;
                }
            }
        }
        return -1;
    }

    public static final int[] detachStream(RuntimeBackup runtimeBackup, Layout layout, FeedbackAnalyzer feedbackAnalyzer, RectF rectF, int i, IconExporter iconExporter) {
        int i2;
        BundleStage labelFetcher = i == 1 ? new LabelFetcher(runtimeBackup.attachCallback(), runtimeBackup.startResource()) : ServerSpawner.evictLayout(runtimeBackup.attachCallback(), runtimeBackup.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > runtimeBackup.connectPatch(lineForVertical) && (lineForVertical = lineForVertical + 1) >= runtimeBackup.getLineCount()) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < runtimeBackup.syncScope(0)) {
            return null;
        }
        int clipOrigin = clipOrigin(runtimeBackup, layout, feedbackAnalyzer, i3, rectF, labelFetcher, iconExporter, true);
        while (true) {
            i2 = i3;
            if (clipOrigin != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            clipOrigin = clipOrigin(runtimeBackup, layout, feedbackAnalyzer, i3, rectF, labelFetcher, iconExporter, true);
        }
        if (clipOrigin == -1) {
            return null;
        }
        int clipOrigin2 = clipOrigin(runtimeBackup, layout, feedbackAnalyzer, lineForVertical2, rectF, labelFetcher, iconExporter, false);
        while (clipOrigin2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            clipOrigin2 = clipOrigin(runtimeBackup, layout, feedbackAnalyzer, i4, rectF, labelFetcher, iconExporter, false);
            lineForVertical2 = i4;
        }
        if (clipOrigin2 == -1) {
            return null;
        }
        return new int[]{labelFetcher.injectMetric(clipOrigin + 1), labelFetcher.detachStream(clipOrigin2 - 1)};
    }

    private static final float evictLayout(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final boolean flushSample(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }

    private static final float growPayload(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int injectMetric(FeedbackAnalyzer.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, BundleStage bundleStage, IconExporter iconExporter) {
        int flushSample;
        int detachStream;
        if (!flushSample(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.updateTimer() || rectF.right < f2) && (!bidiRun.updateTimer() || rectF.left > f)) {
            flushSample = bidiRun.flushSample();
            int end = bidiRun.getEnd();
            while (end - flushSample > 1) {
                int i4 = (end + flushSample) / 2;
                float evictLayout = evictLayout(i4, i, fArr);
                if ((bidiRun.updateTimer() || evictLayout <= rectF.right) && (!bidiRun.updateTimer() || evictLayout >= rectF.left)) {
                    flushSample = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.updateTimer()) {
                flushSample = end;
            }
        } else {
            flushSample = bidiRun.getEnd() - 1;
        }
        int injectMetric = bundleStage.injectMetric(flushSample + 1);
        if (injectMetric == -1 || (detachStream = bundleStage.detachStream(injectMetric)) <= bidiRun.flushSample()) {
            return -1;
        }
        int releaseHeader = CellEntry.releaseHeader(injectMetric, bidiRun.flushSample());
        int updateTimer = CellEntry.updateTimer(detachStream, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.updateTimer() ? evictLayout(updateTimer - 1, i, fArr) : evictLayout(releaseHeader, i, fArr);
            rectF2.right = bidiRun.updateTimer() ? growPayload(releaseHeader, i, fArr) : growPayload(updateTimer - 1, i, fArr);
            if (((Boolean) iconExporter.invoke(rectF2, rectF)).booleanValue()) {
                return updateTimer;
            }
            updateTimer = bundleStage.growPayload(updateTimer);
            if (updateTimer == -1 || updateTimer <= bidiRun.flushSample()) {
                break;
            }
            releaseHeader = CellEntry.releaseHeader(bundleStage.injectMetric(updateTimer), bidiRun.flushSample());
        }
    }

    private static final int releaseHeader(FeedbackAnalyzer.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, BundleStage bundleStage, IconExporter iconExporter) {
        int flushSample;
        int injectMetric;
        if (!flushSample(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.updateTimer() || rectF.left > f) && (!bidiRun.updateTimer() || rectF.right < f2)) {
            flushSample = bidiRun.flushSample();
            int end = bidiRun.getEnd();
            while (end - flushSample > 1) {
                int i4 = (end + flushSample) / 2;
                float evictLayout = evictLayout(i4, i, fArr);
                if ((bidiRun.updateTimer() || evictLayout <= rectF.left) && (!bidiRun.updateTimer() || evictLayout >= rectF.right)) {
                    flushSample = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.updateTimer()) {
                flushSample = end;
            }
        } else {
            flushSample = bidiRun.flushSample();
        }
        int detachStream = bundleStage.detachStream(flushSample);
        if (detachStream == -1 || (injectMetric = bundleStage.injectMetric(detachStream)) >= bidiRun.getEnd()) {
            return -1;
        }
        int releaseHeader = CellEntry.releaseHeader(injectMetric, bidiRun.flushSample());
        int updateTimer = CellEntry.updateTimer(detachStream, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.updateTimer() ? evictLayout(updateTimer - 1, i, fArr) : evictLayout(releaseHeader, i, fArr);
            rectF2.right = bidiRun.updateTimer() ? growPayload(releaseHeader, i, fArr) : growPayload(updateTimer - 1, i, fArr);
            if (((Boolean) iconExporter.invoke(rectF2, rectF)).booleanValue()) {
                return releaseHeader;
            }
            releaseHeader = bundleStage.evictLayout(releaseHeader);
            if (releaseHeader == -1 || releaseHeader >= bidiRun.getEnd()) {
                break;
            }
            updateTimer = CellEntry.updateTimer(bundleStage.detachStream(releaseHeader), bidiRun.getEnd());
        }
        return -1;
    }
}
