package D4;

import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import b1.InterfaceC5505h;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LD4/a;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/g0;", "handle", "<init>", "(Landroidx/lifecycle/g0;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2826a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f5881a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<InterfaceC5505h> f5882b;

    public C2826a(@NotNull C5418g0 c5418g0) {
        UUID uuid = (UUID) c5418g0.c("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            c5418g0.g(uuid, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f5881a = uuid;
    }

    @NotNull
    /* renamed from: d0, reason: from getter */
    public final UUID getF5881a() {
        return this.f5881a;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        WeakReference<InterfaceC5505h> weakReference = this.f5882b;
        if (weakReference == null) {
            Intrinsics.n("saveableStateHolderRef");
            throw null;
        }
        InterfaceC5505h interfaceC5505h = weakReference.get();
        if (interfaceC5505h != null) {
            interfaceC5505h.e(this.f5881a);
        }
        WeakReference<InterfaceC5505h> weakReference2 = this.f5882b;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            Intrinsics.n("saveableStateHolderRef");
            throw null;
        }
    }
}
