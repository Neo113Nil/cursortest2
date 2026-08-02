package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemLotteryResultBinding implements ViewBinding {
    public final ImageView icon;
    public final AppCompatTextView number;
    private final FrameLayout rootView;

    private ItemLotteryResultBinding(FrameLayout rootView, ImageView icon, AppCompatTextView number) {
        this.rootView = rootView;
        this.icon = icon;
        this.number = number;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemLotteryResultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemLotteryResultBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lottery_result, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemLotteryResultBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.number;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.number);
            if (appCompatTextView != null) {
                return new ItemLotteryResultBinding((FrameLayout) rootView, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
