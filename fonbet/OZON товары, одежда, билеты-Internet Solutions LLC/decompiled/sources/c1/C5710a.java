package c1;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5710a extends C5711b {

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    static final class C0844a extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Function1<Object, Unit>> f56208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0844a(List<? extends Function1<Object, Unit>> list) {
            super(1);
            this.f56208b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            List<Function1<Object, Unit>> list = this.f56208b;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: c1.a$b */
    static final class b extends AbstractC7737t implements Function1<C5718i, C5711b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f56209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f56210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f56209b = function1;
            this.f56210c = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C5711b invoke(C5718i c5718i) {
            int i11;
            C5718i c5718i2 = c5718i;
            synchronized (C5721l.D()) {
                i11 = C5721l.f56254e;
                C5721l.f56254e = i11 + 1;
            }
            return new C5711b(i11, c5718i2, this.f56209b, this.f56210c);
        }
    }

    /* renamed from: c1.a$c */
    static final class c extends AbstractC7737t implements Function1<C5718i, C5714e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f56211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1<Object, Unit> function1) {
            super(1);
            this.f56211b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C5714e invoke(C5718i c5718i) {
            int i11;
            C5718i c5718i2 = c5718i;
            synchronized (C5721l.D()) {
                i11 = C5721l.f56254e;
                C5721l.f56254e = i11 + 1;
            }
            return new C5714e(i11, c5718i2, this.f56211b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5710a(int i11, @NotNull C5718i c5718i) {
        super(i11, c5718i, null, r2);
        List list;
        Function1 function1;
        synchronized (C5721l.D()) {
            list = C5721l.f56258i;
            function1 = (Function1) C7714v.D0(list);
            function1 = function1 == null ? new C0844a(list) : function1;
        }
    }

    @Override // c1.C5711b
    @NotNull
    public final AbstractC5716g B() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // c1.C5711b
    @NotNull
    public final C5711b O(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        return (C5711b) C5721l.v(new b(function1, function12));
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void d() {
        synchronized (C5721l.D()) {
            q();
            Unit unit = Unit.f71690a;
        }
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void m() {
        x.b();
        throw null;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void n() {
        x.b();
        throw null;
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void o() {
        C5721l.b();
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    @NotNull
    public final AbstractC5715f x(Function1<Object, Unit> function1) {
        return C5721l.v(new c(function1));
    }
}
