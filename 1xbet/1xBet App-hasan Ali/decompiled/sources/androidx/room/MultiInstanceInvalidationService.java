package androidx.room;

import R1.e;
import R1.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: k, reason: collision with root package name */
    public int f7078k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7079l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final e f7080m = new e(this);

    /* renamed from: n, reason: collision with root package name */
    public final f f7081n = new f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f7081n;
    }
}
