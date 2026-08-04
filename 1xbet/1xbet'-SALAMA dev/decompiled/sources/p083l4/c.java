package p083l4;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14936a;

    @Override // p083l4.l
    public final void a(Map map) {
        boolean zEquals = ((String) map.get("s")).equals("ok");
        TaskCompletionSource taskCompletionSource = this.f14936a;
        if (zEquals) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }
}
