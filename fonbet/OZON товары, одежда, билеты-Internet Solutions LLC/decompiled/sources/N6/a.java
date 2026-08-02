package N6;

import Sc.k;
import Sc.n;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f18744a = k.a(n.NONE, C0361a.f18746b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18745b = 0;

    /* renamed from: N6.a$a, reason: collision with other inner class name */
    static final class C0361a extends AbstractC7737t implements Function0<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0361a f18746b = new C0361a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final Handler a() {
        return (Handler) f18744a.getValue();
    }
}
