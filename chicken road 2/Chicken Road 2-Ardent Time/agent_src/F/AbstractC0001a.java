package F;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0001a {
    public static boolean a(java.io.File file, java.io.File file2) {
        try {
            java.nio.file.Files.move(file.toPath(), file2.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
