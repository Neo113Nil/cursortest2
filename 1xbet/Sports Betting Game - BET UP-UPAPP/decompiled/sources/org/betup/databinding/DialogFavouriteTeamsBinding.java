package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogFavouriteTeamsBinding implements ViewBinding {
    public final Button cancelButton;
    public final Button confirmButton;
    public final TextView label;
    public final ListView listView;
    public final ProgressBar progress;
    private final LinearLayout rootView;

    private DialogFavouriteTeamsBinding(LinearLayout rootView, Button cancelButton, Button confirmButton, TextView label, ListView listView, ProgressBar progress) {
        this.rootView = rootView;
        this.cancelButton = cancelButton;
        this.confirmButton = confirmButton;
        this.label = label;
        this.listView = listView;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogFavouriteTeamsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogFavouriteTeamsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_favourite_teams, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFavouriteTeamsBinding bind(View rootView) {
        int i = R.id.cancelButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.cancelButton);
        if (button != null) {
            i = R.id.confirmButton;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
            if (button2 != null) {
                i = R.id.label;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.label);
                if (textView != null) {
                    i = R.id.listView;
                    ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.listView);
                    if (listView != null) {
                        i = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                        if (progressBar != null) {
                            return new DialogFavouriteTeamsBinding((LinearLayout) rootView, button, button2, textView, listView, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
