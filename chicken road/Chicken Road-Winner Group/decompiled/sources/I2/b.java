package I2;

import H2.l;
import android.media.MediaPlayer;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final a f689a;

    public b(byte[] bArr) {
        this.f689a = new a(bArr);
    }

    @Override // I2.c
    public final void a(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    @Override // I2.c
    public final void b(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f689a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f689a, ((b) obj).f689a);
    }

    public final int hashCode() {
        return this.f689a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f689a + ')';
    }
}
