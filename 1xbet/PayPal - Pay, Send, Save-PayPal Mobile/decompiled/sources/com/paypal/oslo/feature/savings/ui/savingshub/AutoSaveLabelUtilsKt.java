package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/AutoSaveConfig;", "autoSaveConfigs", "", "getAutoSaveLabelText", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveLabelUtilsKt {
    public static final java.lang.String getAutoSaveLabelText(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> list, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object obj;
        java.lang.String stringResource;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        composer.startReplaceGroup(-1183391733);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1183391733, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.getAutoSaveLabelText (AutoSaveLabelUtils.kt:30)");
        }
        if (!list.isEmpty()) {
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig> list2 = list;
            java.util.Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig) obj).isNonGoal()) {
                    break;
                }
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig autoSaveConfig = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig) obj;
            if (autoSaveConfig != null) {
                composer.startReplaceGroup(-1331268211);
                if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                    i2 = 0;
                } else {
                    java.util.Iterator<T> it2 = list2.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (!((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.AutoSaveConfig) it2.next()).isNonGoal() && (i2 = i2 + 1) < 0) {
                            kotlin.collections.CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i2 > 0) {
                    composer.startReplaceGroup(-1331133981);
                    if (i2 == 1) {
                        composer.startReplaceGroup(-1331039555);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_label_more_singular, new java.lang.Object[]{autoSaveConfig.getName()}, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1330912300);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_label_more_plural, new java.lang.Object[]{autoSaveConfig.getName(), java.lang.Integer.valueOf(i2)}, composer, 0);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1330767716);
                    composer.endReplaceGroup();
                    stringResource = autoSaveConfig.getName();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1330657542);
                int size = list.size();
                if (size == 1) {
                    composer.startReplaceGroup(-1330534503);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_hub_mapper_auto_save_one_goal, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1330434776);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_hub_mapper_auto_save_multiple_goals, new java.lang.Object[]{java.lang.Integer.valueOf(size)}, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stringResource;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return "";
    }
}
