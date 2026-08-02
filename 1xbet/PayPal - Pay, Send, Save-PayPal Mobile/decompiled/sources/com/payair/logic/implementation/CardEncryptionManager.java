package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/payair/logic/implementation/CardEncryptionManager;", "", "", "certificate", "Lcom/payair/model/CardData;", "cardData", "encryptCardData", "(Ljava/lang/String;Lcom/payair/model/CardData;)Ljava/lang/String;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "encryptCvv", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getEncryptionAlgorithm", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CardEncryptionManager {
    java.lang.String encryptCardData(java.lang.String certificate, com.payair.model.CardData cardData);

    java.lang.String encryptCvv(java.lang.String certificate, java.lang.String cvv);

    java.lang.String getEncryptionAlgorithm(java.lang.String certificate);
}
