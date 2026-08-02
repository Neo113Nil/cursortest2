package mc.util;

/* loaded from: classes17.dex */
public class TransactionOutcomeDecoder {
    public static common.emv.kernel.TransactionOutcome.ErrorIndication getErrorIndicationData(java.util.Map<common.emv.util.Tag, byte[]> map, int i, common.emv.kernel.TransactionOutcome.ErrorIndication errorIndication) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        if (a(bArr)) {
            return errorIndication;
        }
        java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(bArr);
        return new common.emv.kernel.TransactionOutcome.ErrorIndication((common.emv.kernel.TransactionOutcome.ErrorIndication_L1) a(createMap, 1, errorIndication.getL1(), new java.util.function.Function() { // from class: mc.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return common.emv.kernel.TransactionOutcome.ErrorIndication_L1.messageIdentifierOf(((java.lang.Integer) obj).intValue());
            }
        }), (common.emv.kernel.TransactionOutcome.ErrorIndication_L2) a(createMap, 2, errorIndication.getL2(), new java.util.function.Function() { // from class: mc.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return common.emv.kernel.TransactionOutcome.ErrorIndication_L2.fromCode(((java.lang.Integer) obj).intValue());
            }
        }), (common.emv.kernel.TransactionOutcome.ErrorIndication_L3) a(createMap, 3, errorIndication.getL3(), new java.util.function.Function() { // from class: mc.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return common.emv.kernel.TransactionOutcome.ErrorIndication_L3.fromCode(((java.lang.Integer) obj).intValue());
            }
        }), a(createMap, 4, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX), (common.emv.kernel.TransactionOutcome.StandardMessage) a(createMap, 5, errorIndication.getMessage(), new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda5()));
    }

    public static common.emv.kernel.TransactionOutcome decode(common.emv.kernel.TransactionRequest transactionRequest, byte[] bArr) {
        common.emv.kernel.TransactionOutcome transactionOutcome = new common.emv.kernel.TransactionOutcome(transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication);
        if (bArr != null && bArr.length > 4) {
            java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(java.nio.ByteBuffer.wrap(bArr, 0, bArr.length));
            mc.util.TransactionOutcomeDecoder.a aVar = mc.util.TransactionOutcomeDecoder.a.Outcome;
            if (!a(createMap.get(aVar.s))) {
                if (common.emv.util.Logger.isLogEnable()) {
                    common.emv.util.HexUtil.encodeToString(bArr);
                }
                common.emv.kernel.TransactionOutcome transactionOutcome2 = new common.emv.kernel.TransactionOutcome(transactionRequest, (common.emv.kernel.TransactionOutcome.Outcome) a(createMap, aVar.r, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda0()));
                transactionOutcome2.setStart((common.emv.kernel.TransactionOutcome.Start) a(createMap, mc.util.TransactionOutcomeDecoder.a.Start.r, common.emv.kernel.TransactionOutcome.Start.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda1()));
                transactionOutcome2.setOnlineResponseData((common.emv.kernel.TransactionOutcome.OnlineResponseData) a(createMap, mc.util.TransactionOutcomeDecoder.a.OnlineResponseData.r, common.emv.kernel.TransactionOutcome.OnlineResponseData.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda2()));
                transactionOutcome2.setCvm((common.emv.kernel.TransactionOutcome.CVM) a(createMap, mc.util.TransactionOutcomeDecoder.a.CVM.r, common.emv.kernel.TransactionOutcome.CVM.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda3()));
                transactionOutcome2.setUiReqOnOutcome(a(createMap, mc.util.TransactionOutcomeDecoder.a.UIReqOnOutcome.r, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA));
                transactionOutcome2.setUiReqOnRestart(a(createMap, mc.util.TransactionOutcomeDecoder.a.UIReqOnRestart.r, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA));
                transactionOutcome2.setDataRecord(createMap.get(mc.util.TransactionOutcomeDecoder.a.DataRecord.s));
                transactionOutcome2.setDiscretionaryData(createMap.get(mc.util.TransactionOutcomeDecoder.a.DiscretionaryData.s));
                transactionOutcome2.setAlternateInterfacePreference((common.emv.kernel.TransactionOutcome.AlternateInterfacePreference) a(createMap, mc.util.TransactionOutcomeDecoder.a.AlternativeInterface.r, common.emv.kernel.TransactionOutcome.AlternateInterfacePreference.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda4()));
                transactionOutcome2.setReceipt(a(createMap, mc.util.TransactionOutcomeDecoder.a.Receipt.r, false));
                transactionOutcome2.setFieldOffRequest(a(createMap, mc.util.TransactionOutcomeDecoder.a.FieldOffRequest.r, 0));
                transactionOutcome2.setRemovalTimeout(a(createMap, mc.util.TransactionOutcomeDecoder.a.RemovalTimeout.r, 0));
                transactionOutcome2.setTvr(createMap.get(mc.util.TransactionOutcomeDecoder.a.TVR.s));
                transactionOutcome2.setUiRequestData(createMap.get(mc.util.TransactionOutcomeDecoder.a.UIReqData.s));
                transactionOutcome2.setOutcomeParameterSet(createMap.get(mc.util.TransactionOutcomeDecoder.a.OutcomeParamSet.s));
                transactionOutcome2.setErrorIndication(getErrorIndicationData(createMap, mc.util.TransactionOutcomeDecoder.a.ErrorIndication.r, common.emv.kernel.TransactionOutcome.ErrorIndication.NA));
                return transactionOutcome2;
            }
        }
        return transactionOutcome;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean a(java.util.Map<common.emv.util.Tag, byte[]> map, int i, boolean z) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        return a(bArr) ? z : bArr[0] != 0;
    }

    public static java.lang.String a(java.util.Map<common.emv.util.Tag, byte[]> map, int i, java.lang.String str) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        return (bArr == null || bArr.length <= 0) ? str : common.emv.util.HexUtil.encodeToString(bArr);
    }

    public static <T> T a(java.util.Map<common.emv.util.Tag, byte[]> map, int i, T t, java.util.function.Function<java.lang.Integer, T> function) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        return a(bArr) ? t : function.apply(java.lang.Integer.valueOf(bArr[0] & 255));
    }

    public enum a {
        Outcome(1),
        Start(2),
        OnlineResponseData(3),
        CVM(4),
        UIReqOnOutcome(5),
        UIReqOnRestart(6),
        DataRecord(7),
        DiscretionaryData(8),
        AlternativeInterface(9),
        Receipt(10),
        FieldOffRequest(11),
        RemovalTimeout(12),
        TVR(13),
        ErrorIndication(14),
        OutcomeParamSet(14647593),
        UIReqData(14647574);

        public final int r;
        public final common.emv.util.Tag s;

        a(int i) {
            this.r = i;
            this.s = new common.emv.util.Tag(i);
        }
    }

    public static common.emv.kernel.TransactionOutcome.UserInterfaceRequestData a(java.util.Map<common.emv.util.Tag, byte[]> map, int i, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        if (a(bArr)) {
            return userInterfaceRequestData;
        }
        java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(bArr);
        return new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData((common.emv.kernel.TransactionOutcome.StandardMessage) a(createMap, 1, userInterfaceRequestData.getMessage(), new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda5()), (common.emv.kernel.TransactionOutcome.Status) a(createMap, 2, userInterfaceRequestData.getStatus(), new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda6()), a(createMap, 3, userInterfaceRequestData.getHoldTime()), a(createMap, 4, userInterfaceRequestData.getLanguagePreference()), (common.emv.kernel.TransactionOutcome.ValueQualifier) a(createMap, 5, userInterfaceRequestData.getValueQualifier(), new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda7()), a(createMap, 6, userInterfaceRequestData.getValue()), a(createMap, 7, userInterfaceRequestData.getCurrencyCode()));
    }

    public static int a(java.util.Map<common.emv.util.Tag, byte[]> map, int i, int i2) {
        byte[] bArr = map.get(new common.emv.util.Tag(i));
        if (a(bArr)) {
            return i2;
        }
        int i3 = 0;
        for (byte b : bArr) {
            i3 = (i3 << 8) | (b & 255);
        }
        return i3;
    }
}
