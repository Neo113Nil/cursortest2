package Ae0;

import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f1194a = new f();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static Be0.a f1195b = new Be0.a();

    public static Object a(@NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        Be0.a aVar = f1195b;
        aVar.d(context);
        return aVar.b().a((kotlin.coroutines.jvm.internal.c) dVar);
    }

    public static Object c(@NotNull Context context, @NotNull kotlin.coroutines.jvm.internal.c cVar, @NotNull GeoProviderConfig geoProviderConfig) {
        Be0.a aVar = f1195b;
        aVar.d(context);
        return aVar.b().b(geoProviderConfig, cVar);
    }

    public static Object d(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d dVar) {
        Be0.a aVar = f1195b;
        aVar.d(context);
        Object d11 = aVar.c().d(str2, str, false, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public static Object e(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d dVar) {
        Be0.a aVar = f1195b;
        aVar.d(context);
        Object d11 = aVar.c().d(str2, str, true, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Context context, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        De0.b bVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f1193f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f1193f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f1191d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f1193f;
                if (i11 != 0) {
                    s.b(obj);
                    Be0.a aVar2 = f1195b;
                    aVar2.d(context);
                    Fe0.e c11 = aVar2.c();
                    eVar.f1193f = 1;
                    obj = c11.b(str, eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                bVar = (De0.b) obj;
                if (bVar == null) {
                    return bVar.c();
                }
                return null;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f1191d;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f1193f;
        if (i11 != 0) {
        }
        bVar = (De0.b) obj2;
        if (bVar == null) {
        }
    }
}
