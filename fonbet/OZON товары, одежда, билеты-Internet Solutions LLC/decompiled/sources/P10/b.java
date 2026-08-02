package P10;

import P10.f;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f21607a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8042d f21608b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f21609c;

    /* renamed from: d, reason: collision with root package name */
    private f f21610d;

    public b(@NotNull c asyncDiffer, @NotNull C8042d composerAdapter) {
        Intrinsics.checkNotNullParameter(asyncDiffer, "asyncDiffer");
        Intrinsics.checkNotNullParameter(composerAdapter, "composerAdapter");
        this.f21607a = asyncDiffer;
        this.f21608b = composerAdapter;
        this.f21609c = new d();
    }

    public final void b(int i11, @NotNull ru.ozon.composer.ui.widget.k<l20.c> viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f21608b.onBindViewHolder(i11, viewHolder);
    }

    @NotNull
    public final List<i> c() {
        return this.f21607a.g();
    }

    @NotNull
    public final View d(int i11, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        i iVar = this.f21607a.g().get(i11);
        int a11 = iVar.a();
        C8042d c8042d = this.f21608b;
        int itemViewType = c8042d.getItemViewType(a11);
        ru.ozon.composer.ui.widget.k<l20.c> a12 = this.f21609c.a(itemViewType);
        if (a12 == null) {
            ru.ozon.composer.ui.widget.k<l20.c> createViewHolder = c8042d.createViewHolder(parent, itemViewType);
            Intrinsics.checkNotNullExpressionValue(createViewHolder, "createViewHolder(...)");
            a12 = createViewHolder;
            a aVar = new a(a12, this, itemViewType);
            View itemView = a12.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            O10.e.a(itemView);
            itemView.addOnAttachStateChangeListener(aVar);
            O10.d.g(itemView, a12);
        }
        View itemView2 = a12.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        O10.e.a(itemView2);
        O10.d.f(i11, itemView2);
        O10.d.e(itemView2, iVar.b());
        O10.d.b(itemView2);
        itemView2.setZ(0.0f);
        b(a11, a12);
        View itemView3 = a12.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        return itemView3;
    }

    public final void e(@NotNull O10.c scrollHelper, @NotNull Q10.a stickyContainer, @NotNull Function0<Unit> refreshStickyHeader) {
        Intrinsics.checkNotNullParameter(scrollHelper, "scrollHelper");
        Intrinsics.checkNotNullParameter(stickyContainer, "stickyContainer");
        Intrinsics.checkNotNullParameter(refreshStickyHeader, "refreshStickyHeader");
        if (this.f21610d != null) {
            return;
        }
        f fVar = new f(new e(scrollHelper, stickyContainer, this, this.f21608b, refreshStickyHeader));
        this.f21610d = fVar;
        this.f21607a.f(fVar.e());
        f.a d11 = fVar.d();
        C8042d c8042d = this.f21608b;
        c8042d.f(d11);
        f(c8042d.g());
    }

    public final void f(@NotNull List<l> newComposerList) {
        Intrinsics.checkNotNullParameter(newComposerList, "newComposerList");
        this.f21607a.h(newComposerList);
    }
}
