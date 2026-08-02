package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "fullText", "boldText", "Lcom/paypal/pds/core/RichText;", "createRichTextWithBoldSubstring", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RichTextUtilsKt {
    public static final com.paypal.pds.core.RichText createRichTextWithBoldSubstring(final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.RichTextUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.RichTextUtilsKt.$r8$lambda$my_tlifBqxdtBABKbGGLAjJdKH0(str2, str, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$my_tlifBqxdtBABKbGGLAjJdKH0(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        int indexOf$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        if (str.length() == 0 || (indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, str, 0, false, 6, (java.lang.Object) null)) == -1) {
            com.paypal.pds.core.Builder.append$default(builder, str2, null, false, 6, null);
        } else {
            java.lang.String substring = str2.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            com.paypal.pds.core.Builder.append$default(builder, str, null, true, 2, null);
            java.lang.String substring2 = str2.substring(indexOf$default + str.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
