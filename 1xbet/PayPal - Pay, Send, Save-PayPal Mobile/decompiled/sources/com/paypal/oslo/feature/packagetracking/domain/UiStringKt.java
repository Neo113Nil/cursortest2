package com.paypal.oslo.feature.packagetracking.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "", "resolve", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Landroid/content/Context;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UiStringKt {
    public static final java.lang.String resolve(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-302850883, i, -1, "com.paypal.oslo.feature.packagetracking.domain.resolve (UiString.kt:97)");
        }
        if (uiString instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) {
            stringResource = ((com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) uiString).getValue();
        } else {
            if (!(uiString instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource2 = (com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource) uiString;
            if (stringResource2.getArgs().length == 0) {
                composer.startReplaceGroup(1495771488);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(stringResource2.getResId(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1495819910);
                int resId = stringResource2.getResId();
                java.lang.Object[] args = stringResource2.getArgs();
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(resId, java.util.Arrays.copyOf(args, args.length), composer, 0);
                composer.endReplaceGroup();
            }
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String resolve(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (uiString instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) {
            return ((com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString) uiString).getValue();
        }
        if (!(uiString instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource = (com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource) uiString;
        if (stringResource.getArgs().length == 0) {
            java.lang.String string = context.getString(stringResource.getResId());
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            return string;
        }
        int resId = stringResource.getResId();
        java.lang.Object[] args = stringResource.getArgs();
        java.lang.String string2 = context.getString(resId, java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        return string2;
    }
}
