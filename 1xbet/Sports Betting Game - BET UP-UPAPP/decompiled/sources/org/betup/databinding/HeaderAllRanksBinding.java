package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;
import org.betup.ui.controls.RoiView;

/* loaded from: classes2.dex */
public final class HeaderAllRanksBinding implements ViewBinding {
    public final ImageView firstUserCountry;
    public final RoundedImageView firstUserIcon;
    public final TextView firstUserLevel;
    public final TextView firstUserName;
    public final RoiView firstUserRank;
    public final ImageView imageView21;
    public final ImageView imageView24;
    public final ImageView imageView28;
    private final ConstraintLayout rootView;
    public final ImageView secondUserCountry;
    public final RoundedImageView secondUserIcon;
    public final TextView secondUserLevel;
    public final TextView secondUserName;
    public final RoiView secondUserRank;
    public final ImageView thirdUserCountry;
    public final RoundedImageView thirdUserIcon;
    public final TextView thirdUserLevel;
    public final TextView thirdUserName;
    public final RoiView thirdUserRank;

    private HeaderAllRanksBinding(ConstraintLayout rootView, ImageView firstUserCountry, RoundedImageView firstUserIcon, TextView firstUserLevel, TextView firstUserName, RoiView firstUserRank, ImageView imageView21, ImageView imageView24, ImageView imageView28, ImageView secondUserCountry, RoundedImageView secondUserIcon, TextView secondUserLevel, TextView secondUserName, RoiView secondUserRank, ImageView thirdUserCountry, RoundedImageView thirdUserIcon, TextView thirdUserLevel, TextView thirdUserName, RoiView thirdUserRank) {
        this.rootView = rootView;
        this.firstUserCountry = firstUserCountry;
        this.firstUserIcon = firstUserIcon;
        this.firstUserLevel = firstUserLevel;
        this.firstUserName = firstUserName;
        this.firstUserRank = firstUserRank;
        this.imageView21 = imageView21;
        this.imageView24 = imageView24;
        this.imageView28 = imageView28;
        this.secondUserCountry = secondUserCountry;
        this.secondUserIcon = secondUserIcon;
        this.secondUserLevel = secondUserLevel;
        this.secondUserName = secondUserName;
        this.secondUserRank = secondUserRank;
        this.thirdUserCountry = thirdUserCountry;
        this.thirdUserIcon = thirdUserIcon;
        this.thirdUserLevel = thirdUserLevel;
        this.thirdUserName = thirdUserName;
        this.thirdUserRank = thirdUserRank;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static HeaderAllRanksBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static HeaderAllRanksBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.header_all_ranks, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static HeaderAllRanksBinding bind(View rootView) {
        int i = R.id.firstUserCountry;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.firstUserCountry);
        if (imageView != null) {
            i = R.id.firstUserIcon;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.firstUserIcon);
            if (roundedImageView != null) {
                i = R.id.firstUserLevel;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstUserLevel);
                if (textView != null) {
                    i = R.id.firstUserName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.firstUserName);
                    if (textView2 != null) {
                        i = R.id.firstUserRank;
                        RoiView roiView = (RoiView) ViewBindings.findChildViewById(rootView, R.id.firstUserRank);
                        if (roiView != null) {
                            i = R.id.imageView21;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView21);
                            if (imageView2 != null) {
                                i = R.id.imageView24;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView24);
                                if (imageView3 != null) {
                                    i = R.id.imageView28;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView28);
                                    if (imageView4 != null) {
                                        i = R.id.secondUserCountry;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.secondUserCountry);
                                        if (imageView5 != null) {
                                            i = R.id.secondUserIcon;
                                            RoundedImageView roundedImageView2 = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.secondUserIcon);
                                            if (roundedImageView2 != null) {
                                                i = R.id.secondUserLevel;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondUserLevel);
                                                if (textView3 != null) {
                                                    i = R.id.secondUserName;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.secondUserName);
                                                    if (textView4 != null) {
                                                        i = R.id.secondUserRank;
                                                        RoiView roiView2 = (RoiView) ViewBindings.findChildViewById(rootView, R.id.secondUserRank);
                                                        if (roiView2 != null) {
                                                            i = R.id.thirdUserCountry;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.thirdUserCountry);
                                                            if (imageView6 != null) {
                                                                i = R.id.thirdUserIcon;
                                                                RoundedImageView roundedImageView3 = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.thirdUserIcon);
                                                                if (roundedImageView3 != null) {
                                                                    i = R.id.thirdUserLevel;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdUserLevel);
                                                                    if (textView5 != null) {
                                                                        i = R.id.thirdUserName;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.thirdUserName);
                                                                        if (textView6 != null) {
                                                                            i = R.id.thirdUserRank;
                                                                            RoiView roiView3 = (RoiView) ViewBindings.findChildViewById(rootView, R.id.thirdUserRank);
                                                                            if (roiView3 != null) {
                                                                                return new HeaderAllRanksBinding((ConstraintLayout) rootView, imageView, roundedImageView, textView, textView2, roiView, imageView2, imageView3, imageView4, imageView5, roundedImageView2, textView3, textView4, roiView2, imageView6, roundedImageView3, textView5, textView6, roiView3);
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
