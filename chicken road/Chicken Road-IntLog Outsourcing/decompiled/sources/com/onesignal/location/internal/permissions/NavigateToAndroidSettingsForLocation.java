package com.onesignal.location.internal.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NavigateToAndroidSettingsForLocation {
    public static final NavigateToAndroidSettingsForLocation INSTANCE = new NavigateToAndroidSettingsForLocation();

    private NavigateToAndroidSettingsForLocation() {
    }

    public final void show(Context context) {
        i.e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }
}
