package androidx.lifecycle;

import Sc.r;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class G0 implements G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v.b f43203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f43204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10737n f43205c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f43206d;

    /* JADX WARN: Multi-variable type inference failed */
    G0(AbstractC5434v.b bVar, AbstractC5434v abstractC5434v, C10737n c10737n, Function0 function0) {
        this.f43203a = bVar;
        this.f43204b = abstractC5434v;
        this.f43205c = c10737n;
        this.f43206d = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Object a11;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC5434v.a.Companion.getClass();
        AbstractC5434v.a c11 = AbstractC5434v.a.C0798a.c(this.f43203a);
        C10737n c10737n = this.f43205c;
        AbstractC5434v abstractC5434v = this.f43204b;
        if (event != c11) {
            if (event == AbstractC5434v.a.ON_DESTROY) {
                abstractC5434v.e(this);
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Sc.s.a(new E(null)));
                return;
            }
            return;
        }
        abstractC5434v.e(this);
        ?? r32 = this.f43206d;
        try {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = r32.invoke();
        } catch (Throwable th2) {
            r.Companion companion3 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        c10737n.resumeWith(a11);
    }
}
