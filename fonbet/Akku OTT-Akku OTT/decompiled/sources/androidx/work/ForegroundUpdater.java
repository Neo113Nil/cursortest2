package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.u;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface ForegroundUpdater {
    @NonNull
    u<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
