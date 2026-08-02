package com.paypal.pds.utils;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\b\u001a\u00020\u0007*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00002\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\f0\u000bH\u0007¢\u0006\u0004\b\b\u0010\u000e*\n\u0010\u000f\"\u00020\u00072\u00020\u0007*\n\u0010\u0011\"\u00020\u00102\u00020\u0010"}, d2 = {"", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "trailingInline", "Lcom/paypal/pds/core/RichText;", "toRichText", "(Ljava/lang/String;Lcom/paypal/pds/core/Color;Lkotlin/jvm/functions/Function2;)Lcom/paypal/pds/core/RichText;", "text", "", "Lkotlin/Pair;", "links", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/pds/core/RichText;", "RichText", "Lcom/paypal/pds/core/Builder;", "Builder"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackwardCompatibleRichTextKt {
    @kotlin.Deprecated(message = "Builder has moved from utils to core", replaceWith = @kotlin.ReplaceWith(expression = "Builder", imports = {"com.paypal.pds.core.Builder"}))
    public static /* synthetic */ void Builder$annotations() {
    }

    @kotlin.Deprecated(message = "RichText has moved from utils to core", replaceWith = @kotlin.ReplaceWith(expression = "RichText", imports = {"com.paypal.pds.core.RichText"}))
    public static /* synthetic */ void RichText$annotations() {
    }

    public static /* synthetic */ com.paypal.pds.core.RichText toRichText$default(java.lang.String str, com.paypal.pds.core.Color color, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            color = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return toRichText(str, color, function2);
    }

    @kotlin.Deprecated(message = "toRichText has moved from utils to core", replaceWith = @kotlin.ReplaceWith(expression = "toRichText(color, trailingInline)", imports = {"com.paypal.pds.core.toRichText"}))
    public static final com.paypal.pds.core.RichText toRichText(java.lang.String str, com.paypal.pds.core.Color color, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.pds.core.RichTextKt.toRichText$default(str, color, false, function2, 2, null);
    }

    @kotlin.Deprecated(message = "toRichText has moved from utils to core", replaceWith = @kotlin.ReplaceWith(expression = "toRichText(text, links)", imports = {"com.paypal.pds.core.toRichText"}))
    public static final com.paypal.pds.core.RichText toRichText(java.lang.String str, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.pds.core.RichTextKt.toRichText(str, list);
    }
}
