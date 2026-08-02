package com.discover.mpos.sdk.card.apdu.g.ppse;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B5\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0014R\u001b\u0010\u000e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSECommand;", "Lcom/discover/mpos/sdk/card/apdu/base/BaseCommand;", "", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/SelectApduError;", "selectRequest", "Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "selectPPSEApduProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "statusValidator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "", "(Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;Lcom/discover/mpos/sdk/core/emv/Validator;)V", "response", "getResponse", "()Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "response$delegate", "Lkotlin/Lazy;", "createResponse", "debugTag", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.g.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectPPSECommand extends com.discover.mpos.sdk.card.apdu.base.BaseCommand<java.lang.String, com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse, com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent, com.discover.mpos.sdk.card.apdu.error.SelectApduError> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.Lazy f2968a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPPSECommand(com.discover.mpos.sdk.card.apdu.base.ApduRequest<java.lang.String> apduRequest, com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponseContent, com.discover.mpos.sdk.card.apdu.error.SelectApduError> apduProcessor, com.discover.mpos.sdk.core.emv.Validator<byte[]> validator) {
        super(apduRequest, apduProcessor, validator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator, "");
        this.f2968a = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSECommand.a.f2969a);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.card.apdu.g.b.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSECommand.a f2969a = new com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSECommand.a();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse invoke() {
            return new com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse();
        }

        a() {
            super(0);
        }
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduCommand
    public final /* synthetic */ java.lang.Object a() {
        return (com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse) this.f2968a.getValue();
    }
}
