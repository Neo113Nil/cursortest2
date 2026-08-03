package com.unity3d.services.ads.gmascar.utils;

/* loaded from: classes5.dex */
public class ScarRequestHandler {
    private final com.unity3d.services.core.network.core.HttpClient httpClient = (com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class);

    public void makeUploadRequest(java.lang.String str, com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals, java.lang.String str2) throws java.lang.Exception {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Type", java.util.Collections.singletonList(com.ironsource.B5.M));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("idfi", com.unity3d.services.core.device.Device.getIdfi());
        hashMap2.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, str);
        hashMap2.putAll(biddingSignals.getMap());
        this.httpClient.executeBlocking(new com.unity3d.services.core.network.model.HttpRequest(str2, "", com.unity3d.services.core.network.model.RequestType.POST, new org.json.JSONObject(hashMap2).toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), hashMap));
    }
}
