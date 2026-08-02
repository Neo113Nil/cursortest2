package C7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* loaded from: classes.dex */
public final class h extends D7.m {
    public h(Context context) {
        super(new D7.n("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // D7.m
    protected final void a(Context context, Intent intent) {
        boolean equals = context.getPackageName().equals(intent.getStringExtra("package.name"));
        D7.n nVar = this.f6108a;
        if (!equals) {
            nVar.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        nVar.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            nVar.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f7 = InstallState.f(intent, nVar);
        nVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f7);
        d(f7);
    }
}
