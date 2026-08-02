package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.VideoRewardCollectDialogFragment;

/* compiled from: VideoRewardCollectDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoRewardCollectDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ VideoRewardCollectDialogFragment this$0;

    VideoRewardCollectDialogFragment$onCreateView$1$1(VideoRewardCollectDialogFragment videoRewardCollectDialogFragment) {
        this.this$0 = videoRewardCollectDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        String str;
        String str2;
        int i3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1072918937, i, -1, "org.betup.ui.dialogs.VideoRewardCollectDialogFragment.onCreateView.<anonymous>.<anonymous> (VideoRewardCollectDialogFragment.kt:88)");
        }
        i2 = this.this$0.amount;
        str = this.this$0.title;
        str2 = this.this$0.description;
        i3 = this.this$0.imageResourceId;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final VideoRewardCollectDialogFragment videoRewardCollectDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = VideoRewardCollectDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(VideoRewardCollectDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final VideoRewardCollectDialogFragment videoRewardCollectDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.VideoRewardCollectDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = VideoRewardCollectDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(VideoRewardCollectDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        VideoRewardCollectDialogFragmentKt.VideoRewardCollectContent(i2, str, str2, i3, function0, (Function0) rememberedValue2, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(VideoRewardCollectDialogFragment videoRewardCollectDialogFragment) {
        VideoRewardCollectDialogFragment.OnCollectListener onCollectListener;
        int i;
        onCollectListener = videoRewardCollectDialogFragment.onCollectListener;
        if (onCollectListener != null) {
            i = videoRewardCollectDialogFragment.amount;
            onCollectListener.onCollect(i);
        }
        videoRewardCollectDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(VideoRewardCollectDialogFragment videoRewardCollectDialogFragment) {
        VideoRewardCollectDialogFragment.OnDismissListener onDismissListener;
        onDismissListener = videoRewardCollectDialogFragment.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        videoRewardCollectDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
