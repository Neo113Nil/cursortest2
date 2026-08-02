package B3;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: B3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571o {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f2356a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2357b;

    /* renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f2358c;

    /* renamed from: B3.o$a */
    /* loaded from: classes8.dex */
    final class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            ((p) C2571o.this.f2357b).getClass();
            return bundle;
        }
    }

    /* renamed from: B3.o$b */
    /* loaded from: classes8.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final p f2360a = new p();
    }

    public C2571o() {
        p pVar = b.f2360a;
        this.f2356a = new HashSet<>();
        this.f2357b = pVar;
    }

    public final void b(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f2358c;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        G10.a.h(this.f2356a.add(mediaCodec));
    }

    public final void c() {
        this.f2356a.clear();
        LoudnessCodecController loudnessCodecController = this.f2358c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f2356a.remove(mediaCodec) || (loudnessCodecController = this.f2358c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void e(int i11) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f2358c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f2358c = null;
        }
        create = LoudnessCodecController.create(i11, com.google.common.util.concurrent.o.a(), new a());
        this.f2358c = create;
        Iterator<MediaCodec> it = this.f2356a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec(it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }
}
