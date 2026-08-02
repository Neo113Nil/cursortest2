package org.betup.ui.base;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/* loaded from: classes2.dex */
public abstract class BaseDialogFragment extends DialogFragment {
    protected Unbinder unbinder;

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.unbinder;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.unbinder = null;
    }

    protected void bindView(View view) {
        this.unbinder = ButterKnife.bind(this, view);
    }

    public boolean isActive() {
        return isAdded() && this.unbinder != null;
    }
}
