package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f11998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TaskCompletionSource f11999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S4.e f12000d;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11997a) {
            case 0:
                m mVar = this.f11998b;
                T4.a aVar = new T4.a(mVar.b(), mVar.f12045b.f12012a, 0);
                this.f12000d.b(aVar, true);
                aVar.a(this.f11999c, null);
                break;
            default:
                m mVar2 = this.f11998b;
                T4.a aVar2 = new T4.a(mVar2.b(), mVar2.f12045b.f12012a, 1);
                this.f12000d.b(aVar2, true);
                Uri uriBuild = null;
                if (aVar2.l()) {
                    String strOptString = aVar2.i().optString("downloadTokens");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String str = strOptString.split(",", -1)[0];
                        Uri.Builder builderBuildUpon = ((Uri) mVar2.b().f17812c).buildUpon();
                        builderBuildUpon.appendQueryParameter("alt", "media");
                        builderBuildUpon.appendQueryParameter("token", str);
                        uriBuild = builderBuildUpon.build();
                    }
                }
                TaskCompletionSource taskCompletionSource = this.f11999c;
                if (taskCompletionSource != null) {
                    aVar2.a(taskCompletionSource, uriBuild);
                }
                break;
        }
    }
}
