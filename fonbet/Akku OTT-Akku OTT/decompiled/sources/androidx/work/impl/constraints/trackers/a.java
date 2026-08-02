package androidx.work.impl.constraints.trackers;

import android.content.Context;
import com.facebook.appevents.iap.i;
import com.facebook.appevents.iap.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.b, (ConstraintTracker) this.c);
                break;
            default:
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
                    }
                }
                break;
        }
    }
}
