package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11997a;

    /* renamed from: b, reason: collision with root package name */
    public m f11998b;

    /* renamed from: c, reason: collision with root package name */
    public TaskCompletionSource f11999c;

    /* renamed from: d, reason: collision with root package name */
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
                Uri uri = null;
                if (aVar2.l()) {
                    String optString = aVar2.i().optString("downloadTokens");
                    if (!TextUtils.isEmpty(optString)) {
                        String str = optString.split(",", -1)[0];
                        Uri.Builder buildUpon = ((Uri) mVar2.b().f17806c).buildUpon();
                        buildUpon.appendQueryParameter("alt", "media");
                        buildUpon.appendQueryParameter("token", str);
                        uri = buildUpon.build();
                    }
                }
                TaskCompletionSource taskCompletionSource = this.f11999c;
                if (taskCompletionSource != null) {
                    aVar2.a(taskCompletionSource, uri);
                    break;
                }
                break;
        }
    }
}
