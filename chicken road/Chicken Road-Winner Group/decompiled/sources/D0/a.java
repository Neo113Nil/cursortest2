package D0;

import A0.r;
import G0.n;
import K.C0036d;
import K.C0042j;
import K.C0045m;
import K.O;
import K.d0;
import K.i0;
import M.j;
import T1.k;
import Y1.C0077a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.l;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import w2.C1233l;
import w2.L;

/* loaded from: classes.dex */
public final class a implements C0.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f261a;

    /* renamed from: b, reason: collision with root package name */
    public Object f262b;

    /* renamed from: c, reason: collision with root package name */
    public Object f263c;

    /* renamed from: d, reason: collision with root package name */
    public Object f264d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f261a = obj;
        this.f262b = obj2;
        this.f263c = obj3;
        this.f264d = obj4;
    }

    public SpannableString a() {
        if (((String) this.f264d) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f264d);
        ArrayList arrayList = (ArrayList) this.f262b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                int b3 = j.b(lVar.f9453c);
                if (b3 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f9451a, lVar.f9452b, 0);
                } else if (b3 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f9450d)), lVar.f9451a, lVar.f9452b, 0);
                }
            }
        }
        String str = (String) this.f263c;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f263c), 0, ((String) this.f264d).length(), 0);
        }
        String str2 = (String) this.f261a;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f261a)), 0, ((String) this.f264d).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(AbstractC0343b abstractC0343b) {
        C0042j c0042j;
        int i3;
        a aVar;
        C0036d c0036d;
        if (abstractC0343b instanceof C0042j) {
            c0042j = (C0042j) abstractC0343b;
            int i4 = c0042j.f861g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0042j.f861g = i4 - Integer.MIN_VALUE;
                Object obj = c0042j.f860e;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = c0042j.f861g;
                if (i3 != 0) {
                    X0.a.L(obj);
                    List list = (List) this.f263c;
                    O o3 = (O) this.f264d;
                    if (list == null || list.isEmpty()) {
                        c0042j.f859d = this;
                        c0042j.f861g = 1;
                        obj = O.f(o3, false, c0042j);
                        if (obj != enumC0326a) {
                            aVar = this;
                            c0036d = (C0036d) obj;
                        }
                    } else {
                        i0 g3 = o3.g();
                        C0045m c0045m = new C0045m(o3, this, null);
                        c0042j.f859d = this;
                        c0042j.f861g = 2;
                        obj = g3.b(c0045m, c0042j);
                        if (obj != enumC0326a) {
                            aVar = this;
                            c0036d = (C0036d) obj;
                        }
                    }
                    return enumC0326a;
                }
                if (i3 == 1) {
                    aVar = c0042j.f859d;
                    X0.a.L(obj);
                    c0036d = (C0036d) obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = c0042j.f859d;
                    X0.a.L(obj);
                    c0036d = (C0036d) obj;
                }
                ((O) aVar.f264d).f786h.x(c0036d);
                return C0279i.f4852a;
            }
        }
        c0042j = new C0042j(this, abstractC0343b);
        Object obj2 = c0042j.f860e;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = c0042j.f861g;
        if (i3 != 0) {
        }
        ((O) aVar.f264d).f786h.x(c0036d);
        return C0279i.f4852a;
    }

    public File c(Context context) {
        ((C0077a) this.f262b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public void d(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((r) this.f264d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:25:0x0067, B:29:0x0079), top: B:24:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [E2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(AbstractC0343b abstractC0343b) {
        d0 d0Var;
        int i3;
        E2.d dVar;
        a aVar;
        E2.a aVar2;
        Throwable th;
        a aVar3;
        try {
            if (abstractC0343b instanceof d0) {
                d0Var = (d0) abstractC0343b;
                int i4 = d0Var.f834h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    d0Var.f834h = i4 - Integer.MIN_VALUE;
                    Object obj = d0Var.f;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = d0Var.f834h;
                    C0279i c0279i = C0279i.f4852a;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        if (!(((C1233l) this.f262b).C() instanceof L)) {
                            return c0279i;
                        }
                        d0Var.f831d = this;
                        dVar = (E2.d) this.f261a;
                        d0Var.f832e = dVar;
                        d0Var.f834h = 1;
                        if (dVar.c(d0Var) != enumC0326a) {
                            aVar = this;
                        }
                        return enumC0326a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = d0Var.f832e;
                        aVar3 = d0Var.f831d;
                        try {
                            X0.a.L(obj);
                            ((C1233l) aVar3.f262b).I(c0279i);
                            ((E2.d) aVar2).e(null);
                            return c0279i;
                        } catch (Throwable th2) {
                            th = th2;
                            ((E2.d) aVar2).e(null);
                            throw th;
                        }
                    }
                    ?? r22 = d0Var.f832e;
                    aVar = d0Var.f831d;
                    X0.a.L(obj);
                    dVar = r22;
                    if (((C1233l) aVar.f262b).C() instanceof L) {
                        dVar.e(null);
                        return c0279i;
                    }
                    d0Var.f831d = aVar;
                    d0Var.f832e = dVar;
                    d0Var.f834h = 2;
                    if (aVar.b(d0Var) != enumC0326a) {
                        aVar2 = dVar;
                        aVar3 = aVar;
                        ((C1233l) aVar3.f262b).I(c0279i);
                        ((E2.d) aVar2).e(null);
                        return c0279i;
                    }
                    return enumC0326a;
                }
            }
            if (((C1233l) aVar.f262b).C() instanceof L) {
            }
        } catch (Throwable th3) {
            aVar2 = dVar;
            th = th3;
            ((E2.d) aVar2).e(null);
            throw th;
        }
        d0Var = new d0(this, abstractC0343b);
        Object obj2 = d0Var.f;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = d0Var.f834h;
        C0279i c0279i2 = C0279i.f4852a;
        if (i3 != 0) {
        }
    }

    public void f(Serializable serializable, T1.c cVar) {
        ((T1.f) this.f261a).i((String) this.f264d, ((k) this.f262b).encodeMessage(serializable), cVar == null ? null : new T1.a(this, 0, cVar));
    }

    public void g(T1.b bVar) {
        String str = (String) this.f264d;
        T1.f fVar = (T1.f) this.f261a;
        P0.j jVar = (P0.j) this.f263c;
        if (jVar != null) {
            fVar.o(str, bVar != null ? new a1.e(this, bVar, 27, false) : null, jVar);
        } else {
            fVar.h(str, bVar != null ? new a1.e(this, bVar, 27, false) : null);
        }
    }

    @Override // c2.a
    public Object get() {
        return new n((Executor) ((c2.a) this.f261a).get(), (H0.d) ((c2.a) this.f262b).get(), (G0.d) ((A0.j) this.f263c).get(), (I0.c) ((c2.a) this.f264d).get());
    }

    public a(T1.f fVar, String str, k kVar, P0.j jVar) {
        this.f261a = fVar;
        this.f264d = str;
        this.f262b = kVar;
        this.f263c = jVar;
    }
}
