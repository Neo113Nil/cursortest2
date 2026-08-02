package ai0;

import E0.C2942q;
import Yh0.c;
import android.app.ActivityManager;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ai0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5027c {

    /* renamed from: ai0.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36798b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f36798b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f36798b;
            if (str != null) {
                Fj.c.f("step: ", str, ", ", sb2);
            }
            return C2942q.c(sb2, "message: Startup time tracking is only available for foreground processes, but the current process isn't a foreground process, so skip tracking.", "toString(...)");
        }
    }

    /* renamed from: ai0.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f36799b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f36799b;
            if (str != null) {
                Fj.c.f("step: ", str, ", ", sb2);
            }
            return C2942q.c(sb2, "message: StartupTimeTracker methods must be called from the main thread, but the current thread isn't a main thread, so skip tracking.", "toString(...)");
        }
    }

    public static final boolean a(String str) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100) {
            c.a aVar = Yh0.c.f35083a;
            a aVar2 = new a(str);
            aVar.getClass();
            c.a.b(aVar2);
            return false;
        }
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        c.a aVar3 = Yh0.c.f35083a;
        b bVar = new b(str);
        aVar3.getClass();
        c.a.b(bVar);
        return false;
    }
}
