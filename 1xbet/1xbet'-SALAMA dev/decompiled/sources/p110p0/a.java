package p110p0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f15668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f15669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15671d;

    public a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f15668a = intentFilter;
        this.f15669b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f15669b);
        sb.append(" filter=");
        sb.append(this.f15668a);
        if (this.f15671d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
