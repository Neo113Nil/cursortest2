package b60;

import Sc.s;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.ContactData;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.ContactsInfo;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10727i;
import xe.M;

/* renamed from: b60.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5570e implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f55566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f55567b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f55568c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.ReadContactsBridgeInterface$handle$1", f = "ReadContactsBridgeInterface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b60.e$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U50.j f55569d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5570e f55570e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ WeakReference<FintechWebView> f55571f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f55572g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U50.j jVar, C5570e c5570e, WeakReference weakReference, String str, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f55569d = jVar;
            this.f55570e = c5570e;
            this.f55571f = weakReference;
            this.f55572g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f55569d, this.f55570e, this.f55571f, this.f55572g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f55569d.invoke(this.f55570e.handleSync(this.f55571f, this.f55572g));
            return Unit.f71690a;
        }
    }

    public C5570e(@NotNull Context context, @NotNull Moshi moshi, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f55566a = context;
        this.f55567b = moshi;
        this.f55568c = appCoroutineScopes;
    }

    private static List a(Cursor cursor) {
        LinkedHashMap linkedHashMap;
        if (cursor == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                String b11 = H30.s.b(cursor.getString(cursor.getColumnIndexOrThrow("data1")));
                String str = "";
                if (b11 == null) {
                    b11 = "";
                }
                String b12 = H30.s.b(cursor.getString(cursor.getColumnIndexOrThrow("display_name")));
                if (b12 == null) {
                    b12 = "";
                }
                String b13 = H30.s.b(cursor.getString(cursor.getColumnIndexOrThrow("photo_thumb_uri")));
                if (b13 != null) {
                    str = b13;
                }
                arrayList.add(new ContactsInfo(b12, b11));
                if (str.length() > 0 && b11.length() > 0) {
                    linkedHashMap = C5568c.f55558g;
                    linkedHashMap.put(b11, str);
                }
            } catch (Exception e11) {
                L80.a.b("ReadContactsBridgeInterface", "Ошибка при получении индекса имени или телефона контакта");
                L80.a.g(e11);
            }
        }
        return arrayList;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "read_contacts";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f55568c.b(), null, null, new a((U50.j) callback, this, weakReference, parameterJson, null), 3);
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        List list;
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            Cursor query = this.f55566a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            try {
                list = a(query);
                Vd0.b.a(query, null);
            } finally {
            }
        } catch (Exception e11) {
            L80.a.b("ReadContactsBridgeInterface", "Ошибка при работе с contentResolver");
            L80.a.g(e11);
            list = K.f71697a;
        }
        try {
            str = this.f55567b.c(ContactData.class).toJson(new ContactData(list));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
