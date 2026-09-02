package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.DrawerLoop;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aR\u0010\u0010\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0015\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0015\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0015\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0015\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0015\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0015\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0015\"\u0014\u00101\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0015\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0015\"\u0014\u00105\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0015\"\u0014\u00107\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0015\"\u0014\u00109\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0015\"\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010>\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010;\"\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010;\"\u0014\u0010B\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010;\"\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010;\"\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010;\"\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010;\"\u0014\u0010J\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010;\"\u0014\u0010L\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010;¨\u0006M"}, d2 = {"", "Ljava/util/ArrayList;", "Lcom/goldenboot/saga/zone/DrawerLoop;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(CLjava/util/ArrayList;[FI)V", "", "numArgs", "Lkotlin/Function2;", "nodeFor", "injectMetric", "(Ljava/util/List;[FIILcom/goldenboot/saga/zone/IconExporter;)V", "growPayload", "(Ljava/util/List;[FI)V", "detachStream", "C", "RelativeCloseKey", "CloseKey", "RelativeMoveToKey", "MoveToKey", "releaseHeader", "RelativeLineToKey", "clipOrigin", "LineToKey", "flushSample", "RelativeHorizontalToKey", "updateTimer", "HorizontalToKey", "applyTask", "RelativeVerticalToKey", "popBlueprint", "VerticalToKey", "drawField", "RelativeCurveToKey", "connectJob", "CurveToKey", "peekRevision", "RelativeReflectiveCurveToKey", "serializeOffset", "ReflectiveCurveToKey", "reduceScope", "RelativeQuadToKey", "notifyMessage", "QuadToKey", "connectPatch", "RelativeReflectiveQuadToKey", "attachConfig", "ReflectiveQuadToKey", "resetDelta", "RelativeArcToKey", "inflateAdapter", "ArcToKey", "purgeNode", "I", "NUM_MOVE_TO_ARGS", "drawRequest", "NUM_LINE_TO_ARGS", "gatherAdapter", "NUM_HORIZONTAL_TO_ARGS", "decodePath", "NUM_VERTICAL_TO_ARGS", "drawScope", "NUM_CURVE_TO_ARGS", "expandArgs", "NUM_REFLECTIVE_CURVE_TO_ARGS", "findTask", "NUM_QUAD_TO_ARGS", "mergeLocale", "NUM_REFLECTIVE_QUAD_TO_ARGS", "syncScope", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndicatorGovernor {
    private static final char applyTask = 'v';
    private static final char attachConfig = 'T';
    private static final char clipOrigin = 'L';
    private static final char connectJob = 'C';
    private static final char connectPatch = 't';
    private static final int decodePath = 1;
    private static final char detachStream = 'M';
    private static final char drawField = 'c';
    private static final int drawRequest = 2;
    private static final int drawScope = 6;
    private static final char evictLayout = 'z';
    private static final int expandArgs = 4;
    private static final int findTask = 4;
    private static final char flushSample = 'h';
    private static final int gatherAdapter = 1;
    private static final char growPayload = 'Z';
    private static final char inflateAdapter = 'A';
    private static final char injectMetric = 'm';
    private static final int mergeLocale = 2;
    private static final char notifyMessage = 'Q';
    private static final char peekRevision = 's';
    private static final char popBlueprint = 'V';
    private static final int purgeNode = 2;
    private static final char reduceScope = 'q';
    private static final char releaseHeader = 'l';
    private static final char resetDelta = 'a';
    private static final char serializeOffset = 'S';
    private static final int syncScope = 7;
    private static final char updateTimer = 'H';

    private static final void detachStream(List<DrawerLoop> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new DrawerLoop.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new DrawerLoop.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    public static final void evictLayout(char c, ArrayList<DrawerLoop> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                int i3 = i - 7;
                for (int i4 = 0; i4 <= i3; i4 += 7) {
                    arrayList.add(new DrawerLoop.ArcTo(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], Float.compare(fArr[i4 + 3], 0.0f) != 0, Float.compare(fArr[i4 + 4], 0.0f) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                return;
            case 'C':
                int i5 = i - 6;
                while (i2 <= i5) {
                    arrayList.add(new DrawerLoop.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                int i6 = i - 1;
                while (i2 <= i6) {
                    arrayList.add(new DrawerLoop.HorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                int i7 = i - 2;
                while (i2 <= i7) {
                    arrayList.add(new DrawerLoop.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                growPayload(arrayList, fArr, i);
                return;
            case 'Q':
                int i8 = i - 4;
                while (i2 <= i8) {
                    arrayList.add(new DrawerLoop.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                int i9 = i - 4;
                while (i2 <= i9) {
                    arrayList.add(new DrawerLoop.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                int i10 = i - 2;
                while (i2 <= i10) {
                    arrayList.add(new DrawerLoop.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                int i11 = i - 1;
                while (i2 <= i11) {
                    arrayList.add(new DrawerLoop.VerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(DrawerLoop.BounceHandler.injectMetric);
                return;
            case 'a':
                int i12 = i - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new DrawerLoop.RelativeArcTo(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'c':
                int i14 = i - 6;
                while (i2 <= i14) {
                    arrayList.add(new DrawerLoop.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                int i15 = i - 1;
                while (i2 <= i15) {
                    arrayList.add(new DrawerLoop.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'l':
                int i16 = i - 2;
                while (i2 <= i16) {
                    arrayList.add(new DrawerLoop.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'm':
                detachStream(arrayList, fArr, i);
                return;
            case 'q':
                int i17 = i - 4;
                while (i2 <= i17) {
                    arrayList.add(new DrawerLoop.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 's':
                int i18 = i - 4;
                while (i2 <= i18) {
                    arrayList.add(new DrawerLoop.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                int i19 = i - 2;
                while (i2 <= i19) {
                    arrayList.add(new DrawerLoop.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'v':
                int i20 = i - 1;
                while (i2 <= i20) {
                    arrayList.add(new DrawerLoop.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c);
        }
    }

    private static final void growPayload(List<DrawerLoop> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new DrawerLoop.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new DrawerLoop.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void injectMetric(List<DrawerLoop> list, float[] fArr, int i, int i2, IconExporter iconExporter) {
        int i3 = i - i2;
        int i4 = 0;
        while (i4 <= i3) {
            list.add(iconExporter.invoke(fArr, Integer.valueOf(i4)));
            i4 += i2;
        }
    }
}
