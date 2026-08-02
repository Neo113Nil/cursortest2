package s3;

import Y4.D;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class b extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f16146a;

    public b(TaskCompletionSource taskCompletionSource) {
        this.f16146a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        D.U(status, pendingIntent, this.f16146a);
    }
}
