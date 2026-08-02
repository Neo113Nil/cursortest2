package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class s extends Dialog implements androidx.lifecycle.J, M, M4.e {
    private androidx.lifecycle.L _lifecycleRegistry;

    @NotNull
    private final J onBackPressedDispatcher;

    @NotNull
    private final M4.d savedStateRegistryController;

    public /* synthetic */ s(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 0 : i11);
    }

    private final androidx.lifecycle.L getLifecycleRegistry() {
        androidx.lifecycle.L l11 = this._lifecycleRegistry;
        if (l11 != null) {
            return l11;
        }
        androidx.lifecycle.L l12 = new androidx.lifecycle.L(this);
        this._lifecycleRegistry = l12;
        return l12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(s this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.M
    @NotNull
    public final J getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // M4.e
    @NotNull
    public M4.c getSavedStateRegistry() {
        return this.savedStateRegistryController.a();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.f(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        C0.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.f(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Q.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.f(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        M4.f.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            J j11 = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            j11.m(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.c(bundle);
        getLifecycleRegistry().h(AbstractC5434v.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.d(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getLifecycleRegistry().h(AbstractC5434v.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        getLifecycleRegistry().h(AbstractC5434v.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        super.setContentView(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull Context context, int i11) {
        super(context, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.savedStateRegistryController = new M4.d(this);
        this.onBackPressedDispatcher = new J(new r(this, 0));
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
