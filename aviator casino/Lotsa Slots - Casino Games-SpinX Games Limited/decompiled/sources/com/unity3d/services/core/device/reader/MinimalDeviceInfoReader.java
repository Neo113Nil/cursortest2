package com.unity3d.services.core.device.reader;

/* loaded from: classes6.dex */
public class MinimalDeviceInfoReader implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    final com.unity3d.services.core.device.reader.IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(com.unity3d.services.core.device.reader.IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.M6.H, "android");
        hashMap.put("sdkVersion", java.lang.Integer.valueOf(com.unity3d.services.core.properties.SdkProperties.getVersionCode()));
        hashMap.put("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName());
        hashMap.put("idfi", com.unity3d.services.core.device.Device.getIdfi());
        hashMap.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        hashMap.put("ts", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        hashMap.put(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, com.unity3d.services.core.properties.ClientProperties.getGameId());
        return hashMap;
    }
}
