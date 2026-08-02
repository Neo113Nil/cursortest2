package Ve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.tm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4653tm extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C4314i0 f32123a;

    public C4653tm(C4314i0 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f32123a = result;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            C4314i0 c4314i0 = this.f32123a;
            if (hashCode == -3956105) {
                if (action.equals("action_permissions_granted")) {
                    c4314i0.invoke("action_permissions_granted");
                    context.unregisterReceiver(this);
                    return;
                }
                return;
            }
            if (hashCode == 456550495 && action.equals("action_permissions_denied")) {
                c4314i0.invoke("action_permissions_denied");
                context.unregisterReceiver(this);
            }
        }
    }
}
