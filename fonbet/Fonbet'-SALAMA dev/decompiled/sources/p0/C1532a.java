package p0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f15662a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f15663b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15664c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15665d;

    public C1532a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f15662a = intentFilter;
        this.f15663b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f15663b);
        sb.append(" filter=");
        sb.append(this.f15662a);
        if (this.f15665d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
