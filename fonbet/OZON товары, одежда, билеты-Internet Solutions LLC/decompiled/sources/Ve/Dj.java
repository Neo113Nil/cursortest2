package Ve;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Dj extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4524p8 f28871b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f28872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dj(InterfaceC4524p8 sPayRepository, Y9 sPaySdkReducer, C4248fl featuresHandler) {
        super(9);
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f28871b = sPayRepository;
        this.f28872c = featuresHandler;
    }

    public static final void E0(Dj dj2) {
        C4248fl c4248fl = dj2.f28872c;
        Intrinsics.checkNotNullParameter(c4248fl, "<this>");
        EnumC4290h5 tag = EnumC4290h5.S_BONUSES_PAYMENT;
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedHashMap linkedHashMap = c4248fl.f31050d;
        InterfaceC4678ui interfaceC4678ui = (InterfaceC4678ui) linkedHashMap.get(tag);
        Tl tl2 = null;
        Tl tl3 = interfaceC4678ui instanceof Tl ? (Tl) interfaceC4678ui : null;
        if (tl3 == null) {
            EnumC4290h5 tag2 = EnumC4290h5.S_BONUSES_PAYMENT_V2;
            Intrinsics.checkNotNullParameter(tag2, "tag");
            InterfaceC4678ui interfaceC4678ui2 = (InterfaceC4678ui) linkedHashMap.get(tag2);
            if (interfaceC4678ui2 instanceof Tl) {
                tl2 = (Tl) interfaceC4678ui2;
            }
        } else {
            tl2 = tl3;
        }
        if (tl2 != null) {
            tl2.f30066a = false;
            tl2.f30067b = false;
            Unit unit = Unit.f71690a;
        }
    }
}
