package Ve;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ip, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C4338ip extends C7735q implements InterfaceC6511n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4338ip f31323a = new C4338ip(3, Sc.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemCardSelectionBinding;", 0);

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Sc.a(p02, (ViewGroup) obj2, booleanValue);
    }
}
