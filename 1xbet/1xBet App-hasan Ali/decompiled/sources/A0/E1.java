package A0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class E1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public r4.b f178k;

    /* renamed from: l, reason: collision with root package name */
    public int f179l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f181n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Uri f182o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F1 f183p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r4.c f184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f185r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(ContentResolver contentResolver, Uri uri, F1 f12, r4.c cVar, Context context, a4.c cVar2) {
        super(2, cVar2);
        this.f181n = contentResolver;
        this.f182o = uri;
        this.f183p = f12;
        this.f184q = cVar;
        this.f185r = context;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        r4.c cVar2 = this.f184q;
        E1 e1 = new E1(this.f181n, this.f182o, this.f183p, cVar2, this.f185r, cVar);
        e1.f180m = obj;
        return e1;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E1) create((InterfaceC2369f) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.d(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:15:0x0055, B:17:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2369f interfaceC2369f;
        r4.b bVar;
        InterfaceC2369f interfaceC2369f2;
        r4.b bVar2;
        Object a5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f179l;
        F1 f12 = this.f183p;
        ContentResolver contentResolver = this.f181n;
        try {
            if (i == 0) {
                G4.l.N(obj);
                interfaceC2369f = (InterfaceC2369f) this.f180m;
                contentResolver.registerContentObserver(this.f182o, false, f12);
                bVar = new r4.b(this.f184q);
                this.f180m = interfaceC2369f;
                this.f178k = bVar;
                this.f179l = 1;
                a5 = bVar.a(this);
                if (a5 != enumC0510a) {
                }
            } else if (i == 1) {
                bVar2 = this.f178k;
                interfaceC2369f2 = (InterfaceC2369f) this.f180m;
                G4.l.N(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = this.f178k;
                interfaceC2369f2 = (InterfaceC2369f) this.f180m;
                G4.l.N(obj);
                interfaceC2369f = interfaceC2369f2;
                bVar = bVar2;
                this.f180m = interfaceC2369f;
                this.f178k = bVar;
                this.f179l = 1;
                a5 = bVar.a(this);
                if (a5 != enumC0510a) {
                    return enumC0510a;
                }
                r4.b bVar3 = bVar;
                interfaceC2369f2 = interfaceC2369f;
                obj = a5;
                bVar2 = bVar3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(f12);
                    return W3.o.f6046a;
                }
                bVar2.c();
                Float f = new Float(Settings.Global.getFloat(this.f185r.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f180m = interfaceC2369f2;
                this.f178k = bVar2;
                this.f179l = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(f12);
            throw th;
        }
    }
}
