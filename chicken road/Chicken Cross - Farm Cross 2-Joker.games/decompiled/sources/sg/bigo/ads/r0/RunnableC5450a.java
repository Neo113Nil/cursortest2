package sg.bigo.ads.r0;

import android.content.Context;
import com.ironsource.U3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sg.bigo.ads.r0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5450a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13265a;
    public final /* synthetic */ sg.bigo.ads.U.a[] b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ CountDownLatch d;

    public RunnableC5450a(Context context, sg.bigo.ads.U.a[] aVarArr, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.f13265a = context;
        this.b = aVarArr;
        this.c = atomicBoolean;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f13265a);
            String obj = invoke.getClass().getDeclaredMethod("getId", null).invoke(invoke, null).toString();
            Boolean bool = (Boolean) invoke.getClass().getDeclaredMethod(U3.j.M, null).invoke(invoke, null);
            if (obj != null && bool != null) {
                this.b[0] = new sg.bigo.ads.U.a(obj, bool.booleanValue());
            }
        } catch (Exception unused) {
            this.c.set(false);
        }
        this.d.countDown();
    }
}
