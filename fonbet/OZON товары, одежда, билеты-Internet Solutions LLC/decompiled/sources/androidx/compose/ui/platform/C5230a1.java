package androidx.compose.ui.platform;

import Q1.InterfaceInputConnectionC3854x;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5230a1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5272o1 f40808a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40809b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f40810c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private U0.b<WeakReference<InterfaceInputConnectionC3854x>> f40811d = new U0.b<>(new WeakReference[16]);

    /* renamed from: e, reason: collision with root package name */
    private boolean f40812e;

    /* renamed from: androidx.compose.ui.platform.a1$a */
    static final class a extends AbstractC7737t implements Function1<InterfaceInputConnectionC3854x, Unit> {
        a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke(InterfaceInputConnectionC3854x interfaceInputConnectionC3854x) {
            int i11;
            InterfaceInputConnectionC3854x interfaceInputConnectionC3854x2 = interfaceInputConnectionC3854x;
            interfaceInputConnectionC3854x2.a();
            C5230a1 c5230a1 = C5230a1.this;
            U0.b bVar = c5230a1.f40811d;
            int m11 = bVar.m();
            if (m11 > 0) {
                Object[] l11 = bVar.l();
                i11 = 0;
                while (!Intrinsics.d((WeakReference) l11[i11], interfaceInputConnectionC3854x2)) {
                    i11++;
                    if (i11 >= m11) {
                    }
                }
                if (i11 >= 0) {
                    c5230a1.f40811d.u(i11);
                }
                if (c5230a1.f40811d.o()) {
                    c5230a1.f40809b.invoke();
                }
                return Unit.f71690a;
            }
            i11 = -1;
            if (i11 >= 0) {
            }
            if (c5230a1.f40811d.o()) {
            }
            return Unit.f71690a;
        }
    }

    public C5230a1(@NotNull InterfaceC5272o1 interfaceC5272o1, @NotNull Function0<Unit> function0) {
        this.f40808a = interfaceC5272o1;
        this.f40809b = function0;
    }

    public final InputConnection c(@NotNull EditorInfo editorInfo) {
        synchronized (this.f40810c) {
            if (this.f40812e) {
                return null;
            }
            InterfaceInputConnectionC3854x a11 = Q1.C.a(this.f40808a.a(editorInfo), new a());
            this.f40811d.b(new WeakReference(a11));
            return a11;
        }
    }

    public final void d() {
        synchronized (this.f40810c) {
            try {
                this.f40812e = true;
                U0.b<WeakReference<InterfaceInputConnectionC3854x>> bVar = this.f40811d;
                int m11 = bVar.m();
                if (m11 > 0) {
                    WeakReference<InterfaceInputConnectionC3854x>[] l11 = bVar.l();
                    int i11 = 0;
                    do {
                        InterfaceInputConnectionC3854x interfaceInputConnectionC3854x = l11[i11].get();
                        if (interfaceInputConnectionC3854x != null) {
                            interfaceInputConnectionC3854x.a();
                        }
                        i11++;
                    } while (i11 < m11);
                }
                this.f40811d.h();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f40812e;
    }
}
