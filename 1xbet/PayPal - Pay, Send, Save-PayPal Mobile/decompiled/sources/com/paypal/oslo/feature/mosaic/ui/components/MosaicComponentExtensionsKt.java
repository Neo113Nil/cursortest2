package com.paypal.oslo.feature.mosaic.ui.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;", "Lcom/paypal/pds/core/Typography;", "getTypography", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;)Lcom/paypal/pds/core/Typography;", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/style/TextAlign;", "getTextAlignment", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;)I", "", "interpolateContent", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTypographyTextDisplayModel;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicComponentExtensionsKt {
    public static final com.paypal.pds.core.Typography getTypography(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        java.lang.String size = mosaicTypographyTextDisplayModel.getSize();
        if (size == null) {
            size = "MEDIUM";
        }
        kotlin.Pair pair = kotlin.TuplesKt.to(mosaicTypographyTextDisplayModel.getType(), size);
        if (kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("TITLE", "LARGE"))) {
            return com.paypal.pds.core.Typography.TitleLarge.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("TITLE", "MEDIUM")) && !kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("TITLE", "SMALL"))) {
            return kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("HEADING", "LARGE")) ? com.paypal.pds.core.Typography.HeadingLarge.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("HEADING", "MEDIUM")) ? com.paypal.pds.core.Typography.HeadingMedium.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("HEADING", "SMALL")) ? com.paypal.pds.core.Typography.HeadingSmall.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("BODY", "LARGE")) ? com.paypal.pds.core.Typography.BodyLarge.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("BODY", "MEDIUM")) ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(pair, kotlin.TuplesKt.to("BODY", "SMALL")) ? com.paypal.pds.core.Typography.BodySmall.INSTANCE : com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
        }
        return com.paypal.pds.core.Typography.TitleMedium.INSTANCE;
    }

    public static final androidx.compose.ui.text.TextStyle getTextStyle(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-646490435, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.getTextStyle (MosaicComponentExtensions.kt:49)");
        }
        androidx.compose.ui.text.TextStyle textStyle = getTypography(mosaicTypographyTextDisplayModel).getTextStyle(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return textStyle;
    }

    public static final int getTextAlignment(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        java.lang.String textAlign = mosaicTypographyTextDisplayModel.getTextAlign();
        if (textAlign != null) {
            str = textAlign.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2332679) {
                if (hashCode != 77974012) {
                    if (hashCode == 1984282709 && str.equals("CENTER")) {
                        return androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
                    }
                } else if (str.equals("RIGHT")) {
                    return androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk();
                }
            } else if (str.equals("LEFT")) {
                return androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
            }
        }
        return androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
    }

    public static final java.lang.String interpolateContent(com.paypal.oslo.feature.mosaic.domain.model.MosaicTypographyTextDisplayModel mosaicTypographyTextDisplayModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTypographyTextDisplayModel, "");
        java.lang.String content = mosaicTypographyTextDisplayModel.getContent();
        java.util.Map<java.lang.String, java.lang.String> contentArgs = mosaicTypographyTextDisplayModel.getContentArgs();
        if (contentArgs == null) {
            return content;
        }
        java.lang.String str = content;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : contentArgs.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            sb.append(key);
            sb.append("}");
            str = kotlin.text.StringsKt.replace$default(str, sb.toString(), value, false, 4, (java.lang.Object) null);
        }
        return str;
    }
}
