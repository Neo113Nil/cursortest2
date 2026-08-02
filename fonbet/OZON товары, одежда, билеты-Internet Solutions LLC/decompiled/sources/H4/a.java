package H4;

import java.io.Serializable;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f10576d;

    public /* synthetic */ a(Object obj, int i11, Serializable serializable, int i12) {
        this.f10573a = i12;
        this.f10575c = obj;
        this.f10574b = i11;
        this.f10576d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10573a) {
            case 0:
                ((androidx.profileinstaller.b) this.f10575c).f44618c.a(this.f10574b, this.f10576d);
                break;
            default:
                k.c((k) this.f10575c, this.f10574b, (String) this.f10576d);
                break;
        }
    }
}
