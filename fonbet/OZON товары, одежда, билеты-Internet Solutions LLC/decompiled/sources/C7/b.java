package C7;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface b {
    void a(@NonNull E7.b bVar);

    void b(@NonNull E7.b bVar);

    @NonNull
    Task<C2731a> c();

    @NonNull
    Task<Void> d();

    @Deprecated
    boolean e(@NonNull C2731a c2731a, @NonNull Activity activity) throws IntentSender.SendIntentException;
}
