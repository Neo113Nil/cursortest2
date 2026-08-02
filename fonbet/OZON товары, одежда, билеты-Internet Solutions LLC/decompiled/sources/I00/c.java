package I00;

import A00.a;
import B0.A0;
import Cd.C2749j;
import Sc.r;
import Sc.s;
import T00.j;
import f10.AbstractC6400a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c<I extends C7854a> implements a<I> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k<? extends InterfaceC8046a<?, ? extends l20.c>> f11674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final P00.d f11675b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC6400a<I> f11676c;

    public c(@NotNull k widgetStore, @NotNull P00.d decoder, @NotNull AbstractC6400a composerViewItemProcessor) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(composerViewItemProcessor, "composerViewItemProcessor");
        this.f11674a = widgetStore;
        this.f11675b = decoder;
        this.f11676c = composerViewItemProcessor;
    }

    @Override // I00.a
    @NotNull
    public final List<I> a(@NotNull j rawWidget, T00.a aVar) {
        Intrinsics.checkNotNullParameter(rawWidget, "rawWidget");
        return this.f11675b.c(rawWidget, aVar, this.f11676c);
    }

    @Override // I00.a
    @NotNull
    public final C7854a b(@NotNull j rawWidget) {
        Intrinsics.checkNotNullParameter(rawWidget, "rawWidget");
        C7854a c7854a = (C7854a) C7714v.M(a(rawWidget, null));
        if (c7854a != null) {
            return c7854a;
        }
        throw new NoSuchElementException(A0.b("not found widget(", rawWidget.e().i(), ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[SYNTHETIC] */
    @Override // I00.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(@NotNull a.J.InterfaceC0007a update, @NotNull List items) {
        C7854a c7854a;
        C7854a c7854a2;
        l20.c d11;
        Object a11;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        boolean z11 = false;
        while (true) {
            c7854a = null;
            if (!it.hasNext()) {
                break;
            }
            c7854a2 = (C7854a) it.next();
            InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f11674a.getViewMapper(c7854a2.j());
            if (!(viewMapper instanceof d)) {
                viewMapper = null;
            }
            d dVar = (d) viewMapper;
            if (dVar != null && dVar.getSupportedUpdates().contains(update.getClass())) {
                d11 = c7854a2.d();
                try {
                    r.Companion companion = r.INSTANCE;
                    a11 = dVar.handleUpdate(update, d11);
                    if (a11 == null) {
                        a11 = null;
                    }
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                }
            }
            if (c7854a == null) {
                z11 = true;
                c7854a2 = c7854a;
            }
            arrayList.add(c7854a2);
        }
        if (z11) {
            return arrayList;
        }
        return null;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            H00.c.d(b11, new b(c7854a2));
        } else if (!(a11 instanceof r.b)) {
            l20.c cVar = (l20.c) a11;
            if (!C2749j.f() || !Intrinsics.d(d11, cVar)) {
                c7854a = c7854a2.b(l20.b.a(c7854a2.i(), cVar, null, null, 253));
            }
        }
        if (c7854a == null) {
        }
        arrayList.add(c7854a2);
    }
}
