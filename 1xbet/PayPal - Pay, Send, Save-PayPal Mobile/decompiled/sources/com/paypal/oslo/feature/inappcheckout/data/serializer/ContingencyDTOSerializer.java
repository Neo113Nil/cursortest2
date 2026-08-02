package com.paypal.oslo.feature.inappcheckout.data.serializer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/serializer/ContingencyDTOSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContingencyDTOSerializer extends kotlinx.serialization.json.JsonContentPolymorphicSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> {
    public static final com.paypal.oslo.feature.inappcheckout.data.serializer.ContingencyDTOSerializer INSTANCE = new com.paypal.oslo.feature.inappcheckout.data.serializer.ContingencyDTOSerializer();
    public static final int $stable = 8;

    private ContingencyDTOSerializer() {
        super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO.class));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0.equals("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        return com.paypal.oslo.feature.inappcheckout.data.dto.UserConsentForBankAccountInfoContingencyDTO.Companion.serializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r0.equals("PRE_AUTH_REQUIRED") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        return com.paypal.oslo.feature.inappcheckout.data.serializer.PreAuthRequiredContingencyDTOSerializer.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r0.equals("PRE_AUTHORIZATION_REQUIRED") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r0.equals("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED") != false) goto L40;
     */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlinx.serialization.DeserializationStrategy<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> selectDeserializer(kotlinx.serialization.json.JsonElement element) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        kotlinx.serialization.json.JsonObject jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(element);
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "name");
        java.lang.String content = (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -1839109524:
                    if (content.equals("AUTH_CHALLENGE")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.AuthChallengeContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case -1809169447:
                    if (content.equals("RESELECT_FUNDING_INSTRUMENT")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.ReselectFIContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case -1394382537:
                    if (content.equals("THREE_DS_AUTHENTICATION_REQUIRED")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case -632928615:
                    if (content.equals("CIT_AUTH")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.CitAuthContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case -47098678:
                    break;
                case 904461911:
                    if (content.equals("BANK_ACCOUNT_BALANCE_REQUIRED")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.BankAccountBalanceRequiredContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case 1151970817:
                    break;
                case 1221540762:
                    break;
                case 1276541184:
                    if (content.equals("UPDATE_CARD_INSTRUMENT")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.UpdateCardContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case 1544629205:
                    break;
                case 1664312341:
                    if (content.equals("ECONSENT")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.EConsentContingencyDTO.INSTANCE.serializer();
                    }
                    break;
                case 1883471461:
                    if (content.equals("ADD_INSTRUMENT")) {
                        return com.paypal.oslo.feature.inappcheckout.data.dto.AddCardContingencyDTO.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return jsonObject.containsKey((java.lang.Object) "fundingInstrument") ? com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO.INSTANCE.serializer() : com.paypal.oslo.feature.inappcheckout.data.dto.UnknownContingencyDTO.INSTANCE.serializer();
    }
}
