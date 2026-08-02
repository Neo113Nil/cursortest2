package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m82 implements w82 {
    @Override // p000.w82
    /* JADX INFO: renamed from: a */
    public final p82 mo2565a(Uri uri) throws C0287hi {
        File fileM3501j = n80.m3501j(uri);
        return new p82(new FileInputStream(fileM3501j), fileM3501j);
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: b */
    public final boolean mo2566b(Uri uri) {
        return n80.m3501j(uri).exists();
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: c */
    public final OutputStream mo2567c(Uri uri) throws IOException {
        File fileM3501j = n80.m3501j(uri);
        t22.m4649b(fileM3501j);
        return new q82(new FileOutputStream(fileM3501j), fileM3501j);
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: d */
    public final void mo2568d(Uri uri) {
        File fileM3501j = n80.m3501j(uri);
        if (fileM3501j.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileM3501j.delete()) {
            return;
        }
        if (!fileM3501j.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: e */
    public final void mo2569e(Uri uri, Uri uri2) {
        File fileM3501j = n80.m3501j(uri);
        File fileM3501j2 = n80.m3501j(uri2);
        t22.m4649b(fileM3501j2);
        if (!fileM3501j.renameTo(fileM3501j2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: f */
    public final String mo2570f() {
        return "file";
    }

    @Override // p000.w82
    /* JADX INFO: renamed from: g */
    public final File mo2571g(Uri uri) {
        return n80.m3501j(uri);
    }
}
