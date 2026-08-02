package Ve;

import Lm0.a;
import Sc.r;
import android.content.Context;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes10.dex */
public final class M8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29464d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M8(Object obj, kotlin.coroutines.d dVar, int i11) {
        super(2, dVar);
        this.f29464d = i11;
        this.f29466f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29464d) {
            case 0:
                M8 m82 = new M8((C4442md) this.f29466f, dVar, 0);
                m82.f29465e = obj;
                return m82;
            case 1:
                M8 m83 = new M8((C4700vb) this.f29466f, dVar, 1);
                m83.f29465e = obj;
                return m83;
            default:
                return new M8((Throwable) this.f29465e, (C4744x) this.f29466f, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29464d) {
            case 0:
                M8 m82 = new M8((C4442md) this.f29466f, (kotlin.coroutines.d) obj2, 0);
                m82.f29465e = (Fh) obj;
                return m82.invokeSuspend(Unit.f71690a);
            case 1:
                M8 m83 = new M8((C4700vb) this.f29466f, (kotlin.coroutines.d) obj2, 1);
                m83.f29465e = (xe.M) obj;
                return m83.invokeSuspend(Unit.f71690a);
            default:
                return new M8((Throwable) this.f29465e, (C4744x) this.f29466f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        r.b bVar;
        String str;
        Object obj2 = this.f29466f;
        switch (this.f29464d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                ((C4673ud) ((C4442md) obj2).f31585f).b((Fh) this.f29465e);
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C4700vb c4700vb = (C4700vb) obj2;
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    Context context = c4700vb.f32270a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("SDK_logs", "directory");
                    File[] externalFilesDirs = androidx.core.content.a.getExternalFilesDirs(context, null);
                    Intrinsics.checkNotNullExpressionValue(externalFilesDirs, "getExternalFilesDirs(context, null)");
                    File file = new File((File) C7705l.F(externalFilesDirs), "SDK_logs");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    InputStream openInputStream = c4700vb.f32270a.getContentResolver().openInputStream(Uri.fromFile(new File(file, "")));
                    BufferedReader bufferedReader = openInputStream != null ? new BufferedReader(new InputStreamReader(openInputStream, Charsets.UTF_8), 8192) : null;
                    if (bufferedReader != null) {
                        try {
                            str = bd.q.d(bufferedReader);
                        } finally {
                        }
                    } else {
                        str = null;
                    }
                    String str2 = str;
                    if (str != null) {
                        boolean t2 = kotlin.text.h.t(str, "────────────────────────────────────────────────────────", false);
                        str2 = str;
                        if (t2) {
                            str2 = kotlin.text.h.X(str, "────────────────────────────────────────────────────────", "────────────────────", false);
                        }
                    }
                    if (str2 != 0 && kotlin.text.h.t(str2, "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄", false)) {
                        str2 = kotlin.text.h.X(str2, "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄", "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄", false);
                    }
                    Vd0.b.a(bufferedReader, null);
                    bVar = str2;
                    if (openInputStream != null) {
                        openInputStream.close();
                        bVar = str2;
                    }
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    bVar = Sc.s.a(th2);
                }
                Throwable b11 = Sc.r.b(bVar);
                if (b11 != null) {
                    a.b bVar2 = Lm0.a.f17149a;
                    bVar2.b("PARSING LOG FILE ERROR");
                    bVar2.e(b11);
                }
                if (bVar instanceof r.b) {
                    return null;
                }
                return bVar;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                Throwable th3 = (Throwable) this.f29465e;
                th3.printStackTrace(printWriter);
                C4744x c4744x = (C4744x) obj2;
                c4744x.f32429r.b(new Bi(EnumC4464n6.EX_PAY, null, Pe.EX, kotlin.collections.U.j(new Pair("Exception", th3.toString()), new Pair("StackTrace", stringWriter.toString())), null, null, null, 114));
                Y9 y92 = c4744x.f32424m;
                String message = th3.getMessage();
                if (message == null) {
                    message = "No exception message";
                }
                ((C4238fb) y92).b(new O0(new Sm("UNCAUGHT_EXCEPTION : ".concat(message))));
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8(Throwable th2, C4744x c4744x, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29464d = 2;
        this.f29465e = th2;
        this.f29466f = c4744x;
    }
}
