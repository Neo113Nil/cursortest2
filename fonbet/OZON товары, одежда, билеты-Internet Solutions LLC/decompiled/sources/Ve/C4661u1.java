package Ve;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Ve.u1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4661u1 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4661u1(Object obj, int i11) {
        super(0);
        this.f32172b = i11;
        this.f32173c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32172b) {
            case 0:
                ((Intent) this.f32173c).setFlags(268435456);
                break;
            default:
                ((C4744x) this.f32173c).f32411P.setValue("Mobile phone auth");
                break;
        }
        return Unit.f71690a;
    }
}
