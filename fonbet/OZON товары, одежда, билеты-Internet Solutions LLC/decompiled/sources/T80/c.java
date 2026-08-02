package T80;

import Ae.w0;
import android.app.Activity;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import l70.C7892a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static /* synthetic */ void a(c cVar, String str, String str2, String str3, boolean z11, String str4, boolean z12, boolean z13, String str5, String str6, String str7, String str8, List list, String str9, boolean z14, Long l11, String str10, Boolean bool, int i11) {
            Boolean bool2;
            c cVar2;
            String str11;
            boolean z15;
            String str12 = (i11 & 2) != 0 ? "" : str2;
            String str13 = (i11 & 4) != 0 ? "TRY_TO_GO_TO" : str3;
            boolean z16 = (i11 & 8) != 0 ? true : z11;
            String str14 = (i11 & 16) != 0 ? null : str4;
            boolean z17 = (i11 & 32) != 0 ? false : z12;
            boolean z18 = (i11 & 64) != 0 ? true : z13;
            String str15 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5;
            String str16 = (i11 & 256) != 0 ? null : str6;
            String str17 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str7;
            String str18 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str8;
            List list2 = (i11 & 2048) != 0 ? null : list;
            String str19 = (i11 & 4096) != 0 ? null : str9;
            boolean z19 = (i11 & 8192) != 0 ? false : z14;
            Long l12 = (i11 & 16384) != 0 ? null : l11;
            String str20 = (32768 & i11) != 0 ? null : str10;
            if ((i11 & 65536) != 0) {
                bool2 = null;
                cVar2 = cVar;
                z15 = z17;
                str11 = str;
            } else {
                bool2 = bool;
                cVar2 = cVar;
                str11 = str;
                z15 = z17;
            }
            cVar2.I(str11, str12, str13, z16, str14, z15, z18, str15, str16, str17, str18, list2, str19, z19, l12, str20, bool2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b HIDE;
        public static final b HIDE_ANIMATED;
        public static final b SHOW;
        public static final b UNDEFINED;

        static {
            b bVar = new b("UNDEFINED", 0);
            UNDEFINED = bVar;
            b bVar2 = new b("SHOW", 1);
            SHOW = bVar2;
            b bVar3 = new b("HIDE", 2);
            HIDE = bVar3;
            b bVar4 = new b("HIDE_ANIMATED", 3);
            HIDE_ANIMATED = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    List<ComponentCallbacksC5392m> A0();

    void B0(String str, A40.a aVar, int i11, @NotNull String str2);

    void C();

    void C0(@NotNull String str, @NotNull String str2);

    void D(String str);

    void E();

    void E0(@NotNull String str, @NotNull String str2);

    void F(String str, A40.a aVar, int i11, @NotNull String str2);

    void F0(A40.a aVar, @NotNull String str);

    Integer G();

    void G0();

    void H(@NotNull Uri uri, @NotNull String str);

    boolean H0(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m);

    void I(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, String str4, boolean z12, boolean z13, @NotNull String str5, String str6, String str7, String str8, List<String> list, String str9, boolean z14, Long l11, String str10, Boolean bool);

    void J0(A40.a aVar, @NotNull String str);

    Integer K0();

    ComponentCallbacksC5392m L0();

    Boolean M();

    void N(A40.a aVar, @NotNull String str);

    boolean N0();

    void O0(@NotNull Uri uri);

    void P(@NotNull O30.b bVar);

    void P0(Cbottom2ScreenDTO cbottom2ScreenDTO, boolean z11, boolean z12, @NotNull String str);

    void Q0(@NotNull String str, @NotNull String str2, Map<String, String> map);

    void R(@NotNull String str);

    void R0();

    void S();

    w0<Boolean> S0();

    void T();

    void T0(A40.a aVar, @NotNull String str);

    ComponentCallbacksC5392m U();

    void U0(A40.a aVar, @NotNull String str);

    void V(G30.a aVar);

    void V0();

    w0<Boolean> X();

    w0<Boolean> Y();

    Integer Z(String str);

    void a0();

    void b();

    void b0(@NotNull String str);

    Activity c();

    @NotNull
    Map<Integer, List<ComponentCallbacksC5392m>> d();

    void d0();

    w0<Boolean> e();

    String e0();

    void f();

    void f0();

    void g();

    void h(WeakReference<WebView> weakReference);

    ComponentCallbacksC5392m h0();

    void i(String str, String str2, String str3);

    List<ComponentCallbacksC5392m> i0();

    void j0(@NotNull String str, String str2, boolean z11);

    void k();

    void k0();

    void l0(int i11);

    boolean m(@NotNull String str);

    void n(A40.a aVar, @NotNull String str);

    void n0();

    void o0();

    void p0();

    void pop();

    void q(@NotNull String str, @NotNull String str2, Map<String, String> map);

    String q0(int i11);

    void r();

    void s();

    void s0(@NotNull String str, @NotNull String str2);

    void t();

    void t0(int i11, List list, List list2);

    boolean u(@NotNull String str);

    void v(@NotNull String str);

    void v0(String str, @NotNull String str2, long j11, @NotNull String str3, String str4, boolean z11, String str5);

    void w();

    void w0(@NotNull String str, @NotNull String str2, int i11, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9);

    void x(int i11, boolean z11);

    void x0(@NotNull C7892a c7892a, @NotNull String str);

    boolean y0(@NotNull String str);

    void z(Boolean bool);

    void z0();
}
