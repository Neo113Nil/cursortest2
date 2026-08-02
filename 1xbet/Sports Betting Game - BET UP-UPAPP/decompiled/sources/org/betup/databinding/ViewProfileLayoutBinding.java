package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.RoiView;

/* loaded from: classes2.dex */
public final class ViewProfileLayoutBinding implements ViewBinding {
    public final ImageView achievementsButton;
    public final RoundedImageView avatarIcon;
    public final ImageView chatsButton;
    public final TextView eventsDrawerCount;
    public final LinearLayout header;
    public final TextView messagesCount;
    public final ImageView moneyButton;
    public final TextView name;
    public final ImageView notificationsButton;
    public final RoiView roiView;
    private final LinearLayout rootView;

    private ViewProfileLayoutBinding(LinearLayout rootView, ImageView achievementsButton, RoundedImageView avatarIcon, ImageView chatsButton, TextView eventsDrawerCount, LinearLayout header, TextView messagesCount, ImageView moneyButton, TextView name, ImageView notificationsButton, RoiView roiView) {
        this.rootView = rootView;
        this.achievementsButton = achievementsButton;
        this.avatarIcon = avatarIcon;
        this.chatsButton = chatsButton;
        this.eventsDrawerCount = eventsDrawerCount;
        this.header = header;
        this.messagesCount = messagesCount;
        this.moneyButton = moneyButton;
        this.name = name;
        this.notificationsButton = notificationsButton;
        this.roiView = roiView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ViewProfileLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ViewProfileLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.view_profile_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewProfileLayoutBinding bind(View rootView) {
        int i = R.id.achievementsButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.achievementsButton);
        if (imageView != null) {
            i = R.id.avatarIcon;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
            if (roundedImageView != null) {
                i = R.id.chatsButton;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.chatsButton);
                if (imageView2 != null) {
                    i = R.id.eventsDrawerCount;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.eventsDrawerCount);
                    if (textView != null) {
                        i = R.id.header;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                        if (linearLayout != null) {
                            i = R.id.messagesCount;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.messagesCount);
                            if (textView2 != null) {
                                i = R.id.moneyButton;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.moneyButton);
                                if (imageView3 != null) {
                                    i = R.id.name;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                                    if (textView3 != null) {
                                        i = R.id.notificationsButton;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.notificationsButton);
                                        if (imageView4 != null) {
                                            i = R.id.roiView;
                                            RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.roiView);
                                            if (roiView != null) {
                                                return new ViewProfileLayoutBinding((LinearLayout) rootView, imageView, roundedImageView, imageView2, textView, linearLayout, textView2, imageView3, textView3, imageView4, roiView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
