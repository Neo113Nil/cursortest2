package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/ExtensionDiscovery;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/Extension;", "getExtensions", "(Landroid/content/Context;)Ljava/util/List;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionDiscovery {
    public final java.util.List<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> getExtensions(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        try {
            try {
                android.content.pm.ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, "com.adobe.marketing.mobile.ExtensionDiscoveryService"), 128);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serviceInfo, "");
                android.os.Bundle bundle = serviceInfo.metaData;
                kotlin.Unit unit = null;
                if (bundle != null) {
                    java.util.Set<java.lang.String> keySet = bundle.keySet();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
                    for (java.lang.String str : keySet) {
                        try {
                            java.lang.Class<?> cls = java.lang.Class.forName(str);
                            if (!(cls instanceof java.lang.Class)) {
                                cls = null;
                            }
                            if (cls != null) {
                                linkedHashSet.add(cls);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("Discovered extension: ");
                                sb.append(str);
                                sb.append(" bundled with the app.");
                                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", sb.toString(), new java.lang.Object[0]);
                            } else {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append("Class ");
                                sb2.append(str);
                                sb2.append(" is not a valid Extension.");
                                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", sb2.toString(), new java.lang.Object[0]);
                            }
                        } catch (java.lang.Exception e) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append("Failed to load extension class ");
                            sb3.append(str);
                            sb3.append(" - ");
                            sb3.append(e.getCause());
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", sb3.toString(), new java.lang.Object[0]);
                        }
                    }
                    unit = kotlin.Unit.INSTANCE;
                }
                if (unit == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", "No metadata found for service com.adobe.marketing.mobile.ExtensionDiscoveryService.", new java.lang.Object[0]);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", "Service com.adobe.marketing.mobile.ExtensionDiscoveryService not found.", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Error ");
            sb4.append(e2);
            sb4.append(" during extension discovery.");
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", sb4.toString(), new java.lang.Object[0]);
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Found ");
        sb5.append(linkedHashSet.size());
        sb5.append(" extensions.");
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionDiscovery", sb5.toString(), new java.lang.Object[0]);
        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
    }
}
