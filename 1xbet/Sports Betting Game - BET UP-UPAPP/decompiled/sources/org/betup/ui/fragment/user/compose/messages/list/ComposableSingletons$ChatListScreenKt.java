package org.betup.ui.fragment.user.compose.messages.list;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: ChatListScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChatListScreenKt {
    public static final ComposableSingletons$ChatListScreenKt INSTANCE = new ComposableSingletons$ChatListScreenKt();

    /* renamed from: lambda$-238419943, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3829lambda$238419943 = ComposableLambdaKt.composableLambdaInstance(-238419943, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.messages.list.ComposableSingletons$ChatListScreenKt$lambda$-238419943$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-238419943, i, -1, "org.betup.ui.fragment.user.compose.messages.list.ComposableSingletons$ChatListScreenKt.lambda$-238419943.<anonymous> (ChatListScreen.kt:78)");
            }
            ChatListScreenKt.LoadingIndicator(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2009595627, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f3828lambda$2009595627 = ComposableLambdaKt.composableLambdaInstance(-2009595627, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.messages.list.ComposableSingletons$ChatListScreenKt$lambda$-2009595627$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2009595627, i, -1, "org.betup.ui.fragment.user.compose.messages.list.ComposableSingletons$ChatListScreenKt.lambda$-2009595627.<anonymous> (ChatListScreen.kt:223)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.load_more, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2009595627$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m14301getLambda$2009595627$app_release() {
        return f3828lambda$2009595627;
    }

    /* renamed from: getLambda$-238419943$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14302getLambda$238419943$app_release() {
        return f3829lambda$238419943;
    }
}
