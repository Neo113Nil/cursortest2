package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.fragment.app.G.r;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC5390k extends ComponentCallbacksC5392m implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.W<androidx.lifecycle.J> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.k$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = DialogInterfaceOnCancelListenerC5390k.this;
            dialogInterfaceOnCancelListenerC5390k.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC5390k.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    final class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = DialogInterfaceOnCancelListenerC5390k.this;
            if (dialogInterfaceOnCancelListenerC5390k.mDialog != null) {
                dialogInterfaceOnCancelListenerC5390k.onCancel(dialogInterfaceOnCancelListenerC5390k.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$c */
    final class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = DialogInterfaceOnCancelListenerC5390k.this;
            if (dialogInterfaceOnCancelListenerC5390k.mDialog != null) {
                dialogInterfaceOnCancelListenerC5390k.onDismiss(dialogInterfaceOnCancelListenerC5390k.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$d */
    final class d implements androidx.lifecycle.W<androidx.lifecycle.J> {
        d() {
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(androidx.lifecycle.J j11) {
            if (j11 != null) {
                DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = DialogInterfaceOnCancelListenerC5390k.this;
                if (dialogInterfaceOnCancelListenerC5390k.mShowsDialog) {
                    View requireView = dialogInterfaceOnCancelListenerC5390k.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC5390k.mDialog != null) {
                        if (G.D0(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC5390k.mDialog);
                        }
                        dialogInterfaceOnCancelListenerC5390k.mDialog.setContentView(requireView);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$e */
    final class e extends AbstractC5398t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5398t f43120a;

        e(AbstractC5398t abstractC5398t) {
            this.f43120a = abstractC5398t;
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final View b(int i11) {
            AbstractC5398t abstractC5398t = this.f43120a;
            return abstractC5398t.c() ? abstractC5398t.b(i11) : DialogInterfaceOnCancelListenerC5390k.this.onFindViewById(i11);
        }

        @Override // androidx.fragment.app.AbstractC5398t
        public final boolean c() {
            return this.f43120a.c() || DialogInterfaceOnCancelListenerC5390k.this.onHasView();
        }
    }

    public DialogInterfaceOnCancelListenerC5390k() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z11, boolean z12, boolean z13) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z12) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z13) {
                getParentFragmentManager().R0(this.mBackStackId, 1);
            } else {
                G parentFragmentManager = getParentFragmentManager();
                int i11 = this.mBackStackId;
                parentFragmentManager.getClass();
                if (i11 < 0) {
                    throw new IllegalArgumentException(Ej.b.a(i11, "Bad id: "));
                }
                parentFragmentManager.X(parentFragmentManager.new r(null, i11, 1), z11);
            }
            this.mBackStackId = -1;
            return;
        }
        G parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C5380a c5380a = new C5380a(parentFragmentManager2);
        c5380a.f42978p = true;
        c5380a.q(this);
        if (z13) {
            c5380a.k();
        } else if (z11) {
            c5380a.B(true, true);
        } else {
            c5380a.i();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th2) {
                this.mCreatingDialog = false;
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NonNull
    AbstractC5398t createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (G.D0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.s(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (G.D0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true, false);
    }

    View onFindViewById(int i11) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i11);
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (G.D0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (G.D0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i11 = this.mStyle;
        if (i11 != 0) {
            bundle.putInt(SAVED_STYLE, i11);
        }
        int i12 = this.mTheme;
        if (i12 != 0) {
            bundle.putInt(SAVED_THEME, i12);
        }
        boolean z11 = this.mCancelable;
        if (!z11) {
            bundle.putBoolean(SAVED_CANCELABLE, z11);
        }
        boolean z12 = this.mShowsDialog;
        if (!z12) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z12);
        }
        int i13 = this.mBackStackId;
        if (i13 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i13);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            C0.b(decorView, this);
            D0.b(decorView, this);
            M4.f.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @NonNull
    public final androidx.activity.s requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof androidx.activity.s) {
            return (androidx.activity.s) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z11) {
        this.mCancelable = z11;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z11);
        }
    }

    public void setShowsDialog(boolean z11) {
        this.mShowsDialog = z11;
    }

    public void setStyle(int i11, int i12) {
        if (G.D0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i11 + ", " + i12);
        }
        this.mStyle = i11;
        if (i11 == 2 || i11 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i12 != 0) {
            this.mTheme = i12;
        }
    }

    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@NonNull G g10, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        g10.getClass();
        C5380a c5380a = new C5380a(g10);
        c5380a.f42978p = true;
        c5380a.n(0, this, str, 1);
        c5380a.i();
    }

    public void showNow(@NonNull G g10, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        g10.getClass();
        C5380a c5380a = new C5380a(g10);
        c5380a.f42978p = true;
        c5380a.n(0, this, str, 1);
        c5380a.k();
    }

    public int show(@NonNull Q q11, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        q11.n(0, this, str, 1);
        this.mViewDestroyed = false;
        int i11 = q11.i();
        this.mBackStackId = i11;
        return i11;
    }

    public DialogInterfaceOnCancelListenerC5390k(int i11) {
        super(i11);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
