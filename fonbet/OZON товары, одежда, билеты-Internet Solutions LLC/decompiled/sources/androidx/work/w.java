package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class w {
    protected w() {
    }

    @NonNull
    public abstract androidx.work.impl.n a(@NonNull String str);

    @NonNull
    public abstract r b(@NonNull String str, @NonNull g gVar, @NonNull List<q> list);
}
