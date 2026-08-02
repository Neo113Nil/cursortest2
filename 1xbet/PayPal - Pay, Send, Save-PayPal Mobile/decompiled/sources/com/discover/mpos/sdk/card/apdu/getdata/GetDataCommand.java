package com.discover.mpos.sdk.card.apdu.getdata;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B5\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014R\u001b\u0010\r\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataCommand;", "Lcom/discover/mpos/sdk/card/apdu/base/BaseCommand;", "", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "request", "Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "processor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "validator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "(Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;Lcom/discover/mpos/sdk/core/emv/Validator;)V", "response", "getResponse", "()Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "response$delegate", "Lkotlin/Lazy;", "createResponse", "debugTag", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetDataCommand extends com.discover.mpos.sdk.card.apdu.base.BaseCommand<byte[], com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse, com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent, com.discover.mpos.sdk.card.apdu.error.ApduError> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.Lazy f2941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDataCommand(com.discover.mpos.sdk.card.apdu.base.ApduRequest<byte[]> apduRequest, com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.getdata.GetDataResponseContent, com.discover.mpos.sdk.card.apdu.error.ApduError> apduProcessor, com.discover.mpos.sdk.core.emv.Validator<byte[]> validator) {
        super(apduRequest, apduProcessor, validator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator, "");
        this.f2941a = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(com.discover.mpos.sdk.card.apdu.getdata.GetDataCommand.a.f2942a);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.card.apdu.b.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.card.apdu.getdata.GetDataCommand.a f2942a = new com.discover.mpos.sdk.card.apdu.getdata.GetDataCommand.a();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse invoke() {
            return new com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse();
        }

        a() {
            super(0);
        }
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduCommand
    public final /* synthetic */ java.lang.Object a() {
        return (com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse) this.f2941a.getValue();
    }
}
