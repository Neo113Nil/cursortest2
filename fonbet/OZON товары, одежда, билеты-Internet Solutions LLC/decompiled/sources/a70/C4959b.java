package a70;

import Sc.s;
import We.C;
import We.M;
import e70.EnumC6315b;
import e70.InterfaceC6317d;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import ru.ozon.fintech.features.offline.network.OfflineNetwork;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: a70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4959b implements InterfaceC4958a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OfflineNetwork f36406a;

    /* renamed from: a70.b$a */
    private static final class a extends Exception {
    }

    /* renamed from: a70.b$b, reason: collision with other inner class name */
    private static final class C0699b extends Exception {
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.remote.RemoteDataSourceImpl$downloadImageFromNetwork$2", f = "RemoteDataSourceImpl.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: a70.b$c */
    static final class c extends j implements Function1<kotlin.coroutines.d<? super InputStream>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36407d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f36409f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f36409f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C4959b.this.new c(this.f36409f, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super InputStream> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36407d;
            if (i11 == 0) {
                s.b(obj);
                OfflineNetwork offlineNetwork = C4959b.this.f36406a;
                this.f36407d = 1;
                obj = offlineNetwork.downloadImage(this.f36409f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Response response = (Response) obj;
            if (!response.isSuccessful()) {
                throw new HttpException(response);
            }
            M m11 = (M) response.body();
            if (m11 == null) {
                throw new a();
            }
            C contentType = m11.contentType();
            String c11 = contentType != null ? contentType.toString() : null;
            if (c11 == null) {
                c11 = "";
            }
            if (h.e0(c11, "image/", false)) {
                return m11.byteStream();
            }
            throw new C0699b();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.remote.RemoteDataSourceImpl$getCbottomDataFromNetwork$2", f = "RemoteDataSourceImpl.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: a70.b$d */
    static final class d extends j implements Function1<kotlin.coroutines.d<? super CbottomData>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36410d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C4959b.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super CbottomData> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36410d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            OfflineNetwork offlineNetwork = C4959b.this.f36406a;
            this.f36410d = 1;
            Object cbottomData = offlineNetwork.getCbottomData(this);
            return cbottomData == aVar ? aVar : cbottomData;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.remote.RemoteDataSourceImpl$getMainDataFromNetwork$2", f = "RemoteDataSourceImpl.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: a70.b$e */
    static final class e extends j implements Function1<kotlin.coroutines.d<? super MainData>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36412d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C4959b.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super MainData> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36412d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            OfflineNetwork offlineNetwork = C4959b.this.f36406a;
            this.f36412d = 1;
            Object mainData = offlineNetwork.getMainData(this);
            return mainData == aVar ? aVar : mainData;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.remote.RemoteDataSourceImpl$getTransferDataFromNetwork$2", f = "RemoteDataSourceImpl.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: a70.b$f */
    static final class f extends j implements Function1<kotlin.coroutines.d<? super TransferData>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36414d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C4959b.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super TransferData> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36414d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            OfflineNetwork offlineNetwork = C4959b.this.f36406a;
            this.f36414d = 1;
            Object transferData = offlineNetwork.getTransferData(this);
            return transferData == aVar ? aVar : transferData;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.data.remote.RemoteDataSourceImpl$safeNetworkCall$2", f = "RemoteDataSourceImpl.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: a70.b$g */
    static final class g<T> extends j implements Function2<xe.M, kotlin.coroutines.d<? super InterfaceC6317d<? extends T, ? extends EnumC6315b>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36416d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f36417e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4959b f36418f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, C4959b c4959b, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f36417e = (j) function1;
            this.f36418f = c4959b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f36417e, this.f36418f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, Object obj) {
            return ((g) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v20, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36416d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    ?? r42 = this.f36417e;
                    this.f36416d = 1;
                    obj = r42.invoke(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return new InterfaceC6317d.b(obj);
            } catch (a unused) {
                return new InterfaceC6317d.a(EnumC6315b.EMPTY_BODY);
            } catch (C0699b unused2) {
                return new InterfaceC6317d.a(EnumC6315b.WRONG_CONTENT_TYPE);
            } catch (IOException unused3) {
                return new InterfaceC6317d.a(EnumC6315b.NO_INTERNET);
            } catch (HttpException e11) {
                int code = e11.code();
                this.f36418f.getClass();
                return new InterfaceC6317d.a(code == 400 ? EnumC6315b.BAD_REQUEST : code == 401 ? EnumC6315b.UNAUTHORIZED : code == 403 ? EnumC6315b.FORBIDDEN : code == 404 ? EnumC6315b.NOT_FOUND : code == 408 ? EnumC6315b.REQUEST_TIMEOUT : code == 409 ? EnumC6315b.CONFLICT : code == 413 ? EnumC6315b.PAYLOAD_TOO_LARGE : code == 429 ? EnumC6315b.TOO_MANY_REQUESTS : code == 503 ? EnumC6315b.SERVICE_UNAVAILABLE : (500 > code || code >= 600) ? EnumC6315b.UNKNOWN : EnumC6315b.SERVER_ERROR);
            } catch (Exception unused4) {
                return new InterfaceC6317d.a(EnumC6315b.UNKNOWN);
            }
        }
    }

    public C4959b(@NotNull OfflineNetwork api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f36406a = api;
    }

    private final <T> Object f(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super InterfaceC6317d<? extends T, ? extends EnumC6315b>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new g(function1, this, null), dVar);
    }

    @Override // a70.InterfaceC4958a
    public final Object a(@NotNull kotlin.coroutines.d<? super InterfaceC6317d<TransferData, ? extends EnumC6315b>> dVar) {
        return f(new f(null), dVar);
    }

    @Override // a70.InterfaceC4958a
    public final Object b(@NotNull kotlin.coroutines.d<? super InterfaceC6317d<MainData, ? extends EnumC6315b>> dVar) {
        return f(new e(null), dVar);
    }

    @Override // a70.InterfaceC4958a
    public final Object c(@NotNull kotlin.coroutines.d<? super InterfaceC6317d<CbottomData, ? extends EnumC6315b>> dVar) {
        return f(new d(null), dVar);
    }

    @Override // a70.InterfaceC4958a
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<? extends InputStream, ? extends EnumC6315b>> dVar) {
        return f(new c(str, null), dVar);
    }
}
