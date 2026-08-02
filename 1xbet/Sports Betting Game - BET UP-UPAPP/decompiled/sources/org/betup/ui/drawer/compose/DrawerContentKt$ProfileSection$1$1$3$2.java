package org.betup.ui.drawer.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: DrawerContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DrawerContentKt$ProfileSection$1$1$3$2 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onNotificationsClick;
    final /* synthetic */ int $unreadNotificationsCount;

    DrawerContentKt$ProfileSection$1$1$3$2(int i, Function0<Unit> function0) {
        this.$unreadNotificationsCount = i;
        this.$onNotificationsClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope BadgedBox, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942301241, i, -1, "org.betup.ui.drawer.compose.ProfileSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrawerContent.kt:261)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(this.$unreadNotificationsCount > 0 ? R.drawable.notification_new_r_icon : R.drawable.notification_new_icon, composer, 0);
        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32));
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(this.$onNotificationsClick);
        final Function0<Unit> function0 = this.$onNotificationsClick;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$ProfileSection$1$1$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = DrawerContentKt$ProfileSection$1$1$3$2.invoke$lambda$1$lambda$0(Function0.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterResource, "Notifications", ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0, 2, null), composer, 48, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
