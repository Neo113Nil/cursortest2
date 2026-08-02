package B0;

import N3.InterfaceC3665p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5891j;
import m3.r;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements O7.e, B.b, Continuation, qc.o, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1325a;

    public /* synthetic */ A0(int i11) {
        this.f1325a = i11;
    }

    public static String a(int i11, int i12, String str, String str2) {
        return str + i11 + str2 + i12;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void c(int i11, int i12, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
    }

    @Override // O7.e
    public Object apply(Object obj) {
        Boolean checkIsGooglePayReady$lambda$1;
        switch (this.f1325a) {
            case 1:
                return ((InterfaceC3665p) obj).c().getClass().getSimpleName();
            default:
                checkIsGooglePayReady$lambda$1 = GooglePayManagerImpl.checkIsGooglePayReady$lambda$1((Throwable) obj);
                return checkIsGooglePayReady$lambda$1;
        }
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return c8.g.a((C5891j) gVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return -1;
    }
}
