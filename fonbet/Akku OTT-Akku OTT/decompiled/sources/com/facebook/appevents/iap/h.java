package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.u;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.a billingClientVersion = (u.a) this.b;
                Context context = (Context) this.c;
                if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
                        Intrinsics.checkNotNullParameter(context, "$context");
                        i iVar = i.a;
                        String packageName = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                        iVar.a(billingClientVersion, packageName);
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, i.class);
                        return;
                    }
                }
                break;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysLoaded$1((DrmSessionEventListener) this.c);
                break;
            default:
                ((FirebaseMessaging) this.b).lambda$deleteToken$9((TaskCompletionSource) this.c);
                break;
        }
    }
}
