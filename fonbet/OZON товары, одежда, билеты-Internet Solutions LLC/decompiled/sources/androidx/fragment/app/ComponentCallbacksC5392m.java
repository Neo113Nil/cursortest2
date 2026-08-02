package androidx.fragment.app;

import Bk.C2638a;
import a3.C4929c;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f3.AbstractC6409a;
import f3.C6412d;
import g.AbstractC6592d;
import g.AbstractC6595g;
import g.InterfaceC6590b;
import g.InterfaceC6591c;
import g.InterfaceC6599k;
import h.AbstractC6755a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p.InterfaceC8822a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC5392m implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.J, B0, InterfaceC5431s, M4.e, InterfaceC6591c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    G mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    z0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    G mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC5401w<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.L mLifecycleRegistry;
    AbstractC5434v.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0790m> mOnPreAttachedListeners;
    ComponentCallbacksC5392m mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC0790m mSavedStateAttachListener;
    M4.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    ComponentCallbacksC5392m mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    Y mViewLifecycleOwner;
    androidx.lifecycle.V<androidx.lifecycle.J> mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.fragment.app.m$a */
    final class a<I> extends AbstractC6592d<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f43124a;

        a(AtomicReference atomicReference) {
            this.f43124a = atomicReference;
        }

        @Override // g.AbstractC6592d
        public final void a(Object obj) {
            AbstractC6592d abstractC6592d = (AbstractC6592d) this.f43124a.get();
            if (abstractC6592d == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC6592d.a(obj);
        }

        @Override // g.AbstractC6592d
        public final void b() {
            AbstractC6592d abstractC6592d = (AbstractC6592d) this.f43124a.getAndSet(null);
            if (abstractC6592d != null) {
                abstractC6592d.b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacksC5392m.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    final class c extends AbstractC0790m {
        c() {
            super(0);
        }

        @Override // androidx.fragment.app.ComponentCallbacksC5392m.AbstractC0790m
        final void a() {
            ComponentCallbacksC5392m componentCallbacksC5392m = ComponentCallbacksC5392m.this;
            componentCallbacksC5392m.mSavedStateRegistryController.b();
            j0.b(componentCallbacksC5392m);
            Bundle bundle = componentCallbacksC5392m.mSavedFragmentState;
            componentCallbacksC5392m.mSavedStateRegistryController.c(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    /* loaded from: classes8.dex */
    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacksC5392m.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.m$e */
    /* loaded from: classes8.dex */
    final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f43128a;

        e(f0 f0Var) {
            this.f43128a = f0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0 f0Var = this.f43128a;
            if (f0Var.u()) {
                f0Var.l();
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$f */
    final class f extends AbstractC5398t {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final View b(int i11) {
            ComponentCallbacksC5392m componentCallbacksC5392m = ComponentCallbacksC5392m.this;
            View view = componentCallbacksC5392m.mView;
            if (view != null) {
                return view.findViewById(i11);
            }
            throw new IllegalStateException("Fragment " + componentCallbacksC5392m + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final boolean c() {
            return ComponentCallbacksC5392m.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.m$g */
    final class g implements androidx.lifecycle.G {
        g() {
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NonNull androidx.lifecycle.J j11, @NonNull AbstractC5434v.a aVar) {
            View view;
            if (aVar != AbstractC5434v.a.ON_STOP || (view = ComponentCallbacksC5392m.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.m$h */
    final class h implements InterfaceC8822a<Void, AbstractC6595g> {
        h() {
        }

        @Override // p.InterfaceC8822a
        public final AbstractC6595g apply(Void r32) {
            ComponentCallbacksC5392m componentCallbacksC5392m = ComponentCallbacksC5392m.this;
            Object obj = componentCallbacksC5392m.mHost;
            return obj instanceof InterfaceC6599k ? ((InterfaceC6599k) obj).getActivityResultRegistry() : componentCallbacksC5392m.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.m$i */
    /* loaded from: classes8.dex */
    final class i implements InterfaceC8822a<Void, AbstractC6595g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6595g f43132a;

        i(AbstractC6595g abstractC6595g) {
            this.f43132a = abstractC6595g;
        }

        @Override // p.InterfaceC8822a
        public final AbstractC6595g apply(Void r12) {
            return this.f43132a;
        }
    }

    /* renamed from: androidx.fragment.app.m$j */
    final class j extends AbstractC0790m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8822a f43133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f43134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6755a f43135c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6590b f43136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC8822a interfaceC8822a, AtomicReference atomicReference, AbstractC6755a abstractC6755a, InterfaceC6590b interfaceC6590b) {
            super(0);
            this.f43133a = interfaceC8822a;
            this.f43134b = atomicReference;
            this.f43135c = abstractC6755a;
            this.f43136d = interfaceC6590b;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC5392m.AbstractC0790m
        final void a() {
            ComponentCallbacksC5392m componentCallbacksC5392m = ComponentCallbacksC5392m.this;
            this.f43134b.set(((AbstractC6595g) this.f43133a.apply(null)).i(componentCallbacksC5392m.generateActivityResultKey(), componentCallbacksC5392m, this.f43135c, this.f43136d));
        }
    }

    /* renamed from: androidx.fragment.app.m$k */
    static class k {

        /* renamed from: a, reason: collision with root package name */
        boolean f43138a;

        /* renamed from: b, reason: collision with root package name */
        int f43139b;

        /* renamed from: c, reason: collision with root package name */
        int f43140c;

        /* renamed from: d, reason: collision with root package name */
        int f43141d;

        /* renamed from: e, reason: collision with root package name */
        int f43142e;

        /* renamed from: f, reason: collision with root package name */
        int f43143f;

        /* renamed from: g, reason: collision with root package name */
        ArrayList<String> f43144g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<String> f43145h;

        /* renamed from: i, reason: collision with root package name */
        Object f43146i;

        /* renamed from: j, reason: collision with root package name */
        Object f43147j;

        /* renamed from: k, reason: collision with root package name */
        Object f43148k;

        /* renamed from: l, reason: collision with root package name */
        Object f43149l;

        /* renamed from: m, reason: collision with root package name */
        Object f43150m;

        /* renamed from: n, reason: collision with root package name */
        Object f43151n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f43152o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f43153p;

        /* renamed from: q, reason: collision with root package name */
        androidx.core.app.u f43154q;

        /* renamed from: r, reason: collision with root package name */
        androidx.core.app.u f43155r;

        /* renamed from: s, reason: collision with root package name */
        float f43156s;

        /* renamed from: t, reason: collision with root package name */
        View f43157t;

        /* renamed from: u, reason: collision with root package name */
        boolean f43158u;
    }

    /* renamed from: androidx.fragment.app.m$l */
    /* loaded from: classes8.dex */
    public static class l extends RuntimeException {
        public l(@NonNull String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.m$m, reason: collision with other inner class name */
    private static abstract class AbstractC0790m {
        private AbstractC0790m() {
        }

        abstract void a();

        /* synthetic */ AbstractC0790m(int i11) {
            this();
        }
    }

    public ComponentCallbacksC5392m() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new H();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = AbstractC5434v.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.V<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.f43146i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.f43147j = obj;
            kVar.f43148k = null;
            kVar.f43149l = obj;
            kVar.f43150m = null;
            kVar.f43151n = obj;
            kVar.f43154q = null;
            kVar.f43155r = null;
            kVar.f43156s = 1.0f;
            kVar.f43157t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC5434v.b bVar = this.mMaxState;
        return (bVar == AbstractC5434v.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.L(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = new M4.d(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static ComponentCallbacksC5392m instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performCreateView$0() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> AbstractC6592d<I> prepareCallInternal(@NonNull AbstractC6755a<I, O> abstractC6755a, @NonNull InterfaceC8822a<Void, AbstractC6595g> interfaceC8822a, @NonNull InterfaceC6590b<O> interfaceC6590b) {
        if (this.mState > 1) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(interfaceC8822a, atomicReference, abstractC6755a, interfaceC6590b));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(@NonNull AbstractC0790m abstractC0790m) {
        if (this.mState >= 0) {
            abstractC0790m.a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0790m);
        }
    }

    void callStartTransitionListener(boolean z11) {
        ViewGroup viewGroup;
        G g10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f43158u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (g10 = this.mFragmentManager) == null) {
            return;
        }
        f0 s11 = f0.s(viewGroup, g10);
        s11.v();
        if (z11) {
            this.mHost.g().post(new e(s11));
        } else {
            s11.l();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    AbstractC5398t createFragmentContainer() {
        return new f();
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC5392m targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ProductContainerDTO.RATIO_DELIMITER);
        this.mChildFragmentManager.V(U7.d.e(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    ComponentCallbacksC5392m findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.h0(str);
    }

    @NonNull
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final r getActivity() {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w == null) {
            return null;
        }
        return (r) abstractC5401w.d();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f43153p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f43152o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final G getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w == null) {
            return null;
        }
        return abstractC5401w.e();
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NonNull
    public AbstractC6409a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && G.D0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C6412d c6412d = new C6412d(0);
        if (application != null) {
            c6412d.c(z0.a.f43418c, application);
        }
        c6412d.c(j0.f43329a, this);
        c6412d.c(j0.f43330b, this);
        if (getArguments() != null) {
            c6412d.c(j0.f43331c, getArguments());
        }
        return c6412d;
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NonNull
    public z0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && G.D0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new n0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f43139b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43146i;
    }

    androidx.core.app.u getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43154q;
    }

    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f43140c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43148k;
    }

    androidx.core.app.u getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43155r;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43157t;
    }

    @Deprecated
    public final G getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w == null) {
            return null;
        }
        return abstractC5401w.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.J
    @NonNull
    public AbstractC5434v getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f43143f;
    }

    public final ComponentCallbacksC5392m getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final G getParentFragmentManager() {
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " not associated with a fragment manager."));
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f43138a;
    }

    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f43141d;
    }

    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f43142e;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f43156s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f43149l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C4929c.f(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f43147j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // M4.e
    @NonNull
    public final M4.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.a();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f43150m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f43151n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f43144g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f43145h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i11) {
        return getResources().getString(i11);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ComponentCallbacksC5392m getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C4929c.g(this);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i11) {
        return getResources().getText(i11);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.J getViewLifecycleOwner() {
        Y y11 = this.mViewLifecycleOwner;
        if (y11 != null) {
            return y11;
        }
        throw new IllegalStateException(C2638a.d("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.P<androidx.lifecycle.J> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.B0
    @NonNull
    public A0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC5434v.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.y0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new H();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            ComponentCallbacksC5392m componentCallbacksC5392m = this.mParentFragment;
            g10.getClass();
            if (componentCallbacksC5392m == null ? false : componentCallbacksC5392m.isHidden()) {
                return true;
            }
        }
        return false;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            ComponentCallbacksC5392m componentCallbacksC5392m = this.mParentFragment;
            if (!(componentCallbacksC5392m == null ? true : componentCallbacksC5392m.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f43158u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            return false;
        }
        return g10.H0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.M0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (G.D0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i11 + " resultCode: " + i12 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        AbstractC5401w<?> abstractC5401w = this.mHost;
        Activity d11 = abstractC5401w == null ? null : abstractC5401w.d();
        if (d11 != null) {
            this.mCalled = false;
            onAttach(d11);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        G g10 = this.mChildFragmentManager;
        if (g10.f42892w >= 1) {
            return;
        }
        g10.B();
    }

    public Animation onCreateAnimation(int i11, boolean z11, int i12) {
        return null;
    }

    public Animator onCreateAnimator(int i11, boolean z11, int i12) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z11) {
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC5401w<?> abstractC5401w = this.mHost;
        Activity d11 = abstractC5401w == null ? null : abstractC5401w.d();
        if (d11 != null) {
            this.mCalled = false;
            onInflate(d11, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z11) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z11) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z11) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.M0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.x();
    }

    void performAttach() {
        Iterator<AbstractC0790m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.e());
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.H(this);
        this.mChildFragmentManager.y();
    }

    void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.A(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.M0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.h(AbstractC5434v.a.ON_CREATE);
    }

    boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z11 = true;
        }
        return this.mChildFragmentManager.C(menu, menuInflater) | z11;
    }

    void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.M0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new Y(this, getViewModelStore(), new RunnableC5391l(this, 0));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (G.D0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        C0.b(this.mView, this.mViewLifecycleOwner);
        D0.b(this.mView, this.mViewLifecycleOwner);
        M4.f.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.D();
        this.mLifecycleRegistry.h(AbstractC5434v.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.E();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().a(AbstractC5434v.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC5434v.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        androidx.loader.app.a.b(this).d();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.C0()) {
            return;
        }
        this.mChildFragmentManager.D();
        this.mChildFragmentManager = new H();
    }

    @NonNull
    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z11) {
        onMultiWindowModeChanged(z11);
    }

    boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.J(menuItem);
    }

    void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.K(menu);
    }

    void performPause() {
        this.mChildFragmentManager.M();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC5434v.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(AbstractC5434v.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    void performPictureInPictureModeChanged(boolean z11) {
        onPictureInPictureModeChanged(z11);
    }

    boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z11 = true;
        }
        return this.mChildFragmentManager.O(menu) | z11;
    }

    void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean G02 = G.G0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != G02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(G02);
            onPrimaryNavigationFragmentChanged(G02);
            this.mChildFragmentManager.P();
        }
    }

    void performResume() {
        this.mChildFragmentManager.M0();
        this.mChildFragmentManager.Z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.L l11 = this.mLifecycleRegistry;
        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
        l11.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Q();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.M0();
        this.mChildFragmentManager.Z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.L l11 = this.mLifecycleRegistry;
        AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
        l11.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.R();
    }

    void performStop() {
        this.mChildFragmentManager.T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC5434v.a.ON_STOP);
        }
        this.mLifecycleRegistry.h(AbstractC5434v.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.U();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f43158u = true;
    }

    @Override // g.InterfaceC6591c
    @NonNull
    public final <I, O> AbstractC6592d<I> registerForActivityResult(@NonNull AbstractC6755a<I, O> abstractC6755a, @NonNull InterfaceC6590b<O> interfaceC6590b) {
        return prepareCallInternal(abstractC6755a, new h(), interfaceC6590b);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i11) {
        if (this.mHost == null) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().I0(this, strArr, i11);
    }

    @NonNull
    public final r requireActivity() {
        r activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final G requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final ComponentCallbacksC5392m requireParentFragment() {
        ComponentCallbacksC5392m parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C2638a.d("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.f1(bundle);
        this.mChildFragmentManager.B();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new h0(C2638a.d("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC5434v.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z11) {
        ensureAnimationInfo().f43153p = Boolean.valueOf(z11);
    }

    public void setAllowReturnTransitionOverlap(boolean z11) {
        ensureAnimationInfo().f43152o = Boolean.valueOf(z11);
    }

    void setAnimations(int i11, int i12, int i13, int i14) {
        if (this.mAnimationInfo == null && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return;
        }
        ensureAnimationInfo().f43139b = i11;
        ensureAnimationInfo().f43140c = i12;
        ensureAnimationInfo().f43141d = i13;
        ensureAnimationInfo().f43142e = i14;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.u uVar) {
        ensureAnimationInfo().f43154q = uVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f43146i = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.u uVar) {
        ensureAnimationInfo().f43155r = uVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f43148k = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f43157t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z11) {
        if (this.mHasMenu != z11) {
            this.mHasMenu = z11;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.n();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f43159a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z11) {
        if (this.mMenuVisible != z11) {
            this.mMenuVisible = z11;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.n();
            }
        }
    }

    void setNextTransition(int i11) {
        if (this.mAnimationInfo == null && i11 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f43143f = i11;
    }

    void setPopDirection(boolean z11) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f43138a = z11;
    }

    void setPostOnViewCreatedAlpha(float f7) {
        ensureAnimationInfo().f43156s = f7;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f43149l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z11) {
        C4929c.i(this);
        this.mRetainInstance = z11;
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z11) {
            g10.l(this);
        } else {
            g10.c1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f43147j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f43150m = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f43144g = arrayList;
        kVar.f43145h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f43151n = obj;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        if (componentCallbacksC5392m != null) {
            C4929c.j(this, componentCallbacksC5392m, i11);
        }
        G g10 = this.mFragmentManager;
        G g11 = componentCallbacksC5392m != null ? componentCallbacksC5392m.mFragmentManager : null;
        if (g10 != null && g11 != null && g10 != g11) {
            throw new IllegalArgumentException(C2638a.d("Fragment ", componentCallbacksC5392m, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m; componentCallbacksC5392m2 != null; componentCallbacksC5392m2 = componentCallbacksC5392m2.getTargetFragment(false)) {
            if (componentCallbacksC5392m2.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC5392m + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC5392m == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC5392m.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC5392m;
        } else {
            this.mTargetWho = componentCallbacksC5392m.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i11;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z11) {
        C4929c.k(this, z11);
        if (!this.mUserVisibleHint && z11 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            G g10 = this.mFragmentManager;
            g10.O0(g10.v(this));
        }
        this.mUserVisibleHint = z11;
        this.mDeferStart = this.mState < 5 && !z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z11);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w != null) {
            return abstractC5401w.k(str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11) {
        startActivityForResult(intent, i11, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to Activity"));
        }
        if (G.D0(2)) {
            StringBuilder sb2 = new StringBuilder("Fragment ");
            sb2.append(this);
            sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb2.append(i11);
            sb2.append(" IntentSender: ");
            sb2.append(intentSender);
            sb2.append(" fillInIntent: ");
            sb2.append(intent);
            sb2.append(" options: ");
            bundle2 = bundle;
            sb2.append(bundle2);
            Log.v("FragmentManager", sb2.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().K0(this, intentSender, i11, intent, i12, i13, i14, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f43158u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f43158u = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.m$n */
    /* loaded from: classes8.dex */
    public static class n implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        final Bundle f43159a;

        /* renamed from: androidx.fragment.app.m$n$a */
        final class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new n[i11];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }
        }

        n(Bundle bundle) {
            this.f43159a = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeBundle(this.f43159a);
        }

        n(@NonNull Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f43159a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private ComponentCallbacksC5392m getTargetFragment(boolean z11) {
        String str;
        if (z11) {
            C4929c.h(this);
        }
        ComponentCallbacksC5392m componentCallbacksC5392m = this.mTarget;
        if (componentCallbacksC5392m != null) {
            return componentCallbacksC5392m;
        }
        G g10 = this.mFragmentManager;
        if (g10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return g10.d0(str);
    }

    @NonNull
    @Deprecated
    public static ComponentCallbacksC5392m instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            ComponentCallbacksC5392m newInstance = C5400v.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return newInstance;
            }
            bundle.setClassLoader(newInstance.getClass().getClassLoader());
            newInstance.setArguments(bundle);
            return newInstance;
        } catch (IllegalAccessException e11) {
            throw new l(B0.A0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (InstantiationException e12) {
            throw new l(B0.A0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e12);
        } catch (NoSuchMethodException e13) {
            throw new l(B0.A0.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e13);
        } catch (InvocationTargetException e14) {
            throw new l(B0.A0.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e14);
        }
    }

    @NonNull
    public final String getString(int i11, Object... objArr) {
        return getResources().getString(i11, objArr);
    }

    public final void postponeEnterTransition(long j11, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f43158u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            this.mPostponedHandler = g10.s0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j11));
    }

    @NonNull
    public final <I, O> AbstractC6592d<I> registerForActivityResult(@NonNull AbstractC6755a<I, O> abstractC6755a, @NonNull AbstractC6595g abstractC6595g, @NonNull InterfaceC6590b<O> interfaceC6590b) {
        return prepareCallInternal(abstractC6755a, new i(abstractC6595g), interfaceC6590b);
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w == null) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to Activity"));
        }
        abstractC5401w.l(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C2638a.d("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().J0(this, intent, i11, bundle);
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC5401w<?> abstractC5401w = this.mHost;
        if (abstractC5401w != null) {
            LayoutInflater j11 = abstractC5401w.j();
            j11.setFactory2(this.mChildFragmentManager.t0());
            return j11;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (G.D0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public ComponentCallbacksC5392m(int i11) {
        this();
        this.mContentLayoutId = i11;
    }
}
