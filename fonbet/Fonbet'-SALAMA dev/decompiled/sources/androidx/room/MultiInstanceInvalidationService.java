package androidx.room;

import D0.f;
import D0.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f9768a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9769b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final f f9770c = new f(this);

    /* renamed from: d, reason: collision with root package name */
    public final g f9771d = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f9771d;
    }
}
