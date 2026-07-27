package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.Badger;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ZukHomeBadger implements Badger {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // com.onesignal.notifications.internal.badges.impl.shortcutbadger.Badger
    public void executeBadge(Context context, ComponentName componentName, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i2);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // com.onesignal.notifications.internal.badges.impl.shortcutbadger.Badger
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
