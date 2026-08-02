package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aT\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022 \b\u0002\u0010\u0006\u001a\u001a\u0012\u000e\u0012\f8\u0000¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u000b\u001a\u0015\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0002\u0010\n\u001a\u001c\u0012\u000e\u0012\f8\u0000¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\t"}, d2 = {"", "T", "Landroidx/paging/compose/LazyPagingItems;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "key", "", "itemKey", "(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "itemContentType"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyFoundationExtensionsKt {
    public static /* synthetic */ kotlin.jvm.functions.Function1 itemKey$default(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return itemKey(lazyPagingItems, function1);
    }

    public static final <T> kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> itemKey(final androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, final kotlin.jvm.functions.Function1<T, ? extends java.lang.Object> function1) {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.compose.LazyFoundationExtensionsKt.$r8$lambda$qBPrRKYqfXZiY67qu5eNjOjaB6o(kotlin.jvm.functions.Function1.this, lazyPagingItems, ((java.lang.Integer) obj).intValue());
            }
        };
    }

    public static /* synthetic */ kotlin.jvm.functions.Function1 itemContentType$default(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return itemContentType(lazyPagingItems, function1);
    }

    public static final <T> kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> itemContentType(final androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, final kotlin.jvm.functions.Function1<T, ? extends java.lang.Object> function1) {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.compose.LazyFoundationExtensionsKt.m9267$r8$lambda$CK5aDx_1VzS2WkWFdWhjBvYkQ(kotlin.jvm.functions.Function1.this, lazyPagingItems, ((java.lang.Integer) obj).intValue());
            }
        };
    }

    /* renamed from: $r8$lambda$CK5a-Dx_1Vz-S2WkWFdWhjBvYkQ, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9267$r8$lambda$CK5aDx_1VzS2WkWFdWhjBvYkQ(kotlin.jvm.functions.Function1 function1, androidx.paging.compose.LazyPagingItems lazyPagingItems, int i) {
        if (function1 == null) {
            return null;
        }
        java.lang.Object peek = lazyPagingItems.peek(i);
        return peek == null ? androidx.paging.compose.PagingPlaceholderContentType.INSTANCE : function1.invoke(peek);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$qBPrRKYqfXZiY67qu5eNjOjaB6o(kotlin.jvm.functions.Function1 function1, androidx.paging.compose.LazyPagingItems lazyPagingItems, int i) {
        if (function1 == null) {
            return androidx.paging.compose.PagingPlaceholdersKt.getPagingPlaceholderKey(i);
        }
        java.lang.Object peek = lazyPagingItems.peek(i);
        return peek == null ? androidx.paging.compose.PagingPlaceholdersKt.getPagingPlaceholderKey(i) : function1.invoke(peek);
    }
}
