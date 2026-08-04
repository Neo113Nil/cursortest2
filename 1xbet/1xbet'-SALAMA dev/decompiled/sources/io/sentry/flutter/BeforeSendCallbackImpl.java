package io.sentry.flutter;

import io.sentry.Hint;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryStackFrame;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
final class BeforeSendCallbackImpl implements SentryOptions.BeforeSendCallback {
    private final void setEventEnvironmentTag(SentryEvent sentryEvent, String str, String str2) {
        sentryEvent.setTag("event.origin", str);
        sentryEvent.setTag("event.environment", str2);
    }

    public static /* synthetic */ void setEventEnvironmentTag$default(BeforeSendCallbackImpl beforeSendCallbackImpl, SentryEvent sentryEvent, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "android";
        }
        beforeSendCallbackImpl.setEventEnvironmentTag(sentryEvent, str, str2);
    }

    @Override // io.sentry.SentryOptions.BeforeSendCallback
    public SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
        h.e(sentryEvent, "event");
        h.e(hint, "hint");
        SdkVersion sdk = sentryEvent.getSdk();
        if (sdk != null) {
            String name = sdk.getName();
            int iHashCode = name.hashCode();
            if (iHashCode != -1079289216) {
                if (iHashCode != 214992565) {
                    if (iHashCode == 1378491996 && name.equals(SentryFlutter.FLUTTER_SDK)) {
                        setEventEnvironmentTag(sentryEvent, "flutter", "dart");
                    }
                } else if (name.equals(SentryFlutter.NATIVE_SDK)) {
                    setEventEnvironmentTag$default(this, sentryEvent, null, SentryStackFrame.JsonKeys.NATIVE, 2, null);
                }
            } else if (name.equals(SentryFlutter.ANDROID_SDK)) {
                setEventEnvironmentTag$default(this, sentryEvent, null, SentryBaseEvent.DEFAULT_PLATFORM, 2, null);
            }
        }
        return sentryEvent;
    }
}
