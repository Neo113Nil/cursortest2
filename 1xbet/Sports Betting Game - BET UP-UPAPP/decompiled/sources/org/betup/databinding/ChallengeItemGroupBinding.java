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
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ChallengeItemGroupBinding implements ViewBinding {
    public final LinearLayout challengeItemContainer;
    public final LinearLayout challengeStatusBar;
    public final RoundedImageView firstUserIcon;
    public final TextView firstUserName;
    public final LinearLayout header;
    public final ImageView imageView18;
    public final TextView prize;
    private final LinearLayout rootView;
    public final RoundedImageView secondUserIcon;
    public final TextView secondUserName;
    public final TextView status;
    public final ImageView textView16;
    public final TextView time;
    public final ConstraintLayout userBar;

    private ChallengeItemGroupBinding(LinearLayout rootView, LinearLayout challengeItemContainer, LinearLayout challengeStatusBar, RoundedImageView firstUserIcon, TextView firstUserName, LinearLayout header, ImageView imageView18, TextView prize, RoundedImageView secondUserIcon, TextView secondUserName, TextView status, ImageView textView16, TextView time, ConstraintLayout userBar) {
        this.rootView = rootView;
        this.challengeItemContainer = challengeItemContainer;
        this.challengeStatusBar = challengeStatusBar;
        this.firstUserIcon = firstUserIcon;
        this.firstUserName = firstUserName;
        this.header = header;
        this.imageView18 = imageView18;
        this.prize = prize;
        this.secondUserIcon = secondUserIcon;
        this.secondUserName = secondUserName;
        this.status = status;
        this.textView16 = textView16;
        this.time = time;
        this.userBar = userBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ChallengeItemGroupBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChallengeItemGroupBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.challenge_item_group, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChallengeItemGroupBinding bind(View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.challenge_status_bar;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.challenge_status_bar);
        if (linearLayout2 != null) {
            i = R.id.firstUserIcon;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.firstUserIcon);
            if (roundedImageView != null) {
                i = R.id.firstUserName;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstUserName);
                if (textView != null) {
                    i = R.id.header;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header);
                    if (linearLayout3 != null) {
                        i = R.id.imageView18;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView18);
                        if (imageView != null) {
                            i = R.id.prize;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.prize);
                            if (textView2 != null) {
                                i = R.id.secondUserIcon;
                                RoundedImageView roundedImageView2 = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.secondUserIcon);
                                if (roundedImageView2 != null) {
                                    i = R.id.secondUserName;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondUserName);
                                    if (textView3 != null) {
                                        i = R.id.status;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.status);
                                        if (textView4 != null) {
                                            i = R.id.textView16;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.textView16);
                                            if (imageView2 != null) {
                                                i = R.id.time;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                if (textView5 != null) {
                                                    i = R.id.userBar;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.userBar);
                                                    if (constraintLayout != null) {
                                                        return new ChallengeItemGroupBinding(linearLayout, linearLayout, linearLayout2, roundedImageView, textView, linearLayout3, imageView, textView2, roundedImageView2, textView3, textView4, imageView2, textView5, constraintLayout);
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
