package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class NotificationMatchItemBinding implements ViewBinding {
    public final ImageView finish;
    public final TextView firstTeamName;
    public final LinearLayout header;
    public final ImageView likeIcon;
    public final TextView matchDate;
    public final TextView matchTime;
    public final ImageView remove;
    private final RelativeLayout rootView;
    public final ImageView score;
    public final ImageView secondTeamIcon;
    public final TextView secondTeamName;
    public final ImageView start;

    private NotificationMatchItemBinding(RelativeLayout rootView, ImageView finish, TextView firstTeamName, LinearLayout header, ImageView likeIcon, TextView matchDate, TextView matchTime, ImageView remove, ImageView score, ImageView secondTeamIcon, TextView secondTeamName, ImageView start) {
        this.rootView = rootView;
        this.finish = finish;
        this.firstTeamName = firstTeamName;
        this.header = header;
        this.likeIcon = likeIcon;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.remove = remove;
        this.score = score;
        this.secondTeamIcon = secondTeamIcon;
        this.secondTeamName = secondTeamName;
        this.start = start;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static NotificationMatchItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static NotificationMatchItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.notification_match_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static NotificationMatchItemBinding bind(View rootView) {
        int i = R.id.finish;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.finish);
        if (imageView != null) {
            i = R.id.firstTeamName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstTeamName);
            if (textView != null) {
                i = R.id.header;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                if (linearLayout != null) {
                    i = R.id.likeIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.likeIcon);
                    if (imageView2 != null) {
                        i = R.id.matchDate;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchDate);
                        if (textView2 != null) {
                            i = R.id.matchTime;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.matchTime);
                            if (textView3 != null) {
                                i = R.id.remove;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.remove);
                                if (imageView3 != null) {
                                    i = R.id.score;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.score);
                                    if (imageView4 != null) {
                                        i = R.id.secondTeamIcon;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondTeamIcon);
                                        if (imageView5 != null) {
                                            i = R.id.secondTeamName;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondTeamName);
                                            if (textView4 != null) {
                                                i = R.id.start;
                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.start);
                                                if (imageView6 != null) {
                                                    return new NotificationMatchItemBinding((RelativeLayout) rootView, imageView, textView, linearLayout, imageView2, textView2, textView3, imageView3, imageView4, imageView5, textView4, imageView6);
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
