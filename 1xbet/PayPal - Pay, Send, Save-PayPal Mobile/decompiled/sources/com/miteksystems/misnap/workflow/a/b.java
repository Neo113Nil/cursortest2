package com.miteksystems.misnap.workflow.a;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u001f\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\fR,\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/miteksystems/misnap/workflow/a/b;", "", "", "", "lookupTable", "input", "currentScale", "a", "fontScale", "Landroid/widget/TextView;", "textView", "", "(Landroid/widget/TextView;F)V", util.h.xy.cb.b.f1091, "Ljava/util/Map;", "nonLinearScaleLookupTables", "c", "DEFAULT_LOOKUP_TABLE", "<init>", "()V", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.miteksystems.misnap.workflow.a.b f4152a = new com.miteksystems.misnap.workflow.a.b();
    private static final java.util.Map<java.lang.Float, java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.Float, java.util.Map<java.lang.Float, java.lang.Float>> getHighSpeedVideoFpsRanges;

    public final /* synthetic */ void a(android.widget.TextView textView, float currentScale) {
        java.lang.Object next;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        float deriveDimension = android.os.Build.VERSION.SDK_INT >= 34 ? android.util.TypedValue.deriveDimension(2, textView.getTextSize(), textView.getContext().getResources().getDisplayMetrics()) : textView.getTextSize() / textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        java.util.Iterator<T> it = getHighSpeedVideoFpsRanges.keySet().iterator();
        java.lang.Object obj2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = java.lang.Math.abs(((java.lang.Number) next).floatValue() - currentScale);
                do {
                    java.lang.Object next2 = it.next();
                    float abs2 = java.lang.Math.abs(((java.lang.Number) next2).floatValue() - currentScale);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map<java.lang.Float, java.lang.Float> map = getHighSpeedVideoFpsRanges.get((java.lang.Float) next);
        if (map == null) {
            map = getHighResolutionOutputSizeshNQ4ISI;
        }
        java.lang.Float f = map.get(java.lang.Float.valueOf(deriveDimension));
        if (f != null) {
            deriveDimension = f.floatValue();
        } else {
            java.lang.Float f2 = map.get(java.lang.Float.valueOf(deriveDimension));
            if (f2 != null) {
                deriveDimension = f2.floatValue();
            } else {
                java.util.List sorted = kotlin.collections.CollectionsKt.sorted(map.keySet());
                java.util.ListIterator listIterator = sorted.listIterator(sorted.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (((java.lang.Number) obj).floatValue() <= deriveDimension) {
                            break;
                        }
                    }
                }
                java.lang.Float f3 = (java.lang.Float) obj;
                java.util.Iterator it2 = sorted.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it2.next();
                    if (((java.lang.Number) next3).floatValue() >= deriveDimension) {
                        obj2 = next3;
                        break;
                    }
                }
                java.lang.Float f4 = (java.lang.Float) obj2;
                if (f3 == null) {
                    deriveDimension *= currentScale;
                } else if (f4 != null) {
                    float floatValue = ((java.lang.Number) kotlin.collections.MapsKt.getValue(map, f3)).floatValue();
                    deriveDimension = (((deriveDimension - f3.floatValue()) * (((java.lang.Number) kotlin.collections.MapsKt.getValue(map, f4)).floatValue() - floatValue)) / (f4.floatValue() - f3.floatValue())) + floatValue;
                }
            }
        }
        textView.setAutoSizeTextTypeWithDefaults(0);
        textView.setTextSize(1, deriveDimension);
    }

    private b() {
    }

    static {
        java.lang.Float valueOf = java.lang.Float.valueOf(8.0f);
        kotlin.Pair pair = kotlin.TuplesKt.to(valueOf, java.lang.Float.valueOf(8.4f));
        java.lang.Float valueOf2 = java.lang.Float.valueOf(10.0f);
        kotlin.Pair pair2 = kotlin.TuplesKt.to(valueOf2, java.lang.Float.valueOf(10.5f));
        java.lang.Float valueOf3 = java.lang.Float.valueOf(12.0f);
        kotlin.Pair pair3 = kotlin.TuplesKt.to(valueOf3, java.lang.Float.valueOf(12.6f));
        java.lang.Float valueOf4 = java.lang.Float.valueOf(14.0f);
        kotlin.Pair pair4 = kotlin.TuplesKt.to(valueOf4, java.lang.Float.valueOf(14.8f));
        java.lang.Float valueOf5 = java.lang.Float.valueOf(18.0f);
        kotlin.Pair pair5 = kotlin.TuplesKt.to(valueOf5, java.lang.Float.valueOf(18.6f));
        java.lang.Float valueOf6 = java.lang.Float.valueOf(20.0f);
        kotlin.Pair pair6 = kotlin.TuplesKt.to(valueOf6, java.lang.Float.valueOf(20.6f));
        java.lang.Float valueOf7 = java.lang.Float.valueOf(24.0f);
        java.lang.Float valueOf8 = java.lang.Float.valueOf(24.4f);
        kotlin.Pair pair7 = kotlin.TuplesKt.to(valueOf7, valueOf8);
        java.lang.Float valueOf9 = java.lang.Float.valueOf(30.0f);
        kotlin.Pair pair8 = kotlin.TuplesKt.to(valueOf9, valueOf9);
        java.lang.Float valueOf10 = java.lang.Float.valueOf(100.0f);
        kotlin.Pair pair9 = kotlin.TuplesKt.to(java.lang.Float.valueOf(1.05f), kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, kotlin.TuplesKt.to(valueOf10, valueOf10)));
        kotlin.Pair pair10 = kotlin.TuplesKt.to(valueOf, java.lang.Float.valueOf(8.8f));
        kotlin.Pair pair11 = kotlin.TuplesKt.to(valueOf2, java.lang.Float.valueOf(11.0f));
        kotlin.Pair pair12 = kotlin.TuplesKt.to(valueOf3, java.lang.Float.valueOf(13.2f));
        java.lang.Float valueOf11 = java.lang.Float.valueOf(15.6f);
        kotlin.Pair pair13 = kotlin.TuplesKt.to(java.lang.Float.valueOf(1.1f), kotlin.collections.MapsKt.mapOf(pair10, pair11, pair12, kotlin.TuplesKt.to(valueOf4, valueOf11), kotlin.TuplesKt.to(valueOf5, java.lang.Float.valueOf(19.2f)), kotlin.TuplesKt.to(valueOf6, java.lang.Float.valueOf(21.2f)), kotlin.TuplesKt.to(valueOf7, java.lang.Float.valueOf(24.8f)), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10)));
        kotlin.Pair pair14 = kotlin.TuplesKt.to(java.lang.Float.valueOf(1.15f), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(valueOf, java.lang.Float.valueOf(9.2f)), kotlin.TuplesKt.to(valueOf2, java.lang.Float.valueOf(11.5f)), kotlin.TuplesKt.to(valueOf3, java.lang.Float.valueOf(13.8f)), kotlin.TuplesKt.to(valueOf4, java.lang.Float.valueOf(16.4f)), kotlin.TuplesKt.to(valueOf5, java.lang.Float.valueOf(19.8f)), kotlin.TuplesKt.to(valueOf6, java.lang.Float.valueOf(21.8f)), kotlin.TuplesKt.to(valueOf7, java.lang.Float.valueOf(25.2f)), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10)));
        kotlin.Pair pair15 = kotlin.TuplesKt.to(valueOf, java.lang.Float.valueOf(9.6f));
        kotlin.Pair pair16 = kotlin.TuplesKt.to(valueOf2, valueOf3);
        java.lang.Float valueOf12 = java.lang.Float.valueOf(14.4f);
        kotlin.Pair pair17 = kotlin.TuplesKt.to(java.lang.Float.valueOf(1.2f), kotlin.collections.MapsKt.mapOf(pair15, pair16, kotlin.TuplesKt.to(valueOf3, valueOf12), kotlin.TuplesKt.to(valueOf4, java.lang.Float.valueOf(17.2f)), kotlin.TuplesKt.to(valueOf5, java.lang.Float.valueOf(20.4f)), kotlin.TuplesKt.to(valueOf6, java.lang.Float.valueOf(22.4f)), kotlin.TuplesKt.to(valueOf7, java.lang.Float.valueOf(25.6f)), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10)));
        kotlin.Pair pair18 = kotlin.TuplesKt.to(valueOf, java.lang.Float.valueOf(10.4f));
        kotlin.Pair pair19 = kotlin.TuplesKt.to(valueOf2, java.lang.Float.valueOf(13.0f));
        kotlin.Pair pair20 = kotlin.TuplesKt.to(valueOf3, valueOf11);
        kotlin.Pair pair21 = kotlin.TuplesKt.to(valueOf4, java.lang.Float.valueOf(18.8f));
        java.lang.Float valueOf13 = java.lang.Float.valueOf(21.6f);
        kotlin.Pair pair22 = kotlin.TuplesKt.to(java.lang.Float.valueOf(1.3f), kotlin.collections.MapsKt.mapOf(pair18, pair19, pair20, pair21, kotlin.TuplesKt.to(valueOf5, valueOf13), kotlin.TuplesKt.to(valueOf6, java.lang.Float.valueOf(23.6f)), kotlin.TuplesKt.to(valueOf7, java.lang.Float.valueOf(26.4f)), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10)));
        kotlin.Pair pair23 = kotlin.TuplesKt.to(valueOf, valueOf3);
        java.lang.Float valueOf14 = java.lang.Float.valueOf(15.0f);
        kotlin.Pair pair24 = kotlin.TuplesKt.to(valueOf2, valueOf14);
        kotlin.Pair pair25 = kotlin.TuplesKt.to(valueOf3, valueOf5);
        java.lang.Float valueOf15 = java.lang.Float.valueOf(22.0f);
        kotlin.Pair pair26 = kotlin.TuplesKt.to(valueOf4, valueOf15);
        kotlin.Pair pair27 = kotlin.TuplesKt.to(valueOf5, valueOf7);
        java.lang.Float valueOf16 = java.lang.Float.valueOf(26.0f);
        kotlin.Pair pair28 = kotlin.TuplesKt.to(valueOf6, valueOf16);
        java.lang.Float valueOf17 = java.lang.Float.valueOf(28.0f);
        getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(pair9, pair13, pair14, pair17, pair22, kotlin.TuplesKt.to(java.lang.Float.valueOf(1.5f), kotlin.collections.MapsKt.mapOf(pair23, pair24, pair25, pair26, pair27, pair28, kotlin.TuplesKt.to(valueOf7, valueOf17), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10))), kotlin.TuplesKt.to(java.lang.Float.valueOf(1.8f), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(valueOf, valueOf12), kotlin.TuplesKt.to(valueOf2, valueOf5), kotlin.TuplesKt.to(valueOf3, valueOf13), kotlin.TuplesKt.to(valueOf4, valueOf8), kotlin.TuplesKt.to(valueOf5, valueOf16), kotlin.TuplesKt.to(valueOf6, valueOf9), kotlin.TuplesKt.to(valueOf7, java.lang.Float.valueOf(32.0f)), kotlin.TuplesKt.to(valueOf9, java.lang.Float.valueOf(34.0f)), kotlin.TuplesKt.to(valueOf10, valueOf10))));
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(valueOf, valueOf3), kotlin.TuplesKt.to(valueOf2, valueOf14), kotlin.TuplesKt.to(valueOf3, valueOf5), kotlin.TuplesKt.to(valueOf4, valueOf15), kotlin.TuplesKt.to(valueOf5, valueOf7), kotlin.TuplesKt.to(valueOf6, valueOf16), kotlin.TuplesKt.to(valueOf7, valueOf17), kotlin.TuplesKt.to(valueOf9, valueOf9), kotlin.TuplesKt.to(valueOf10, valueOf10));
    }
}
