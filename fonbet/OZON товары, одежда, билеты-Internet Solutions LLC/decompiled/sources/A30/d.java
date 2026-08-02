package A30;

import B30.f;
import Sc.InterfaceC4003e;
import com.vk.id.AuthResultHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4003e f355c;

    public /* synthetic */ d(Object obj, InterfaceC4003e interfaceC4003e, int i11) {
        this.f353a = i11;
        this.f354b = obj;
        this.f355c = interfaceC4003e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit handleOauth$lambda$3$lambda$2;
        switch (this.f353a) {
            case 0:
                return m.b((m) this.f354b, (B60.b) this.f355c, (f.c) obj);
            default:
                handleOauth$lambda$3$lambda$2 = AuthResultHandler.handleOauth$lambda$3$lambda$2((AuthResultHandler) this.f354b, (Function0) this.f355c, (Throwable) obj);
                return handleOauth$lambda$3$lambda$2;
        }
    }
}
