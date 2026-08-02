package com.google.android.play.core.integrity;

import A3.A;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class be extends A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f11628a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f11629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f11629b = bnVar;
        this.f11628a = context;
    }

    @Override // A3.A
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        int i7;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f11628a;
        taskCompletionSource = this.f11629b.f11655d;
        A3.z zVar = A3.g.f653a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null && applicationInfo.enabled && A3.g.a(packageInfo.signatures)) {
            i7 = packageInfo.versionCode;
            taskCompletionSource.trySetResult(Integer.valueOf(i7));
        }
        i7 = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i7));
    }
}
