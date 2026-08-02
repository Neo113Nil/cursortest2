package io.sentry.android.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import io.sentry.android.core.SentryUserFeedbackDialog;

/* loaded from: classes2.dex */
public class SentryUserFeedbackButton extends Button {
    private View.OnClickListener delegate;

    public SentryUserFeedbackButton(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SentryUserFeedbackButton, i7, i8);
        try {
            float f7 = context.getResources().getDisplayMetrics().density;
            float dimension = obtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_drawablePadding, -1.0f);
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_drawableStart, -1);
            boolean z4 = obtainStyledAttributes.getBoolean(R.styleable.SentryUserFeedbackButton_android_textAllCaps, false);
            int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.SentryUserFeedbackButton_android_background, -1);
            float dimension2 = obtainStyledAttributes.getDimension(R.styleable.SentryUserFeedbackButton_android_padding, -1.0f);
            int color = obtainStyledAttributes.getColor(R.styleable.SentryUserFeedbackButton_android_textColor, -1);
            String string = obtainStyledAttributes.getString(R.styleable.SentryUserFeedbackButton_android_text);
            if (dimension == -1.0f) {
                setCompoundDrawablePadding((int) (4.0f * f7));
            }
            if (resourceId == -1) {
                setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.sentry_user_feedback_button_logo_24, 0, 0, 0);
            }
            setAllCaps(z4);
            if (resourceId2 == -1) {
                setBackgroundResource(R.drawable.sentry_oval_button_ripple_background);
            }
            if (dimension2 == -1.0f) {
                int i9 = (int) (f7 * 12.0f);
                setPadding(i9, i9, i9, i9);
            }
            if (color == -1) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorForeground, typedValue, true);
                setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
            }
            if (string == null) {
                setText("Report a Bug");
            }
            obtainStyledAttributes.recycle();
            setOnClickListener(this.delegate);
        } catch (Throwable th) {
            if (obtainStyledAttributes != null) {
                try {
                    obtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$0(View view) {
        new SentryUserFeedbackDialog.Builder(getContext()).create().show();
        View.OnClickListener onClickListener = this.delegate;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.delegate = onClickListener;
        super.setOnClickListener(new ViewOnClickListenerC1298r(this, 0));
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        init(context, attributeSet, i7, 0);
    }

    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        init(context, attributeSet, i7, i8);
    }
}
