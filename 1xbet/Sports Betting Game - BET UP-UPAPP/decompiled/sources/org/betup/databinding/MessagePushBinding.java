package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MessagePushBinding implements ViewBinding {
    public final TextView body;
    public final ImageView messagePushIcon;
    public final LinearLayout messagePushRoot;
    private final LinearLayout rootView;
    public final TextView title;

    private MessagePushBinding(LinearLayout rootView, TextView body, ImageView messagePushIcon, LinearLayout messagePushRoot, TextView title) {
        this.rootView = rootView;
        this.body = body;
        this.messagePushIcon = messagePushIcon;
        this.messagePushRoot = messagePushRoot;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MessagePushBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MessagePushBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.message_push, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MessagePushBinding bind(View rootView) {
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.body);
        if (textView != null) {
            i = R.id.messagePushIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.messagePushIcon);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView2 != null) {
                    return new MessagePushBinding(linearLayout, textView, imageView, linearLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
