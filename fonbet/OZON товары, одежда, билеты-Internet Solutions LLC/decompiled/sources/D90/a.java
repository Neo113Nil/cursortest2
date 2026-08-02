package D90;

import Me.C3618a;
import Me.l;
import Me.n;
import Oe.I;
import android.app.Application;
import android.hardware.SensorManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6192b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6191a = i11;
        this.f6192b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6191a) {
            case 0:
                ((FintechNativeBridgeTestingFragment) this.f6192b).dismiss();
                return Unit.f71690a;
            case 1:
                final I i11 = (I) this.f6192b;
                return l.a("kotlin.Unit", n.d.f17938a, new Me.f[0], new Function1() { // from class: Oe.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I.d(I.this, (C3618a) obj);
                    }
                });
            case 2:
                return (SensorManager) androidx.core.content.a.getSystemService((Application) this.f6192b, SensorManager.class);
            default:
                return ((OfflineSelectFragment) this.f6192b).getFactory();
        }
    }
}
