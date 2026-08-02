package com.paypal.oslo.feature.directdeposit.atomic;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J5\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", "", "Lorg/json/JSONObject;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onAtomicTransactClose", "(Lorg/json/JSONObject;)V", "onAtomicTransactFinish", "onAtomicTransactInteraction", "", "", "fields", "taskId", "userId", "identifier", "onAtomicTransactDataRequest", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "guid", "newInteraction", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AtomicTransactListener {
    void newInteraction(java.lang.String guid);

    void onAtomicTransactClose(org.json.JSONObject data);

    void onAtomicTransactDataRequest(java.util.List<java.lang.String> fields, java.lang.String taskId, java.lang.String userId, java.lang.String identifier);

    void onAtomicTransactFinish(org.json.JSONObject data);

    void onAtomicTransactInteraction(org.json.JSONObject data);
}
