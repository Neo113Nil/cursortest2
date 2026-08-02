package Aa;

import I1.D;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import com.vk.id.onetap.compose.progress.CircleProgressKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Aa.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2374a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f681a;

    public /* synthetic */ C2374a(int i11) {
        this.f681a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CircleProgress$lambda$2$lambda$1;
        Unit onResume$lambda$6;
        Unit sessionNotFound$lambda$0;
        switch (this.f681a) {
            case 0:
                CircleProgress$lambda$2$lambda$1 = CircleProgressKt.CircleProgress$lambda$2$lambda$1((D) obj);
                return CircleProgress$lambda$2$lambda$1;
            case 1:
                onResume$lambda$6 = AuthActivity.onResume$lambda$6((Throwable) obj);
                return onResume$lambda$6;
            default:
                sessionNotFound$lambda$0 = OneTapAnalytics.sessionNotFound$lambda$0((Throwable) obj);
                return sessionNotFound$lambda$0;
        }
    }
}
