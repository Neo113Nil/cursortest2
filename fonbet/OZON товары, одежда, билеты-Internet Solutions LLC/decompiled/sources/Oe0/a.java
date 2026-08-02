package Oe0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapView;
import te0.C9867b;
import ue0.InterfaceC10046c;

/* loaded from: classes3.dex */
public final class a implements MapView.OnCanRemoveUnusedStyleImageListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, Boolean> f20323a = new HashMap<>();

    public final void a(@NotNull String bitmapName) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        this.f20323a.put(bitmapName, Boolean.TRUE);
    }

    public final void b() {
        this.f20323a.clear();
    }

    public final void c(@NotNull String bitmapName) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        this.f20323a.remove(bitmapName);
    }

    @Override // org.maplibre.android.maps.MapView.OnCanRemoveUnusedStyleImageListener
    public final boolean e(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C9867b c9867b = C9867b.f99466a;
        C9867b.g(Nk.a.b("TRY ERASE bitmap ", id2), InterfaceC10046c.a.INFO, 4);
        HashMap<String, Boolean> hashMap = this.f20323a;
        boolean containsKey = hashMap.containsKey(id2);
        boolean z11 = !containsKey;
        if (!containsKey) {
            hashMap.remove(id2);
        }
        return z11;
    }
}
