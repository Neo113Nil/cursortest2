package X10;

import a00.C4908c;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f33976a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f33978c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X10.a f33979d;

    static final class a extends AbstractC7737t implements Function1<ViewGroup, View> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.composer.ui.widget.g<?, l20.c> f33980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.composer.ui.widget.g<?, l20.c> gVar) {
            super(1);
            this.f33980b = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(ViewGroup viewGroup) {
            ViewGroup it = viewGroup;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f33980b.createView(it);
        }
    }

    public e(@NotNull androidx.recyclerview.widget.g recyclerView, @NotNull C4908c lifecycleOwner, boolean z11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f33976a = recyclerView;
        this.f33977b = z11;
        this.f33978c = new c(recyclerView.getContext());
        this.f33979d = new X10.a(lifecycleOwner, recyclerView);
    }

    @Override // X10.d
    public final void a() {
        this.f33978c.a();
        this.f33979d.b();
    }

    public final void b(@NotNull ru.ozon.composer.ui.widget.g<?, l20.c> viewMapper, @NotNull Function1<? super View, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(onViewCreated, "onViewCreated");
        Integer layout = viewMapper.getLayout();
        if (layout != null) {
            this.f33978c.b(layout.intValue(), this.f33976a, new AJ.d(onViewCreated, 4));
        } else if (this.f33977b) {
            this.f33979d.c(new a(viewMapper), onViewCreated);
        }
    }
}
