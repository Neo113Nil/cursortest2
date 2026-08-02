package common.emv.kernel;

/* loaded from: classes17.dex */
public class TransactionData {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f6693a;
    public static final java.text.SimpleDateFormat b;
    public final common.emv.configuration.DataObjectList c;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Transaction Data: \n");
        boolean z = false;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.c.entrySet()) {
            if (z) {
                stringBuffer.append(", \n");
            }
            stringBuffer.append(entry.getKey()).append(" : ").append(entry.getValue());
            z = true;
        }
        return stringBuffer.toString();
    }

    public common.emv.kernel.TransactionData setVisaRiskParameterCheckingCapabilities(byte b2) {
        this.c.put(zb.g.J.b0, java.lang.String.format("%02x", java.lang.Byte.valueOf(b2)));
        return this;
    }

    public common.emv.kernel.TransactionData setUnpredictableNumber(byte[] bArr, int i) {
        if (bArr == null || bArr.length - i < 4) {
            throw new java.lang.IllegalArgumentException("invalid unpredicatable number");
        }
        this.c.put(zb.g.f.b0, common.emv.util.HexUtil.encodeToString(bArr, i, 4));
        return this;
    }

    public common.emv.kernel.TransactionData setUnpredictableNumber(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            throw new java.lang.IllegalArgumentException("invalid unpredicatable number");
        }
        this.c.put(zb.g.f.b0, common.emv.util.HexUtil.encodeToString(bArr));
        return this;
    }

    public common.emv.kernel.TransactionData setTrxSeqCounter(int i) {
        this.c.put(zb.g.E.b0, java.lang.String.format("%08d", java.lang.Integer.valueOf(i)));
        return this;
    }

    public common.emv.kernel.TransactionData setTransactionType(common.emv.kernel.TransactionData.TransactionType transactionType) {
        this.c.put(zb.g.e.b0, transactionType.code);
        return this;
    }

    public common.emv.kernel.TransactionData setTransactionCategoryCode(java.lang.String str) {
        this.c.put(zb.g.R.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setTime(java.lang.String str) {
        this.c.put(zb.g.d.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setTerminalCapabilities(byte[] bArr) {
        if (bArr == null || bArr.length != 3) {
            throw new java.lang.IllegalArgumentException("invalid terminal capabilities");
        }
        this.c.put(zb.g.D.b0, common.emv.util.HexUtil.encodeToString(bArr));
        return this;
    }

    public common.emv.kernel.TransactionData setTTQ(java.lang.String str) {
        this.c.put(zb.g.y.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setPoiParam(java.lang.String str) {
        this.c.put(zb.g.i.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setMerchantNameAndLocation(java.lang.String str) {
        this.c.put(zb.g.C.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setMerchantCustomData(java.lang.String str) {
        this.c.put(zb.g.S.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setMerchantCategoryCode(java.lang.String str) {
        this.c.put(zb.g.B.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setDateTime(java.util.Date date) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("date is null pointer exceptions");
        }
        this.c.put(zb.g.c.b0, f6693a.format(date));
        this.c.put(zb.g.d.b0, b.format(date));
        return this;
    }

    public common.emv.kernel.TransactionData setDate(java.lang.String str) {
        this.c.put(zb.g.c.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setCurrencyExponent(int i) {
        this.c.put(zb.g.h.b0, java.lang.String.format("%02x", java.lang.Integer.valueOf(i)));
        return this;
    }

    public common.emv.kernel.TransactionData setCurrencyCode(java.lang.String str) {
        if (str == null || str.length() != 4) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c.put(zb.g.g.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setCountryCode(java.lang.String str) {
        if (str == null || str.length() != 4) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c.put(zb.g.A.b0, str);
        return this;
    }

    public common.emv.kernel.TransactionData setContactlessPOSImplementationOption(byte b2) {
        this.c.put(zb.g.F.b0, java.lang.String.format("%02x", java.lang.Byte.valueOf(b2)));
        return this;
    }

    public common.emv.kernel.TransactionData setContactlessKernelCapabilities(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            throw new java.lang.IllegalArgumentException("invalid contactless kernel capabilities");
        }
        this.c.put(zb.g.G.b0, common.emv.util.HexUtil.encodeToString(bArr));
        return this;
    }

    public common.emv.kernel.TransactionData setAmountOther(long j) {
        this.c.put(zb.g.b.b0, java.lang.String.format("%012d", java.lang.Long.valueOf(j)));
        return this;
    }

    public common.emv.kernel.TransactionData setAmountOther(double d, int i) {
        setAmountOther(formatAmount(d, i));
        return this;
    }

    public common.emv.kernel.TransactionData setAmountAuth(long j) {
        this.c.put(zb.g.f7095a.b0, java.lang.String.format("%012d", java.lang.Long.valueOf(j)));
        return this;
    }

    public common.emv.kernel.TransactionData setAmountAuth(double d, int i) {
        setAmountAuth(formatAmount(d, i));
        return this;
    }

    public common.emv.kernel.TransactionData setAmexUnableToGoOnline() {
        this.c.put(zb.g.P.b0, "01");
        return this;
    }

    public common.emv.kernel.TransactionData setAmexEnhancedContactlessReaderCapabilities(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            throw new java.lang.IllegalArgumentException("invalid amex enhanced contactless reader capabilities");
        }
        this.c.put(zb.g.O.b0, common.emv.util.HexUtil.encodeToString(bArr));
        return this;
    }

    public common.emv.kernel.TransactionData setAmexContactlessReaderCapabilities(byte[] bArr) {
        if (bArr == null || bArr.length != 1) {
            throw new java.lang.IllegalArgumentException("invalid amex contactless reader capabilities");
        }
        this.c.put(zb.g.N.b0, common.emv.util.HexUtil.encodeToString(bArr));
        return this;
    }

    public common.emv.kernel.TransactionData setAccountType(java.lang.String str) {
        this.c.put(zb.g.T.b0, str);
        return this;
    }

    public java.lang.String getVisaRiskParameterCheckingCapabilities() {
        return this.c.get(zb.g.J.b0);
    }

    public java.lang.String getUnpredictableNumber() {
        return this.c.get(zb.g.f.b0);
    }

    public java.lang.String getTrxSeqCounter() {
        return this.c.get(zb.g.E.b0);
    }

    public common.emv.kernel.TransactionData.TransactionType getTransactionType() {
        return common.emv.kernel.TransactionData.TransactionType.of(this.c.get(zb.g.e.b0));
    }

    public java.lang.String getTime() {
        return this.c.get(zb.g.c.b0);
    }

    public java.lang.String getDate() {
        return this.c.get(zb.g.c.b0);
    }

    public common.emv.configuration.DataObjectList getData() {
        return this.c;
    }

    public java.lang.String getCurrencyExponent() {
        return this.c.get(zb.g.h.b0);
    }

    public java.lang.String getCurrencyCode() {
        return this.c.get(zb.g.g.b0);
    }

    public java.lang.String getCountryCode() {
        return this.c.get(zb.g.A.b0);
    }

    public java.lang.String getContactlessPOSImplementationOptions() {
        return this.c.get(zb.g.F.b0);
    }

    public java.lang.String getContactlessKernelCapabilities() {
        return this.c.get(zb.g.G.b0);
    }

    public java.lang.String getAmountOther() {
        return this.c.get(zb.g.b.b0);
    }

    public java.lang.String getAmountAuth() {
        return this.c.get(zb.g.f7095a.b0);
    }

    public java.lang.Boolean getAmexIsUnableToGoOnline() {
        common.emv.configuration.DataObjectList dataObjectList = this.c;
        zb.g gVar = zb.g.P;
        return java.lang.Boolean.valueOf(java.util.Objects.equals(dataObjectList.get(gVar.b0) == null ? com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX : this.c.get(gVar.b0), "01"));
    }

    public java.lang.String getAmexEnhancedContactlessReaderCapabilities() {
        return this.c.get(zb.g.O.b0);
    }

    public java.lang.String getAmexContactlessReaderCapabilities() {
        return this.c.get(zb.g.N.b0);
    }

    public enum TransactionType {
        Purchase(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX),
        PurchaseWithCashback("09"),
        CashAdvance("01"),
        CashDisbursement("17"),
        Refund("20"),
        RetrieveDataElement("78"),
        UpdateDataElement("79"),
        TrxType21("21"),
        TrxType88("88"),
        TrxType93("93"),
        Unknown(" ");

        public final java.lang.String code;

        public static common.emv.kernel.TransactionData.TransactionType of(java.lang.String str) {
            if (str == null) {
                return Unknown;
            }
            common.emv.kernel.TransactionData.TransactionType[] values = values();
            for (int i = 0; i < 11; i++) {
                common.emv.kernel.TransactionData.TransactionType transactionType = values[i];
                if (transactionType.code.equals(str)) {
                    return transactionType;
                }
            }
            return Unknown;
        }

        TransactionType(java.lang.String str) {
            this.code = str;
        }
    }

    public java.lang.String getAccountType() {
        return this.c.get(zb.g.T.b0);
    }

    public static long formatAmount(double d, int i) {
        if (i < 0 || d < 0.0d) {
            throw new java.lang.IllegalArgumentException();
        }
        return (i == 0 ? java.lang.Double.valueOf(d) : java.math.BigDecimal.valueOf(d).multiply(java.math.BigDecimal.valueOf(java.lang.Math.pow(10.0d, i)))).longValue();
    }

    public TransactionData() {
        java.util.Date date = new java.util.Date();
        common.emv.configuration.DataObjectList dataObjectList = new common.emv.configuration.DataObjectList();
        this.c = dataObjectList;
        dataObjectList.put(zb.g.b.b0, "000000000000");
        dataObjectList.put(zb.g.c.b0, f6693a.format(date));
        dataObjectList.put(zb.g.d.b0, b.format(date));
        dataObjectList.put(zb.g.e.b0, common.emv.kernel.TransactionData.TransactionType.Purchase.code);
        dataObjectList.put(zb.g.f.b0, common.emv.util.RandomUtil.generateRandomInHexString(4));
    }

    static {
        java.util.Locale locale = java.util.Locale.US;
        f6693a = new java.text.SimpleDateFormat(com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, locale);
        b = new java.text.SimpleDateFormat("HHmmss", locale);
    }
}
