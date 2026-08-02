package A10;

import Sc.k;
import Sc.n;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RecyclerView f282a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f283b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f284c;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            d.this.f283b = true;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f286b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public d(@NotNull RecyclerView recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.f282a = recycler;
        this.f283b = true;
        this.f284c = k.a(n.NONE, b.f286b);
    }

    public final void b() {
        this.f283b = false;
        RecyclerView recyclerView = this.f282a;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new a());
        } else {
            this.f283b = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void c() {
        ?? r02 = this.f284c;
        ((Handler) r02.getValue()).removeCallbacksAndMessages(null);
        RecyclerView recyclerView = this.f282a;
        if (recyclerView.isComputingLayout() || !this.f283b) {
            ((Handler) r02.getValue()).post(new c(recyclerView, 0));
        } else {
            recyclerView.invalidateItemDecorations();
        }
    }
}
