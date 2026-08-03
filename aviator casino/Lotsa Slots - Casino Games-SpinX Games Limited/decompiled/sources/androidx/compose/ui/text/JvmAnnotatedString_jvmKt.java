package androidx.compose.ui.text;

/* compiled from: JvmAnnotatedString.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a,\u0010\b\u001a\u00020\t*\u00020\t2\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0000¨\u0006\f"}, d2 = {"collectRangeTransitions", "", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "target", "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.AnnotatedString transform(final androidx.compose.ui.text.AnnotatedString annotatedString, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.String> function3) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.TreeSet sortedSetOf = kotlin.collections.SetsKt.sortedSetOf(0, java.lang.Integer.valueOf(annotatedString.getText().length()));
        java.util.TreeSet treeSet = sortedSetOf;
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), treeSet);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), treeSet);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSet);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = "";
        final java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(0, 0));
        kotlin.collections.CollectionsKt.windowed$default(sortedSetOf, 2, 0, false, new kotlin.jvm.functions.Function1<java.util.List<? extends java.lang.Integer>, java.lang.Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Integer invoke2(java.util.List<java.lang.Integer> list) {
                int intValue = list.get(0).intValue();
                int intValue2 = list.get(1).intValue();
                objectRef.element = objectRef.element + function3.invoke(annotatedString.getText(), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
                return mutableMapOf.put(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(objectRef.element.length()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends java.lang.Integer> list) {
                return invoke2((java.util.List<java.lang.Integer>) list);
            }
        }, 6, null);
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        java.util.ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                androidx.compose.ui.text.SpanStyle item = range.getItem();
                java.lang.Object obj = mutableMapOf.get(java.lang.Integer.valueOf(range.getStart()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                int intValue = ((java.lang.Number) obj).intValue();
                java.lang.Object obj2 = mutableMapOf.get(java.lang.Integer.valueOf(range.getEnd()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                arrayList4.add(new androidx.compose.ui.text.AnnotatedString.Range(item, intValue, ((java.lang.Number) obj2).intValue()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i2);
                androidx.compose.ui.text.ParagraphStyle item2 = range2.getItem();
                java.lang.Object obj3 = mutableMapOf.get(java.lang.Integer.valueOf(range2.getStart()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                int intValue2 = ((java.lang.Number) obj3).intValue();
                java.lang.Object obj4 = mutableMapOf.get(java.lang.Integer.valueOf(range2.getEnd()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                arrayList5.add(new androidx.compose.ui.text.AnnotatedString.Range(item2, intValue2, ((java.lang.Number) obj4).intValue()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends java.lang.Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.compose.ui.text.AnnotatedString.Range<? extends java.lang.Object> range3 = annotations$ui_text_release.get(i3);
                java.lang.Object item3 = range3.getItem();
                java.lang.Object obj5 = mutableMapOf.get(java.lang.Integer.valueOf(range3.getStart()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj5);
                int intValue3 = ((java.lang.Number) obj5).intValue();
                java.lang.Object obj6 = mutableMapOf.get(java.lang.Integer.valueOf(range3.getEnd()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj6);
                arrayList6.add(new androidx.compose.ui.text.AnnotatedString.Range(item3, intValue3, ((java.lang.Number) obj6).intValue()));
            }
            arrayList3 = arrayList6;
        }
        return new androidx.compose.ui.text.AnnotatedString((java.lang.String) objectRef.element, arrayList, arrayList2, arrayList3);
    }

    private static final void collectRangeTransitions(java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<?>> list, java.util.SortedSet<java.lang.Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.AnnotatedString.Range<?> range = list.get(i);
                sortedSet.add(java.lang.Integer.valueOf(range.getStart()));
                sortedSet.add(java.lang.Integer.valueOf(range.getEnd()));
            }
        }
    }
}
