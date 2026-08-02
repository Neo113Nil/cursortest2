package com.razorpay;

import android.app.Activity;
import io.github.sabpaisaandroid.activity.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ n(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // java.lang.Runnable
    public final void run() {
        e.b bVar;
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                MagicXActivity$_$O0_o.m1700onPageFinished$lambda0((MagicXActivity) activity);
                break;
            default:
                io.github.sabpaisaandroid.activity.e this$0 = (io.github.sabpaisaandroid.activity.e) activity;
                int i2 = io.github.sabpaisaandroid.activity.e.i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                io.github.sabpaisaandroid.dialog.f fVar = this$0.d;
                if (fVar != null && (bVar = fVar.a) != null) {
                    bVar.a.invoke(bVar.b);
                    break;
                }
                break;
        }
    }
}
