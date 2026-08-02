package b60;

import U50.j;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.squareup.moshi.Moshi;
import h3.C6788a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.RequestPhotoData;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: b60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5568c extends V50.a<RequestPhotoData> {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f55558g = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f55559b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U30.a f55560c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6788a f55561d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f55562e;

    /* renamed from: f, reason: collision with root package name */
    private j f55563f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5568c(@NotNull Context context, @NotNull U30.a fileManager, @NotNull C6788a coroutineScope, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f55559b = context;
        this.f55560c = fileManager;
        this.f55561d = coroutineScope;
        this.f55562e = "get_photo";
    }

    public static final void e(C5568c c5568c, List list) {
        String str;
        c5568c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            str = "";
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            String str4 = (String) f55558g.get(str3);
            if (str4 != null) {
                Uri parse = Uri.parse(str4);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                ContentResolver contentResolver = c5568c.f55559b.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                try {
                    str = Base64.encodeToString(c5568c.f55560c.f(contentResolver, parse), 0);
                } catch (FileNotFoundException e11) {
                    L80.a.c("GetPhotoBridgeInterface", null, e11);
                } catch (IOException e12) {
                    L80.a.c("GetPhotoBridgeInterface", null, e12);
                }
                if (str != null) {
                    str2 = (String) linkedHashMap.put(str3, str);
                }
            }
            arrayList.add(str2);
        }
        j jVar = c5568c.f55563f;
        if (jVar != null) {
            try {
                str = c5568c.c().c(Map.class).toJson(linkedHashMap);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            jVar.invoke(new NativeResult.Success(str));
        }
        c5568c.f55563f = null;
    }

    @Override // V50.a
    @NotNull
    public final Class<RequestPhotoData> b() {
        return RequestPhotoData.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, j callback) {
        RequestPhotoData value = (RequestPhotoData) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (value.getPhones().isEmpty()) {
            callback.invoke(new NativeResult.Error("Ошибка при получении входящих контактов...", null, 2, null));
            return;
        }
        if (f55558g.isEmpty()) {
            callback.invoke(new NativeResult.Error("Список миниатюр контактов записной книжки пуст...", null, 2, null));
            return;
        }
        this.f55563f = callback;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f55561d, He.b.f10879b, null, new C5567b(this, value, null), 2);
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f55562e;
    }
}
