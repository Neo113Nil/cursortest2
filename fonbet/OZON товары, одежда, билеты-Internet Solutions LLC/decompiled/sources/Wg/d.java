package Wg;

import A00.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Tg.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import i10.l;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<d> f33848d = k.b(a.f33853b);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33849e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Wg.a f33850a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ej.b f33851b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ej.b f33852c;

    static final class a extends AbstractC7737t implements Function0<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f33853b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return new e().a();
        }
    }

    public static final class b {
        @NotNull
        public static d a(@NotNull Function1 builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            e eVar = new e();
            builder.invoke(eVar);
            return eVar.a();
        }
    }

    public d(@NotNull Wg.a composerRecyclerViewProvider, @NotNull Ej.b scrollWidgetKeyMapper, @NotNull Ej.b oneTimePostProcessingModifier) {
        Intrinsics.checkNotNullParameter(composerRecyclerViewProvider, "composerRecyclerViewProvider");
        Intrinsics.checkNotNullParameter(scrollWidgetKeyMapper, "scrollWidgetKeyMapper");
        Intrinsics.checkNotNullParameter(oneTimePostProcessingModifier, "oneTimePostProcessingModifier");
        this.f33850a = composerRecyclerViewProvider;
        this.f33851b = scrollWidgetKeyMapper;
        this.f33852c = oneTimePostProcessingModifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        r2 = r14.c().b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        r10 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r2 = r9.findViewByPosition(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        r2 = (int) r2.getY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r3 = r2;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00da, code lost:
    
        r2 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cd, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h.b b(@NotNull b.f scrollPosition) {
        RecyclerView recyclerView;
        Integer num;
        l lVar;
        l20.d c11;
        T00.a b11;
        Integer scrollWidgetKey;
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        h.b bVar = null;
        if (scrollPosition instanceof b.f.InterfaceC0547b) {
            l.a.b bVar2 = new l.a.b(0L, null, 3);
            e.a aVar = new e.a();
            aVar.g(0);
            e.a.f(aVar, false);
            bVar = new h.b(aVar.b(), bVar2);
        } else if (scrollPosition instanceof b.f.a) {
            Object additionalInfo = ((b.f.a) scrollPosition).getAdditionalInfo();
            c cVar = additionalInfo instanceof c ? (c) additionalInfo : null;
            if (cVar != null && (recyclerView = this.f33850a.get()) != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    RecyclerView.g adapter = recyclerView.getAdapter();
                    C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
                    if (c8042d != null) {
                        Integer a11 = cVar.a();
                        String key = cVar.b();
                        if (key != null) {
                            this.f33851b.getClass();
                            Intrinsics.checkNotNullParameter(key, "key");
                            num = Integer.valueOf(key.hashCode());
                        } else {
                            num = null;
                        }
                        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                            while (true) {
                                ru.ozon.composer.ui.widget.l h11 = (findFirstVisibleItemPosition < 0 || findFirstVisibleItemPosition >= c8042d.getCardsCount()) ? null : c8042d.h(findFirstVisibleItemPosition);
                                if (h11 != null && (scrollWidgetKey = h11.d().getScrollWidgetKey()) != null) {
                                    int intValue = scrollWidgetKey.intValue();
                                    if (num == null || num.intValue() == intValue) {
                                        break;
                                    }
                                }
                                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                                    break;
                                }
                                findFirstVisibleItemPosition++;
                            }
                        }
                        int i11 = Integer.MIN_VALUE;
                        if (num != null) {
                            if (a11 == null) {
                                if (c8042d.getCardsCount() != 0) {
                                    List<ru.ozon.composer.ui.widget.l> g10 = c8042d.g();
                                    ListIterator<ru.ozon.composer.ui.widget.l> listIterator = g10.listIterator(g10.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            lVar = null;
                                            break;
                                        }
                                        lVar = listIterator.previous();
                                        T00.a b12 = lVar.c().b();
                                        if ((b12 != null ? b12.d() : null) != null) {
                                            break;
                                        }
                                    }
                                    ru.ozon.composer.ui.widget.l lVar2 = lVar;
                                    if (lVar2 != null && (c11 = lVar2.c()) != null && (b11 = c11.b()) != null) {
                                        a11 = b11.d();
                                    }
                                }
                                a11 = null;
                            }
                            boolean z11 = i11 == Integer.MIN_VALUE;
                            e.a aVar2 = new e.a();
                            aVar2.a(f.a(num.intValue()));
                            aVar2.d(i11);
                            aVar2.e(z11, z11);
                            if (a11 != null) {
                                aVar2.c(a11.intValue());
                            }
                            bVar = new h.b(aVar2.b(), new l.a.b(0L, null, 3));
                        }
                    }
                }
            }
        }
        this.f33852c.getClass();
        Intrinsics.checkNotNullParameter(scrollPosition, "<unused var>");
        return bVar;
    }
}
