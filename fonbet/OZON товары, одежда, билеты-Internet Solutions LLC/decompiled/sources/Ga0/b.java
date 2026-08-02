package Ga0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import W2.j;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kb0.EnumC7626a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mb0.C8123a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements Fa0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<f> f9884a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f9885b;

    public static final class a implements InterfaceC2395h<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f9886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9887b;

        /* renamed from: Ga0.b$a$a, reason: collision with other inner class name */
        public static final class C0202a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f9888a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f9889b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.data.source.impl.EnvironmentsDataSourceImpl$special$$inlined$map$1$2", f = "EnvironmentsDataSourceImpl.kt", l = {223}, m = "emit")
            /* renamed from: Ga0.b$a$a$a, reason: collision with other inner class name */
            public static final class C0203a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f9890d;

                /* renamed from: e, reason: collision with root package name */
                int f9891e;

                public C0203a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f9890d = obj;
                    this.f9891e |= LinearLayoutManager.INVALID_OFFSET;
                    return C0202a.this.emit(null, this);
                }
            }

            public C0202a(InterfaceC2397i interfaceC2397i, b bVar) {
                this.f9888a = interfaceC2397i;
                this.f9889b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0203a c0203a;
                int i11;
                f.a<T> aVar;
                if (dVar instanceof C0203a) {
                    c0203a = (C0203a) dVar;
                    int i12 = c0203a.f9891e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0203a.f9891e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0203a.f9890d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0203a.f9891e;
                        if (i11 != 0) {
                            s.b(obj2);
                            aVar = d.f9896b;
                            String str = (String) ((f) obj).c(aVar);
                            if (str == null) {
                                this.f9889b.getClass();
                                str = Hg0.a.c("debug.selected_env", null);
                            }
                            c0203a.f9891e = 1;
                            if (this.f9888a.emit(str, c0203a) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0203a = new C0203a(dVar);
                Object obj22 = c0203a.f9890d;
                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0203a.f9891e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public a(InterfaceC2395h interfaceC2395h, b bVar) {
            this.f9886a = interfaceC2395h;
            this.f9887b = bVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f9886a.collect(new C0202a(interfaceC2397i, this.f9887b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC3917k<f> a11 = d.a(context);
        this.f9884a = a11;
        this.f9885b = new a(a11.getData(), this);
    }

    @Override // Fa0.a
    public final Object a(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = j.a(this.f9884a, new c(function1, null), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // Fa0.a
    @NotNull
    public final a b() {
        return this.f9885b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Fa0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Ga0.a aVar;
        int i11;
        b bVar;
        String value;
        EnumC7626a enumC7626a;
        if (cVar instanceof Ga0.a) {
            aVar = (Ga0.a) cVar;
            int i12 = aVar.f9883g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f9883g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f9881e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f9883g;
                if (i11 != 0) {
                    s.b(obj);
                    aVar.f9880d = this;
                    aVar.f9883g = 1;
                    obj = C2399j.w(this.f9885b, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    bVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = aVar.f9880d;
                    s.b(obj);
                }
                value = (String) obj;
                Object obj2 = null;
                if (value == null) {
                    bVar.getClass();
                    value = Hg0.a.c("debug.selected_env", null);
                }
                if (value != null) {
                    EnumC7626a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(value, "value");
                    Iterator<E> it = EnumC7626a.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (h.D(((EnumC7626a) next).b(), value, true)) {
                            obj2 = next;
                            break;
                        }
                    }
                    EnumC7626a enumC7626a2 = (EnumC7626a) obj2;
                    if (enumC7626a2 != null) {
                        return enumC7626a2;
                    }
                }
                enumC7626a = C8123a.f74702d;
                return enumC7626a;
            }
        }
        aVar = new Ga0.a(this, cVar);
        Object obj3 = aVar.f9881e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f9883g;
        if (i11 != 0) {
        }
        value = (String) obj3;
        Object obj22 = null;
        if (value == null) {
        }
        if (value != null) {
        }
        enumC7626a = C8123a.f74702d;
        return enumC7626a;
    }
}
