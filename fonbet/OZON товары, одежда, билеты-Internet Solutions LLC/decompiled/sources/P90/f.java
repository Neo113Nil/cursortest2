package P90;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.base.adapters.EnumCaseInSensitiveAdapter;
import ru.ozon.fintech.settings.repository.adapters.SettingsJSONObjectAdapter;

/* loaded from: classes3.dex */
public final class f implements Jb.e<Moshi> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f22059a = new f();
    }

    @Override // Pc.a
    public final Object get() {
        Moshi.a aVar = new Moshi.a();
        aVar.c(S90.e.class, new EnumCaseInSensitiveAdapter(S90.e.class, S90.e.HARD));
        aVar.b(new SettingsJSONObjectAdapter());
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
