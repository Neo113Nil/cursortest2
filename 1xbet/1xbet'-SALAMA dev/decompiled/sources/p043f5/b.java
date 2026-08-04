package p043f5;

import android.app.ActivityManager;
import android.media.MicrophoneInfo;
import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
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
