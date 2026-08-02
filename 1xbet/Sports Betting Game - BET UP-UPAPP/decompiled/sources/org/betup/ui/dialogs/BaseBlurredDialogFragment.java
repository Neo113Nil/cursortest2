package org.betup.ui.dialogs;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import org.betup.R;
import org.betup.utils.DialogUtil;

/* loaded from: classes2.dex */
public abstract class BaseBlurredDialogFragment extends DialogFragment {
    private BitmapDrawable background;
    private Unbinder unbinder;

    protected abstract int getLayoutId();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow().getAttributes().windowAnimations = R.style.BlurredDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.unbinder = ButterKnife.bind(this, view);
        final View activityRootView = DialogUtil.getActivityRootView(getActivity());
        if (activityRootView == null) {
            return;
        }
        if (activityRootView.getWidth() == 0) {
            activityRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.dialogs.BaseBlurredDialogFragment.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Window window;
                    activityRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    FragmentActivity activity = BaseBlurredDialogFragment.this.getActivity();
                    if (activity == null || (window = BaseBlurredDialogFragment.this.getDialog().getWindow()) == null) {
                        return;
                    }
                    BaseBlurredDialogFragment baseBlurredDialogFragment = BaseBlurredDialogFragment.this;
                    BitmapDrawable createBlurredBackground = DialogUtil.createBlurredBackground(activity);
                    baseBlurredDialogFragment.background = createBlurredBackground;
                    window.setBackgroundDrawable(createBlurredBackground);
                }
            });
            return;
        }
        Window window = getDialog().getWindow();
        if (window != null) {
            BitmapDrawable createBlurredBackground = DialogUtil.createBlurredBackground(getActivity());
            this.background = createBlurredBackground;
            window.setBackgroundDrawable(createBlurredBackground);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.unbinder;
        if (unbinder != null) {
            unbinder.unbind();
            this.unbinder = null;
        }
        BitmapDrawable bitmapDrawable = this.background;
        if (bitmapDrawable != null) {
            bitmapDrawable.getBitmap().recycle();
        }
    }

    public boolean isActive() {
        return isAdded() && this.unbinder != null;
    }
}
