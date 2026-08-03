package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class DefaultsXmlParser {
    private static final java.lang.String XML_TAG_ENTRY = "entry";
    private static final java.lang.String XML_TAG_KEY = "key";
    private static final java.lang.String XML_TAG_VALUE = "value";

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[Catch: IOException -> 0x008b, IOException | XmlPullParserException -> 0x008d, TryCatch #2 {IOException | XmlPullParserException -> 0x008d, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0013, B:13:0x0025, B:15:0x0086, B:18:0x002d, B:22:0x003d, B:24:0x0041, B:30:0x004f, B:38:0x0077, B:40:0x007d, B:42:0x0082, B:44:0x005e, B:47:0x0068), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.lang.String, java.lang.String> getDefaultsFromXml(android.content.Context context, int i) {
        android.content.res.Resources resources;
        char c;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            resources = context.getResources();
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e) {
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Encountered an error while parsing the defaults XML file.", e);
        }
        if (resources == null) {
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Could not find the resources of the current context while trying to set defaults from an XML.");
            return hashMap;
        }
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                str = xml.getName();
            } else if (eventType == 3) {
                if (xml.getName().equals(XML_TAG_ENTRY)) {
                    if (str2 == null || str3 == null) {
                        android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "An entry in the defaults XML has an invalid key and/or value tag.");
                    } else {
                        hashMap.put(str2, str3);
                    }
                    str2 = null;
                    str3 = null;
                }
                str = null;
            } else if (eventType == 4 && str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 106079) {
                    if (hashCode == 111972721 && str.equals("value")) {
                        c = 1;
                        if (c != 0) {
                            str2 = xml.getText();
                        } else if (c != 1) {
                            android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xml.getText();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (str.equals("key")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
        }
        return hashMap;
    }
}
