package com.flurry.android.marketing.messaging.notification;

import android.app.Activity;
import android.os.Bundle;
import w1.AbstractC1739q1;

/* loaded from: classes.dex */
public class NotificationClickedActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        moveTaskToBack(true);
        AbstractC1739q1.b(this, getIntent());
        finish();
    }
}
