package P60;

import I0.C3173b;
import P60.n;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class q implements o {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<String> f21922c = C7714v.b0("qr.nspk.ru", "sub.nspk.ru", "sbpay", "me2mepush.nspk.ru", "me2mepull.nspk.ru");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f21923a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f21924b;

    public q(@NotNull Context context, @NotNull g installedAppsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(installedAppsManager, "installedAppsManager");
        this.f21923a = context;
        this.f21924b = installedAppsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<n> f(c cVar) {
        b bVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String f7 = cVar.f();
        g gVar = this.f21924b;
        if (f7 != null) {
            String str = gVar.k(f7) ? f7 : null;
            if (str != null) {
                linkedHashMap.put(str, new n(cVar.d(), str, b.B2C, n.a.PACKAGE, null, null));
            }
        }
        String e11 = cVar.e();
        if (e11 != null) {
            String str2 = gVar.k(e11) ? e11 : null;
            if (str2 != null) {
                linkedHashMap.put(str2, new n(cVar.d(), str2, b.B2B, n.a.PACKAGE, null, null));
            }
        }
        if (linkedHashMap.isEmpty()) {
            List b02 = C7714v.b0(C3173b.b(cVar.d(), "bank"), C3173b.b(cVar.d(), "bankb2b"));
            Tc.b builder = C7714v.B();
            Iterator it = b02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                builder.add(new Pair(str3, Uri.parse(str3 + ProductContainerDTO.RATIO_DELIMITER)));
                for (u uVar : cVar.g()) {
                    builder.add(new Pair(str3, g(str3, uVar.a(), uVar.b())));
                }
                for (String str4 : f21922c) {
                    builder.add(new Pair(str3, g(str3, str4, null)));
                    if (Intrinsics.d(str4, "me2mepull.nspk.ru")) {
                        builder.add(new Pair(str3, g(str3, str4, "/confirmation")));
                    }
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = B11.listIterator(0);
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                if (hashSet.add(((Uri) ((Pair) next).f()).toString())) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String scheme = (String) pair.a();
                Uri uri = (Uri) pair.b();
                for (String str5 : gVar.j(uri)) {
                    if (Intrinsics.d(str5, cVar.f())) {
                        bVar = b.B2C;
                    } else if (Intrinsics.d(str5, cVar.e())) {
                        bVar = b.B2B;
                    } else {
                        b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        bVar = b.B2B;
                        if (!kotlin.text.h.e0(scheme, bVar.a(), false)) {
                            bVar = b.B2C;
                        }
                    }
                    b bVar2 = bVar;
                    n nVar = (n) linkedHashMap.get(str5);
                    if (nVar == null || (nVar.f() == n.a.DEEP_LINK && nVar.a() == b.B2C && bVar2 == b.B2B)) {
                        linkedHashMap.put(str5, new n(cVar.d(), str5, bVar2, n.a.DEEP_LINK, scheme, uri));
                    }
                }
            }
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return C7714v.U0(values);
    }

    private static Uri g(String str, String str2, String str3) {
        if (str3 == null) {
            return Uri.parse(str + "://" + str2);
        }
        return Uri.parse(str + "://" + str2 + str3);
    }

    @Override // P60.o
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new p(this, null), cVar);
    }

    @Override // P60.o
    public final boolean b(@NotNull n bankApp) {
        g gVar = this.f21924b;
        Intrinsics.checkNotNullParameter(bankApp, "bankApp");
        try {
            Intent d11 = gVar.d(bankApp.d());
            Context context = this.f21923a;
            if (d11 != null) {
                d11.addFlags(268435456);
                context.startActivity(d11);
                return true;
            }
            Uri b11 = bankApp.b();
            if (b11 != null) {
                Intent addFlags = new Intent("android.intent.action.VIEW", b11).addCategory("android.intent.category.BROWSABLE").setPackage(bankApp.d()).addFlags(268435456);
                Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                if (gVar.h(addFlags)) {
                    context.startActivity(addFlags);
                    return true;
                }
            }
            L80.a.a("InstalledBanksAppsInteractor", "Не удалось открыть " + bankApp.d() + ": launcher и deep link недоступны");
            return false;
        } catch (Exception e11) {
            L80.a.a("InstalledBanksAppsInteractor", "Ошибка при открытии приложения " + bankApp.d() + ": " + e11.getMessage());
            return false;
        }
    }

    @Override // P60.o
    public final boolean c(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Intent d11 = this.f21924b.d(packageName);
            if (d11 == null) {
                L80.a.a("InstalledBanksAppsInteractor", "Не удалось получить launch intent для пакета ".concat(packageName));
                return false;
            }
            d11.addFlags(268435456);
            this.f21923a.startActivity(d11);
            return true;
        } catch (Exception e11) {
            L80.a.a("InstalledBanksAppsInteractor", "Ошибка при открытии приложения " + packageName + ": " + e11.getMessage());
            return false;
        }
    }

    @Override // P60.o
    public final n d(long j11) {
        Object obj;
        Iterator<E> it = c.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((c) obj).d() == j11) {
                break;
            }
        }
        c cVar = (c) obj;
        if (cVar != null) {
            return (n) C7714v.M(f(cVar));
        }
        L80.a.a("InstalledBanksAppsInteractor", "BankMember not found for memberId=" + j11);
        return null;
    }
}
