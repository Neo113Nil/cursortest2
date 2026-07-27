package t0;

import android.content.Context;
import java.io.File;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1422a f11839a = new C1422a();

    public final File a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
