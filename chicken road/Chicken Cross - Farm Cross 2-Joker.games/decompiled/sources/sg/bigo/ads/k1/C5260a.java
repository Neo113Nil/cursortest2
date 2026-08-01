package sg.bigo.ads.k1;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: sg.bigo.ads.k1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5260a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public float f13027a;
    public final Context b;
    public final C5278t c;

    public C5260a(Handler handler, Context context, C5278t c5278t) {
        super(handler);
        this.f13027a = -1.0f;
        this.b = context.getApplicationContext();
        this.c = c5278t;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float streamVolume = ((AudioManager) this.b.getSystemService("audio")) != null ? 100.0f * (r4.getStreamVolume(3) / r4.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f13027a) {
            this.f13027a = streamVolume;
            C5278t c5278t = this.c;
            if (c5278t != null) {
                float f = this.f13027a;
                C5271l c5271l = c5278t.f13044a.k;
                c5271l.getClass();
                c5271l.a("mraidbridge.notifyAudioVolumeChangeEvent(" + f + ");");
            }
        }
    }
}
