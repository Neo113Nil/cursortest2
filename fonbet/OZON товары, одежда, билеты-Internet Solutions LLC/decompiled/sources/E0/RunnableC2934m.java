package E0;

import java.util.function.IntConsumer;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder;

/* renamed from: E0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC2934m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7263c;

    public /* synthetic */ RunnableC2934m(int i11, int i12, Object obj) {
        this.f7261a = i12;
        this.f7263c = obj;
        this.f7262b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7261a) {
            case 0:
                ((IntConsumer) this.f7263c).accept(this.f7262b);
                break;
            default:
                FeedbackInputV2ViewHolder.scrollToNewLine$lambda$10$lambda$9$lambda$7((FeedbackInputV2ViewHolder) this.f7263c, this.f7262b);
                break;
        }
    }
}
