package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013\u0014\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "oldSnapshot", "newSnapshot", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "resolveMutations$dd_sdk_android_session_replay_release", "(Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileIncrementalData$MobileMutationData;", "", "Camera2StreamConfigurationMap", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;)J", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "Entry", "Symbol"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MutationResolver {
    public static final java.lang.String MISS_MATCHING_TYPES_IN_SNAPSHOTS_ERROR_MESSAGE_FORMAT = "SR MutationResolver: wireframe of type [%1s] is not matching the wireframe of type [%2s]";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    public MutationResolver(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0c44 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r25v12, types: [com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation] */
    /* JADX WARN: Type inference failed for: r25v2, types: [com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation] */
    /* JADX WARN: Type inference failed for: r25v23, types: [com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation] */
    /* JADX WARN: Type inference failed for: r25v34, types: [com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation] */
    /* JADX WARN: Type inference failed for: r25v46, types: [com.datadog.android.sessionreplay.model.MobileSegment$WireframeUpdateMutation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData resolveMutations$dd_sdk_android_session_replay_release(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> oldSnapshot, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> newSnapshot) {
        java.util.Iterator it;
        java.lang.Long l;
        java.lang.Long l2;
        java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = oldSnapshot;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newSnapshot, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Iterator it2 = newSnapshot.iterator(); it2.hasNext(); it2 = it2) {
            long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) it2.next());
            linkedHashMap.put(java.lang.Long.valueOf(Camera2StreamConfigurationMap), new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol(false, true, null, 4, null));
            arrayList2.add(new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference(Camera2StreamConfigurationMap));
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) obj);
            if (!linkedHashMap.containsKey(java.lang.Long.valueOf(Camera2StreamConfigurationMap2))) {
                linkedHashMap.put(java.lang.Long.valueOf(Camera2StreamConfigurationMap2), new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol(true, false, java.lang.Integer.valueOf(i)));
            } else {
                com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol symbol = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol) linkedHashMap.get(java.lang.Long.valueOf(Camera2StreamConfigurationMap2));
                if (symbol != null) {
                    symbol.getHighSpeedVideoFpsRangesFor = true;
                }
                com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol symbol2 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol) linkedHashMap.get(java.lang.Long.valueOf(Camera2StreamConfigurationMap2));
                if (symbol2 != null) {
                    symbol2.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
                }
            }
            arrayList.add(new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference(Camera2StreamConfigurationMap2));
            i++;
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.Iterator it3 = arrayList3.iterator();
        int i2 = 0;
        while (true) {
            java.lang.Long l3 = null;
            if (it3.hasNext()) {
                java.lang.Object next = it3.next();
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) next;
                if (entry instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) {
                    com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol symbol3 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol) linkedHashMap.get(java.lang.Long.valueOf(((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) entry).getId()));
                    if (symbol3 == null) {
                        return null;
                    }
                    if (symbol3.getHighSpeedVideoFpsRangesFor && symbol3.getHighSpeedVideoFpsRanges) {
                        java.lang.Integer num = symbol3.Camera2StreamConfigurationMap;
                        if (num == null) {
                            return null;
                        }
                        int intValue = num.intValue();
                        arrayList2.set(i2, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(intValue));
                        arrayList.set(intValue, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(i2));
                    }
                }
                i2++;
            } else {
                int size = arrayList2.size();
                for (int i3 = 1; i3 < size - 1; i3++) {
                    com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry2 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList2.get(i3);
                    if (entry2 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) {
                        com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index index = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) entry2;
                        if (index.getIndex() + 1 < arrayList.size()) {
                            int i4 = i3 + 1;
                            com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry3 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList2.get(i4);
                            com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry4 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList.get(index.getIndex() + 1);
                            if ((entry3 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) && (entry4 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) && ((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) entry4).getId() == ((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) entry3).getId()) {
                                arrayList2.set(i4, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(index.getIndex() + 1));
                                arrayList.set(index.getIndex() + 1, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(i4));
                            }
                        }
                    }
                }
                kotlin.ranges.IntProgression reversed = kotlin.ranges.RangesKt.reversed(kotlin.ranges.RangesKt.until(1, arrayList2.size() - 1));
                int first = reversed.getFirst();
                int last = reversed.getLast();
                int step = reversed.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry5 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList2.get(first);
                        if (entry5 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) {
                            com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index index2 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) entry5;
                            if (index2.getIndex() - 1 >= 0) {
                                int i5 = first - 1;
                                com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry6 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList2.get(i5);
                                com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry7 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) arrayList.get(index2.getIndex() - 1);
                                if ((entry6 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) && (entry7 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) && ((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) entry7).getId() == ((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) entry6).getId()) {
                                    arrayList2.set(i5, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(index2.getIndex() - 1));
                                    arrayList.set(index2.getIndex() - 1, new com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index(i5));
                                }
                            }
                        }
                        if (first == last) {
                            break;
                        }
                        first += step;
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                int[] iArr = new int[oldSnapshot.size()];
                int i6 = 0;
                int i7 = 0;
                for (java.lang.Object obj2 : arrayList) {
                    if (i6 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    iArr[i6] = i7;
                    if (((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) obj2) instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) {
                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe = list.get(i6);
                        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) {
                            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(webviewWireframe.isVisible(), java.lang.Boolean.FALSE)) {
                                linkedList.add(new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate(webviewWireframe.getId(), null, null, null, null, null, null, null, webviewWireframe.getSlotId(), java.lang.Boolean.FALSE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null));
                            }
                        } else {
                            linkedList3.add(new com.datadog.android.sessionreplay.model.MobileSegment.Remove(Camera2StreamConfigurationMap(wireframe)));
                        }
                        i7++;
                    }
                    i6++;
                }
                java.util.Iterator it4 = arrayList3.iterator();
                int i8 = 0;
                int i9 = 0;
                while (it4.hasNext()) {
                    java.lang.Object next2 = it4.next();
                    if (i8 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry entry8 = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry) next2;
                    if (entry8 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) {
                        int index3 = ((com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Index) entry8).getIndex();
                        int i10 = iArr[index3];
                        final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe2 = newSnapshot.get(i8);
                        final com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe3 = list.get(index3);
                        if ((index3 - i10) + i9 != i8) {
                            java.lang.Long valueOf = i8 > 0 ? java.lang.Long.valueOf(Camera2StreamConfigurationMap(newSnapshot.get(i8 - 1))) : l3;
                            linkedList3.add(new com.datadog.android.sessionreplay.model.MobileSegment.Remove(Camera2StreamConfigurationMap(newSnapshot.get(i8))));
                            linkedList2.add(new com.datadog.android.sessionreplay.model.MobileSegment.Add(valueOf, newSnapshot.get(i8)));
                        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(wireframe2, wireframe3)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(wireframe3, wireframe2)) {
                                if (!wireframe3.getClass().isAssignableFrom(wireframe2.getClass())) {
                                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.processor.MutationResolver$resolveUpdateMutation$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                        public final java.lang.String invoke() {
                                            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.sessionreplay.internal.processor.MutationResolver.MISS_MATCHING_TYPES_IN_SNAPSHOTS_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.this.getClass().getName(), wireframe2.getClass().getName()}, 2));
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                            return format;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                                } else {
                                    if (wireframe3 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) {
                                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe textWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe3;
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(wireframe2, "");
                                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe textWireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe2;
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate(textWireframe2.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null);
                                        if (textWireframe.getX() != textWireframe2.getX()) {
                                            textWireframeUpdate = textWireframeUpdate.copy((r26 & 1) != 0 ? textWireframeUpdate.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate.x : java.lang.Long.valueOf(textWireframe2.getX()), (r26 & 4) != 0 ? textWireframeUpdate.y : null, (r26 & 8) != 0 ? textWireframeUpdate.width : null, (r26 & 16) != 0 ? textWireframeUpdate.height : null, (r26 & 32) != 0 ? textWireframeUpdate.clip : null, (r26 & 64) != 0 ? textWireframeUpdate.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate.border : null, (r26 & 256) != 0 ? textWireframeUpdate.text : null, (r26 & 512) != 0 ? textWireframeUpdate.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate2 = textWireframeUpdate;
                                        if (textWireframe.getY() != textWireframe2.getY()) {
                                            textWireframeUpdate2 = textWireframeUpdate2.copy((r26 & 1) != 0 ? textWireframeUpdate2.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate2.x : null, (r26 & 4) != 0 ? textWireframeUpdate2.y : java.lang.Long.valueOf(textWireframe2.getY()), (r26 & 8) != 0 ? textWireframeUpdate2.width : null, (r26 & 16) != 0 ? textWireframeUpdate2.height : null, (r26 & 32) != 0 ? textWireframeUpdate2.clip : null, (r26 & 64) != 0 ? textWireframeUpdate2.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate2.border : null, (r26 & 256) != 0 ? textWireframeUpdate2.text : null, (r26 & 512) != 0 ? textWireframeUpdate2.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate2.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate3 = textWireframeUpdate2;
                                        if (textWireframe.getWidth() != textWireframe2.getWidth()) {
                                            textWireframeUpdate3 = textWireframeUpdate3.copy((r26 & 1) != 0 ? textWireframeUpdate3.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate3.x : null, (r26 & 4) != 0 ? textWireframeUpdate3.y : null, (r26 & 8) != 0 ? textWireframeUpdate3.width : java.lang.Long.valueOf(textWireframe2.getWidth()), (r26 & 16) != 0 ? textWireframeUpdate3.height : null, (r26 & 32) != 0 ? textWireframeUpdate3.clip : null, (r26 & 64) != 0 ? textWireframeUpdate3.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate3.border : null, (r26 & 256) != 0 ? textWireframeUpdate3.text : null, (r26 & 512) != 0 ? textWireframeUpdate3.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate3.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate4 = textWireframeUpdate3;
                                        if (textWireframe.getHeight() != textWireframe2.getHeight()) {
                                            textWireframeUpdate4 = textWireframeUpdate4.copy((r26 & 1) != 0 ? textWireframeUpdate4.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate4.x : null, (r26 & 4) != 0 ? textWireframeUpdate4.y : null, (r26 & 8) != 0 ? textWireframeUpdate4.width : null, (r26 & 16) != 0 ? textWireframeUpdate4.height : java.lang.Long.valueOf(textWireframe2.getHeight()), (r26 & 32) != 0 ? textWireframeUpdate4.clip : null, (r26 & 64) != 0 ? textWireframeUpdate4.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate4.border : null, (r26 & 256) != 0 ? textWireframeUpdate4.text : null, (r26 & 512) != 0 ? textWireframeUpdate4.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate4.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate5 = textWireframeUpdate4;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getBorder(), textWireframe2.getBorder())) {
                                            textWireframeUpdate5 = textWireframeUpdate5.copy((r26 & 1) != 0 ? textWireframeUpdate5.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate5.x : null, (r26 & 4) != 0 ? textWireframeUpdate5.y : null, (r26 & 8) != 0 ? textWireframeUpdate5.width : null, (r26 & 16) != 0 ? textWireframeUpdate5.height : null, (r26 & 32) != 0 ? textWireframeUpdate5.clip : null, (r26 & 64) != 0 ? textWireframeUpdate5.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate5.border : textWireframe2.getBorder(), (r26 & 256) != 0 ? textWireframeUpdate5.text : null, (r26 & 512) != 0 ? textWireframeUpdate5.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate5.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate6 = textWireframeUpdate5;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getShapeStyle(), textWireframe2.getShapeStyle())) {
                                            textWireframeUpdate6 = textWireframeUpdate6.copy((r26 & 1) != 0 ? textWireframeUpdate6.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate6.x : null, (r26 & 4) != 0 ? textWireframeUpdate6.y : null, (r26 & 8) != 0 ? textWireframeUpdate6.width : null, (r26 & 16) != 0 ? textWireframeUpdate6.height : null, (r26 & 32) != 0 ? textWireframeUpdate6.clip : null, (r26 & 64) != 0 ? textWireframeUpdate6.shapeStyle : textWireframe2.getShapeStyle(), (r26 & 128) != 0 ? textWireframeUpdate6.border : null, (r26 & 256) != 0 ? textWireframeUpdate6.text : null, (r26 & 512) != 0 ? textWireframeUpdate6.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate6.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate7 = textWireframeUpdate6;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getTextStyle(), textWireframe2.getTextStyle())) {
                                            textWireframeUpdate7 = textWireframeUpdate7.copy((r26 & 1) != 0 ? textWireframeUpdate7.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate7.x : null, (r26 & 4) != 0 ? textWireframeUpdate7.y : null, (r26 & 8) != 0 ? textWireframeUpdate7.width : null, (r26 & 16) != 0 ? textWireframeUpdate7.height : null, (r26 & 32) != 0 ? textWireframeUpdate7.clip : null, (r26 & 64) != 0 ? textWireframeUpdate7.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate7.border : null, (r26 & 256) != 0 ? textWireframeUpdate7.text : null, (r26 & 512) != 0 ? textWireframeUpdate7.textStyle : textWireframe2.getTextStyle(), (r26 & 1024) != 0 ? textWireframeUpdate7.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate8 = textWireframeUpdate7;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getText(), textWireframe2.getText())) {
                                            textWireframeUpdate8 = textWireframeUpdate8.copy((r26 & 1) != 0 ? textWireframeUpdate8.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate8.x : null, (r26 & 4) != 0 ? textWireframeUpdate8.y : null, (r26 & 8) != 0 ? textWireframeUpdate8.width : null, (r26 & 16) != 0 ? textWireframeUpdate8.height : null, (r26 & 32) != 0 ? textWireframeUpdate8.clip : null, (r26 & 64) != 0 ? textWireframeUpdate8.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate8.border : null, (r26 & 256) != 0 ? textWireframeUpdate8.text : textWireframe2.getText(), (r26 & 512) != 0 ? textWireframeUpdate8.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate8.textPosition : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate9 = textWireframeUpdate8;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getTextPosition(), textWireframe2.getTextPosition())) {
                                            textWireframeUpdate9 = textWireframeUpdate9.copy((r26 & 1) != 0 ? textWireframeUpdate9.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate9.x : null, (r26 & 4) != 0 ? textWireframeUpdate9.y : null, (r26 & 8) != 0 ? textWireframeUpdate9.width : null, (r26 & 16) != 0 ? textWireframeUpdate9.height : null, (r26 & 32) != 0 ? textWireframeUpdate9.clip : null, (r26 & 64) != 0 ? textWireframeUpdate9.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate9.border : null, (r26 & 256) != 0 ? textWireframeUpdate9.text : null, (r26 & 512) != 0 ? textWireframeUpdate9.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate9.textPosition : textWireframe2.getTextPosition());
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.TextWireframeUpdate textWireframeUpdate10 = textWireframeUpdate9;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(textWireframe.getClip(), textWireframe2.getClip())) {
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip = textWireframe2.getClip();
                                            if (clip == null) {
                                                clip = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(0L, 0L, 0L, 0L);
                                            }
                                            textWireframeUpdate10 = textWireframeUpdate10.copy((r26 & 1) != 0 ? textWireframeUpdate10.id : 0L, (r26 & 2) != 0 ? textWireframeUpdate10.x : null, (r26 & 4) != 0 ? textWireframeUpdate10.y : null, (r26 & 8) != 0 ? textWireframeUpdate10.width : null, (r26 & 16) != 0 ? textWireframeUpdate10.height : null, (r26 & 32) != 0 ? textWireframeUpdate10.clip : clip, (r26 & 64) != 0 ? textWireframeUpdate10.shapeStyle : null, (r26 & 128) != 0 ? textWireframeUpdate10.border : null, (r26 & 256) != 0 ? textWireframeUpdate10.text : null, (r26 & 512) != 0 ? textWireframeUpdate10.textStyle : null, (r26 & 1024) != 0 ? textWireframeUpdate10.textPosition : null);
                                        }
                                        l2 = textWireframeUpdate10;
                                    } else if (wireframe3 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
                                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe3;
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(wireframe2, "");
                                        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe2;
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate(shapeWireframe2.getId(), null, null, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
                                        if (shapeWireframe.getX() != shapeWireframe2.getX()) {
                                            shapeWireframeUpdate = shapeWireframeUpdate.copy((r20 & 1) != 0 ? shapeWireframeUpdate.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate.x : java.lang.Long.valueOf(shapeWireframe2.getX()), (r20 & 4) != 0 ? shapeWireframeUpdate.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate.border : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate2 = shapeWireframeUpdate;
                                        if (shapeWireframe.getY() != shapeWireframe2.getY()) {
                                            shapeWireframeUpdate2 = shapeWireframeUpdate2.copy((r20 & 1) != 0 ? shapeWireframeUpdate2.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate2.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate2.y : java.lang.Long.valueOf(shapeWireframe2.getY()), (r20 & 8) != 0 ? shapeWireframeUpdate2.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate2.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate2.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate2.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate2.border : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate3 = shapeWireframeUpdate2;
                                        if (shapeWireframe.getWidth() != shapeWireframe2.getWidth()) {
                                            shapeWireframeUpdate3 = shapeWireframeUpdate3.copy((r20 & 1) != 0 ? shapeWireframeUpdate3.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate3.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate3.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate3.width : java.lang.Long.valueOf(shapeWireframe2.getWidth()), (r20 & 16) != 0 ? shapeWireframeUpdate3.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate3.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate3.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate3.border : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate4 = shapeWireframeUpdate3;
                                        if (shapeWireframe.getHeight() != shapeWireframe2.getHeight()) {
                                            shapeWireframeUpdate4 = shapeWireframeUpdate4.copy((r20 & 1) != 0 ? shapeWireframeUpdate4.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate4.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate4.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate4.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate4.height : java.lang.Long.valueOf(shapeWireframe2.getHeight()), (r20 & 32) != 0 ? shapeWireframeUpdate4.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate4.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate4.border : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate5 = shapeWireframeUpdate4;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(shapeWireframe.getBorder(), shapeWireframe2.getBorder())) {
                                            shapeWireframeUpdate5 = shapeWireframeUpdate5.copy((r20 & 1) != 0 ? shapeWireframeUpdate5.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate5.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate5.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate5.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate5.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate5.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate5.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate5.border : shapeWireframe2.getBorder());
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate6 = shapeWireframeUpdate5;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(shapeWireframe.getShapeStyle(), shapeWireframe2.getShapeStyle())) {
                                            shapeWireframeUpdate6 = shapeWireframeUpdate6.copy((r20 & 1) != 0 ? shapeWireframeUpdate6.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate6.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate6.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate6.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate6.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate6.clip : null, (r20 & 64) != 0 ? shapeWireframeUpdate6.shapeStyle : shapeWireframe2.getShapeStyle(), (r20 & 128) != 0 ? shapeWireframeUpdate6.border : null);
                                        }
                                        com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ShapeWireframeUpdate shapeWireframeUpdate7 = shapeWireframeUpdate6;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(shapeWireframe.getClip(), shapeWireframe2.getClip())) {
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip2 = shapeWireframe2.getClip();
                                            if (clip2 == null) {
                                                clip2 = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(0L, 0L, 0L, 0L);
                                            }
                                            shapeWireframeUpdate7 = shapeWireframeUpdate7.copy((r20 & 1) != 0 ? shapeWireframeUpdate7.id : 0L, (r20 & 2) != 0 ? shapeWireframeUpdate7.x : null, (r20 & 4) != 0 ? shapeWireframeUpdate7.y : null, (r20 & 8) != 0 ? shapeWireframeUpdate7.width : null, (r20 & 16) != 0 ? shapeWireframeUpdate7.height : null, (r20 & 32) != 0 ? shapeWireframeUpdate7.clip : clip2, (r20 & 64) != 0 ? shapeWireframeUpdate7.shapeStyle : null, (r20 & 128) != 0 ? shapeWireframeUpdate7.border : null);
                                        }
                                        l2 = shapeWireframeUpdate7;
                                    } else {
                                        if (wireframe3 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) {
                                            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe imageWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe3;
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(wireframe2, "");
                                            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe imageWireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe2;
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate(imageWireframe2.getId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
                                            if (imageWireframe.getX() != imageWireframe2.getX()) {
                                                imageWireframeUpdate = imageWireframeUpdate.copy((r28 & 1) != 0 ? imageWireframeUpdate.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate.x : java.lang.Long.valueOf(imageWireframe2.getX()), (r28 & 4) != 0 ? imageWireframeUpdate.y : null, (r28 & 8) != 0 ? imageWireframeUpdate.width : null, (r28 & 16) != 0 ? imageWireframeUpdate.height : null, (r28 & 32) != 0 ? imageWireframeUpdate.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate.border : null, (r28 & 256) != 0 ? imageWireframeUpdate.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate2 = imageWireframeUpdate;
                                            if (imageWireframe.getY() != imageWireframe2.getY()) {
                                                imageWireframeUpdate2 = imageWireframeUpdate2.copy((r28 & 1) != 0 ? imageWireframeUpdate2.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate2.x : null, (r28 & 4) != 0 ? imageWireframeUpdate2.y : java.lang.Long.valueOf(imageWireframe2.getY()), (r28 & 8) != 0 ? imageWireframeUpdate2.width : null, (r28 & 16) != 0 ? imageWireframeUpdate2.height : null, (r28 & 32) != 0 ? imageWireframeUpdate2.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate2.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate2.border : null, (r28 & 256) != 0 ? imageWireframeUpdate2.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate2.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate2.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate2.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate3 = imageWireframeUpdate2;
                                            if (imageWireframe.getWidth() != imageWireframe2.getWidth()) {
                                                imageWireframeUpdate3 = imageWireframeUpdate3.copy((r28 & 1) != 0 ? imageWireframeUpdate3.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate3.x : null, (r28 & 4) != 0 ? imageWireframeUpdate3.y : null, (r28 & 8) != 0 ? imageWireframeUpdate3.width : java.lang.Long.valueOf(imageWireframe2.getWidth()), (r28 & 16) != 0 ? imageWireframeUpdate3.height : null, (r28 & 32) != 0 ? imageWireframeUpdate3.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate3.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate3.border : null, (r28 & 256) != 0 ? imageWireframeUpdate3.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate3.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate3.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate3.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate4 = imageWireframeUpdate3;
                                            if (imageWireframe.getHeight() != imageWireframe2.getHeight()) {
                                                imageWireframeUpdate4 = imageWireframeUpdate4.copy((r28 & 1) != 0 ? imageWireframeUpdate4.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate4.x : null, (r28 & 4) != 0 ? imageWireframeUpdate4.y : null, (r28 & 8) != 0 ? imageWireframeUpdate4.width : null, (r28 & 16) != 0 ? imageWireframeUpdate4.height : java.lang.Long.valueOf(imageWireframe2.getHeight()), (r28 & 32) != 0 ? imageWireframeUpdate4.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate4.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate4.border : null, (r28 & 256) != 0 ? imageWireframeUpdate4.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate4.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate4.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate4.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate5 = imageWireframeUpdate4;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.getBorder(), imageWireframe2.getBorder())) {
                                                imageWireframeUpdate5 = imageWireframeUpdate5.copy((r28 & 1) != 0 ? imageWireframeUpdate5.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate5.x : null, (r28 & 4) != 0 ? imageWireframeUpdate5.y : null, (r28 & 8) != 0 ? imageWireframeUpdate5.width : null, (r28 & 16) != 0 ? imageWireframeUpdate5.height : null, (r28 & 32) != 0 ? imageWireframeUpdate5.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate5.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate5.border : imageWireframe2.getBorder(), (r28 & 256) != 0 ? imageWireframeUpdate5.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate5.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate5.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate5.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate6 = imageWireframeUpdate5;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.getShapeStyle(), imageWireframe2.getShapeStyle())) {
                                                imageWireframeUpdate6 = imageWireframeUpdate6.copy((r28 & 1) != 0 ? imageWireframeUpdate6.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate6.x : null, (r28 & 4) != 0 ? imageWireframeUpdate6.y : null, (r28 & 8) != 0 ? imageWireframeUpdate6.width : null, (r28 & 16) != 0 ? imageWireframeUpdate6.height : null, (r28 & 32) != 0 ? imageWireframeUpdate6.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate6.shapeStyle : imageWireframe2.getShapeStyle(), (r28 & 128) != 0 ? imageWireframeUpdate6.border : null, (r28 & 256) != 0 ? imageWireframeUpdate6.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate6.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate6.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate6.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate7 = imageWireframeUpdate6;
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.getClip(), imageWireframe2.getClip())) {
                                                it = it4;
                                            } else {
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip3 = imageWireframe2.getClip();
                                                if (clip3 == null) {
                                                    it = it4;
                                                    clip3 = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(0L, 0L, 0L, 0L);
                                                } else {
                                                    it = it4;
                                                }
                                                imageWireframeUpdate7 = imageWireframeUpdate7.copy((r28 & 1) != 0 ? imageWireframeUpdate7.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate7.x : null, (r28 & 4) != 0 ? imageWireframeUpdate7.y : null, (r28 & 8) != 0 ? imageWireframeUpdate7.width : null, (r28 & 16) != 0 ? imageWireframeUpdate7.height : null, (r28 & 32) != 0 ? imageWireframeUpdate7.clip : clip3, (r28 & 64) != 0 ? imageWireframeUpdate7.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate7.border : null, (r28 & 256) != 0 ? imageWireframeUpdate7.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate7.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate7.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate7.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate8 = imageWireframeUpdate7;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.getResourceId(), imageWireframe2.getResourceId())) {
                                                imageWireframeUpdate8 = imageWireframeUpdate8.copy((r28 & 1) != 0 ? imageWireframeUpdate8.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate8.x : null, (r28 & 4) != 0 ? imageWireframeUpdate8.y : null, (r28 & 8) != 0 ? imageWireframeUpdate8.width : null, (r28 & 16) != 0 ? imageWireframeUpdate8.height : null, (r28 & 32) != 0 ? imageWireframeUpdate8.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate8.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate8.border : null, (r28 & 256) != 0 ? imageWireframeUpdate8.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate8.resourceId : imageWireframe2.getResourceId(), (r28 & 1024) != 0 ? imageWireframeUpdate8.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate8.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate9 = imageWireframeUpdate8;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.getMimeType(), imageWireframe2.getMimeType())) {
                                                imageWireframeUpdate9 = imageWireframeUpdate9.copy((r28 & 1) != 0 ? imageWireframeUpdate9.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate9.x : null, (r28 & 4) != 0 ? imageWireframeUpdate9.y : null, (r28 & 8) != 0 ? imageWireframeUpdate9.width : null, (r28 & 16) != 0 ? imageWireframeUpdate9.height : null, (r28 & 32) != 0 ? imageWireframeUpdate9.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate9.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate9.border : null, (r28 & 256) != 0 ? imageWireframeUpdate9.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate9.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate9.mimeType : imageWireframe2.getMimeType(), (r28 & 2048) != 0 ? imageWireframeUpdate9.isEmpty : null);
                                            }
                                            com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.ImageWireframeUpdate imageWireframeUpdate10 = imageWireframeUpdate9;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(imageWireframe.isEmpty(), imageWireframe2.isEmpty())) {
                                                imageWireframeUpdate10 = imageWireframeUpdate10.copy((r28 & 1) != 0 ? imageWireframeUpdate10.id : 0L, (r28 & 2) != 0 ? imageWireframeUpdate10.x : null, (r28 & 4) != 0 ? imageWireframeUpdate10.y : null, (r28 & 8) != 0 ? imageWireframeUpdate10.width : null, (r28 & 16) != 0 ? imageWireframeUpdate10.height : null, (r28 & 32) != 0 ? imageWireframeUpdate10.clip : null, (r28 & 64) != 0 ? imageWireframeUpdate10.shapeStyle : null, (r28 & 128) != 0 ? imageWireframeUpdate10.border : null, (r28 & 256) != 0 ? imageWireframeUpdate10.base64 : null, (r28 & 512) != 0 ? imageWireframeUpdate10.resourceId : null, (r28 & 1024) != 0 ? imageWireframeUpdate10.mimeType : null, (r28 & 2048) != 0 ? imageWireframeUpdate10.isEmpty : imageWireframe2.isEmpty());
                                            }
                                            l = imageWireframeUpdate10;
                                        } else {
                                            it = it4;
                                            if (wireframe3 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) {
                                                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe placeholderWireframe = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe3;
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(wireframe2, "");
                                                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe placeholderWireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe2;
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate(placeholderWireframe2.getId(), null, null, null, null, null, null, 126, null);
                                                if (placeholderWireframe.getX() != placeholderWireframe2.getX()) {
                                                    placeholderWireframeUpdate = placeholderWireframeUpdate.copy((r18 & 1) != 0 ? placeholderWireframeUpdate.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate.x : java.lang.Long.valueOf(placeholderWireframe2.getX()), (r18 & 4) != 0 ? placeholderWireframeUpdate.y : null, (r18 & 8) != 0 ? placeholderWireframeUpdate.width : null, (r18 & 16) != 0 ? placeholderWireframeUpdate.height : null, (r18 & 32) != 0 ? placeholderWireframeUpdate.clip : null, (r18 & 64) != 0 ? placeholderWireframeUpdate.label : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate2 = placeholderWireframeUpdate;
                                                if (placeholderWireframe.getY() != placeholderWireframe2.getY()) {
                                                    placeholderWireframeUpdate2 = placeholderWireframeUpdate2.copy((r18 & 1) != 0 ? placeholderWireframeUpdate2.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate2.x : null, (r18 & 4) != 0 ? placeholderWireframeUpdate2.y : java.lang.Long.valueOf(placeholderWireframe2.getY()), (r18 & 8) != 0 ? placeholderWireframeUpdate2.width : null, (r18 & 16) != 0 ? placeholderWireframeUpdate2.height : null, (r18 & 32) != 0 ? placeholderWireframeUpdate2.clip : null, (r18 & 64) != 0 ? placeholderWireframeUpdate2.label : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate3 = placeholderWireframeUpdate2;
                                                if (placeholderWireframe.getWidth() != placeholderWireframe2.getWidth()) {
                                                    placeholderWireframeUpdate3 = placeholderWireframeUpdate3.copy((r18 & 1) != 0 ? placeholderWireframeUpdate3.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate3.x : null, (r18 & 4) != 0 ? placeholderWireframeUpdate3.y : null, (r18 & 8) != 0 ? placeholderWireframeUpdate3.width : java.lang.Long.valueOf(placeholderWireframe2.getWidth()), (r18 & 16) != 0 ? placeholderWireframeUpdate3.height : null, (r18 & 32) != 0 ? placeholderWireframeUpdate3.clip : null, (r18 & 64) != 0 ? placeholderWireframeUpdate3.label : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate4 = placeholderWireframeUpdate3;
                                                if (placeholderWireframe.getHeight() != placeholderWireframe2.getHeight()) {
                                                    placeholderWireframeUpdate4 = placeholderWireframeUpdate4.copy((r18 & 1) != 0 ? placeholderWireframeUpdate4.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate4.x : null, (r18 & 4) != 0 ? placeholderWireframeUpdate4.y : null, (r18 & 8) != 0 ? placeholderWireframeUpdate4.width : null, (r18 & 16) != 0 ? placeholderWireframeUpdate4.height : java.lang.Long.valueOf(placeholderWireframe2.getHeight()), (r18 & 32) != 0 ? placeholderWireframeUpdate4.clip : null, (r18 & 64) != 0 ? placeholderWireframeUpdate4.label : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate5 = placeholderWireframeUpdate4;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(placeholderWireframe.getLabel(), placeholderWireframe2.getLabel())) {
                                                    placeholderWireframeUpdate5 = placeholderWireframeUpdate5.copy((r18 & 1) != 0 ? placeholderWireframeUpdate5.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate5.x : null, (r18 & 4) != 0 ? placeholderWireframeUpdate5.y : null, (r18 & 8) != 0 ? placeholderWireframeUpdate5.width : null, (r18 & 16) != 0 ? placeholderWireframeUpdate5.height : null, (r18 & 32) != 0 ? placeholderWireframeUpdate5.clip : null, (r18 & 64) != 0 ? placeholderWireframeUpdate5.label : placeholderWireframe2.getLabel());
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.PlaceholderWireframeUpdate placeholderWireframeUpdate6 = placeholderWireframeUpdate5;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(placeholderWireframe.getClip(), placeholderWireframe2.getClip())) {
                                                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip4 = placeholderWireframe2.getClip();
                                                    if (clip4 == null) {
                                                        clip4 = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(0L, 0L, 0L, 0L);
                                                    }
                                                    placeholderWireframeUpdate6 = placeholderWireframeUpdate6.copy((r18 & 1) != 0 ? placeholderWireframeUpdate6.id : 0L, (r18 & 2) != 0 ? placeholderWireframeUpdate6.x : null, (r18 & 4) != 0 ? placeholderWireframeUpdate6.y : null, (r18 & 8) != 0 ? placeholderWireframeUpdate6.width : null, (r18 & 16) != 0 ? placeholderWireframeUpdate6.height : null, (r18 & 32) != 0 ? placeholderWireframeUpdate6.clip : clip4, (r18 & 64) != 0 ? placeholderWireframeUpdate6.label : null);
                                                }
                                                l = placeholderWireframeUpdate6;
                                            } else {
                                                if (!(wireframe3 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe)) {
                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe3;
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(wireframe2, "");
                                                com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe webviewWireframe3 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe2;
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate(webviewWireframe3.getId(), null, null, null, null, null, null, null, webviewWireframe3.getSlotId(), null, 766, null);
                                                if (webviewWireframe2.getX() != webviewWireframe3.getX()) {
                                                    webviewWireframeUpdate = webviewWireframeUpdate.copy((r24 & 1) != 0 ? webviewWireframeUpdate.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate.x : java.lang.Long.valueOf(webviewWireframe3.getX()), (r24 & 4) != 0 ? webviewWireframeUpdate.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate2 = webviewWireframeUpdate;
                                                if (webviewWireframe2.getY() != webviewWireframe3.getY()) {
                                                    webviewWireframeUpdate2 = webviewWireframeUpdate2.copy((r24 & 1) != 0 ? webviewWireframeUpdate2.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate2.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate2.y : java.lang.Long.valueOf(webviewWireframe3.getY()), (r24 & 8) != 0 ? webviewWireframeUpdate2.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate2.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate2.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate2.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate2.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate2.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate2.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate3 = webviewWireframeUpdate2;
                                                if (webviewWireframe2.getWidth() != webviewWireframe3.getWidth()) {
                                                    webviewWireframeUpdate3 = webviewWireframeUpdate3.copy((r24 & 1) != 0 ? webviewWireframeUpdate3.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate3.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate3.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate3.width : java.lang.Long.valueOf(webviewWireframe3.getWidth()), (r24 & 16) != 0 ? webviewWireframeUpdate3.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate3.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate3.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate3.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate3.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate3.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate4 = webviewWireframeUpdate3;
                                                if (webviewWireframe2.getHeight() != webviewWireframe3.getHeight()) {
                                                    webviewWireframeUpdate4 = webviewWireframeUpdate4.copy((r24 & 1) != 0 ? webviewWireframeUpdate4.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate4.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate4.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate4.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate4.height : java.lang.Long.valueOf(webviewWireframe3.getHeight()), (r24 & 32) != 0 ? webviewWireframeUpdate4.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate4.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate4.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate4.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate4.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate5 = webviewWireframeUpdate4;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(webviewWireframe2.getBorder(), webviewWireframe3.getBorder())) {
                                                    webviewWireframeUpdate5 = webviewWireframeUpdate5.copy((r24 & 1) != 0 ? webviewWireframeUpdate5.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate5.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate5.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate5.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate5.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate5.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate5.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate5.border : webviewWireframe3.getBorder(), (r24 & 256) != 0 ? webviewWireframeUpdate5.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate5.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate6 = webviewWireframeUpdate5;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(webviewWireframe2.getShapeStyle(), webviewWireframe3.getShapeStyle())) {
                                                    webviewWireframeUpdate6 = webviewWireframeUpdate6.copy((r24 & 1) != 0 ? webviewWireframeUpdate6.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate6.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate6.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate6.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate6.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate6.clip : null, (r24 & 64) != 0 ? webviewWireframeUpdate6.shapeStyle : webviewWireframe3.getShapeStyle(), (r24 & 128) != 0 ? webviewWireframeUpdate6.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate6.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate6.isVisible : null);
                                                }
                                                com.datadog.android.sessionreplay.model.MobileSegment.WireframeUpdateMutation.WebviewWireframeUpdate webviewWireframeUpdate7 = webviewWireframeUpdate6;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(webviewWireframe2.getClip(), webviewWireframe3.getClip())) {
                                                    com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip clip5 = webviewWireframe3.getClip();
                                                    if (clip5 == null) {
                                                        clip5 = new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(0L, 0L, 0L, 0L);
                                                    }
                                                    webviewWireframeUpdate7 = webviewWireframeUpdate7.copy((r24 & 1) != 0 ? webviewWireframeUpdate7.id : 0L, (r24 & 2) != 0 ? webviewWireframeUpdate7.x : null, (r24 & 4) != 0 ? webviewWireframeUpdate7.y : null, (r24 & 8) != 0 ? webviewWireframeUpdate7.width : null, (r24 & 16) != 0 ? webviewWireframeUpdate7.height : null, (r24 & 32) != 0 ? webviewWireframeUpdate7.clip : clip5, (r24 & 64) != 0 ? webviewWireframeUpdate7.shapeStyle : null, (r24 & 128) != 0 ? webviewWireframeUpdate7.border : null, (r24 & 256) != 0 ? webviewWireframeUpdate7.slotId : null, (r24 & 512) != 0 ? webviewWireframeUpdate7.isVisible : null);
                                                }
                                                l = webviewWireframeUpdate7;
                                            }
                                        }
                                        l3 = l;
                                        if (l3 != null) {
                                            linkedList.add(l3);
                                        }
                                    }
                                    it = it4;
                                    l = l2;
                                    l3 = l;
                                    if (l3 != null) {
                                    }
                                }
                            }
                            it = it4;
                            if (l3 != null) {
                            }
                        }
                        it = it4;
                    } else {
                        it = it4;
                        if (entry8 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry.Reference) {
                            linkedList2.add(new com.datadog.android.sessionreplay.model.MobileSegment.Add(i8 > 0 ? java.lang.Long.valueOf(Camera2StreamConfigurationMap(newSnapshot.get(i8 - 1))) : null, newSnapshot.get(i8)));
                            i9++;
                        }
                    }
                    i8++;
                    list = oldSnapshot;
                    it4 = it;
                    l3 = null;
                }
                if (linkedList2.isEmpty() && linkedList3.isEmpty() && linkedList.isEmpty()) {
                    return null;
                }
                return new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData(linkedList2, linkedList3, linkedList);
            }
        }
    }

    private static long Camera2StreamConfigurationMap(com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe) {
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).getId();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.TextWireframe) wireframe).getId();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ImageWireframe) wireframe).getId();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe) wireframe).getId();
        }
        if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) {
            return ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.WebviewWireframe) wireframe).getId();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Symbol;", "", "", "p0", "p1", "", "p2", "<init>", "(ZZLjava/lang/Integer;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class Symbol {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        java.lang.Integer Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        boolean getHighSpeedVideoFpsRanges;

        public Symbol(boolean z, boolean z2, java.lang.Integer num) {
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighSpeedVideoFpsRanges = z2;
            this.Camera2StreamConfigurationMap = num;
        }

        public /* synthetic */ Symbol(boolean z, boolean z2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, (i & 4) != 0 ? null : num);
        }

        public final java.lang.String toString() {
            boolean z = this.getHighSpeedVideoFpsRangesFor;
            boolean z2 = this.getHighSpeedVideoFpsRanges;
            java.lang.Integer num = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Symbol(getHighSpeedVideoFpsRangesFor=");
            sb.append(z);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(z2);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
            int hashCode2 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
            java.lang.Integer num = this.Camera2StreamConfigurationMap;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol)) {
                return false;
            }
            com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol symbol = (com.datadog.android.sessionreplay.internal.processor.MutationResolver.Symbol) p0;
            return this.getHighSpeedVideoFpsRangesFor == symbol.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == symbol.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, symbol.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry;", "", "<init>", "()V", "Index", "Reference", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry$Index;", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry$Reference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class Entry {
        private Entry() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry$Reference;", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry;", "", "id", "<init>", "(J)V", "J", "getId", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Reference extends com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry {
            private final long id;

            public Reference(long j) {
                super(null);
                this.id = j;
            }

            public final long getId() {
                return this.id;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry$Index;", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver$Entry;", "", "index", "<init>", "(I)V", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Index extends com.datadog.android.sessionreplay.internal.processor.MutationResolver.Entry {
            private final int index;

            public Index(int i) {
                super(null);
                this.index = i;
            }

            public final int getIndex() {
                return this.index;
            }
        }

        public /* synthetic */ Entry(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
