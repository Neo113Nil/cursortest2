package Z4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.collection.AbstractC5139h;
import androidx.collection.C5133b;
import androidx.collection.C5153w;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import x2.i;

/* loaded from: classes8.dex */
public abstract class a extends RecyclerView.g<Z4.b> implements Z4.c {
    final G mFragmentManager;
    private g mFragmentMaxLifecycleEnforcer;
    final C5153w<ComponentCallbacksC5392m> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C5153w<Integer> mItemIdToViewHolder;
    final AbstractC5434v mLifecycle;
    private final C5153w<ComponentCallbacksC5392m.n> mSavedStates;

    /* renamed from: Z4.a$a, reason: collision with other inner class name */
    final class ViewOnLayoutChangeListenerC0657a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f35353a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z4.b f35354b;

        ViewOnLayoutChangeListenerC0657a(FrameLayout frameLayout, Z4.b bVar) {
            this.f35353a = frameLayout;
            this.f35354b = bVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            FrameLayout frameLayout = this.f35353a;
            if (frameLayout.getParent() != null) {
                frameLayout.removeOnLayoutChangeListener(this);
                a.this.placeFragmentInViewHolder(this.f35354b);
            }
        }
    }

    final class b implements androidx.lifecycle.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z4.b f35356a;

        b(Z4.b bVar) {
            this.f35356a = bVar;
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NonNull J j11, @NonNull AbstractC5434v.a aVar) {
            a aVar2 = a.this;
            if (aVar2.shouldDelayFragmentTransactions()) {
                return;
            }
            j11.getLifecycle().e(this);
            Z4.b bVar = this.f35356a;
            FrameLayout frameLayout = (FrameLayout) bVar.itemView;
            int i11 = Y.f42258g;
            if (frameLayout.isAttachedToWindow()) {
                aVar2.placeFragmentInViewHolder(bVar);
            }
        }
    }

    final class c extends G.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f35358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f35359b;

        c(ComponentCallbacksC5392m componentCallbacksC5392m, FrameLayout frameLayout) {
            this.f35358a = componentCallbacksC5392m;
            this.f35359b = frameLayout;
        }

        @Override // androidx.fragment.app.G.m
        public final void onFragmentViewCreated(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull View view, Bundle bundle) {
            if (componentCallbacksC5392m == this.f35358a) {
                g10.t1(this);
                a.this.addViewToContainer(view, this.f35359b);
            }
        }
    }

    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.mIsInGracePeriod = false;
            aVar.gcFragments();
        }
    }

    final class e implements androidx.lifecycle.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f35362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f35363b;

        e(Handler handler, Runnable runnable) {
            this.f35362a = handler;
            this.f35363b = runnable;
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NonNull J j11, @NonNull AbstractC5434v.a aVar) {
            if (aVar == AbstractC5434v.a.ON_DESTROY) {
                this.f35362a.removeCallbacks(this.f35363b);
                j11.getLifecycle().e(this);
            }
        }
    }

    private static abstract class f extends RecyclerView.i {
        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            onChanged();
        }
    }

    class g {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.g f35364a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.i f35365b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.lifecycle.G f35366c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f35367d;

        /* renamed from: e, reason: collision with root package name */
        private long f35368e = -1;

        /* renamed from: Z4.a$g$a, reason: collision with other inner class name */
        final class C0658a extends ViewPager2.g {
            C0658a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public final void onPageScrollStateChanged(int i11) {
                g.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public final void onPageSelected(int i11) {
                g.this.d(false);
            }
        }

        final class b extends f {
            b() {
            }

            @Override // Z4.a.f, androidx.recyclerview.widget.RecyclerView.i
            public final void onChanged() {
                g.this.d(true);
            }
        }

        final class c implements androidx.lifecycle.G {
            c() {
            }

            @Override // androidx.lifecycle.G
            public final void onStateChanged(@NonNull J j11, @NonNull AbstractC5434v.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        @NonNull
        private static ViewPager2 a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        final void b(@NonNull RecyclerView recyclerView) {
            this.f35367d = a(recyclerView);
            C0658a c0658a = new C0658a();
            this.f35364a = c0658a;
            this.f35367d.p(c0658a);
            b bVar = new b();
            this.f35365b = bVar;
            a aVar = a.this;
            aVar.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f35366c = cVar;
            aVar.mLifecycle.a(cVar);
        }

        final void c(@NonNull RecyclerView recyclerView) {
            a(recyclerView).A(this.f35364a);
            RecyclerView.i iVar = this.f35365b;
            a aVar = a.this;
            aVar.unregisterAdapterDataObserver(iVar);
            aVar.mLifecycle.e(this.f35366c);
            this.f35367d = null;
        }

        final void d(boolean z11) {
            int f7;
            ComponentCallbacksC5392m b11;
            a aVar = a.this;
            if (aVar.shouldDelayFragmentTransactions() || this.f35367d.k() != 0 || aVar.mFragments.d() || aVar.getShimmersCount() == 0 || (f7 = this.f35367d.f()) >= aVar.getShimmersCount()) {
                return;
            }
            long itemId = aVar.getItemId(f7);
            if ((itemId != this.f35368e || z11) && (b11 = aVar.mFragments.b(itemId)) != null && b11.isAdded()) {
                this.f35368e = itemId;
                Q p11 = aVar.mFragmentManager.p();
                ComponentCallbacksC5392m componentCallbacksC5392m = null;
                for (int i11 = 0; i11 < aVar.mFragments.h(); i11++) {
                    long e11 = aVar.mFragments.e(i11);
                    ComponentCallbacksC5392m i12 = aVar.mFragments.i(i11);
                    if (i12.isAdded()) {
                        if (e11 != this.f35368e) {
                            p11.u(i12, AbstractC5434v.b.STARTED);
                        } else {
                            componentCallbacksC5392m = i12;
                        }
                        i12.setMenuVisibility(e11 == this.f35368e);
                    }
                }
                if (componentCallbacksC5392m != null) {
                    p11.u(componentCallbacksC5392m, AbstractC5434v.b.RESUMED);
                }
                if (p11.p()) {
                    return;
                }
                p11.k();
            }
        }
    }

    public a(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        this(componentCallbacksC5392m.getChildFragmentManager(), componentCallbacksC5392m.getLifecycle());
    }

    @NonNull
    private static String createKey(@NonNull String str, long j11) {
        return str + j11;
    }

    private void ensureFragment(int i11) {
        long itemId = getItemId(i11);
        if (this.mFragments.c(itemId) >= 0) {
            return;
        }
        ComponentCallbacksC5392m createFragment = createFragment(i11);
        createFragment.setInitialSavedState(this.mSavedStates.b(itemId));
        this.mFragments.f(itemId, createFragment);
    }

    private boolean isFragmentViewBound(long j11) {
        ComponentCallbacksC5392m b11;
        View view;
        return (this.mItemIdToViewHolder.c(j11) >= 0) || !((b11 = this.mFragments.b(j11)) == null || (view = b11.getView()) == null || view.getParent() == null);
    }

    private static boolean isValidKey(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i11) {
        Long l11 = null;
        for (int i12 = 0; i12 < this.mItemIdToViewHolder.h(); i12++) {
            if (this.mItemIdToViewHolder.i(i12).intValue() == i11) {
                if (l11 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l11 = Long.valueOf(this.mItemIdToViewHolder.e(i12));
            }
        }
        return l11;
    }

    private static long parseIdFromKey(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j11) {
        ViewParent parent;
        ComponentCallbacksC5392m b11 = this.mFragments.b(j11);
        if (b11 == null) {
            return;
        }
        if (b11.getView() != null && (parent = b11.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j11)) {
            this.mSavedStates.g(j11);
        }
        if (!b11.isAdded()) {
            this.mFragments.g(j11);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (b11.isAdded() && containsItem(j11)) {
            this.mSavedStates.f(j11, this.mFragmentManager.j1(b11));
        }
        Q p11 = this.mFragmentManager.p();
        p11.q(b11);
        p11.k();
        this.mFragments.g(j11);
    }

    private void scheduleGracePeriodEnd() {
        Handler handler = new Handler(Looper.getMainLooper());
        d dVar = new d();
        this.mLifecycle.a(new e(handler, dVar));
        handler.postDelayed(dVar, 10000L);
    }

    private void scheduleViewAttach(ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull FrameLayout frameLayout) {
        this.mFragmentManager.Y0(new c(componentCallbacksC5392m, frameLayout), false);
    }

    void addViewToContainer(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j11) {
        return j11 >= 0 && j11 < ((long) getShimmersCount());
    }

    @NonNull
    public abstract ComponentCallbacksC5392m createFragment(int i11);

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C5133b c5133b = new C5133b(0);
        for (int i11 = 0; i11 < this.mFragments.h(); i11++) {
            long e11 = this.mFragments.e(i11);
            if (!containsItem(e11)) {
                c5133b.add(Long.valueOf(e11));
                this.mItemIdToViewHolder.g(e11);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i12 = 0; i12 < this.mFragments.h(); i12++) {
                long e12 = this.mFragments.e(i12);
                if (!isFragmentViewBound(e12)) {
                    c5133b.add(Long.valueOf(e12));
                }
            }
        }
        Iterator it = c5133b.iterator();
        while (true) {
            AbstractC5139h abstractC5139h = (AbstractC5139h) it;
            if (!abstractC5139h.hasNext()) {
                return;
            } else {
                removeFragment(((Long) abstractC5139h.next()).longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        i.b(this.mFragmentMaxLifecycleEnforcer == null);
        g gVar = new g();
        this.mFragmentMaxLifecycleEnforcer = gVar;
        gVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(@NonNull Z4.b bVar) {
        Long itemForViewHolder = itemForViewHolder(((FrameLayout) bVar.itemView).getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.g(itemForViewHolder.longValue());
        }
    }

    void placeFragmentInViewHolder(@NonNull Z4.b bVar) {
        ComponentCallbacksC5392m b11 = this.mFragments.b(bVar.getItemId());
        if (b11 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) bVar.itemView;
        View view = b11.getView();
        if (!b11.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (b11.isAdded() && view == null) {
            scheduleViewAttach(b11, frameLayout);
            return;
        }
        if (b11.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (b11.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.C0()) {
                return;
            }
            this.mLifecycle.a(new b(bVar));
            return;
        }
        scheduleViewAttach(b11, frameLayout);
        Q p11 = this.mFragmentManager.p();
        p11.d(b11, "f" + bVar.getItemId());
        p11.u(b11, AbstractC5434v.b.STARTED);
        p11.k();
        this.mFragmentMaxLifecycleEnforcer.d(false);
    }

    @Override // Z4.c
    public final void restoreState(@NonNull Parcelable parcelable) {
        if (!this.mSavedStates.d() || !this.mFragments.d()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, "f#")) {
                this.mFragments.f(parseIdFromKey(str, "f#"), this.mFragmentManager.n0(bundle, str));
            } else {
                if (!isValidKey(str, "s#")) {
                    throw new IllegalArgumentException(Nk.a.b("Unexpected key in savedState: ", str));
                }
                long parseIdFromKey = parseIdFromKey(str, "s#");
                ComponentCallbacksC5392m.n nVar = (ComponentCallbacksC5392m.n) bundle.getParcelable(str);
                if (containsItem(parseIdFromKey)) {
                    this.mSavedStates.f(parseIdFromKey, nVar);
                }
            }
        }
        if (this.mFragments.d()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // Z4.c
    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.h() + this.mFragments.h());
        for (int i11 = 0; i11 < this.mFragments.h(); i11++) {
            long e11 = this.mFragments.e(i11);
            ComponentCallbacksC5392m b11 = this.mFragments.b(e11);
            if (b11 != null && b11.isAdded()) {
                this.mFragmentManager.X0(bundle, b11, createKey("f#", e11));
            }
        }
        for (int i12 = 0; i12 < this.mSavedStates.h(); i12++) {
            long e12 = this.mSavedStates.e(i12);
            if (containsItem(e12)) {
                bundle.putParcelable(createKey("s#", e12), this.mSavedStates.b(e12));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void setHasStableIds(boolean z11) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.H0();
    }

    public a(@NonNull G g10, @NonNull AbstractC5434v abstractC5434v) {
        this.mFragments = new C5153w<>();
        this.mSavedStates = new C5153w<>();
        this.mItemIdToViewHolder = new C5153w<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = g10;
        this.mLifecycle = abstractC5434v;
        super.setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NonNull Z4.b bVar, int i11) {
        long itemId = bVar.getItemId();
        int id2 = ((FrameLayout) bVar.itemView).getId();
        Long itemForViewHolder = itemForViewHolder(id2);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.g(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.f(itemId, Integer.valueOf(id2));
        ensureFragment(i11);
        FrameLayout frameLayout = (FrameLayout) bVar.itemView;
        int i12 = Y.f42258g;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0657a(frameLayout, bVar));
        }
        gcFragments();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public final Z4.b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        int i12 = Z4.b.f35373a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i13 = Y.f42258g;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new Z4.b(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final boolean onFailedToRecycleView(@NonNull Z4.b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(@NonNull Z4.b bVar) {
        placeFragmentInViewHolder(bVar);
        gcFragments();
    }
}
