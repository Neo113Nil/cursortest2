package d1;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4843a;

    public C0269a(IBinder iBinder, String str) {
        this.f4843a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4843a;
    }
}
