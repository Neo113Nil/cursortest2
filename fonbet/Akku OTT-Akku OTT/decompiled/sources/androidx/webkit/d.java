package androidx.webkit;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.webkit.WebViewCompat;
import com.facebook.appevents.C0689a;
import com.facebook.appevents.E;
import com.facebook.appevents.j;
import com.facebook.appevents.k;
import com.facebook.appevents.ondeviceprocessing.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import com.odehbros.flutter_file_downloader.downloader.g;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((WebViewCompat.WebViewStartUpCallback) obj2).onSuccess((WebViewStartUpResult) obj);
                break;
            case 1:
                C0689a accessTokenAppId = (C0689a) obj2;
                E appEvents = (E) obj;
                if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        k.a(accessTokenAppId, appEvents);
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                        return;
                    }
                }
                break;
            case 2:
                Context context = (Context) obj2;
                String applicationId = (String) obj;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(context, "$context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String concat = applicationId.concat("pingForOnDevice");
                        if (sharedPreferences.getLong(concat, 0L) == 0) {
                            com.facebook.appevents.ondeviceprocessing.c cVar = com.facebook.appevents.ondeviceprocessing.c.a;
                            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.c.class)) {
                                try {
                                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                    com.facebook.appevents.ondeviceprocessing.c.a.b(c.a.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.ondeviceprocessing.c.class);
                                }
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(concat, System.currentTimeMillis());
                            edit.apply();
                            break;
                        }
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.ondeviceprocessing.a.class);
                        return;
                    }
                }
                break;
            case 3:
                ((ImageDownload) obj2).lambda$start$0((TaskCompletionSource) obj);
                break;
            default:
                String str = (String) obj;
                g gVar = g.this;
                gVar.f.b(str);
                gVar.h.d.error("Download file error", str, null);
                break;
        }
    }
}
