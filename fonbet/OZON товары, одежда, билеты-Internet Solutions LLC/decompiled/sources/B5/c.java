package B5;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static EnumC2597a f2726a = EnumC2597a.AUTOMATIC;

    /* renamed from: b, reason: collision with root package name */
    private static volatile L5.e f2727b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile L5.d f2728c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2729d = 0;

    public static EnumC2597a a() {
        return f2726a;
    }

    @NonNull
    public static L5.e b(@NonNull Context context) {
        L5.e eVar;
        L5.d dVar;
        L5.e eVar2 = f2727b;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (L5.e.class) {
            try {
                eVar = f2727b;
                if (eVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    L5.d dVar2 = f2728c;
                    if (dVar2 == null) {
                        synchronized (L5.d.class) {
                            try {
                                dVar = f2728c;
                                if (dVar == null) {
                                    dVar = new L5.d(new C2598b(applicationContext));
                                    f2728c = dVar;
                                }
                            } finally {
                            }
                        }
                        dVar2 = dVar;
                    }
                    eVar = new L5.e(dVar2, new L5.b());
                    f2727b = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }
}
