package Ca;

import com.vk.id.internal.auth.AuthActivity$handleStartAuth$1;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ca.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C2733a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4595a;

    public /* synthetic */ C2733a(int i11) {
        this.f4595a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onStyleChange$lambda$0;
        Unit onCustomTabsServiceConnected$lambda$0;
        switch (this.f4595a) {
            case 0:
                onStyleChange$lambda$0 = OneTap.onStyleChange$lambda$0((OneTapStyle) obj);
                return onStyleChange$lambda$0;
            default:
                onCustomTabsServiceConnected$lambda$0 = AuthActivity$handleStartAuth$1.onCustomTabsServiceConnected$lambda$0((Throwable) obj);
                return onCustomTabsServiceConnected$lambda$0;
        }
    }
}
