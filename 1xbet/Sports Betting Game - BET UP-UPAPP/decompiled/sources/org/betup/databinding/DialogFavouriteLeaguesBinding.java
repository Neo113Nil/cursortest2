package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogFavouriteLeaguesBinding implements ViewBinding {
    public final Button cancelButton;
    public final Button confirmButton;
    public final ListView listView;
    public final ProgressBar progress;
    private final LinearLayout rootView;

    private DialogFavouriteLeaguesBinding(LinearLayout rootView, Button cancelButton, Button confirmButton, ListView listView, ProgressBar progress) {
        this.rootView = rootView;
        this.cancelButton = cancelButton;
        this.confirmButton = confirmButton;
        this.listView = listView;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogFavouriteLeaguesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogFavouriteLeaguesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_favourite_leagues, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFavouriteLeaguesBinding bind(View rootView) {
        int i = R.id.cancelButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.cancelButton);
        if (button != null) {
            i = R.id.confirmButton;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
            if (button2 != null) {
                i = R.id.listView;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.listView);
                if (listView != null) {
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                    if (progressBar != null) {
                        return new DialogFavouriteLeaguesBinding((LinearLayout) rootView, button, button2, listView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
