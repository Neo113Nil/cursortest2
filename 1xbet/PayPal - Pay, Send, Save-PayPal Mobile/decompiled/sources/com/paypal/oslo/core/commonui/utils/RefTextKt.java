package com.paypal.oslo.core.commonui.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0001\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0001\u0010\u0011\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0001\u0010\u0015\u001a!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0016"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "stringRef", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "id", "", "", "args", "stringResourceRef", "(I[Ljava/lang/Object;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "quantity", "pluralStringResourceRef", "(II[Ljava/lang/Object;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "Landroid/content/Context;", "context", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Landroid/content/Context;)Ljava/lang/String;", "p0", "Camera2StreamConfigurationMap", "([Ljava/lang/Object;Landroid/content/Context;)[Ljava/lang/Object;", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "([Ljava/lang/Object;Landroidx/compose/runtime/Composer;)[Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RefTextKt {
    public static final com.paypal.oslo.core.commonui.utils.RefText stringRef(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.core.commonui.utils.RefText.Raw(str);
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText stringResourceRef(int i, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return new com.paypal.oslo.core.commonui.utils.RefText.Res(i, objArr);
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText pluralStringResourceRef(int i, int i2, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return new com.paypal.oslo.core.commonui.utils.RefText.Plural(i, i2, objArr);
    }

    public static final java.lang.String value(com.paypal.oslo.core.commonui.utils.RefText refText, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Res) {
            com.paypal.oslo.core.commonui.utils.RefText.Res res = (com.paypal.oslo.core.commonui.utils.RefText.Res) refText;
            java.lang.Object[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(res.getArgs(), context);
            if (Camera2StreamConfigurationMap.length == 0) {
                java.lang.String string = context.getString(res.getResId());
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return string;
            }
            java.lang.String string2 = context.getString(res.getResId(), java.util.Arrays.copyOf(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Plural) {
            com.paypal.oslo.core.commonui.utils.RefText.Plural plural = (com.paypal.oslo.core.commonui.utils.RefText.Plural) refText;
            java.lang.Object[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(plural.getArgs(), context);
            if (Camera2StreamConfigurationMap2.length == 0) {
                java.lang.String quantityString = context.getResources().getQuantityString(plural.getResId(), plural.getQuantity());
                kotlin.jvm.internal.Intrinsics.checkNotNull(quantityString);
                return quantityString;
            }
            java.lang.String quantityString2 = context.getResources().getQuantityString(plural.getResId(), plural.getQuantity(), java.util.Arrays.copyOf(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap2.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }
        if (refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Raw) {
            return ((com.paypal.oslo.core.commonui.utils.RefText.Raw) refText).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.lang.String value(com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(283917096, i, -1, "com.paypal.oslo.core.commonui.utils.value (RefText.kt:194)");
        }
        if (refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Res) {
            composer.startReplaceGroup(1383674336);
            com.paypal.oslo.core.commonui.utils.RefText.Res res = (com.paypal.oslo.core.commonui.utils.RefText.Res) refText;
            java.lang.Object[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(res.getArgs(), composer);
            if (Camera2StreamConfigurationMap.length == 0) {
                composer.startReplaceGroup(1383760237);
                value = androidx.compose.ui.res.StringResources_androidKt.stringResource(res.getResId(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1383812534);
                value = androidx.compose.ui.res.StringResources_androidKt.stringResource(res.getResId(), java.util.Arrays.copyOf(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap.length), composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Plural) {
            composer.startReplaceGroup(1383950112);
            com.paypal.oslo.core.commonui.utils.RefText.Plural plural = (com.paypal.oslo.core.commonui.utils.RefText.Plural) refText;
            java.lang.Object[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(plural.getArgs(), composer);
            if (Camera2StreamConfigurationMap2.length == 0) {
                composer.startReplaceGroup(1384035517);
                value = androidx.compose.ui.res.StringResources_androidKt.pluralStringResource(plural.getResId(), plural.getQuantity(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1384103686);
                value = androidx.compose.ui.res.StringResources_androidKt.pluralStringResource(plural.getResId(), plural.getQuantity(), java.util.Arrays.copyOf(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap2.length), composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (!(refText instanceof com.paypal.oslo.core.commonui.utils.RefText.Raw)) {
                composer.startReplaceGroup(-2033576102);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-2033556915);
            composer.endReplaceGroup();
            value = ((com.paypal.oslo.core.commonui.utils.RefText.Raw) refText).getValue();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    private static final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] objArr, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1998253671, 0, -1, "com.paypal.oslo.core.commonui.utils.resolveNestedRefText (RefText.kt:221)");
        }
        composer.startReplaceGroup(-471394554);
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            if (obj instanceof com.paypal.oslo.core.commonui.utils.RefText) {
                composer.startReplaceGroup(1694591146);
                obj = value((com.paypal.oslo.core.commonui.utils.RefText) obj, composer, 0);
            } else {
                composer.startReplaceGroup(1694591557);
            }
            composer.endReplaceGroup();
            arrayList.add(obj);
        }
        composer.endReplaceGroup();
        java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return array;
    }

    private static final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] objArr, android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            if (obj instanceof com.paypal.oslo.core.commonui.utils.RefText) {
                obj = value((com.paypal.oslo.core.commonui.utils.RefText) obj, context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new java.lang.Object[0]);
    }
}
