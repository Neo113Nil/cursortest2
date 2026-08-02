package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f11697b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11698c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11700e;

    /* renamed from: a, reason: collision with root package name */
    private final A3.z f11696a = new A3.z("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f11699d = new Object();

    public y(String str, long j) {
        this.f11697b = str;
        this.f11698c = j;
    }

    public final Task a(Activity activity, int i7) {
        synchronized (this.f11699d) {
            try {
                if (this.f11700e) {
                    return Tasks.forResult(0);
                }
                this.f11700e = true;
                A3.z zVar = this.f11696a;
                Object[] objArr = {Integer.valueOf(i7)};
                zVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", A3.z.c(zVar.f662a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f11697b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f11698c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
