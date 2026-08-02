package J7;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes9.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final k f14167a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f14168b = new Handler(Looper.getMainLooper());

    h(k kVar) {
        this.f14167a = kVar;
    }

    @Override // J7.c
    @NonNull
    public final Task<Void> a(@NonNull Activity activity, @NonNull b bVar) {
        if (bVar.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new g(this.f14168b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // J7.c
    @NonNull
    public final Task<b> b() {
        return this.f14167a.a();
    }
}
