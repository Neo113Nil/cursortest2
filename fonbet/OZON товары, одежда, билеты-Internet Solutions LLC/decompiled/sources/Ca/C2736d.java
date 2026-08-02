package Ca;

import com.vk.id.internal.auth.app.SilentAuthInfoUtils;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ca.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2736d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4597a;

    public /* synthetic */ C2736d(int i11) {
        this.f4597a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onGroupIdChange$lambda$9;
        String calculateDigestHex$lambda$1;
        switch (this.f4597a) {
            case 0:
                onGroupIdChange$lambda$9 = OneTap.onGroupIdChange$lambda$9((String) obj);
                return onGroupIdChange$lambda$9;
            default:
                calculateDigestHex$lambda$1 = SilentAuthInfoUtils.calculateDigestHex$lambda$1((byte[]) obj);
                return calculateDigestHex$lambda$1;
        }
    }
}
