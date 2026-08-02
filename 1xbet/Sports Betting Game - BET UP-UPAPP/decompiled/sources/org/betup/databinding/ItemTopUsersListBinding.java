package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.RoiView;

/* loaded from: classes2.dex */
public final class ItemTopUsersListBinding implements ViewBinding {
    public final RoiView roiView;
    private final ConstraintLayout rootView;
    public final TextView topUsersListName;
    public final RoundedImageView topUsersListPhoto;
    public final TextView topUsersListRank;

    private ItemTopUsersListBinding(ConstraintLayout rootView, RoiView roiView, TextView topUsersListName, RoundedImageView topUsersListPhoto, TextView topUsersListRank) {
        this.rootView = rootView;
        this.roiView = roiView;
        this.topUsersListName = topUsersListName;
        this.topUsersListPhoto = topUsersListPhoto;
        this.topUsersListRank = topUsersListRank;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemTopUsersListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTopUsersListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_top_users_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTopUsersListBinding bind(View rootView) {
        int i = R.id.roiView;
        RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.roiView);
        if (roiView != null) {
            i = R.id.topUsersListName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.topUsersListName);
            if (textView != null) {
                i = R.id.topUsersListPhoto;
                RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.topUsersListPhoto);
                if (roundedImageView != null) {
                    i = R.id.topUsersListRank;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.topUsersListRank);
                    if (textView2 != null) {
                        return new ItemTopUsersListBinding((ConstraintLayout) rootView, roiView, textView, roundedImageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
