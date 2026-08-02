package Ae0;

import N4.a;
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

/* loaded from: classes7.dex */
public final class a implements Ae0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final N4.a f1179a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.EncryptedMapKeyStorage$getProviderKey$2", f = "EncryptedMapKeyStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ae0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0037a extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1181e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0037a(String str, kotlin.coroutines.d<? super C0037a> dVar) {
            super(2, dVar);
            this.f1181e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C0037a(this.f1181e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((C0037a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return a.this.f1179a.getString(this.f1181e, null);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.storage.EncryptedMapKeyStorage$saveProviderKey$2", f = "EncryptedMapKeyStorage.kt", l = {}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1183e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f1184f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f1183e = str;
            this.f1184f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(this.f1183e, this.f1184f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SharedPreferences.Editor edit = a.this.f1179a.edit();
            edit.putString(this.f1183e, this.f1184f);
            edit.commit();
            return Unit.f71690a;
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        N4.a b11 = N4.a.b("mapsdk_map_keys_encrypted_preference", "mapsdk_map_keys_encrypted_preference_master_key", context, a.c.AES256_SIV, a.d.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(b11, "create(...)");
        this.f1179a = b11;
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
        return C10727i.f(He.b.f10879b, new C0037a(str, null), dVar);
    }
}
