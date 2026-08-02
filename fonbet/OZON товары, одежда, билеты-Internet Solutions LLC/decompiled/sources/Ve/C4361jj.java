package Ve;

import Ae.C2399j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.domain.model.MerchantData;

/* renamed from: Ve.jj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4361jj extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vm f31373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4361jj(Vm vm) {
        super(0);
        this.f31373b = vm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MerchantData merchantData = ((C4654tn) this.f31373b).f32130G;
        if (merchantData != null) {
            return C2399j.b(Ae.O0.a(merchantData.getPhoneNumber()));
        }
        throw L3.f29386a;
    }
}
