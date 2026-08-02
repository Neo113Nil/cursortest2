package Z5;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p6.C8861a;

/* loaded from: classes.dex */
public final class c implements T5.d<ByteBuffer> {
    @Override // T5.d
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull T5.i iVar) {
        try {
            C8861a.e(byteBuffer, file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e11);
            return false;
        }
    }
}
