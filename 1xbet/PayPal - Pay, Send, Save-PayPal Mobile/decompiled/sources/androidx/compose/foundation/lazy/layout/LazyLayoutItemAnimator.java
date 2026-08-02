package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003KLMB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0082\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\t\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0003H\u0002J\u0006\u0010-\u001a\u00020\u0019J\b\u0010.\u001a\u00020\u0019H\u0002J1\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00020\f2\u0012\b\u0002\u00102\u001a\f0\bR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0002\u00103J\u001f\u00104\u001a\u00020\u00192\u0006\u00100\u001a\u00028\u00002\b\b\u0002\u00105\u001a\u00020!H\u0002¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0004\u0018\u00010\u00152\u0006\u0010,\u001a\u00020\u00032\u0006\u00108\u001a\u00020\fJ\u0019\u00109\u001a\u00020\f*\u00020:2\u0006\u00100\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010;R$\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\bR\b\u0012\u0004\u0012\u00028\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010D\u001a\u00020!*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0018\u00101\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0018\u0010I\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010H¨\u0006N"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "<init>", "()V", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingInFromStartBound", "", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "disappearingItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "isVertical", "", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "removeInfoForKey", "key", "reset", "releaseAnimations", "initializeAnimation", "item", "mainAxisOffset", "itemInfo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "startPlacementAnimationsIfNeeded", "isMovingAway", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "getAnimation", "placeableIndex", "updateAndReturnOffsetFor", "", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "hasAnimations", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "crossAxisOffset", "getCrossAxisOffset", "ItemInfo", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutItemAnimator<T extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private int getHighSpeedVideoFpsRanges;
    private androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.node.DrawModifierNode getHighSpeedVideoSizes;
    private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo> getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ScatterMapKt.mutableScatterMapOf();
    private final androidx.collection.MutableScatterSet<java.lang.Object> getOutputMinFrameDuration = androidx.collection.ScatterSetKt.mutableScatterSetOf();
    private final java.util.List<T> getInputFormats = new java.util.ArrayList();
    private final java.util.List<T> getHighSpeedVideoSizesFor = new java.util.ArrayList();
    private final java.util.List<T> getOutputFormats = new java.util.ArrayList();
    private final java.util.List<T> getInputSizeshNQ4ISI = new java.util.ArrayList();
    private final java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private final androidx.compose.ui.Modifier modifier = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement(this);

    public static final /* synthetic */ int access$getCrossAxisOffset(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        return getHighSpeedVideoFpsRanges(lazyLayoutMeasuredItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ed, code lost:
    
        r8.animateAppearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f3, code lost:
    
        getHighSpeedVideoFpsRangesFor(r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f9, code lost:
    
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f7, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0110, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r34.getHighSpeedVideoFpsRanges = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0109, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fc, code lost:
    
        r23 = r9;
        getHighSpeedVideoSizes(r5.getKey());
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020f, code lost:
    
        r2 = r43;
        r1 = new int[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0213, code lost:
    
        if (r13 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0215, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021f, code lost:
    
        if (r34.getInputFormats.isEmpty() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0221, code lost:
    
        r4 = r34.getInputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r41 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0228, code lost:
    
        if (r4.size() <= 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022a, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r4, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0234, code lost:
    
        r4 = r34.getInputFormats;
        r5 = r4.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023e, code lost:
    
        if (r6 >= r5) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r8 = r4.get(r6);
        Camera2StreamConfigurationMap(r34, r8, r45 - Camera2StreamConfigurationMap(r1, r8));
        getHighSpeedVideoFpsRangesFor(r8, false);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0255, code lost:
    
        kotlin.collections.ArraysKt.fill$default(r1, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026c, code lost:
    
        if (r34.getHighSpeedVideoSizesFor.isEmpty() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026e, code lost:
    
        r4 = r34.getHighSpeedVideoSizesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r11 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(r35 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0275, code lost:
    
        if (r4.size() <= 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0277, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r4, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0281, code lost:
    
        r4 = r34.getHighSpeedVideoSizesFor;
        r5 = r4.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x028b, code lost:
    
        if (r6 >= r5) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028d, code lost:
    
        r8 = r4.get(r6);
        Camera2StreamConfigurationMap(r34, r8, (r46 + Camera2StreamConfigurationMap(r1, r8)) - r8.getMainAxisSizeWithSpacings());
        getHighSpeedVideoFpsRangesFor(r8, false);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a7, code lost:
    
        kotlin.collections.ArraysKt.fill$default(r1, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b6, code lost:
    
        r4 = r34.getOutputMinFrameDuration;
        r5 = r4.elements;
        r4 = r4.metadata;
        r6 = r4.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c1, code lost:
    
        if (r6 < 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c3, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r42 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c4, code lost:
    
        r9 = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ce, code lost:
    
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d0, code lost:
    
        r11 = 8 - ((~(r8 - r6)) >>> 31);
        r14 = r9;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02db, code lost:
    
        if (r9 >= r11) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e1, code lost:
    
        if ((r14 & 255) >= 128) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e3, code lost:
    
        r10 = r5[(r8 << 3) + r9];
        r12 = r34.getHighResolutionOutputSizeshNQ4ISI.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f0, code lost:
    
        if (r12 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f2, code lost:
    
        r30 = r4;
        r4 = r39.getIndex(r10);
        r31 = r5;
        r12.getHighSpeedVideoSizes(java.lang.Math.min(r2, r12.getGetOutputFormats()));
        r12.getHighResolutionOutputSizeshNQ4ISI(java.lang.Math.min(r2 - r12.getGetOutputFormats(), r12.getGetHighResolutionOutputSizeshNQ4ISI()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0319, code lost:
    
        if (r4 != (-1)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r44 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031b, code lost:
    
        r4 = r12.getGetHighSpeedVideoSizes();
        r5 = r4.length;
        r2 = 0;
        r23 = false;
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0325, code lost:
    
        if (r2 >= r5) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0327, code lost:
    
        r25 = r5;
        r5 = r4[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x032b, code lost:
    
        if (r5 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0331, code lost:
    
        if (r5.isDisappearanceAnimationInProgress() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0333, code lost:
    
        r5 = kotlin.Unit.INSTANCE;
        r26 = r4;
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x038c, code lost:
    
        r2 = r2 + 1;
        r24 = r24 + 1;
        r5 = r25;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0340, code lost:
    
        if (r5.isDisappearanceAnimationFinished() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0342, code lost:
    
        r5.release();
        r12.getGetHighSpeedVideoSizes()[r24] = null;
        r26 = r4;
        r34.Camera2StreamConfigurationMap.remove(r5);
        r4 = r34.getHighSpeedVideoSizes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0354, code lost:
    
        if (r4 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0356, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r4);
        r4 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x035c, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0362, code lost:
    
        if (r5.getLayer() == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0364, code lost:
    
        r5.animateDisappearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r14 = r34.getHighResolutionOutputSizeshNQ4ISI;
        r15 = r14.keys;
        r14 = r14.metadata;
        r1 = r14.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x036b, code lost:
    
        if (r5.isDisappearanceAnimationInProgress() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x036d, code lost:
    
        r34.Camera2StreamConfigurationMap.add(r5);
        r4 = r34.getHighSpeedVideoSizes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0374, code lost:
    
        if (r4 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0376, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r4);
        r4 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037b, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0387, code lost:
    
        r4 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037e, code lost:
    
        r5.release();
        r12.getGetHighSpeedVideoSizes()[r24] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038a, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r1 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0395, code lost:
    
        if (r23 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0397, code lost:
    
        getHighSpeedVideoSizes(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039a, code lost:
    
        r2 = kotlin.Unit.INSTANCE;
        r33 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x041d, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x041f, code lost:
    
        r14 = r14 >> 8;
        r9 = r9 + 1;
        r2 = r43;
        r4 = r30;
        r5 = r31;
        r13 = r32;
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a0, code lost:
    
        r2 = r12.getGetHighSpeedVideoFpsRangesFor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2 = r40.mo1796getAndMeasurehBUhpc(r4, r12.getGetHighResolutionOutputSizeshNQ4ISI(), r12.getGetOutputFormats(), r2.getGetHighSpeedVideoFpsRangesFor());
        r2.setNonScrollableItem(true);
        r5 = r12.getGetHighSpeedVideoSizes();
        r32 = r13;
        r13 = r5.length;
        r33 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c9, code lost:
    
        if (r1 >= r13) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03cb, code lost:
    
        r23 = r5[r1];
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03cf, code lost:
    
        if (r23 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d1, code lost:
    
        r5 = r23.isPlacementAnimationInProgress();
        r23 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d8, code lost:
    
        if (r5 == true) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03f2, code lost:
    
        r12.getHighSpeedVideoFpsRanges(r2, r47, r48, r45, r46, r12.getCamera2StreamConfigurationMap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0407, code lost:
    
        if (r4 >= r34.getHighSpeedVideoFpsRanges) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0409, code lost:
    
        r34.getOutputFormats.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x040f, code lost:
    
        r34.getInputSizeshNQ4ISI.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r2 = r14[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03dd, code lost:
    
        r1 = r1 + 1;
        r13 = r23;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03db, code lost:
    
        r23 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03e4, code lost:
    
        if (r7 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ea, code lost:
    
        if (r4 != r7.getIndex(r10)) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03ec, code lost:
    
        getHighSpeedVideoSizes(r10);
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0415, code lost:
    
        r33 = r1;
        r30 = r4;
        r31 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0431, code lost:
    
        r3 = r39;
        r33 = r1;
        r30 = r4;
        r31 = r5;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x043d, code lost:
    
        if (r11 != 8) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x044c, code lost:
    
        if (r8 == r6) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x044e, code lost:
    
        r8 = r8 + 1;
        r2 = r43;
        r4 = r30;
        r5 = r31;
        r13 = r32;
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x046b, code lost:
    
        if (r34.getOutputFormats.isEmpty() != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x046d, code lost:
    
        r1 = r34.getOutputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r5 = 8 - ((~(r10 - r1)) >>> 31);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0474, code lost:
    
        if (r1.size() <= 1) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0476, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0480, code lost:
    
        r1 = r34.getOutputFormats;
        r2 = r1.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x048a, code lost:
    
        if (r4 >= r2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x048c, code lost:
    
        r5 = r1.get(r4);
        r6 = r34.getHighResolutionOutputSizeshNQ4ISI.get(r5.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        r6 = r6;
        r7 = r33;
        r8 = Camera2StreamConfigurationMap(r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04a7, code lost:
    
        if (r42 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a9, code lost:
    
        r9 = getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) r38));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04b8, code lost:
    
        r5.position(r9 - r8, r6.getCamera2StreamConfigurationMap(), r36, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04c4, code lost:
    
        if (r32 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04c6, code lost:
    
        getHighSpeedVideoFpsRangesFor(r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r6 >= r5) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04ca, code lost:
    
        r4 = r4 + 1;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b4, code lost:
    
        r9 = r6.getGetHighSpeedVideoSizesFor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04cf, code lost:
    
        r8 = r36;
        r10 = r37;
        r7 = r33;
        kotlin.collections.ArraysKt.fill$default(r7, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04f8, code lost:
    
        if (r34.getInputSizeshNQ4ISI.isEmpty() != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04fa, code lost:
    
        r1 = r34.getInputSizeshNQ4ISI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0501, code lost:
    
        if (r1.size() <= 1) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0503, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x050d, code lost:
    
        r1 = r34.getInputSizeshNQ4ISI;
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0517, code lost:
    
        if (r3 >= r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0519, code lost:
    
        r4 = r1.get(r3);
        r5 = r34.getHighResolutionOutputSizeshNQ4ISI.get(r4.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r5 = r5;
        r4.position((r5.getGetInputSizeshNQ4ISI() - r4.getMainAxisSizeWithSpacings()) + Camera2StreamConfigurationMap(r7, r4), r5.getCamera2StreamConfigurationMap(), r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0544, code lost:
    
        if (r32 == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0546, code lost:
    
        getHighSpeedVideoFpsRangesFor(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0549, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if ((r2 & 255) >= 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x054c, code lost:
    
        r1 = r34.getOutputFormats;
        kotlin.collections.CollectionsKt.reverse(r1);
        r2 = kotlin.Unit.INSTANCE;
        r38.addAll(0, r1);
        r38.addAll(r34.getInputSizeshNQ4ISI);
        r34.getInputFormats.clear();
        r34.getHighSpeedVideoSizesFor.clear();
        r34.getOutputFormats.clear();
        r34.getInputSizeshNQ4ISI.clear();
        r34.getOutputMinFrameDuration.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x057b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04ea, code lost:
    
        r8 = r36;
        r10 = r37;
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0440, code lost:
    
        r3 = r39;
        r33 = r1;
        r30 = r4;
        r31 = r5;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x045d, code lost:
    
        r3 = r39;
        r33 = r1;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0065, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0057, code lost:
    
        r11 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(r35 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0046, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r24 = r14;
        r23 = r15;
        r34.getOutputMinFrameDuration.add(r15[(r10 << 3) + r6]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        r2 = r2 >> 8;
        r6 = r6 + 1;
        r15 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r5 != 8) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r10 == r1) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r10 = r10 + 1;
        r15 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r1 = r8.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r2 >= r1) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        r5 = r4.get(r2);
        r34.getOutputMinFrameDuration.remove(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (getHighSpeedVideoSizes((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) r5) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        r6 = r34.getHighResolutionOutputSizeshNQ4ISI.get(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        if (r7 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        r8 = r7.getIndex(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r8 != (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
    
        if (r6 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        r6 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo(r34);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.getHighSpeedVideoSizes(r6, r5, r47, r48, r45, r46);
        r34.getHighResolutionOutputSizeshNQ4ISI.set(r5.getKey(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        if (r5.getIndex() == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        if (r8 == (-1)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        if (r8 >= r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        r34.getInputFormats.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0207, code lost:
    
        r2 = r2 + 1;
        r4 = r38;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r34.getHighSpeedVideoSizesFor.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        r14 = r5.mo1794getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        if (r5.isVertical() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0154, code lost:
    
        r3 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        getHighSpeedVideoSizes(r5, r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        if (r10 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r3 = r6.getGetHighSpeedVideoSizes();
        r5 = r3.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0168, code lost:
    
        if (r6 >= r5) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
    
        r8 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        if (r8 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        r8.animateAppearance();
        r8 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        r3 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
    
        if (r13 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.getHighSpeedVideoSizes(r6, r5, r47, r48, r45, r46);
        r3 = r6.getGetHighSpeedVideoSizes();
        r8 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        if (r14 >= r8) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
    
        r15 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0194, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r9 = r34.getHighSpeedVideoFpsRanges;
        r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0196, code lost:
    
        r24 = r8;
        r23 = r9;
        r44 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
    
        if (androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(r15.getRawOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1852getNotInitializednOccac()) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
    
        r15.m1851setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(r15.getRawOffset(), r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01be, code lost:
    
        r14 = r14 + 1;
        r3 = r44;
        r9 = r23;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b8, code lost:
    
        r44 = r3;
        r24 = r8;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c9, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r11 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r10 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r3 = r6.getGetHighSpeedVideoSizes();
        r4 = r3.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
    
        if (r6 >= r4) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d5, code lost:
    
        r8 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d7, code lost:
    
        if (r8 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        if (r8.isDisappearanceAnimationInProgress() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        r34.Camera2StreamConfigurationMap.remove(r8);
        r9 = r34.getHighSpeedVideoSizes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
    
        if (r9 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e8, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r9);
        r9 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r11 = r11.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, java.util.List<T> positionedItems, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap keyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext) {
        java.util.List<T> list = positionedItems;
        final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = keyIndexMap;
        java.util.List<T> list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (getHighSpeedVideoSizes((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) list.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                getHighSpeedVideoFpsRanges();
                return;
            }
        }
    }

    private final void getHighSpeedVideoSizes(java.lang.Object obj) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getHighSpeedVideoSizes;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(obj);
        if (remove == null || (getHighSpeedVideoSizes = remove.getGetHighSpeedVideoSizes()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation : getHighSpeedVideoSizes) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    public final void reset() {
        getHighSpeedVideoFpsRanges();
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = -1;
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isNotEmpty()) {
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation : ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) objArr[(i << 3) + i3]).getGetHighSpeedVideoSizes()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
        }
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo itemInfo = lazyLayoutItemAnimator.getHighResolutionOutputSizeshNQ4ISI.get(lazyLayoutMeasuredItem.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemInfo);
        getHighSpeedVideoSizes(lazyLayoutMeasuredItem, i, itemInfo);
    }

    private static void getHighSpeedVideoSizes(T t, int i, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        long m8725copyiSbpLlY$default;
        int i2 = 0;
        long mo1794getOffsetBjo55l4 = t.mo1794getOffsetBjo55l4(0);
        if (t.getIsVertical()) {
            m8725copyiSbpLlY$default = androidx.compose.ui.unit.IntOffset.m8725copyiSbpLlY$default(mo1794getOffsetBjo55l4, 0, i, 1, null);
        } else {
            m8725copyiSbpLlY$default = androidx.compose.ui.unit.IntOffset.m8725copyiSbpLlY$default(mo1794getOffsetBjo55l4, i, 0, 2, null);
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getHighSpeedVideoSizes = itemInfo.getGetHighSpeedVideoSizes();
        int length = getHighSpeedVideoSizes.length;
        int i3 = 0;
        while (i2 < length) {
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = getHighSpeedVideoSizes[i2];
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m1851setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8725copyiSbpLlY$default, androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(t.mo1794getOffsetBjo55l4(i3), mo1794getOffsetBjo55l4)));
            }
            i2++;
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(T t, boolean z) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.getHighResolutionOutputSizeshNQ4ISI.get(t.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemInfo);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getHighSpeedVideoSizes = itemInfo.getGetHighSpeedVideoSizes();
        int length = getHighSpeedVideoSizes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = getHighSpeedVideoSizes[i];
            if (lazyLayoutItemAnimation != null) {
                long mo1794getOffsetBjo55l4 = t.mo1794getOffsetBjo55l4(i2);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(rawOffset, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1852getNotInitializednOccac()) && !androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(rawOffset, mo1794getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m1844animatePlacementDeltaar5cAso(androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(mo1794getOffsetBjo55l4, rawOffset), z);
                }
                lazyLayoutItemAnimation.m1851setRawOffsetgyyYBs(mo1794getOffsetBjo55l4);
            }
            i++;
            i2++;
        }
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation getAnimation(java.lang.Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getHighSpeedVideoSizes;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.getHighResolutionOutputSizeshNQ4ISI.get(key);
        if (itemInfo == null || (getHighSpeedVideoSizes = itemInfo.getGetHighSpeedVideoSizes()) == null) {
            return null;
        }
        return getHighSpeedVideoSizes[placeableIndex];
    }

    private static int Camera2StreamConfigurationMap(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan();
        int i = 0;
        for (int i2 = lane; i2 < span + lane; i2++) {
            int mainAxisSizeWithSpacings = iArr[i2] + t.getMainAxisSizeWithSpacings();
            iArr[i2] = mainAxisSizeWithSpacings;
            i = java.lang.Math.max(i, mainAxisSizeWithSpacings);
        }
        return i;
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m1853getMinSizeToFitDisappearingItemsYbymL2g() {
        long m8777getZeroYbymL2g = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation> list = this.Camera2StreamConfigurationMap;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            androidx.compose.ui.graphics.layer.GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                m8777getZeroYbymL2g = androidx.compose.ui.unit.IntSize.m8767constructorimpl((java.lang.Math.max((int) (m8777getZeroYbymL2g & 4294967295L), androidx.compose.ui.unit.IntOffset.m8730getYimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() & 4294967295L))) & 4294967295L) | (java.lang.Math.max((int) (m8777getZeroYbymL2g >> 32), androidx.compose.ui.unit.IntOffset.m8729getXimpl(lazyLayoutItemAnimation.getRawOffset()) + ((int) (layer.getSize() >> 32))) << 32));
            }
        }
        return m8777getZeroYbymL2g;
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    private static boolean getHighSpeedVideoSizes(T t) {
        androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode Camera2StreamConfigurationMap;
        int placeablesCount = t.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimatorKt.Camera2StreamConfigurationMap(t.getParentData(i));
            if (Camera2StreamConfigurationMap != null) {
                return true;
            }
        }
        return false;
    }

    private static int getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo1794getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1794getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1794getOffsetBjo55l4) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1794getOffsetBjo55l4);
    }

    private static int getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo1794getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1794getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1794getOffsetBjo55l4) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1794getOffsetBjo55l4);
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010+R0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "lane", "getLane", "setLane", "span", "getSpan", "setSpan", "isRunningPlacement", "", "()Z", "layoutMinOffset", "getLayoutMinOffset", "layoutMaxOffset", "getLayoutMaxOffset", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ItemInfo {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private androidx.compose.ui.unit.Constraints getHighSpeedVideoFpsRangesFor;
        private androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;

        public ItemInfo() {
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            lazyLayoutItemAnimationArr = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimatorKt.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = lazyLayoutItemAnimationArr;
            this.getOutputFormats = 1;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final androidx.compose.ui.unit.Constraints getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final void getHighSpeedVideoSizes(int i) {
            this.getOutputFormats = i;
        }

        /* renamed from: getInputFormats, reason: from getter */
        public final int getGetOutputFormats() {
            return this.getOutputFormats;
        }

        private final boolean getOutputMinFrameDuration() {
            for (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation : this.getHighSpeedVideoSizes) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: getOutputFormats, reason: from getter */
        public final int getGetHighSpeedVideoSizesFor() {
            return this.getHighSpeedVideoSizesFor;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final int getGetInputSizeshNQ4ISI() {
            return this.getInputSizeshNQ4ISI;
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo itemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem lazyLayoutMeasuredItem, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, int i, int i2) {
            itemInfo.getHighSpeedVideoFpsRanges(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i, i2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.access$getCrossAxisOffset(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.this, lazyLayoutMeasuredItem));
        }

        public final void getHighSpeedVideoFpsRanges(T t, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, int i, int i2, int i3) {
            androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode Camera2StreamConfigurationMap;
            if (!getOutputMinFrameDuration()) {
                this.getHighSpeedVideoSizesFor = i;
                this.getInputSizeshNQ4ISI = i2;
            }
            int length = this.getHighSpeedVideoSizes.length;
            for (int placeablesCount = t.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = this.getHighSpeedVideoSizes[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.getHighSpeedVideoSizes.length != t.getPlaceablesCount()) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, t.getPlaceablesCount());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.getHighSpeedVideoSizes = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[]) copyOf;
            }
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Constraints.m8542boximpl(t.getConstraints());
            this.Camera2StreamConfigurationMap = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = t.getLane();
            this.getOutputFormats = t.getSpan();
            int placeablesCount2 = t.getPlaceablesCount();
            final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.this;
            for (int i4 = 0; i4 < placeablesCount2; i4++) {
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimatorKt.Camera2StreamConfigurationMap(t.getParentData(i4));
                if (Camera2StreamConfigurationMap == null) {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.getHighSpeedVideoSizes[i4];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.getHighSpeedVideoSizes[i4] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.getHighSpeedVideoSizes[i4];
                    if (lazyLayoutItemAnimation3 == null) {
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation4 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation(coroutineScope, graphicsContext, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit highSpeedVideoFpsRanges;
                                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.this);
                                return highSpeedVideoFpsRanges;
                            }
                        });
                        this.getHighSpeedVideoSizes[i4] = lazyLayoutItemAnimation4;
                        lazyLayoutItemAnimation3 = lazyLayoutItemAnimation4;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(Camera2StreamConfigurationMap.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(Camera2StreamConfigurationMap.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(Camera2StreamConfigurationMap.getFadeOutSpec());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            androidx.compose.ui.node.DrawModifierNode drawModifierNode = lazyLayoutItemAnimator.getHighSpeedVideoSizes;
            if (drawModifierNode != null) {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(drawModifierNode);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class DisplayingDisappearingItemsElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<?> getHighSpeedVideoSizes;

        public DisplayingDisappearingItemsElement(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.getHighSpeedVideoSizes = lazyLayoutItemAnimator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode getGetHighResolutionOutputSizeshNQ4ISI() {
            return new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode(this.getHighSpeedVideoSizes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public void update(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode p0) {
            p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayingDisappearingItemsElement(getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsElement) p0).getHighSpeedVideoSizes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onAttach", "()V", "onDetach", "getHighSpeedVideoFpsRangesFor", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class DisplayingDisappearingItemsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {
        private androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<?> getHighResolutionOutputSizeshNQ4ISI;

        public DisplayingDisappearingItemsNode(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.getHighResolutionOutputSizeshNQ4ISI = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            java.util.List list = ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation) list.get(i);
                androidx.compose.ui.graphics.layer.GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                    float m8729getXimpl2 = m8729getXimpl - androidx.compose.ui.unit.IntOffset.m8729getXimpl(layer.getTopLeft());
                    float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - androidx.compose.ui.unit.IntOffset.m8730getYimpl(layer.getTopLeft());
                    contentDrawScope2.getDrawContext().getTransform().translate(m8729getXimpl2, m8730getYimpl);
                    try {
                        androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                    } finally {
                        contentDrawScope2.getDrawContext().getTransform().translate(-m8729getXimpl2, -m8730getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onDetach() {
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<?> p0) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, p0) || !getNode().getIsAttached()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator) p0).getHighSpeedVideoSizes = this;
            this.getHighResolutionOutputSizeshNQ4ISI = p0;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayingDisappearingItemsNode(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode) p0).getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
