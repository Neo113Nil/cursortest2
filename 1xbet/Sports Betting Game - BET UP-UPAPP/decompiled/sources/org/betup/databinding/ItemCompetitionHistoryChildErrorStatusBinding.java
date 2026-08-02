package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCompetitionHistoryChildErrorStatusBinding implements ViewBinding {
    public final TextView infoButton;
    private final LinearLayout rootView;
    public final TextView statusMessage;

    private ItemCompetitionHistoryChildErrorStatusBinding(LinearLayout rootView, TextView infoButton, TextView statusMessage) {
        this.rootView = rootView;
        this.infoButton = infoButton;
        this.statusMessage = statusMessage;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemCompetitionHistoryChildErrorStatusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCompetitionHistoryChildErrorStatusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_competition_history_child_error_status, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCompetitionHistoryChildErrorStatusBinding bind(View rootView) {
        int i = R.id.info_button;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.info_button);
        if (textView != null) {
            i = R.id.status_message;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.status_message);
            if (textView2 != null) {
                return new ItemCompetitionHistoryChildErrorStatusBinding((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
