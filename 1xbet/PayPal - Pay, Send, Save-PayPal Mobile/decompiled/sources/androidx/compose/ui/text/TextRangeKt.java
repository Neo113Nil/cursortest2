package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0000\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\r\u001a!\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000b"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "TextRange", "(II)J", "index", "(I)J", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "coerceIn", "p0", "p1", "", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextRangeKt {
    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final java.lang.String m8046substringFDrldGo(java.lang.CharSequence charSequence, long j) {
        return charSequence.subSequence(androidx.compose.ui.text.TextRange.m8037getMinimpl(j), androidx.compose.ui.text.TextRange.m8036getMaximpl(j)).toString();
    }

    public static final long TextRange(int i, int i2) {
        return androidx.compose.ui.text.TextRange.m8028constructorimpl(getHighResolutionOutputSizeshNQ4ISI(i, i2));
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m8045coerceIn8ffj60Q(long j, int i, int i2) {
        int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(j);
        if (m8039getStartimpl < i) {
            m8039getStartimpl = i;
        }
        if (m8039getStartimpl > i2) {
            m8039getStartimpl = i2;
        }
        int m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(j);
        if (m8034getEndimpl >= i) {
            i = m8034getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (m8039getStartimpl == androidx.compose.ui.text.TextRange.m8039getStartimpl(j) && i2 == androidx.compose.ui.text.TextRange.m8034getEndimpl(j)) ? j : TextRange(m8039getStartimpl, i2);
    }

    private static final long getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        if (i < 0 || i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start and end cannot be negative. [start: ");
            sb.append(i);
            sb.append(", end: ");
            sb.append(i2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return (i2 & 4294967295L) | (i << 32);
    }
}
