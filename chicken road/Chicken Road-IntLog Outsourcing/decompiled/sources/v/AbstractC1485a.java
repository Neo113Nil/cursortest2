package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1485a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
