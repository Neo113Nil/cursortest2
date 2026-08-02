package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroid/view/View;", "", "hide", "", "setSessionReplayHidden", "(Landroid/view/View;Z)V", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "setSessionReplayImagePrivacy", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/ImagePrivacy;)V", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "setSessionReplayTextAndInputPrivacy", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;)V", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "setSessionReplayTouchPrivacy", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/TouchPrivacy;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PrivacyOverrideExtensionsKt {
    public static final void setSessionReplayHidden(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (z) {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_hidden, java.lang.Boolean.TRUE);
        } else {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_hidden, null);
        }
    }

    public static final void setSessionReplayImagePrivacy(android.view.View view, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (imagePrivacy == null) {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_image_privacy, null);
        } else {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_image_privacy, imagePrivacy.toString());
        }
    }

    public static final void setSessionReplayTextAndInputPrivacy(android.view.View view, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (textAndInputPrivacy == null) {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_text_and_input_privacy, null);
        } else {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_text_and_input_privacy, textAndInputPrivacy.toString());
        }
    }

    public static final void setSessionReplayTouchPrivacy(android.view.View view, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (touchPrivacy == null) {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_touch_privacy, null);
        } else {
            view.setTag(com.datadog.android.sessionreplay.R.id.datadog_touch_privacy, touchPrivacy.toString());
        }
    }
}
