package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ViewToolbarBinding implements ViewBinding {
    public final ComposeView appTopHeaderCv;
    private final Toolbar rootView;
    public final Toolbar toolbar;

    private ViewToolbarBinding(Toolbar rootView, ComposeView appTopHeaderCv, Toolbar toolbar) {
        this.rootView = rootView;
        this.appTopHeaderCv = appTopHeaderCv;
        this.toolbar = toolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Toolbar getRoot() {
        return this.rootView;
    }

    public static ViewToolbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ViewToolbarBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.view_toolbar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewToolbarBinding bind(View rootView) {
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(rootView, R.id.app_top_header_cv);
        if (composeView != null) {
            Toolbar toolbar = (Toolbar) rootView;
            return new ViewToolbarBinding(toolbar, composeView, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.app_top_header_cv)));
    }
}
