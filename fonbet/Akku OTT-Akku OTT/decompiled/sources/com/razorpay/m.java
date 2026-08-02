package com.razorpay;

import android.app.Activity;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ m(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                MagicXActivity.m1698dismissHalfTransparentPage$lambda1((MagicXActivity) activity);
                break;
            default:
                io.github.sabpaisaandroid.activity.e this$0 = (io.github.sabpaisaandroid.activity.e) activity;
                int i2 = io.github.sabpaisaandroid.activity.e.i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SystemClock.sleep(3000L);
                this$0.runOnUiThread(new n(this$0, 1));
                break;
        }
    }
}
