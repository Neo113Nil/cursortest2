package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final ComposeView homeComposeRoot;
    private final ComposeView rootView;

    private FragmentHomeBinding(ComposeView rootView, ComposeView homeComposeRoot) {
        this.rootView = rootView;
        this.homeComposeRoot = homeComposeRoot;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_home, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHomeBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) rootView;
        return new FragmentHomeBinding(composeView, composeView);
    }
}
