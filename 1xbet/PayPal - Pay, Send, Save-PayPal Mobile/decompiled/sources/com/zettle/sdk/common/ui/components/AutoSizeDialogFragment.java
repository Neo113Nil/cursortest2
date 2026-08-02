package com.zettle.sdk.common.ui.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00148GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/common/ui/components/AutoSizeDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "getTheme", "()I", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isLargeScreen$delegate", "Lkotlin/Lazy;", "isLargeScreen", "()Z", "getMergeLayoutRes", "mergeLayoutRes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AutoSizeDialogFragment extends androidx.fragment.app.DialogFragment {

    /* renamed from: isLargeScreen$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy isLargeScreen = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.zettle.sdk.common.ui.components.AutoSizeDialogFragment$isLargeScreen$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(com.zettle.sdk.common.ui.components.AutoSizeDialogFragment.this.requireContext().getResources().getBoolean(com.zettle.sdk.common.ui.R.bool.screen_size_large));
        }

        {
            super(0);
        }
    });

    protected abstract int getMergeLayoutRes();

    public AutoSizeDialogFragment() {
        setStyle(2, 0);
    }

    public final boolean isLargeScreen() {
        return ((java.lang.Boolean) this.isLargeScreen.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return isLargeScreen() ? com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Floating_Light : com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Fullscreen;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        android.view.View inflate = inflater.inflate(com.zettle.sdk.common.ui.R.layout.sdk_dialog_auto_size, container, false);
        if (inflate == null) {
            return null;
        }
        int mergeLayoutRes = getMergeLayoutRes();
        android.view.View findViewById = inflate.findViewById(com.zettle.sdk.common.ui.R.id.contentViewGroup);
        kotlin.jvm.internal.Intrinsics.checkNotNull(findViewById);
        inflater.inflate(mergeLayoutRes, (android.view.ViewGroup) findViewById, true);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.Window window2;
        super.onActivityCreated(bundle);
        android.view.WindowManager.LayoutParams layoutParams = null;
        if (isLargeScreen()) {
            android.app.Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                layoutParams = window2.getAttributes();
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Fade_Animation;
                return;
            }
            return;
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams == null) {
            return;
        }
        layoutParams.windowAnimations = com.zettle.sdk.common.ui.R.style.DialogComponent_Otto_Slide_Bottom_Animation;
    }
}
