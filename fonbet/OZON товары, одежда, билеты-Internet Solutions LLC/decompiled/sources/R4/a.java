package R4;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public interface a<T> {
    @NonNull
    List<Class<? extends a<?>>> a();

    @NonNull
    T create(@NonNull Context context);
}
