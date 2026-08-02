package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "escaped", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringKt {
    public static final java.lang.String escaped(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null), "\"", "\\\"", false, 4, (java.lang.Object) null), "'", "\\'", false, 4, (java.lang.Object) null), "\t", "\\t", false, 4, (java.lang.Object) null), "\b", "\\b", false, 4, (java.lang.Object) null);
    }
}
