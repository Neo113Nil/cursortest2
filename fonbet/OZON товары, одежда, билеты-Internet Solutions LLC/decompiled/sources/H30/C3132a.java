package H30;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: H30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3132a {
    public static final String a(@NotNull AssetManager assetManager, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(filename, "filename");
        try {
            InputStream open = assetManager.open(filename);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr, Charsets.UTF_8);
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
