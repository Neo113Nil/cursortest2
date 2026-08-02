package com.payair.hce.visa.tokenization;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/payair/hce/visa/tokenization/VisaTokenization;", "", "", "p0", "", "p1", "p2", "Lcom/payair/hce/communication/JsonResponse;", "completeTokenize", "(JLjava/lang/String;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "", "startTokenize", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VisaTokenization {
    com.payair.hce.communication.JsonResponse completeTokenize(long p0, java.lang.String p1, java.lang.String p2);

    void startTokenize(java.lang.String p0);
}
