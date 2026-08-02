package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/Apdu;", "", "(Ljava/lang/String;I)V", "createHeader", "Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;", "p1", "", "p2", "SELECT", "GET_PROCESSING_OPTIONS", "RESUME_GET_PROCESSING_OPTIONS", "DATA_GET_PROCESSING_OPTIONS", "READ_RECORD", "GET_DATA", "PUT_DATA", "Companion", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public enum Apdu {
    SELECT { // from class: com.discover.mpos.sdk.card.apdu.a.a.h
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    GET_PROCESSING_OPTIONS { // from class: com.discover.mpos.sdk.card.apdu.a.a.d
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(128, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    RESUME_GET_PROCESSING_OPTIONS { // from class: com.discover.mpos.sdk.card.apdu.a.a.g
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(128, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    DATA_GET_PROCESSING_OPTIONS { // from class: com.discover.mpos.sdk.card.apdu.a.a.b
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(128, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    READ_RECORD { // from class: com.discover.mpos.sdk.card.apdu.a.a.f
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    GET_DATA { // from class: com.discover.mpos.sdk.card.apdu.a.a.c
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(128, 202, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    },
    PUT_DATA { // from class: com.discover.mpos.sdk.card.apdu.a.a.e
        @Override // com.discover.mpos.sdk.card.apdu.emv.Apdu
        public final com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i, int i2) {
            return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(128, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, kotlin.TuplesKt.to(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    };

    public static final com.discover.mpos.sdk.card.apdu.emv.Apdu.a h = new com.discover.mpos.sdk.card.apdu.emv.Apdu.a(0);

    public abstract com.discover.mpos.sdk.card.apdu.base.RequestHeader a(int i2, int i3);

    /* synthetic */ Apdu(byte b2) {
        this();
    }

    public static /* synthetic */ com.discover.mpos.sdk.card.apdu.base.RequestHeader a(com.discover.mpos.sdk.card.apdu.emv.Apdu apdu, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return apdu.a(i2, 0);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/Apdu$Companion;", "", "()V", "CLASS_BYTE_GPO", "", "CLASS_BYTE_READ_DATA", "CLASS_BYTE_SELECT", "INSTRUCTION_BYTE_GET_DATA", "INSTRUCTION_BYTE_GPO", "INSTRUCTION_BYTE_PUT_DATA", "INSTRUCTION_BYTE_READ_DATA", "INSTRUCTION_BYTE_SELECT", "INSTRUCTION_DATA_GET_PROCESSING_OPTIONS", "INSTRUCTION_RESUME_GPO", "PARAMETER1_BYTE_GET_DATA", "PARAMETER1_BYTE_PUT_DATA", "PARAMETER1_BYTE_SELECT", "PARAMETER2_BYTE_GET_DATA", "PARAMETER2_BYTE_PUT_DATA", "PARAMETER2_BYTE_SELECT", "PLACEHOLDER_PARAMETER", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.card.apdu.a.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
