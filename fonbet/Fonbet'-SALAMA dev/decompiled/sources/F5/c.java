package F5;

import E5.C0185c;
import Y3.l;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class c implements InterfaceC1783c, g, f {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2760c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public Context f2761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2762b = false;

    public static i c(l lVar) {
        String str = lVar.f7672a;
        String str2 = lVar.f7676e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = lVar.f7678g;
        if (str3 == null) {
            str3 = null;
        }
        i iVar = new i();
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        iVar.f2768a = str;
        String str4 = lVar.f7673b;
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        iVar.f2769b = str4;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        iVar.f2770c = str2;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        iVar.f2771d = str3;
        iVar.f2772e = null;
        iVar.f2773f = lVar.f7674c;
        iVar.f2774g = lVar.f7677f;
        iVar.f2775h = null;
        iVar.f2776i = lVar.f7675d;
        iVar.j = null;
        iVar.f2777k = null;
        iVar.f2778l = null;
        iVar.f2779m = null;
        iVar.f2780n = null;
        return iVar;
    }

    public static void d(TaskCompletionSource taskCompletionSource, k kVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new C0185c(kVar, 25));
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        g.b(c1782b.f18077c, this);
        f.a(c1782b.f18077c, this);
        this.f2761a = c1782b.f18075a;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f2761a = null;
        g.b(c1782b.f18077c, null);
        f.a(c1782b.f18077c, null);
    }
}
