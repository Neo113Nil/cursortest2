package D80;

import android.content.Context;
import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6152b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6151a = i11;
        this.f6152b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float lambda$3$lambda$1$lambda$0;
        boolean isStandaloneIntegration_delegate$lambda$0;
        Unit onResume$lambda$7;
        Object obj = this.f6152b;
        switch (this.f6151a) {
            case 0:
                lambda$3$lambda$1$lambda$0 = FintechCoreLib.lambda$3$lambda$1$lambda$0((S80.b) obj);
                return lambda$3$lambda$1$lambda$0;
            case 1:
                int i11 = StatusResultView.f97006n;
                return Integer.valueOf(androidx.core.content.a.getColor((Context) obj, R.color.yellow_800));
            case 2:
                isStandaloneIntegration_delegate$lambda$0 = PhotoPreviewFragment.isStandaloneIntegration_delegate$lambda$0((PhotoPreviewFragment) obj);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$0);
            default:
                onResume$lambda$7 = AuthActivity.onResume$lambda$7((AuthActivity) obj);
                return onResume$lambda$7;
        }
    }
}
