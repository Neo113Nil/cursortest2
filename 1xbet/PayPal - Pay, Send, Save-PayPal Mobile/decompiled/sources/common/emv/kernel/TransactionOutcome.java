package common.emv.kernel;

/* loaded from: classes17.dex */
public final class TransactionOutcome {

    /* renamed from: a, reason: collision with root package name */
    public final common.emv.kernel.TransactionRequest f6695a;
    public final common.emv.kernel.TransactionOutcome.Outcome b;
    public common.emv.kernel.TransactionOutcome.Start c = common.emv.kernel.TransactionOutcome.Start.NA;
    public common.emv.kernel.TransactionOutcome.OnlineResponseData d = common.emv.kernel.TransactionOutcome.OnlineResponseData.NA;
    public common.emv.kernel.TransactionOutcome.CVM e = common.emv.kernel.TransactionOutcome.CVM.NA;
    public common.emv.kernel.TransactionOutcome.UserInterfaceRequestData f;
    public common.emv.kernel.TransactionOutcome.UserInterfaceRequestData g;
    public byte[] h;
    public byte[] i;
    public common.emv.kernel.TransactionOutcome.AlternateInterfacePreference j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f6696o;
    public byte[] p;
    public byte[] q;
    public common.emv.kernel.TransactionOutcome.ErrorIndication r;

    public final boolean isUiReqOnOutcomePresent() {
        a();
        return this.f.f6713a != common.emv.kernel.TransactionOutcome.StandardMessage.NA;
    }

    public final boolean isUiReqOnRestartPresent() {
        a();
        return this.g.f6713a != common.emv.kernel.TransactionOutcome.StandardMessage.NA;
    }

    public final void setUiRequestData(byte[] bArr) {
        a();
        this.f6696o = bArr;
    }

    public final void setUiReqOnRestart(common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData) {
        a();
        this.g = userInterfaceRequestData;
    }

    public final void setUiReqOnOutcome(common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData) {
        a();
        if (userInterfaceRequestData == null) {
            this.f = common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA;
        } else {
            this.f = userInterfaceRequestData;
        }
    }

    public final void setTvr(byte[] bArr) {
        a();
        this.q = bArr;
    }

    public final void setStart(common.emv.kernel.TransactionOutcome.Start start) {
        a();
        this.c = start;
    }

    public final void setRemovalTimeout(int i) {
        a();
        this.m = i;
    }

    public final void setReceipt(boolean z) {
        a();
        this.k = z;
    }

    public final void setOutcomeParameterSet(byte[] bArr) {
        a();
        this.p = bArr;
    }

    public final void setOnlineResponseData(common.emv.kernel.TransactionOutcome.OnlineResponseData onlineResponseData) {
        a();
        this.d = onlineResponseData;
    }

    public final void setFieldOffRequest(int i) {
        a();
        this.l = i;
    }

    public final void setErrorIndication(common.emv.kernel.TransactionOutcome.ErrorIndication errorIndication) {
        this.r = errorIndication;
    }

    public final void setDiscretionaryData(byte[] bArr) {
        a();
        this.i = bArr;
    }

    public final void setDataRecord(byte[] bArr) {
        a();
        this.h = bArr;
    }

    public final void setCvm(common.emv.kernel.TransactionOutcome.CVM cvm) {
        a();
        this.e = cvm;
    }

    public final void setAlternateInterfacePreference(common.emv.kernel.TransactionOutcome.AlternateInterfacePreference alternateInterfacePreference) {
        a();
        this.j = alternateInterfacePreference;
    }

    public final boolean isReceipt() {
        a();
        return this.k;
    }

    public final boolean isOnlineResponseDataPresent() {
        a();
        return this.d != null;
    }

    public final boolean isDiscretionaryDataPresent() {
        a();
        return this.i != null;
    }

    public final boolean isDataRecordPresent() {
        a();
        return this.h != null;
    }

    public final byte[] getUiRequestData() {
        a();
        return this.f6696o;
    }

    public final common.emv.kernel.TransactionOutcome.UserInterfaceRequestData getUiReqOnRestart() {
        a();
        return this.g;
    }

    public final common.emv.kernel.TransactionOutcome.UserInterfaceRequestData getUiReqOnOutcome() {
        a();
        return this.f;
    }

