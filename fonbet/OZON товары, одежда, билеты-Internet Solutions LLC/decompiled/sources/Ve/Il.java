package Ve;

import Sc.r;
import We.E;
import We.G;
import We.K;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import cf.C5824e;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import spay.seamlessAuth.core.data.network.request.ExchangeTokenRequest;

/* loaded from: classes6.dex */
public final class Il implements Cj {

    /* renamed from: a, reason: collision with root package name */
    public final Xj f29242a;

    public Il(Xj commonConnector) {
        Intrinsics.checkNotNullParameter(commonConnector, "commonConnector");
        this.f29242a = commonConnector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x014e, code lost:
    
        if (r14 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0172, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0170, code lost:
    
        if (r14 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r15 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        if (((Ve.C4819zi) r14.f30397b).b(r15, r0) == r1) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ExchangeTokenRequest exchangeTokenRequest, kotlin.coroutines.jvm.internal.c cVar) {
        C4334il frame;
        int i11;
        G.a aVar;
        Object a11;
        Xj xj2;
        We.M c11;
        We.M c12;
        if (cVar instanceof C4334il) {
            frame = (C4334il) cVar;
            int i12 = frame.f31317h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f31317h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f31315f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f31317h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String a12 = AbstractC4762xh.a();
                    aVar = new G.a();
                    K.Companion companion = We.K.INSTANCE;
                    try {
                        r.Companion companion2 = Sc.r.INSTANCE;
                        a11 = G9.f29065a.k(exchangeTokenRequest);
                    } catch (Throwable th2) {
                        r.Companion companion3 = Sc.r.INSTANCE;
                        a11 = Sc.s.a(th2);
                    }
                    boolean z11 = a11 instanceof r.b;
                    String str = (String) (z11 ? null : a11);
                    if (z11 || str == null) {
                        Log.w("PARSER", "Gson couldn't serialize " + Object.class + " - " + exchangeTokenRequest + " \nCause: " + Sc.r.b(a11));
                    }
                    if (str == null) {
                        str = "";
                    }
                    companion.getClass();
                    aVar.g(K.Companion.b(str, null));
                    xj2 = this.f29242a;
                    xj2.getClass();
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    aVar.a("Accept", "application/json");
                    aVar.a("Content-Type", "application/json");
                    aVar.k(a12);
                    We.G b11 = aVar.b();
                    frame.f31313d = xj2;
                    frame.f31314e = aVar;
                    frame.f31317h = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return obj;
                        }
                        xj2 = (Xj) frame.f31313d;
                        Sc.s.b(obj);
                        We.G g10 = (We.G) obj;
                        X x11 = xj2.f30396a;
                        frame.f31313d = x11;
                        frame.f31314e = g10;
                        frame.f31317h = 3;
                        kotlin.coroutines.h hVar = new kotlin.coroutines.h(Wc.b.b(frame));
                        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
                        k11.f71785a = 7;
                        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                        M1.b.h(g10);
                        try {
                            try {
                                x11.getClass();
                                E.a aVar3 = new E.a();
                                aVar3.b(x11.f30308a);
                                X.a(x11, aVar3);
                                ((C5824e) new We.E(aVar3).a(g10)).E0(new Ek(hVar, k11, m11));
                                We.L l11 = (We.L) m11.f71787a;
                                if (l11 != null) {
                                    c11 = l11.c();
                                }
                            } catch (IOException e11) {
                                String message = e11.getMessage();
                                if (message == null) {
                                    message = "Error message was empty";
                                }
                                C4347j5 c4347j5 = new C4347j5(message);
                                r.Companion companion4 = Sc.r.INSTANCE;
                                hVar.resumeWith(c4347j5);
                                We.L l12 = (We.L) m11.f71787a;
                                if (l12 != null) {
                                    c11 = l12.c();
                                }
                            }
                            Object a13 = hVar.a();
                            if (a13 == Wc.a.COROUTINE_SUSPENDED) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return a13 == aVar2 ? aVar2 : a13;
                        } catch (Throwable th3) {
                            We.L l13 = (We.L) m11.f71787a;
                            if (l13 != null && (c12 = l13.c()) != null) {
                                c12.close();
                            }
                            throw th3;
                        }
                    }
                    G.a aVar4 = (G.a) frame.f31314e;
                    Xj xj3 = (Xj) frame.f31313d;
                    Sc.s.b(obj);
                    aVar = aVar4;
                    xj2 = xj3;
                }
                We.G b12 = aVar.b();
                InterfaceC4589rg interfaceC4589rg = xj2.f30397b;
                frame.f31313d = xj2;
                frame.f31314e = null;
                frame.f31317h = 2;
                obj = ((C4819zi) interfaceC4589rg).b(b12, frame);
            }
        }
        frame = new C4334il(this, cVar);
        Object obj2 = frame.f31315f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f31317h;
        if (i11 != 0) {
        }
        We.G b122 = aVar.b();
        InterfaceC4589rg interfaceC4589rg2 = xj2.f30397b;
        frame.f31313d = xj2;
        frame.f31314e = null;
        frame.f31317h = 2;
        obj2 = ((C4819zi) interfaceC4589rg2).b(b122, frame);
    }
}
