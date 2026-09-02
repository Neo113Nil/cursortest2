package P;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f352a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.e f353b;

    public t(Y.e eVar) {
        this.f353b = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((m) this.f353b.f524c).getClass();
            throw null;
        }
    }
}
