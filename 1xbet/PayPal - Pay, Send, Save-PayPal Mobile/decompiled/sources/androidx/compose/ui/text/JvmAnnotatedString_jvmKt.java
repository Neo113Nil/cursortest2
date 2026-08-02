package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u001a3\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/text/AnnotatedString;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.AnnotatedString transform(final androidx.compose.ui.text.AnnotatedString annotatedString, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.String> function3) {
        java.util.ArrayList arrayList;
        java.util.TreeSet sortedSetOf = kotlin.collections.SetsKt.sortedSetOf(0, java.lang.Integer.valueOf(annotatedString.getText().length()));
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
        java.util.TreeSet treeSet = sortedSetOf;
        if (annotations$ui_text != null) {
            int size = annotations$ui_text.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation> range = annotations$ui_text.get(i);
                treeSet.add(java.lang.Integer.valueOf(range.getStart()));
                treeSet.add(java.lang.Integer.valueOf(range.getEnd()));
            }
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = "";
        final java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(0, 0));
        kotlin.collections.CollectionsKt.windowed$default(sortedSetOf, 2, 0, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.text.JvmAnnotatedString_jvmKt.$r8$lambda$KXV1HLYvHa1Yi0h3acDoadmFJMM(kotlin.jvm.internal.Ref.ObjectRef.this, function3, annotatedString, mutableMapOf, (java.util.List) obj);
            }
        }, 6, null);
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> annotations$ui_text2 = annotatedString.getAnnotations$ui_text();
        if (annotations$ui_text2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(annotations$ui_text2.size());
            int size2 = annotations$ui_text2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation> range2 = annotations$ui_text2.get(i2);
                androidx.compose.ui.text.AnnotatedString.Annotation item = range2.getItem();
                java.lang.Object obj = mutableMapOf.get(java.lang.Integer.valueOf(range2.getStart()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                int intValue = ((java.lang.Number) obj).intValue();
                java.lang.Object obj2 = mutableMapOf.get(java.lang.Integer.valueOf(range2.getEnd()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                arrayList2.add(new androidx.compose.ui.text.AnnotatedString.Range(item, intValue, ((java.lang.Number) obj2).intValue()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new androidx.compose.ui.text.AnnotatedString(arrayList, (java.lang.String) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public static /* synthetic */ java.lang.Integer $r8$lambda$KXV1HLYvHa1Yi0h3acDoadmFJMM(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.functions.Function3 function3, androidx.compose.ui.text.AnnotatedString annotatedString, java.util.Map map, java.util.List list) {
        int intValue = ((java.lang.Number) list.get(0)).intValue();
        int intValue2 = ((java.lang.Number) list.get(1)).intValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.String) objectRef.element);
        sb.append((java.lang.String) function3.invoke(annotatedString.getText(), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2)));
        objectRef.element = sb.toString();
        return (java.lang.Integer) map.put(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(((java.lang.String) objectRef.element).length()));
    }
}
