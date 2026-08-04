package com.google.android.play.core.integrity;

import A3.A;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class be extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f11629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f11629b = bnVar;
        this.f11628a = context;
    }

    @Override // A3.A
    public final void b() {
        int i7;
        Context context = this.f11628a;
        TaskCompletionSource taskCompletionSource = this.f11629b.f11655d;
        A3.z zVar = A3.g.f653a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i7 = (applicationInfo != null && applicationInfo.enabled && A3.g.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        taskCompletionSource.trySetResult(Integer.valueOf(i7));
    }
}
