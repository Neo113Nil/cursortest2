package Fd0;

import Cd0.f;
import Sc.r;
import Sc.s;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f9415a;

    public c(@NotNull f repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f9415a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, NotificationBar.DismissReason dismissReason, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f9411f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f9411f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f9409d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f9411f;
                if (i11 != 0) {
                    s.b(obj);
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    if (dismissReason == null) {
                        buildUpon.appendQueryParameter("event", "show");
                    } else {
                        buildUpon.appendQueryParameter("event", "dismiss");
                        String lowerCase = dismissReason.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        buildUpon.appendQueryParameter("dismiss_reason", lowerCase);
                    }
                    String uri = buildUpon.build().toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                    aVar.f9411f = 1;
                    if (this.f9415a.c(uri, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    ((r) obj).getClass();
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f9409d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f9411f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        Object d11;
        Throwable b11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f9414f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f9414f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f9412d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f9414f;
                if (i11 != 0) {
                    s.b(obj);
                    bVar.f9414f = 1;
                    d11 = this.f9415a.d(str, bVar);
                    if (d11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    d11 = ((r) obj).getF26106a();
                }
                b11 = r.b(d11);
                if (b11 != null) {
                    Jd0.a.f14618a.e(b11);
                }
                if (d11 instanceof r.b) {
                    return d11;
                }
                return null;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f9412d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f9414f;
        if (i11 != 0) {
        }
        b11 = r.b(d11);
        if (b11 != null) {
        }
        if (d11 instanceof r.b) {
        }
    }
}
