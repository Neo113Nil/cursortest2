package l3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f17821a;

    /* renamed from: b, reason: collision with root package name */
    public final G.v f17822b;

    public p(G.v vVar) {
        this.f17822b = vVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f17822b.f1750m;
            throw null;
        }
    }
}
