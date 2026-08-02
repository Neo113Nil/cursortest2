package f5;

import android.app.ActivityManager;
import android.media.MicrophoneInfo;
import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* renamed from: f5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1102b {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i7, String str) {
        return new ActivityManager.TaskDescription(str, 0, i7);
    }

    public static /* bridge */ /* synthetic */ MicrophoneInfo i(Object obj) {
        return (MicrophoneInfo) obj;
    }

    public static /* synthetic */ void o(int i7, int i8, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i7, i8);
    }

    public static /* bridge */ /* synthetic */ boolean x(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
