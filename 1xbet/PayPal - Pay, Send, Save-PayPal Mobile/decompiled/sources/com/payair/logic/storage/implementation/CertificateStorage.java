package com.payair.logic.storage.implementation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/storage/implementation/CertificateStorage;", "", "", "clearData", "()V", "", "getStoredCertificate", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "storeCertificate", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CertificateStorage {
    void clearData();

    java.lang.String getStoredCertificate();

    boolean storeCertificate(java.lang.String data);
}
