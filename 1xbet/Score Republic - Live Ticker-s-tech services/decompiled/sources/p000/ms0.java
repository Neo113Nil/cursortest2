package p000;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 extends sq1 {

    /* JADX INFO: renamed from: k */
    public CharSequence f5155k;

    @Override // p000.sq1
    /* JADX INFO: renamed from: g */
    public final void mo3289g(f71 f71Var) {
        new Notification.BigTextStyle((Notification.Builder) f71Var.f2335l).setBigContentTitle(null).bigText(this.f5155k);
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: h */
    public final String mo3290h() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
