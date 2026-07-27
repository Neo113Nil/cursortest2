package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.ThreadUtilsKt;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS extends Activity {
    private final void processIntent() {
        processOpen(getIntent());
        finish();
    }

    private final void processOpen(Intent intent) {
        ThreadUtilsKt.suspendifyOnDefault(new NotificationOpenedActivityHMS$processOpen$1(this, intent, null));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
