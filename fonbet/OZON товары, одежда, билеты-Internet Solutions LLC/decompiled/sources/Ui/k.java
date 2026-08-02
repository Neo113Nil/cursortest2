package Ui;

import Si.InterfaceC4010a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Function2<InterfaceC4010a, Integer, Unit> f27789a;

    /* renamed from: b, reason: collision with root package name */
    private final Function2<InterfaceC4010a, Integer, Boolean> f27790b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6511n<InterfaceC4010a, Integer, Boolean, Unit> f27791c;

    /* synthetic */ class a extends C7735q implements Function2<InterfaceC4010a, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC4010a interfaceC4010a, Integer num) {
            InterfaceC4010a p02 = interfaceC4010a;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            C4069c.O((C4069c) this.receiver, p02, intValue);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function2<InterfaceC4010a, Integer, Boolean> {
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(InterfaceC4010a interfaceC4010a, Integer num) {
            InterfaceC4010a p02 = interfaceC4010a;
            num.intValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(C4069c.P((C4069c) this.receiver, p02));
        }
    }

    static final class c extends AbstractC7737t implements InterfaceC6511n<InterfaceC4010a, Integer, Boolean, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4069c f27792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4069c c4069c) {
            super(3);
            this.f27792b = c4069c;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC4010a interfaceC4010a, Integer num, Boolean bool) {
            InterfaceC4010a item = interfaceC4010a;
            int intValue = num.intValue();
            bool.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            C4069c.Q(this.f27792b, item, intValue);
            return Unit.f71690a;
        }
    }

    k(C4069c c4069c) {
        this.f27789a = new a(2, c4069c, C4069c.class, "onGalleryItemClick", "onGalleryItemClick(Lru/ozon/android/gallery/media/presentation/GalleryItem;I)V", 0);
        this.f27790b = new b(2, c4069c, C4069c.class, "onGalleryItemLongClick", "onGalleryItemLongClick(Lru/ozon/android/gallery/media/presentation/GalleryItem;I)Z", 0);
        this.f27791c = new c(c4069c);
    }

    public final Function2<InterfaceC4010a, Integer, Unit> a() {
        return this.f27789a;
    }

    public final Function2<InterfaceC4010a, Integer, Boolean> b() {
        return this.f27790b;
    }

    public final InterfaceC6511n<InterfaceC4010a, Integer, Boolean, Unit> c() {
        return this.f27791c;
    }
}
