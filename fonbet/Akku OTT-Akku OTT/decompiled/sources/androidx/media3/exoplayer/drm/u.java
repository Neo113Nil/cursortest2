package androidx.media3.exoplayer.drm;

import android.os.Bundle;
import com.facebook.C0728q;
import com.facebook.login.C0720b;
import com.facebook.login.u;
import com.google.common.util.concurrent.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OfflineLicenseHelper) this.b).lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1((x) this.c, (DrmSession) this.d);
                break;
            default:
                C0720b this$0 = (C0720b) this.b;
                u.c request = (u.c) this.c;
                Bundle values = (Bundle) this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(values, "$values");
                try {
                    this$0.s(values, request);
                    this$0.z(request, values, null);
                    break;
                } catch (C0728q e) {
                    this$0.z(request, null, e);
                }
        }
    }
}
