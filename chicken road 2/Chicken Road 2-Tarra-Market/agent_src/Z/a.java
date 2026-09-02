package Z;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f531b;

    public a(IBinder iBinder, String str) {
        this.f530a = iBinder;
        this.f531b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f530a;
    }
}
