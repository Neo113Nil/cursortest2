package D0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1640a;

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1640a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap map = this.f1640a.f9769b;
        Integer num = (Integer) obj;
        num.intValue();
        map.remove(num);
    }
}
