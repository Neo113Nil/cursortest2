package androidx.media3.exoplayer.drm;

import android.content.Intent;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import io.flutter.plugins.imagepicker.ImagePickerDelegate;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.c = eventDispatcher;
        this.d = drmSessionEventListener;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.c).lambda$drmSessionAcquired$0((DrmSessionEventListener) this.d, this.b);
                break;
            default:
                ((ImagePickerDelegate) this.c).lambda$onActivityResult$0(this.b, (Intent) this.d);
                break;
        }
    }

    public /* synthetic */ i(ImagePickerDelegate imagePickerDelegate, int i, Intent intent) {
        this.c = imagePickerDelegate;
        this.b = i;
        this.d = intent;
    }
}
