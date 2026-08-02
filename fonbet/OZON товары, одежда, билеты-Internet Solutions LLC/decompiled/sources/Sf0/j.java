package Sf0;

import Bl0.C2652m;
import J0.F1;
import J0.u3;
import Q1.K;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f26216b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                u3.b(this.f26216b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    static final class b extends AbstractC7737t implements Function1<K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f26217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Number f26218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, T> f26219d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<K> f26220e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;TT;Lkotlin/jvm/functions/Function1<-Ljava/lang/String;+TT;>;LS0/p0<LQ1/K;>;)V */
        b(Function1 function1, Number number, Function1 function12, InterfaceC3978p0 interfaceC3978p0) {
            super(1);
            this.f26217b = function1;
            this.f26218c = number;
            this.f26219d = function12;
            this.f26220e = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(K k11) {
            Number number;
            K it = k11;
            Intrinsics.checkNotNullParameter(it, "it");
            String f7 = it.f();
            int length = f7.length();
            Function1<T, Unit> function1 = this.f26217b;
            InterfaceC3978p0<K> interfaceC3978p0 = this.f26220e;
            if (length == 0) {
                interfaceC3978p0.setValue(it);
                function1.invoke(this.f26218c);
            } else if (TextUtils.isDigitsOnly(f7) && (number = (Number) this.f26219d.invoke(f7)) != null) {
                interfaceC3978p0.setValue(it);
                function1.invoke(number);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26221b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(2);
            this.f26221b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                u3.b(this.f26221b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 0, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f26222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Number f26223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Number f26224d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f26225e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f26226f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f26227g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, T> f26228h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f26229i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/e;TT;TT;Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/String;+TT;>;I)V */
        d(androidx.compose.ui.e eVar, Number number, Number number2, Function1 function1, String str, String str2, Function1 function12, int i11) {
            super(2);
            this.f26222b = eVar;
            this.f26223c = number;
            this.f26224d = number2;
            this.f26225e = function1;
            this.f26226f = str;
            this.f26227g = str2;
            this.f26228h = function12;
            this.f26229i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f26229i | 1);
            Number number = this.f26223c;
            Number number2 = this.f26224d;
            Function1<T, Unit> function1 = this.f26225e;
            String str = this.f26226f;
            j.c(this.f26222b, number, number2, function1, str, this.f26227g, this.f26228h, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull androidx.compose.ui.e modifier, @NotNull String label, int i11, @NotNull Function1 onValueChange, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        String str;
        androidx.compose.ui.e eVar;
        Function1 function1;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        C3969l u11 = interfaceC3967k.u(-513486607);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(label) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i13 | 3072;
        if ((i12 & 24576) == 0) {
            i14 |= u11.F(onValueChange) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && u11.b()) {
            u11.j();
            str = label;
            function1 = onValueChange;
            eVar = modifier;
        } else {
            Integer valueOf = Integer.valueOf(i11);
            u11.o(-902310755);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = f.f26205a;
                u11.x(C11);
            }
            u11.k();
            int i15 = i14 >> 3;
            str = label;
            c(modifier, valueOf, 0, onValueChange, str, null, (Function1) ((kotlin.reflect.h) C11), u11, (i14 & 14) | 1769472 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i14 << 9) & 57344));
            eVar = modifier;
            function1 = onValueChange;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(eVar, str, i11, function1, i12));
        }
    }

    public static final void b(@NotNull androidx.compose.ui.e modifier, @NotNull String label, long j11, @NotNull Function1 onValueChange, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter("мс", "trailingIconText");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        C3969l u11 = interfaceC3967k.u(149287177);
        int i12 = i11 | (u11.n(label) ? 32 : 16) | (u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | 24576 | (u11.F(onValueChange) ? 131072 : 65536);
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            Long valueOf = Long.valueOf(j11);
            u11.o(-451582733);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = h.f26211a;
                u11.x(C11);
            }
            u11.k();
            c(modifier, valueOf, 0L, onValueChange, label, "мс", (Function1) ((kotlin.reflect.h) C11), u11, ((i12 << 9) & 57344) | ((i12 >> 3) & 112) | 1573254 | ((i12 >> 6) & 7168) | 196608);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new i(modifier, label, j11, onValueChange, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Number> void c(androidx.compose.ui.e eVar, T t2, T t11, Function1<? super T, Unit> function1, String str, String str2, Function1<? super String, ? extends T> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(1011991669);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(t2) : u11.F(t2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(t11) : u11.F(t11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(str) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(str2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.F(function12) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-1594782532);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(new K(6, 0L, t2.toString()), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            K k11 = (K) interfaceC3978p0.getValue();
            u11.o(-1594761860);
            C4912a c11 = str2 == null ? null : a1.c.c(-1750414933, new a(str2), u11);
            u11.k();
            u11.o(-1594775256);
            boolean z11 = ((i12 & 896) == 256 || ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(t11))) | ((i12 & 7168) == 2048) | ((3670016 & i12) == 1048576);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b(function1, t11, function12, interfaceC3978p0);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            F1.a(k11, (Function1) C12, eVar, false, null, a1.c.c(-479628145, new c(str), u11), c11, null, null, null, 0, 0, null, null, c3969l, ((i12 << 6) & 896) | 1572864);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new d(eVar, t2, t11, function1, str, str2, function12, i11));
        }
    }
}
