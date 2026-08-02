package p000;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 {

    /* JADX INFO: renamed from: a */
    public final NotificationManager f6584a;

    static {
        new HashSet();
    }

    public qs0(Context context) {
        this.f6584a = (NotificationManager) context.getSystemService("notification");
    }
}
