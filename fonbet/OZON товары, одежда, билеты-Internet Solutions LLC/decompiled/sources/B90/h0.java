package B90;

import S0.InterfaceC3978p0;
import android.database.Cursor;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3156b;

    public /* synthetic */ h0(Object obj, int i11) {
        this.f3155a = i11;
        this.f3156b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit attachWebViewClient$lambda$21$lambda$14;
        Unit VKIDButtonSmall$lambda$7$lambda$6;
        switch (this.f3155a) {
            case 0:
                String str = (String) obj;
                Cursor cursor = (Cursor) this.f3156b;
                return G.g.c(str, "=", cursor.getString(cursor.getColumnIndex(str)));
            case 1:
                return F90.e.e0((F90.e) this.f3156b);
            case 2:
                attachWebViewClient$lambda$21$lambda$14 = FintechWebView.attachWebViewClient$lambda$21$lambda$14((FintechWebView) this.f3156b, (String) obj);
                return attachWebViewClient$lambda$21$lambda$14;
            default:
                VKIDButtonSmall$lambda$7$lambda$6 = VKIDButtonSmallKt.VKIDButtonSmall$lambda$7$lambda$6((InterfaceC3978p0) this.f3156b, (Z1.q) obj);
                return VKIDButtonSmall$lambda$7$lambda$6;
        }
    }
}
