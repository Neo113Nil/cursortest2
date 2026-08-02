package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/FailoverReasonsHandler;", "", "<init>", "()V", "", "Lcom/miteksystems/misnap/core/UserAction;", "", "Camera2StreamConfigurationMap", "()Ljava/util/Map;", "", "warnings", "", "handleFrameWarnings", "(Ljava/util/List;)V", com.miteksystems.misnap.workflow.fragment.FailoverFragment.MAX_REASONS, com.miteksystems.misnap.workflow.fragment.FailoverFragment.MIN_REASON_PERCENTAGE, "getTopFailedReasons", "(II)Ljava/util/List;", "reset", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class FailoverReasonsHandler {
    public static final int DEFAULT_PERCENTAGE_THRESHOLD = 25;
    public static final int DEFAULT_REASONS_LIMIT = 2;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Map<com.miteksystems.misnap.core.UserAction, java.lang.Integer> getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    private static java.util.Map<com.miteksystems.misnap.core.UserAction, java.lang.Integer> Camera2StreamConfigurationMap() {
        return kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE, 0), kotlin.TuplesKt.to(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE, 0));
    }

    public final java.util.List<com.miteksystems.misnap.core.UserAction> getTopFailedReasons(int maxReasons, int minReasonPercentage) {
        java.util.Map<com.miteksystems.misnap.core.UserAction, java.lang.Integer> map = this.getHighSpeedVideoFpsRangesFor;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.util.Map.Entry<com.miteksystems.misnap.core.UserAction, java.lang.Integer>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry<com.miteksystems.misnap.core.UserAction, java.lang.Integer> next = it.next();
            int intValue = next.getValue().intValue();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if ((i != 0 ? (int) ((intValue / i) * 100.0f) : 0) >= minReasonPercentage) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return kotlin.collections.CollectionsKt.listOf(com.miteksystems.misnap.core.UserAction.NONE.INSTANCE);
        }
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(linkedHashMap.entrySet(), new com.miteksystems.misnap.workflow.util.FailoverReasonsHandler.a());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        java.util.Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList.add((com.miteksystems.misnap.core.UserAction) ((java.util.Map.Entry) it2.next()).getKey());
        }
        return arrayList.size() > maxReasons ? arrayList.subList(0, maxReasons) : arrayList;
    }

    public final void reset() {
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public final void handleFrameWarnings(java.util.List<? extends com.miteksystems.misnap.core.UserAction> warnings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(warnings, "");
        this.getHighResolutionOutputSizeshNQ4ISI++;
        for (com.miteksystems.misnap.core.UserAction userAction : warnings) {
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(userAction)) {
                java.util.Map<com.miteksystems.misnap.core.UserAction, java.lang.Integer> map = this.getHighSpeedVideoFpsRangesFor;
                map.put(userAction, java.lang.Integer.valueOf(((java.lang.Number) kotlin.collections.MapsKt.getValue(map, userAction)).intValue() + 1));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", util.h.xy.cb.b.f1091, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t2).getValue(), (java.lang.Integer) ((java.util.Map.Entry) t).getValue());
        }
    }

    public static /* synthetic */ java.util.List getTopFailedReasons$default(com.miteksystems.misnap.workflow.util.FailoverReasonsHandler failoverReasonsHandler, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 25;
        }
        return failoverReasonsHandler.getTopFailedReasons(i, i2);
    }
}
