package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.m;
import com.bumptech.glide.manager.s;

/* loaded from: classes3.dex */
public final class d implements b {
    public final Context a;
    public final m.b b;

    public d(@NonNull Context context, @NonNull m.b bVar) {
        this.a = context.getApplicationContext();
        this.b = bVar;
    }

    @Override // com.bumptech.glide.manager.l
    public final void h() {
        s a = s.a(this.a);
        m.b bVar = this.b;
        synchronized (a) {
            a.b.remove(bVar);
            if (a.c && a.b.isEmpty()) {
                s.c cVar = a.a;
                ((ConnectivityManager) cVar.c.get()).unregisterNetworkCallback(cVar.d);
                a.c = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.l
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.l
    public final void onStart() {
        s a = s.a(this.a);
        m.b bVar = this.b;
        synchronized (a) {
            a.b.add(bVar);
            a.b();
        }
    }
}
