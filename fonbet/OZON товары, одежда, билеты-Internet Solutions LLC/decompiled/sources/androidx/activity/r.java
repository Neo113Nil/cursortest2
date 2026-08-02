package androidx.activity;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36986b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f36985a = i11;
        this.f36986b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36985a) {
            case 0:
                s.onBackPressedDispatcher$lambda$1((s) this.f36986b);
                break;
            default:
                ((Function0) this.f36986b).invoke();
                break;
        }
    }
}
