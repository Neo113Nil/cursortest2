package W8;

import a9.C4962a;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.X;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes9.dex */
public interface a extends Closeable, I, OptionalModuleApi {
    @NonNull
    Task<List<X8.a>> N(@NonNull C4962a c4962a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @X(AbstractC5434v.a.ON_DESTROY)
    void close();
}
