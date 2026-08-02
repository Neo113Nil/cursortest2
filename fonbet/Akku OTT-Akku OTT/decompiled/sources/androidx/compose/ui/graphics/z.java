package androidx.compose.ui.graphics;

import android.app.NotificationChannel;
import java.nio.file.FileVisitor;

/* loaded from: classes.dex */
public final /* synthetic */ class z {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel("background_downloader", str, 2);
    }

    public static /* bridge */ /* synthetic */ FileVisitor d(Object obj) {
        return (FileVisitor) obj;
    }
}
