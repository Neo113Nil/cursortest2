package M10;

import A00.a;
import A00.e;
import Sc.InterfaceC3999a;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes3.dex */
public final class d {

    static final class a extends AbstractC7737t implements Function1<C7854a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(1);
            this.f17251b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C7854a c7854a) {
            C7854a it = c7854a;
            Intrinsics.checkNotNullParameter(it, "it");
            Integer scrollWidgetKey = it.d().getScrollWidgetKey();
            return Boolean.valueOf(scrollWidgetKey != null && scrollWidgetKey.intValue() == this.f17251b);
        }
    }

    @InterfaceC3999a
    public static final a.C.d a(@NotNull RecyclerView recyclerView) {
        int findFirstVisibleItemPosition;
        int findLastVisibleItemPosition;
        Integer scrollWidgetKey;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            RecyclerView.g adapter = recyclerView.getAdapter();
            C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
            if (c8042d != null && (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) <= (findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                while (true) {
                    l20.c b11 = c8042d.b(findFirstVisibleItemPosition);
                    if (b11 != null && (scrollWidgetKey = b11.getScrollWidgetKey()) != null) {
                        int intValue = scrollWidgetKey.intValue();
                        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                        return new a.C.d(intValue, findViewByPosition != null ? (int) findViewByPosition.getY() : 0, 28, false);
                    }
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        break;
                    }
                    findFirstVisibleItemPosition++;
                }
            }
        }
        return null;
    }

    public static final e b(@NotNull RecyclerView recyclerView) {
        int findFirstVisibleItemPosition;
        int findLastVisibleItemPosition;
        l20.c d11;
        Integer scrollWidgetKey;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            RecyclerView.g adapter = recyclerView.getAdapter();
            C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
            if (c8042d != null && (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) <= (findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                while (true) {
                    l lVar = (l) C7714v.Q(findFirstVisibleItemPosition, c8042d.g());
                    if (lVar != null && (d11 = lVar.d()) != null && (scrollWidgetKey = d11.getScrollWidgetKey()) != null) {
                        int intValue = scrollWidgetKey.intValue();
                        T00.a b11 = lVar.c().b();
                        Integer d12 = b11 != null ? b11.d() : null;
                        e.a aVar = new e.a();
                        aVar.a(new a(intValue));
                        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                        aVar.d(findViewByPosition != null ? (int) findViewByPosition.getY() : 0);
                        aVar.h();
                        if (d12 != null) {
                            aVar.c(d12.intValue());
                        }
                        return aVar.b();
                    }
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        break;
                    }
                    findFirstVisibleItemPosition++;
                }
            }
        }
        return null;
    }
}
