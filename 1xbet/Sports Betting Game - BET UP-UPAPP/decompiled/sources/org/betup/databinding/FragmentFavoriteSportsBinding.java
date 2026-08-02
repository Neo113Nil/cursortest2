package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentFavoriteSportsBinding implements ViewBinding {
    public final FloatingActionButton fab;
    public final TextView favCount;
    public final ListView list;
    public final RelativeLayout progress;
    private final RelativeLayout rootView;
    public final TextView save;

    private FragmentFavoriteSportsBinding(RelativeLayout rootView, FloatingActionButton fab, TextView favCount, ListView list, RelativeLayout progress, TextView save) {
        this.rootView = rootView;
        this.fab = fab;
        this.favCount = favCount;
        this.list = list;
        this.progress = progress;
        this.save = save;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFavoriteSportsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFavoriteSportsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_favorite_sports, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFavoriteSportsBinding bind(View rootView) {
        int i = R.id.fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.fab);
        if (floatingActionButton != null) {
            i = R.id.favCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.favCount);
            if (textView != null) {
                i = R.id.list;
                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list);
                if (listView != null) {
                    i = R.id.progress;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.progress);
                    if (relativeLayout != null) {
                        i = R.id.save;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.save);
                        if (textView2 != null) {
                            return new FragmentFavoriteSportsBinding((RelativeLayout) rootView, floatingActionButton, textView, listView, relativeLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
