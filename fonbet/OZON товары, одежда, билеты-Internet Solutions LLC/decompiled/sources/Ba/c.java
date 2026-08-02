package Ba;

import B1.m0;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.onetap.compose.util.MeasureUnconstrainedViewWidthKt;
import com.vk.id.onetap.xml.OneTap;
import com.vk.id.onetap.xml.OneTapParsedAttrs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3342b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f3341a = i11;
        this.f3342b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$0;
        Unit _init_$lambda$14;
        switch (this.f3341a) {
            case 0:
                MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$0 = MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$0((m0) this.f3342b, (m0.a) obj);
                return MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$0;
            default:
                _init_$lambda$14 = OneTap._init_$lambda$14((OneTapParsedAttrs) this.f3342b, (VKIDAuthUiParams.Builder) obj);
                return _init_$lambda$14;
        }
    }
}
