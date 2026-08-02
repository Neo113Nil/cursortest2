package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.exoplayer.C5441c;
import m3.C8053F;
import m3.InterfaceC8073o;

/* renamed from: androidx.media3.exoplayer.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5441c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43737a;

    /* renamed from: b, reason: collision with root package name */
    private final a f43738b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8073o f43739c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43740d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.c$a */
    final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final b f43741a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC8073o f43742b;

        public a(InterfaceC8073o interfaceC8073o, b bVar) {
            this.f43742b = interfaceC8073o;
            this.f43741a = bVar;
        }

        public static void a(a aVar) {
            if (C5441c.this.f43740d) {
                E.this.a1(3, false);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f43742b.i(new Runnable() { // from class: androidx.media3.exoplayer.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5441c.a.a(C5441c.a.this);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.c$b */
    public interface b {
    }

    public C5441c(Context context, Looper looper, Looper looper2, b bVar, C8053F c8053f) {
        this.f43737a = context.getApplicationContext();
        this.f43739c = c8053f.a(looper, null);
        this.f43738b = new a(c8053f.a(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void c() {
        if (this.f43740d) {
            this.f43739c.i(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f43737a.unregisterReceiver(C5441c.this.f43738b);
                }
            });
            this.f43740d = false;
        }
    }
}
