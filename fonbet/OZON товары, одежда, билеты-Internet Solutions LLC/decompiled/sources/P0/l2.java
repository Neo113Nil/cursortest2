package P0;

import Sc.InterfaceC4003e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class l2 {

    static final class a implements InterfaceC7813c0, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f21198a;

        a(Function0 function0) {
            this.f21198a = function0;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC7813c0) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(this.f21198a, ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f21198a;
        }

        public final int hashCode() {
            return this.f21198a.hashCode();
        }

        @Override // l1.InterfaceC7813c0
        /* renamed from: invoke-0d7_KjU */
        public final /* synthetic */ long mo7invoke0d7_KjU() {
            return ((C7807Z) this.f21198a.invoke()).w();
        }
    }

    public static C9915y a() {
        return new C9915y(Q0.A.m(), Q0.A.l(), Q0.A.m(), 0);
    }
}