    public final byte[] getTvr() {
        a();
        return this.q;
    }

    public final common.emv.kernel.TransactionOutcome.Start getStart() {
        a();
        return this.c;
    }

    public static class ErrorIndication {
        public static final common.emv.kernel.TransactionOutcome.ErrorIndication NA = new common.emv.kernel.TransactionOutcome.ErrorIndication(common.emv.kernel.TransactionOutcome.ErrorIndication_L1.L1_OK, common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_OK, common.emv.kernel.TransactionOutcome.ErrorIndication_L3.L3_OK, "0000", common.emv.kernel.TransactionOutcome.StandardMessage.NA);

        /* renamed from: a, reason: collision with root package name */
        public common.emv.kernel.TransactionOutcome.ErrorIndication_L1 f6699a;
        public common.emv.kernel.TransactionOutcome.ErrorIndication_L2 b;
        public common.emv.kernel.TransactionOutcome.ErrorIndication_L3 c;
        public java.lang.String d;
        public common.emv.kernel.TransactionOutcome.StandardMessage e;

        public void setSw12(java.lang.String str) {
            this.d = str;
        }

        public void setMessage(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage) {
            this.e = standardMessage;
        }

        public void setL3(common.emv.kernel.TransactionOutcome.ErrorIndication_L3 errorIndication_L3) {
            this.c = errorIndication_L3;
        }

        public void setL2(common.emv.kernel.TransactionOutcome.ErrorIndication_L2 errorIndication_L2) {
            this.b = errorIndication_L2;
        }

        public void setL1(common.emv.kernel.TransactionOutcome.ErrorIndication_L1 errorIndication_L1) {
            this.f6699a = errorIndication_L1;
        }

        public void reset() {
            this.f6699a = common.emv.kernel.TransactionOutcome.ErrorIndication_L1.L1_OK;
            this.b = common.emv.kernel.TransactionOutcome.ErrorIndication_L2.L2_OK;
            this.c = common.emv.kernel.TransactionOutcome.ErrorIndication_L3.L3_OK;
            this.d = "0000";
            this.e = common.emv.kernel.TransactionOutcome.StandardMessage.NA;
        }

        public java.lang.String getSw12() {
            return this.d;
        }

        public common.emv.kernel.TransactionOutcome.StandardMessage getMessage() {
            return this.e;
        }

        public common.emv.kernel.TransactionOutcome.ErrorIndication_L3 getL3() {
            return this.c;
        }

        public common.emv.kernel.TransactionOutcome.ErrorIndication_L2 getL2() {
            return this.b;
        }

        public common.emv.kernel.TransactionOutcome.ErrorIndication_L1 getL1() {
            return this.f6699a;
        }

        public ErrorIndication(common.emv.kernel.TransactionOutcome.ErrorIndication_L1 errorIndication_L1, common.emv.kernel.TransactionOutcome.ErrorIndication_L2 errorIndication_L2, common.emv.kernel.TransactionOutcome.ErrorIndication_L3 errorIndication_L3, java.lang.String str, common.emv.kernel.TransactionOutcome.StandardMessage standardMessage) {
            this.f6699a = errorIndication_L1;
            this.b = errorIndication_L2;
            this.c = errorIndication_L3;
            this.d = str;
            this.e = standardMessage;
        }
    }

    public final common.emv.kernel.TransactionRequest getRequest() {
        a();
        return this.f6695a;
    }

    public final int getRemovalTimeout() {
        a();
        return this.m;
    }

    public static class UserInterfaceRequestData {
        public static final common.emv.kernel.TransactionOutcome.UserInterfaceRequestData NA = new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.NA, common.emv.kernel.TransactionOutcome.Status.NA);

        /* renamed from: a, reason: collision with root package name */
        public final common.emv.kernel.TransactionOutcome.StandardMessage f6713a;
        public final common.emv.kernel.TransactionOutcome.Status b;
        public final int c;
        public final java.lang.String d;
        public final common.emv.kernel.TransactionOutcome.ValueQualifier e;
        public final java.lang.String f;
        public final java.lang.String g;

        public common.emv.kernel.TransactionOutcome.ValueQualifier getValueQualifier() {
            return this.e;
        }

