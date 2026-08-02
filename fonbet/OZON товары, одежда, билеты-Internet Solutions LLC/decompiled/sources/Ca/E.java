package Ca;

import android.content.Context;
import android.view.MotionEvent;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import com.vk.id.onetap.xml.OneTapAtrrUtilKt;
import fd.InterfaceC6511n;

/* loaded from: classes9.dex */
public final /* synthetic */ class E implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4594b;

    public /* synthetic */ E(Object obj, int i11) {
        this.f4593a = i11;
        this.f4594b = obj;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OneTapStyle oneTapStyleConstructor$lambda$7;
        switch (this.f4593a) {
            case 0:
                oneTapStyleConstructor$lambda$7 = OneTapAtrrUtilKt.getOneTapStyleConstructor$lambda$7((Context) this.f4594b, (OneTapButtonCornersStyle) obj, (OneTapButtonSizeStyle) obj2, (OneTapButtonElevationStyle) obj3);
                return oneTapStyleConstructor$lambda$7;
            default:
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                return v50.j.j((v50.j) this.f4594b, (MotionEvent) obj);
        }
    }
}
