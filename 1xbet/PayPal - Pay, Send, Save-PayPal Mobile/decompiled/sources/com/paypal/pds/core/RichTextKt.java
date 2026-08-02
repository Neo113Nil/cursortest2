package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a>\u0010\n\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000e0\r¢\u0006\u0004\b\n\u0010\u0010\"\u0017\u0010\u0011\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "isBold", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "trailingInline", "Lcom/paypal/pds/core/RichText;", "toRichText", "(Ljava/lang/String;Lcom/paypal/pds/core/Color;ZLkotlin/jvm/functions/Function2;)Lcom/paypal/pds/core/RichText;", "text", "", "Lkotlin/Pair;", "links", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/pds/core/RichText;", "EmptyRichText", "Lcom/paypal/pds/core/RichText;", "getEmptyRichText", "()Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RichTextKt {
    private static final com.paypal.pds.core.RichText EmptyRichText = com.paypal.pds.core.RichText.Companion.invoke$default(com.paypal.pds.core.RichText.INSTANCE, "", null, false, null, 14, null);

    public static /* synthetic */ com.paypal.pds.core.RichText toRichText$default(java.lang.String str, com.paypal.pds.core.Color color, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            color = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return toRichText(str, color, z, function2);
    }

    public static final com.paypal.pds.core.RichText toRichText(java.lang.String str, com.paypal.pds.core.Color color, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(str, color, z, function2);
    }

    public static final com.paypal.pds.core.RichText getEmptyRichText() {
        return EmptyRichText;
    }

    public static final com.paypal.pds.core.RichText toRichText(final java.lang.String str, final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty() ? com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.RichTextKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.core.RichTextKt.$r8$lambda$qD6wQ0szEKVp2TdGtGknVMLuwoY(str, (com.paypal.pds.core.Builder) obj);
            }
        }) : com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.RichTextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.core.RichTextKt.m22111$r8$lambda$FNYvOBl6_jD7_goeEOE5CaASBU(list, str, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$FNYvOBl6_jD7_goeEOE5-CaASBU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22111$r8$lambda$FNYvOBl6_jD7_goeEOE5CaASBU(java.util.List list, java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, (java.lang.String) pair.getFirst(), i, false, 4, (java.lang.Object) null);
            if (indexOf$default != -1) {
                if (i < indexOf$default) {
                    java.lang.String substring = str.substring(i, indexOf$default);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
                }
                builder.appendLink((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
                i = ((java.lang.String) pair.getFirst()).length() + indexOf$default;
            }
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qD6wQ0szEKVp2TdGtGknVMLuwoY(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
