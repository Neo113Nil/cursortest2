package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0006"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "(Ljava/util/List;I)I", "", "y", "findParagraphByY", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "", "action", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "findParagraphsByRange", "lineIndex", "findParagraphByLineIndex"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(java.util.List<androidx.compose.ui.text.ParagraphInfo> list, int i) {
        int i2;
        char c;
        int endIndex = ((androidx.compose.ui.text.ParagraphInfo) kotlin.collections.CollectionsKt.last((java.util.List) list)).getEndIndex();
        if (i > ((androidx.compose.ui.text.ParagraphInfo) kotlin.collections.CollectionsKt.last((java.util.List) list)).getEndIndex()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(i);
            sb.append(" should be less or equal than last line's end ");
            sb.append(endIndex);
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getStartIndex() > i) {
                c = 1;
            } else {
                c = paragraphInfo.getEndIndex() <= i ? (char) 65535 : (char) 0;
            }
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 < 0 || i2 >= list.size()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found paragraph index ");
            sb2.append(i2);
            sb2.append(" should be in range [0, ");
            sb2.append(list.size());
            sb2.append(").\nDebug info: index=");
            sb2.append(i);
            sb2.append(", paragraphs=[");
            sb2.append(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.MultiParagraphKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.CharSequence highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.text.MultiParagraphKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.text.ParagraphInfo) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            }, 31, null));
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.ParagraphInfo paragraphInfo) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(paragraphInfo.getStartIndex());
        sb.append(", ");
        sb.append(paragraphInfo.getEndIndex());
        sb.append(')');
        return sb.toString();
    }

    public static final int findParagraphByY(java.util.List<androidx.compose.ui.text.ParagraphInfo> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((androidx.compose.ui.text.ParagraphInfo) kotlin.collections.CollectionsKt.last((java.util.List) list)).getBottom()) {
            return kotlin.collections.CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i2);
            char c = paragraphInfo.getTop() > f ? (char) 1 : paragraphInfo.getBottom() <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m7885findParagraphsByRangeSbBc2M(java.util.List<androidx.compose.ui.text.ParagraphInfo> list, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.ParagraphInfo, kotlin.Unit> function1) {
        int size = list.size();
        for (int findParagraphByIndex = findParagraphByIndex(list, androidx.compose.ui.text.TextRange.m8037getMinimpl(j)); findParagraphByIndex < size; findParagraphByIndex++) {
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= androidx.compose.ui.text.TextRange.m8036getMaximpl(j)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }

    public static final int findParagraphByLineIndex(java.util.List<androidx.compose.ui.text.ParagraphInfo> list, int i) {
        char c;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            androidx.compose.ui.text.ParagraphInfo paragraphInfo = list.get(i3);
            if (paragraphInfo.getStartLineIndex() > i) {
                c = 1;
            } else {
                c = paragraphInfo.getEndLineIndex() <= i ? (char) 65535 : (char) 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
