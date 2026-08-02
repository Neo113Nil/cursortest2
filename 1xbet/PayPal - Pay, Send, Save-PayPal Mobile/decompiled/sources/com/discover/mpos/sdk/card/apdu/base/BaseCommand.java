package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003*\u0004\b\u0002\u0010\u0004*\b\b\u0003\u0010\u0005*\u00020\u00062\b\u0012\u0004\u0012\u0002H\u00020\u0007B5\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H$J\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/BaseCommand;", "Data", "Response", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "Content", "Error", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "Lcom/discover/mpos/sdk/card/apdu/base/ApduCommand;", "request", "Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "apduProcessor", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "statusValidator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "", "(Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;Lcom/discover/mpos/sdk/core/emv/Validator;)V", "debugTag", "", "executeOn", "connector", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "(Lcom/discover/mpos/sdk/card/connectors/CardConnector;)Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.base.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public abstract class BaseCommand<Data, Response extends com.discover.mpos.sdk.card.apdu.base.ApduResponse<Content, Error>, Content, Error extends com.discover.mpos.sdk.card.apdu.error.ApduError> implements com.discover.mpos.sdk.card.apdu.base.ApduCommand<Response> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.card.apdu.base.ApduRequest<Data> f2945a;
    private final com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<Content, Error> b;
    private final com.discover.mpos.sdk.core.emv.Validator<byte[]> c;

    public BaseCommand(com.discover.mpos.sdk.card.apdu.base.ApduRequest<Data> apduRequest, com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<Content, Error> apduProcessor, com.discover.mpos.sdk.core.emv.Validator<byte[]> validator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apduProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator, "");
        this.f2945a = apduRequest;
        this.b = apduProcessor;
        this.c = validator;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduCommand
    public final /* synthetic */ java.lang.Object a(com.discover.mpos.sdk.card.connectors.CardConnector cardConnector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnector, "");
        new java.lang.Object[]{this.f2945a};
        com.discover.mpos.sdk.card.apdu.base.ApduResponse apduResponse = (com.discover.mpos.sdk.card.apdu.base.ApduResponse) a();
        com.discover.mpos.sdk.card.apdu.base.ApduResponse<byte[], ? extends com.discover.mpos.sdk.card.apdu.error.ApduError> execute = cardConnector.execute(this.f2945a);
        if (execute != null) {
            if (this.c.isValid(execute.getContent())) {
                apduResponse.setContent(this.b.a(execute.getContent()));
            } else {
                apduResponse.setError(this.b.b(execute.getContent()));
            }
        } else {
            apduResponse.setError(this.b.b(null));
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(apduResponse.isSuccessful()), apduResponse};
        return apduResponse;
    }
}
