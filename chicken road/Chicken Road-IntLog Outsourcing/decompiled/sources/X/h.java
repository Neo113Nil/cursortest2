package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class h extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3474a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3474a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        d callback = (d) iInterface;
        kotlin.jvm.internal.i.e(callback, "callback");
        kotlin.jvm.internal.i.e(cookie, "cookie");
        this.f3474a.f4697b.remove((Integer) cookie);
    }
}
