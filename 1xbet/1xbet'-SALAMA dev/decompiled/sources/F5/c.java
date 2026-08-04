package F5;

import E5.C0185c;
import Y3.l;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c implements p159w5.c, g, f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f2760c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        g.b(bVar.f18083c, this);
        f.a(bVar.f18083c, this);
        this.f2761a = bVar.f18081a;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f2761a = null;
        g.b(bVar.f18083c, null);
        f.a(bVar.f18083c, null);
    }
}
