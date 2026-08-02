package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vanniktech.emoji.EmojiEditText;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MessageTypeBoxBinding implements ViewBinding {
    public final EmojiEditText editMessage;
    public final ImageView emoji;
    private final ConstraintLayout rootView;
    public final FloatingActionButton send;

    private MessageTypeBoxBinding(ConstraintLayout rootView, EmojiEditText editMessage, ImageView emoji, FloatingActionButton send) {
        this.rootView = rootView;
        this.editMessage = editMessage;
        this.emoji = emoji;
        this.send = send;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MessageTypeBoxBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MessageTypeBoxBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.message_type_box, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MessageTypeBoxBinding bind(View rootView) {
        int i = R.id.editMessage;
        EmojiEditText emojiEditText = (EmojiEditText) ViewBindings.findChildViewById(rootView, R.id.editMessage);
        if (emojiEditText != null) {
            i = R.id.emoji;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.emoji);
            if (imageView != null) {
                i = R.id.send;
                FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.send);
                if (floatingActionButton != null) {
                    return new MessageTypeBoxBinding((ConstraintLayout) rootView, emojiEditText, imageView, floatingActionButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
