package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/recyclerview/widget/g;", "Landroidx/recyclerview/widget/RecyclerView;", "", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g extends RecyclerView {

    /* renamed from: a, reason: collision with root package name */
    private G10.a f44872a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A10.f f44873b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f44874c;

    /* synthetic */ class a extends C7735q implements Function0<A10.d> {
        @Override // kotlin.jvm.functions.Function0
        public final A10.d invoke() {
            return A10.e.a((RecyclerView) this.receiver);
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<Parcelable, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Parcelable parcelable) {
            g.super.onRestoreInstanceState(parcelable);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Parcelable> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Parcelable invoke() {
            return g.super.onSaveInstanceState();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void e(LinkedHashSet linkedHashSet, Collection collection) {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot change item decorations during a scroll or layout");
        }
        if ((!linkedHashSet.isEmpty()) && this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (collection != null && (!collection.isEmpty())) {
            this.mItemDecorations.removeAll(collection);
        }
        if (!linkedHashSet.isEmpty()) {
            this.mItemDecorations.addAll(linkedHashSet);
        }
        if (collection != null && (!collection.isEmpty()) && this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final A10.f getF44873b() {
        return this.f44873b;
    }

    public final void g() {
        Function0<Unit> a11 = this.f44873b.a();
        if (a11 != null) {
            a11.invoke();
        }
        if (this.f44872a == null) {
            this.f44872a = new G10.a();
        }
        setAdapter(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ((A10.d) this.f44874c.getValue()).b();
        if (this.f44872a == null) {
            this.f44872a = new G10.a();
        }
        if (this.f44872a == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b callback = new b();
        Intrinsics.checkNotNullParameter(this, "recyclerView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final Parcelable onSaveInstanceState() {
        if (this.f44872a == null) {
            this.f44872a = new G10.a();
        }
        if (this.f44872a != null) {
            c callback = new c();
            Intrinsics.checkNotNullParameter(this, "recyclerView");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Parcelable parcelable = (Parcelable) callback.invoke();
            if (parcelable != null) {
                return parcelable;
            }
        }
        return super.onSaveInstanceState();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44873b = new A10.f();
        this.f44874c = Sc.k.a(Sc.n.NONE, new a(0, this, A10.e.class, "getInvalidateDecorationHelper", "getInvalidateDecorationHelper(Landroidx/recyclerview/widget/RecyclerView;)Lru/ozon/composer/ui/recycler/RecyclerInvalidateDecorationHelper;", 1));
    }
}
