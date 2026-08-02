package W5;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class e implements d {
    @Override // W5.d
    public final void a(int i11) {
    }

    @Override // W5.d
    public final void b(float f7) {
    }

    @Override // W5.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // W5.d
    @NonNull
    public final Bitmap d(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // W5.d
    public final void e() {
    }

    @Override // W5.d
    @NonNull
    public final Bitmap f(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }
}
