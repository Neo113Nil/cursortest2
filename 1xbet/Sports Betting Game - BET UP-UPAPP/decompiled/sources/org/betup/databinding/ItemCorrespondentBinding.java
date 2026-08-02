package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemCorrespondentBinding implements ViewBinding {
    public final RoundedImageView avatarIcon;
    public final View bottomDivider;
    public final Group followControlGroup;
    public final View followIcon;
    public final TextView name;
    private final ConstraintLayout rootView;

    private ItemCorrespondentBinding(ConstraintLayout rootView, RoundedImageView avatarIcon, View bottomDivider, Group followControlGroup, View followIcon, TextView name) {
        this.rootView = rootView;
        this.avatarIcon = avatarIcon;
        this.bottomDivider = bottomDivider;
        this.followControlGroup = followControlGroup;
        this.followIcon = followIcon;
        this.name = name;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCorrespondentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemCorrespondentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_correspondent, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCorrespondentBinding bind(View rootView) {
        int i = R.id.avatarIcon;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
        if (roundedImageView != null) {
            i = R.id.bottomDivider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottomDivider);
            if (findChildViewById != null) {
                i = R.id.followControlGroup;
                Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.followControlGroup);
                if (group != null) {
                    i = R.id.followIcon;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.followIcon);
                    if (findChildViewById2 != null) {
                        i = R.id.name;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                        if (textView != null) {
                            return new ItemCorrespondentBinding((ConstraintLayout) rootView, roundedImageView, findChildViewById, group, findChildViewById2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
