package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidManifestIntPropertyReader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getPropertyByName", "", "propertyName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer valueOf = Integer.valueOf(bundle.getInt(propertyName));
            valueOf.intValue();
            if (bundle.containsKey(propertyName)) {
                return valueOf;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
