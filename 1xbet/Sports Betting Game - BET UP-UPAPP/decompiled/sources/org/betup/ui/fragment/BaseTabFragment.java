package org.betup.ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import org.betup.utils.ActivitySavedStateGuard;

/* loaded from: classes4.dex */
public class BaseTabFragment extends Fragment {
    private Unbinder unbinder;

    public void bindView(View view) {
        this.unbinder = ButterKnife.bind(this, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.unbinder;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.unbinder = null;
    }

    public boolean isActive() {
        return isAdded() && this.unbinder != null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ActivitySavedStateGuard.stripNestedViewStatesPublic(outState);
    }
}
