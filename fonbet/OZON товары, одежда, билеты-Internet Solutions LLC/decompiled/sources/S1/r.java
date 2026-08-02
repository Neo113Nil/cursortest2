package S1;

import K1.AbstractC3429i;
import K1.C3422b;
import K1.W;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<W, URLSpan> f25671a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<C3422b.C0288b<AbstractC3429i.b>, URLSpan> f25672b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<C3422b.C0288b<AbstractC3429i>, i> f25673c = new WeakHashMap<>();

    public final ClickableSpan a(@NotNull C3422b.C0288b<AbstractC3429i> c0288b) {
        WeakHashMap<C3422b.C0288b<AbstractC3429i>, i> weakHashMap = this.f25673c;
        i iVar = weakHashMap.get(c0288b);
        if (iVar == null) {
            iVar = new i(c0288b.f());
            weakHashMap.put(c0288b, iVar);
        }
        return iVar;
    }

    @NotNull
    public final URLSpan b(@NotNull C3422b.C0288b<AbstractC3429i.b> c0288b) {
        WeakHashMap<C3422b.C0288b<AbstractC3429i.b>, URLSpan> weakHashMap = this.f25672b;
        URLSpan uRLSpan = weakHashMap.get(c0288b);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(c0288b.f().c());
            weakHashMap.put(c0288b, uRLSpan);
        }
        return uRLSpan;
    }

    @NotNull
    public final URLSpan c(@NotNull W w11) {
        WeakHashMap<W, URLSpan> weakHashMap = this.f25671a;
        URLSpan uRLSpan = weakHashMap.get(w11);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(w11.a());
            weakHashMap.put(w11, uRLSpan);
        }
        return uRLSpan;
    }
}
