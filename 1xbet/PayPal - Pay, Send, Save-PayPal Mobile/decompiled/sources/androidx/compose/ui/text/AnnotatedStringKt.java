package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\u001a@\u0010\u0000\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0001H\u0002\u001a \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0000\u001a*\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0018\u00010\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001aD\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001aa\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0015*\u00020\t2\u0006\u0010\n\u001a\u00020\u00072>\b\u0004\u0010\u0016\u001a8\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0080\b\u001a\u0014\u0010\u001c\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u0014\u0010\u001f\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u0014\u0010 \u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u0014\u0010!\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a=\u0010\"\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u00052\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0086\b¢\u0006\u0002\u0010(\u001a?\u0010\"\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0019\b\u0004\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0086\b¢\u0006\u0002\u0010)\u001aG\u0010*\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0019\b\u0004\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0086\b¢\u0006\u0002\u0010.\u001a?\u0010*\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u0010/\u001a\u0002002\u0019\b\u0004\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0086\b¢\u0006\u0002\u00101\u001a?\u0010*\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u00102\u001a\u0002032\u0019\b\u0004\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0087\b¢\u0006\u0002\u00104\u001a=\u00105\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020$*\u00020%2\u0006\u00106\u001a\u0002072\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002H#0\u0011¢\u0006\u0002\b'H\u0086\b¢\u0006\u0002\u00108\u001aD\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00152\u0016\u0010:\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00150\u0002\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\"\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u001a\u0016\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u0007\u001a\"\u0010>\u001a\u00020\t2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020@0\u0011¢\u0006\u0002\b'H\u0086\b\u001a(\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0000\u001a(\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\rH\u0000\u001a\b\u0010L\u001a\u00020\tH\u0000\"\u000e\u0010K\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"constructAnnotationsFromSpansAndParagraphs", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "spanStyles", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "normalizedParagraphStyles", "Landroidx/compose/ui/text/AnnotatedString;", "defaultParagraphStyle", "getLocalParagraphStyles", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "", "end", "getLocalAnnotations", "predicate", "Lkotlin/Function1;", "", "substringWithoutParagraphStyles", "mapEachParagraphStyle", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "paragraphStyle", "toUpperCase", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "toLowerCase", "capitalize", "decapitalize", "withStyle", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withAnnotation", "tag", "", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "filterRanges", "ranges", "AnnotatedString", "text", "spanStyle", "buildAnnotatedString", "builder", "", "contains", "baseStart", "baseEnd", "targetStart", "targetEnd", "intersect", "lStart", "lEnd", "rStart", "rEnd", "EmptyAnnotatedString", "emptyAnnotatedString", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final androidx.compose.ui.text.AnnotatedString getHighSpeedVideoSizes = new androidx.compose.ui.text.AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        boolean z = i == i2;
        boolean z2 = i3 == i4;
        return ((i < i4) & (i3 < i2)) | ((z | z2) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> Camera2StreamConfigurationMap(java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> normalizedParagraphStyles(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.ParagraphStyle paragraphStyle) {
        java.util.List emptyList;
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text();
        if (paragraphStylesOrNull$ui_text == null || (emptyList = kotlin.collections.CollectionsKt.sortedWith(paragraphStylesOrNull$ui_text, new java.util.Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((androidx.compose.ui.text.AnnotatedString.Range) t).getStart()), java.lang.Integer.valueOf(((androidx.compose.ui.text.AnnotatedString.Range) t2).getStart()));
            }
        })) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        int size = emptyList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.text.AnnotatedString.Range range = (androidx.compose.ui.text.AnnotatedString.Range) emptyList.get(i2);
            androidx.compose.ui.text.AnnotatedString.Range copy$default = androidx.compose.ui.text.AnnotatedString.Range.copy$default(range, paragraphStyle.merge((androidx.compose.ui.text.ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (i < copy$default.getStart()) {
                kotlin.collections.ArrayDeque arrayDeque2 = arrayDeque;
                if (arrayDeque2.isEmpty()) {
                    break;
                }
                androidx.compose.ui.text.AnnotatedString.Range range2 = (androidx.compose.ui.text.AnnotatedString.Range) arrayDeque.last();
                if (copy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(range2.getItem(), i, copy$default.getStart()));
                    i = copy$default.getStart();
                } else {
                    arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(range2.getItem(), i, range2.getEnd()));
                    i = range2.getEnd();
                    while (!arrayDeque2.isEmpty() && i == ((androidx.compose.ui.text.AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (i < copy$default.getStart()) {
                arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(paragraphStyle, i, copy$default.getStart()));
                i = copy$default.getStart();
            }
            androidx.compose.ui.text.AnnotatedString.Range range3 = (androidx.compose.ui.text.AnnotatedString.Range) arrayDeque.lastOrNull();
            if (range3 != null) {
                if (range3.getStart() == copy$default.getStart() && range3.getEnd() == copy$default.getEnd()) {
                    arrayDeque.removeLast();
                    arrayDeque.add(new androidx.compose.ui.text.AnnotatedString.Range(((androidx.compose.ui.text.ParagraphStyle) range3.getItem()).merge((androidx.compose.ui.text.ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
                } else if (range3.getStart() == range3.getEnd()) {
                    arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                    arrayDeque.removeLast();
                    arrayDeque.add(new androidx.compose.ui.text.AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
                } else {
                    if (range3.getEnd() < copy$default.getEnd()) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    arrayDeque.add(new androidx.compose.ui.text.AnnotatedString.Range(((androidx.compose.ui.text.ParagraphStyle) range3.getItem()).merge((androidx.compose.ui.text.ParagraphStyle) copy$default.getItem()), copy$default.getStart(), copy$default.getEnd()));
                }
            } else {
                arrayDeque.add(new androidx.compose.ui.text.AnnotatedString.Range(copy$default.getItem(), copy$default.getStart(), copy$default.getEnd()));
            }
        }
        while (i <= annotatedString.getText().length()) {
            kotlin.collections.ArrayDeque arrayDeque3 = arrayDeque;
            if (arrayDeque3.isEmpty()) {
                break;
            }
            androidx.compose.ui.text.AnnotatedString.Range range4 = (androidx.compose.ui.text.AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(range4.getItem(), i, range4.getEnd()));
            i = range4.getEnd();
            while (!arrayDeque3.isEmpty() && i == ((androidx.compose.ui.text.AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                arrayDeque.removeLast();
            }
        }
        if (i < annotatedString.getText().length()) {
            arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(paragraphStyle, i, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.AnnotatedString annotatedString, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Annotation, java.lang.Boolean> function1) {
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> annotations$ui_text;
        if (i == i2 || (annotations$ui_text = annotatedString.getAnnotations$ui_text()) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            if (function1 == null) {
                return annotations$ui_text;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(annotations$ui_text.size());
            int size = annotations$ui_text.size();
            while (i3 < size) {
                androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation> range = annotations$ui_text.get(i3);
                if (function1.invoke(range.getItem()).booleanValue()) {
                    arrayList.add(range);
                }
                i3++;
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(annotations$ui_text.size());
        int size2 = annotations$ui_text.size();
        while (i3 < size2) {
            androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation> range2 = annotations$ui_text.get(i3);
            if ((function1 == null || function1.invoke(range2.getItem()).booleanValue()) && intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList2.add(new androidx.compose.ui.text.AnnotatedString.Range(range2.getItem(), kotlin.ranges.RangesKt.coerceIn(range2.getStart(), i, i2) - i, kotlin.ranges.RangesKt.coerceIn(range2.getEnd(), i, i2) - i, range2.getTag()));
            }
            i3++;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.AnnotatedString getHighSpeedVideoFpsRanges(androidx.compose.ui.text.AnnotatedString annotatedString, int i, int i2) {
        java.lang.String str = "";
        if (i != i2) {
            java.lang.String substring = annotatedString.getText().substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            str = substring;
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(annotatedString, i, i2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Annotation, java.lang.Boolean>) new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highSpeedVideoFpsRangesFor2;
                highSpeedVideoFpsRangesFor2 = androidx.compose.ui.text.AnnotatedStringKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.text.AnnotatedString.Annotation) obj);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRangesFor2);
            }
        });
        if (highSpeedVideoFpsRangesFor == null) {
            highSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
        }
        return new androidx.compose.ui.text.AnnotatedString(str, highSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.AnnotatedString.Annotation annotation) {
        return !(annotation instanceof androidx.compose.ui.text.ParagraphStyle);
    }

    public static final <T> java.util.List<T> mapEachParagraphStyle(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.ParagraphStyle paragraphStyle, kotlin.jvm.functions.Function2<? super androidx.compose.ui.text.AnnotatedString, ? super androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>, ? extends T> function2) {
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        java.util.ArrayList arrayList = new java.util.ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle> range = normalizedParagraphStyles.get(i);
            arrayList.add(function2.invoke(getHighSpeedVideoFpsRanges(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString toUpperCase$default(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.intl.LocaleList localeList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localeList = androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String Camera2StreamConfigurationMap(androidx.compose.ui.text.intl.LocaleList localeList, java.lang.String str, int i, int i2) {
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return androidx.compose.ui.text.StringKt.toUpperCase(substring, localeList);
    }

    public static final androidx.compose.ui.text.AnnotatedString toUpperCase(androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.intl.LocaleList localeList) {
        return androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform(annotatedString, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                java.lang.String Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.ui.text.AnnotatedStringKt.Camera2StreamConfigurationMap(androidx.compose.ui.text.intl.LocaleList.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                return Camera2StreamConfigurationMap;
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString toLowerCase$default(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.intl.LocaleList localeList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localeList = androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoSizes(androidx.compose.ui.text.intl.LocaleList localeList, java.lang.String str, int i, int i2) {
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return androidx.compose.ui.text.StringKt.toLowerCase(substring, localeList);
    }

    public static final androidx.compose.ui.text.AnnotatedString toLowerCase(androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.intl.LocaleList localeList) {
        return androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform(annotatedString, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                java.lang.String highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.ui.text.AnnotatedStringKt.getHighSpeedVideoSizes(androidx.compose.ui.text.intl.LocaleList.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoSizes;
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString capitalize$default(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.intl.LocaleList localeList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localeList = androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final androidx.compose.ui.text.AnnotatedString capitalize(androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.intl.LocaleList localeList) {
        return androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform(annotatedString, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                java.lang.String highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.text.AnnotatedStringKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.text.intl.LocaleList.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRanges(androidx.compose.ui.text.intl.LocaleList localeList, java.lang.String str, int i, int i2) {
        if (i == 0) {
            java.lang.String substring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return androidx.compose.ui.text.StringKt.capitalize(substring, localeList);
        }
        java.lang.String substring2 = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return substring2;
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString decapitalize$default(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.intl.LocaleList localeList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            localeList = androidx.compose.ui.text.intl.LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final androidx.compose.ui.text.AnnotatedString decapitalize(androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.intl.LocaleList localeList) {
        return androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform(annotatedString, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                java.lang.String highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.text.AnnotatedStringKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.intl.LocaleList.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.intl.LocaleList localeList, java.lang.String str, int i, int i2) {
        if (i == 0) {
            java.lang.String substring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return androidx.compose.ui.text.StringKt.decapitalize(substring, localeList);
        }
        java.lang.String substring2 = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return substring2;
    }

    public static final <R> R withStyle(androidx.compose.ui.text.AnnotatedString.Builder builder, androidx.compose.ui.text.SpanStyle spanStyle, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushStyle);
        }
    }

    public static final <R> R withStyle(androidx.compose.ui.text.AnnotatedString.Builder builder, androidx.compose.ui.text.ParagraphStyle paragraphStyle, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushStyle);
        }
    }

    public static final <R> R withAnnotation(androidx.compose.ui.text.AnnotatedString.Builder builder, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushStringAnnotation);
        }
    }

    public static final <R> R withAnnotation(androidx.compose.ui.text.AnnotatedString.Builder builder, androidx.compose.ui.text.TtsAnnotation ttsAnnotation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushTtsAnnotation);
        }
    }

    @kotlin.Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @kotlin.ReplaceWith(expression = "withLink(, block)", imports = {}))
    public static final <R> R withAnnotation(androidx.compose.ui.text.AnnotatedString.Builder builder, androidx.compose.ui.text.UrlAnnotation urlAnnotation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushUrlAnnotation);
        }
    }

    public static final <R> R withLink(androidx.compose.ui.text.AnnotatedString.Builder builder, androidx.compose.ui.text.LinkAnnotation linkAnnotation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, ? extends R> function1) {
        int pushLink = builder.pushLink(linkAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(pushLink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.util.List<androidx.compose.ui.text.AnnotatedString.Range<T>> Camera2StreamConfigurationMap(java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (i > i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
            sb.append(i);
            sb.append(") should be less than or equal to end (");
            sb.append(i2);
            sb.append(')');
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.text.AnnotatedString.Range<? extends T> range = list.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(range.getItem(), java.lang.Math.max(i, range.getStart()) - i, java.lang.Math.min(i2, range.getEnd()) - i, range.getTag()));
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? null : arrayList2;
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString AnnotatedString$default(java.lang.String str, androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final androidx.compose.ui.text.AnnotatedString AnnotatedString(java.lang.String str, androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle) {
        return new androidx.compose.ui.text.AnnotatedString(str, kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? kotlin.collections.CollectionsKt.emptyList() : kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final androidx.compose.ui.text.AnnotatedString AnnotatedString(java.lang.String str, androidx.compose.ui.text.ParagraphStyle paragraphStyle) {
        return new androidx.compose.ui.text.AnnotatedString(str, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final androidx.compose.ui.text.AnnotatedString buildAnnotatedString(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString.Builder, kotlin.Unit> function1) {
        androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final androidx.compose.ui.text.AnnotatedString emptyAnnotatedString() {
        return getHighSpeedVideoSizes;
    }
}
