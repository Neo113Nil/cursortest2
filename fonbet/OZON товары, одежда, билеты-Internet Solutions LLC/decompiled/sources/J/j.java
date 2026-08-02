package J;

import C.I;
import C.S;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j implements I.i {

    /* renamed from: a, reason: collision with root package name */
    private final I.i f12638a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f12639b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12640c;

    /* renamed from: d, reason: collision with root package name */
    private I.j f12641d;

    public j(I.i iVar) {
        this.f12638a = iVar;
    }

    public static void b(j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f12639b) {
            try {
                if (this$0.f12641d == null) {
                    S.k("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                this$0.d();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        Unit unit;
        synchronized (this.f12639b) {
            try {
                if (this.f12640c) {
                    I.i iVar = this.f12638a;
                    if (iVar != null) {
                        iVar.clear();
                        unit = Unit.f71690a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        S.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    S.k("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f12640c = false;
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        synchronized (this.f12639b) {
            try {
                I.j jVar = this.f12641d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f12641d = null;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.I.i
    public final void a(long j11, @NotNull I.j screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.f12639b) {
            this.f12640c = true;
            this.f12641d = screenFlashListener;
            Unit unit2 = Unit.f71690a;
        }
        I.i iVar = this.f12638a;
        if (iVar != null) {
            iVar.a(j11, new I.j() { // from class: J.i
                @Override // C.I.j
                public final void a() {
                    j.b(j.this);
                }
            });
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            S.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            d();
        }
    }

    @Override // C.I.i
    public final void clear() {
        c();
    }

    public final void e() {
        d();
        c();
    }

    public final I.i f() {
        return this.f12638a;
    }
}
