package androidx.fragment.app;

import M4.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ActivityC5043j;
import androidx.annotation.NonNull;
import androidx.core.app.b;
import androidx.core.view.InterfaceC5348w;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import f.InterfaceC6389b;
import g.AbstractC6595g;
import g.InterfaceC6599k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x2.InterfaceC10646a;

/* loaded from: classes.dex */
public class r extends ActivityC5043j implements b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.L mFragmentLifecycleRegistry;
    final C5399u mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends AbstractC5401w<r> implements androidx.core.content.c, androidx.core.content.d, androidx.core.app.o, androidx.core.app.p, B0, androidx.activity.M, InterfaceC6599k, M4.e, K, androidx.core.view.r {
        public a() {
            super(r.this);
        }

        @Override // androidx.fragment.app.K
        public final void a(@NonNull G g10, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
            r.this.onAttachFragment(componentCallbacksC5392m);
        }

        @Override // androidx.core.view.r
        public final void addMenuProvider(@NonNull InterfaceC5348w interfaceC5348w) {
            r.this.addMenuProvider(interfaceC5348w);
        }

        @Override // androidx.core.content.c
        public final void addOnConfigurationChangedListener(@NonNull InterfaceC10646a<Configuration> interfaceC10646a) {
            r.this.addOnConfigurationChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.app.o
        public final void addOnMultiWindowModeChangedListener(@NonNull InterfaceC10646a<androidx.core.app.i> interfaceC10646a) {
            r.this.addOnMultiWindowModeChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.app.p
        public final void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC10646a<androidx.core.app.r> interfaceC10646a) {
            r.this.addOnPictureInPictureModeChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.content.d
        public final void addOnTrimMemoryListener(@NonNull InterfaceC10646a<Integer> interfaceC10646a) {
            r.this.addOnTrimMemoryListener(interfaceC10646a);
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final View b(int i11) {
            return r.this.findViewById(i11);
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final boolean c() {
            Window window = r.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // g.InterfaceC6599k
        @NonNull
        public final AbstractC6595g getActivityResultRegistry() {
            return r.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.J
        @NonNull
        public final AbstractC5434v getLifecycle() {
            return r.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.M
        @NonNull
        public final androidx.activity.J getOnBackPressedDispatcher() {
            return r.this.getOnBackPressedDispatcher();
        }

        @Override // M4.e
        @NonNull
        public final M4.c getSavedStateRegistry() {
            return r.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.B0
        @NonNull
        public final A0 getViewModelStore() {
            return r.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC5401w
        public final void h(@NonNull PrintWriter printWriter, String[] strArr) {
            r.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC5401w
        public final r i() {
            return r.this;
        }

        @Override // androidx.fragment.app.AbstractC5401w
        @NonNull
        public final LayoutInflater j() {
            r rVar = r.this;
            return rVar.getLayoutInflater().cloneInContext(rVar);
        }

        @Override // androidx.fragment.app.AbstractC5401w
        public final boolean k(@NonNull String str) {
            return androidx.core.app.b.h(r.this, str);
        }

        @Override // androidx.fragment.app.AbstractC5401w
        public final void n() {
            r.this.invalidateMenu();
        }

        @Override // androidx.core.view.r
        public final void removeMenuProvider(@NonNull InterfaceC5348w interfaceC5348w) {
            r.this.removeMenuProvider(interfaceC5348w);
        }

        @Override // androidx.core.content.c
        public final void removeOnConfigurationChangedListener(@NonNull InterfaceC10646a<Configuration> interfaceC10646a) {
            r.this.removeOnConfigurationChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.app.o
        public final void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC10646a<androidx.core.app.i> interfaceC10646a) {
            r.this.removeOnMultiWindowModeChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.app.p
        public final void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC10646a<androidx.core.app.r> interfaceC10646a) {
            r.this.removeOnPictureInPictureModeChangedListener(interfaceC10646a);
        }

        @Override // androidx.core.content.d
        public final void removeOnTrimMemoryListener(@NonNull InterfaceC10646a<Integer> interfaceC10646a) {
            r.this.removeOnTrimMemoryListener(interfaceC10646a);
        }
    }

    public r() {
        this.mFragments = C5399u.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.L(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().g(LIFECYCLE_TAG, new c.b() { // from class: androidx.fragment.app.n
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle lambda$init$0;
                lambda$init$0 = r.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new InterfaceC10646a() { // from class: androidx.fragment.app.o
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                r.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC10646a() { // from class: androidx.fragment.app.p
            @Override // x2.InterfaceC10646a
            public final void accept(Object obj) {
                r.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC6389b() { // from class: androidx.fragment.app.q
            @Override // f.InterfaceC6389b
            public final void a(ActivityC5043j activityC5043j) {
                r.this.lambda$init$3(activityC5043j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a();
    }

    private static boolean markState(G g10, AbstractC5434v.b bVar) {
        boolean z11 = false;
        for (ComponentCallbacksC5392m componentCallbacksC5392m : g10.r0()) {
            if (componentCallbacksC5392m != null) {
                if (componentCallbacksC5392m.getHost() != null) {
                    z11 |= markState(componentCallbacksC5392m.getChildFragmentManager(), bVar);
                }
                Y y11 = componentCallbacksC5392m.mViewLifecycleOwner;
                if (y11 != null && y11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    componentCallbacksC5392m.mViewLifecycleOwner.f(bVar);
                    z11 = true;
                }
                if (componentCallbacksC5392m.mLifecycleRegistry.b().a(AbstractC5434v.b.STARTED)) {
                    componentCallbacksC5392m.mLifecycleRegistry.j(bVar);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().V(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public G getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC5434v.b.CREATED)) {
        }
    }

    public G n() {
        return getSupportFragmentManager();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onActivityResult(int i11, int i12, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i11, i12, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_DESTROY);
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(AbstractC5434v.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.u uVar) {
        androidx.core.app.b.f(this, uVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.u uVar) {
        androidx.core.app.b.g(this, uVar);
    }

    public void startActivityFromFragment(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Intent intent, int i11) {
        startActivityFromFragment(componentCallbacksC5392m, intent, i11, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (i11 == -1) {
            androidx.core.app.b.j(this, intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            componentCallbacksC5392m.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.b(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.c(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.k(this);
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i11) {
    }

    public void startActivityFromFragment(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.app.b.i(this, intent, -1, bundle);
        } else {
            componentCallbacksC5392m.startActivityForResult(intent, i11, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public r(int i11) {
        super(i11);
        this.mFragments = C5399u.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.L(this);
        this.mStopped = true;
        init();
    }
}
