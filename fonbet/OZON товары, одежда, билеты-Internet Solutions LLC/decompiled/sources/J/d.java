package J;

import C.Y;
import C.s0;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements Y.c {
    public static String b(String str, String str2, String str3, Map map) {
        return str + str2 + str3 + map;
    }

    public static String c(String str, TextAtom textAtom, String str2, List list, String str3) {
        return str + textAtom + str2 + list + str3;
    }

    public static boolean d(GZ.j jVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(jVar, str);
        return Intrinsics.d(jVar.b().getAuthority(), str2);
    }

    public static /* synthetic */ boolean e(AtomicReference atomicReference, Map map) {
        while (!atomicReference.compareAndSet(null, map)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.coroutines.h hVar, Wc.a aVar, Wc.a aVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, aVar2)) {
            if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                return false;
            }
        }
        return true;
    }

    @Override // C.Y.c
    public void a(s0 s0Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(s0Var.g().getWidth(), s0Var.g().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        s0Var.k(surface, H.c.b(), new InterfaceC10646a() { // from class: J.e
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                surface.release();
                surfaceTexture.release();
            }
        });
    }
}
