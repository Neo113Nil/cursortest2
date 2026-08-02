package Ve;

import Sc.C4005g;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.jc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4354jc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f31356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Vl f31357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T8 f31358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4354jc(kotlin.coroutines.d dVar, C4744x c4744x, Vl vl, T8 t82) {
        super(2, dVar);
        this.f31356e = c4744x;
        this.f31357f = vl;
        this.f31358g = t82;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4354jc(dVar, this.f31356e, this.f31357f, this.f31358g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4354jc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        if (r11.collect(r0, r10) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r11 == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31355d;
        C4744x c4744x = this.f31356e;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31355d = 1;
            Q q11 = c4744x.f32432u;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            q11.getClass();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < uuid.length(); i12++) {
                char charAt = uuid.charAt(i12);
                if (charAt != '-') {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            String upperCase = kotlin.text.h.q0(12, sb3).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            ((C4238fb) q11.f29744b).b(new C4553q8(upperCase));
            Object obj3 = Unit.f71690a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        } else if (i11 == 1) {
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                throw new C4005g();
            }
            Sc.s.b(obj);
            Ae.M0 m02 = ((C4673ud) c4744x.f32412a).f32205b;
            Eb eb2 = new Eb(c4744x, this.f31357f, this.f31358g);
            this.f31355d = 3;
        }
        this.f31355d = 2;
        La la2 = c4744x.f32418g;
        C10720e0 c10720e02 = C10720e0.f105451a;
        He.b bVar2 = He.b.f10879b;
        la2.getClass();
        Object f7 = C10727i.f(bVar2, new C4324ia(la2, null), this);
        Object obj4 = Wc.a.COROUTINE_SUSPENDED;
        if (f7 != obj4) {
            f7 = Unit.f71690a;
        }
        if (f7 != obj4) {
            f7 = Unit.f71690a;
        }
    }
}
