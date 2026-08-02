package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.common.C0857g;
import com.google.android.gms.common.C0858h;
import com.google.android.gms.common.ServiceConnectionC0826a;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class b {

    @Nullable
    public ServiceConnectionC0826a a;

    @Nullable
    public zzf b;
    public boolean c;
    public final Object d = new Object();

    @Nullable
    public d e;
    public final Context f;
    public final long g;

    public static final class a {

        @Nullable
        public final String a;
        public final boolean b;

        @Deprecated
        public a(@Nullable String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @NonNull
        public final String toString() {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.b);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public b(@NonNull Context context) {
        C0875q.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    @NonNull
    public static a a(@NonNull Context context) throws IOException, IllegalStateException, C0857g, C0858h {
        b bVar = new b(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.c();
            a e = bVar.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    @VisibleForTesting
    public static void d(@Nullable a aVar, long j, @Nullable Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap a2 = com.google.android.gms.ads.identifier.a.a("app_context", "1");
            if (aVar != null) {
                a2.put("limit_ad_tracking", true != aVar.b ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
                String str = aVar.a;
                if (str != null) {
                    a2.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                a2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th.getClass().getName());
            }
            a2.put("tag", "AdvertisingIdClient");
            a2.put("time_spent", Long.toString(j));
            new c(a2).start();
        }
    }

    public final void b() {
        C0875q.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        com.google.android.gms.common.stats.a.b().c(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void c() throws IOException, IllegalStateException, C0857g, C0858h {
        C0875q.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c = C0856f.b.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0826a serviceConnectionC0826a = new ServiceConnectionC0826a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!com.google.android.gms.common.stats.a.b().a(context, intent, serviceConnectionC0826a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = serviceConnectionC0826a;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            this.b = zze.zza(serviceConnectionC0826a.a());
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C0857g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a e() throws IOException {
        a aVar;
        C0875q.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        d dVar = this.e;
                        if (dVar == null || !dVar.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                C0875q.g(this.a);
                C0875q.g(this.b);
                try {
                    aVar = new a(this.b.zzc(), this.b.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            d dVar2 = this.e;
            if (dVar2 != null) {
                dVar2.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new d(this, j);
            }
        }
        return aVar;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
