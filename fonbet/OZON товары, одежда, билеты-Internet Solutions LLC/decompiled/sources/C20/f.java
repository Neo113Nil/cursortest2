package C20;

import Je.InterfaceC3394a;
import Sc.s;
import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import bd.q;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f4377a;

    /* renamed from: b, reason: collision with root package name */
    private D20.c f4378b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Je.d f4379c;

    public f(@NotNull Application context, @NotNull a parser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f4377a = context;
        this.f4379c = Je.e.a();
    }

    public static final String a(f fVar) {
        try {
            InputStream open = fVar.f4377a.getAssets().open("localz-string-resources-report.json");
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
            try {
                String d11 = q.d(bufferedReader);
                bufferedReader.close();
                return d11;
            } finally {
            }
        } catch (Exception e11) {
            throw new b(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x005c, B:29:0x0064), top: B:24:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        Je.d dVar;
        f fVar;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        D20.c cVar3;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i12 = cVar2.f4371h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar2.f4371h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = cVar2.f4369f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = cVar2.f4371h;
                    if (i11 != 0) {
                        s.b(obj);
                        D20.c cVar4 = this.f4378b;
                        if (cVar4 != null) {
                            return cVar4;
                        }
                        cVar2.f4367d = this;
                        dVar = this.f4379c;
                        cVar2.f4368e = dVar;
                        cVar2.f4371h = 1;
                        if (dVar.a(cVar2) != aVar) {
                            fVar = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) cVar2.f4367d;
                        try {
                            s.b(obj);
                            D20.c cVar5 = (D20.c) obj;
                            interfaceC3394a.c(null);
                            return cVar5;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                    Je.d dVar2 = cVar2.f4368e;
                    fVar = (f) cVar2.f4367d;
                    s.b(obj);
                    dVar = dVar2;
                    cVar3 = fVar.f4378b;
                    if (cVar3 == null) {
                        dVar.c(null);
                        return cVar3;
                    }
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    d dVar3 = new d(fVar, null);
                    cVar2.f4367d = dVar;
                    cVar2.f4368e = null;
                    cVar2.f4371h = 2;
                    Object f7 = C10727i.f(bVar, dVar3, cVar2);
                    if (f7 != aVar) {
                        interfaceC3394a = dVar;
                        obj = f7;
                        D20.c cVar52 = (D20.c) obj;
                        interfaceC3394a.c(null);
                        return cVar52;
                    }
                    return aVar;
                }
            }
            cVar3 = fVar.f4378b;
            if (cVar3 == null) {
            }
        } catch (Throwable th4) {
            interfaceC3394a = dVar;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f4369f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f4371h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        Iterator it;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f4376g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f4376g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f4374e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f4376g;
                if (i11 != 0) {
                    s.b(obj);
                    eVar.f4373d = str;
                    eVar.f4376g = 1;
                    obj = c(eVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = eVar.f4373d;
                    s.b(obj);
                }
                D20.c cVar2 = (D20.c) obj;
                List<D20.e> a11 = cVar2.a();
                List<D20.e> c11 = cVar2.c();
                List<D20.e> b11 = cVar2.b();
                it = C7714v.p0(b11, C7714v.p0(c11, a11)).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (Intrinsics.d(((D20.e) next).a(), str)) {
                        return next;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        eVar = new e(this, cVar);
        Object obj3 = eVar.f4374e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f4376g;
        if (i11 != 0) {
        }
        D20.c cVar22 = (D20.c) obj3;
        List<D20.e> a112 = cVar22.a();
        List<D20.e> c112 = cVar22.c();
        List<D20.e> b112 = cVar22.b();
        it = C7714v.p0(b112, C7714v.p0(c112, a112)).iterator();
        while (it.hasNext()) {
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