        public java.lang.String getValue() {
            return this.f;
        }

        public common.emv.kernel.TransactionOutcome.Status getStatus() {
            return this.b;
        }

        public common.emv.kernel.TransactionOutcome.StandardMessage getMessage() {
            return this.f6713a;
        }

        public java.lang.String getLanguagePreference() {
            return this.d;
        }

        public int getHoldTime() {
            return this.c;
        }

        public java.lang.String getCurrencyCode() {
            return this.g;
        }

        public UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status, int i, java.lang.String str, common.emv.kernel.TransactionOutcome.ValueQualifier valueQualifier, java.lang.String str2, java.lang.String str3) {
            this.f6713a = standardMessage;
            this.b = status;
            this.c = i;
            this.d = str;
            this.e = valueQualifier;
            this.f = str2;
            this.g = str3;
        }

        public UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status, int i, java.lang.String str) {
            this.f6713a = standardMessage;
            this.b = status;
            this.c = i;
            this.d = str;
            this.e = common.emv.kernel.TransactionOutcome.ValueQualifier.NA;
            this.f = null;
            this.g = null;
        }

        public UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status) {
            this.f6713a = standardMessage;
            this.b = status;
            this.c = 0;
            this.d = null;
            this.e = common.emv.kernel.TransactionOutcome.ValueQualifier.NA;
            this.f = null;
            this.g = null;
        }
    }

    public final byte[] getOutcomeParameterSet() {
        a();
        return this.p;
    }

    public final common.emv.kernel.TransactionOutcome.Outcome getOutcome() {
        a();
        return this.b;
    }

    public final common.emv.kernel.TransactionOutcome.OnlineResponseData getOnlineResponseData() {
        a();
        return this.d;
    }

    public enum ErrorIndication_L1 {
        L1_OK(0, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton),
        L1_TIMEOUT_ERROR(1, "TIMEOUT_ERROR"),
        L1_TRANSMISSION_ERROR(2, "TRANSMISSION ERROR"),
        L1_PROTOCOL_ERROR(3, "PROTOCOL ERROR");

        public final int b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final int getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.ErrorIndication_L1 messageIdentifierOf(int i) {
            common.emv.kernel.TransactionOutcome.ErrorIndication_L1[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                common.emv.kernel.TransactionOutcome.ErrorIndication_L1 errorIndication_L1 = values[i2];
                if (errorIndication_L1.b == i) {
                    return errorIndication_L1;
                }
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("invalid messageIdentifier: %02x", java.lang.Integer.valueOf(i)));
        }

        public static common.emv.kernel.TransactionOutcome.ErrorIndication_L1 fromCode(int i) {
            common.emv.kernel.TransactionOutcome.ErrorIndication_L1[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                common.emv.kernel.TransactionOutcome.ErrorIndication_L1 errorIndication_L1 = values[i2];
                if (errorIndication_L1.b == i) {
                    return errorIndication_L1;
                }
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("invalid messageIdentifier: %02x", java.lang.Integer.valueOf(i)));
        }

        ErrorIndication_L1(int i, java.lang.String str) {
            this.b = i;
            this.c = str;
        }
    }

    public final int getFieldOffRequest() {
        a();
        return this.l;
    }

    public enum ErrorIndication_L2 {
        L2_OK(0, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton),
        L2_CARD_DATA_MISSING(1, "CARD DATA MISSING"),
        L2_CAM_FAILED(2, "CAM FAILED"),
        L2_STATUS_BYTES(3, "STATUS BYTES"),
        L2_PARSING_ERROR(4, "PARSING ERROR"),
        L2_MAX_LIMIT_EXCEEDED(5, "MAX LIMIT EXCEEDED"),
        L2_CARD_DATA_ERROR(6, "CARD DATA ERROR"),
        L2_MAGSTRIPE_NOT_SUPPORTED(7, "MAGSTRIPE NOT SUPPORTED"),
        L2_NO_PPSE(8, "NO PPSE"),
        L2_PPSE_FAULT(9, "PPSE FAULT"),
        L2_EMPTY_CANDIDATE_LIST(10, "EMPTY CANDIDATE LIST"),
        L2_IDS_READ_ERROR(11, "IDS READ ERROR"),
        L2_IDS_WRITE_ERROR(12, "IDS WRITE ERROR"),
        L2_IDS_DATA_ERROR(13, "IDS DATA ERROR"),
        L2_IDS_NO_MATCHING_AC(14, "IDS NO MATCHING AC"),
        L2_TERMINAL_DATA_ERROR(15, "TERMINAL DATA ERROR");

        public final int b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final int getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.ErrorIndication_L2 fromCode(int i) {
            common.emv.kernel.TransactionOutcome.ErrorIndication_L2[] values = values();
            for (int i2 = 0; i2 < 16; i2++) {
                common.emv.kernel.TransactionOutcome.ErrorIndication_L2 errorIndication_L2 = values[i2];
                if (errorIndication_L2.b == i) {
                    return errorIndication_L2;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        ErrorIndication_L2(int i, java.lang.String str) {
            this.b = i;
            this.c = str;
        }
    }

    public enum ErrorIndication_L3 {
        L3_OK(0, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton),
        L3_TIMEOUT(1, "TIMEOUT"),
        L3_STOP(2, "STOP"),
        L3_AMOUNT_NOT_PRESENT(3, "AMOUNT NOT PRESENT");

        public final int b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final int getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.ErrorIndication_L3 fromCode(int i) {
            common.emv.kernel.TransactionOutcome.ErrorIndication_L3[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                common.emv.kernel.TransactionOutcome.ErrorIndication_L3 errorIndication_L3 = values[i2];
                if (errorIndication_L3.b == i) {
                    return errorIndication_L3;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        ErrorIndication_L3(int i, java.lang.String str) {
            this.b = i;
            this.c = str;
        }
    }

    public enum OutcomeParameterSetB1 {
        Approved((byte) 16, "APPROVED"),
        Declined((byte) 32, "DECLINED"),
        OnlineRequest((byte) 48, "ONLINE REQUEST"),
        EndApplication((byte) 64, "END APPLICATION"),
        SelectNext((byte) 80, "SELECT NEXT"),
        TryAnotherInterface(com.visa.cbp.getEncExpo.IResultReceiver2, "TRY ANOTHER INTERFACE"),
        TryAgain(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, "TRY AGAIN"),
        NA(com.visa.cbp.getEncExpo.onUnminimized, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);

        public final byte b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final byte getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.OutcomeParameterSetB1 fromCode(byte b) {
            common.emv.kernel.TransactionOutcome.OutcomeParameterSetB1[] values = values();
            for (int i = 0; i < 8; i++) {
                common.emv.kernel.TransactionOutcome.OutcomeParameterSetB1 outcomeParameterSetB1 = values[i];
                if (outcomeParameterSetB1.b == b) {
                    return outcomeParameterSetB1;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        OutcomeParameterSetB1(byte b, java.lang.String str) {
            this.b = b;
            this.c = str;
        }
    }

    public enum OutcomeParameterSetB2 {
        StartA((byte) 0, "A"),
        StartB((byte) 16, "B"),
        StartC((byte) 32, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA),
        StartD((byte) 48, "D"),
        StartNA(com.visa.cbp.getEncExpo.onUnminimized, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);

        public final byte b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final byte getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.OutcomeParameterSetB2 fromCode(byte b) {
            common.emv.kernel.TransactionOutcome.OutcomeParameterSetB2[] values = values();
            for (int i = 0; i < 5; i++) {
                common.emv.kernel.TransactionOutcome.OutcomeParameterSetB2 outcomeParameterSetB2 = values[i];
                if (outcomeParameterSetB2.b == b) {
                    return outcomeParameterSetB2;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        OutcomeParameterSetB2(byte b, java.lang.String str) {
            this.b = b;
            this.c = str;
        }
    }

    public enum OutcomeParameterSetB4 {
        NoCVM((byte) 0, "NO CVM"),
        ObtainSignature((byte) 16, "OBTAIN SIGNATURE"),
        OnlinePin((byte) 32, "ONLINE PIN"),
        CDCVM((byte) 48, "CONFIRMATION CODE VERIFIED"),
        NA(com.visa.cbp.getEncExpo.onUnminimized, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);

        public final byte b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public final byte getCode() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.OutcomeParameterSetB4 fromCode(byte b) {
            common.emv.kernel.TransactionOutcome.OutcomeParameterSetB4[] values = values();
            for (int i = 0; i < 5; i++) {
                common.emv.kernel.TransactionOutcome.OutcomeParameterSetB4 outcomeParameterSetB4 = values[i];
                if (outcomeParameterSetB4.b == b) {
                    return outcomeParameterSetB4;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        OutcomeParameterSetB4(byte b, java.lang.String str) {
            this.b = b;
            this.c = str;
        }
    }

    public enum StandardMessage {
        NA(255, "NA"),
        Amount(1, "(Amount)"),
        AmountOK(2, "(Amount) OK?"),
        Approved(3, "APPROVED"),
        CallYourBank(4, "CALL YOUR BANK"),
        CancelOrEnter(5, "CANCEL OR ENTER"),
        CardError(6, "CARD ERROR"),
        Declined(7, "DECLINED"),
        EnterAmount(8, "ENTER AMOUNT"),
        EnterPIN(9, "PLEASE ENTER YOUR PIN"),
        IncorrectPIN(10, "INCORRECT PIN"),
        InsertCard(11, "INSERT CARD"),
        NotAccepted(12, "NOT ACCEPTED"),
        PINOK(13, "PIN OK"),
        PleaseWait(14, "PLEASE WAIT"),
        ProcessingError(15, "PROCESSING ERROR"),
        RemoveCard(16, "REMOVE CARD"),
        UseChipReader(17, "USE CHIP READER"),
        UseMagStripe(18, "USE MAG STRIPE"),
        TryAgain(19, "TRY AGAIN"),
        PresentCard(21, "PRESENT CARD"),
        Processing(22, "PROCESSING"),
        CardReadOK(23, "CARD READ OK. PLEASE REMOVE CARD"),
        PleaseInsertOrSwipeCard(24, "PLEASE INSERT OR SWIPE CARD"),
        ApprovedPleaseSigned(26, "APPROVE PLEASE SIGN"),
        AuthorisingPleaseWait(27, "AUTHORISING PLEASE WAIT"),
        InsertSwipeOrTryAnotherCard(28, "INSERT SWIPE OR TRY ANOTHER CARD"),
        ErrorOtherCard(28, "ERROR - OTHER CARD"),
        PleaseInsertCard(29, "PLEASE INSERT CARD"),
        ClearDisplay(30, "CLEAR DISPLAY"),
        SeePhoneForInstructions(32, "SEE PHONE FOR INSTRUCTION"),
        PresentCardAgain(33, "PRESENT CARD AGAIN");

        public final int b;
        public final java.lang.String c;

        public final int getMessageIdentifier() {
            return this.b;
        }

        public final java.lang.String getMessage() {
            return this.c;
        }

        public static common.emv.kernel.TransactionOutcome.StandardMessage messageIdentifierOf(int i) {
            common.emv.kernel.TransactionOutcome.StandardMessage[] values = values();
            for (int i2 = 0; i2 < 32; i2++) {
                common.emv.kernel.TransactionOutcome.StandardMessage standardMessage = values[i2];
                if (standardMessage.b == i) {
                    return standardMessage;
                }
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("invalid messageIdentifier: %02x", java.lang.Integer.valueOf(i)));
        }

        StandardMessage(int i, java.lang.String str) {
            this.b = i;
            this.c = str;
        }
    }

    public final common.emv.kernel.TransactionOutcome.ErrorIndication getErrorIndication() {
        a();
        return this.r;
    }

    public enum Outcome {
        SelectNext(1, "SELECT NEXT"),
        TryAgain(2, "TRY AGAIN"),
        Approved(3, "APPROVED"),
        Declined(4, "DECLINED"),
        OnlineRequest(5, "ONLINE REQUEST"),
        RequestOnlinePIN(6, "REQUEST ONLINE PIN"),
        TryAnotherInterface(7, "TRY ANOTHER INTERFACE"),
        EndApplication(8, "END APPLICATION");

        public final java.lang.String b;
        public final int code;

        public final java.lang.String getMessage() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.Outcome fromCode(int i) {
            common.emv.kernel.TransactionOutcome.Outcome[] values = values();
            for (int i2 = 0; i2 < 8; i2++) {
                common.emv.kernel.TransactionOutcome.Outcome outcome = values[i2];
                if (outcome.code == i) {
                    return outcome;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        Outcome(int i, java.lang.String str) {
            this.code = i;
            this.b = str;
        }
    }

    public enum Status {
        NA(0, "NA"),
        NotReady(1, "NOT READY"),
        Idle(2, "IDLE"),
        ReadyToRead(3, "READY TO READ"),
        Processing(4, "PROCESSING"),
        CardReadSuccessfully(5, "CARD READ SUCCESSFULLY"),
        ProcessingError(6, "PROCESSING ERROR");

        public final java.lang.String b;
        public final int code;

        public final java.lang.String getMessage() {
            return this.b;
        }

        public static common.emv.kernel.TransactionOutcome.Status fromCode(int i) {
            common.emv.kernel.TransactionOutcome.Status[] values = values();
            for (int i2 = 0; i2 < 7; i2++) {
                common.emv.kernel.TransactionOutcome.Status status = values[i2];
                if (status.code == i) {
                    return status;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        Status(int i, java.lang.String str) {
            this.code = i;
            this.b = str;
        }
    }

    public enum UIReqDataOPS_Status {
        NotReady((byte) 0, "NOT READY"),
        Idle((byte) 1, "IDLE"),
        ReadyToRead((byte) 2, "READY TO READ"),
        Processing((byte) 3, "PROCESSING"),
        CardReadSuccessfully((byte) 4, "CARD READ SUCCESSFULLY"),
        ProcessingError((byte) 5, "PROCESSING ERROR"),
        NA((byte) -1, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);

        public final byte b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public static common.emv.kernel.TransactionOutcome.UIReqDataOPS_Status fromCode(byte b) {
            common.emv.kernel.TransactionOutcome.UIReqDataOPS_Status[] values = values();
            for (int i = 0; i < 7; i++) {
                common.emv.kernel.TransactionOutcome.UIReqDataOPS_Status uIReqDataOPS_Status = values[i];
                if (uIReqDataOPS_Status.b == b) {
                    return uIReqDataOPS_Status;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        UIReqDataOPS_Status(byte b, java.lang.String str) {
            this.b = b;
            this.c = str;
        }
    }

    public enum UIReqDataOPS_ValueQualifier {
        NA((byte) 0, "NONE"),
        Amount((byte) 16, com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT),
        Balance((byte) 32, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);

        public final byte b;
        public final java.lang.String c;

        public final java.lang.String getMessage() {
            return this.c;
        }

        public static common.emv.kernel.TransactionOutcome.UIReqDataOPS_ValueQualifier fromCode(byte b) {
            common.emv.kernel.TransactionOutcome.UIReqDataOPS_ValueQualifier[] values = values();
            for (int i = 0; i < 3; i++) {
                common.emv.kernel.TransactionOutcome.UIReqDataOPS_ValueQualifier uIReqDataOPS_ValueQualifier = values[i];
                if (uIReqDataOPS_ValueQualifier.b == b) {
                    return uIReqDataOPS_ValueQualifier;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        UIReqDataOPS_ValueQualifier(byte b, java.lang.String str) {
            this.b = b;
            this.c = str;
        }
    }

    public final byte[] getDiscretionaryData() {
        a();
        return this.i;
    }

    public final byte[] getDataRecord() {
        a();
        return this.h;
    }

    public final common.emv.kernel.TransactionOutcome.CVM getCvm() {
        a();
        return this.e;
    }

    public enum AlternateInterfacePreference {
        NA(0),
        ContactChip(1),
        MagStripe(2);

        public final int code;

        public static common.emv.kernel.TransactionOutcome.AlternateInterfacePreference fromCode(int i) {
            common.emv.kernel.TransactionOutcome.AlternateInterfacePreference[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                common.emv.kernel.TransactionOutcome.AlternateInterfacePreference alternateInterfacePreference = values[i2];
                if (alternateInterfacePreference.code == i) {
                    return alternateInterfacePreference;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        AlternateInterfacePreference(int i) {
            this.code = i;
        }
    }

    public enum CVM {
        NA(0),
        NoCVM(1),
        ObtainSignature(2),
        OnlinePin(3),
        ConfirmationCodeVerified(4),
        ConfirmationCodeAndSignature(5),
        FailedCVMProcessing(6);

        public final int code;

        public static common.emv.kernel.TransactionOutcome.CVM fromCode(int i) {
            common.emv.kernel.TransactionOutcome.CVM[] values = values();
            for (int i2 = 0; i2 < 7; i2++) {
                common.emv.kernel.TransactionOutcome.CVM cvm = values[i2];
                if (cvm.code == i) {
                    return cvm;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        CVM(int i) {
            this.code = i;
        }
    }

    public enum OnlineResponseData {
        NA(0),
        EmvData(1),
        Any(2);

        public final int code;

        public static common.emv.kernel.TransactionOutcome.OnlineResponseData fromCode(int i) {
            common.emv.kernel.TransactionOutcome.OnlineResponseData[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                common.emv.kernel.TransactionOutcome.OnlineResponseData onlineResponseData = values[i2];
                if (onlineResponseData.code == i) {
                    return onlineResponseData;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        OnlineResponseData(int i) {
            this.code = i;
        }
    }

    public enum Start {
        NA(0),
        A(1),
        B(2),
        C(3),
        D(4);

        public final int code;

        public static common.emv.kernel.TransactionOutcome.Start fromCode(int i) {
            common.emv.kernel.TransactionOutcome.Start[] values = values();
            for (int i2 = 0; i2 < 5; i2++) {
                common.emv.kernel.TransactionOutcome.Start start = values[i2];
                if (start.code == i) {
                    return start;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        Start(int i) {
            this.code = i;
        }
    }

    public enum ValueQualifier {
        NA(0),
        Amount(1),
        Balance(2);

        public final int b;

        public static common.emv.kernel.TransactionOutcome.ValueQualifier fromCode(int i) {
            common.emv.kernel.TransactionOutcome.ValueQualifier[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                common.emv.kernel.TransactionOutcome.ValueQualifier valueQualifier = values[i2];
                if (valueQualifier.b == i) {
                    return valueQualifier;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }

        ValueQualifier(int i) {
            this.b = i;
        }
    }

    public final common.emv.kernel.TransactionOutcome.AlternateInterfacePreference getAlternateInterfacePreference() {
        a();
        return this.j;
    }

    public final void dispose() {
        a();
        this.n = true;
        this.c = common.emv.kernel.TransactionOutcome.Start.NA;
        this.d = common.emv.kernel.TransactionOutcome.OnlineResponseData.NA;
        this.e = common.emv.kernel.TransactionOutcome.CVM.NA;
        common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData = common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA;
        this.f = userInterfaceRequestData;
        this.g = userInterfaceRequestData;
        byte[] bArr = this.h;
        if (bArr != null) {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            java.util.Arrays.fill(bArr2, (byte) 0);
        }
        this.j = common.emv.kernel.TransactionOutcome.AlternateInterfacePreference.NA;
        this.k = false;
        this.l = 0;
        this.m = 0;
        byte[] bArr3 = this.f6696o;
        if (bArr3 != null) {
            java.util.Arrays.fill(bArr3, (byte) 0);
        }
        byte[] bArr4 = this.p;
        if (bArr4 != null) {
            java.util.Arrays.fill(bArr4, (byte) 0);
        }
        this.r = common.emv.kernel.TransactionOutcome.ErrorIndication.NA;
    }

    public final void a() {
        if (this.n) {
            throw new java.lang.IllegalStateException("Transaction Outcome Data has been dispose");
        }
    }

    public TransactionOutcome(common.emv.kernel.TransactionRequest transactionRequest, common.emv.kernel.TransactionOutcome.Outcome outcome) {
        common.emv.kernel.TransactionOutcome.UserInterfaceRequestData userInterfaceRequestData = common.emv.kernel.TransactionOutcome.UserInterfaceRequestData.NA;
        this.f = userInterfaceRequestData;
        this.g = userInterfaceRequestData;
        this.h = null;
        this.i = null;
        this.j = common.emv.kernel.TransactionOutcome.AlternateInterfacePreference.NA;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.r = common.emv.kernel.TransactionOutcome.ErrorIndication.NA;
        this.f6695a = transactionRequest;
        transactionRequest.markCompleteTimestamp();
        this.b = outcome;
    }
}
