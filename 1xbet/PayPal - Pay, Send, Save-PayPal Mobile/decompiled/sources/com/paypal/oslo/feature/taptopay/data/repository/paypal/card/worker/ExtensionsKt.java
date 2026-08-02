package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\tH\u0000¢\u0006\u0004\b\u0005\u0010\n\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\rH\u0000¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"", "Landroidx/work/Data;", "toErrorData", "(Ljava/lang/String;)Landroidx/work/Data;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "toWorkData", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;)Landroidx/work/Data;", "toCardIdGroup", "(Landroidx/work/Data;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;)Landroidx/work/Data;", "toDeviceWalletServiceCardId", "(Landroidx/work/Data;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;)Landroidx/work/Data;", "toPayPalDigitizedCard", "(Landroidx/work/Data;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "KeyError", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtensionsKt {
    public static final java.lang.String KeyError = "error";

    public static final androidx.work.Data toErrorData(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.work.Data.Builder().putString("error", str).build();
    }

    public static final androidx.work.Data toWorkData(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardIdGroup, "");
        return new androidx.work.Data.Builder().putString("paypalCardId", cardIdGroup.getPayPalCardId().getId()).putString("digitizedCardId", cardIdGroup.getDigitizedCardId().getId()).putString("dwServiceCardId", cardIdGroup.getDeviceWalletServiceCardId().getId()).build();
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup toCardIdGroup(androidx.work.Data data) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String string = data.getString("paypalCardId");
        java.lang.String string2 = data.getString("digitizedCardId");
        java.lang.String string3 = data.getString("dwServiceCardId");
        java.lang.String str3 = string;
        if (str3 == null || str3.length() == 0 || (str = string2) == null || str.length() == 0 || (str2 = string3) == null || str2.length() == 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Missing card IDs", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypal_card_id", string), kotlin.TuplesKt.to("digitized_card_id", string2), kotlin.TuplesKt.to("device_wallet_card_id", string3)), null, 4, null);
            return null;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(string2), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(string), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(string3));
    }

    public static final androidx.work.Data toWorkData(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        return new androidx.work.Data.Builder().putString("dwServiceCardId", deviceWalletServiceCardId.getId()).build();
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId toDeviceWalletServiceCardId(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String string = data.getString("dwServiceCardId");
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Missing card ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("device_wallet_card_id", string)), null, 4, null);
            return null;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(string);
    }

    public static final androidx.work.Data toWorkData(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDigitizedCard, "");
        return new androidx.work.Data.Builder().putString("dwServiceCardId", payPalDigitizedCard.getDeviceWalletServiceCardId().getId()).putString("paypalCardId", payPalDigitizedCard.getPayPalCardId().getId()).putString("digitizedCardId", payPalDigitizedCard.getDigitizedCard().getCardId()).putString("last4", payPalDigitizedCard.getDigitizedCard().getLast4()).putString("last4dpan", payPalDigitizedCard.getDigitizedCard().getLast4dpan()).putString("expiry", payPalDigitizedCard.getDigitizedCard().getExpiry()).build();
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard toPayPalDigitizedCard(androidx.work.Data data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String string = data.getString("paypalCardId");
        java.lang.String string2 = data.getString("digitizedCardId");
        java.lang.String string3 = data.getString("dwServiceCardId");
        java.lang.String string4 = data.getString("last4");
        java.lang.String string5 = data.getString("last4dpan");
        java.lang.String string6 = data.getString("expiry");
        java.lang.String str5 = string;
        java.lang.String str6 = string4;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ValidatedDigitizedCardFields validatedDigitizedCardFields = ((str5 != null && str5.length() != 0 && (str3 = string2) != null && str3.length() != 0 && (str4 = string3) != null && str4.length() != 0) && (str6 != null && str6.length() != 0 && (str = string5) != null && str.length() != 0 && (str2 = string6) != null && str2.length() != 0)) ? new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ValidatedDigitizedCardFields(string, string2, string3, string4, string5, string6) : null;
        if (validatedDigitizedCardFields == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Missing values", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypal_card_id", string), kotlin.TuplesKt.to("digitized_card_id", string2), kotlin.TuplesKt.to("device_wallet_card_id", string3), kotlin.TuplesKt.to("last_4", string4), kotlin.TuplesKt.to("last_4_dpan", string5), kotlin.TuplesKt.to("expiry", string6)), null, 4, null);
            return null;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(validatedDigitizedCardFields.getHighSpeedVideoFpsRangesFor), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(validatedDigitizedCardFields.getHighSpeedVideoSizes), new com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard(validatedDigitizedCardFields.Camera2StreamConfigurationMap, validatedDigitizedCardFields.getHighSpeedVideoFpsRanges, validatedDigitizedCardFields.getHighResolutionOutputSizeshNQ4ISI, validatedDigitizedCardFields.getInputSizeshNQ4ISI, false, (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status) null, (byte[]) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
