package aa;

import com.vk.id.VKID;
import com.vk.id.internal.di.VKIDDeps;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;

/* renamed from: aa.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C4988b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36537c;

    public /* synthetic */ C4988b(int i11, Object obj, Object obj2) {
        this.f36535a = i11;
        this.f36536b = obj;
        this.f36537c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _init_$lambda$3;
        Unit actuallyConfirmPhoto$lambda$9;
        switch (this.f36535a) {
            case 0:
                _init_$lambda$3 = VKID._init_$lambda$3((VKIDDeps) this.f36536b, (VKID) this.f36537c);
                return _init_$lambda$3;
            default:
                actuallyConfirmPhoto$lambda$9 = CameraViewModel.actuallyConfirmPhoto$lambda$9((CameraViewModel) this.f36536b, (String) this.f36537c);
                return actuallyConfirmPhoto$lambda$9;
        }
    }
}
