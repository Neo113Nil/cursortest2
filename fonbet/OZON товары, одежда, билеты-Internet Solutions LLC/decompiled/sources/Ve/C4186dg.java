package Ve;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.SPaySdkApp;

/* renamed from: Ve.dg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4186dg {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4278gm f30878c;

    /* renamed from: a, reason: collision with root package name */
    public final C4588rf f30879a;

    /* renamed from: b, reason: collision with root package name */
    public final C4503og f30880b;

    public C4186dg(Context context) {
        C4792yj c4792yj;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            try {
                if (f30878c == null) {
                    InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
                    if (sdkComponent != null && (c4792yj = Ul.f30136b) != null) {
                        context.getClass();
                        f30878c = new C4278gm(sdkComponent, c4792yj, context);
                    }
                    C4278gm c4278gm = f30878c;
                    Intrinsics.f(c4278gm);
                    this.f30879a = (C4588rf) c4278gm.f31119b.get();
                    this.f30880b = (C4503og) c4278gm.f31120c.get();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        Ff ff2;
        int i11;
        if (cVar instanceof Ff) {
            ff2 = (Ff) cVar;
            int i12 = ff2.f29003f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ff2.f29003f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ff2.f29001d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ff2.f29003f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C4503og c4503og = this.f30880b;
                    if (c4503og == null) {
                        Intrinsics.n("getAppTokenUseCase");
                        throw null;
                    }
                    ff2.f29003f = 1;
                    obj = c4503og.a(ff2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        ff2 = new Ff(this, cVar);
        Object obj2 = ff2.f29001d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ff2.f29003f;
        if (i11 != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }
}
