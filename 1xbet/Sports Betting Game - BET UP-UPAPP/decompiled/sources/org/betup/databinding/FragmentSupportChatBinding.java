package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentSupportChatBinding implements ViewBinding {
    public final RoundedImageView avatarIcon;
    public final TextView betupLogoText;
    public final View dividerTop;
    public final RecyclerView list;
    public final MessageTypeBoxBinding messageBox;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final ImageView statusIcon;
    public final TextView statusText;
    public final SwipyRefreshLayout swipeRefreshLayout;

    private FragmentSupportChatBinding(ConstraintLayout rootView, RoundedImageView avatarIcon, TextView betupLogoText, View dividerTop, RecyclerView list, MessageTypeBoxBinding messageBox, ProgressBar progress, ImageView statusIcon, TextView statusText, SwipyRefreshLayout swipeRefreshLayout) {
        this.rootView = rootView;
        this.avatarIcon = avatarIcon;
        this.betupLogoText = betupLogoText;
        this.dividerTop = dividerTop;
        this.list = list;
        this.messageBox = messageBox;
        this.progress = progress;
        this.statusIcon = statusIcon;
        this.statusText = statusText;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSupportChatBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSupportChatBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_support_chat, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSupportChatBinding bind(View rootView) {
        int i = R.id.avatarIcon;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
        if (roundedImageView != null) {
            i = R.id.betup_logo_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.betup_logo_text);
            if (textView != null) {
                i = R.id.dividerTop;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dividerTop);
                if (findChildViewById != null) {
                    i = R.id.list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.list);
                    if (recyclerView != null) {
                        i = R.id.message_box;
                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.message_box);
                        if (findChildViewById2 != null) {
                            MessageTypeBoxBinding bind = MessageTypeBoxBinding.bind(findChildViewById2);
                            i = R.id.progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
                            if (progressBar != null) {
                                i = R.id.statusIcon;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.statusIcon);
                                if (imageView != null) {
                                    i = R.id.statusText;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.statusText);
                                    if (textView2 != null) {
                                        i = R.id.swipeRefreshLayout;
                                        SwipyRefreshLayout swipyRefreshLayout = (SwipyRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.swipeRefreshLayout);
                                        if (swipyRefreshLayout != null) {
                                            return new FragmentSupportChatBinding((ConstraintLayout) rootView, roundedImageView, textView, findChildViewById, recyclerView, bind, progressBar, imageView, textView2, swipyRefreshLayout);
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
