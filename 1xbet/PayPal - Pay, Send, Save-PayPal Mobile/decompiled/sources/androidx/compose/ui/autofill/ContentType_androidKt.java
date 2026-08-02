package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"", "contentHint", "Landroidx/compose/ui/autofill/ContentType;", "ContentType", "(Ljava/lang/String;)Landroidx/compose/ui/autofill/ContentType;", "", "getContentHints", "(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;", "contentHints"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentType_androidKt {
    public static final androidx.compose.ui.autofill.ContentType ContentType(java.lang.String str) {
        return new androidx.compose.ui.autofill.AndroidContentType(kotlin.collections.SetsKt.setOf(str));
    }

    public static final java.lang.String[] getContentHints(androidx.compose.ui.autofill.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(contentType, "");
        return (java.lang.String[]) ((androidx.compose.ui.autofill.AndroidContentType) contentType).getHighSpeedVideoFpsRanges().toArray(new java.lang.String[0]);
    }
}
