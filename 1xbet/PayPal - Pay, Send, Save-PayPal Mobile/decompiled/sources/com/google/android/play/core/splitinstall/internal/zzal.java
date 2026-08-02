package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzal {
    private final com.google.android.play.core.splitcompat.zza zza;
    private org.xmlpull.v1.XmlPullParser zzb;

    public final long zza() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        if (this.zzb == null) {
            throw new org.xmlpull.v1.XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.zzb.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.zzb.getName().equals("manifest")) {
                java.lang.String attributeValue = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                java.lang.String attributeValue2 = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int parseInt = java.lang.Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return parseInt;
                    }
                    try {
                        return (java.lang.Integer.parseInt(attributeValue2) << 32) | (parseInt & 4294967295L);
                    } catch (java.lang.NumberFormatException e) {
                        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", e.getMessage()));
                    }
                } catch (java.lang.NumberFormatException e2) {
                    throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", e2.getMessage()));
                }
            }
        }
        throw new org.xmlpull.v1.XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void zzb(android.content.res.AssetManager assetManager, java.io.File file) throws java.io.IOException {
        this.zzb = assetManager.openXmlResourceParser(com.google.android.play.core.splitcompat.zza.zzc(assetManager, file), "AndroidManifest.xml");
    }

    public zzal(com.google.android.play.core.splitcompat.zza zzaVar) {
        this.zza = zzaVar;
    }
}
