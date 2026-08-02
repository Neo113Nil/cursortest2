package Ca;

import android.app.Activity;
import com.vk.id.VKIDAuthFail;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final /* synthetic */ class m implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4611b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f4610a = i11;
        this.f4611b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit Content$lambda$72$lambda$71;
        switch (this.f4610a) {
            case 0:
                Content$lambda$72$lambda$71 = OneTap.Content$lambda$72$lambda$71((OneTap) this.f4611b, (OneTapOAuth) obj, (VKIDAuthFail) obj2);
                return Content$lambda$72$lambda$71;
            default:
                return f50.f.k0((f50.f) this.f4611b, (String) obj, (Activity) obj2);
        }
    }
}
