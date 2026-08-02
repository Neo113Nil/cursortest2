package Qf0;

import Bf0.o;
import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f23435d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f23436e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<o> f23437a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bf0.a f23438b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9067a> f23439c;

    /* renamed from: Qf0.a$a, reason: collision with other inner class name */
    public static final class C0473a {
        @NotNull
        public static a a(@NotNull InterfaceC4008j whitelistingStatusProviderLazy, @NotNull Bf0.a whitelistingConfigurationProvider, @NotNull InterfaceC4008j networkInfoProvider) {
            a aVar;
            Intrinsics.checkNotNullParameter(whitelistingStatusProviderLazy, "whitelistingStatusProviderLazy");
            Intrinsics.checkNotNullParameter(whitelistingConfigurationProvider, "whitelistingConfigurationProvider");
            Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
            a aVar2 = a.f23436e;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (a.f23435d) {
                aVar = a.f23436e;
                if (aVar == null) {
                    aVar = new a(whitelistingStatusProviderLazy, whitelistingConfigurationProvider, networkInfoProvider);
                    a.f23436e = aVar;
                }
            }
            return aVar;
        }
    }

    public a(InterfaceC4008j interfaceC4008j, Bf0.a aVar, InterfaceC4008j interfaceC4008j2) {
        this.f23437a = interfaceC4008j;
        this.f23438b = aVar;
        this.f23439c = interfaceC4008j2;
    }

    @NotNull
    public final Pf0.a d() {
        return new Pf0.a(this.f23437a, this.f23438b, this.f23439c);
    }
}
