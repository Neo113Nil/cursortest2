package O70;

import Sc.r;
import Sc.s;
import android.content.Context;
import bd.q;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b implements O70.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f20049a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f20050b;

    @e(c = "ru.ozon.fintech.features.pinpad.domain.json.PinPadJsonRepositoryImpl$getCbottomJson$2", f = "PinPadJsonRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f20051d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S70.a f20053f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S70.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f20053f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = b.this.new a(this.f20053f, dVar);
            aVar.f20051d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super String> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            S70.a aVar = this.f20053f;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b bVar = b.this;
            try {
                r.Companion companion = r.INSTANCE;
                LinkedHashMap linkedHashMap = bVar.f20050b;
                Object obj2 = linkedHashMap.get(aVar);
                if (obj2 == null) {
                    obj2 = b.d(bVar, bVar.f20049a, aVar.a());
                    linkedHashMap.put(aVar, obj2);
                }
                a11 = (String) obj2;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            Throwable b11 = r.b(a11);
            if (b11 == null) {
                return a11;
            }
            throw new IllegalStateException(Nk.a.b("Failed to read cbottom template from assets: ", aVar.a()), b11);
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20049a = context;
        this.f20050b = new LinkedHashMap();
    }

    public static final String d(b bVar, Context context, String str) {
        bVar.getClass();
        InputStream open = context.getAssets().open(str);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
        try {
            String d11 = q.d(bufferedReader);
            bufferedReader.close();
            return d11;
        } finally {
        }
    }

    @Override // O70.a
    public final Object a(@NotNull S70.a aVar, @NotNull d<? super String> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new a(aVar, null), dVar);
    }
}
