package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/ValidateDocumentUtil;", "", "<init>", "()V", "", "documentId", "pattern", "flag", "", "validatePattern$i18n_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidateDocumentUtil {
    @javax.inject.Inject
    public ValidateDocumentUtil() {
    }

    public final boolean validatePattern$i18n_release(java.lang.String documentId, java.lang.String pattern, java.lang.String flag) {
        kotlin.text.Regex regex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        if (kotlin.text.StringsKt.equals(flag, "i", true)) {
            regex = new kotlin.text.Regex(pattern, kotlin.text.RegexOption.IGNORE_CASE);
        } else {
            regex = new kotlin.text.Regex(pattern);
        }
        return regex.matches(documentId);
    }
}
