package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\b2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020!0&H\u0082\b\u001a\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "numArgs", "nodeFor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "toPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i, Function1<? super float[], ? extends PathNode> function1) {
        IntProgression step;
        int collectionSizeOrDefault;
        ?? floatArray;
        step = RangesKt___RangesKt.step(new IntRange(0, fArr.length - i), i);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = step.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(fArr, RangesKt.until(nextInt, nextInt + i)));
            Object obj = (PathNode) function1.invoke(floatArray);
            if ((obj instanceof PathNode.MoveTo) && nextInt > 0) {
                obj = new PathNode.LineTo(floatArray[0], floatArray[1]);
            } else if ((obj instanceof PathNode.RelativeMoveTo) && nextInt > 0) {
                obj = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final List<PathNode> toPathNodes(char c, float[] args) {
        IntProgression step;
        int collectionSizeOrDefault;
        float[] floatArray;
        IntProgression step2;
        int collectionSizeOrDefault2;
        float[] floatArray2;
        IntProgression step3;
        int collectionSizeOrDefault3;
        float[] floatArray3;
        IntProgression step4;
        int collectionSizeOrDefault4;
        float[] floatArray4;
        IntProgression step5;
        int collectionSizeOrDefault5;
        float[] floatArray5;
        IntProgression step6;
        int collectionSizeOrDefault6;
        float[] floatArray6;
        IntProgression step7;
        int collectionSizeOrDefault7;
        float[] floatArray7;
        IntProgression step8;
        int collectionSizeOrDefault8;
        float[] floatArray8;
        IntProgression step9;
        int collectionSizeOrDefault9;
        float[] floatArray9;
        IntProgression step10;
        int collectionSizeOrDefault10;
        float[] floatArray10;
        IntProgression step11;
        int collectionSizeOrDefault11;
        float[] floatArray11;
        IntProgression step12;
        int collectionSizeOrDefault12;
        float[] floatArray12;
        IntProgression step13;
        int collectionSizeOrDefault13;
        float[] floatArray13;
        IntProgression step14;
        int collectionSizeOrDefault14;
        float[] floatArray14;
        IntProgression step15;
        int collectionSizeOrDefault15;
        float[] floatArray15;
        IntProgression step16;
        int collectionSizeOrDefault16;
        float[] floatArray16;
        IntProgression step17;
        int collectionSizeOrDefault17;
        float[] floatArray17;
        IntProgression step18;
        int collectionSizeOrDefault18;
        float[] floatArray18;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            return CollectionsKt.listOf(PathNode.Close.INSTANCE);
        }
        char c2 = 2;
        if (c == 'm') {
            step18 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault18 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step18, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault18);
            Iterator<Integer> it = step18.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                floatArray18 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt, nextInt + 2)));
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(floatArray18[0], floatArray18[1]);
                if (nextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(floatArray18[0], floatArray18[1]);
                }
                arrayList.add(relativeMoveTo);
            }
            return arrayList;
        }
        if (c == 'M') {
            step17 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault17 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step17, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault17);
            Iterator<Integer> it2 = step17.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((IntIterator) it2).nextInt();
                floatArray17 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt2, nextInt2 + 2)));
                PathNode moveTo = new PathNode.MoveTo(floatArray17[0], floatArray17[1]);
                if (nextInt2 > 0) {
                    moveTo = new PathNode.LineTo(floatArray17[0], floatArray17[1]);
                }
                arrayList2.add(moveTo);
            }
            return arrayList2;
        }
        if (c == 'l') {
            step16 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault16 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step16, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault16);
            Iterator<Integer> it3 = step16.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((IntIterator) it3).nextInt();
                floatArray16 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt3, nextInt3 + 2)));
                arrayList3.add(new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]));
            }
            return arrayList3;
        }
        if (c == 'L') {
            step15 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault15 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step15, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault15);
            Iterator<Integer> it4 = step15.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((IntIterator) it4).nextInt();
                floatArray15 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt4, nextInt4 + 2)));
                arrayList4.add(new PathNode.LineTo(floatArray15[0], floatArray15[1]));
            }
            return arrayList4;
        }
        if (c == 'h') {
            step14 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault14 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step14, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault14);
            Iterator<Integer> it5 = step14.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((IntIterator) it5).nextInt();
                floatArray14 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt5, nextInt5 + 1)));
                arrayList5.add(new PathNode.RelativeHorizontalTo(floatArray14[0]));
            }
            return arrayList5;
        }
        if (c == 'H') {
            step13 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault13 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step13, 10);
            ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault13);
            Iterator<Integer> it6 = step13.iterator();
            while (it6.hasNext()) {
                int nextInt6 = ((IntIterator) it6).nextInt();
                floatArray13 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt6, nextInt6 + 1)));
                arrayList6.add(new PathNode.HorizontalTo(floatArray13[0]));
            }
            return arrayList6;
        }
        if (c == 'v') {
            step12 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault12 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step12, 10);
            ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault12);
            Iterator<Integer> it7 = step12.iterator();
            while (it7.hasNext()) {
                int nextInt7 = ((IntIterator) it7).nextInt();
                floatArray12 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt7, nextInt7 + 1)));
                arrayList7.add(new PathNode.RelativeVerticalTo(floatArray12[0]));
            }
            return arrayList7;
        }
        if (c == 'V') {
            step11 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault11 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step11, 10);
            ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault11);
            Iterator<Integer> it8 = step11.iterator();
            while (it8.hasNext()) {
                int nextInt8 = ((IntIterator) it8).nextInt();
                floatArray11 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt8, nextInt8 + 1)));
                arrayList8.add(new PathNode.VerticalTo(floatArray11[0]));
            }
            return arrayList8;
        }
        if (c == 'c') {
            step10 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
            collectionSizeOrDefault10 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step10, 10);
            ArrayList arrayList9 = new ArrayList(collectionSizeOrDefault10);
            Iterator<Integer> it9 = step10.iterator();
            while (it9.hasNext()) {
                int nextInt9 = ((IntIterator) it9).nextInt();
                floatArray10 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt9, nextInt9 + 6)));
                arrayList9.add(new PathNode.RelativeCurveTo(floatArray10[0], floatArray10[1], floatArray10[2], floatArray10[3], floatArray10[4], floatArray10[5]));
            }
            return arrayList9;
        }
        if (c == 'C') {
            step9 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
            collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step9, 10);
            ArrayList arrayList10 = new ArrayList(collectionSizeOrDefault9);
            Iterator<Integer> it10 = step9.iterator();
            while (it10.hasNext()) {
                int nextInt10 = ((IntIterator) it10).nextInt();
                floatArray9 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt10, nextInt10 + 6)));
                arrayList10.add(new PathNode.CurveTo(floatArray9[0], floatArray9[1], floatArray9[2], floatArray9[3], floatArray9[4], floatArray9[5]));
            }
            return arrayList10;
        }
        if (c == 's') {
            step8 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step8, 10);
            ArrayList arrayList11 = new ArrayList(collectionSizeOrDefault8);
            Iterator<Integer> it11 = step8.iterator();
            while (it11.hasNext()) {
                int nextInt11 = ((IntIterator) it11).nextInt();
                floatArray8 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt11, nextInt11 + 4)));
                arrayList11.add(new PathNode.RelativeReflectiveCurveTo(floatArray8[0], floatArray8[1], floatArray8[2], floatArray8[3]));
            }
            return arrayList11;
        }
        if (c == 'S') {
            step7 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step7, 10);
            ArrayList arrayList12 = new ArrayList(collectionSizeOrDefault7);
            Iterator<Integer> it12 = step7.iterator();
            while (it12.hasNext()) {
                int nextInt12 = ((IntIterator) it12).nextInt();
                floatArray7 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt12, nextInt12 + 4)));
                arrayList12.add(new PathNode.ReflectiveCurveTo(floatArray7[0], floatArray7[1], floatArray7[2], floatArray7[3]));
            }
            return arrayList12;
        }
        if (c == 'q') {
            step6 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step6, 10);
            ArrayList arrayList13 = new ArrayList(collectionSizeOrDefault6);
            Iterator<Integer> it13 = step6.iterator();
            while (it13.hasNext()) {
                int nextInt13 = ((IntIterator) it13).nextInt();
                floatArray6 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt13, nextInt13 + 4)));
                arrayList13.add(new PathNode.RelativeQuadTo(floatArray6[0], floatArray6[1], floatArray6[2], floatArray6[3]));
            }
            return arrayList13;
        }
        if (c == 'Q') {
            step5 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
            collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step5, 10);
            ArrayList arrayList14 = new ArrayList(collectionSizeOrDefault5);
            Iterator<Integer> it14 = step5.iterator();
            while (it14.hasNext()) {
                int nextInt14 = ((IntIterator) it14).nextInt();
                floatArray5 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt14, nextInt14 + 4)));
                arrayList14.add(new PathNode.QuadTo(floatArray5[0], floatArray5[1], floatArray5[2], floatArray5[3]));
            }
            return arrayList14;
        }
        if (c == 't') {
            step4 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step4, 10);
            ArrayList arrayList15 = new ArrayList(collectionSizeOrDefault4);
            Iterator<Integer> it15 = step4.iterator();
            while (it15.hasNext()) {
                int nextInt15 = ((IntIterator) it15).nextInt();
                floatArray4 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt15, nextInt15 + 2)));
                arrayList15.add(new PathNode.RelativeReflectiveQuadTo(floatArray4[0], floatArray4[1]));
            }
            return arrayList15;
        }
        if (c == 'T') {
            step3 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step3, 10);
            ArrayList arrayList16 = new ArrayList(collectionSizeOrDefault3);
            Iterator<Integer> it16 = step3.iterator();
            while (it16.hasNext()) {
                int nextInt16 = ((IntIterator) it16).nextInt();
                floatArray3 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt16, nextInt16 + 2)));
                arrayList16.add(new PathNode.ReflectiveQuadTo(floatArray3[0], floatArray3[1]));
            }
            return arrayList16;
        }
        if (c == 'a') {
            step2 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step2, 10);
            ArrayList arrayList17 = new ArrayList(collectionSizeOrDefault2);
            Iterator<Integer> it17 = step2.iterator();
            while (it17.hasNext()) {
                int nextInt17 = ((IntIterator) it17).nextInt();
                floatArray2 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt17, nextInt17 + 7)));
                char c3 = c2;
                arrayList17.add(new PathNode.RelativeArcTo(floatArray2[0], floatArray2[1], floatArray2[c2], Float.compare(floatArray2[3], 0.0f) != 0, Float.compare(floatArray2[4], 0.0f) != 0, floatArray2[5], floatArray2[6]));
                c2 = c3;
            }
            return arrayList17;
        }
        if (c != 'A') {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown command for: ", Character.valueOf(c)));
        }
        step = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
        ArrayList arrayList18 = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it18 = step.iterator();
        while (it18.hasNext()) {
            int nextInt18 = ((IntIterator) it18).nextInt();
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt.slice(args, RangesKt.until(nextInt18, nextInt18 + 7)));
            arrayList18.add(new PathNode.ArcTo(floatArray[0], floatArray[1], floatArray[2], Float.compare(floatArray[3], 0.0f) != 0, Float.compare(floatArray[4], 0.0f) != 0, floatArray[5], floatArray[6]));
        }
        return arrayList18;
    }
}
