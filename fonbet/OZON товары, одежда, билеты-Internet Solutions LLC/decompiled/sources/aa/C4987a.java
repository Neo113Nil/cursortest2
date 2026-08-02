package aa;

import com.vk.id.VKID;
import com.vk.id.internal.di.VKIDDeps;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.tracking.core.CrashReporter;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.domain.scanner.phone.PhoneNumberAnalyzer;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import z90.e;

/* renamed from: aa.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C4987a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36534b;

    public /* synthetic */ C4987a(Object obj, int i11) {
        this.f36533a = i11;
        this.f36534b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String _init_$lambda$0;
        CrashReporter crashReporter_delegate$lambda$2;
        PhoneNumberAnalyzer phoneNumberAnalyzer_delegate$lambda$2;
        switch (this.f36533a) {
            case 0:
                _init_$lambda$0 = VKID._init_$lambda$0((VKIDDeps) this.f36534b);
                return _init_$lambda$0;
            case 1:
                crashReporter_delegate$lambda$2 = VKIDDepsProd.crashReporter_delegate$lambda$2((VKIDDepsProd) this.f36534b);
                return crashReporter_delegate$lambda$2;
            case 2:
                phoneNumberAnalyzer_delegate$lambda$2 = CameraViewModel.phoneNumberAnalyzer_delegate$lambda$2((CameraViewModel) this.f36534b);
                return phoneNumberAnalyzer_delegate$lambda$2;
            default:
                return e.m0((e) this.f36534b);
        }
    }
}
