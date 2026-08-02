package com.adobe.marketing.mobile.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/internal/AppResourceStore;", "", "<init>", "()V", "", "getLargeIconResourceID", "()I", "getSmallIconResourceID", "resourceID", "", "setLargeIconResourceID", "(I)V", "setSmallIconResourceID", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AppResourceStore {
    public static final com.adobe.marketing.mobile.internal.AppResourceStore INSTANCE = new com.adobe.marketing.mobile.internal.AppResourceStore();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static volatile int Camera2StreamConfigurationMap = -1;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static volatile int getHighSpeedVideoFpsRanges = -1;

    private AppResourceStore() {
    }

    public final void setSmallIconResourceID(int resourceID) {
        Camera2StreamConfigurationMap = resourceID;
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("ADOBE_MOBILE_APP_STATE");
        if (namedCollection != null) {
            namedCollection.setInt("SMALL_ICON_RESOURCE_ID", Camera2StreamConfigurationMap);
        }
    }

    public final int getSmallIconResourceID() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection;
        if (Camera2StreamConfigurationMap == -1 && (namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("ADOBE_MOBILE_APP_STATE")) != null) {
            Camera2StreamConfigurationMap = namedCollection.getInt("SMALL_ICON_RESOURCE_ID", -1);
        }
        return Camera2StreamConfigurationMap;
    }

    public final void setLargeIconResourceID(int resourceID) {
        getHighSpeedVideoFpsRanges = resourceID;
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("ADOBE_MOBILE_APP_STATE");
        if (namedCollection != null) {
            namedCollection.setInt("LARGE_ICON_RESOURCE_ID", getHighSpeedVideoFpsRanges);
        }
    }

    public final int getLargeIconResourceID() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection;
        if (getHighSpeedVideoFpsRanges == -1 && (namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("ADOBE_MOBILE_APP_STATE")) != null) {
            getHighSpeedVideoFpsRanges = namedCollection.getInt("LARGE_ICON_RESOURCE_ID", -1);
        }
        return getHighSpeedVideoFpsRanges;
    }
}
