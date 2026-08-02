package Ae0;

import Sc.s;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class d implements Ae0.b {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f1185a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.MapKeyStorage$getProviderKey$2", f = "MapKeyStorage.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f1187e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(this.f1187e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return d.this.f1185a.getString(this.f1187e, null);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.MapKeyStorage$saveProviderKey$2", f = "MapKeyStorage.kt", l = {}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1189e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f1190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f1189e = str;
            this.f1190f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f1189e, this.f1190f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SharedPreferences sharedPreferences = d.this.f1185a;
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "access$getPreferences$p(...)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(this.f1189e, this.f1190f);
            edit.commit();
            return Unit.f71690a;
        }
    }

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1185a = context.getSharedPreferences("mapsdk_map_keys_preference", 0);
    }

    @Override // Ae0.b
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(He.b.f10879b, new b(str, str2, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // Ae0.b
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new a(str, null), dVar);
    }
}
