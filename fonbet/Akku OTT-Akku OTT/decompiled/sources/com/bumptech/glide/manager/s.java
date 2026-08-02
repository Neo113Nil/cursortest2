package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.manager.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s {
    public static volatile s d;
    public final c a;

    @GuardedBy("this")
    public final HashSet b = new HashSet();

    @GuardedBy("this")
    public boolean c;

    public class a implements com.bumptech.glide.util.g<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.util.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    public class b implements b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z) {
            ArrayList arrayList;
            com.bumptech.glide.util.m.a();
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z);
            }
        }
    }

    @RequiresApi(24)
    public static final class c {
        public boolean a;
        public final b b;
        public final com.bumptech.glide.util.f c;
        public final a d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                com.bumptech.glide.util.m.f().post(new t(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                com.bumptech.glide.util.m.f().post(new t(this, false));
            }
        }

        public c(com.bumptech.glide.util.f fVar, b bVar) {
            this.c = fVar;
            this.b = bVar;
        }
    }

    public s(@NonNull Context context) {
        this.a = new c(new com.bumptech.glide.util.f(new a(context)), new b());
    }

    public static s a(@NonNull Context context) {
        if (d == null) {
            synchronized (s.class) {
                try {
                    if (d == null) {
                        d = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @GuardedBy("this")
    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        c cVar = this.a;
        com.bumptech.glide.util.f fVar = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) fVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) fVar.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
        this.c = z;
    }
}
