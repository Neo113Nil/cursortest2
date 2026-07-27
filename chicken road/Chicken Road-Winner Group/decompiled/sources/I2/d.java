package I2;

import H2.l;
import android.media.MediaPlayer;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f691b;

    public d(String str, boolean z3) {
        this.f690a = str;
        this.f691b = z3;
    }

    @Override // I2.c
    public final void a(l soundPoolPlayer) {
        j.e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.e(this);
    }

    @Override // I2.c
    public final void b(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f690a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f690a, dVar.f690a) && this.f691b == dVar.f691b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f691b) + (this.f690a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlSource(url=" + this.f690a + ", isLocal=" + this.f691b + ')';
    }
}
