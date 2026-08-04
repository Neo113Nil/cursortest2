package androidx.fragment.app;

import F.AbstractC0205a;
import F.InterfaceC0209e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.EnumC0719n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends androidx.activity.o implements InterfaceC0209e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final D mFragments = new D(new C0705z(this));
    final C0726v mFragmentLifecycleRegistry = new C0726v(this);
    boolean mStopped = true;

    public A() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0702w(this, 0));
        final int i7 = 0;
        addOnConfigurationChangedListener(new O.a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A f9549b;

            {
                this.f9549b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        this.f9549b.mFragments.a();
                        break;
                    default:
                        this.f9549b.mFragments.a();
                        break;
                }
            }
        });
        final int i8 = 1;
        addOnNewIntentListener(new O.a(this) { // from class: androidx.fragment.app.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A f9549b;

            {
                this.f9549b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        this.f9549b.mFragments.a();
                        break;
                    default:
                        this.f9549b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new p029e.b() { // from class: androidx.fragment.app.y
            @Override // p029e.b
            public final void a(androidx.activity.o oVar) {
                C0705z c0705z = this.f9550a.mFragments.f9322a;
                c0705z.f9554d.b(c0705z, c0705z, null);
            }
        });
    }

    public static boolean c(Q q7) {
        boolean zC = false;
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : q7.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                C0705z c0705z = abstractComponentCallbacksC0701v.f9514K;
                if ((c0705z == null ? null : c0705z.f9555e) != null) {
                    zC |= c(abstractComponentCallbacksC0701v.g());
                }
                if (abstractComponentCallbacksC0701v.f9536d0.f9637c.compareTo(EnumC0719n.f9629d) >= 0) {
                    abstractComponentCallbacksC0701v.f9536d0.g();
                    zC = true;
                }
            }
        }
        return zC;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f9322a.f9554d.f9388f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
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
                p095n0.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f9322a.f9554d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public Q getSupportFragmentManager() {
        return this.mFragments.f9322a.f9554d;
    }

    @Deprecated
    public p095n0.a getSupportLoaderManager() {
        return p095n0.a.a(this);
    }

    public void markFragmentsCreated() {
        while (c(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i7, i8, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
    }

    @Override // androidx.activity.o, F.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_CREATE);
        S s7 = this.mFragments.f9322a.f9554d;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f9322a.f9554d.l();
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_DESTROY);
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.mFragments.f9322a.f9554d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f9322a.f9554d.u(5);
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f9322a.f9554d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_RESUME);
        S s7 = this.mFragments.f9322a.f9554d;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            S s7 = this.mFragments.f9322a.f9554d;
            s7.f9374G = false;
            s7.f9375H = false;
            s7.f9381N.f9413i = false;
            s7.u(4);
        }
        this.mFragments.f9322a.f9554d.A(true);
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_START);
        S s8 = this.mFragments.f9322a.f9554d;
        s8.f9374G = false;
        s8.f9375H = false;
        s8.f9381N.f9413i = false;
        s8.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        S s7 = this.mFragments.f9322a.f9554d;
        s7.f9375H = true;
        s7.f9381N.f9413i = true;
        s7.u(4);
        this.mFragmentLifecycleRegistry.e(EnumC0718m.ON_STOP);
    }

    public void setEnterSharedElementCallback(F.J j) {
        AbstractC0205a.c(this, null);
    }

    public void setExitSharedElementCallback(F.J j) {
        AbstractC0205a.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, Intent intent, int i7, Bundle bundle) {
        if (i7 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            abstractComponentCallbacksC0701v.D(intent, i7, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        Intent intent2 = intent;
        if (i7 == -1) {
            startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
            return;
        }
        if (abstractComponentCallbacksC0701v.f9514K == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0701v + " not attached to Activity");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0701v + " received the following in startIntentSenderForResult() requestCode: " + i7 + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        Q qI = abstractComponentCallbacksC0701v.i();
        if (qI.f9370C == null) {
            C0705z c0705z = qI.f9403v;
            c0705z.getClass();
            t6.h.e(intentSender, "intent");
            if (i7 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            A a2 = c0705z.f9551a;
            if (a2 == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            a2.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0701v);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        t6.h.e(intentSender, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i8, i9);
        qI.f9372E.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC0701v.f9537e, i7));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0701v + "is launching an IntentSender for result ");
        }
        qI.f9370C.a(intentSenderRequest);
    }

    public void supportFinishAfterTransition() {
        AbstractC0205a.a(this);
    }

    public void supportPostponeEnterTransition() {
        AbstractC0205a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0205a.e(this);
    }

    @Override // F.InterfaceC0209e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i7) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, Intent intent, int i7) {
        startActivityFromFragment(abstractComponentCallbacksC0701v, intent, i7, (Bundle) null);
    }
}
