package Ca;

import android.content.Context;
import android.view.View;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import com.vk.id.onetap.xml.OneTapAtrrUtilKt;
import fd.InterfaceC6511n;

/* loaded from: classes9.dex */
public final /* synthetic */ class D implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4592b;

    public /* synthetic */ D(Object obj, int i11) {
        this.f4591a = i11;
        this.f4592b = obj;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OneTapStyle oneTapStyleConstructor$lambda$6;
        switch (this.f4591a) {
            case 0:
                oneTapStyleConstructor$lambda$6 = OneTapAtrrUtilKt.getOneTapStyleConstructor$lambda$6((Context) this.f4592b, (OneTapButtonCornersStyle) obj, (OneTapButtonSizeStyle) obj2, (OneTapButtonElevationStyle) obj3);
                return oneTapStyleConstructor$lambda$6;
            default:
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                return v50.j.c((v50.j) this.f4592b, (View) obj);
        }
    }
}
