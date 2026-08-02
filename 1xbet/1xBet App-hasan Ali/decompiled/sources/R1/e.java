package R1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f5139a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f5139a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap hashMap = this.f5139a.f7079l;
        Integer num = (Integer) obj;
        num.intValue();
        hashMap.remove(num);
    }
}
