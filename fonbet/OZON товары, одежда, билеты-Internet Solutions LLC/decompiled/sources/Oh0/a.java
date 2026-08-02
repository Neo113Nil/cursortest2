package Oh0;

import Sc.o;
import Wh0.d;
import Zg0.d;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import dh0.C6200a;
import gh0.InterfaceC6738d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh0.C7429a;
import jh0.b;
import jh0.c;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f20392a;

    public a(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f20392a = sharedPreferences;
        sharedPreferences.edit().putBoolean("ru.ozon.push.sdk.IS_FIRST_APPLICATION_LAUNCH", !sharedPreferences.contains("ru.ozon.push.sdk.IS_FIRST_APPLICATION_LAUNCH")).apply();
    }

    private static String d(b bVar) {
        return Nk.a.b("ru.ozon.push.sdk.PUSH_TOKEN", bVar.name());
    }

    @NotNull
    public final ArrayList a() {
        SharedPreferences sharedPreferences;
        b[] values = b.values();
        ArrayList arrayList = new ArrayList();
        int length = values.length;
        int i11 = 0;
        while (true) {
            sharedPreferences = this.f20392a;
            if (i11 >= length) {
                break;
            }
            b bVar = values[i11];
            if (sharedPreferences.contains(d(bVar))) {
                arrayList.add(bVar);
            }
            i11++;
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            String str = "";
            String string = sharedPreferences.getString(d(bVar2), "");
            if (string != null) {
                str = string;
            }
            arrayList2.add(new C7429a(str, bVar2, c.NOT_CHANGED));
        }
        return arrayList2;
    }

    public final boolean b() {
        return this.f20392a.getBoolean("ru.ozon.push.sdk.IS_FIRST_APPLICATION_LAUNCH", false);
    }

    public final boolean c(@NotNull C7429a updatedPushToken) {
        Intrinsics.checkNotNullParameter(updatedPushToken, "updatedPushToken");
        String b11 = Nk.a.b("ru.ozon.push.sdk.IS_FIRST_ON_NEW_TOKEN_CALL", updatedPushToken.b().name());
        SharedPreferences sharedPreferences = this.f20392a;
        boolean contains = sharedPreferences.contains(b11);
        boolean z11 = !contains;
        if (!contains) {
            sharedPreferences.edit().putBoolean("ru.ozon.push.sdk.IS_FIRST_ON_NEW_TOKEN_CALL" + updatedPushToken.b().name(), false).apply();
        }
        return z11;
    }

    @SuppressLint({"ApplySharedPref"})
    public final void e(@NotNull List<InterfaceC6738d.a> pushTokensUpdatesResults) {
        Intrinsics.checkNotNullParameter(pushTokensUpdatesResults, "pushTokensUpdatesResults");
        for (InterfaceC6738d.a aVar : pushTokensUpdatesResults) {
            d<C7429a> b11 = aVar.b();
            boolean z11 = b11 instanceof d.a;
            SharedPreferences sharedPreferences = this.f20392a;
            if (z11) {
                String d11 = d(aVar.a());
                if (sharedPreferences.contains(d11)) {
                    boolean commit = sharedPreferences.edit().remove(d11).commit();
                    int i11 = C6200a.f61627d;
                    Throwable a11 = ((d.a) b11).a();
                    Zg0.d b12 = C6200a.b();
                    if (b12 instanceof d.b) {
                        C6200a.c().a(C6200a.a("Removed tokens " + d11 + ", commit returned " + commit), a11);
                        ((d.b) b12).getClass();
                    }
                }
            } else {
                if (!(b11 instanceof d.b)) {
                    throw new o();
                }
                String a12 = ((C7429a) ((d.b) b11).a()).a();
                String d12 = d(aVar.a());
                boolean commit2 = sharedPreferences.edit().putString(d12, a12).commit();
                Zg0.d b13 = C6200a.b();
                if (b13 instanceof d.b) {
                    C6200a.c().a(C6200a.a("Saved tokens " + d12 + ", commit returned " + commit2), null);
                    ((d.b) b13).getClass();
                }
            }
        }
    }
}
