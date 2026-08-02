package com.adobe.marketing.mobile;

/* loaded from: classes3.dex */
public class ExtensionHelper {
    private ExtensionHelper() {
    }

    public static java.lang.String getName(com.adobe.marketing.mobile.Extension extension) {
        try {
            return extension.getName();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getFriendlyName(com.adobe.marketing.mobile.Extension extension) {
        try {
            return extension.getFriendlyName();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getVersion(com.adobe.marketing.mobile.Extension extension) {
        try {
            return extension.getVersion();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getMetadata(com.adobe.marketing.mobile.Extension extension) {
        try {
            return extension.getMetadata();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void notifyUnregistered(com.adobe.marketing.mobile.Extension extension) {
        try {
            extension.onUnregistered();
        } catch (java.lang.Exception unused) {
        }
    }

    public static void notifyRegistered(com.adobe.marketing.mobile.Extension extension) {
        try {
            extension.onRegistered();
        } catch (java.lang.Exception unused) {
        }
    }
}
