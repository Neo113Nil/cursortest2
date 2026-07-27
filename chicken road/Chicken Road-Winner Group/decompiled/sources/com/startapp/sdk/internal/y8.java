package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f4722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z8 f4723b;

    public y8(z8 z8Var, Bitmap bitmap) {
        this.f4723b = z8Var;
        this.f4722a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8 z8Var;
        z8 z8Var2 = this.f4723b;
        Bitmap bitmap = this.f4722a;
        a9 a9Var = z8Var2.f4784d;
        a9Var.f3450g--;
        if (bitmap != null) {
            a9Var.f3448d.put(z8Var2.f4782b, bitmap);
            List3DActivity list3DActivity = z8Var2.f4784d.f;
            if (list3DActivity != null) {
                list3DActivity.a(z8Var2.f4781a);
            }
            a9 a9Var2 = z8Var2.f4784d;
            if (a9Var2.f3451h.isEmpty() || (z8Var = (z8) a9Var2.f3451h.poll()) == null) {
                return;
            }
            ((Executor) a9Var2.f3445a.a()).execute(z8Var);
        }
    }
}
