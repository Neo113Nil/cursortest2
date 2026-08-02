package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemH2hTeamTitleBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView title;

    private ItemH2hTeamTitleBinding(TextView rootView, TextView title) {
        this.rootView = rootView;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static ItemH2hTeamTitleBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemH2hTeamTitleBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_h2h_team_title, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemH2hTeamTitleBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new ItemH2hTeamTitleBinding(textView, textView);
    }
}
