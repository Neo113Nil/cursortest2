package Zl0;

import B3.D;
import De.C2862e;
import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import bb.InterfaceC5614a;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.push.SendPushesResult;
import eb.C6338b;
import fm0.InterfaceC6586g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

/* loaded from: classes4.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f36068a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final u f36069b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final am0.e f36070c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6586g f36071d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5614a f36072e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Ll0.b f36073f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final C2862e f36074g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final Je.d f36075h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f36076i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayDeque f36077j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f36078a;

        /* renamed from: b, reason: collision with root package name */
        public final String f36079b;

        public a(String str, String str2) {
            this.f36078a = str;
            this.f36079b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f36078a, aVar.f36078a) && Intrinsics.d(this.f36079b, aVar.f36079b);
        }

        public final int hashCode() {
            String str = this.f36078a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f36079b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MessageKey(id=");
            sb2.append(this.f36078a);
            sb2.append(", token=");
            return D.c(sb2, this.f36079b, ')');
        }
    }

    public m(@NotNull f dispatcher, @NotNull u validateCallingHostInteractor, @NotNull am0.e notificationController, @NotNull InterfaceC6586g storage, @NotNull InterfaceC5614a analyticsSender, @NotNull Ll0.b pushInterceptor) {
        Za.d logger = Pl0.f.f22652a;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(validateCallingHostInteractor, "validateCallingHostInteractor");
        Intrinsics.checkNotNullParameter(notificationController, "notificationController");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(pushInterceptor, "pushInterceptor");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f36068a = dispatcher;
        this.f36069b = validateCallingHostInteractor;
        this.f36070c = notificationController;
        this.f36071d = storage;
        this.f36072e = analyticsSender;
        this.f36073f = pushInterceptor;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f36074g = N.a(He.b.f10879b);
        this.f36075h = Je.e.a();
        this.f36076i = Sc.k.b(new p());
        this.f36077j = new ArrayDeque(10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(1:(8:12|13|14|(3:17|(2:19|20)(1:22)|15)|23|24|25|26)(2:28|29))(19:30|31|32|33|34|35|(10:38|39|40|(1:42)(1:57)|43|(1:45)(1:56)|46|(2:51|52)(1:54)|53|36)|58|59|60|(2:63|61)|64|65|14|(1:15)|23|24|25|26))(1:74))(1:82)|75|76|(16:78|34|35|(1:36)|58|59|60|(1:61)|64|65|14|(1:15)|23|24|25|26)|20))|75|76|(0)|20)|86|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007e, code lost:
    
        if (r15.a(r1) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0166, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014e A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:13:0x003d, B:15:0x0148, B:17:0x014e, B:24:0x0167, B:39:0x00d2, B:60:0x011e, B:61:0x0125, B:63:0x012b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #3 {all -> 0x00eb, blocks: (B:35:0x00b6, B:36:0x00c1, B:38:0x00c7, B:40:0x00da, B:42:0x00e6, B:43:0x00f0, B:45:0x00fa, B:46:0x0100, B:48:0x010c, B:51:0x0112, B:59:0x0116, B:65:0x0144), top: B:34:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[Catch: all -> 0x0165, LOOP:2: B:61:0x0125->B:63:0x012b, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0165, blocks: (B:13:0x003d, B:15:0x0148, B:17:0x014e, B:24:0x0167, B:39:0x00d2, B:60:0x011e, B:61:0x0125, B:63:0x012b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [Je.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum e(m mVar, ArrayList arrayList, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        Wc.a aVar;
        int i11;
        InterfaceC3394a interfaceC3394a;
        InterfaceC3394a interfaceC3394a2;
        ArrayList arrayList2;
        Object a11;
        InterfaceC3394a interfaceC3394a3;
        m mVar2;
        Throwable th2;
        Collection collection;
        Iterator it;
        Iterator it2;
        ArrayList arrayList3;
        mVar.getClass();
        ?? r02 = "Receive ";
        try {
            if (cVar instanceof q) {
                qVar = (q) cVar;
                int i12 = qVar.f36097j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    qVar.f36097j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = qVar.f36095h;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = qVar.f36097j;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        qVar.f36091d = mVar;
                        qVar.f36092e = arrayList;
                        interfaceC3394a2 = mVar.f36075h;
                        qVar.f36093f = interfaceC3394a2;
                        qVar.f36097j = 1;
                        arrayList2 = arrayList;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ?? r13 = qVar.f36094g;
                                it2 = (Iterator) qVar.f36093f;
                                InterfaceC3394a interfaceC3394a4 = (InterfaceC3394a) qVar.f36092e;
                                mVar2 = qVar.f36091d;
                                Sc.s.b(obj);
                                r02 = interfaceC3394a4;
                                arrayList3 = r13;
                                while (it2.hasNext()) {
                                    RemoteMessage remoteMessage = (RemoteMessage) it2.next();
                                    qVar.f36091d = mVar2;
                                    qVar.f36092e = r02;
                                    qVar.f36093f = it2;
                                    qVar.f36094g = arrayList3;
                                    qVar.f36097j = 3;
                                    if (mVar2.f(remoteMessage, qVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                ((Za.d) mVar2.f36076i.getValue()).info("Handled " + arrayList3.size() + " messages");
                                Unit unit = Unit.f71690a;
                                r02.c(null);
                                return SendPushesResult.OK;
                            }
                            InterfaceC3394a interfaceC3394a5 = (InterfaceC3394a) qVar.f36093f;
                            Collection collection2 = (List) qVar.f36092e;
                            m mVar3 = qVar.f36091d;
                            try {
                                Sc.s.b(obj);
                                mVar2 = mVar3;
                                interfaceC3394a3 = interfaceC3394a5;
                                collection = collection2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC3394a = interfaceC3394a5;
                                th = th2;
                                interfaceC3394a.c(null);
                                throw th;
                            }
                            try {
                                String str = (String) obj;
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj2 : collection) {
                                    String k11 = ((RemoteMessage) obj2).k();
                                    Za.d dVar = (Za.d) mVar2.f36076i.getValue();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Received for token ");
                                    sb2.append(k11 != null ? Eb.k.a(k11) : null);
                                    sb2.append(", current token = ");
                                    sb2.append(str != null ? Eb.k.a(str) : null);
                                    dVar.info(sb2.toString());
                                    if (k11 == null || k11.equals(str)) {
                                        arrayList4.add(obj2);
                                    }
                                }
                                List l02 = C7714v.l0(collection, C7714v.Y0(arrayList4));
                                mVar2.getClass();
                                it = l02.iterator();
                                while (it.hasNext()) {
                                    mVar2.f36072e.a(new Gl0.b(((RemoteMessage) it.next()).i(), System.currentTimeMillis()));
                                }
                                it2 = arrayList4.iterator();
                                r02 = interfaceC3394a3;
                                arrayList3 = arrayList4;
                                while (it2.hasNext()) {
                                }
                                ((Za.d) mVar2.f36076i.getValue()).info("Handled " + arrayList3.size() + " messages");
                                Unit unit2 = Unit.f71690a;
                                r02.c(null);
                                return SendPushesResult.OK;
                            } catch (Throwable th4) {
                                th2 = th4;
                                interfaceC3394a5 = interfaceC3394a3;
                                interfaceC3394a = interfaceC3394a5;
                                th = th2;
                                interfaceC3394a.c(null);
                                throw th;
                            }
                        }
                        InterfaceC3394a interfaceC3394a6 = (InterfaceC3394a) qVar.f36093f;
                        ?? r14 = (List) qVar.f36092e;
                        m mVar4 = qVar.f36091d;
                        Sc.s.b(obj);
                        interfaceC3394a2 = interfaceC3394a6;
                        mVar = mVar4;
                        arrayList2 = r14;
                    }
                    ((Za.d) mVar.f36076i.getValue()).info("Receive " + arrayList2.size() + " messages");
                    InterfaceC6586g interfaceC6586g = mVar.f36071d;
                    qVar.f36091d = mVar;
                    qVar.f36092e = arrayList2;
                    qVar.f36093f = interfaceC3394a2;
                    qVar.f36097j = 2;
                    a11 = interfaceC6586g.a(qVar);
                    if (a11 != aVar) {
                        interfaceC3394a3 = interfaceC3394a2;
                        obj = a11;
                        mVar2 = mVar;
                        collection = arrayList2;
                        String str2 = (String) obj;
                        ArrayList arrayList42 = new ArrayList();
                        while (r6.hasNext()) {
                        }
                        List l022 = C7714v.l0(collection, C7714v.Y0(arrayList42));
                        mVar2.getClass();
                        it = l022.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = arrayList42.iterator();
                        r02 = interfaceC3394a3;
                        arrayList3 = arrayList42;
                        while (it2.hasNext()) {
                        }
                        ((Za.d) mVar2.f36076i.getValue()).info("Handled " + arrayList3.size() + " messages");
                        Unit unit22 = Unit.f71690a;
                        r02.c(null);
                        return SendPushesResult.OK;
                    }
                    return aVar;
                }
            }
            ((Za.d) mVar.f36076i.getValue()).info("Receive " + arrayList2.size() + " messages");
            InterfaceC6586g interfaceC6586g2 = mVar.f36071d;
            qVar.f36091d = mVar;
            qVar.f36092e = arrayList2;
            qVar.f36093f = interfaceC3394a2;
            qVar.f36097j = 2;
            a11 = interfaceC6586g2.a(qVar);
            if (a11 != aVar) {
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            interfaceC3394a = interfaceC3394a2;
            interfaceC3394a.c(null);
            throw th;
        }
        qVar = new q(mVar, cVar);
        Object obj3 = qVar.f36095h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f36097j;
        if (i11 != 0) {
        }
    }

    @Override // Zl0.l
    public final void d(@NotNull C9017a callingAppIds, @NotNull ArrayList messages, @NotNull InterfaceC7913b callback) {
        Intrinsics.checkNotNullParameter(callingAppIds, "callingAppIds");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f36074g, null, null, new o(this, callingAppIds, callback, messages, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f8, code lost:
    
        if (r2.a(r1, r3) != r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fa, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (r19.f36070c.a(r10, r3) == r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(RemoteMessage remoteMessage, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        C6338b c6338b;
        m mVar;
        String g10;
        RemoteMessage remoteMessage2 = remoteMessage;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f36084h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f36084h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f36082f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f36084h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String f7 = remoteMessage2.f();
                    a aVar2 = new a(f7, remoteMessage2.k());
                    ArrayDeque arrayDeque = this.f36077j;
                    boolean contains = arrayDeque.contains(aVar2);
                    InterfaceC4008j interfaceC4008j = this.f36076i;
                    if (contains) {
                        ((Za.d) interfaceC4008j.getValue()).b("Received duplicate message with id: " + f7, null);
                        return Unit.f71690a;
                    }
                    if (arrayDeque.size() >= 10) {
                        ((Za.d) interfaceC4008j.getValue()).d();
                        arrayDeque.remove();
                    }
                    arrayDeque.add(aVar2);
                    if (this.f36073f.a(remoteMessage2)) {
                        return Unit.f71690a;
                    }
                    RemoteMessage.b g11 = remoteMessage2.g();
                    if (g11 != null && (g10 = g11.g()) != null) {
                        String str = !kotlin.text.h.K(g10) ? g10 : null;
                        if (str != null) {
                            String a11 = g11.a();
                            String e11 = g11.e();
                            String d11 = g11.d();
                            Uri f11 = g11.f();
                            c6338b = new C6338b(str, a11, e11, d11, f11 != null ? f11.toString() : null, g11.b(), g11.c(), remoteMessage2.b());
                            if (c6338b != null) {
                                nVar.f36080d = this;
                                nVar.f36081e = remoteMessage2;
                                nVar.f36084h = 1;
                            }
                            mVar = this;
                        }
                    }
                    c6338b = null;
                    if (c6338b != null) {
                    }
                    mVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    remoteMessage2 = nVar.f36081e;
                    mVar = nVar.f36080d;
                    Sc.s.b(obj);
                }
                f fVar = mVar.f36068a;
                nVar.f36080d = null;
                nVar.f36081e = null;
                nVar.f36084h = 2;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f36082f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f36084h;
        if (i11 != 0) {
        }
        f fVar2 = mVar.f36068a;
        nVar.f36080d = null;
        nVar.f36081e = null;
        nVar.f36084h = 2;
    }

    @Override // hb.InterfaceC6904a
    public final void onDestroy() {
        ((Za.d) this.f36076i.getValue()).info("onDestroy");
        N.c(this.f36074g, null);
    }
}
