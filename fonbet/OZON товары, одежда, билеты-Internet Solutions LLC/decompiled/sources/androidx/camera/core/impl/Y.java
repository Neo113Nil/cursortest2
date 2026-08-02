package androidx.camera.core.impl;

import ru.ozon.app.android.checkoutcomposer.discountcode.presentation.DiscountCodeVH;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVH;

/* loaded from: classes8.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38241b;

    public /* synthetic */ Y(Object obj, int i11) {
        this.f38240a = i11;
        this.f38241b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38240a) {
            case 0:
                ((com.google.common.util.concurrent.m) this.f38241b).cancel(true);
                break;
            case 1:
                StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$30$lambda$29((StoryMediaFragment) this.f38241b);
                break;
            case 2:
                DiscountCodeVH.openKeyboardRunnable$lambda$1((DiscountCodeVH) this.f38241b);
                break;
            default:
                ((ReviewFormQuestionsVH) this.f38241b).diffFinished();
                break;
        }
    }
}
