package I2;

import android.os.Handler;
import android.os.Looper;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class c extends m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public static final c f2603l = new c(0);

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
