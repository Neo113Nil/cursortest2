package Rh0;

import Zg0.d;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.provider.Settings;
import dh0.C6200a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.IntConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest;
import wh0.C10562a;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zg0.g f25094a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f25095b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ContentResolver f25096c;

    static final class a extends AbstractC7737t implements Function1<SharedPreferences.Editor, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f25097b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SharedPreferences.Editor editor) {
            SharedPreferences.Editor edit = editor;
            Intrinsics.checkNotNullParameter(edit, "$this$edit");
            edit.putString("android_id_v2", this.f25097b);
            return Unit.f71690a;
        }
    }

    /* renamed from: Rh0.b$b, reason: collision with other inner class name */
    static final class C0502b extends AbstractC7737t implements Function1<SharedPreferences.Editor, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0502b(String str) {
            super(1);
            this.f25098b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SharedPreferences.Editor editor) {
            SharedPreferences.Editor edit = editor;
            Intrinsics.checkNotNullParameter(edit, "$this$edit");
            edit.putString("android_id", this.f25098b);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    final class c extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f25099b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return P4.f.b("toString(...)");
        }
    }

    public b(@NotNull Zg0.g configuration, @NotNull SharedPreferences sharedPreferences, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f25094a = configuration;
        this.f25095b = sharedPreferences;
        this.f25096c = contentResolver;
    }

    private static LinkedHashMap a(String str, String str2, Set set) {
        LinkedHashMap l11 = U.l(new Pair("hw_id", str), new Pair("old_hw_id", str2));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            TokenUpdateRequest.TokenInfo tokenInfo = (TokenUpdateRequest.TokenInfo) it.next();
            l11.put(tokenInfo.getProvider().name(), kotlin.text.h.q0(5, tokenInfo.getToken()));
        }
        return l11;
    }

    public final void b(@NotNull String hwId, @NotNull Set pushTokens, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(hwId, "hwId");
        Intrinsics.checkNotNullParameter(pushTokens, "pushTokens");
        Zg0.g gVar = this.f25094a;
        if (!z11 || str == null) {
            if (gVar.e().i()) {
                int i11 = sh0.b.f98783c;
                LinkedHashMap a11 = a(hwId, str, pushTokens);
                a11.put("is_migration_enabled", Boolean.valueOf(z11));
                Unit unit = Unit.f71690a;
                sh0.b.e("HW_IDS", sj.f.a(a11), Boolean.FALSE, new d(hwId, str, z11));
                return;
            }
            return;
        }
        a aVar = new a(hwId);
        SharedPreferences.Editor edit = this.f25095b.edit();
        aVar.invoke(edit);
        edit.apply();
        if (gVar.e().j()) {
            int i12 = sh0.b.f98783c;
            sh0.b.e("HW_IDS", sj.f.a(a(hwId, str, pushTokens)), Boolean.FALSE, new e(hwId, str));
        }
    }

    @NotNull
    public final String c() {
        String string = Settings.Secure.getString(this.f25096c, "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SharedPreferences sharedPreferences = this.f25095b;
        if (!sharedPreferences.contains("android_id")) {
            C0502b c0502b = new C0502b(string);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            c0502b.invoke(edit);
            edit.apply();
            return string;
        }
        String string2 = sharedPreferences.getString("android_id", null);
        if (!Intrinsics.d(string2, string)) {
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("Android id from system and prefs are different!"), null);
                ((d.b) b11).getClass();
            }
        }
        return string2 == null ? string : string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.String] */
    @NotNull
    public final C10562a d(@NotNull Zg0.g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String a11 = configuration.b().a();
        if (a11 == null) {
            M m11 = new M();
            SharedPreferences sharedPreferences = this.f25095b;
            ?? string = sharedPreferences.getString("app_instance_id", null);
            m11.f71787a = string;
            if (string == 0) {
                m11.f71787a = c.f25099b.invoke();
                Rh0.c cVar = new Rh0.c(m11);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                cVar.invoke(edit);
                edit.apply();
            }
            a11 = (String) m11.f71787a;
        }
        if (configuration.h()) {
            String string2 = Settings.Secure.getString(this.f25096c, "android_id");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            string2.chars().forEach(new IntConsumer() { // from class: Rh0.a
                @Override // java.util.function.IntConsumer
                public final void accept(int i11) {
                    linkedHashSet.add(Integer.valueOf(i11));
                }
            });
            if (linkedHashSet.size() < 2 || string2.length() <= 5) {
                string2 = null;
            }
            String string3 = this.f25095b.getString("android_id_v2", null);
            if (string2 != null) {
                if (string3 != null) {
                    a11 = string3;
                }
                r1 = string2.equals(a11) ? null : a11;
                a11 = string2;
            } else if (string3 != null) {
                a11 = string3;
            }
        }
        return new C10562a(a11, r1);
    }
}
