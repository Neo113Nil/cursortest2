package util.h.xy.bq;

/* loaded from: classes5.dex */
public class d extends util.h.xy.bq.md implements com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext {
    private static final byte[][] getHighResolutionOutputSizeshNQ4ISI = {f1002, f1011, f1007};
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private util.h.xy.bq.rb Camera2StreamConfigurationMap;
    private util.h.xy.bq.c getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getOutputMinFrameDuration;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 49) + (i | 49)) % 128;
    }

    public d(byte[] bArr) {
        super(bArr);
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25056 = util.h.xy.ar.a.m25056(bArr, getHighResolutionOutputSizeshNQ4ISI);
        if (m25056.containsKey(java.nio.ByteBuffer.wrap(f1011))) {
            byte[] m25110 = m25056.get(java.nio.ByteBuffer.wrap(f1011)).m25110();
            this.getInputFormats = m25110;
            util.h.xy.ar.b.m25074(m25110);
        } else {
            this.getInputFormats = null;
        }
        if (m25056.containsKey(java.nio.ByteBuffer.wrap(f1007))) {
            byte[] m251102 = m25056.get(java.nio.ByteBuffer.wrap(f1007)).m25110();
            this.getHighSpeedVideoSizesFor = m251102;
            util.h.xy.ar.b.m25074(m251102);
        } else {
            this.getHighSpeedVideoSizesFor = null;
        }
        this.getOutputMinFrameDuration = m25056.get(java.nio.ByteBuffer.wrap(f1002)).m25110();
        this.Camera2StreamConfigurationMap = new util.h.xy.bq.rb(bArr);
        this.getHighSpeedVideoSizes = new util.h.xy.bq.c(bArr);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext
    public com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo getTransactionInfo() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext
    public com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo getTerminalInfo() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 39) % 128;
        util.h.xy.bq.rb rbVar = this.Camera2StreamConfigurationMap;
        int i2 = (i & 87) + (i | 87);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return rbVar;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext
    public com.gemalto.mfs.mwsdk.payment.engine.Outcome getTransactionOutcome() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0 ? this.getOutputMinFrameDuration[0] == com.gemalto.mfs.mwsdk.payment.engine.Outcome.AUTHORIZE_ONLINE.getValue() : this.getOutputMinFrameDuration[1] == com.gemalto.mfs.mwsdk.payment.engine.Outcome.AUTHORIZE_ONLINE.getValue()) {
            com.gemalto.mfs.mwsdk.payment.engine.Outcome outcome = com.gemalto.mfs.mwsdk.payment.engine.Outcome.AUTHORIZE_ONLINE;
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i3 ^ 59) + ((i3 & 59) << 1)) % 128;
            return outcome;
        }
        if (this.getOutputMinFrameDuration[0] == com.gemalto.mfs.mwsdk.payment.engine.Outcome.AUTHENTICATE_OFFLINE.getValue()) {
            com.gemalto.mfs.mwsdk.payment.engine.Outcome outcome2 = com.gemalto.mfs.mwsdk.payment.engine.Outcome.AUTHENTICATE_OFFLINE;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 1) % 128;
            return outcome2;
        }
        if (this.getOutputMinFrameDuration[0] == com.gemalto.mfs.mwsdk.payment.engine.Outcome.WALLET_ACTION_REQUIRED.getValue()) {
            int i4 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i4 ^ 61) + ((i4 & 61) << 1)) % 128;
            com.gemalto.mfs.mwsdk.payment.engine.Outcome outcome3 = com.gemalto.mfs.mwsdk.payment.engine.Outcome.WALLET_ACTION_REQUIRED;
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i5 | 45) << 1) - (i5 ^ 45)) % 128;
            return outcome3;
        }
        if (this.getOutputMinFrameDuration[0] != com.gemalto.mfs.mwsdk.payment.engine.Outcome.DECLINE_BY_TERMINAL.getValue()) {
            if (this.getOutputMinFrameDuration[0] == com.gemalto.mfs.mwsdk.payment.engine.Outcome.DECLINE_BY_CARD.getValue()) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                return com.gemalto.mfs.mwsdk.payment.engine.Outcome.DECLINE_BY_CARD;
            }
            com.gemalto.mfs.mwsdk.payment.engine.Outcome outcome4 = com.gemalto.mfs.mwsdk.payment.engine.Outcome.UNKNOWN;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 1) % 128;
            return outcome4;
        }
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = (i6 & 47) + (i6 | 47);
        getHighSpeedVideoFpsRangesFor = i7 % 128;
        if (i7 % 2 == 0) {
            return com.gemalto.mfs.mwsdk.payment.engine.Outcome.WALLET_ACTION_REQUIRED;
        }
        com.gemalto.mfs.mwsdk.payment.engine.Outcome outcome5 = com.gemalto.mfs.mwsdk.payment.engine.Outcome.WALLET_ACTION_REQUIRED;
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext
    public byte[] getTransactionId() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 83) + ((i & 83) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        byte[] bArr = this.getInputFormats;
        getHighSpeedVideoFpsRanges = (i2 + 27) % 128;
        return bArr;
    }

    @Override // util.h.xy.bq.md, com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public double getAmount() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 99) + ((i & 99) << 1)) % 128;
        double amount = super.getAmount();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 61) % 128;
        return amount;
    }

    @Override // util.h.xy.bq.md, com.gemalto.mfs.mwsdk.payment.engine.TransactionContext
    public byte getTrxType() {
        int i = getHighSpeedVideoFpsRangesFor + 33;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return super.getTrxType();
        }
        super.getTrxType();
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionContext
    public com.gemalto.mfs.mwsdk.payment.engine.TransactionType getRichTrxType() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 99) + (i | 99)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType = com.gemalto.mfs.mwsdk.payment.engine.TransactionType.get(super.getTrxType());
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        if (bArr != null) {
            int i2 = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            getHighSpeedVideoFpsRanges = i2;
            if (bArr.length > 0) {
                int i3 = (((i2 | 57) << 1) - (i2 ^ 57)) % 128;
                getHighSpeedVideoFpsRangesFor = i3;
                if (bArr[0] == 1) {
                    int i4 = i3 + 111;
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        return com.gemalto.mfs.mwsdk.payment.engine.TransactionType.TRANSIT;
                    }
                    com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType2 = com.gemalto.mfs.mwsdk.payment.engine.TransactionType.TRANSIT;
                    throw new java.lang.ArithmeticException();
                }
            }
        }
        return transactionType;
    }
}
