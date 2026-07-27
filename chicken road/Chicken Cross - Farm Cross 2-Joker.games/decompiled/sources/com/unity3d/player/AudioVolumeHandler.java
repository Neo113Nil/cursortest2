package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C4878g;
import com.unity3d.player.a.C4880i;
import com.unity3d.player.a.InterfaceC4879h;

/* loaded from: classes7.dex */
public class AudioVolumeHandler implements InterfaceC4879h {

    /* renamed from: a, reason: collision with root package name */
    public C4880i f11699a;

    @Override // com.unity3d.player.a.InterfaceC4879h
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C4880i c4880i = new C4880i(context);
        this.f11699a = c4880i;
        c4880i.c = new C4878g(new Handler(Looper.getMainLooper()), c4880i.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c4880i.c);
    }
}
