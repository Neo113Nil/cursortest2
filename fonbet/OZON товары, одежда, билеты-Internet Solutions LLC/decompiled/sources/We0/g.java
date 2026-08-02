package We0;

import De.C2862e;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.map.RootMapObjectCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe0.InterfaceC10766e;
import xe0.InterfaceC10767f;
import xe0.j;

/* loaded from: classes3.dex */
public final class g implements InterfaceC10767f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RootMapObjectCollection f33838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ve0.a f33839b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f33840c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f33841d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f33842e;

    /* renamed from: f, reason: collision with root package name */
    private f f33843f;

    public g(@NotNull RootMapObjectCollection mapObjects, @NotNull Ve0.a yandexAnimationLoader, @NotNull InterfaceC5817a cameraController, @NotNull j pinSelectSynchronizer, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(mapObjects, "mapObjects");
        Intrinsics.checkNotNullParameter(yandexAnimationLoader, "yandexAnimationLoader");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f33838a = mapObjects;
        this.f33839b = yandexAnimationLoader;
        this.f33840c = cameraController;
        this.f33841d = pinSelectSynchronizer;
        this.f33842e = coroutineScope;
    }

    @Override // xe0.InterfaceC10767f
    @NotNull
    public final InterfaceC10766e a() {
        return new f(this.f33838a, this.f33839b, this.f33841d, false, this.f33840c, this.f33842e);
    }

    @Override // xe0.InterfaceC10767f
    @NotNull
    public final InterfaceC10766e b() {
        f fVar = this.f33843f;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this.f33838a, this.f33839b, this.f33841d, true, this.f33840c, this.f33842e);
        this.f33843f = fVar2;
        return fVar2;
    }
}
