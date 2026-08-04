package com.google.android.play.core.integrity;

import A3.C0056e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes.dex */
final class as extends A3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f11607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0056e f11608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A3.z f11609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f11611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f11612f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C0056e c0056e) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f11609c = new A3.z("RequestDialogCallbackImpl");
        this.f11610d = context.getPackageName();
        this.f11611e = kVar;
        this.f11607a = taskCompletionSource;
        this.f11612f = activity;
        this.f11608b = c0056e;
    }

    @Override // A3.y
    public final void b(Bundle bundle) {
        this.f11608b.d(this.f11607a);
        this.f11609c.b("onRequestDialog(%s)", this.f11610d);
        com.google.android.gms.common.api.j jVarA = this.f11611e.a(bundle);
        if (jVarA != null) {
            this.f11607a.trySetException(jVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            A3.z zVar = this.f11609c;
            Object[] objArr = {this.f11610d};
            zVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", A3.z.c(zVar.f662a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f11607a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f11612f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f11608b.a()));
        A3.z zVar2 = this.f11609c;
        Object[] objArr2 = new Object[0];
        zVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", A3.z.c(zVar2.f662a, "Starting dialog intent...", objArr2));
        }
        this.f11612f.startActivityForResult(intent, 0);
    }
}
