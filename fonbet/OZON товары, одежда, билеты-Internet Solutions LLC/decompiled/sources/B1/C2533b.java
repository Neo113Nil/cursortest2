package B1;

import hd.C6915b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2533b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2551u f2095a = new C2551u(a.f2098a);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C2551u f2096b = new C2551u(C0050b.f2099a);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2097c = 0;

    /* renamed from: B1.b$a */
    /* synthetic */ class a extends C7735q implements Function2<Integer, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2098a = new a(2, C6915b.class, "min", "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* renamed from: B1.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0050b extends C7735q implements Function2<Integer, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0050b f2099a = new C0050b(2, C6915b.class, "max", "max(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }

    @NotNull
    public static final C2551u a() {
        return f2095a;
    }

    @NotNull
    public static final C2551u b() {
        return f2096b;
    }
}
