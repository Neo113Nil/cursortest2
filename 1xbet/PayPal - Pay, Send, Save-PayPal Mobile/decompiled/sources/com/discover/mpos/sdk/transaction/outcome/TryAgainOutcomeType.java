package com.discover.mpos.sdk.transaction.outcome;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/TryAgainOutcomeType;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "outcomeParameters", "()Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "", "filedOffRequestValue", "J", "getFiledOffRequestValue", "()J", "", "holdTimeValue", com.visa.cbp.getEncExpo.warmup, "getHoldTimeValue", "()I", "CD_CVM", "TEARING_RECOVERY", "REGULAR"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum TryAgainOutcomeType {
    CD_CVM { // from class: com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType.a
        @Override // com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType
        public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters() {
            return new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(com.discover.mpos.sdk.transaction.outcome.EntryPointStart.B, null, null, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.SEE_PHONE_FOR_INSTRUCTIONS, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.PROCESSING_ERROR, java.lang.Integer.valueOf(getHoldTimeValue()), null, null, null, null, 120, null), new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PRESENT_CARD_AGAIN, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.READY_TO_READ, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, null, null, java.lang.Long.valueOf(getFiledOffRequestValue()), 0L, null, 2534, null);
        }
    },
    TEARING_RECOVERY { // from class: com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType.c
        @Override // com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType
        public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters() {
            return new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(com.discover.mpos.sdk.transaction.outcome.EntryPointStart.B, null, null, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PRESENT_CARD_AGAIN, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.PROCESSING_ERROR, java.lang.Integer.valueOf(getHoldTimeValue()), null, null, null, null, 120, null), new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PRESENT_CARD_AGAIN, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.READY_TO_READ, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, null, null, java.lang.Long.valueOf(getFiledOffRequestValue()), 0L, null, 2534, null);
        }
    },
    REGULAR { // from class: com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType.b
        @Override // com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType
        public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters() {
            return new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, null, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PRESENT_CARD_AGAIN, null, null, null, null, null, null, 126, null), null, null, null, null, null, null, 0L, null, 4087, null);
        }
    };

    private final long filedOffRequestValue;
    private final int holdTimeValue;

    TryAgainOutcomeType() {
        this.holdTimeValue = 13;
        this.filedOffRequestValue = 13L;
    }

    /* synthetic */ TryAgainOutcomeType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getHoldTimeValue() {
        return this.holdTimeValue;
    }

    public final long getFiledOffRequestValue() {
        return this.filedOffRequestValue;
    }

    public com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters() {
        return new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, null, null, null, null, null, null, null, null, 0L, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
