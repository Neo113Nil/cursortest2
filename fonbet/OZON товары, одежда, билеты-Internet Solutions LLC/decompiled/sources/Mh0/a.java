package Mh0;

import Wh0.d;
import android.content.SharedPreferences;
import gh0.InterfaceC6738d;
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
    private final Oh0.a f18082a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f18083b;

    public a(@NotNull Oh0.a pushTokensStorage, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(pushTokensStorage, "pushTokensStorage");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f18082a = pushTokensStorage;
        this.f18083b = sharedPreferences;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.f18083b;
        if (sharedPreferences.contains("ru.ozon.push.sdk.STORAGE_VERSION")) {
            return;
        }
        InterfaceC6738d.a aVar = null;
        String string = sharedPreferences.getString("ru.ozon.push.sdk.OZON_PUSH_TOKEN", null);
        String string2 = sharedPreferences.getString("ru.ozon.push.sdk.OZON_PUSH_TOKEN_TYPE", null);
        if (string != null && string2 == null) {
            b bVar = b.FCM;
            c updateTrigger = c.NOT_CHANGED;
            d.b result = new d.b(new C7429a(string, bVar, updateTrigger));
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            aVar = new InterfaceC6738d.a(bVar, updateTrigger, result);
        } else if (string != null && string2 != null) {
            b valueOf = b.valueOf(string2);
            c cVar = c.NOT_CHANGED;
            aVar = new InterfaceC6738d.a(valueOf, cVar, new d.b(new C7429a(string, b.valueOf(string2), cVar)));
        }
        if (aVar != null) {
            this.f18082a.e(C7714v.a0(aVar));
        }
        sharedPreferences.edit().putInt("ru.ozon.push.sdk.STORAGE_VERSION", 1).apply();
    }
}
