package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.u;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface ProgressUpdater {
    @NonNull
    u<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
