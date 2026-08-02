package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemFaqAnswerBinding implements ViewBinding {
    public final TextView answer;
    private final LinearLayout rootView;

    private ItemFaqAnswerBinding(LinearLayout rootView, TextView answer) {
        this.rootView = rootView;
        this.answer = answer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFaqAnswerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemFaqAnswerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_faq_answer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFaqAnswerBinding bind(View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.answer);
        if (textView != null) {
            return new ItemFaqAnswerBinding((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.answer)));
    }
}
