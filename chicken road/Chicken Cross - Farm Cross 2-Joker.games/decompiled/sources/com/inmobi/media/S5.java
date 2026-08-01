package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class S5 implements Ok {

    /* renamed from: a, reason: collision with root package name */
    public Fd f6842a;
    public AbstractC4120u1 b;
    public InterfaceC3620c9 c;

    public S5(InterfaceC3620c9 interfaceC3620c9) {
        this.f6842a = null;
        this.b = null;
        this.c = interfaceC3620c9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r1, null, null, new com.inmobi.media.R5(r7, null), 3, null);
     */
    @Override // com.inmobi.media.Ok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Job launch$default;
        Y9 c;
        InterfaceC3620c9 interfaceC3620c9 = this.c;
        if (interfaceC3620c9 != null && (c = interfaceC3620c9.c()) != null) {
            ((Z9) c).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC3620c9 interfaceC3620c92 = this.c;
        if (interfaceC3620c92 == null || (r1 = interfaceC3620c92.a()) == null || launch$default == null) {
            return;
        }
        launch$default.invokeOnCompletion(new Function1() { // from class: com.inmobi.media.S5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S5.a(S5.this, (Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    public S5(Fd fd, AbstractC4120u1 abstractC4120u1, InterfaceC3620c9 interfaceC3620c9) {
        this.f6842a = fd;
        this.b = abstractC4120u1;
        this.c = interfaceC3620c9;
    }

    public static final Unit a(S5 s5, Throwable th) {
        Y9 c;
        InterfaceC3620c9 interfaceC3620c9 = s5.c;
        if (interfaceC3620c9 != null && (c = interfaceC3620c9.c()) != null) {
            ((Z9) c).a();
        }
        InterfaceC3620c9 interfaceC3620c92 = s5.c;
        AbstractC3727g4.a(interfaceC3620c92 != null ? interfaceC3620c92.a() : null);
        s5.b = null;
        s5.c = null;
        s5.f6842a = null;
        return Unit.INSTANCE;
    }
}
