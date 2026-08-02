package c2;

import D1.x0;
import S0.AbstractC3984t;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import b1.InterfaceC5512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import w1.C10407b;

/* renamed from: c2.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5732f<T extends View> extends C5728b {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f56377A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f56378B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Unit> f56379C;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final T f56380x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC5512o f56381y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC5512o.a f56382z;

    /* renamed from: c2.f$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5732f<T> f56383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5732f<T> c5732f) {
            super(0);
            this.f56383b = c5732f;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5732f<T> c5732f = this.f56383b;
            c5732f.z().invoke(((C5732f) c5732f).f56380x);
            C5732f.y(c5732f);
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.f$b */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5732f<T> f56384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5732f<T> c5732f) {
            super(0);
            this.f56384b = c5732f;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5732f<T> c5732f = this.f56384b;
            c5732f.A().invoke(((C5732f) c5732f).f56380x);
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.f$c */
    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5732f<T> f56385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C5732f<T> c5732f) {
            super(0);
            this.f56385b = c5732f;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5732f<T> c5732f = this.f56385b;
            c5732f.B().invoke(((C5732f) c5732f).f56380x);
            return Unit.f71690a;
        }
    }

    private C5732f() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5732f(@NotNull Context context, @NotNull Function1<? super Context, ? extends T> function1, AbstractC3984t abstractC3984t, InterfaceC5512o interfaceC5512o, int i11, @NotNull x0 x0Var) {
        super(context, abstractC3984t, i11, new C10407b(), r5, x0Var);
        T invoke = function1.invoke(context);
        this.f56380x = invoke;
        this.f56381y = interfaceC5512o;
        setClipChildren(false);
        String valueOf = String.valueOf(i11);
        Object f7 = interfaceC5512o != null ? interfaceC5512o.f(valueOf) : null;
        SparseArray<Parcelable> sparseArray = f7 instanceof SparseArray ? (SparseArray) f7 : null;
        if (sparseArray != null) {
            invoke.restoreHierarchyState(sparseArray);
        }
        if (interfaceC5512o != null) {
            InterfaceC5512o.a b11 = interfaceC5512o.b(valueOf, new C5731e(this));
            InterfaceC5512o.a aVar = this.f56382z;
            if (aVar != null) {
                aVar.a();
            }
            this.f56382z = b11;
        }
        this.f56377A = androidx.compose.ui.viewinterop.a.e();
        this.f56378B = androidx.compose.ui.viewinterop.a.e();
        this.f56379C = androidx.compose.ui.viewinterop.a.e();
    }

    public static final void y(C5732f c5732f) {
        InterfaceC5512o.a aVar = c5732f.f56382z;
        if (aVar != null) {
            aVar.a();
        }
        c5732f.f56382z = null;
    }

    @NotNull
    public final Function1<T, Unit> A() {
        return this.f56378B;
    }

    @NotNull
    public final Function1<T, Unit> B() {
        return this.f56377A;
    }

    public final void C(@NotNull Function1<? super T, Unit> function1) {
        this.f56379C = function1;
        t(new a(this));
    }

    public final void D(@NotNull Function1<? super T, Unit> function1) {
        this.f56378B = function1;
        u(new b(this));
    }

    public final void E(@NotNull Function1<? super T, Unit> function1) {
        this.f56377A = function1;
        w(new c(this));
    }

    @NotNull
    public final Function1<T, Unit> z() {
        return this.f56379C;
    }
}
