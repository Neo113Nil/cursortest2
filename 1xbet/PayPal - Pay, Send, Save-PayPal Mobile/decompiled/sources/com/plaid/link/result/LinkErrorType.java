package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \n2\u00020\u0001:\u0010\u000b\f\r\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u000f\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'("}, d2 = {"Lcom/plaid/link/result/LinkErrorType;", "Landroid/os/Parcelable;", "", "json", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getJson", "Companion", "API_ERROR", "ASSET_REPORT_ERROR", "BANK_TRANSFER_ERROR", "DEPOSIT_SWITCH_ERROR", "INSTITUTION_ERROR", "INTERNAL_ERROR_TYPE", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "INVALID_REQUEST", "ITEM_ERROR", "OAUTH_ERROR", "PAYMENT_ERROR", "RATE_LIMIT_EXCEEDED", "RECAPTCHA_ERROR", "SANDBOX_ERROR", "UNKNOWN", "Lcom/plaid/link/result/LinkErrorType$API_ERROR;", "Lcom/plaid/link/result/LinkErrorType$ASSET_REPORT_ERROR;", "Lcom/plaid/link/result/LinkErrorType$BANK_TRANSFER_ERROR;", "Lcom/plaid/link/result/LinkErrorType$DEPOSIT_SWITCH_ERROR;", "Lcom/plaid/link/result/LinkErrorType$INSTITUTION_ERROR;", "Lcom/plaid/link/result/LinkErrorType$INTERNAL_ERROR_TYPE;", "Lcom/plaid/link/result/LinkErrorType$INVALID_INPUT;", "Lcom/plaid/link/result/LinkErrorType$INVALID_REQUEST;", "Lcom/plaid/link/result/LinkErrorType$ITEM_ERROR;", "Lcom/plaid/link/result/LinkErrorType$OAUTH_ERROR;", "Lcom/plaid/link/result/LinkErrorType$PAYMENT_ERROR;", "Lcom/plaid/link/result/LinkErrorType$RATE_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorType$RECAPTCHA_ERROR;", "Lcom/plaid/link/result/LinkErrorType$SANDBOX_ERROR;", "Lcom/plaid/link/result/LinkErrorType$UNKNOWN;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkErrorType implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkErrorType.Companion INSTANCE = new com.plaid.link.result.LinkErrorType.Companion(null);
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkErrorType>> jsonToObject$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkErrorType>>() { // from class: com.plaid.link.result.LinkErrorType$Companion$jsonToObject$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkErrorType> invoke() {
            com.plaid.link.result.LinkErrorType.INVALID_REQUEST invalid_request = com.plaid.link.result.LinkErrorType.INVALID_REQUEST.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(invalid_request.getJson(), invalid_request);
            com.plaid.link.result.LinkErrorType.INVALID_INPUT invalid_input = com.plaid.link.result.LinkErrorType.INVALID_INPUT.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(invalid_input.getJson(), invalid_input);
            com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR institution_error = com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(institution_error.getJson(), institution_error);
            com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED rate_limit_exceeded = com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(rate_limit_exceeded.getJson(), rate_limit_exceeded);
            com.plaid.link.result.LinkErrorType.API_ERROR api_error = com.plaid.link.result.LinkErrorType.API_ERROR.INSTANCE;
            kotlin.Pair pair5 = kotlin.TuplesKt.to(api_error.getJson(), api_error);
            com.plaid.link.result.LinkErrorType.ITEM_ERROR item_error = com.plaid.link.result.LinkErrorType.ITEM_ERROR.INSTANCE;
            kotlin.Pair pair6 = kotlin.TuplesKt.to(item_error.getJson(), item_error);
            com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR asset_report_error = com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR.INSTANCE;
            kotlin.Pair pair7 = kotlin.TuplesKt.to(asset_report_error.getJson(), asset_report_error);
            com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR recaptcha_error = com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR.INSTANCE;
            kotlin.Pair pair8 = kotlin.TuplesKt.to(recaptcha_error.getJson(), recaptcha_error);
            com.plaid.link.result.LinkErrorType.OAUTH_ERROR oauth_error = com.plaid.link.result.LinkErrorType.OAUTH_ERROR.INSTANCE;
            kotlin.Pair pair9 = kotlin.TuplesKt.to(oauth_error.getJson(), oauth_error);
            com.plaid.link.result.LinkErrorType.PAYMENT_ERROR payment_error = com.plaid.link.result.LinkErrorType.PAYMENT_ERROR.INSTANCE;
            kotlin.Pair pair10 = kotlin.TuplesKt.to(payment_error.getJson(), payment_error);
            com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR bank_transfer_error = com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR.INSTANCE;
            kotlin.Pair pair11 = kotlin.TuplesKt.to(bank_transfer_error.getJson(), bank_transfer_error);
            com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR deposit_switch_error = com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR.INSTANCE;
            kotlin.Pair pair12 = kotlin.TuplesKt.to(deposit_switch_error.getJson(), deposit_switch_error);
            com.plaid.link.result.LinkErrorType.SANDBOX_ERROR sandbox_error = com.plaid.link.result.LinkErrorType.SANDBOX_ERROR.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, kotlin.TuplesKt.to(sandbox_error.getJson(), sandbox_error));
        }
    });
    private final java.lang.String json;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$Companion;", "", "<init>", "()V", "", "json", "Lcom/plaid/link/result/LinkErrorType;", "convert", "(Ljava/lang/String;)Lcom/plaid/link/result/LinkErrorType;", "", "jsonToObject$delegate", "Lkotlin/Lazy;", "getJsonToObject", "()Ljava/util/Map;", "jsonToObject"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.util.Map<java.lang.String, com.plaid.link.result.LinkErrorType> getJsonToObject() {
            return (java.util.Map) com.plaid.link.result.LinkErrorType.jsonToObject$delegate.getValue();
        }

        public final com.plaid.link.result.LinkErrorType convert(java.lang.String json) {
            com.plaid.link.result.LinkErrorType linkErrorType = getJsonToObject().get(json);
            if (linkErrorType != null) {
                return linkErrorType;
            }
            if (json == null) {
                json = "";
            }
            return new com.plaid.link.result.LinkErrorType.UNKNOWN(json);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LinkErrorType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getJson() {
        return this.json;
    }

    public java.lang.String toString() {
        return this.json;
    }

    private LinkErrorType(java.lang.String str) {
        this.json = str;
    }

    public /* synthetic */ LinkErrorType(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, null);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$API_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class API_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.API_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.API_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.API_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.API_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.API_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.API_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.API_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.API_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.API_ERROR[i];
            }
        }

        private API_ERROR() {
            super("API_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$ASSET_REPORT_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ASSET_REPORT_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.ASSET_REPORT_ERROR[i];
            }
        }

        private ASSET_REPORT_ERROR() {
            super("ASSET_REPORT_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$BANK_TRANSFER_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BANK_TRANSFER_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.BANK_TRANSFER_ERROR[i];
            }
        }

        private BANK_TRANSFER_ERROR() {
            super("BANK_TRANSFER_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$DEPOSIT_SWITCH_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DEPOSIT_SWITCH_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.DEPOSIT_SWITCH_ERROR[i];
            }
        }

        private DEPOSIT_SWITCH_ERROR() {
            super("DEPOSIT_SWITCH_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INSTITUTION_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INSTITUTION_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.INSTITUTION_ERROR[i];
            }
        }

        private INSTITUTION_ERROR() {
            super("INSTITUTION_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INTERNAL_ERROR_TYPE;", "Lcom/plaid/link/result/LinkErrorType;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INTERNAL_ERROR_TYPE extends com.plaid.link.result.LinkErrorType {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE> CREATOR = new com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE.Creator();
        private final java.lang.String name;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.INTERNAL_ERROR_TYPE[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR_TYPE(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INVALID_INPUT;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INVALID_INPUT extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.INVALID_INPUT INSTANCE = new com.plaid.link.result.LinkErrorType.INVALID_INPUT();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INVALID_INPUT> CREATOR = new com.plaid.link.result.LinkErrorType.INVALID_INPUT.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INVALID_INPUT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INVALID_INPUT createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.INVALID_INPUT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INVALID_INPUT[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.INVALID_INPUT[i];
            }
        }

        private INVALID_INPUT() {
            super(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$INVALID_REQUEST;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class INVALID_REQUEST extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.INVALID_REQUEST INSTANCE = new com.plaid.link.result.LinkErrorType.INVALID_REQUEST();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INVALID_REQUEST> CREATOR = new com.plaid.link.result.LinkErrorType.INVALID_REQUEST.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.INVALID_REQUEST> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INVALID_REQUEST createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.INVALID_REQUEST.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.INVALID_REQUEST[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.INVALID_REQUEST[i];
            }
        }

        private INVALID_REQUEST() {
            super("INVALID_REQUEST", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$ITEM_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ITEM_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.ITEM_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.ITEM_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.ITEM_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.ITEM_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.ITEM_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.ITEM_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.ITEM_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.ITEM_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.ITEM_ERROR[i];
            }
        }

        private ITEM_ERROR() {
            super("ITEM_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$OAUTH_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OAUTH_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.OAUTH_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.OAUTH_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.OAUTH_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.OAUTH_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.OAUTH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.OAUTH_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.OAUTH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.OAUTH_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.OAUTH_ERROR[i];
            }
        }

        private OAUTH_ERROR() {
            super("OAUTH_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$PAYMENT_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PAYMENT_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.PAYMENT_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.PAYMENT_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.PAYMENT_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.PAYMENT_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.PAYMENT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.PAYMENT_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.PAYMENT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.PAYMENT_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.PAYMENT_ERROR[i];
            }
        }

        private PAYMENT_ERROR() {
            super("PAYMENT_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$RATE_LIMIT_EXCEEDED;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RATE_LIMIT_EXCEEDED extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED INSTANCE = new com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED> CREATOR = new com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.RATE_LIMIT_EXCEEDED[i];
            }
        }

        private RATE_LIMIT_EXCEEDED() {
            super("RATE_LIMIT_EXCEEDED", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$RECAPTCHA_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RECAPTCHA_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.RECAPTCHA_ERROR[i];
            }
        }

        private RECAPTCHA_ERROR() {
            super("RECAPTCHA_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$SANDBOX_ERROR;", "Lcom/plaid/link/result/LinkErrorType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SANDBOX_ERROR extends com.plaid.link.result.LinkErrorType {
        public static final com.plaid.link.result.LinkErrorType.SANDBOX_ERROR INSTANCE = new com.plaid.link.result.LinkErrorType.SANDBOX_ERROR();
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.SANDBOX_ERROR> CREATOR = new com.plaid.link.result.LinkErrorType.SANDBOX_ERROR.Creator();

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.SANDBOX_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.SANDBOX_ERROR createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.plaid.link.result.LinkErrorType.SANDBOX_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.SANDBOX_ERROR[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.SANDBOX_ERROR[i];
            }
        }

        private SANDBOX_ERROR() {
            super("SANDBOX_ERROR", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/plaid/link/result/LinkErrorType$UNKNOWN;", "Lcom/plaid/link/result/LinkErrorType;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkErrorType {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.UNKNOWN> CREATOR = new com.plaid.link.result.LinkErrorType.UNKNOWN.Creator();
        private final java.lang.String name;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkErrorType.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkErrorType.UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkErrorType.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkErrorType.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
        }
    }
}
