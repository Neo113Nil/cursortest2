package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.R;

/* renamed from: Ve.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4691v2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f32254d;

    public C4691v2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4691v2 c4691v2 = new C4691v2(2, dVar);
        c4691v2.f32254d = ((Number) obj).longValue();
        return c4691v2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        C4691v2 c4691v2 = new C4691v2(2, (kotlin.coroutines.d) obj2);
        c4691v2.f32254d = longValue;
        return c4691v2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        long j11 = this.f32254d;
        if (j11 <= -1) {
            return j11 == -1 ? new C4481nn(R.string.spay_otp_code_resend_btn, null, R.color.spay_otp_primary_button_color, null, 10) : new C4481nn(R.string.spay_empty_string, null, 0, null, 30);
        }
        return new C4481nn(R.string.spay_otp_code_resend_btn_countdown, new Integer(R.plurals.spay_otp_secs_f), R.color.spay_otp_code_info_text_color, new Long(j11), 16);
    }
}
