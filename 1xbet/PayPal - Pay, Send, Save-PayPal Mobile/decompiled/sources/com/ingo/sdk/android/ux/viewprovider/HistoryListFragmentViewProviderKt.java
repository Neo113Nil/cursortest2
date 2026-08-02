package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u0015\u0010\f\u001a\u00020\r*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\r*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"toDate", "Ljava/util/Date;", "", "dateFormat", "timeZone", "Ljava/util/TimeZone;", "formatTo", "rememberScrollContext", "Lcom/ingo/sdk/android/ux/viewprovider/ScrollContext;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Lcom/ingo/sdk/android/ux/viewprovider/ScrollContext;", "isLastItemVisible", "", "(Landroidx/compose/foundation/lazy/LazyListState;)Z", "isFirstItemVisible", "androidSdkUx_release", "scrollContext"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HistoryListFragmentViewProviderKt {
    public static /* synthetic */ java.util.Date toDate$default(java.lang.String str, java.lang.String str2, java.util.TimeZone timeZone, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        }
        if ((i & 2) != 0) {
            timeZone = java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);
        }
        return toDate(str, str2, timeZone);
    }

    public static final java.util.Date toDate(java.lang.String str, java.lang.String str2, java.util.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str2, java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        java.lang.String str3 = str;
        if (kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null) >= 0) {
            java.lang.String substring = str.substring(0, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(substring);
            sb.append("Z");
            return simpleDateFormat.parse(sb.toString());
        }
        return simpleDateFormat.parse(str);
    }

    public static /* synthetic */ java.lang.String formatTo$default(java.util.Date date, java.lang.String str, java.util.TimeZone timeZone, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            timeZone = java.util.TimeZone.getDefault();
        }
        return formatTo(date, str, timeZone);
    }

    public static final java.lang.String formatTo(java.util.Date date, java.lang.String str, java.util.TimeZone timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        java.lang.String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final boolean isLastItemVisible(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = (androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        return lazyListItemInfo != null && lazyListItemInfo.getIndex() == lazyListState.getLayoutInfo().getTotalItemsCount() - 1;
    }

    public static final boolean isFirstItemVisible(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        return lazyListState.getFirstVisibleItemIndex() == 0;
    }

    public static final com.ingo.sdk.android.ux.viewprovider.ScrollContext rememberScrollContext(final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        composer.startReplaceGroup(-296711372);
        composer.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProviderKt.m10747$r8$lambda$G1rdgGHsW5WBZSonLbOgyMlapc(androidx.compose.foundation.lazy.LazyListState.this);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        com.ingo.sdk.android.ux.viewprovider.ScrollContext scrollContext = (com.ingo.sdk.android.ux.viewprovider.ScrollContext) ((androidx.compose.runtime.State) rememberedValue).getValue();
        composer.endReplaceGroup();
        return scrollContext;
    }

    /* renamed from: $r8$lambda$G1rdgGHsW5WBZSon-LbOgyMlapc, reason: not valid java name */
    public static /* synthetic */ com.ingo.sdk.android.ux.viewprovider.ScrollContext m10747$r8$lambda$G1rdgGHsW5WBZSonLbOgyMlapc(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        return new com.ingo.sdk.android.ux.viewprovider.ScrollContext(isFirstItemVisible(lazyListState), isLastItemVisible(lazyListState));
    }
}
