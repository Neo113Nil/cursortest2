package aa;

import Sc.r;
import We.L;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.internal.api.VKIDApiService;
import kotlin.jvm.functions.Function1;

/* renamed from: aa.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C4989c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36538a;

    public /* synthetic */ C4989c(int i11) {
        this.f36538a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessToken _get_accessToken_$lambda$14;
        r wrapTokenToVKIDCall$lambda$6;
        switch (this.f36538a) {
            case 0:
                _get_accessToken_$lambda$14 = VKID._get_accessToken_$lambda$14((Throwable) obj);
                return _get_accessToken_$lambda$14;
            default:
                wrapTokenToVKIDCall$lambda$6 = VKIDApiService.wrapTokenToVKIDCall$lambda$6((L) obj);
                return wrapTokenToVKIDCall$lambda$6;
        }
    }
}
