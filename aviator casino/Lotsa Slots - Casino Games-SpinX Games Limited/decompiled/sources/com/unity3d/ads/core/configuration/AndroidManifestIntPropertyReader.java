package com.unity3d.ads.core.configuration;

/* compiled from: AndroidManifestIntPropertyReader.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPropertyByName", "", "propertyName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidManifestIntPropertyReader {
    private final android.content.Context context;

    public AndroidManifestIntPropertyReader(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final java.lang.Integer getPropertyByName(java.lang.String propertyName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            android.os.Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(bundle.getInt(propertyName));
            valueOf.intValue();
            if (bundle.containsKey(propertyName)) {
                return valueOf;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
