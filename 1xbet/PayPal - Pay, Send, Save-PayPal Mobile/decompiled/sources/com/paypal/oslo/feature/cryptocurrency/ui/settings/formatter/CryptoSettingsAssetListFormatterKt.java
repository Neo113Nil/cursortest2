package com.paypal.oslo.feature.cryptocurrency.ui.settings.formatter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "assets", "formatAssetList", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSettingsAssetListFormatterKt {
    public static final java.lang.String formatAssetList(java.util.List<java.lang.String> list, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-414068972, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.settings.formatter.formatAssetList (CryptoSettingsAssetListFormatter.kt:33)");
        }
        if (list.isEmpty()) {
            composer.startReplaceGroup(-382572407);
            composer.endReplaceGroup();
            obj = null;
        } else if (list.size() == 1) {
            composer.startReplaceGroup(1511680891);
            composer.endReplaceGroup();
            obj = (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) list);
        } else if (list.size() == 2) {
            composer.startReplaceGroup(1511682608);
            composer.endReplaceGroup();
            java.lang.String str = list.get(0);
            java.lang.String str2 = list.get(1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) str);
            sb.append(", ");
            sb.append((java.lang.Object) str2);
            obj = sb.toString();
        } else {
            composer.startReplaceGroup(-382428504);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_more_assets, new java.lang.Object[]{java.lang.Integer.valueOf(list.size() - 2)}, composer, 0);
            java.lang.String str3 = list.get(0);
            java.lang.String str4 = list.get(1);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append((java.lang.Object) str3);
            sb2.append(", ");
            sb2.append((java.lang.Object) str4);
            sb2.append(" ");
            sb2.append(stringResource);
            obj = sb2.toString();
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return obj;
    }
}
