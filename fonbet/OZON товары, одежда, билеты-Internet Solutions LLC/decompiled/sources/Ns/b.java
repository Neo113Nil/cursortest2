package Ns;

import He.g;
import S7.e;
import S7.s;
import androidx.media3.exoplayer.C5449k;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.F;
import j3.w;
import j3.y;
import java.util.Map;
import m3.r;
import qc.o;
import ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import t3.C9729A;
import u3.InterfaceC9928b;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements o, B.b, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19664a;

    public /* synthetic */ b(int i11) {
        this.f19664a = i11;
    }

    public static int a(TextDTO textDTO, int i11, int i12) {
        return (textDTO.hashCode() + i11) * i12;
    }

    public static String b(String str, String str2, StringBuilder sb2, Map map, TestInfo testInfo) {
        sb2.append(map);
        sb2.append(str);
        sb2.append(testInfo);
        sb2.append(str2);
        return sb2.toString();
    }

    public static void c(String str, String str2, String str3) {
        L80.a.a(str3, str + str2);
    }

    public static void d(String str, String str2, String str3, StringBuilder sb2, AtomAction atomAction) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(atomAction);
        sb2.append(str3);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        TabConfigResponse tabConfig$lambda$3;
        tabConfig$lambda$3 = FakeMainViewModel.getTabConfig$lambda$3((Throwable) obj);
        return tabConfig$lambda$3;
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        F f7 = ((C5891j) gVar).f(e.a());
        return (s) C5885d.d().a(s.class, f7.f()).c(f7.g());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        switch (this.f19664a) {
            case 5:
                ((y.c) obj).onPlayerError(C5449k.f(new C9729A("Player release timed out."), 1003));
                break;
            default:
                ((InterfaceC9928b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ b(InterfaceC9928b.a aVar, w wVar) {
        this.f19664a = 6;
    }
}
