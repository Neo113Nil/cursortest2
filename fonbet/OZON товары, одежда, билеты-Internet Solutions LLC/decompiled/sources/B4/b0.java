package B4;

import B4.H;
import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class b0<D extends H> {

    /* renamed from: a, reason: collision with root package name */
    private e0 f2606a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2607b;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    static final class b extends AbstractC7737t implements Function1<T, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f2608b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(T t2) {
            T navOptions = t2;
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.d(true);
            return Unit.f71690a;
        }
    }

    @NotNull
    public abstract D a();

    @NotNull
    protected final e0 b() {
        e0 e0Var = this.f2606a;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.f2607b;
    }

    public H d(@NotNull H destination, Bundle bundle, S s11) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void e(@NotNull List entries, S s11) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = kotlin.sequences.l.j(kotlin.sequences.l.v(C7714v.w(entries), new c0(this, s11))).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            b().k((C2581j) aVar.next());
        }
    }

    public void f(@NotNull e0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2606a = state;
        this.f2607b = true;
    }

    public void g(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        H d11 = backStackEntry.d();
        if (d11 == null) {
            d11 = null;
        }
        if (d11 == null) {
            return;
        }
        d(d11, null, U.a(b.f2608b));
        b().f(backStackEntry);
    }

    public void h(@NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(@NotNull C2581j popUpTo, boolean z11) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List<C2581j> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<C2581j> listIterator = value.listIterator(value.size());
        C2581j c2581j = null;
        while (k()) {
            c2581j = listIterator.previous();
            if (Intrinsics.d(c2581j, popUpTo)) {
                break;
            }
        }
        if (c2581j != null) {
            b().h(c2581j, z11);
        }
    }

    public boolean k() {
        return true;
    }
}
