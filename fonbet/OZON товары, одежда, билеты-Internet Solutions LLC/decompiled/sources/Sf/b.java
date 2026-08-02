package Sf;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f26194a;

    public final Bitmap a() {
        Bitmap bitmap = this.f26194a;
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                this.f26194a = this.f26194a.copy(config2, false);
            }
        }
        return this.f26194a;
    }

    public final float b() {
        Bitmap bitmap = this.f26194a;
        if (bitmap == null) {
            throw new IllegalStateException("Required to set a Icon before calling getScale");
        }
        float density = bitmap.getDensity();
        if (density == 0.0f) {
            density = 160.0f;
        }
        return density / 160.0f;
    }

    @NonNull
    public final byte[] c() {
        Bitmap bitmap = this.f26194a;
        if (bitmap == null) {
            throw new IllegalStateException("Required to set a Icon before calling toBytes");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.f26194a.getHeight() * bitmap.getRowBytes());
        this.f26194a.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass() && this.f26194a.equals(((b) obj).f26194a)) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f26194a;
        if (bitmap != null) {
            return bitmap.hashCode();
        }
        return 0;
    }
}
