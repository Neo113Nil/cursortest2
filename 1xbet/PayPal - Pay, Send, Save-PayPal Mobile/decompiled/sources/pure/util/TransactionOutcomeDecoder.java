package pure.util;

/* loaded from: classes18.dex */
public class TransactionOutcomeDecoder {
    public static common.emv.kernel.TransactionOutcome decode(common.emv.kernel.TransactionRequest transactionRequest, byte[] bArr) {
        common.emv.kernel.TransactionOutcome transactionOutcome = new common.emv.kernel.TransactionOutcome(transactionRequest, common.emv.kernel.TransactionOutcome.Outcome.EndApplication);
        if (bArr != null && bArr.length > 4) {
            java.util.Map<common.emv.util.Tag, byte[]> createMap = common.emv.util.BerTlv.createMap(java.nio.ByteBuffer.wrap(bArr, 0, bArr.length));
            pure.util.TransactionOutcomeDecoder.a aVar = pure.util.TransactionOutcomeDecoder.a.Outcome;
            if (!a(createMap.get(aVar.q))) {
                if (common.emv.util.Logger.isLogEnable()) {
                    common.emv.util.HexUtil.encodeToString(bArr);
                }
                common.emv.kernel.TransactionOutcome transactionOutcome2 = new common.emv.kernel.TransactionOutcome(transactionRequest, (common.emv.kernel.TransactionOutcome.Outcome) a(createMap, aVar.p, common.emv.kernel.TransactionOutcome.Outcome.EndApplication, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda0()));
                transactionOutcome2.setStart((common.emv.kernel.TransactionOutcome.Start) a(createMap, pure.util.TransactionOutcomeDecoder.a.Start.p, common.emv.kernel.TransactionOutcome.Start.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda1()));
                transactionOutcome2.setOnlineResponseData((common.emv.kernel.TransactionOutcome.OnlineResponseData) a(createMap, pure.util.TransactionOutcomeDecoder.a.OnlineResponseData.p, common.emv.kernel.TransactionOutcome.OnlineResponseData.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda2()));
                transactionOutcome2.setCvm((common.emv.kernel.TransactionOutcome.CVM) a(createMap, pure.util.TransactionOutcomeDecoder.a.CVM.p, common.emv.kernel.TransactionOutcome.CVM.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda3()));
                transactionOutcome2.setUiReqOnOutcome(a(createMap, pure.util.TransactionOutcomeDecoder.a.UIReqOnOutcome.p, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA));
                transactionOutcome2.setUiReqOnRestart(a(createMap, pure.util.TransactionOutcomeDecoder.a.UIReqOnRestart.p, common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA));
                transactionOutcome2.setDataRecord(createMap.get(pure.util.TransactionOutcomeDecoder.a.DataRecord.q));
                transactionOutcome2.setDiscretionaryData(createMap.get(pure.util.TransactionOutcomeDecoder.a.DiscretionaryData.q));
                transactionOutcome2.setAlternateInterfacePreference((common.emv.kernel.TransactionOutcome.AlternateInterfacePreference) a(createMap, pure.util.TransactionOutcomeDecoder.a.AlternativeInterface.p, common.emv.kernel.TransactionOutcome.AlternateInterfacePreference.NA, new amex.util.TransactionOutcomeDecoder$$ExternalSyntheticLambda4()));
                transactionOutcome2.setReceipt(a(createMap, pure.util.TransactionOutcomeDecoder.a.Receipt.p, false));
                transactionOutcome2.setFieldOffRequest(a(createMap, pure.util.TransactionOutcomeDecoder.a.FieldOffRequest.p, 0));
                transactionOutcome2.setRemovalTimeout(a(createMap, pure.util.TransactionOutcomeDecoder.a.RemovalTimeout.p, 0));
                transactionOutcome2.setOutcomeParameterSet(createMap.get(pure.util.TransactionOutcomeDecoder.a.OutcomeParamSet.q));
                transactionOutcome2.setUiRequestData(createMap.get(pure.util.TransactionOutcomeDecoder.a.UIReqData.q));
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
        OutcomeParamSet(14647593),
        UIReqData(14647574);

        public final int p;
        public final common.emv.util.Tag q;

        a(int i) {
            this.p = i;
            this.q = new common.emv.util.Tag(i);
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
