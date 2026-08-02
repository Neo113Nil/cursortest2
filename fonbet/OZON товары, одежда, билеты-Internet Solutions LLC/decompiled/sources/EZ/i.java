package EZ;

import GZ.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* loaded from: classes3.dex */
public abstract class i<T extends pZ.f> implements a<T> {

    @NotNull
    private final AtomicBoolean isAttached = new AtomicBoolean(false);
    protected h navigatorHolder;
    protected GZ.g ozonRouter;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openDeeplink$default(i iVar, String str, int i11, Map map, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDeeplink");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            map = U.c();
        }
        iVar.openDeeplink(str, i11, map);
    }

    public static /* synthetic */ void redirect$default(i iVar, e eVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: redirect");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        iVar.redirect(eVar, i11);
    }

    public final void attachTo$compass_release(@NotNull C8475a compass) {
        Intrinsics.checkNotNullParameter(compass, "compass");
        if (this.isAttached.compareAndSet(false, true)) {
            setOzonRouter(compass.q());
            setNavigatorHolder(compass.o());
        }
    }

    @NotNull
    protected final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final GZ.g getOzonRouter() {
        GZ.g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    protected final void next(@NotNull g navigator, @NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        getNavigatorHolder().g(navigator, response, i11);
    }

    protected final void openDeeplink(@NotNull String deeplink, int i11, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (i11 == 0) {
            g.a.a(getOzonRouter(), deeplink, properties, null, 4);
        } else {
            getOzonRouter().b(deeplink, i11, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void redirect(@NotNull e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        getNavigatorHolder().f(response, i11);
    }

    protected final void setNavigatorHolder(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.navigatorHolder = hVar;
    }

    protected final void setOzonRouter(@NotNull GZ.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.ozonRouter = gVar;
    }
}
