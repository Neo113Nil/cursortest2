package com.google.android.play.core.integrity;

import A3.C0056e;
import A3.E;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0056e f11652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A3.z f11653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f11655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f11656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f11657f;

    public bn(Context context, A3.z zVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11655d = taskCompletionSource;
        this.f11654c = context.getPackageName();
        this.f11653b = zVar;
        this.f11656e = atVar;
        this.f11657f = kVar;
        C0056e c0056e = new C0056e(context, zVar, "ExpressIntegrityService", bo.f11658a, new E() { // from class: com.google.android.play.core.integrity.bd
            @Override // A3.E
            public final Object a(IBinder iBinder) {
                int i7 = A3.o.f660x;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof A3.p ? (A3.p) iInterfaceQueryLocalInterface : new A3.n(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f11652a = c0056e;
        c0056e.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j, long j3, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f11654c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A3.m(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Q0.a.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f11654c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new A3.m(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(Q0.a.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f11655d.getTask().isSuccessful() && ((Integer) bnVar.f11655d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f11653b.b("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11652a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j, long j3, int i7) {
        this.f11653b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11652a.c(new bg(this, taskCompletionSource, 0, str, j, j3, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i7) {
        this.f11653b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11652a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
