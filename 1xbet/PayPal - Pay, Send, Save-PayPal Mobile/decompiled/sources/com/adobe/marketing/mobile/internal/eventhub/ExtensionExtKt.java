package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\b\"\u001a\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"&\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\"$\u0010\u0016\u001a\u0006*\u00020\n0\n*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\n*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f"}, d2 = {"Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/Extension;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "initWith", "(Ljava/lang/Class;Lcom/adobe/marketing/mobile/ExtensionApi;)Lcom/adobe/marketing/mobile/Extension;", "", "onExtensionRegistered", "(Lcom/adobe/marketing/mobile/Extension;)V", "onExtensionUnregistered", "", "getExtensionFriendlyName", "(Lcom/adobe/marketing/mobile/Extension;)Ljava/lang/String;", "extensionFriendlyName", "", "getExtensionMetadata", "(Lcom/adobe/marketing/mobile/Extension;)Ljava/util/Map;", "extensionMetadata", "getExtensionName", "extensionName", "getExtensionTypeName", "(Ljava/lang/Class;)Ljava/lang/String;", "extensionTypeName", "getExtensionVersion", "extensionVersion"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionExtKt {
    public static final com.adobe.marketing.mobile.Extension initWith(java.lang.Class<? extends com.adobe.marketing.mobile.Extension> cls, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        try {
            java.lang.reflect.Constructor<? extends com.adobe.marketing.mobile.Extension> declaredConstructor = cls.getDeclaredConstructor(com.adobe.marketing.mobile.ExtensionApi.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(extensionApi);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initializing Extension ");
            sb.append(cls);
            sb.append(" failed with ");
            sb.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionExt", sb.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    public static final java.lang.String getExtensionName(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        return com.adobe.marketing.mobile.ExtensionHelper.getName(extension);
    }

    public static final java.lang.String getExtensionVersion(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        return com.adobe.marketing.mobile.ExtensionHelper.getVersion(extension);
    }

    public static final java.lang.String getExtensionFriendlyName(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        return com.adobe.marketing.mobile.ExtensionHelper.getFriendlyName(extension);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> getExtensionMetadata(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        return com.adobe.marketing.mobile.ExtensionHelper.getMetadata(extension);
    }

    public static final void onExtensionUnregistered(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        com.adobe.marketing.mobile.ExtensionHelper.notifyUnregistered(extension);
    }

    public static final void onExtensionRegistered(com.adobe.marketing.mobile.Extension extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        com.adobe.marketing.mobile.ExtensionHelper.notifyRegistered(extension);
    }

    public static final java.lang.String getExtensionTypeName(java.lang.Class<? extends com.adobe.marketing.mobile.Extension> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return cls.getName();
    }
}
