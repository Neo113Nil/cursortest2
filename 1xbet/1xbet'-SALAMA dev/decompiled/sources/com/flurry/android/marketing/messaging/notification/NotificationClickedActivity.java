package com.flurry.android.marketing.messaging.notification;

import android.app.Activity;
import android.os.Bundle;
import p155w1.AbstractC1030q1;

/* JADX INFO: loaded from: classes.dex */
public class NotificationClickedActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        moveTaskToBack(true);
        AbstractC1030q1.b(this, getIntent());
        finish();
    }
}
