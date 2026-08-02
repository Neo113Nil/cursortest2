package com.paypal.oslo.feature.inappcheckout.extensions;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\t*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0017\u001a\u00020\u0016*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\u00020\u0016*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001a'\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001e*\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010+\u001a\u00020(*\u00020!2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/Name;", "", "formatUserName", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/Name;)Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "instrumentId", "findMatchingInstrumentId", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "", "T", "Landroid/content/Context;", "Lkotlinx/serialization/json/Json;", "json", "fileName", "readJsonFromAssets", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;Ljava/lang/String;)Ljava/lang/Object;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "fundingSelectionAsContingencyResponse", "(Larrow/core/Either;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoAsContingencyResponse", "firstOrNullIfEmpty", "(Ljava/util/List;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Lkotlin/Pair;", "getCountryAndLanguage", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)Lkotlin/Pair;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/graphics/Color;", "bgColor", "", "drawCTAButtonBackground-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;J)V", "drawCTAButtonBackground"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutExtensionsKt {
    public static final java.lang.String formatUserName(com.paypal.oslo.feature.inappcheckout.domain.entity.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String givenName = name2.getGivenName();
        java.lang.String str = null;
        if (givenName == null || givenName.length() <= 0) {
            givenName = null;
        }
        java.lang.String surname = name2.getSurname();
        if (surname != null && surname.length() > 0) {
            str = surname;
        }
        if (givenName == null || str == null) {
            return givenName == null ? str == null ? "" : str : givenName;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(givenName);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument findMatchingInstrumentId(java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.String str2 = str;
        java.lang.Object obj = null;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj;
    }

    public static final /* synthetic */ <T> T readJsonFromAssets(android.content.Context context, kotlinx.serialization.json.Json json, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.io.InputStream open = context.getAssets().open(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            kotlinx.serialization.modules.SerializersModule serializersModule = json.getSerializersModule();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return (T) json.decodeFromString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), readText);
        } finally {
        }
    }

    public static final <T> T firstOrNullIfEmpty(java.util.List<? extends T> list) {
        if (list != null) {
            return (T) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        }
        return null;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> getCountryAndLanguage(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        java.util.Locale userLocale = localeProvider.getUserLocale();
        java.lang.String country = userLocale.getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
        if (country.length() <= 0) {
            country = null;
        }
        if (country == null) {
            country = java.util.Locale.US.getCountry();
        }
        java.lang.String language = userLocale.getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(language);
        java.lang.String str = language.length() > 0 ? language : null;
        if (str == null) {
            str = java.util.Locale.US.getLanguage();
        }
        return kotlin.TuplesKt.to(country, str);
    }

    /* renamed from: drawCTAButtonBackground-g2O1Hgs, reason: not valid java name */
    public static final void m15437drawCTAButtonBackgroundg2O1Hgs(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonSize, "");
        float f = drawScope.mo1418toPx0680j_4(buttonSize.getCornerRadius());
        long m5706constructorimpl = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
        if (buttonStyle instanceof com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, 0L, 0L, m5706constructorimpl, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null);
        } else {
            if (!(buttonStyle instanceof com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Outline)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, j, 0L, 0L, m5706constructorimpl, new androidx.compose.ui.graphics.drawscope.Stroke(drawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null);
        }
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse fundingSelectionAsContingencyResponse(arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity> either, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
        if (either instanceof arrow.core.Either.Right) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse(contingencyEntity, (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) ((arrow.core.Either.Right) either).getValue());
        }
        if (either instanceof arrow.core.Either.Left) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse(contingencyEntity, (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse buyerInfoAsContingencyResponse(arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity> either, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
        if (either instanceof arrow.core.Either.Right) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse(contingencyEntity, (com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity) ((arrow.core.Either.Right) either).getValue());
        }
        if (either instanceof arrow.core.Either.Left) {
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse(contingencyEntity, (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
