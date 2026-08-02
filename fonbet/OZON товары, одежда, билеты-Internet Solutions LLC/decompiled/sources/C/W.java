package C;

import C.Y;
import ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewHolder;
import ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO;

/* loaded from: classes8.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4140c;

    public /* synthetic */ W(int i11, Object obj, Object obj2) {
        this.f4138a = i11;
        this.f4139b = obj;
        this.f4140c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4138a) {
            case 0:
                ((Y.c) this.f4139b).a((s0) this.f4140c);
                break;
            case 1:
                FaqAccordionViewHolder.initAccordionUi$lambda$5$lambda$4$lambda$3((FaqAccordionViewHolder) this.f4139b, (FaqVO$TopicVO$TopicItemVO.AccordionVO) this.f4140c);
                break;
            default:
                androidx.camera.core.impl.W.c((androidx.camera.core.impl.W) this.f4139b, (String) this.f4140c);
                break;
        }
    }
}
