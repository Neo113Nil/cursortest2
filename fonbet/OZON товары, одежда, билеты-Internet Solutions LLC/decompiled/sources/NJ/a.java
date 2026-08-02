package NJ;

import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.adult.AdultStateImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18839a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18840b;

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18839a) {
            case 0:
                AdultStateImpl.clear$lambda$1((AdultStateImpl) this.f18840b);
                break;
            default:
                ((AbstractC7737t) this.f18840b).invoke();
                break;
        }
    }

    public /* synthetic */ a(AdultStateImpl adultStateImpl) {
        this.f18840b = adultStateImpl;
    }
}
