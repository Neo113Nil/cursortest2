package a1;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f1784a;

    public c(IBinder iBinder) {
        this.f1784a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1784a;
    }
}
