package R80;

import H30.x;
import android.net.Uri;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f24789a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<String> f24790b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24791c = 0;

    static {
        String[] elements = {"localhost", "10.0.2.2", "bank.ozonru.me", "finance.ozonru.me", "albuss-stg.ozonru.me", "meet.finance.ozonru.me", "new.finance.ozonru.me", "e2e.finance.ozonru.me", "pci.finance.ozonru.me", "checkout.ozonru.me", "securepay-ru.ozonru.me", "securepay.ozonru.me", "borrower-account-frontend-stg.ozonru.me", "borrower-account-frontend-stable-stg.ozonru.me", "leasing.ozonru.me"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f24789a = C7705l.j0(elements);
        String[] elements2 = {"bank.ozon.ru", "finance.ozon.ru", "meet.finance.ozon.ru", "e2e.finance.ozon.ru", "pci.finance.ozon.ru", "checkout.ozon.ru", "securepay.ozon.ru", "invest.ozon.ru", "leasing.ozon.ru"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f24790b = C7705l.j0(elements2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6 != null ? r6.getScheme() : null, "http") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(@NotNull String url, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        boolean z11;
        boolean isQa;
        Iterable<String> iterable;
        boolean z12;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Uri e11 = x.e(url);
        String a11 = e11 != null ? x.a(e11) : null;
        if (!Intrinsics.d(e11 != null ? e11.getScheme() : null, "https")) {
            if (fintechSettings.u()) {
            }
            z11 = false;
            isQa = fintechSettings.isQa();
            Iterable iterable2 = f24790b;
            if (isQa) {
                iterable2 = e0.f(f24789a, iterable2);
            }
            iterable = iterable2;
            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (a11 != null) {
                        if (kotlin.text.h.A(a11, "." + str, false) || a11.equals(str)) {
                            z12 = true;
                            break;
                        }
                    }
                }
            }
            z12 = false;
            return !z11 && z12;
        }
        z11 = true;
        isQa = fintechSettings.isQa();
        Iterable iterable22 = f24790b;
        if (isQa) {
        }
        iterable = iterable22;
        if (iterable instanceof Collection) {
        }
        while (r7.hasNext()) {
        }
        z12 = false;
        if (z11) {
        }
    }
}
