package Ag;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ag.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2428a {
    @NotNull
    public static final void a(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Can't create " + file);
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file + " is not a directory");
    }
}
