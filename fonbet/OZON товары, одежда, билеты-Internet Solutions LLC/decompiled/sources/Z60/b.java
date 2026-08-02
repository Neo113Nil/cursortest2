package Z60;

import C.C2702w;
import Sc.o;
import Sc.r;
import Sc.s;
import U30.d;
import android.content.SharedPreferences;
import e70.EnumC6314a;
import e70.InterfaceC6317d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b implements Z60.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U30.a f35651a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f35652b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35653a;

        static {
            int[] iArr = new int[W60.a.values().length];
            try {
                iArr[W60.a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W60.a.TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[W60.a.CBOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35653a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$deletOldBankImage$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Z60.b$b, reason: collision with other inner class name */
    static final class C0672b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35655e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0672b(String str, kotlin.coroutines.d<? super C0672b> dVar) {
            super(2, dVar);
            this.f35655e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C0672b(this.f35655e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0672b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b.this.f35651a.j(this.f35655e);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$getBankImageFilePath$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35657e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f35657e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(this.f35657e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            return bVar.f35651a.d(bVar.f35651a.h("offline_content"), "bank_logo_" + this.f35657e);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$getCbottomJson$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35658d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC8449a f35660f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EnumC8449a enumC8449a, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f35660f = enumC8449a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = b.this.new d(this.f35660f, dVar);
            dVar2.f35658d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            File file = new File(bVar.f35651a.h("offline_content").getAbsolutePath(), this.f35660f.b());
            try {
                r.Companion companion = r.INSTANCE;
                a11 = bVar.f35651a.m(file);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            return r.b(a11) == null ? new InterfaceC6317d.b((String) a11) : new InterfaceC6317d.a(EnumC6314a.UNKNOWN);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$getData$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class e extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35661d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ W60.a f35663f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(W60.a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f35663f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = b.this.new e(this.f35663f, dVar);
            eVar.f35661d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            File file = new File(bVar.f35651a.h("offline_content").getAbsolutePath(), this.f35663f.b());
            try {
                r.Companion companion = r.INSTANCE;
                a11 = bVar.f35651a.m(file);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            return r.b(a11) == null ? new InterfaceC6317d.b((String) a11) : new InterfaceC6317d.a(EnumC6314a.UNKNOWN);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$isImageExists$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35665e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f35665e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new f(this.f35665e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            File file = new File(bVar.f35651a.h("offline_content").getAbsolutePath(), this.f35665e);
            U30.a aVar2 = bVar.f35651a;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return Boolean.valueOf(aVar2.c(absolutePath));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$saveCbottomLayout$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class g extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35666d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35668f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f35668f = str;
            this.f35669g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = b.this.new g(this.f35668f, this.f35669g, dVar);
            gVar.f35666d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            File a12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            String str = this.f35668f;
            String str2 = this.f35669g;
            try {
                r.Companion companion = r.INSTANCE;
                U30.a aVar2 = bVar.f35651a;
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                a12 = aVar2.a(new ByteArrayInputStream(bytes), U30.d.JSON, str2, "offline_content");
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a12 == null) {
                throw new IOException("Failed to save cbottom layout");
            }
            a11 = a12.getAbsolutePath();
            return r.b(a11) == null ? new InterfaceC6317d.b((String) a11) : new InterfaceC6317d.a(EnumC6314a.IO_ERROR);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$saveData$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class h extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends Unit, ? extends EnumC6314a>>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35671e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ W60.a f35672f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, W60.a aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f35671e = str;
            this.f35672f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new h(this.f35671e, this.f35672f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends Unit, ? extends EnumC6314a>> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            U30.a aVar2 = b.this.f35651a;
            byte[] bytes = this.f35671e.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return aVar2.a(new ByteArrayInputStream(bytes), U30.d.JSON, this.f35672f.b(), "offline_content") != null ? new InterfaceC6317d.b(Unit.f71690a) : new InterfaceC6317d.a(EnumC6314a.UNKNOWN);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.local.LocalDataSourceImpl$saveImage$2", f = "LocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class i extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35673d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InputStream f35675f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35676g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InputStream inputStream, String str, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f35675f = inputStream;
            this.f35676g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = b.this.new i(this.f35675f, this.f35676g, dVar);
            iVar.f35673d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends String, ? extends EnumC6314a>> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            File a12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            InputStream inputStream = this.f35675f;
            String str = this.f35676g;
            try {
                r.Companion companion = r.INSTANCE;
                U30.a aVar2 = bVar.f35651a;
                U30.d.Companion.getClass();
                U30.d d11 = d.a.d(str);
                if (d11 == null) {
                    d11 = U30.d.PNG;
                }
                a12 = aVar2.a(inputStream, d11, str, "offline_content");
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a12 == null) {
                throw new IOException("Failed to save image");
            }
            a11 = a12.getAbsolutePath();
            return r.b(a11) == null ? new InterfaceC6317d.b((String) a11) : new InterfaceC6317d.a(EnumC6314a.IO_ERROR);
        }
    }

    public b(@NotNull U30.a fileManager, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f35651a = fileManager;
        this.f35652b = sharedPreferences;
    }

    @Override // Z60.a
    public final long a() {
        return this.f35652b.getLong("page_loaded_timeout_key", 0L);
    }

    @Override // Z60.a
    public final void b(@NotNull String newVersion) {
        Intrinsics.checkNotNullParameter(newVersion, "newVersion");
        SharedPreferences.Editor edit = this.f35652b.edit();
        edit.putString("cbottom_data_version_key", newVersion);
        edit.apply();
    }

    @Override // Z60.a
    public final Object c(@NotNull EnumC8449a enumC8449a, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<String, ? extends EnumC6314a>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new d(enumC8449a, null), dVar);
    }

    @Override // Z60.a
    public final boolean d() {
        return this.f35652b.getBoolean("is_offline_enabled_key", false);
    }

    @Override // Z60.a
    public final void e(@NotNull W60.a key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        int i11 = a.f35653a[key.ordinal()];
        SharedPreferences sharedPreferences = this.f35652b;
        if (i11 == 1) {
            str = "offline_main_data_saved_key";
        } else if (i11 == 2) {
            str = "offline_transfer_data_saved_key";
        } else {
            if (i11 != 3) {
                throw new o();
            }
            str = "offline_cbottom_data_saved_key";
        }
        C2702w.e(sharedPreferences, str, true);
    }

    @Override // Z60.a
    public final Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new c(str, null), dVar);
    }

    @Override // Z60.a
    public final void g(long j11) {
        SharedPreferences.Editor edit = this.f35652b.edit();
        edit.putLong("page_loaded_timeout_key", j11);
        edit.apply();
    }

    @Override // Z60.a
    public final Object h(@NotNull W60.a aVar, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<String, ? extends EnumC6314a>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new e(aVar, null), dVar);
    }

    @Override // Z60.a
    public final Object i(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(He.b.f10879b, new C0672b(str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // Z60.a
    public final Object j(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<String, ? extends EnumC6314a>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new g(str, str2, null), dVar);
    }

    @Override // Z60.a
    public final Unit k() {
        this.f35651a.n();
        SharedPreferences.Editor edit = this.f35652b.edit();
        edit.remove("is_offline_enabled_key");
        edit.remove("cbottom_data_version_key");
        edit.remove("page_loaded_timeout_key");
        edit.remove("offline_main_data_saved_key");
        edit.remove("offline_transfer_data_saved_key");
        edit.remove("offline_cbottom_data_saved_key");
        edit.apply();
        return Unit.f71690a;
    }

    @Override // Z60.a
    public final Object l(@NotNull W60.a aVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<Unit, ? extends EnumC6314a>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new h(str, aVar, null), dVar);
    }

    @Override // Z60.a
    public final boolean m(@NotNull W60.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i11 = a.f35653a[key.ordinal()];
        SharedPreferences sharedPreferences = this.f35652b;
        if (i11 == 1) {
            return sharedPreferences.getBoolean("offline_main_data_saved_key", false);
        }
        if (i11 == 2) {
            return sharedPreferences.getBoolean("offline_transfer_data_saved_key", false);
        }
        if (i11 == 3) {
            return sharedPreferences.getBoolean("offline_cbottom_data_saved_key", false);
        }
        throw new o();
    }

    @Override // Z60.a
    public final String n() {
        return this.f35652b.getString("cbottom_data_version_key", null);
    }

    @Override // Z60.a
    public final String o(@NotNull String str) {
        U30.a aVar = this.f35651a;
        return aVar.d(aVar.h("offline_content"), str);
    }

    @Override // Z60.a
    public final void p(boolean z11) {
        C2702w.e(this.f35652b, "is_offline_enabled_key", z11);
    }

    @Override // Z60.a
    public final Object q(@NotNull String str, @NotNull InputStream inputStream, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<String, ? extends EnumC6314a>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new i(inputStream, str, null), dVar);
    }

    @Override // Z60.a
    public final Object r(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new f(str, null), dVar);
    }
}
