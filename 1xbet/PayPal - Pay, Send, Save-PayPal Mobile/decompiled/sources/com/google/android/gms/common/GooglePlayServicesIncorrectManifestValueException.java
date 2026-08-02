package com.google.android.gms.common;

/* loaded from: classes3.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        super(i, r1.toString());
        int i2 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 104 + java.lang.String.valueOf(i).length() + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb.append(i2);
        sb.append(" but found ");
        sb.append(i);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
