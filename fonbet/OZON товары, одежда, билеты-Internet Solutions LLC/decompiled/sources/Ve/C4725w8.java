package Ve;

import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;

/* renamed from: Ve.w8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4725w8 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32347d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f32348e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f32349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4725w8(int i11) {
        super(3, null);
        this.f32347d = i11;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f32347d) {
            case 0:
                C4725w8 c4725w8 = new C4725w8(3, 0, (kotlin.coroutines.d) obj3);
                c4725w8.f32349f = (Long) obj;
                c4725w8.f32348e = (String) obj2;
                return c4725w8.invokeSuspend(Unit.f71690a);
            default:
                C4725w8 c4725w82 = new C4725w8(3, 1, (kotlin.coroutines.d) obj3);
                c4725w82.f32349f = (Map) obj;
                c4725w82.f32348e = (String) obj2;
                return c4725w82.invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32347d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                Long l11 = (Long) this.f32349f;
                String str = this.f32348e;
                if (l11 != null) {
                    return new L2(l11.longValue(), str);
                }
                return null;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                Map map = (Map) this.f32349f;
                String str2 = this.f32348e;
                if (str2 == null || map == null) {
                    return null;
                }
                return (String) map.get(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4725w8(int i11, int i12, kotlin.coroutines.d dVar) {
        super(i11, dVar);
        this.f32347d = i12;
    }
}
