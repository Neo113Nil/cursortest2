package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class SearchViewLayoutBinding implements ViewBinding {
    public final ImageView cancelButton;
    private final RelativeLayout rootView;
    public final ImageView searchButton;
    public final EditText searchField;

    private SearchViewLayoutBinding(RelativeLayout rootView, ImageView cancelButton, ImageView searchButton, EditText searchField) {
        this.rootView = rootView;
        this.cancelButton = cancelButton;
        this.searchButton = searchButton;
        this.searchField = searchField;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static SearchViewLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SearchViewLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.search_view_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SearchViewLayoutBinding bind(View rootView) {
        int i = R.id.cancel_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cancel_button);
        if (imageView != null) {
            i = R.id.search_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_button);
            if (imageView2 != null) {
                i = R.id.search_field;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_field);
                if (editText != null) {
                    return new SearchViewLayoutBinding((RelativeLayout) rootView, imageView, imageView2, editText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
