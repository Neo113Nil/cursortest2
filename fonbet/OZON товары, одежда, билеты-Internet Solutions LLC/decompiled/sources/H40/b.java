package H40;

import C.D;
import H30.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH40/b;", "Landroid/widget/FrameLayout;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private RecyclerView f10592a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private RecyclerView f10593b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private RecyclerView f10594c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private ImageView f10595d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private ConstraintLayout f10596e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView recyclerView = this.f10593b;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        CenterLinearLayoutManager centerLinearLayoutManager = layoutManager instanceof CenterLinearLayoutManager ? (CenterLinearLayoutManager) layoutManager : null;
        if (centerLinearLayoutManager != null) {
            centerLinearLayoutManager.setVerticalScrollEnabled(state.i());
        }
        if (state.i()) {
            if (layoutParams2 == null || layoutParams2.height != -1) {
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                }
                recyclerView.setLayoutParams(layoutParams2);
            }
        } else if (layoutParams2 == null || layoutParams2.height != -2) {
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            recyclerView.setLayoutParams(layoutParams2);
        }
        String a11 = state.a();
        ImageView imageView = this.f10595d;
        if (a11 != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, state.a());
            imageView.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        } else {
            imageView.setBackground(null);
        }
        if (state.f() != null) {
            ImageViewExtKt.load$default(this.f10595d, state.f(), null, null, null, null, false, null, 126, null);
        } else {
            imageView.setImageDrawable(null);
        }
        List<RecyclerItem> d11 = state.d();
        RecyclerView recyclerView2 = this.f10592a;
        d.a(recyclerView2, d11);
        d.a(recyclerView, state.g());
        List<RecyclerItem> b11 = state.b();
        RecyclerView recyclerView3 = this.f10594c;
        d.a(recyclerView3, b11);
        recyclerView.setPadding(D.d(state.h().left), D.d(state.h().top), D.d(state.h().right), D.d(state.h().bottom));
        recyclerView2.setPadding(D.d(state.e().left), D.d(state.e().top), D.d(state.e().right), D.d(state.e().bottom));
        recyclerView3.setPadding(D.d(state.c().left), D.d(state.c().top), D.d(state.c().right), D.d(state.c().bottom));
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final RecyclerView getF10592a() {
        return this.f10592a;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final ConstraintLayout getF10596e() {
        return this.f10596e;
    }

    public abstract int d();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(d(), (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.top_recycler);
        this.f10592a = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.center_recycler);
        this.f10593b = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.bottom_recycler);
        this.f10594c = recyclerView3;
        this.f10595d = (ImageView) findViewById(R.id.image);
        this.f10596e = (ConstraintLayout) findViewById(R.id.holder);
        r.a(recyclerView);
        r.a(recyclerView2);
        r.a(recyclerView3);
        recyclerView3.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
        recyclerView.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
        recyclerView2.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
    }
}
