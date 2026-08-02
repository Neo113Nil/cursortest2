package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001aÁ\u0001\u0010&\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0091\u0001\u0010)\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010(2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b)\u0010*\u001a\u007f\u00100\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010+2\b\u0010\u000b\u001a\u0004\u0018\u00010,2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010-2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\u0010\u0011\u001a\u0004\u0018\u00010.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010/2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00100\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u0001022\b\u0010\t\u001a\u0004\u0018\u0001032\b\u0010\u000b\u001a\u0004\u0018\u0001022\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b0\u00104\u001a\u0013\u0010)\u001a\u00020\n*\u000205H\u0002¢\u0006\u0004\b)\u00106\u001a\u0013\u00100\u001a\u00020\u000e*\u000207H\u0002¢\u0006\u0004\b0\u00108\u001a\u0013\u0010)\u001a\u00020\b*\u000209H\u0002¢\u0006\u0004\b)\u0010:\u001a\u0013\u0010&\u001a\u00020\f*\u00020;H\u0002¢\u0006\u0004\b&\u0010<\u001a\u0015\u0010>\u001a\u00020=*\u0004\u0018\u000102H\u0000¢\u0006\u0004\b>\u0010?\u001a\u0013\u00100\u001a\u00020+*\u00020@H\u0002¢\u0006\u0004\b0\u0010A\u001a\u0013\u0010C\u001a\u00020,*\u00020BH\u0002¢\u0006\u0004\bC\u0010D\u001a\u0013\u0010)\u001a\u00020.*\u00020EH\u0002¢\u0006\u0004\b)\u0010F\u001a\u0013\u0010)\u001a\u00020H*\u00020GH\u0002¢\u0006\u0004\b)\u0010I\u001a\u0013\u00100\u001a\u00020K*\u00020JH\u0002¢\u0006\u0004\b0\u0010L\u001a\u0013\u00100\u001a\u00020N*\u00020MH\u0002¢\u0006\u0004\b0\u0010O\u001a\u0013\u0010Q\u001a\u00020\u0015*\u00020PH\u0002¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010C\u001a\u00020\u0015*\u00020SH\u0002¢\u0006\u0004\bC\u0010T\u001a\u0013\u0010&\u001a\u00020\u0015*\u00020UH\u0002¢\u0006\u0004\b&\u0010V\u001a\u0013\u0010Q\u001a\u00020\u0015*\u00020WH\u0002¢\u0006\u0004\bQ\u0010X\u001a\u0013\u0010Z\u001a\u00020\u0012*\u00020YH\u0000¢\u0006\u0004\bZ\u0010["}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$ScanQrCode;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "toQrcSession", "(Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$ScanQrCode;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$QrCodeSession;", "(Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$QrCodeSession;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "", "p0", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "p1", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "p2", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;", "p3", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "p4", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "p5", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "p6", "p7", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "p8", "p9", "p10", "p11", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "p12", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "p13", "", "p14", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "p15", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "p16", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "p17", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigCategory;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigThresholdType;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTippingStatus;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigCategory;Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigThresholdType;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTippingStatus;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/DefaultTipConfigs;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;)Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/Integer;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionRequiredAction;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeProductFlow;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeProductFlow;)Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeMode;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeMode;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePointOfInitiationMethod;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePointOfInitiationMethod;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcPointOfInitiationMethod;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "toQrcSessionActionType", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipCategory;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipCategory;)Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigCategory;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipThresholdType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipThresholdType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigThresholdType;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipConfigurationStatus;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTipConfigurationStatus;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTippingStatus;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentMethod;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;)Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentMethod;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentStatus;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;)Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentStatus;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRContingencyAction;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ContingencyAction;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRContingencyAction;)Lcom/paypal/oslo/feature/qrc/domain/model/session/ContingencyAction;", "Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$FeeAmount;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$FeeAmount;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$TotalAmount;", "(Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$TotalAmount;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$FeeAmount;", "(Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$FeeAmount;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$TotalAmount;", "(Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$TotalAmount;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "toPaymentResponse", "(Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;)Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcSessionMapperKt {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSession toQrcSession(com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.ScanQrCode scanQrCode) {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer;
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney6;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney7;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney8;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate payPalWorldFxRate;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney9;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney10;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney11;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney12;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney13;
        java.util.ArrayList emptyList;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address2;
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.TotalAmount totalAmount;
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.FeeAmount feeAmount;
        java.util.ArrayList arrayList4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanQrCode, "");
        java.lang.String id = scanQrCode.getId();
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode mode = scanQrCode.getMode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode highSpeedVideoSizes = mode != null ? getHighSpeedVideoSizes(mode) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType = scanQrCode.getQrCodeType();
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType highSpeedVideoSizes2 = qrCodeType != null ? getHighSpeedVideoSizes(qrCodeType) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod pointOfInitiationMethod = scanQrCode.getPointOfInitiationMethod();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod Camera2StreamConfigurationMap = pointOfInitiationMethod != null ? Camera2StreamConfigurationMap(pointOfInitiationMethod) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow productFlow = scanQrCode.getProductFlow();
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow highSpeedVideoFpsRangesFor = productFlow != null ? getHighSpeedVideoFpsRangesFor(productFlow) : null;
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.RequiredAction requiredAction = scanQrCode.getRequiredAction();
        if (requiredAction != null) {
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = requiredAction.getOnQRCodeSessionPollingAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2 = onQRCodeSessionPollingAction != null ? onQRCodeSessionPollingAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction2 = requiredAction.getOnQRCodeSessionPollingAction();
            java.lang.Integer maximumPollingInterval = onQRCodeSessionPollingAction2 != null ? onQRCodeSessionPollingAction2.getMaximumPollingInterval() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = requiredAction.getOnQRCodeSessionErrorAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name3 = onQRCodeSessionErrorAction != null ? onQRCodeSessionErrorAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction2 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String errorReason = onQRCodeSessionErrorAction2 != null ? onQRCodeSessionErrorAction2.getErrorReason() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction3 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String issue = onQRCodeSessionErrorAction3 != null ? onQRCodeSessionErrorAction3.getIssue() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction = requiredAction.getOnQRCodeSessionBasicAction();
            qrcSessionRequiredAction = getHighSpeedVideoFpsRangesFor(name2, maximumPollingInterval, name3, errorReason, issue, onQRCodeSessionBasicAction != null ? onQRCodeSessionBasicAction.getName() : null);
        } else {
            qrcSessionRequiredAction = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Payment payment = scanQrCode.getPayment();
        if (payment != null) {
            java.lang.String id2 = payment.getId();
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod highSpeedVideoSizes3 = getHighSpeedVideoSizes(payment.getPaymentMethod());
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(payment.getStatus());
            java.lang.String statusReason = payment.getStatusReason();
            java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Contingency> contingencies = payment.getContingencies();
            if (contingencies != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Contingency> list = contingencies;
                str = "";
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Contingency) it.next()).getAction()));
                }
                arrayList4 = arrayList5;
            } else {
                str = "";
                arrayList4 = null;
            }
            paymentResponse = Camera2StreamConfigurationMap(id2, highSpeedVideoSizes3, highSpeedVideoFpsRangesFor2, statusReason, arrayList4, payment.getTransactionTime());
        } else {
            str = "";
            paymentResponse = null;
        }
        java.lang.String transactionCurrency = scanQrCode.getTransactionCurrency();
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.PaymentAmount paymentAmount = scanQrCode.getPaymentAmount();
        if (paymentAmount != null) {
            java.lang.String currencyCode = paymentAmount.getCurrencyCode();
            java.lang.String value2 = paymentAmount.getValue();
            if (currencyCode == null) {
                currencyCode = str;
            }
            if (value2 == null) {
                value2 = str;
            }
            qrcMoney = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value2);
        } else {
            qrcMoney = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.MaximumAllowedTransactionAmount maximumAllowedTransactionAmount = scanQrCode.getMaximumAllowedTransactionAmount();
        if (maximumAllowedTransactionAmount != null) {
            java.lang.String currencyCode2 = maximumAllowedTransactionAmount.getCurrencyCode();
            java.lang.String value3 = maximumAllowedTransactionAmount.getValue();
            if (currencyCode2 == null) {
                currencyCode2 = str;
            }
            if (value3 == null) {
                value3 = str;
            }
            qrcMoney2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode2, value3);
        } else {
            qrcMoney2 = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.NetworkTransaction networkTransaction = scanQrCode.getNetworkTransaction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highSpeedVideoFpsRanges = (networkTransaction == null || (feeAmount = networkTransaction.getFeeAmount()) == null) ? null : getHighSpeedVideoFpsRanges(feeAmount);
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.NetworkTransaction networkTransaction2 = scanQrCode.getNetworkTransaction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highResolutionOutputSizeshNQ4ISI = (networkTransaction2 == null || (totalAmount = networkTransaction2.getTotalAmount()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(totalAmount);
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Consumer consumer = scanQrCode.getConsumer();
        if (consumer != null) {
            java.lang.String accountId = consumer.getAccountId();
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Name name4 = consumer.getName();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName = name4 != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName(name4.getPrefix(), name4.getGivenName(), name4.getSurname(), name4.getSecondSurname(), name4.getMiddleName(), name4.getSuffix(), name4.getFullName()) : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Address address3 = consumer.getAddress();
            if (address3 != null) {
                java.lang.String addressLine1 = address3.getAddressLine1();
                java.lang.String addressLine2 = address3.getAddressLine2();
                java.lang.String addressLine3 = address3.getAddressLine3();
                java.lang.String adminArea1 = address3.getAdminArea1();
                java.lang.String adminArea2 = address3.getAdminArea2();
                java.lang.String adminArea3 = address3.getAdminArea3();
                java.lang.String adminArea4 = address3.getAdminArea4();
                java.lang.String postalCode = address3.getPostalCode();
                java.lang.String countryCode = address3.getCountryCode();
                address2 = new com.paypal.oslo.feature.qrc.domain.model.session.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode == null ? str : countryCode);
            } else {
                address2 = null;
            }
            java.lang.Object email = consumer.getEmail();
            java.lang.String obj = email != null ? email.toString() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Tenant tenant = consumer.getTenant();
            qrcConsumer = new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer(accountId, qrcPersonName, address2, obj, tenant != null ? tenant.getName() : null, consumer.getExternalId(), consumer.getCountryCode());
        } else {
            qrcConsumer = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Merchant merchant2 = scanQrCode.getMerchant();
        if (merchant2 != null) {
            java.lang.String accountId2 = merchant2.getAccountId();
            java.lang.String displayName = merchant2.getDisplayName();
            java.lang.String externalId = merchant2.getExternalId();
            java.lang.String logoUrl = merchant2.getLogoUrl();
            java.lang.String name5 = merchant2.getName();
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Address1 address4 = merchant2.getAddress();
            if (address4 != null) {
                java.lang.String addressLine12 = address4.getAddressLine1();
                java.lang.String addressLine22 = address4.getAddressLine2();
                java.lang.String addressLine32 = address4.getAddressLine3();
                java.lang.String adminArea12 = address4.getAdminArea1();
                java.lang.String adminArea22 = address4.getAdminArea2();
                java.lang.String adminArea32 = address4.getAdminArea3();
                java.lang.String adminArea42 = address4.getAdminArea4();
                java.lang.String postalCode2 = address4.getPostalCode();
                java.lang.String countryCode2 = address4.getCountryCode();
                address = new com.paypal.oslo.feature.qrc.domain.model.session.Address(addressLine12, addressLine22, addressLine32, adminArea12, adminArea22, adminArea32, adminArea42, postalCode2, countryCode2 == null ? str : countryCode2);
            } else {
                address = null;
            }
            java.lang.String partnerAccountId = merchant2.getPartnerAccountId();
            java.lang.String merchantCategoryCode = merchant2.getMerchantCategoryCode();
            java.lang.String merchantCategoryType = merchant2.getMerchantCategoryType();
            java.lang.String displayInitials = merchant2.getDisplayInitials();
            boolean showAlternateLogo = merchant2.getShowAlternateLogo();
            java.lang.String franchisorAccountId = merchant2.getFranchisorAccountId();
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Tenant1 tenant2 = merchant2.getTenant();
            merchant = getHighSpeedVideoSizes(accountId2, displayName, externalId, logoUrl, name5, address, partnerAccountId, merchantCategoryCode, merchantCategoryType, displayInitials, java.lang.Boolean.valueOf(showAlternateLogo), franchisorAccountId, tenant2 != null ? tenant2.getName() : null);
        } else {
            merchant = null;
        }
        boolean isTipEligible = scanQrCode.isTipEligible();
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.TipConfiguration tipConfiguration = scanQrCode.getTipConfiguration();
        if (tipConfiguration != null) {
            java.lang.String id3 = tipConfiguration.getId();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory category = tipConfiguration.getCategory();
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory highSpeedVideoFpsRangesFor3 = category != null ? getHighSpeedVideoFpsRangesFor(category) : null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType thresholdType = tipConfiguration.getThresholdType();
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType highResolutionOutputSizeshNQ4ISI2 = thresholdType != null ? getHighResolutionOutputSizeshNQ4ISI(thresholdType) : null;
            java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting> amountSettings = tipConfiguration.getAmountSettings();
            if (amountSettings != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting> list2 = amountSettings;
                qrcMoney6 = highResolutionOutputSizeshNQ4ISI;
                qrcMoney3 = highSpeedVideoFpsRanges;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting amountSetting = (com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting) it2.next();
                    java.lang.String currencyCode3 = amountSetting.getCurrencyCode();
                    java.lang.String value4 = amountSetting.getValue();
                    java.lang.String str2 = currencyCode3 == null ? str : currencyCode3;
                    java.util.Iterator it3 = it2;
                    if (value4 == null) {
                        value4 = str;
                    }
                    arrayList6.add(new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(str2, value4));
                    it2 = it3;
                }
                arrayList = arrayList6;
            } else {
                qrcMoney3 = highSpeedVideoFpsRanges;
                qrcMoney6 = highResolutionOutputSizeshNQ4ISI;
                arrayList = null;
            }
            java.util.List<java.lang.Integer> percentageSettings = tipConfiguration.getPercentageSettings();
            if (percentageSettings != null) {
                java.util.List<java.lang.Integer> list3 = percentageSettings;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(java.lang.String.valueOf(((java.lang.Number) it4.next()).intValue()));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus status = tipConfiguration.getStatus();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus highSpeedVideoSizes4 = status != null ? getHighSpeedVideoSizes(status) : null;
            java.lang.Boolean allowCustom = tipConfiguration.getAllowCustom();
            java.lang.Object maximumAllowedTipPercentage = tipConfiguration.getMaximumAllowedTipPercentage();
            java.lang.String obj2 = maximumAllowedTipPercentage != null ? maximumAllowedTipPercentage.toString() : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.DefaultConfigurations defaultConfigurations = tipConfiguration.getDefaultConfigurations();
            if (defaultConfigurations != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting1> amountSettings2 = defaultConfigurations.getAmountSettings();
                if (amountSettings2 == null) {
                    qrcMoney4 = qrcMoney;
                    qrcMoney5 = qrcMoney2;
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.List<com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting1> list4 = amountSettings2;
                    qrcMoney4 = qrcMoney;
                    qrcMoney5 = qrcMoney2;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    java.util.Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting1 amountSetting1 = (com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.AmountSetting1) it5.next();
                        java.lang.String currencyCode4 = amountSetting1.getCurrencyCode();
                        java.lang.String value5 = amountSetting1.getValue();
                        if (currencyCode4 == null) {
                            currencyCode4 = str;
                        }
                        java.util.Iterator it6 = it5;
                        if (value5 == null) {
                            value5 = str;
                        }
                        arrayList8.add(new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode4, value5));
                        it5 = it6;
                    }
                    emptyList = arrayList8;
                }
                java.util.List<java.lang.Integer> percentageSettings2 = defaultConfigurations.getPercentageSettings();
                if (percentageSettings2 != null) {
                    java.util.List<java.lang.Integer> list5 = percentageSettings2;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    java.util.Iterator<T> it7 = list5.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(java.lang.String.valueOf(((java.lang.Number) it7.next()).intValue()));
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                defaultTipConfigs = new com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs(emptyList, arrayList3);
            } else {
                qrcMoney4 = qrcMoney;
                qrcMoney5 = qrcMoney2;
                defaultTipConfigs = null;
            }
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.MaximumAllowedTipAmount maximumAllowedTipAmount = tipConfiguration.getMaximumAllowedTipAmount();
            if (maximumAllowedTipAmount != null) {
                java.lang.String currencyCode5 = maximumAllowedTipAmount.getCurrencyCode();
                java.lang.String value6 = maximumAllowedTipAmount.getValue();
                if (currencyCode5 == null) {
                    currencyCode5 = str;
                }
                if (value6 == null) {
                    value6 = str;
                }
                qrcMoney13 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode5, value6);
            } else {
                qrcMoney13 = null;
            }
            tipConfig = getHighSpeedVideoFpsRangesFor(id3, highSpeedVideoFpsRangesFor3, highResolutionOutputSizeshNQ4ISI2, arrayList, arrayList2, highSpeedVideoSizes4, allowCustom, obj2, defaultTipConfigs, qrcMoney13);
        } else {
            qrcMoney3 = highSpeedVideoFpsRanges;
            qrcMoney4 = qrcMoney;
            qrcMoney5 = qrcMoney2;
            qrcMoney6 = highResolutionOutputSizeshNQ4ISI;
            tipConfig = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.NetworkTransaction networkTransaction3 = scanQrCode.getNetworkTransaction();
        if (networkTransaction3 != null) {
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.SourceAmount sourceAmount = networkTransaction3.getSourceAmount();
            if (sourceAmount != null) {
                java.lang.String currencyCode6 = sourceAmount.getCurrencyCode();
                java.lang.String value7 = sourceAmount.getValue();
                if (currencyCode6 == null) {
                    currencyCode6 = str;
                }
                if (value7 == null) {
                    value7 = str;
                }
                qrcMoney7 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode6, value7);
            } else {
                qrcMoney7 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.DestinationAmount destinationAmount = networkTransaction3.getDestinationAmount();
            if (destinationAmount != null) {
                java.lang.String currencyCode7 = destinationAmount.getCurrencyCode();
                java.lang.String value8 = destinationAmount.getValue();
                if (currencyCode7 == null) {
                    currencyCode7 = str;
                }
                if (value8 == null) {
                    value8 = str;
                }
                qrcMoney8 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode7, value8);
            } else {
                qrcMoney8 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.TotalAmount totalAmount2 = networkTransaction3.getTotalAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highResolutionOutputSizeshNQ4ISI3 = totalAmount2 != null ? getHighResolutionOutputSizeshNQ4ISI(totalAmount2) : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.FeeAmount feeAmount2 = networkTransaction3.getFeeAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highSpeedVideoFpsRanges2 = feeAmount2 != null ? getHighSpeedVideoFpsRanges(feeAmount2) : null;
            com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Fx fx = networkTransaction3.getFx();
            if (fx != null) {
                com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnMoney3 onMoney = fx.getExchangeRate().getToCurrency().getOnMoney();
                double doubleValue = (onMoney == null || (value = onMoney.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull.doubleValue();
                com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnMoney onMoney2 = fx.getAmountFrom().getOnMoney();
                if (onMoney2 != null) {
                    java.lang.String currencyCode8 = onMoney2.getCurrencyCode();
                    java.lang.String value9 = onMoney2.getValue();
                    if (currencyCode8 == null) {
                        currencyCode8 = str;
                    }
                    if (value9 == null) {
                        value9 = str;
                    }
                    qrcMoney9 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode8, value9);
                } else {
                    qrcMoney9 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnMoney1 onMoney3 = fx.getAmountTo().getOnMoney();
                if (onMoney3 != null) {
                    java.lang.String currencyCode9 = onMoney3.getCurrencyCode();
                    java.lang.String value10 = onMoney3.getValue();
                    if (currencyCode9 == null) {
                        currencyCode9 = str;
                    }
                    if (value10 == null) {
                        value10 = str;
                    }
                    qrcMoney10 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode9, value10);
                } else {
                    qrcMoney10 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnMoney2 onMoney4 = fx.getExchangeRate().getFromCurrency().getOnMoney();
                if (onMoney4 != null) {
                    java.lang.String currencyCode10 = onMoney4.getCurrencyCode();
                    java.lang.String value11 = onMoney4.getValue();
                    if (currencyCode10 == null) {
                        currencyCode10 = str;
                    }
                    if (value11 == null) {
                        value11 = str;
                    }
                    qrcMoney11 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode10, value11);
                } else {
                    qrcMoney11 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.OnMoney3 onMoney5 = fx.getExchangeRate().getToCurrency().getOnMoney();
                if (onMoney5 != null) {
                    java.lang.String currencyCode11 = onMoney5.getCurrencyCode();
                    java.lang.String value12 = onMoney5.getValue();
                    if (currencyCode11 == null) {
                        currencyCode11 = str;
                    }
                    if (value12 == null) {
                        value12 = str;
                    }
                    qrcMoney12 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode11, value12);
                } else {
                    qrcMoney12 = null;
                }
                payPalWorldFxRate = new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate(doubleValue, qrcMoney9, qrcMoney10, qrcMoney11, qrcMoney12);
            } else {
                payPalWorldFxRate = null;
            }
            payPalWorldTransactionDetails = new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails(qrcMoney7, qrcMoney8, highResolutionOutputSizeshNQ4ISI3, highSpeedVideoFpsRanges2, payPalWorldFxRate, networkTransaction3.getTransactionIntentId());
        } else {
            payPalWorldTransactionDetails = null;
        }
        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.PaymentOptions paymentOptions = scanQrCode.getPaymentOptions();
        return Camera2StreamConfigurationMap(id, highSpeedVideoSizes, highSpeedVideoSizes2, Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor, qrcSessionRequiredAction, paymentResponse, transactionCurrency, qrcMoney4, qrcMoney5, qrcMoney3, qrcMoney6, qrcConsumer, merchant, java.lang.Boolean.valueOf(isTipEligible), tipConfig, payPalWorldTransactionDetails, paymentOptions != null ? com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.toPaymentOptions(paymentOptions) : null);
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSession toQrcSession(com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.QrCodeSession qrCodeSession) {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer;
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney6;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney7;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney8;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate payPalWorldFxRate;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney9;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney10;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney11;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney12;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney13;
        java.util.ArrayList emptyList;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address2;
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.TotalAmount totalAmount;
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.FeeAmount feeAmount;
        java.util.ArrayList arrayList4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeSession, "");
        java.lang.String id = qrCodeSession.getId();
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode mode = qrCodeSession.getMode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode highSpeedVideoSizes = mode != null ? getHighSpeedVideoSizes(mode) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType = qrCodeSession.getQrCodeType();
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType highSpeedVideoSizes2 = qrCodeType != null ? getHighSpeedVideoSizes(qrCodeType) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod pointOfInitiationMethod = qrCodeSession.getPointOfInitiationMethod();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod Camera2StreamConfigurationMap = pointOfInitiationMethod != null ? Camera2StreamConfigurationMap(pointOfInitiationMethod) : null;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow productFlow = qrCodeSession.getProductFlow();
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow highSpeedVideoFpsRangesFor = productFlow != null ? getHighSpeedVideoFpsRangesFor(productFlow) : null;
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.RequiredAction requiredAction = qrCodeSession.getRequiredAction();
        if (requiredAction != null) {
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = requiredAction.getOnQRCodeSessionPollingAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2 = onQRCodeSessionPollingAction != null ? onQRCodeSessionPollingAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction2 = requiredAction.getOnQRCodeSessionPollingAction();
            java.lang.Integer maximumPollingInterval = onQRCodeSessionPollingAction2 != null ? onQRCodeSessionPollingAction2.getMaximumPollingInterval() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = requiredAction.getOnQRCodeSessionErrorAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name3 = onQRCodeSessionErrorAction != null ? onQRCodeSessionErrorAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction2 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String errorReason = onQRCodeSessionErrorAction2 != null ? onQRCodeSessionErrorAction2.getErrorReason() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction3 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String issue = onQRCodeSessionErrorAction3 != null ? onQRCodeSessionErrorAction3.getIssue() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction = requiredAction.getOnQRCodeSessionBasicAction();
            qrcSessionRequiredAction = getHighSpeedVideoFpsRangesFor(name2, maximumPollingInterval, name3, errorReason, issue, onQRCodeSessionBasicAction != null ? onQRCodeSessionBasicAction.getName() : null);
        } else {
            qrcSessionRequiredAction = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Payment payment = qrCodeSession.getPayment();
        if (payment != null) {
            java.lang.String id2 = payment.getId();
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod highSpeedVideoSizes3 = getHighSpeedVideoSizes(payment.getPaymentMethod());
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(payment.getStatus());
            java.lang.String statusReason = payment.getStatusReason();
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Contingency> contingencies = payment.getContingencies();
            if (contingencies != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Contingency> list = contingencies;
                str = "";
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Contingency) it.next()).getAction()));
                }
                arrayList4 = arrayList5;
            } else {
                str = "";
                arrayList4 = null;
            }
            paymentResponse = Camera2StreamConfigurationMap(id2, highSpeedVideoSizes3, highSpeedVideoFpsRangesFor2, statusReason, arrayList4, payment.getTransactionTime());
        } else {
            str = "";
            paymentResponse = null;
        }
        java.lang.String transactionCurrency = qrCodeSession.getTransactionCurrency();
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.PaymentAmount paymentAmount = qrCodeSession.getPaymentAmount();
        if (paymentAmount != null) {
            java.lang.String currencyCode = paymentAmount.getCurrencyCode();
            java.lang.String value2 = paymentAmount.getValue();
            if (currencyCode == null) {
                currencyCode = str;
            }
            if (value2 == null) {
                value2 = str;
            }
            qrcMoney = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value2);
        } else {
            qrcMoney = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.MaximumAllowedTransactionAmount maximumAllowedTransactionAmount = qrCodeSession.getMaximumAllowedTransactionAmount();
        if (maximumAllowedTransactionAmount != null) {
            java.lang.String currencyCode2 = maximumAllowedTransactionAmount.getCurrencyCode();
            java.lang.String value3 = maximumAllowedTransactionAmount.getValue();
            if (currencyCode2 == null) {
                currencyCode2 = str;
            }
            if (value3 == null) {
                value3 = str;
            }
            qrcMoney2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode2, value3);
        } else {
            qrcMoney2 = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.NetworkTransaction networkTransaction = qrCodeSession.getNetworkTransaction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney Camera2StreamConfigurationMap2 = (networkTransaction == null || (feeAmount = networkTransaction.getFeeAmount()) == null) ? null : Camera2StreamConfigurationMap(feeAmount);
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.NetworkTransaction networkTransaction2 = qrCodeSession.getNetworkTransaction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highSpeedVideoFpsRanges = (networkTransaction2 == null || (totalAmount = networkTransaction2.getTotalAmount()) == null) ? null : getHighSpeedVideoFpsRanges(totalAmount);
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Consumer consumer = qrCodeSession.getConsumer();
        if (consumer != null) {
            java.lang.String accountId = consumer.getAccountId();
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Name name4 = consumer.getName();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName = name4 != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName(name4.getPrefix(), name4.getGivenName(), name4.getSurname(), name4.getSecondSurname(), name4.getMiddleName(), name4.getSuffix(), name4.getFullName()) : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Address address3 = consumer.getAddress();
            if (address3 != null) {
                java.lang.String addressLine1 = address3.getAddressLine1();
                java.lang.String addressLine2 = address3.getAddressLine2();
                java.lang.String addressLine3 = address3.getAddressLine3();
                java.lang.String adminArea1 = address3.getAdminArea1();
                java.lang.String adminArea2 = address3.getAdminArea2();
                java.lang.String adminArea3 = address3.getAdminArea3();
                java.lang.String adminArea4 = address3.getAdminArea4();
                java.lang.String postalCode = address3.getPostalCode();
                java.lang.String countryCode = address3.getCountryCode();
                address2 = new com.paypal.oslo.feature.qrc.domain.model.session.Address(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode == null ? str : countryCode);
            } else {
                address2 = null;
            }
            java.lang.Object email = consumer.getEmail();
            java.lang.String obj = email != null ? email.toString() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Tenant tenant = consumer.getTenant();
            qrcConsumer = new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer(accountId, qrcPersonName, address2, obj, tenant != null ? tenant.getName() : null, consumer.getExternalId(), consumer.getCountryCode());
        } else {
            qrcConsumer = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Merchant merchant2 = qrCodeSession.getMerchant();
        if (merchant2 != null) {
            java.lang.String accountId2 = merchant2.getAccountId();
            java.lang.String displayName = merchant2.getDisplayName();
            java.lang.String externalId = merchant2.getExternalId();
            java.lang.String logoUrl = merchant2.getLogoUrl();
            java.lang.String name5 = merchant2.getName();
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Address1 address4 = merchant2.getAddress();
            if (address4 != null) {
                java.lang.String addressLine12 = address4.getAddressLine1();
                java.lang.String addressLine22 = address4.getAddressLine2();
                java.lang.String addressLine32 = address4.getAddressLine3();
                java.lang.String adminArea12 = address4.getAdminArea1();
                java.lang.String adminArea22 = address4.getAdminArea2();
                java.lang.String adminArea32 = address4.getAdminArea3();
                java.lang.String adminArea42 = address4.getAdminArea4();
                java.lang.String postalCode2 = address4.getPostalCode();
                java.lang.String countryCode2 = address4.getCountryCode();
                address = new com.paypal.oslo.feature.qrc.domain.model.session.Address(addressLine12, addressLine22, addressLine32, adminArea12, adminArea22, adminArea32, adminArea42, postalCode2, countryCode2 == null ? str : countryCode2);
            } else {
                address = null;
            }
            java.lang.String partnerAccountId = merchant2.getPartnerAccountId();
            java.lang.String merchantCategoryCode = merchant2.getMerchantCategoryCode();
            java.lang.String merchantCategoryType = merchant2.getMerchantCategoryType();
            java.lang.String displayInitials = merchant2.getDisplayInitials();
            boolean showAlternateLogo = merchant2.getShowAlternateLogo();
            java.lang.String franchisorAccountId = merchant2.getFranchisorAccountId();
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Tenant1 tenant2 = merchant2.getTenant();
            merchant = getHighSpeedVideoSizes(accountId2, displayName, externalId, logoUrl, name5, address, partnerAccountId, merchantCategoryCode, merchantCategoryType, displayInitials, java.lang.Boolean.valueOf(showAlternateLogo), franchisorAccountId, tenant2 != null ? tenant2.getName() : null);
        } else {
            merchant = null;
        }
        boolean isTipEligible = qrCodeSession.isTipEligible();
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.TipConfiguration tipConfiguration = qrCodeSession.getTipConfiguration();
        if (tipConfiguration != null) {
            java.lang.String id3 = tipConfiguration.getId();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory category = tipConfiguration.getCategory();
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory highSpeedVideoFpsRangesFor3 = category != null ? getHighSpeedVideoFpsRangesFor(category) : null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType thresholdType = tipConfiguration.getThresholdType();
            com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType highResolutionOutputSizeshNQ4ISI = thresholdType != null ? getHighResolutionOutputSizeshNQ4ISI(thresholdType) : null;
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting> amountSettings = tipConfiguration.getAmountSettings();
            if (amountSettings != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting> list2 = amountSettings;
                qrcMoney6 = highSpeedVideoFpsRanges;
                qrcMoney3 = Camera2StreamConfigurationMap2;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting amountSetting = (com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting) it2.next();
                    java.lang.String currencyCode3 = amountSetting.getCurrencyCode();
                    java.lang.String value4 = amountSetting.getValue();
                    java.lang.String str2 = currencyCode3 == null ? str : currencyCode3;
                    java.util.Iterator it3 = it2;
                    if (value4 == null) {
                        value4 = str;
                    }
                    arrayList6.add(new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(str2, value4));
                    it2 = it3;
                }
                arrayList = arrayList6;
            } else {
                qrcMoney3 = Camera2StreamConfigurationMap2;
                qrcMoney6 = highSpeedVideoFpsRanges;
                arrayList = null;
            }
            java.util.List<java.lang.Integer> percentageSettings = tipConfiguration.getPercentageSettings();
            if (percentageSettings != null) {
                java.util.List<java.lang.Integer> list3 = percentageSettings;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(java.lang.String.valueOf(((java.lang.Number) it4.next()).intValue()));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus status = tipConfiguration.getStatus();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus highSpeedVideoSizes4 = status != null ? getHighSpeedVideoSizes(status) : null;
            java.lang.Boolean allowCustom = tipConfiguration.getAllowCustom();
            java.lang.Object maximumAllowedTipPercentage = tipConfiguration.getMaximumAllowedTipPercentage();
            java.lang.String obj2 = maximumAllowedTipPercentage != null ? maximumAllowedTipPercentage.toString() : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.DefaultConfigurations defaultConfigurations = tipConfiguration.getDefaultConfigurations();
            if (defaultConfigurations != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting1> amountSettings2 = defaultConfigurations.getAmountSettings();
                if (amountSettings2 == null) {
                    qrcMoney4 = qrcMoney;
                    qrcMoney5 = qrcMoney2;
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.List<com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting1> list4 = amountSettings2;
                    qrcMoney4 = qrcMoney;
                    qrcMoney5 = qrcMoney2;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    java.util.Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting1 amountSetting1 = (com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.AmountSetting1) it5.next();
                        java.lang.String currencyCode4 = amountSetting1.getCurrencyCode();
                        java.lang.String value5 = amountSetting1.getValue();
                        if (currencyCode4 == null) {
                            currencyCode4 = str;
                        }
                        java.util.Iterator it6 = it5;
                        if (value5 == null) {
                            value5 = str;
                        }
                        arrayList8.add(new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode4, value5));
                        it5 = it6;
                    }
                    emptyList = arrayList8;
                }
                java.util.List<java.lang.Integer> percentageSettings2 = defaultConfigurations.getPercentageSettings();
                if (percentageSettings2 != null) {
                    java.util.List<java.lang.Integer> list5 = percentageSettings2;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    java.util.Iterator<T> it7 = list5.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(java.lang.String.valueOf(((java.lang.Number) it7.next()).intValue()));
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                defaultTipConfigs = new com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs(emptyList, arrayList3);
            } else {
                qrcMoney4 = qrcMoney;
                qrcMoney5 = qrcMoney2;
                defaultTipConfigs = null;
            }
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.MaximumAllowedTipAmount maximumAllowedTipAmount = tipConfiguration.getMaximumAllowedTipAmount();
            if (maximumAllowedTipAmount != null) {
                java.lang.String currencyCode5 = maximumAllowedTipAmount.getCurrencyCode();
                java.lang.String value6 = maximumAllowedTipAmount.getValue();
                if (currencyCode5 == null) {
                    currencyCode5 = str;
                }
                if (value6 == null) {
                    value6 = str;
                }
                qrcMoney13 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode5, value6);
            } else {
                qrcMoney13 = null;
            }
            tipConfig = getHighSpeedVideoFpsRangesFor(id3, highSpeedVideoFpsRangesFor3, highResolutionOutputSizeshNQ4ISI, arrayList, arrayList2, highSpeedVideoSizes4, allowCustom, obj2, defaultTipConfigs, qrcMoney13);
        } else {
            qrcMoney3 = Camera2StreamConfigurationMap2;
            qrcMoney4 = qrcMoney;
            qrcMoney5 = qrcMoney2;
            qrcMoney6 = highSpeedVideoFpsRanges;
            tipConfig = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.NetworkTransaction networkTransaction3 = qrCodeSession.getNetworkTransaction();
        if (networkTransaction3 != null) {
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.SourceAmount sourceAmount = networkTransaction3.getSourceAmount();
            if (sourceAmount != null) {
                java.lang.String currencyCode6 = sourceAmount.getCurrencyCode();
                java.lang.String value7 = sourceAmount.getValue();
                if (currencyCode6 == null) {
                    currencyCode6 = str;
                }
                if (value7 == null) {
                    value7 = str;
                }
                qrcMoney7 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode6, value7);
            } else {
                qrcMoney7 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.DestinationAmount destinationAmount = networkTransaction3.getDestinationAmount();
            if (destinationAmount != null) {
                java.lang.String currencyCode7 = destinationAmount.getCurrencyCode();
                java.lang.String value8 = destinationAmount.getValue();
                if (currencyCode7 == null) {
                    currencyCode7 = str;
                }
                if (value8 == null) {
                    value8 = str;
                }
                qrcMoney8 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode7, value8);
            } else {
                qrcMoney8 = null;
            }
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.TotalAmount totalAmount2 = networkTransaction3.getTotalAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney highSpeedVideoFpsRanges2 = totalAmount2 != null ? getHighSpeedVideoFpsRanges(totalAmount2) : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.FeeAmount feeAmount2 = networkTransaction3.getFeeAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney Camera2StreamConfigurationMap3 = feeAmount2 != null ? Camera2StreamConfigurationMap(feeAmount2) : null;
            com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Fx fx = networkTransaction3.getFx();
            if (fx != null) {
                com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnMoney3 onMoney = fx.getExchangeRate().getToCurrency().getOnMoney();
                double doubleValue = (onMoney == null || (value = onMoney.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull.doubleValue();
                com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnMoney onMoney2 = fx.getAmountFrom().getOnMoney();
                if (onMoney2 != null) {
                    java.lang.String currencyCode8 = onMoney2.getCurrencyCode();
                    java.lang.String value9 = onMoney2.getValue();
                    if (currencyCode8 == null) {
                        currencyCode8 = str;
                    }
                    if (value9 == null) {
                        value9 = str;
                    }
                    qrcMoney9 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode8, value9);
                } else {
                    qrcMoney9 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnMoney1 onMoney3 = fx.getAmountTo().getOnMoney();
                if (onMoney3 != null) {
                    java.lang.String currencyCode9 = onMoney3.getCurrencyCode();
                    java.lang.String value10 = onMoney3.getValue();
                    if (currencyCode9 == null) {
                        currencyCode9 = str;
                    }
                    if (value10 == null) {
                        value10 = str;
                    }
                    qrcMoney10 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode9, value10);
                } else {
                    qrcMoney10 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnMoney2 onMoney4 = fx.getExchangeRate().getFromCurrency().getOnMoney();
                if (onMoney4 != null) {
                    java.lang.String currencyCode10 = onMoney4.getCurrencyCode();
                    java.lang.String value11 = onMoney4.getValue();
                    if (currencyCode10 == null) {
                        currencyCode10 = str;
                    }
                    if (value11 == null) {
                        value11 = str;
                    }
                    qrcMoney11 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode10, value11);
                } else {
                    qrcMoney11 = null;
                }
                com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.OnMoney3 onMoney5 = fx.getExchangeRate().getToCurrency().getOnMoney();
                if (onMoney5 != null) {
                    java.lang.String currencyCode11 = onMoney5.getCurrencyCode();
                    java.lang.String value12 = onMoney5.getValue();
                    if (currencyCode11 == null) {
                        currencyCode11 = str;
                    }
                    if (value12 == null) {
                        value12 = str;
                    }
                    qrcMoney12 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode11, value12);
                } else {
                    qrcMoney12 = null;
                }
                payPalWorldFxRate = new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate(doubleValue, qrcMoney9, qrcMoney10, qrcMoney11, qrcMoney12);
            } else {
                payPalWorldFxRate = null;
            }
            payPalWorldTransactionDetails = new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails(qrcMoney7, qrcMoney8, highSpeedVideoFpsRanges2, Camera2StreamConfigurationMap3, payPalWorldFxRate, networkTransaction3.getTransactionIntentId());
        } else {
            payPalWorldTransactionDetails = null;
        }
        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.PaymentOptions paymentOptions = qrCodeSession.getPaymentOptions();
        return Camera2StreamConfigurationMap(id, highSpeedVideoSizes, highSpeedVideoSizes2, Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor, qrcSessionRequiredAction, paymentResponse, transactionCurrency, qrcMoney4, qrcMoney5, qrcMoney3, qrcMoney6, qrcConsumer, merchant, java.lang.Boolean.valueOf(isTipEligible), tipConfig, payPalWorldTransactionDetails, paymentOptions != null ? com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.toPaymentOptions(paymentOptions) : null);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSession Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod, com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4, com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer, com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant, java.lang.Boolean bool, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSession(str, qrcMode, qrCodeType, qrcPointOfInitiationMethod, productFlow, qrcSessionRequiredAction, new com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails(str2, qrcMoney, qrcMoney4, qrcMoney2, qrcMoney3), new com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants(qrcConsumer, merchant), new com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails(bool != null ? bool.booleanValue() : false, tipConfig), payPalWorldTransactionDetails, paymentResponse, paymentOptions);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.Merchant getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.qrc.domain.model.session.Address address, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.Boolean bool, java.lang.String str10, java.lang.String str11) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.Merchant(str, str2, str3, str4, str5, address, str6, str7, str8, str9, bool != null ? bool.booleanValue() : false, str10, str11);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory, com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType, java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> list, java.util.List<java.lang.String> list2, com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus, java.lang.Boolean bool, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultTipConfigs, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.TipConfig(str, tipConfigCategory == null ? com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory.TIP_OPTION : tipConfigCategory, tipConfigThresholdType, list, list2, defaultTipConfigs, qrcTippingStatus == null ? com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.INACTIVE : qrcTippingStatus, bool, str2, qrcMoney);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, java.lang.Integer num, com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType3) {
        if (qRCodeSessionActionType != null) {
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.PollingAction(toQrcSessionActionType(qRCodeSessionActionType), num);
        }
        if (qRCodeSessionActionType2 != null) {
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction(toQrcSessionActionType(qRCodeSessionActionType2), com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReasonKt.toErrorReason(str), com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReasonKt.toErrorIssue(str2));
        }
        if (qRCodeSessionActionType3 != null) {
            return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.BasicAction(toQrcSessionActionType(qRCodeSessionActionType3));
        }
        return null;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$0[qRCodeType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.VENMO;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.UNION_PAY_INTERNATIONAL;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL_WORLD;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow qRCodeProductFlow) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$1[qRCodeProductFlow.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.IN_PERSON_PAYMENT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.DIRECT_INTEGRATION_IN_STORE_PAYMENT;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.IN_PERSON_PAYMENT;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode qRCodeMode) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$2[qRCodeMode.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.CONSUMER_PRESENTED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.MERCHANT_PRESENTED;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod qRCodePointOfInitiationMethod) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$3[qRCodePointOfInitiationMethod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod.STATIC;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod.DYNAMIC;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType toQrcSessionActionType(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType) {
        switch (qRCodeSessionActionType == null ? -1 : com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$4[qRCodeSessionActionType.ordinal()]) {
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory qRCodeTipCategory) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$5[qRCodeTipCategory.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory.TIP_OPTION;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory.TIP_ONLY;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory.TIP_OPTION;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType qRCodeTipThresholdType) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$6[qRCodeTipThresholdType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType.PERCENTAGE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType.AMOUNT;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType.PERCENTAGE;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus qRCodeTipConfigurationStatus) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$7[qRCodeTipConfigurationStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.ACTIVE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.INACTIVE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$8[qRCodePaymentMethod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod.PAYPAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod.VENMO;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod.PAYPAL_WORLD;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod.PAYPAL;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$9[qRCodePaymentStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.SUCCESS;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.DECLINED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.CONTINGENCY;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.PROCESSING;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.PROCESSING;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.ContingencyAction getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.type.QRContingencyAction qRContingencyAction) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.WhenMappings.$EnumSwitchMapping$10[qRContingencyAction.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.ContingencyAction.THREEDS_AUTHENTICATION_REQUIRED;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.ContingencyAction.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.FeeAmount feeAmount) {
        java.lang.String currencyCode = feeAmount.getCurrencyCode();
        java.lang.String value = feeAmount.getValue();
        if (currencyCode == null) {
            currencyCode = "";
        }
        if (value == null) {
            value = "";
        }
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.TotalAmount totalAmount) {
        java.lang.String currencyCode = totalAmount.getCurrencyCode();
        java.lang.String value = totalAmount.getValue();
        if (currencyCode == null) {
            currencyCode = "";
        }
        if (value == null) {
            value = "";
        }
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.FeeAmount feeAmount) {
        java.lang.String currencyCode = feeAmount.getCurrencyCode();
        java.lang.String value = feeAmount.getValue();
        if (currencyCode == null) {
            currencyCode = "";
        }
        if (value == null) {
            value = "";
        }
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.TotalAmount totalAmount) {
        java.lang.String currencyCode = totalAmount.getCurrencyCode();
        java.lang.String value = totalAmount.getValue();
        if (currencyCode == null) {
            currencyCode = "";
        }
        if (value == null) {
            value = "";
        }
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(currencyCode, value);
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse toPaymentResponse(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment) {
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus status;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod paymentMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmQrCodePayment, "");
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment = confirmQrCodePayment.getPayment();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction = null;
        java.lang.String id = payment != null ? payment.getId() : null;
        java.lang.String str = id == null ? "" : id;
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment2 = confirmQrCodePayment.getPayment();
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod highSpeedVideoSizes = (payment2 == null || (paymentMethod = payment2.getPaymentMethod()) == null) ? null : getHighSpeedVideoSizes(paymentMethod);
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment3 = confirmQrCodePayment.getPayment();
        if (payment3 == null || (status = payment3.getStatus()) == null || (paymentStatus = getHighSpeedVideoFpsRangesFor(status)) == null) {
            paymentStatus = com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.PROCESSING;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus2 = paymentStatus;
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment4 = confirmQrCodePayment.getPayment();
        java.lang.String statusReason = payment4 != null ? payment4.getStatusReason() : null;
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment5 = confirmQrCodePayment.getPayment();
        java.lang.String transactionTime = payment5 != null ? payment5.getTransactionTime() : null;
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction = confirmQrCodePayment.getRequiredAction();
        if (requiredAction != null) {
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = requiredAction.getOnQRCodeSessionPollingAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2 = onQRCodeSessionPollingAction != null ? onQRCodeSessionPollingAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction2 = requiredAction.getOnQRCodeSessionPollingAction();
            java.lang.Integer maximumPollingInterval = onQRCodeSessionPollingAction2 != null ? onQRCodeSessionPollingAction2.getMaximumPollingInterval() : null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = requiredAction.getOnQRCodeSessionErrorAction();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name3 = onQRCodeSessionErrorAction != null ? onQRCodeSessionErrorAction.getName() : null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction2 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String errorReason = onQRCodeSessionErrorAction2 != null ? onQRCodeSessionErrorAction2.getErrorReason() : null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction3 = requiredAction.getOnQRCodeSessionErrorAction();
            java.lang.String issue = onQRCodeSessionErrorAction3 != null ? onQRCodeSessionErrorAction3.getIssue() : null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction = requiredAction.getOnQRCodeSessionBasicAction();
            qrcSessionRequiredAction = getHighSpeedVideoFpsRangesFor(name2, maximumPollingInterval, name3, errorReason, issue, onQRCodeSessionBasicAction != null ? onQRCodeSessionBasicAction.getName() : null);
        }
        return new com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse(str, highSpeedVideoSizes, paymentStatus2, statusReason, null, transactionTime, qrcSessionRequiredAction);
    }

    private static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod paymentMethod, com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus, java.lang.String str2, java.util.List list, java.lang.String str3) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse(str, paymentMethod, paymentStatus, str2, list, str3, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.VENMO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.UNION_PAY_INTERNATIONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL_WORLD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow.values().length];
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow.IN_PERSON_PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow.DIRECT_INTEGRATION_IN_STORE_PAYMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductFlow.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode.values().length];
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode.CONSUMER_PRESENTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode.MERCHANT_PRESENTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeMode.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod.values().length];
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod.STATIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod.DYNAMIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodePointOfInitiationMethod.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.values().length];
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.PAYMENT_RESULT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.ENROLLMENT_REQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.PAYMENT_PULL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.PAYMENT_PUSH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.VALIDATION_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.REDIRECT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory.values().length];
            try {
                iArr6[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory.TIP_OPTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr6[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory.TIP_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr6[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipCategory.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType.values().length];
            try {
                iArr7[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType.PERCENTAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr7[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType.AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr7[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipThresholdType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus.values().length];
            try {
                iArr8[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr8[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr8[com.paypal.oslo.feature.qrc.graphql.type.QRCodeTipConfigurationStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.values().length];
            try {
                iArr9[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr9[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.VENMO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr9[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.PAYPAL_WORLD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr9[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.values().length];
            try {
                iArr10[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr10[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.DECLINED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr10[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.CONTINGENCY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr10[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.PROCESSING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr10[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRContingencyAction.values().length];
            try {
                iArr11[com.paypal.oslo.feature.qrc.graphql.type.QRContingencyAction.THREEDS_AUTHENTICATION_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr11[com.paypal.oslo.feature.qrc.graphql.type.QRContingencyAction.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$10 = iArr11;
        }
    }
}
