package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u00020\r*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u0016\u0010\u0015\u001a8\u0010\u001b\u001a\u00020\r*\u00020\u00172\"\u0010\u001a\u001a\u001e\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\r0\u0018H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a8\u0010\u001d\u001a\u00020\r*\u00020\u00172\"\u0010\u001a\u001a\u001e\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\r0\u0018H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001c\u001aZ\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e28\u0010\"\u001a4\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\r0!H\u0080\b¢\u0006\u0004\b#\u0010$\u001a%\u0010%\u001a\u00020\r*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "originalRange", "", "replaceStart", "replaceEnd", "insertedTextLength", "adjustTextRange-vJH6DeI", "(JIII)J", "adjustTextRange", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "index", "", "text", "", "insert", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;ILjava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "placeCursorAtEnd", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "selectAll", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "block", "forEachChange", "(Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Lkotlin/jvm/functions/Function2;)V", "forEachChangeReversed", "", "a", util.h.xy.cb.b.f1091, "Lkotlin/Function4;", "onFound", "findCommonPrefixAndSuffix", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function4;)V", "setSelectionCoerced"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldBufferKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L15;
     */
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2179adjustTextRangevJH6DeI(long j, int i, int i2, int i3) {
        int i4;
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j);
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(j);
        if (m8036getMaximpl < i) {
            return j;
        }
        if (m8037getMinimpl > i || i2 > m8036getMaximpl) {
            if (m8037getMinimpl > i && m8036getMaximpl < i2) {
                i += i3;
                m8037getMinimpl = i;
            } else if (m8037getMinimpl >= i2) {
                i4 = i3 - (i2 - i);
                m8037getMinimpl += i4;
                i = m8036getMaximpl + i4;
            } else if (i < m8037getMinimpl) {
                int i5 = i + i3;
                i4 = i3 - (i2 - i);
                m8037getMinimpl = i5;
                i = m8036getMaximpl + i4;
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(m8037getMinimpl, i);
        }
        i4 = i3 - (i2 - i);
    }

    public static final void insert(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, java.lang.String str) {
        textFieldBuffer.replace(i, i, str);
    }

    public static final void delete(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.replace(i, i2, "");
    }

    public static final void placeCursorAtEnd(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m2175setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void forEachChange(androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList changeList, kotlin.jvm.functions.Function2<? super androidx.compose.ui.text.TextRange, ? super androidx.compose.ui.text.TextRange, kotlin.Unit> function2) {
        for (int i = 0; i < changeList.getChangeCount(); i++) {
            function2.invoke(androidx.compose.ui.text.TextRange.m8027boximpl(changeList.mo2178getRangejx7JFs(i)), androidx.compose.ui.text.TextRange.m8027boximpl(changeList.mo2177getOriginalRangejx7JFs(i)));
        }
    }

    public static final void forEachChangeReversed(androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList changeList, kotlin.jvm.functions.Function2<? super androidx.compose.ui.text.TextRange, ? super androidx.compose.ui.text.TextRange, kotlin.Unit> function2) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            function2.invoke(androidx.compose.ui.text.TextRange.m8027boximpl(changeList.mo2178getRangejx7JFs(changeCount)), androidx.compose.ui.text.TextRange.m8027boximpl(changeList.mo2177getOriginalRangejx7JFs(changeCount)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r4 < r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void findCommonPrefixAndSuffix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        if (charSequence.length() > 0 && charSequence2.length() > 0) {
            boolean z = false;
            i = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (charSequence.charAt(i2) == charSequence2.charAt(i)) {
                        i2++;
                        i++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    int i3 = length - 1;
                    int i4 = length2 - 1;
                    if (charSequence.charAt(i3) == charSequence2.charAt(i4)) {
                        length = i3;
                        length2 = i4;
                    } else {
                        z2 = true;
                    }
                }
                if (i2 >= length || i >= length2 || (z && z2)) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        function4.invoke(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(length2));
    }

    public static /* synthetic */ void setSelectionCoerced$default(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        setSelectionCoerced(textFieldBuffer, i, i2);
    }

    public static final void setSelectionCoerced(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer, int i, int i2) {
        textFieldBuffer.m2175setSelection5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(kotlin.ranges.RangesKt.coerceIn(i, 0, textFieldBuffer.getLength()), kotlin.ranges.RangesKt.coerceIn(i2, 0, textFieldBuffer.getLength())));
    }
}
