package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t28\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0000\u001a \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0000\u001a\u001f\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\u0010\"\u001a,\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0(H\u0000\u001a\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0000\u001a\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002\u001a&\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u0002060(2\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0000\u001a<\u00109\u001a\b\u0012\u0004\u0012\u0002040(2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060(2\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0000\u001a`\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0(26\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u000bH\u0000\u001aE\u0010@\u001a\u00020\u00012\b\u0010A\u001a\u0004\u0018\u00010>2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00162\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010E2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010F¨\u0006G²\u0006\f\u0010A\u001a\u0004\u0018\u00010>X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"PriceChart", "", "timeSeriesData", "Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle;", "accessibilityInfo", "Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "onDataPointSelect", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "timestamp", "", "price", "onSelectionClear", "Lkotlin/Function0;", "(Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/commonui/components/chart/PriceChartStyle;Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "blendWithBackground", "", "foreground", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "calculateLabelOffset", "touchXPx", "", "chartWidthPx", "textWidthPx", "calculateChartSplit", "Lcom/paypal/oslo/core/commonui/components/chart/ChartSplitResult;", "dataPointCount", "selectedIndex", "(ILjava/lang/Integer;)Lcom/paypal/oslo/core/commonui/components/chart/ChartSplitResult;", "extractSelectedDataPoint", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "entryX", "dataPoints", "", "handleChartTouchForScrollIntercept", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "createConfiguredChart", "Lcom/github/mikephil/charting/charts/LineChart;", "context", "Landroid/content/Context;", "createSolidDataSet", "Lcom/github/mikephil/charting/data/LineDataSet;", "entries", "Lcom/github/mikephil/charting/data/Entry;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "highlightColor", "buildPriceChartDataSets", "splitResult", "lineColor", "grayColor", "handleChartValueSelected", "Lcom/paypal/oslo/core/commonui/components/chart/ChartTouchState;", "highlightXPx", "ChartTouchOverlay", "touchState", "chartWidth", "textWidth", "onTextWidthMeasure", "Lkotlin/Function1;", "(Lcom/paypal/oslo/core/commonui/components/chart/ChartTouchState;IILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "common-ui_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PriceChartKt {
    public static final int blendWithBackground(int i, int i2) {
        float f = (i >>> 24) / 255.0f;
        float f2 = 1.0f - f;
        return ((int) (((i & 255) * f) + ((i2 & 255) * f2))) | (-16777216) | (((int) ((((i >> 16) & 255) * f) + (((i2 >> 16) & 255) * f2))) << 16) | (((int) ((((i >> 8) & 255) * f) + (((i2 >> 8) & 255) * f2))) << 8);
    }

    public static final int calculateLabelOffset(float f, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return 0;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = ((f / f2) * f2) - (f3 / 2.0f);
        if (f4 < 0.0f) {
            return 0;
        }
        return f3 + f4 > f2 ? i - i2 : (int) f4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 ??, still in use, count: 1, list:
          (r13v3 ?? I:java.lang.Object) from 0x0437: INVOKE (r14v0 ?? I:androidx.compose.runtime.Composer), (r13v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:715)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void PriceChart(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 ??, still in use, count: 1, list:
          (r13v3 ?? I:java.lang.Object) from 0x0437: INVOKE (r14v0 ?? I:androidx.compose.runtime.Composer), (r13v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:715)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final com.paypal.oslo.core.commonui.components.chart.ChartSplitResult calculateChartSplit(int i, java.lang.Integer num) {
        if (num != null && num.intValue() > 0 && num.intValue() < i) {
            return new com.paypal.oslo.core.commonui.components.chart.ChartSplitResult(num, new kotlin.ranges.IntRange(0, num.intValue()), kotlin.ranges.RangesKt.until(num.intValue(), i));
        }
        return new com.paypal.oslo.core.commonui.components.chart.ChartSplitResult(null, kotlin.ranges.RangesKt.until(0, i), null);
    }

    public static final kotlin.Pair<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint, java.lang.Integer> extractSelectedDataPoint(float f, java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        int i = (int) f;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return kotlin.TuplesKt.to(list.get(i), java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean handleChartTouchForScrollIntercept(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            android.view.ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        android.view.ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    public static final com.github.mikephil.charting.data.LineDataSet createSolidDataSet(java.util.List<? extends com.github.mikephil.charting.data.Entry> list, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.github.mikephil.charting.data.LineDataSet lineDataSet = new com.github.mikephil.charting.data.LineDataSet(list, "");
        lineDataSet.setColor(i);
        lineDataSet.setLineWidth(3.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setMode(com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.enableDashedHighlightLine(10.0f, 10.0f, 0.0f);
        lineDataSet.setHighLightColor(i2);
        lineDataSet.setHighlightLineWidth(1.0f);
        return lineDataSet;
    }

    public static final java.util.List<com.github.mikephil.charting.data.LineDataSet> buildPriceChartDataSets(java.util.List<? extends com.github.mikephil.charting.data.Entry> list, com.paypal.oslo.core.commonui.components.chart.ChartSplitResult chartSplitResult, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chartSplitResult, "");
        if (chartSplitResult.getAfterRange() != null) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.github.mikephil.charting.data.LineDataSet[]{createSolidDataSet(kotlin.collections.CollectionsKt.slice((java.util.List) list, chartSplitResult.getBeforeRange()), i, i3), createSolidDataSet(kotlin.collections.CollectionsKt.slice((java.util.List) list, chartSplitResult.getAfterRange()), i2, i3)});
        }
        return kotlin.collections.CollectionsKt.listOf(createSolidDataSet(list, i, i3));
    }

    public static final com.paypal.oslo.core.commonui.components.chart.ChartTouchState handleChartValueSelected(float f, float f2, java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Double, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.Pair<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint, java.lang.Integer> extractSelectedDataPoint = extractSelectedDataPoint(f, list);
        if (extractSelectedDataPoint == null) {
            return null;
        }
        com.paypal.oslo.core.commonui.components.chart.PriceDataPoint component1 = extractSelectedDataPoint.component1();
        int intValue = extractSelectedDataPoint.component2().intValue();
        function2.invoke(java.lang.Long.valueOf(component1.getTimestamp()), java.lang.Double.valueOf(component1.getPrice()));
        return new com.paypal.oslo.core.commonui.components.chart.ChartTouchState(f2, component1, intValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartTouchOverlay(final com.paypal.oslo.core.commonui.components.chart.ChartTouchState chartTouchState, final int i, final int i2, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1697838455);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(chartTouchState) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i4 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1697838455, i5, -1, "com.paypal.oslo.core.commonui.components.chart.ChartTouchOverlay (PriceChart.kt:570)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new java.text.SimpleDateFormat("MMM dd, yyyy, h:mm a", java.util.Locale.getDefault());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) rememberedValue;
                androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1726height3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (chartTouchState == null) {
                    startRestartGroup.startReplaceGroup(-1694612782);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.startReplaceGroup(-1694612781);
                    java.lang.String format = simpleDateFormat.format(new java.util.Date(chartTouchState.getDataPoint().getTimestamp()));
                    final int calculateLabelOffset = calculateLabelOffset(chartTouchState.getTouchXPx(), i, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(format);
                    com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null);
                    boolean changed = startRestartGroup.changed(calculateLabelOffset);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.chart.PriceChartKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.commonui.components.chart.PriceChartKt.$r8$lambda$K_JFu3v0cJ6FJjBvfRJGes94KQ4(calculateLabelOffset, (androidx.compose.ui.unit.Density) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(wrapContentSize$default, (kotlin.jvm.functions.Function1) rememberedValue2);
                    boolean z = (i5 & 7168) == 2048;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.chart.PriceChartKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.commonui.components.chart.PriceChartKt.$r8$lambda$n5bbqWUgMegG9_Z1he6oUDVywq4(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    modifier3 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(format, androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(offset, (kotlin.jvm.functions.Function1) rememberedValue3), contentMuted, null, null, null, false, 0, 0, null, bodySmall, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.chart.PriceChartKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.commonui.components.chart.PriceChartKt.$r8$lambda$WAAnDKkKWJKpATHI2Kb67uwSUlA(com.paypal.oslo.core.commonui.components.chart.ChartTouchState.this, i, i2, function1, modifier5, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FYRPz41i0iqKCUkU_M7RbP7HeLk(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.components.chart.PriceChartStyle priceChartStyle, com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PriceChart(timeSeriesData, modifier, priceChartStyle, priceChartAccessibilityInfo, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.unit.IntOffset $r8$lambda$K_JFu3v0cJ6FJjBvfRJGes94KQ4(int i, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(i << 32));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WAAnDKkKWJKpATHI2Kb67uwSUlA(com.paypal.oslo.core.commonui.components.chart.ChartTouchState chartTouchState, int i, int i2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        ChartTouchOverlay(chartTouchState, i, i2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.github.mikephil.charting.charts.LineChart $r8$lambda$WPB1GFx914fLp8EgejNNPWabKEQ(com.github.mikephil.charting.charts.LineChart lineChart, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return lineChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$cPlRH2FCoVFFid7MpHP3epMni_8(com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo, com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityHelper priceChartAccessibilityHelper, final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, int i, int i2, int i3, androidx.compose.runtime.MutableIntState mutableIntState, final android.view.accessibility.AccessibilityManager accessibilityManager, final kotlin.jvm.functions.Function2 function2, final androidx.compose.runtime.MutableState mutableState, final kotlin.jvm.functions.Function0 function0, final com.github.mikephil.charting.charts.LineChart lineChart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChart, "");
        mutableIntState.setIntValue(lineChart.getWidth());
        int i4 = 0;
        if (priceChartAccessibilityInfo != null) {
            priceChartAccessibilityHelper.setAccessibilityInfo(priceChartAccessibilityInfo);
            lineChart.setContentDescription(priceChartAccessibilityInfo.getChartSummaryDescription());
            lineChart.setImportantForAccessibility(1);
        } else {
            priceChartAccessibilityHelper.setAccessibilityInfo(null);
            lineChart.setContentDescription(null);
            lineChart.setImportantForAccessibility(0);
        }
        lineChart.setOnChartValueSelectedListener(new com.github.mikephil.charting.listener.OnChartValueSelectedListener() { // from class: com.paypal.oslo.core.commonui.components.chart.PriceChartKt$PriceChart$4$4$1$1
            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public final void onValueSelected(com.github.mikephil.charting.data.Entry e, com.github.mikephil.charting.highlight.Highlight h) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "");
                android.view.accessibility.AccessibilityManager accessibilityManager2 = accessibilityManager;
                if (accessibilityManager2 == null || !accessibilityManager2.isTouchExplorationEnabled()) {
                    mutableState.setValue(com.paypal.oslo.core.commonui.components.chart.PriceChartKt.handleChartValueSelected(e.getX(), h.getXPx(), timeSeriesData.getDataPoints(), function2));
                }
            }

            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public final void onNothingSelected() {
                mutableState.setValue(null);
                function0.invoke();
            }
        });
        lineChart.setOnChartGestureListener(new com.paypal.oslo.core.commonui.components.chart.SimpleOnChartGestureListener() { // from class: com.paypal.oslo.core.commonui.components.chart.PriceChartKt$PriceChart$4$4$1$2
            @Override // com.paypal.oslo.core.commonui.components.chart.SimpleOnChartGestureListener, com.github.mikephil.charting.listener.OnChartGestureListener
            public final void onChartGestureEnd(android.view.MotionEvent me, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastGesture) {
                mutableState.setValue(null);
                com.github.mikephil.charting.charts.LineChart.this.highlightValue(null);
                function0.invoke();
            }
        });
        androidx.compose.runtime.MutableState mutableState2 = mutableState;
        if (((com.paypal.oslo.core.commonui.components.chart.ChartTouchState) mutableState2.getValue()) == null) {
            lineChart.highlightValue(null);
        }
        java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> dataPoints = timeSeriesData.getDataPoints();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dataPoints, 10));
        for (java.lang.Object obj : dataPoints) {
            if (i4 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new com.github.mikephil.charting.data.Entry(i4, (float) ((com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) obj).getPrice()));
            i4++;
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        com.paypal.oslo.core.commonui.components.chart.ChartTouchState chartTouchState = (com.paypal.oslo.core.commonui.components.chart.ChartTouchState) mutableState2.getValue();
        lineChart.setData(new com.github.mikephil.charting.data.LineData(buildPriceChartDataSets(arrayList2, calculateChartSplit(size, chartTouchState != null ? java.lang.Integer.valueOf(chartTouchState.getDataPointIndex()) : null), i, i2, i3)));
        lineChart.invalidate();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cpeMmmxXAYRZ2KQ0aWLSUhiYcWQ(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n5bbqWUgMegG9_Z1he6oUDVywq4(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        function1.invoke(java.lang.Integer.valueOf((int) (layoutCoordinates.mo7361getSizeYbymL2g() >> 32)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z_zfZOFjhpMsbi1P4D1iBFROs3U(androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        mutableIntState.setIntValue((int) (layoutCoordinates.mo7361getSizeYbymL2g() >> 32));
        return kotlin.Unit.INSTANCE;
    }
}
