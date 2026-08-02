package Fj;

import K1.H;
import Vb0.b;
import WZ.t;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.List;
import k1.C7460f;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import qc.InterfaceC9021c;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnMuteAudioPlayerControllerListener;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import u3.InterfaceC9928b;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements H, OnFailureListener, InterfaceC9021c, OnMuteAudioPlayerControllerListener, r.a {
    public /* synthetic */ c(InterfaceC9928b.a aVar, boolean z11) {
    }

    public static ConstraintLayout.b b(int i11, int i12, TextAtomV2View textAtomV2View) {
        textAtomV2View.setId(View.generateViewId());
        return new ConstraintLayout.b(i11, i12);
    }

    public static String c(StringBuilder sb2, Class cls, String str) {
        sb2.append(cls);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder d(String str, List list, String str2, String str3, List list2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(list);
        sb2.append(str2);
        sb2.append(list2);
        sb2.append(str3);
        return sb2;
    }

    public static void e(t tVar, String str, String str2, StringBuilder sb2, AtomAction atomAction) {
        sb2.append(str);
        sb2.append(atomAction);
        sb2.append(str2);
        sb2.append(tVar);
    }

    public static void f(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str + str2 + str3);
    }

    @Override // K1.H
    public boolean a(C7460f c7460f, C7460f c7460f2) {
        return c7460f.y(c7460f2);
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        List observeItems$lambda$0;
        observeItems$lambda$0 = AdultListDelegate.observeItems$lambda$0((Boolean) obj, (List) obj2);
        return observeItems$lambda$0;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        b.a.c(Vb0.b.f28514a, it);
    }
}
