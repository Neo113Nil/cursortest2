package E2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC0810f;
import com.google.android.gms.common.internal.AbstractC0814j;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;
import com.google.android.gms.common.internal.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractC0810f {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, Looper looper, InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c, int i7) {
        N nA = AbstractC0814j.a(context);
        com.google.android.gms.common.d dVar = com.google.android.gms.common.d.f11217b;
        D.i(interfaceC0806b);
        D.i(interfaceC0807c);
        super(context, looper, nA, dVar, i7, interfaceC0806b, interfaceC0807c, null);
    }
}
