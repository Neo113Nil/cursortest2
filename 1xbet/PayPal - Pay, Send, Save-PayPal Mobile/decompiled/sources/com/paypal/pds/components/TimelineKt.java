package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0007\u001a+\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0001¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0001¢\u0006\u0004\b$\u0010\"\u001a-\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010*\u001a5\u0010+\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0003¢\u0006\u0002\u0010/\u001a'\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u00103\u001a\u00020.H\u0001¢\u0006\u0002\u00104\u001a5\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0003¢\u0006\u0002\u00109\u001ak\u0010:\u001a\u00020\u0001*\u00020;2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0002\b\u0003\u0018\u00010>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0002\b\u0003\u0018\u00010>2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0003¢\u0006\u0002\u0010@\u001aZ\u0010A\u001a\u00020\u00012\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010C2\u0013\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010)¢\u0006\u0002\bG2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0004\bL\u0010M\u001a;\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u0002072\u0006\u0010&\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010CH\u0003¢\u0006\u0002\u0010P\u001a\r\u0010U\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010V\u001a\r\u0010W\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010V\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u00178\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u001a\"\u000e\u0010Q\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u000207X\u0080T¢\u0006\u0002\n\u0000*8\b\u0007\u0010\r\"\u00020\u00042\u00020\u0004B*\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u001c\b\u0011\u0012\u0018\b\u000bB\u0014\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\b\u0015\u0012\u0002\b\f¨\u0006X²\u0006\u0010\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010)X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u00020.X\u008a\u008e\u0002²\u0006\u0010\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010)X\u008a\u0084\u0002²\u0006\n\u0010[\u001a\u00020.X\u008a\u008e\u0002²\u0006\n\u0010\\\u001a\u00020.X\u008a\u008e\u0002²\u0006\u0010\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010)X\u008a\u0084\u0002²\u0006\n\u0010\\\u001a\u00020.X\u008a\u008e\u0002"}, d2 = {"Timeline", "", "items", "", "Lcom/paypal/pds/components/TimelineVerticalItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "timelineItems", "stub", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/Unit;Landroidx/compose/runtime/Composer;II)V", "Lcom/paypal/pds/components/TimelineHorizontalItem;", "TimelineHorizontal", com.paypal.pds.components.TimelineKt.TimelineItemTag, "Lkotlin/Deprecated;", "message", "Renamed to TimelineVerticalItem", "replaceWith", "Lkotlin/ReplaceWith;", "expression", "TimelineVerticalItem", "imports", "ScaleDown", "", "TrackProgressMidpoint", "getTrackProgressMidpoint$annotations", "()V", "drawVerticalTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "baseColor", "Landroidx/compose/ui/graphics/Color;", "fillColor", "fillFraction", "drawVerticalTrack-IbeAmgk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJF)V", "drawHorizontalTrack", "drawHorizontalTrack-IbeAmgk", "AnimatedTimelineIndicator", "state", "Lcom/paypal/pds/components/TimelineState;", "onAnimationComplete", "Lkotlin/Function0;", "(Lcom/paypal/pds/components/TimelineState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedTimelineTrack", "nextItem", "startFillAnimation", "", "(Lcom/paypal/pds/components/TimelineState;Lcom/paypal/pds/components/TimelineVerticalItem;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "horizontalTrackFraction", "isAlert", "progress", "isRightHalf", "(ZLjava/lang/Float;Z)F", "TimelineVerticalView", "index", "", "currentItem", "(ILcom/paypal/pds/components/TimelineVerticalItem;Lcom/paypal/pds/components/TimelineVerticalItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TimelineHorizontalView", "Landroidx/compose/foundation/layout/RowScope;", "prevItem", "leftTrackProgress", "Landroidx/compose/animation/core/Animatable;", "rightTrackProgress", "(Landroidx/compose/foundation/layout/RowScope;ILcom/paypal/pds/components/TimelineHorizontalItem;Lcom/paypal/pds/components/TimelineHorizontalItem;Lcom/paypal/pds/components/TimelineHorizontalItem;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ItemLabels", "title", "", "subtitle", "metadata", "bottomSlot", "Landroidx/compose/runtime/Composable;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "ItemLabels-3FUbxFQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "toContentDescription", "step", "(ILcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "TimelineRootTag", "TimelineItemTag", "TimelineItemLabelTag", "TimelineHorizontalLimit", "TimelinePreview", "(Landroidx/compose/runtime/Composer;I)V", "TimelineHorizontalPreview", "pds_release", "currentOnAnimationComplete", "displayedState", "hasRendered", "startTrackFill"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimelineKt {
    public static final int TimelineHorizontalLimit = 5;
    public static final java.lang.String TimelineItemLabelTag = "TimelineItemLabel";
    public static final java.lang.String TimelineItemTag = "TimelineItem";
    public static final java.lang.String TimelineRootTag = "TimelineRoot";
    public static final float TrackProgressMidpoint = 0.5f;

    @kotlin.Deprecated(message = "Renamed to TimelineVerticalItem", replaceWith = @kotlin.ReplaceWith(expression = "TimelineVerticalItem", imports = {}))
    public static /* synthetic */ void TimelineItem$annotations() {
    }

    public static /* synthetic */ void getTrackProgressMidpoint$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Timeline(final java.util.List<com.paypal.pds.components.TimelineVerticalItem> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(27082768);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(27082768, i3, -1, "com.paypal.pds.components.Timeline (Timeline.kt:99)");
                }
                boolean changed = startRestartGroup.changed(list.size());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                    obj = rememberedValue;
                }
                androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                java.util.List<com.paypal.pds.components.TimelineVerticalItem> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.paypal.pds.components.TimelineVerticalItem) it.next()).getState());
                }
                mutableStateListOf.addAll(arrayList);
                startRestartGroup.updateRememberedValue(mutableStateListOf);
                obj = mutableStateListOf;
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                java.util.List<com.paypal.pds.components.TimelineVerticalItem> list3 = list;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((com.paypal.pds.components.TimelineVerticalItem) it2.next()).getState());
                }
                java.util.ArrayList arrayList3 = arrayList2;
                boolean changedInstance = startRestartGroup.changedInstance(arrayList3);
                boolean changed2 = startRestartGroup.changed(snapshotStateList);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.TimelineKt$Timeline$1$1(arrayList3, snapshotStateList2, snapshotStateList, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(arrayList3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier3), TimelineRootTag);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-2057872709);
                int i5 = 0;
                for (java.lang.Object obj2 : list3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.pds.components.TimelineVerticalItem copy$default = com.paypal.pds.components.TimelineVerticalItem.copy$default(list.get(i5), null, (com.paypal.pds.components.TimelineState) snapshotStateList.get(i5), null, null, null, null, 61, null);
                    com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem = (com.paypal.pds.components.TimelineVerticalItem) kotlin.collections.CollectionsKt.getOrNull(list, i6);
                    com.paypal.pds.components.TimelineVerticalItem copy$default2 = timelineVerticalItem != null ? com.paypal.pds.components.TimelineVerticalItem.copy$default(timelineVerticalItem, null, (com.paypal.pds.components.TimelineState) snapshotStateList.get(i6), null, null, null, null, 61, null) : null;
                    boolean changed3 = startRestartGroup.changed(snapshotStateList);
                    boolean changedInstance2 = startRestartGroup.changedInstance(list);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changed3 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.pds.components.TimelineKt.$r8$lambda$ySfnynN2zbGpwOm7P9DTgU4KktM(androidx.compose.runtime.snapshots.SnapshotStateList.this, snapshotStateList, list);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    Camera2StreamConfigurationMap(i5, copy$default, copy$default2, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                    i5 = i6;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$pE3ECctgDP046zFNQxpbK4bIJ9Q(list, modifier3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @kotlin.Deprecated(message = "Use Timeline(items = ...) instead", replaceWith = @kotlin.ReplaceWith(expression = "Timeline(modifier = modifier, items = timelineItems)", imports = {}))
    public static final void Timeline(final java.util.List<com.paypal.pds.components.TimelineVerticalItem> list, androidx.compose.ui.Modifier modifier, kotlin.Unit unit, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1032871928);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if ((i2 & 4) != 0) {
                unit = kotlin.Unit.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1032871928, i3, -1, "com.paypal.pds.components.Timeline (Timeline.kt:168)");
            }
            Timeline(list, modifier, startRestartGroup, i3 & 126, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.Unit unit2 = unit;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.$r8$lambda$0LvCKNs2xcdnvWsYCPHRJH2ALLM(list, modifier2, unit2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineHorizontal(final java.util.List<com.paypal.pds.components.TimelineHorizontalItem> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(27082768);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(27082768, i3, -1, "com.paypal.pds.components.Timeline (Timeline.kt:198)");
                }
                final java.util.List take = kotlin.collections.CollectionsKt.take(list, 5);
                boolean changed = startRestartGroup.changed(take.size());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                    obj = rememberedValue;
                }
                androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                java.util.List list2 = take;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.paypal.pds.components.TimelineHorizontalItem) it.next()).getState());
                }
                mutableStateListOf.addAll(arrayList);
                startRestartGroup.updateRememberedValue(mutableStateListOf);
                obj = mutableStateListOf;
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                int max = java.lang.Math.max(take.size() - 1, 0);
                boolean changed2 = startRestartGroup.changed(max);
                java.util.ArrayList rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(max);
                    for (int i5 = 0; i5 < max; i5++) {
                        arrayList2.add(androidx.compose.animation.core.AnimatableKt.Animatable$default(kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.TimelineHorizontalItem) take.get(i5)).getState(), com.paypal.pds.components.TimelineState.Success.INSTANCE) ? 1.0f : 0.0f, 0.0f, 2, null));
                    }
                    rememberedValue3 = arrayList2;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                java.util.List list3 = (java.util.List) rememberedValue3;
                java.util.List list4 = take;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                java.util.Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((com.paypal.pds.components.TimelineHorizontalItem) it2.next()).getState());
                }
                java.util.ArrayList arrayList4 = arrayList3;
                boolean changedInstance = startRestartGroup.changedInstance(arrayList4);
                boolean changed3 = startRestartGroup.changed(snapshotStateList);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.pds.components.TimelineKt$Timeline$5$1(arrayList4, snapshotStateList2, snapshotStateList, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(arrayList4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier3), TimelineRootTag);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(986298945);
                int i6 = 0;
                for (java.lang.Object obj2 : list4) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.pds.components.TimelineHorizontalItem copy$default = com.paypal.pds.components.TimelineHorizontalItem.copy$default((com.paypal.pds.components.TimelineHorizontalItem) take.get(i6), (com.paypal.pds.components.TimelineState) snapshotStateList.get(i6), null, null, null, null, 30, null);
                    int i8 = i6 - 1;
                    com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem = (com.paypal.pds.components.TimelineHorizontalItem) kotlin.collections.CollectionsKt.getOrNull(take, i8);
                    com.paypal.pds.components.TimelineHorizontalItem copy$default2 = timelineHorizontalItem != null ? com.paypal.pds.components.TimelineHorizontalItem.copy$default(timelineHorizontalItem, (com.paypal.pds.components.TimelineState) snapshotStateList.get(i8), null, null, null, null, 30, null) : null;
                    com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem2 = (com.paypal.pds.components.TimelineHorizontalItem) kotlin.collections.CollectionsKt.getOrNull(take, i7);
                    com.paypal.pds.components.TimelineHorizontalItem copy$default3 = timelineHorizontalItem2 != null ? com.paypal.pds.components.TimelineHorizontalItem.copy$default(timelineHorizontalItem2, (com.paypal.pds.components.TimelineState) snapshotStateList.get(i7), null, null, null, null, 30, null) : null;
                    androidx.compose.animation.core.Animatable animatable = i6 > 0 ? (androidx.compose.animation.core.Animatable) list3.get(i8) : null;
                    androidx.compose.animation.core.Animatable animatable2 = i6 < max ? (androidx.compose.animation.core.Animatable) list3.get(i6) : null;
                    boolean changed4 = startRestartGroup.changed(snapshotStateList);
                    boolean changedInstance2 = startRestartGroup.changedInstance(take);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((changed4 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.pds.components.TimelineKt.m22079$r8$lambda$mefj32QycNVCbQxvo7jnuhCbjE(androidx.compose.runtime.snapshots.SnapshotStateList.this, snapshotStateList, take);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    getHighResolutionOutputSizeshNQ4ISI(rowScopeInstance, i6, copy$default, copy$default2, copy$default3, animatable, animatable2, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, (androidx.compose.animation.core.Animatable.$stable << 15) | 6 | (androidx.compose.animation.core.Animatable.$stable << 18));
                    max = max;
                    snapshotStateList2 = snapshotStateList2;
                    i6 = i7;
                    snapshotStateList = snapshotStateList;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$hC3t_gouq6sve9l6SRzoC4eYlSo(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: drawVerticalTrack-IbeAmgk, reason: not valid java name */
    public static final void m22082drawVerticalTrackIbeAmgk(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f) {
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, j, 0L, 0L, 0.0f, null, null, 0, 126, null);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat2, intBitsToFloat * f, m5985getIntersectrtfAjoo);
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, 0.0f, null, null, 0, 126, null);
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            } catch (java.lang.Throwable th) {
                th = th;
                j3 = mo6453getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(j3);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            j3 = mo6453getSizeNHjbRc;
        }
    }

    /* renamed from: drawHorizontalTrack-IbeAmgk, reason: not valid java name */
    public static final void m22081drawHorizontalTrackIbeAmgk(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, float f) {
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, j, 0L, 0L, 0.0f, null, null, 0, 126, null);
        if (f > 0.0f) {
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
            int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
            long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat * f, intBitsToFloat2, m5985getIntersectrtfAjoo);
            } catch (java.lang.Throwable th) {
                th = th;
                j3 = mo6453getSizeNHjbRc;
            }
            try {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, 0.0f, null, null, 0, 126, null);
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            } catch (java.lang.Throwable th2) {
                th = th2;
                j3 = mo6453getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(j3);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.pds.components.TimelineState timelineState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(679511574);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(timelineState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(679511574, i3, -1, "com.paypal.pds.components.AnimatedTimelineIndicator (Timeline.kt:473)");
                }
                androidx.compose.animation.core.Easing easingStandardOut = com.paypal.pds.core.MotionEasingKt.easingStandardOut(startRestartGroup, 0);
                androidx.compose.animation.core.Easing easingStandardIn = com.paypal.pds.core.MotionEasingKt.easingStandardIn(startRestartGroup, 0);
                androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 3) & 14);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(timelineState, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.animation.core.AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                boolean changedInstance = startRestartGroup.changedInstance(animatable);
                boolean changed = startRestartGroup.changed(easingStandardOut);
                int i6 = i3 & 14;
                boolean z = i6 == 4;
                boolean changed2 = startRestartGroup.changed(easingStandardIn);
                boolean changed3 = startRestartGroup.changed(rememberUpdatedState);
                com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (((changedInstance | changed | z | changed2) || changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = i6;
                    rememberedValue4 = new com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1(animatable, easingStandardOut, timelineState, easingStandardIn, mutableState2, mutableState, rememberUpdatedState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i4 = i6;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(timelineState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i4);
                boolean changedInstance2 = startRestartGroup.changedInstance(animatable);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.TimelineKt.$r8$lambda$4ihY3hw7WbYTP1sKCkho9f_6rm0(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier4, (kotlin.jvm.functions.Function1) rememberedValue5);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
                androidx.compose.runtime.MutableState mutableState3 = mutableState;
                com.paypal.pds.components.IconKt.Icon(((com.paypal.pds.components.TimelineState) mutableState3.getValue()).getIcon(), null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, ((com.paypal.pds.components.TimelineState) mutableState3.getValue()).getIconTint(), startRestartGroup, 3120, 4);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.TimelineKt.m22074$r8$lambda$C191hcAyUyT2vVjoOc89FswKmg(com.paypal.pds.components.TimelineState.this, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.pds.components.TimelineState timelineState, final com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.pds.core.Color.BorderUtilityEmphasis borderUtilityEmphasis;
        long value;
        long j;
        androidx.compose.animation.core.Animatable animatable;
        int i3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-219064959);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(timelineState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timelineVerticalItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-219064959, i5, -1, "com.paypal.pds.components.AnimatedTimelineTrack (Timeline.kt:546)");
            }
            androidx.compose.animation.core.Easing easingStandardInOut = com.paypal.pds.core.MotionEasingKt.easingStandardInOut(startRestartGroup, 0);
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i5 >> 9) & 14);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimatableKt.Animatable$default(kotlin.jvm.internal.Intrinsics.areEqual(timelineState, com.paypal.pds.components.TimelineState.Success.INSTANCE) ? 1.0f : 0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.animation.core.Animatable animatable2 = (androidx.compose.animation.core.Animatable) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            boolean z2 = (timelineVerticalItem != null ? timelineVerticalItem.getState() : null) instanceof com.paypal.pds.components.TimelineState.Alert;
            if (timelineVerticalItem == null) {
                borderUtilityEmphasis = com.paypal.pds.core.Color.Transparent.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(timelineState, com.paypal.pds.components.TimelineState.Success.INSTANCE) || z2) {
                borderUtilityEmphasis = com.paypal.pds.core.Color.BorderUtilityEmphasis.INSTANCE;
            } else {
                borderUtilityEmphasis = com.paypal.pds.core.Color.BorderBase.INSTANCE;
            }
            if (z2 && !kotlin.jvm.internal.Intrinsics.areEqual(timelineState, com.paypal.pds.components.TimelineState.Success.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-2107721680);
                value = com.paypal.pds.core.Color.BorderUtilityEmphasis.INSTANCE.getValue(startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2107667461);
                value = com.paypal.pds.core.Color.BorderBase.INSTANCE.getValue(startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            final long j2 = value;
            long value2 = borderUtilityEmphasis.getValue(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(animatable2);
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            boolean z4 = (i5 & 896) == 256;
            boolean changed = startRestartGroup.changed(easingStandardInOut);
            boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
            com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (((z3 | changedInstance | z4 | changed) || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                j = value2;
                animatable = animatable2;
                i3 = i6;
                i4 = 0;
                rememberedValue3 = new com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1(animatable2, timelineState, z, mutableState, easingStandardInOut, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i6;
                animatable = animatable2;
                j = value2;
                i4 = 0;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(timelineState, java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i5 >> 3) & 112) | i3);
            if (timelineVerticalItem == null) {
                startRestartGroup.startReplaceGroup(-2106059243);
                androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize2()), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.Transparent.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, i4);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2105875351);
                androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize2()), 0.0f, 1, null);
                boolean changed3 = startRestartGroup.changed(j2);
                final long j3 = j;
                boolean changed4 = startRestartGroup.changed(j3);
                boolean changedInstance2 = startRestartGroup.changedInstance(animatable);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changed3 | changed4 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final androidx.compose.animation.core.Animatable animatable3 = animatable;
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.TimelineKt.$r8$lambda$5R4jaZuFDOpFMBC69OT5AHLsa5E(j2, j3, animatable3, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(fillMaxHeight$default, (kotlin.jvm.functions.Function1) rememberedValue4), startRestartGroup, i4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.$r8$lambda$PXvF6kD7VoYIiNgix87PK_4Y0I0(com.paypal.pds.components.TimelineState.this, timelineVerticalItem, z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float horizontalTrackFraction(boolean z, java.lang.Float f, boolean z2) {
        if (z) {
            return 1.0f;
        }
        if (f != null && z2) {
            return kotlin.ranges.RangesKt.coerceIn(f.floatValue() / 0.5f, 0.0f, 1.0f);
        }
        if (f != null) {
            return kotlin.ranges.RangesKt.coerceIn((f.floatValue() - 0.5f) / 0.5f, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void Camera2StreamConfigurationMap(final int i, final com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem, final com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(348535073);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(timelineVerticalItem) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(timelineVerticalItem2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(348535073, i3, -1, "com.paypal.pds.components.TimelineVerticalView (Timeline.kt:656)");
            }
            com.paypal.pds.components.TimelineState state = timelineVerticalItem.getState();
            final java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, state, timelineVerticalItem.getTitle(), timelineVerticalItem.getSubtitle(), timelineVerticalItem.getMetadata(), startRestartGroup, i3 & 14);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            com.paypal.pds.components.TimelineKt$TimelineVerticalView$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.TimelineKt$TimelineVerticalView$1$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(state, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.IntrinsicKt.height(timelineVerticalItem.getAnalyticsScope().getModifier(), androidx.compose.foundation.layout.IntrinsicSize.Max), TimelineItemTag.concat(java.lang.String.valueOf(i)));
            boolean changed = startRestartGroup.changed(Camera2StreamConfigurationMap);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$Rs9PGpHW9IF5jZa_xT7wliHVCUg(Camera2StreamConfigurationMap, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(testTag, true, (kotlin.jvm.functions.Function1) rememberedValue3);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 10, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$z4kJhsq6GATLJT6eSnAEaa0AA94(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRangesFor(state, (kotlin.jvm.functions.Function0) rememberedValue4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 5, null), startRestartGroup, 432, 0);
            getHighSpeedVideoFpsRanges(state, timelineVerticalItem2, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), function0, startRestartGroup, ((i3 >> 3) & 112) | (i3 & 7168));
            startRestartGroup.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 6);
            getHighSpeedVideoSizes(timelineVerticalItem.getTitle(), timelineVerticalItem.getSubtitle(), timelineVerticalItem.getMetadata(), timelineVerticalItem.getBottomSlot(), androidx.compose.ui.Alignment.INSTANCE.getStart(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing28(), 7, null), startRestartGroup, 1597440);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.m22077$r8$lambda$OHTzuuvGtDDla0i3XAkvqSsY4s(i, timelineVerticalItem, timelineVerticalItem2, function0, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.layout.RowScope rowScope, final int i, final com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, final com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem2, final com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem3, final androidx.compose.animation.core.Animatable<java.lang.Float, ?> animatable, final androidx.compose.animation.core.Animatable<java.lang.Float, ?> animatable2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        boolean z;
        int i5;
        final java.lang.String str;
        java.lang.Object[] objArr;
        androidx.compose.runtime.MutableState mutableState;
        int i6;
        boolean z2;
        int i7;
        long j;
        int i8;
        int i9;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1186499229);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(timelineHorizontalItem) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(timelineHorizontalItem2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(timelineHorizontalItem3) ? 16384 : 8192;
        }
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= (i2 & 262144) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= (i2 & 2097152) == 0 ? startRestartGroup.changed(animatable2) : startRestartGroup.changedInstance(animatable2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1186499229, i3, -1, "com.paypal.pds.components.TimelineHorizontalView (Timeline.kt:721)");
            }
            androidx.compose.animation.core.Easing easingStandardInOut = com.paypal.pds.core.MotionEasingKt.easingStandardInOut(startRestartGroup, 0);
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 21) & 14);
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, timelineHorizontalItem.getState(), timelineHorizontalItem.getTitle(), timelineHorizontalItem.getSubtitle(), timelineHorizontalItem.getMetadata(), startRestartGroup, (i3 >> 3) & 14);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            com.paypal.pds.components.TimelineState state = timelineHorizontalItem.getState();
            int i10 = i3 & 896;
            boolean z3 = i10 == 256;
            int i11 = i3 & 3670016;
            boolean z4 = i11 == 1048576 || ((i3 & 2097152) != 0 && startRestartGroup.changedInstance(animatable2));
            com.paypal.pds.components.TimelineKt$TimelineHorizontalView$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z3 | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.TimelineKt$TimelineHorizontalView$1$1(timelineHorizontalItem, animatable2, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(state, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            if (i11 == 1048576 || ((i3 & 2097152) != 0 && startRestartGroup.changedInstance(animatable2))) {
                i4 = 256;
                z = true;
            } else {
                z = false;
                i4 = 256;
            }
            boolean z5 = i10 == i4;
            boolean changed = startRestartGroup.changed(easingStandardInOut);
            boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
            com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (((z5 | z | changed) || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i5 = i3;
                str = Camera2StreamConfigurationMap;
                objArr = 1048576;
                mutableState = mutableState2;
                i6 = 0;
                rememberedValue3 = new com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1(animatable2, timelineHorizontalItem, mutableState2, easingStandardInOut, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i5 = i3;
                objArr = 1048576;
                mutableState = mutableState2;
                str = Camera2StreamConfigurationMap;
                i6 = 0;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i6);
            final long value = com.paypal.pds.core.Color.BorderBase.INSTANCE.getValue(startRestartGroup, 6);
            final long value2 = com.paypal.pds.core.Color.BorderUtilityEmphasis.INSTANCE.getValue(startRestartGroup, 6);
            final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(timelineHorizontalItem.getState(), com.paypal.pds.components.TimelineState.Alert.INSTANCE);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScope, timelineHorizontalItem.getAnalyticsScope().getModifier(), 1.0f, false, 2, null), TimelineItemTag.concat(java.lang.String.valueOf(i)));
            boolean changed3 = startRestartGroup.changed(str);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$MfJP0gFlkAa5qkFxGG66_ZFF_78(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(testTag, true, (kotlin.jvm.functions.Function1) rememberedValue4);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSize2());
            boolean z6 = (i5 & 7168) == 2048;
            boolean changed4 = startRestartGroup.changed(value);
            boolean changed5 = startRestartGroup.changed(value2);
            boolean changed6 = startRestartGroup.changed(areEqual);
            boolean z7 = (458752 & i5) == 131072 || ((i5 & 262144) != 0 && startRestartGroup.changedInstance(animatable));
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (((z6 | changed4 | changed5 | changed6) || z7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                z2 = true;
                i7 = i5;
                composer2 = startRestartGroup;
                j = value;
                i8 = 0;
                i9 = i11;
                obj = animatable2;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$ZE4t3efLah3IKcr5OTfjYDjFm34(com.paypal.pds.components.TimelineHorizontalItem.this, value, value2, areEqual, animatable, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                    }
                };
                composer2.updateRememberedValue(function1);
                rememberedValue5 = function1;
            } else {
                j = value;
                i7 = i5;
                composer2 = startRestartGroup;
                obj = animatable2;
                i9 = i11;
                i8 = 0;
                z2 = true;
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1726height3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue5), composer2, i8);
            com.paypal.pds.components.TimelineState state2 = timelineHorizontalItem.getState();
            java.lang.Object rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final androidx.compose.runtime.MutableState mutableState3 = mutableState;
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$Z7BXpobbIFSW4Tbqn3xQfDa5nec(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            java.lang.Object obj2 = obj;
            final long j2 = j;
            int i12 = i8;
            getHighSpeedVideoFpsRangesFor(state2, (kotlin.jvm.functions.Function0) rememberedValue6, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 10, null), composer2, 432, 0);
            androidx.compose.ui.Modifier m1726height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSize2());
            boolean z8 = (i7 & 57344) == 16384 ? z2 : i12 == true ? 1 : 0;
            boolean changed7 = composer2.changed(j2);
            boolean changed8 = composer2.changed(value2);
            if (i9 != 1048576 && ((i7 & 2097152) == 0 || !composer2.changedInstance(obj2))) {
                z2 = i12 == true ? 1 : 0;
            }
            java.lang.Object rememberedValue7 = composer2.rememberedValue();
            if ((changed7 | z8 | changed8 | z2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.pds.components.TimelineKt.$r8$lambda$_p22mksze1zEj1KQL48sPX8ER84(com.paypal.pds.components.TimelineHorizontalItem.this, j2, value2, animatable2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj3);
                    }
                };
                composer2.updateRememberedValue(function12);
                rememberedValue7 = function12;
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1726height3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue7), composer2, i12 == true ? 1 : 0);
            composer2.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 6);
            getHighSpeedVideoSizes(timelineHorizontalItem.getTitle(), timelineHorizontalItem.getSubtitle(), timelineHorizontalItem.getMetadata(), null, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 10, null), composer2, 1600512);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.pds.components.TimelineKt.$r8$lambda$EzFqpMZ_xokKqOplwlPY0TO8EsU(androidx.compose.foundation.layout.RowScope.this, i, timelineHorizontalItem, timelineHorizontalItem2, timelineHorizontalItem3, animatable, animatable2, function0, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final androidx.compose.ui.Alignment.Horizontal horizontal, final int i, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        androidx.compose.runtime.Composer composer3;
        int i5;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1870771555);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(horizontal) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i6 = i3;
        if (!startRestartGroup.shouldExecute((599187 & i6) != 599186, i6 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1870771555, i6, -1, "com.paypal.pds.components.ItemLabels (Timeline.kt:849)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier, TimelineItemLabelTag);
            int i7 = i6 >> 6;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), horizontal, startRestartGroup, ((i7 & 896) >> 3) & 112);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (str != null) {
                startRestartGroup.startReplaceGroup(398128323);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.TimelineKt.$r8$lambda$xBcIsEfMjyuTsbUKl81dk_2EVjU((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                i4 = i6;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(i), null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, (i6 & 14) | 384 | ((i6 >> 3) & 57344), 6, 1000);
                startRestartGroup.endReplaceGroup();
                composer3 = startRestartGroup;
            } else {
                i4 = i6;
                composer3 = startRestartGroup;
                composer3.startReplaceGroup(398420777);
                composer3.endReplaceGroup();
            }
            if (str2 != null) {
                composer3.startReplaceGroup(398474655);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.TimelineKt.$r8$lambda$iC12TyZxsS7OxH7rahoPUQBR_HQ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue2);
                }
                int i8 = i4 >> 3;
                androidx.compose.runtime.Composer composer4 = composer3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(i), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer3, (i8 & 14) | 384 | (i8 & 57344), 6, 1000);
                composer4.endReplaceGroup();
                composer3 = composer4;
            } else {
                composer3.startReplaceGroup(398770953);
                composer3.endReplaceGroup();
            }
            if (str3 != null) {
                composer3.startReplaceGroup(398827094);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing2(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue3 = composer3.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.TimelineKt.m22080$r8$lambda$rZomeXtBOujFHq0kd2ihA0RhM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                i5 = 0;
                androidx.compose.runtime.Composer composer5 = composer3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(i), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer3, (i7 & 14) | 384 | ((i4 >> 3) & 57344), 6, 1000);
                composer5.endReplaceGroup();
                function22 = function2;
                composer2 = composer5;
            } else {
                i5 = 0;
                composer2 = composer3;
                composer2.startReplaceGroup(399193545);
                composer2.endReplaceGroup();
                function22 = function2;
            }
            if (function22 == null) {
                composer2.startReplaceGroup(399217445);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(399217446);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 6);
                function22.invoke(composer2, java.lang.Integer.valueOf(i5));
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.m22075$r8$lambda$DplOGT168E2neBWxyFOJl5c9NY(str, str2, str3, function2, horizontal, i, modifier, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(int i, com.paypal.pds.components.TimelineState timelineState, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(887921085, i2, -1, "com.paypal.pds.components.toContentDescription (Timeline.kt:901)");
        }
        java.lang.String[] strArr = new java.lang.String[5];
        strArr[0] = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_step, new java.lang.Object[]{java.lang.Integer.valueOf(i + 1)}, composer, 0);
        strArr[1] = androidx.compose.ui.res.StringResources_androidKt.stringResource(timelineState.getA11ResId(), composer, 0);
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        strArr[2] = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            str2 = null;
        }
        strArr[3] = str2;
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            str3 = null;
        }
        strArr[4] = str3;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), " ", null, null, 0, null, null, 62, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return joinToString$default;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0LvCKNs2xcdnvWsYCPHRJH2ALLM(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.Unit unit, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Timeline(list, modifier, unit, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4ihY3hw7WbYTP1sKCkho9f_6rm0(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setScaleX(((java.lang.Number) animatable.getValue()).floatValue());
        graphicsLayerScope.setScaleY(((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5R4jaZuFDOpFMBC69OT5AHLsa5E(long j, long j2, androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        m22082drawVerticalTrackIbeAmgk(drawScope, j, j2, ((java.lang.Number) animatable.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C191hcAyU-yT2vVjoOc89FswKmg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22074$r8$lambda$C191hcAyUyT2vVjoOc89FswKmg(com.paypal.pds.components.TimelineState timelineState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(timelineState, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DplOGT168E2-neBWxyFOJl5c9NY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22075$r8$lambda$DplOGT168E2neBWxyFOJl5c9NY(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Alignment.Horizontal horizontal, int i, androidx.compose.ui.Modifier modifier, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(str, str2, str3, function2, horizontal, i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EzFqpMZ_xokKqOplwlPY0TO8EsU(androidx.compose.foundation.layout.RowScope rowScope, int i, com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem2, com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem3, androidx.compose.animation.core.Animatable animatable, androidx.compose.animation.core.Animatable animatable2, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(rowScope, i, timelineHorizontalItem, timelineHorizontalItem2, timelineHorizontalItem3, animatable, animatable2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LdnCzMfmhmoP4M4JpC4Ht83-W-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22076$r8$lambda$LdnCzMfmhmoP4M4JpC4Ht83Ws(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1648925655);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1648925655, updateChangedFlags, -1, "com.paypal.pds.components.TimelineHorizontalPreview (Timeline.kt:981)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            TimelineHorizontal(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.TimelineHorizontalItem[]{new com.paypal.pds.components.TimelineHorizontalItem(com.paypal.pds.components.TimelineState.Success.INSTANCE, "Success", "Subtitle", "Metadata", null, 16, null), new com.paypal.pds.components.TimelineHorizontalItem(com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), "In Progress", "Subtitle", "Metadata", null, 16, null), new com.paypal.pds.components.TimelineHorizontalItem(com.paypal.pds.components.TimelineState.Alert.INSTANCE, "Alert", "Subtitle", "Metadata", null, 16, null), new com.paypal.pds.components.TimelineHorizontalItem(com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted(), "Not Started", "Subtitle", "Metadata", null, 16, null)}), null, startRestartGroup, 0, 2);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.m22076$r8$lambda$LdnCzMfmhmoP4M4JpC4Ht83Ws(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MfJP0gFlkAa5qkFxGG66_ZFF_78(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OHTzuuvGtDDla0i3XAkvqSsY4-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22077$r8$lambda$OHTzuuvGtDDla0i3XAkvqSsY4s(int i, com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem, com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem2, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(i, timelineVerticalItem, timelineVerticalItem2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PXvF6kD7VoYIiNgix87PK_4Y0I0(com.paypal.pds.components.TimelineState timelineState, com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(timelineState, timelineVerticalItem, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rs9PGpHW9IF5jZa_xT7wliHVCUg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z7BXpobbIFSW4Tbqn3xQfDa5nec(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZE4t3efLah3IKcr5OTfjYDjFm34(com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, long j, long j2, boolean z, androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        if (timelineHorizontalItem == null) {
            return kotlin.Unit.INSTANCE;
        }
        m22081drawHorizontalTrackIbeAmgk(drawScope, j, j2, horizontalTrackFraction(z, animatable != null ? (java.lang.Float) animatable.getValue() : null, false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_p22mksze1zEj1KQL48sPX8ER84(com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, long j, long j2, androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        if (timelineHorizontalItem == null) {
            return kotlin.Unit.INSTANCE;
        }
        m22081drawHorizontalTrackIbeAmgk(drawScope, j, j2, horizontalTrackFraction(kotlin.jvm.internal.Intrinsics.areEqual(timelineHorizontalItem.getState(), com.paypal.pds.components.TimelineState.Alert.INSTANCE), animatable != null ? (java.lang.Float) animatable.getValue() : null, true));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hC3t_gouq6sve9l6SRzoC4eYlSo(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TimelineHorizontal(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iC12TyZxsS7OxH7rahoPUQBR_HQ(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ikT8E2BMVTErpVt3aFlzaRiCOgs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1158287443);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1158287443, updateChangedFlags, -1, "com.paypal.pds.components.TimelinePreview (Timeline.kt:920)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            Timeline(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.TimelineVerticalItem[]{new com.paypal.pds.components.TimelineVerticalItem("Title 1", com.paypal.pds.components.TimelineState.Success.INSTANCE, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ", "Meta data 1", null, null, 48, null), new com.paypal.pds.components.TimelineVerticalItem("Title 2", com.paypal.pds.components.TimelineState.INSTANCE.getInProgress(), "Sub Title 2", "Meta data 2", null, null, 48, null), new com.paypal.pds.components.TimelineVerticalItem("Title 3", com.paypal.pds.components.TimelineState.Alert.INSTANCE, "Sub Title 3", "Meta data 3", null, null, 48, null), new com.paypal.pds.components.TimelineVerticalItem("Title 4", com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted(), "Sub Title 4", "Meta data 4", null, null, 48, null), new com.paypal.pds.components.TimelineVerticalItem("Title 4", com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted(), "Sub Title 4", "Meta data 5", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-252050615, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.$r8$lambda$sIrAQeHcznslB7b4qyKaPCu4C30(context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, 32, null)}), null, startRestartGroup, 0, 2);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TimelineKt.$r8$lambda$ikT8E2BMVTErpVt3aFlzaRiCOgs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m4DT2s-jvg-utAZt_75KnuXFosI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22078$r8$lambda$m4DT2sjvgutAZt_75KnuXFosI(android.content.Context context) {
        android.widget.Toast.makeText(context, "Clicked on a button", 0).show();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mefj32QycNV-CbQxvo7jnuhCbjE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22079$r8$lambda$mefj32QycNVCbQxvo7jnuhCbjE(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2, java.util.List list) {
        if (!snapshotStateList.isEmpty()) {
            int intValue = ((java.lang.Number) snapshotStateList.remove(0)).intValue();
            snapshotStateList2.set(intValue, ((com.paypal.pds.components.TimelineHorizontalItem) list.get(intValue)).getState());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pE3ECctgDP046zFNQxpbK4bIJ9Q(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Timeline(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rZomeXtB-OujFHq0k-d2ihA0RhM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22080$r8$lambda$rZomeXtBOujFHq0kd2ihA0RhM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sIrAQeHcznslB7b4qyKaPCu4C30(final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-252050615, i, -1, "com.paypal.pds.components.TimelinePreview.<anonymous>.<anonymous> (Timeline.kt:960)");
            }
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            boolean changedInstance = composer.changedInstance(context);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TimelineKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.TimelineKt.m22078$r8$lambda$m4DT2sjvgutAZt_75KnuXFosI(context);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, "Label", null, null, null, secondary, small, false, false, composer, 1769520, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xBcIsEfMjyuTsbUKl81dk_2EVjU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ySfnynN2zbGpwOm7P9DTgU4KktM(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2, java.util.List list) {
        if (!snapshotStateList.isEmpty()) {
            int intValue = ((java.lang.Number) snapshotStateList.remove(0)).intValue();
            snapshotStateList2.set(intValue, ((com.paypal.pds.components.TimelineVerticalItem) list.get(intValue)).getState());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z4kJhsq6GATLJT6eSnAEaa0AA94(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$AnimatedTimelineIndicator$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$AnimatedTimelineTrack$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$TimelineHorizontalView$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }
}
