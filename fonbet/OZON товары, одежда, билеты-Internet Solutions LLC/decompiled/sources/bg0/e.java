package bg0;

import We.E;
import We.L;
import We.M;
import androidx.recyclerview.widget.m;
import bg0.i;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f56000a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Integer> f56001b;

    public e(@NotNull h mockServer) {
        Intrinsics.checkNotNullParameter(mockServer, "mockServer");
        this.f56000a = mockServer;
        this.f56001b = C7714v.b0(Integer.valueOf(m.e.DEFAULT_DRAG_ANIMATION_DURATION), 300, 301, 302, 303, 307, 308, Integer.valueOf(WalletConstants.ERROR_CODE_INVALID_PARAMETERS), Integer.valueOf(CounterView.COUNTER_MAX_DEFAULT));
    }

    @NotNull
    public final i a(@NotNull E client) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(client, "client");
        List<Integer> list = this.f56001b;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            Intrinsics.checkNotNullParameter(client, "client");
            h hVar = this.f56000a;
            if (300 > intValue || intValue >= 400) {
                hVar.c(intValue);
                L a11 = j.a(client, hVar.e("/old-location"));
                Iterator it2 = C7714v.b0(a11.m() != intValue ? new i.a(Ej.b.a(intValue, "Response code does not match with expected code: ")) : i.b.f56014a, a11.c() == null ? new i.a(Ej.b.a(intValue, "Request body returns null with the code: ")) : i.b.f56014a).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((i) next) instanceof i.a) {
                        obj = next;
                        break;
                    }
                }
                obj2 = (i) obj;
                if (obj2 == null) {
                    obj2 = i.b.f56014a;
                }
            } else {
                hVar.c(intValue);
                L a12 = j.a(client, hVar.e("/old-location"));
                hVar.h();
                String c11 = a12.L().j().c();
                StringBuilder sb2 = new StringBuilder("/new-location-");
                sb2.append(intValue);
                obj2 = !Intrinsics.d(c11, sb2.toString()) ? new i.a(Ej.b.a(intValue, "URL does not match the Location header with code ")) : i.b.f56014a;
                if (!(obj2 instanceof i.a)) {
                    obj2 = i.b.f56014a;
                }
            }
            arrayList.add(obj2);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((i) next2) instanceof i.a) {
                obj = next2;
                break;
            }
        }
        i iVar = (i) obj;
        return iVar == null ? i.b.f56014a : iVar;
    }

    @NotNull
    public final i b(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        h hVar = this.f56000a;
        hVar.a();
        M c11 = j.a(client, hVar.e("/old-location")).c();
        return (c11 != null ? c11.string() : null) == null ? new i.a("Request body returns null during delay test") : i.b.f56014a;
    }
}
