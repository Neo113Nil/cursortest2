package com.csdcorp.speech_to_text;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.RunnableC0181n;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements MethodChannel.Result {
    public final Handler a;
    public final MethodChannel.Result b;

    public b(MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = new Handler(Looper.getMainLooper());
        this.b = result;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String errorCode, String str, Object obj) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.a.post(new a(0, this, errorCode, str, obj));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.a.post(new RunnableC0181n(this, 1));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.a.post(new androidx.media3.exoplayer.audio.i(1, this, obj));
    }
}
