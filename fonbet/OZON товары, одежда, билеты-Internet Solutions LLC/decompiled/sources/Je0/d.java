package Je0;

import android.content.Context;
import ei0.InterfaceC6369b;
import ie0.C7064a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9867b;
import te0.C9868c;
import ue0.InterfaceC10046c;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14658a;

    public static final class a {

        /* renamed from: Je0.d$a$a, reason: collision with other inner class name */
        public static final class C0272a extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ sj.d f14659a;

            public C0272a(sj.d dVar) {
                this.f14659a = dVar;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                this.f14659a.a("Кажется приложение использует трекер, но его инстанс не был передан в map_sdk");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Exception -> 0x0076, TryCatch #1 {Exception -> 0x0076, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:13:0x003f, B:15:0x004a, B:21:0x0059, B:25:0x0062, B:27:0x0068), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a() {
            boolean z11;
            InterfaceC6369b.a aVar;
            Field declaredField;
            ApiHost host;
            try {
                ie0.g.f66321a.getClass();
                GeoProxyConfig c11 = ie0.g.c();
                boolean z12 = (c11 == null || (host = c11.getHost()) == null || !host.getIsStage()) ? false : true;
                try {
                    aVar = InterfaceC6369b.f62344a;
                    declaredField = aVar.getClass().getSuperclass().getDeclaredField("instance");
                    Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(true);
                } catch (Exception unused) {
                }
                if (((InterfaceC6369b) declaredField.get(aVar)) != null) {
                    z11 = true;
                    ie0.g.f66321a.getClass();
                    GeoProxyConfig c12 = ie0.g.c();
                    boolean z13 = (c12 == null ? c12.getOzonTracker() : null) != null;
                    if (z12 && z11 && !z13) {
                        b();
                    }
                    if (!z12 || !z11 || z13 || d.f14658a) {
                        return;
                    }
                    C9867b c9867b = C9867b.f99466a;
                    C9867b.g("This app using Tracker but instance not provided", InterfaceC10046c.a.ERROR, 4);
                    d.f14658a = true;
                    return;
                }
                z11 = false;
                ie0.g.f66321a.getClass();
                GeoProxyConfig c122 = ie0.g.c();
                if ((c122 == null ? c122.getOzonTracker() : null) != null) {
                }
                if (z12) {
                    b();
                }
                if (z12) {
                }
            } catch (Exception e11) {
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.f("Error while try check tracker run", e11, InterfaceC10046c.a.ERROR);
            }
        }

        private static void b() {
            Context context;
            if (d.f14658a) {
                return;
            }
            C7064a.f66281a.getClass();
            WeakReference e11 = C7064a.e();
            if (e11 != null && (context = (Context) e11.get()) != null) {
                C9868c.a(context);
            }
            new Timer().schedule(new C0272a(sj.e.f98817f.q(new sj.a("maps_sdk", "maps_sdk_android", null))), 0L, 5000L);
            d.f14658a = true;
        }
    }
}
