package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentFansSectorBinding implements ViewBinding {
    public final ImageView betIcon;
    public final TextView bets;
    public final ImageView commentIcon;
    public final TextView comments;
    public final LinearLayout commentsContainer;
    public final ImageView email;
    public final ImageView facebook;
    public final LinearLayout header;
    public final ImageView imageView22;
    public final ImageView likeIcon;
    public final TextView likes;
    public final LinearLayout likesContainer;
    public final LinearLayout linearLayout2;
    public final LinearLayout linearLayout3;
    public final TextView reposts;
    private final ConstraintLayout rootView;
    public final TextView views;
    public final ImageView viewsSmall;
    public final ImageView vk;

    private FragmentFansSectorBinding(ConstraintLayout rootView, ImageView betIcon, TextView bets, ImageView commentIcon, TextView comments, LinearLayout commentsContainer, ImageView email, ImageView facebook, LinearLayout header, ImageView imageView22, ImageView likeIcon, TextView likes, LinearLayout likesContainer, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView reposts, TextView views, ImageView viewsSmall, ImageView vk) {
        this.rootView = rootView;
        this.betIcon = betIcon;
        this.bets = bets;
        this.commentIcon = commentIcon;
        this.comments = comments;
        this.commentsContainer = commentsContainer;
        this.email = email;
        this.facebook = facebook;
        this.header = header;
        this.imageView22 = imageView22;
        this.likeIcon = likeIcon;
        this.likes = likes;
        this.likesContainer = likesContainer;
        this.linearLayout2 = linearLayout2;
        this.linearLayout3 = linearLayout3;
        this.reposts = reposts;
        this.views = views;
        this.viewsSmall = viewsSmall;
        this.vk = vk;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFansSectorBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFansSectorBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_fans_sector, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFansSectorBinding bind(View rootView) {
        int i = R.id.betIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.betIcon);
        if (imageView != null) {
            i = R.id.bets;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bets);
            if (textView != null) {
                i = R.id.commentIcon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.commentIcon);
                if (imageView2 != null) {
                    i = R.id.comments;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.comments);
                    if (textView2 != null) {
                        i = R.id.commentsContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.commentsContainer);
                        if (linearLayout != null) {
                            i = R.id.email;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.email);
                            if (imageView3 != null) {
                                i = R.id.facebook;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.facebook);
                                if (imageView4 != null) {
                                    i = R.id.header;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                                    if (linearLayout2 != null) {
                                        i = R.id.imageView22;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView22);
                                        if (imageView5 != null) {
                                            i = R.id.likeIcon;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.likeIcon);
                                            if (imageView6 != null) {
                                                i = R.id.likes;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.likes);
                                                if (textView3 != null) {
                                                    i = R.id.likesContainer;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.likesContainer);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.linearLayout2;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout2);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.linearLayout3;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearLayout3);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.reposts;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reposts);
                                                                if (textView4 != null) {
                                                                    i = R.id.views;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.views);
                                                                    if (textView5 != null) {
                                                                        i = R.id.viewsSmall;
                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.viewsSmall);
                                                                        if (imageView7 != null) {
                                                                            i = R.id.vk;
                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vk);
                                                                            if (imageView8 != null) {
                                                                                return new FragmentFansSectorBinding((ConstraintLayout) rootView, imageView, textView, imageView2, textView2, linearLayout, imageView3, imageView4, linearLayout2, imageView5, imageView6, textView3, linearLayout3, linearLayout4, linearLayout5, textView4, textView5, imageView7, imageView8);
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
