package K6;

import Ej.b;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<HandlerThread> f15291a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f15292b = new AtomicInteger(0);

    /* renamed from: K6.a$a, reason: collision with other inner class name */
    static class C0295a {

        /* renamed from: a, reason: collision with root package name */
        static final a f15293a = new a();
    }

    a() {
    }

    public static a b() {
        return C0295a.f15293a;
    }

    public final int a() {
        return this.f15292b.getAndIncrement();
    }

    public final Looper c(int i11) {
        Looper looper;
        int i12 = i11 % 4;
        ArrayList<HandlerThread> arrayList = this.f15291a;
        if (i12 < arrayList.size()) {
            return (arrayList.get(i12) == null || (looper = arrayList.get(i12).getLooper()) == null) ? Looper.getMainLooper() : looper;
        }
        HandlerThread handlerThread = new HandlerThread(b.a(i12, "FrameDecoderExecutor-"));
        handlerThread.start();
        arrayList.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }
}
