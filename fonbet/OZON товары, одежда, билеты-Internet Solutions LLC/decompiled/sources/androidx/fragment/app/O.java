package androidx.fragment.app;

import Bk.C2638a;
import C.o0;
import a3.C4929c;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.f0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
final class O {

    /* renamed from: a, reason: collision with root package name */
    private final C5404z f42952a;

    /* renamed from: b, reason: collision with root package name */
    private final P f42953b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final ComponentCallbacksC5392m f42954c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42955d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f42956e = -1;

    final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f42957a;

        a(View view) {
            this.f42957a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f42957a;
            view2.removeOnAttachStateChangeListener(this);
            androidx.core.view.Y.A(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42958a;

        static {
            int[] iArr = new int[AbstractC5434v.b.values().length];
            f42958a = iArr;
            try {
                iArr[AbstractC5434v.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42958a[AbstractC5434v.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42958a[AbstractC5434v.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42958a[AbstractC5434v.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    O(@NonNull C5404z c5404z, @NonNull P p11, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        this.f42952a = c5404z;
        this.f42953b = p11;
        this.f42954c = componentCallbacksC5392m;
    }

    final void a() {
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC5392m);
        }
        Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        componentCallbacksC5392m.performActivityCreated(bundle2);
        this.f42952a.a(componentCallbacksC5392m, bundle2, false);
    }

    final void b() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        ComponentCallbacksC5392m i02 = G.i0(componentCallbacksC5392m.mContainer);
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m.getParentFragment();
        if (i02 != null && !i02.equals(parentFragment)) {
            C4929c.m(componentCallbacksC5392m, i02, componentCallbacksC5392m.mContainerId);
        }
        componentCallbacksC5392m.mContainer.addView(componentCallbacksC5392m.mView, this.f42953b.j(componentCallbacksC5392m));
    }

    final void c() {
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC5392m);
        }
        ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m.mTarget;
        O o11 = null;
        P p11 = this.f42953b;
        if (componentCallbacksC5392m2 != null) {
            O n11 = p11.n(componentCallbacksC5392m2.mWho);
            if (n11 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC5392m + " declared target fragment " + componentCallbacksC5392m.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC5392m.mTargetWho = componentCallbacksC5392m.mTarget.mWho;
            componentCallbacksC5392m.mTarget = null;
            o11 = n11;
        } else {
            String str = componentCallbacksC5392m.mTargetWho;
            if (str != null && (o11 = p11.n(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(componentCallbacksC5392m);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(o0.c(sb2, componentCallbacksC5392m.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (o11 != null) {
            o11.l();
        }
        componentCallbacksC5392m.mHost = componentCallbacksC5392m.mFragmentManager.s0();
        componentCallbacksC5392m.mParentFragment = componentCallbacksC5392m.mFragmentManager.v0();
        C5404z c5404z = this.f42952a;
        c5404z.g(componentCallbacksC5392m, false);
        componentCallbacksC5392m.performAttach();
        c5404z.b(componentCallbacksC5392m, false);
    }

    final int d() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (componentCallbacksC5392m.mFragmentManager == null) {
            return componentCallbacksC5392m.mState;
        }
        int i11 = this.f42956e;
        int i12 = b.f42958a[componentCallbacksC5392m.mMaxState.ordinal()];
        if (i12 != 1) {
            i11 = i12 != 2 ? i12 != 3 ? i12 != 4 ? Math.min(i11, -1) : Math.min(i11, 0) : Math.min(i11, 1) : Math.min(i11, 5);
        }
        if (componentCallbacksC5392m.mFromLayout) {
            if (componentCallbacksC5392m.mInLayout) {
                i11 = Math.max(this.f42956e, 2);
                View view = componentCallbacksC5392m.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f42956e < 4 ? Math.min(i11, componentCallbacksC5392m.mState) : Math.min(i11, 1);
            }
        }
        if (componentCallbacksC5392m.mInDynamicContainer && componentCallbacksC5392m.mContainer == null) {
            i11 = Math.min(i11, 4);
        }
        if (!componentCallbacksC5392m.mAdded) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = componentCallbacksC5392m.mContainer;
        f0.c.a q11 = viewGroup != null ? f0.s(viewGroup, componentCallbacksC5392m.getParentFragmentManager()).q(this) : null;
        if (q11 == f0.c.a.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (q11 == f0.c.a.REMOVING) {
            i11 = Math.max(i11, 3);
        } else if (componentCallbacksC5392m.mRemoving) {
            i11 = componentCallbacksC5392m.isInBackStack() ? Math.min(i11, 1) : Math.min(i11, -1);
        }
        if (componentCallbacksC5392m.mDeferStart && componentCallbacksC5392m.mState < 5) {
            i11 = Math.min(i11, 4);
        }
        if (componentCallbacksC5392m.mTransitioning) {
            i11 = Math.max(i11, 3);
        }
        if (G.D0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i11 + " for " + componentCallbacksC5392m);
        }
        return i11;
    }

    final void e() {
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC5392m);
        }
        Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (componentCallbacksC5392m.mIsCreated) {
            componentCallbacksC5392m.mState = 1;
            componentCallbacksC5392m.restoreChildFragmentState();
        } else {
            C5404z c5404z = this.f42952a;
            c5404z.h(componentCallbacksC5392m, bundle2, false);
            componentCallbacksC5392m.performCreate(bundle2);
            c5404z.c(componentCallbacksC5392m, bundle2, false);
        }
    }

    final void f() {
        String str;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (componentCallbacksC5392m.mFromLayout) {
            return;
        }
        if (G.D0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC5392m);
        }
        Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = componentCallbacksC5392m.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = componentCallbacksC5392m.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i11 = componentCallbacksC5392m.mContainerId;
            if (i11 != 0) {
                if (i11 == -1) {
                    throw new IllegalArgumentException(C2638a.d("Cannot create fragment ", componentCallbacksC5392m, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC5392m.mFragmentManager.m0().b(componentCallbacksC5392m.mContainerId);
                if (viewGroup == null) {
                    if (!componentCallbacksC5392m.mRestored && !componentCallbacksC5392m.mInDynamicContainer) {
                        try {
                            str = componentCallbacksC5392m.getResources().getResourceName(componentCallbacksC5392m.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC5392m.mContainerId) + " (" + str + ") for fragment " + componentCallbacksC5392m);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4929c.l(componentCallbacksC5392m, viewGroup);
                }
            }
        }
        componentCallbacksC5392m.mContainer = viewGroup;
        componentCallbacksC5392m.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (componentCallbacksC5392m.mView != null) {
            if (G.D0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + componentCallbacksC5392m);
            }
            componentCallbacksC5392m.mView.setSaveFromParentEnabled(false);
            componentCallbacksC5392m.mView.setTag(R.id.fragment_container_view_tag, componentCallbacksC5392m);
            if (viewGroup != null) {
                b();
            }
            if (componentCallbacksC5392m.mHidden) {
                componentCallbacksC5392m.mView.setVisibility(8);
            }
            if (componentCallbacksC5392m.mView.isAttachedToWindow()) {
                androidx.core.view.Y.A(componentCallbacksC5392m.mView);
            } else {
                View view = componentCallbacksC5392m.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            componentCallbacksC5392m.performViewCreated();
            this.f42952a.m(componentCallbacksC5392m, componentCallbacksC5392m.mView, bundle2, false);
            int visibility = componentCallbacksC5392m.mView.getVisibility();
            componentCallbacksC5392m.setPostOnViewCreatedAlpha(componentCallbacksC5392m.mView.getAlpha());
            if (componentCallbacksC5392m.mContainer != null && visibility == 0) {
                View findFocus = componentCallbacksC5392m.mView.findFocus();
                if (findFocus != null) {
                    componentCallbacksC5392m.setFocusedView(findFocus);
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + componentCallbacksC5392m);
                    }
                }
                componentCallbacksC5392m.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC5392m.mState = 2;
    }

    final void g() {
        ComponentCallbacksC5392m f7;
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "movefrom CREATED: " + componentCallbacksC5392m);
        }
        boolean z11 = true;
        boolean z12 = componentCallbacksC5392m.mRemoving && !componentCallbacksC5392m.isInBackStack();
        P p11 = this.f42953b;
        if (z12 && !componentCallbacksC5392m.mBeingSaved) {
            p11.B(null, componentCallbacksC5392m.mWho);
        }
        if (!z12 && !p11.p().q0(componentCallbacksC5392m)) {
            String str = componentCallbacksC5392m.mTargetWho;
            if (str != null && (f7 = p11.f(str)) != null && f7.mRetainInstance) {
                componentCallbacksC5392m.mTarget = f7;
            }
            componentCallbacksC5392m.mState = 0;
            return;
        }
        AbstractC5401w<?> abstractC5401w = componentCallbacksC5392m.mHost;
        if (abstractC5401w instanceof B0) {
            z11 = p11.p().m0();
        } else if (abstractC5401w.e() != null) {
            z11 = true ^ ((Activity) abstractC5401w.e()).isChangingConfigurations();
        }
        if ((z12 && !componentCallbacksC5392m.mBeingSaved) || z11) {
            p11.p().e0(componentCallbacksC5392m, false);
        }
        componentCallbacksC5392m.performDestroy();
        this.f42952a.d(componentCallbacksC5392m, false);
        Iterator it = p11.k().iterator();
        while (it.hasNext()) {
            O o11 = (O) it.next();
            if (o11 != null) {
                String str2 = componentCallbacksC5392m.mWho;
                ComponentCallbacksC5392m componentCallbacksC5392m2 = o11.f42954c;
                if (str2.equals(componentCallbacksC5392m2.mTargetWho)) {
                    componentCallbacksC5392m2.mTarget = componentCallbacksC5392m;
                    componentCallbacksC5392m2.mTargetWho = null;
                }
            }
        }
        String str3 = componentCallbacksC5392m.mTargetWho;
        if (str3 != null) {
            componentCallbacksC5392m.mTarget = p11.f(str3);
        }
        p11.s(this);
    }

    final void h() {
        View view;
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC5392m);
        }
        ViewGroup viewGroup = componentCallbacksC5392m.mContainer;
        if (viewGroup != null && (view = componentCallbacksC5392m.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC5392m.performDestroyView();
        this.f42952a.n(componentCallbacksC5392m, false);
        componentCallbacksC5392m.mContainer = null;
        componentCallbacksC5392m.mView = null;
        componentCallbacksC5392m.mViewLifecycleOwner = null;
        componentCallbacksC5392m.mViewLifecycleOwnerLiveData.setValue(null);
        componentCallbacksC5392m.mInLayout = false;
    }

    final void i() {
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + componentCallbacksC5392m);
        }
        componentCallbacksC5392m.performDetach();
        this.f42952a.e(componentCallbacksC5392m, false);
        componentCallbacksC5392m.mState = -1;
        componentCallbacksC5392m.mHost = null;
        componentCallbacksC5392m.mParentFragment = null;
        componentCallbacksC5392m.mFragmentManager = null;
        if ((!componentCallbacksC5392m.mRemoving || componentCallbacksC5392m.isInBackStack()) && !this.f42953b.p().q0(componentCallbacksC5392m)) {
            return;
        }
        if (G.D0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC5392m);
        }
        componentCallbacksC5392m.initState();
    }

    final void j() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (componentCallbacksC5392m.mFromLayout && componentCallbacksC5392m.mInLayout && !componentCallbacksC5392m.mPerformedCreateView) {
            if (G.D0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC5392m);
            }
            Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            componentCallbacksC5392m.performCreateView(componentCallbacksC5392m.performGetLayoutInflater(bundle2), null, bundle2);
            View view = componentCallbacksC5392m.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC5392m.mView.setTag(R.id.fragment_container_view_tag, componentCallbacksC5392m);
                if (componentCallbacksC5392m.mHidden) {
                    componentCallbacksC5392m.mView.setVisibility(8);
                }
                componentCallbacksC5392m.performViewCreated();
                this.f42952a.m(componentCallbacksC5392m, componentCallbacksC5392m.mView, bundle2, false);
                componentCallbacksC5392m.mState = 2;
            }
        }
    }

    @NonNull
    final ComponentCallbacksC5392m k() {
        return this.f42954c;
    }

    final void l() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z11 = this.f42955d;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (z11) {
            if (G.D0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + componentCallbacksC5392m);
                return;
            }
            return;
        }
        try {
            this.f42955d = true;
            boolean z12 = false;
            while (true) {
                int d11 = d();
                int i11 = componentCallbacksC5392m.mState;
                P p11 = this.f42953b;
                if (d11 == i11) {
                    if (!z12 && i11 == -1 && componentCallbacksC5392m.mRemoving && !componentCallbacksC5392m.isInBackStack() && !componentCallbacksC5392m.mBeingSaved) {
                        if (G.D0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + componentCallbacksC5392m);
                        }
                        p11.p().e0(componentCallbacksC5392m, true);
                        p11.s(this);
                        if (G.D0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC5392m);
                        }
                        componentCallbacksC5392m.initState();
                    }
                    if (componentCallbacksC5392m.mHiddenChanged) {
                        if (componentCallbacksC5392m.mView != null && (viewGroup = componentCallbacksC5392m.mContainer) != null) {
                            f0 s11 = f0.s(viewGroup, componentCallbacksC5392m.getParentFragmentManager());
                            if (componentCallbacksC5392m.mHidden) {
                                s11.i(this);
                            } else {
                                s11.k(this);
                            }
                        }
                        G g10 = componentCallbacksC5392m.mFragmentManager;
                        if (g10 != null) {
                            g10.B0(componentCallbacksC5392m);
                        }
                        componentCallbacksC5392m.mHiddenChanged = false;
                        componentCallbacksC5392m.onHiddenChanged(componentCallbacksC5392m.mHidden);
                        componentCallbacksC5392m.mChildFragmentManager.I();
                    }
                    this.f42955d = false;
                    return;
                }
                C5404z c5404z = this.f42952a;
                if (d11 <= i11) {
                    switch (i11 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (componentCallbacksC5392m.mBeingSaved && p11.q(componentCallbacksC5392m.mWho) == null) {
                                p11.B(p(), componentCallbacksC5392m.mWho);
                            }
                            g();
                            break;
                        case 1:
                            h();
                            componentCallbacksC5392m.mState = 1;
                            break;
                        case 2:
                            componentCallbacksC5392m.mInLayout = false;
                            componentCallbacksC5392m.mState = 2;
                            break;
                        case 3:
                            if (G.D0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + componentCallbacksC5392m);
                            }
                            if (componentCallbacksC5392m.mBeingSaved) {
                                p11.B(p(), componentCallbacksC5392m.mWho);
                            } else if (componentCallbacksC5392m.mView != null && componentCallbacksC5392m.mSavedViewState == null) {
                                q();
                            }
                            if (componentCallbacksC5392m.mView != null && (viewGroup2 = componentCallbacksC5392m.mContainer) != null) {
                                f0.s(viewGroup2, componentCallbacksC5392m.getParentFragmentManager()).j(this);
                            }
                            componentCallbacksC5392m.mState = 3;
                            break;
                        case 4:
                            if (G.D0(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC5392m);
                            }
                            componentCallbacksC5392m.performStop();
                            c5404z.l(componentCallbacksC5392m, false);
                            break;
                        case 5:
                            componentCallbacksC5392m.mState = 5;
                            break;
                        case 6:
                            if (G.D0(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC5392m);
                            }
                            componentCallbacksC5392m.performPause();
                            c5404z.f(componentCallbacksC5392m, false);
                            break;
                    }
                } else {
                    switch (i11 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (componentCallbacksC5392m.mView != null && (viewGroup3 = componentCallbacksC5392m.mContainer) != null) {
                                f0 s12 = f0.s(viewGroup3, componentCallbacksC5392m.getParentFragmentManager());
                                int visibility = componentCallbacksC5392m.mView.getVisibility();
                                f0.c.b.Companion.getClass();
                                s12.h(f0.c.b.a.b(visibility), this);
                            }
                            componentCallbacksC5392m.mState = 4;
                            break;
                        case 5:
                            if (G.D0(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC5392m);
                            }
                            componentCallbacksC5392m.performStart();
                            c5404z.k(componentCallbacksC5392m, false);
                            break;
                        case 6:
                            componentCallbacksC5392m.mState = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z12 = true;
            }
        } catch (Throwable th2) {
            this.f42955d = false;
            throw th2;
        }
    }

    final void m(@NonNull ClassLoader classLoader) {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (componentCallbacksC5392m.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            componentCallbacksC5392m.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            componentCallbacksC5392m.mSavedViewState = componentCallbacksC5392m.mSavedFragmentState.getSparseParcelableArray("viewState");
            componentCallbacksC5392m.mSavedViewRegistryState = componentCallbacksC5392m.mSavedFragmentState.getBundle("viewRegistryState");
            N n11 = (N) componentCallbacksC5392m.mSavedFragmentState.getParcelable("state");
            if (n11 != null) {
                componentCallbacksC5392m.mTargetWho = n11.f42949m;
                componentCallbacksC5392m.mTargetRequestCode = n11.f42950n;
                Boolean bool = componentCallbacksC5392m.mSavedUserVisibleHint;
                if (bool != null) {
                    componentCallbacksC5392m.mUserVisibleHint = bool.booleanValue();
                    componentCallbacksC5392m.mSavedUserVisibleHint = null;
                } else {
                    componentCallbacksC5392m.mUserVisibleHint = n11.f42951o;
                }
            }
            if (componentCallbacksC5392m.mUserVisibleHint) {
                return;
            }
            componentCallbacksC5392m.mDeferStart = true;
        } catch (BadParcelableException e11) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + componentCallbacksC5392m, e11);
        }
    }

    final void n() {
        boolean D02 = G.D0(3);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (D02) {
            Log.d("FragmentManager", "moveto RESUMED: " + componentCallbacksC5392m);
        }
        View focusedView = componentCallbacksC5392m.getFocusedView();
        if (focusedView != null) {
            if (focusedView != componentCallbacksC5392m.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != componentCallbacksC5392m.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (G.D0(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(componentCallbacksC5392m);
                sb2.append(" resulting in focused view ");
                sb2.append(componentCallbacksC5392m.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        componentCallbacksC5392m.setFocusedView(null);
        componentCallbacksC5392m.performResume();
        this.f42952a.i(componentCallbacksC5392m, false);
        this.f42953b.B(null, componentCallbacksC5392m.mWho);
        componentCallbacksC5392m.mSavedFragmentState = null;
        componentCallbacksC5392m.mSavedViewState = null;
        componentCallbacksC5392m.mSavedViewRegistryState = null;
    }

    final ComponentCallbacksC5392m.n o() {
        if (this.f42954c.mState > -1) {
            return new ComponentCallbacksC5392m.n(p());
        }
        return null;
    }

    @NonNull
    final Bundle p() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (componentCallbacksC5392m.mState == -1 && (bundle = componentCallbacksC5392m.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new N(componentCallbacksC5392m));
        if (componentCallbacksC5392m.mState > 0) {
            Bundle bundle3 = new Bundle();
            componentCallbacksC5392m.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f42952a.j(componentCallbacksC5392m, bundle3, false);
            Bundle bundle4 = new Bundle();
            componentCallbacksC5392m.mSavedStateRegistryController.d(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle g12 = componentCallbacksC5392m.mChildFragmentManager.g1();
            if (!g12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", g12);
            }
            if (componentCallbacksC5392m.mView != null) {
                q();
            }
            SparseArray<Parcelable> sparseArray = componentCallbacksC5392m.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = componentCallbacksC5392m.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = componentCallbacksC5392m.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void q() {
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f42954c;
        if (componentCallbacksC5392m.mView == null) {
            return;
        }
        if (G.D0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + componentCallbacksC5392m + " with view " + componentCallbacksC5392m.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC5392m.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC5392m.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC5392m.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC5392m.mSavedViewRegistryState = bundle;
    }

    final void r(int i11) {
        this.f42956e = i11;
    }

    O(@NonNull C5404z c5404z, @NonNull P p11, @NonNull ClassLoader classLoader, @NonNull C5400v c5400v, @NonNull Bundle bundle) {
        this.f42952a = c5404z;
        this.f42953b = p11;
        ComponentCallbacksC5392m a11 = ((N) bundle.getParcelable("state")).a(c5400v, classLoader);
        this.f42954c = a11;
        a11.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a11.setArguments(bundle2);
        if (G.D0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a11);
        }
    }

    O(@NonNull C5404z c5404z, @NonNull P p11, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Bundle bundle) {
        this.f42952a = c5404z;
        this.f42953b = p11;
        this.f42954c = componentCallbacksC5392m;
        componentCallbacksC5392m.mSavedViewState = null;
        componentCallbacksC5392m.mSavedViewRegistryState = null;
        componentCallbacksC5392m.mBackStackNesting = 0;
        componentCallbacksC5392m.mInLayout = false;
        componentCallbacksC5392m.mAdded = false;
        ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m.mTarget;
        componentCallbacksC5392m.mTargetWho = componentCallbacksC5392m2 != null ? componentCallbacksC5392m2.mWho : null;
        componentCallbacksC5392m.mTarget = null;
        componentCallbacksC5392m.mSavedFragmentState = bundle;
        componentCallbacksC5392m.mArguments = bundle.getBundle("arguments");
    }
}
