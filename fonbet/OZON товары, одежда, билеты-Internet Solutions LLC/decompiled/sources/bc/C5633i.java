package bc;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: bc.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5633i extends AbstractC5640p {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f55882a;

    C5633i(Resources resources) {
        this.f55882a = resources;
    }

    @Override // bc.AbstractC5640p
    @NonNull
    public final Drawable a(@NonNull InputStream inputStream) {
        try {
            return new BitmapDrawable(this.f55882a, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th2) {
            throw new IllegalStateException("Exception decoding input-stream", th2);
        }
    }
}
