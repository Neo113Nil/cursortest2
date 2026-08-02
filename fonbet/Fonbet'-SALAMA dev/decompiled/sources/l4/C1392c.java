package l4;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: l4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1392c implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14930a;

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        boolean equals = ((String) map.get("s")).equals("ok");
        TaskCompletionSource taskCompletionSource = this.f14930a;
        if (equals) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }
}
